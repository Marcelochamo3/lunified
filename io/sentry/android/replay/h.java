package io.sentry.android.replay;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.Surface;
import io.sentry.EnumC0094u1;
import io.sentry.I1;
import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import o.AbstractC1474fG;
import o.InterfaceC0827Uy;
import o.Rh0;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable {
    public final I1 l;
    public final io.sentry.protocol.t m;
    public final r n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0827Uy f100o;
    public final Object p;
    public io.sentry.android.replay.video.d q;
    public final Rh0 r;
    public final ArrayList s;

    public h(I1 i1, io.sentry.protocol.t tVar, r rVar) {
        AbstractC1474fG.j(i1, "options");
        AbstractC1474fG.j(tVar, "replayId");
        AbstractC1474fG.j(rVar, "recorderConfig");
        e eVar = new e(i1, 0, rVar);
        this.l = i1;
        this.m = tVar;
        this.n = rVar;
        this.f100o = eVar;
        this.p = new Object();
        this.r = new Rh0(new f(0, this));
        this.s = new ArrayList();
    }

    public final void a(File file) {
        I1 i1 = this.l;
        try {
            if (file.delete()) {
                return;
            }
            i1.getLogger().h(EnumC0094u1.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            i1.getLogger().s(EnumC0094u1.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.p) {
            try {
                io.sentry.android.replay.video.d dVar = this.q;
                if (dVar != null) {
                    dVar.b();
                }
                this.q = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f(i iVar) {
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(iVar.a.getAbsolutePath());
            synchronized (this.p) {
                io.sentry.android.replay.video.d dVar = this.q;
                if (dVar != null) {
                    AbstractC1474fG.i(bitmapDecodeFile, "bitmap");
                    Surface surface = dVar.h;
                    Canvas canvasLockHardwareCanvas = surface != null ? surface.lockHardwareCanvas() : null;
                    if (canvasLockHardwareCanvas != null) {
                        canvasLockHardwareCanvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, (Paint) null);
                    }
                    Surface surface2 = dVar.h;
                    if (surface2 != null) {
                        surface2.unlockCanvasAndPost(canvasLockHardwareCanvas);
                    }
                    dVar.a(false);
                }
            }
            bitmapDecodeFile.recycle();
            return true;
        } catch (Throwable th) {
            this.l.getLogger().v(EnumC0094u1.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
            return false;
        }
    }
}
