package o;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.yO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3328yO {
    void a();

    int d(MediaCodec.BufferInfo bufferInfo);

    void f(int i, boolean z);

    void flush();

    void g(int i);

    MediaFormat i();

    void j(int i, C2968ui c2968ui, long j);

    ByteBuffer k(int i);

    void l(Surface surface);

    void m(Bundle bundle);

    ByteBuffer n(int i);

    void o(int i, long j);

    int p();

    void q(RO ro, Handler handler);

    void r(int i, int i2, long j, int i3);
}
