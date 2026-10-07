package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.view.Surface;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.ILogger;
import io.sentry.android.replay.f;
import java.io.IOException;
import java.nio.ByteBuffer;
import o.AP;
import o.AbstractC1474fG;
import o.AbstractC1674hK;
import o.AbstractC1701hf0;
import o.CJ;
import o.IJ;
import o.InterfaceC0360Cy;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final I1 a;
    public final a b;
    public final InterfaceC0360Cy c;
    public final MediaCodec d;
    public final CJ e;
    public final MediaCodec.BufferInfo f;
    public final b g;
    public Surface h;

    public d(I1 i1, a aVar) throws IOException {
        AbstractC1474fG.j(i1, "options");
        this.a = i1;
        this.b = aVar;
        this.c = null;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(aVar.f);
        AbstractC1474fG.i(mediaCodecCreateEncoderByType, "createEncoderByType(muxerConfig.mimeType)");
        this.d = mediaCodecCreateEncoderByType;
        this.e = AP.m(IJ.n, new f(3, this));
        this.f = new MediaCodec.BufferInfo();
        String absolutePath = aVar.a.getAbsolutePath();
        AbstractC1474fG.i(absolutePath, "muxerConfig.file.absolutePath");
        this.g = new b(absolutePath, aVar.d);
    }

    public final void a(boolean z) {
        ByteBuffer byteBuffer;
        I1 i1 = this.a;
        ILogger logger = i1.getLogger();
        EnumC0094u1 enumC0094u1 = EnumC0094u1.DEBUG;
        logger.h(enumC0094u1, "[Encoder]: drainCodec(" + z + ')', new Object[0]);
        MediaCodec mediaCodec = this.d;
        if (z) {
            i1.getLogger().h(enumC0094u1, "[Encoder]: sending EOS to encoder", new Object[0]);
            mediaCodec.signalEndOfInputStream();
        }
        ByteBuffer[] outputBuffers = mediaCodec.getOutputBuffers();
        while (true) {
            MediaCodec.BufferInfo bufferInfo = this.f;
            int iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 100000L);
            if (iDequeueOutputBuffer == -1) {
                if (!z) {
                    return;
                } else {
                    i1.getLogger().h(EnumC0094u1.DEBUG, "[Encoder]: no output available, spinning to await EOS", new Object[0]);
                }
            } else if (iDequeueOutputBuffer == -3) {
                outputBuffers = mediaCodec.getOutputBuffers();
            } else {
                b bVar = this.g;
                if (iDequeueOutputBuffer == -2) {
                    if (bVar.c) {
                        throw new RuntimeException("format changed twice");
                    }
                    MediaFormat outputFormat = mediaCodec.getOutputFormat();
                    AbstractC1474fG.i(outputFormat, "mediaCodec.outputFormat");
                    i1.getLogger().h(EnumC0094u1.DEBUG, "[Encoder]: encoder output format changed: " + outputFormat, new Object[0]);
                    MediaMuxer mediaMuxer = bVar.b;
                    bVar.d = mediaMuxer.addTrack(outputFormat);
                    mediaMuxer.start();
                    bVar.c = true;
                } else if (iDequeueOutputBuffer < 0) {
                    i1.getLogger().h(EnumC0094u1.DEBUG, AbstractC1674hK.n(iDequeueOutputBuffer, "[Encoder]: unexpected result from encoder.dequeueOutputBuffer: "), new Object[0]);
                } else {
                    if (outputBuffers == null || (byteBuffer = outputBuffers[iDequeueOutputBuffer]) == null) {
                        throw new RuntimeException(AbstractC1674hK.p("encoderOutputBuffer ", iDequeueOutputBuffer, " was null"));
                    }
                    if ((bufferInfo.flags & 2) != 0) {
                        i1.getLogger().h(EnumC0094u1.DEBUG, "[Encoder]: ignoring BUFFER_FLAG_CODEC_CONFIG", new Object[0]);
                        bufferInfo.size = 0;
                    }
                    if (bufferInfo.size != 0) {
                        if (!bVar.c) {
                            throw new RuntimeException("muxer hasn't started");
                        }
                        int i = bVar.e;
                        bVar.e = i + 1;
                        long j = bVar.a * ((long) i);
                        bVar.f = j;
                        bufferInfo.presentationTimeUs = j;
                        bVar.b.writeSampleData(bVar.d, byteBuffer, bufferInfo);
                        i1.getLogger().h(EnumC0094u1.DEBUG, AbstractC1701hf0.g(new StringBuilder("[Encoder]: sent "), bufferInfo.size, " bytes to muxer"), new Object[0]);
                    }
                    mediaCodec.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    if ((bufferInfo.flags & 4) != 0) {
                        if (z) {
                            i1.getLogger().h(EnumC0094u1.DEBUG, "[Encoder]: end of stream reached", new Object[0]);
                            return;
                        } else {
                            i1.getLogger().h(EnumC0094u1.DEBUG, "[Encoder]: reached end of stream unexpectedly", new Object[0]);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        MediaCodec mediaCodec = this.d;
        try {
            InterfaceC0360Cy interfaceC0360Cy = this.c;
            if (interfaceC0360Cy != null) {
                interfaceC0360Cy.c();
            }
            a(true);
            mediaCodec.stop();
            mediaCodec.release();
            Surface surface = this.h;
            if (surface != null) {
                surface.release();
            }
            MediaMuxer mediaMuxer = this.g.b;
            mediaMuxer.stop();
            mediaMuxer.release();
        } catch (Throwable th) {
            this.a.getLogger().v(EnumC0094u1.DEBUG, "Failed to properly release video encoder", th);
        }
    }
}
