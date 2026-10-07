package o;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1106bb extends AbstractC1952k8 {
    public final C2562qX A;
    public long B;
    public InterfaceC1008ab C;
    public long D;
    public final C0656Oj z;

    public C1106bb() {
        super(6);
        this.z = new C0656Oj(1);
        this.A = new C2562qX();
    }

    @Override // o.AbstractC1952k8, o.AZ
    public final void c(int i, Object obj) {
        if (i == 8) {
            this.C = (InterfaceC1008ab) obj;
        }
    }

    @Override // o.AbstractC1952k8
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // o.AbstractC1952k8
    public final boolean j() {
        return i();
    }

    @Override // o.AbstractC1952k8
    public final boolean k() {
        return true;
    }

    @Override // o.AbstractC1952k8
    public final void l() {
        InterfaceC1008ab interfaceC1008ab = this.C;
        if (interfaceC1008ab != null) {
            interfaceC1008ab.d();
        }
    }

    @Override // o.AbstractC1952k8
    public final void n(long j, boolean z) {
        this.D = Long.MIN_VALUE;
        InterfaceC1008ab interfaceC1008ab = this.C;
        if (interfaceC1008ab != null) {
            interfaceC1008ab.d();
        }
    }

    @Override // o.AbstractC1952k8
    public final void s(C0643Nw[] c0643NwArr, long j, long j2) {
        this.B = j2;
    }

    @Override // o.AbstractC1952k8
    public final void u(long j, long j2) {
        float[] fArr;
        while (!i() && this.D < 100000 + j) {
            C0656Oj c0656Oj = this.z;
            c0656Oj.E();
            C2994uv c2994uv = this.n;
            c2994uv.u();
            if (t(c2994uv, c0656Oj, 0) != -4 || c0656Oj.j(4)) {
                return;
            }
            this.D = c0656Oj.q;
            if (this.C != null && !c0656Oj.j(Integer.MIN_VALUE)) {
                c0656Oj.I();
                ByteBuffer byteBuffer = c0656Oj.f439o;
                int i = Lr0.a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    byte[] bArrArray = byteBuffer.array();
                    int iLimit = byteBuffer.limit();
                    C2562qX c2562qX = this.A;
                    c2562qX.D(iLimit, bArrArray);
                    c2562qX.F(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(c2562qX.i());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.C.a(this.D - this.B, fArr);
                }
            }
        }
    }

    @Override // o.AbstractC1952k8
    public final int y(C0643Nw c0643Nw) {
        return "application/x-camera-motion".equals(c0643Nw.w) ? AbstractC1674hK.e(4, 0, 0) : AbstractC1674hK.e(0, 0, 0);
    }
}
