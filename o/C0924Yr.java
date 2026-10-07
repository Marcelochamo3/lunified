package o;

import android.media.MediaFormat;

/* JADX INFO: renamed from: o.Yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0924Yr implements Ss0, InterfaceC1008ab, AZ {
    public Ss0 l;
    public InterfaceC1008ab m;
    public Ss0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InterfaceC1008ab f642o;

    @Override // o.InterfaceC1008ab
    public final void a(long j, float[] fArr) {
        InterfaceC1008ab interfaceC1008ab = this.f642o;
        if (interfaceC1008ab != null) {
            interfaceC1008ab.a(j, fArr);
        }
        InterfaceC1008ab interfaceC1008ab2 = this.m;
        if (interfaceC1008ab2 != null) {
            interfaceC1008ab2.a(j, fArr);
        }
    }

    @Override // o.Ss0
    public final void b(long j, long j2, C0643Nw c0643Nw, MediaFormat mediaFormat) {
        Ss0 ss0 = this.n;
        if (ss0 != null) {
            ss0.b(j, j2, c0643Nw, mediaFormat);
        }
        Ss0 ss1 = this.l;
        if (ss1 != null) {
            ss1.b(j, j2, c0643Nw, mediaFormat);
        }
    }

    @Override // o.AZ
    public final void c(int i, Object obj) {
        if (i == 7) {
            this.l = (Ss0) obj;
            return;
        }
        if (i == 8) {
            this.m = (InterfaceC1008ab) obj;
            return;
        }
        if (i != 10000) {
            return;
        }
        Af0 af0 = (Af0) obj;
        if (af0 == null) {
            this.n = null;
            this.f642o = null;
        } else {
            this.n = af0.getVideoFrameMetadataListener();
            this.f642o = af0.getCameraMotionListener();
        }
    }

    @Override // o.InterfaceC1008ab
    public final void d() {
        InterfaceC1008ab interfaceC1008ab = this.f642o;
        if (interfaceC1008ab != null) {
            interfaceC1008ab.d();
        }
        InterfaceC1008ab interfaceC1008ab2 = this.m;
        if (interfaceC1008ab2 != null) {
            interfaceC1008ab2.d();
        }
    }
}
