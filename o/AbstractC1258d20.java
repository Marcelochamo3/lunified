package o;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.d20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1258d20 implements Zb0, InterfaceC0518Ja {
    public final String a;
    public final LF b;
    public final int c;
    public int d;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final CJ i;
    public final CJ j;
    public final CJ k;

    public AbstractC1258d20(String str, LF lf, int i) {
        AbstractC1474fG.j(str, "serialName");
        this.a = str;
        this.b = lf;
        this.c = i;
        this.d = -1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = C1330dq.l;
        IJ ij = IJ.m;
        this.i = AP.m(ij, new C1160c20(this, 1));
        this.j = AP.m(ij, new C1160c20(this, 2));
        this.k = AP.m(ij, new C1160c20(this, 0));
    }

    @Override // o.Zb0
    public final String a() {
        return this.a;
    }

    @Override // o.Zb0
    public U9 b() {
        return C2386oh0.j;
    }

    @Override // o.Zb0
    public final int c() {
        return this.c;
    }

    @Override // o.Zb0
    public final String d(int i) {
        return this.e[i];
    }

    @Override // o.InterfaceC0518Ja
    public final Set e() {
        return this.h.keySet();
    }

    @Override // o.Zb0
    public Zb0 f(int i) {
        return ((InterfaceC2159mI[]) this.i.getValue())[i].b();
    }

    @Override // o.Zb0
    public final boolean g(int i) {
        return this.g[i];
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    public String toString() {
        return AbstractC0911Ye.h0(U9.L(0, this.c), ", ", this.a + '(', ")", new io.sentry.android.replay.v(16, this), 24);
    }
}
