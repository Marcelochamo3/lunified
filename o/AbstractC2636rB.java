package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.rB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2636rB extends C0731Rg {
    public C0731Rg[] q0 = new C0731Rg[4];
    public int r0 = 0;

    public final void R(int i, ArrayList arrayList, C1539fw0 c1539fw0) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            C0731Rg c0731Rg = this.q0[i2];
            ArrayList arrayList2 = c1539fw0.a;
            if (!arrayList2.contains(c0731Rg)) {
                arrayList2.add(c0731Rg);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            AbstractC0397Ej.l(this.q0[i3], i, arrayList, c1539fw0);
        }
    }

    public void S() {
    }
}
