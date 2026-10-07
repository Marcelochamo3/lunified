package o;

import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* JADX INFO: renamed from: o.pC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2444pC implements InterfaceC1324dm0 {
    public static final C0643Nw g;
    public static final C0643Nw h;
    public final C1848j5 a = new C1848j5(1);
    public final InterfaceC1324dm0 b;
    public final C0643Nw c;
    public C0643Nw d;
    public byte[] e;
    public int f;

    static {
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = "application/id3";
        g = c0617Mw.a();
        C0617Mw c0617Mw2 = new C0617Mw();
        c0617Mw2.k = "application/x-emsg";
        h = c0617Mw2.a();
    }

    public C2444pC(InterfaceC1324dm0 interfaceC1324dm0, int i) {
        this.b = interfaceC1324dm0;
        if (i == 1) {
            this.c = g;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC1674hK.n(i, "Unknown metadataType: "));
            }
            this.c = h;
        }
        this.e = new byte[0];
        this.f = 0;
    }

    @Override // o.InterfaceC1324dm0
    public final void a(C0643Nw c0643Nw) {
        this.d = c0643Nw;
        this.b.a(this.c);
    }

    @Override // o.InterfaceC1324dm0
    public final int b(InterfaceC2000kj interfaceC2000kj, int i, boolean z) {
        return f(interfaceC2000kj, i, z);
    }

    @Override // o.InterfaceC1324dm0
    public final void c(int i, C2562qX c2562qX) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        c2562qX.e(this.e, this.f, i);
        this.f += i;
    }

    @Override // o.InterfaceC1324dm0
    public final void d(long j, int i, int i2, int i3, C1226cm0 c1226cm0) {
        this.d.getClass();
        int i4 = this.f - i3;
        C2562qX c2562qX = new C2562qX(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.w;
        C0643Nw c0643Nw = this.c;
        if (!Lr0.a(str, c0643Nw.w)) {
            if (!"application/x-emsg".equals(this.d.w)) {
                String str2 = this.d.w;
                AP.z();
                return;
            }
            this.a.getClass();
            C2016kr c2016krB = C1848j5.B(c2562qX);
            C0643Nw c0643NwB = c2016krB.b();
            if (c0643NwB == null || !Lr0.a(c0643Nw.w, c0643NwB.w)) {
                Objects.toString(c2016krB.b());
                AP.z();
                return;
            } else {
                byte[] bArrC = c2016krB.c();
                bArrC.getClass();
                c2562qX = new C2562qX(bArrC);
            }
        }
        int iA = c2562qX.a();
        this.b.e(iA, c2562qX);
        this.b.d(j, i, iA, i3, c1226cm0);
    }

    @Override // o.InterfaceC1324dm0
    public final /* synthetic */ void e(int i, C2562qX c2562qX) {
        AbstractC1674hK.c(this, c2562qX, i);
    }

    public final int f(InterfaceC2000kj interfaceC2000kj, int i, boolean z) throws EOFException {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int iD = interfaceC2000kj.D(this.e, this.f, i);
        if (iD != -1) {
            this.f += iD;
            return iD;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }
}
