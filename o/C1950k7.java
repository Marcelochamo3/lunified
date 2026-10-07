package o;

import java.util.Collections;

/* JADX INFO: renamed from: o.k7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1950k7 extends AbstractC1074b8 {
    public static final int[] e = {5512, 11025, 22050, 44100};
    public boolean b;
    public boolean c;
    public int d;

    public final boolean r(C2562qX c2562qX) throws C2775si0 {
        if (this.b) {
            c2562qX.G(1);
        } else {
            int iU = c2562qX.u();
            int i = (iU >> 4) & 15;
            this.d = i;
            InterfaceC1324dm0 interfaceC1324dm0 = (InterfaceC1324dm0) this.a;
            if (i == 2) {
                int i2 = e[(iU >> 2) & 3];
                C0617Mw c0617Mw = new C0617Mw();
                c0617Mw.k = "audio/mpeg";
                c0617Mw.x = 1;
                c0617Mw.y = i2;
                interfaceC1324dm0.a(c0617Mw.a());
                this.c = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                C0617Mw c0617Mw2 = new C0617Mw();
                c0617Mw2.k = str;
                c0617Mw2.x = 1;
                c0617Mw2.y = 8000;
                interfaceC1324dm0.a(c0617Mw2.a());
                this.c = true;
            } else if (i != 10) {
                throw new C2775si0("Audio format not supported: " + this.d);
            }
            this.b = true;
        }
        return true;
    }

    public final boolean s(long j, C2562qX c2562qX) throws C2949uX {
        int i = this.d;
        InterfaceC1324dm0 interfaceC1324dm0 = (InterfaceC1324dm0) this.a;
        if (i == 2) {
            int iA = c2562qX.a();
            interfaceC1324dm0.e(iA, c2562qX);
            ((InterfaceC1324dm0) this.a).d(j, 1, iA, 0, null);
            return true;
        }
        int iU = c2562qX.u();
        if (iU != 0 || this.c) {
            if (this.d == 10 && iU != 1) {
                return false;
            }
            int iA2 = c2562qX.a();
            interfaceC1324dm0.e(iA2, c2562qX);
            ((InterfaceC1324dm0) this.a).d(j, 1, iA2, 0, null);
            return true;
        }
        int iA3 = c2562qX.a();
        byte[] bArr = new byte[iA3];
        c2562qX.e(bArr, 0, iA3);
        FV fvV = AbstractC3409z9.v(new C2084lc(iA3, bArr), false);
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = "audio/mp4a-latm";
        c0617Mw.h = (String) fvV.n;
        c0617Mw.x = fvV.m;
        c0617Mw.y = fvV.l;
        c0617Mw.m = Collections.singletonList(bArr);
        interfaceC1324dm0.a(new C0643Nw(c0617Mw));
        this.c = true;
        return false;
    }
}
