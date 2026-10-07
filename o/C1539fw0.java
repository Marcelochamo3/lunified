package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.fw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1539fw0 {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1539fw0 c1539fw0 = (C1539fw0) arrayList.get(i);
                if (this.e == c1539fw0.b) {
                    c(this.c, c1539fw0);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(C2742sK c2742sK, int i) {
        int iN;
        int iN2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0757Sg c0757Sg = (C0757Sg) ((C0731Rg) arrayList.get(0)).T;
        c2742sK.t();
        c0757Sg.b(c2742sK, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0731Rg) arrayList.get(i2)).b(c2742sK, false);
        }
        if (i == 0 && c0757Sg.z0 > 0) {
            Pu0.b(c0757Sg, c2742sK, arrayList, 0);
        }
        if (i == 1 && c0757Sg.A0 > 0) {
            Pu0.b(c0757Sg, c2742sK, arrayList, 1);
        }
        try {
            c2742sK.p();
        } catch (Exception unused) {
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0731Rg c0731Rg = (C0731Rg) arrayList.get(i3);
            C2743sL c2743sL = new C2743sL(24);
            new WeakReference(c0731Rg);
            C2742sK.n(c0731Rg.I);
            C2742sK.n(c0731Rg.J);
            C2742sK.n(c0731Rg.K);
            C2742sK.n(c0731Rg.L);
            C2742sK.n(c0731Rg.M);
            this.d.add(c2743sL);
        }
        if (i == 0) {
            iN = C2742sK.n(c0757Sg.I);
            iN2 = C2742sK.n(c0757Sg.K);
            c2742sK.t();
        } else {
            iN = C2742sK.n(c0757Sg.J);
            iN2 = C2742sK.n(c0757Sg.L);
            c2742sK.t();
        }
        return iN2 - iN;
    }

    public final void c(int i, C1539fw0 c1539fw0) {
        for (C0731Rg c0731Rg : this.a) {
            ArrayList arrayList = c1539fw0.a;
            if (!arrayList.contains(c0731Rg)) {
                arrayList.add(c0731Rg);
            }
            int i2 = c1539fw0.b;
            if (i == 0) {
                c0731Rg.n0 = i2;
            } else {
                c0731Rg.o0 = i2;
            }
        }
        this.e = c1539fw0.b;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = i == 2 ? "Both" : "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        String strG = AbstractC1701hf0.g(sb, this.b, "] <");
        for (C0731Rg c0731Rg : this.a) {
            StringBuilder sbS = AbstractC1674hK.s(strG, " ");
            sbS.append(c0731Rg.h0);
            strG = sbS.toString();
        }
        return AbstractC1701hf0.d(strG, " >");
    }
}
