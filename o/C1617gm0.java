package o;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: o.gm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1617gm0 {
    public int e;
    public int f;
    public int g;
    public int h;
    public AbstractC0985aF l;
    public int m;
    public AbstractC0985aF n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f798o;
    public int p;
    public int q;
    public AbstractC0985aF r;
    public AbstractC0985aF s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public boolean x;
    public HashMap y;
    public HashSet z;
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int i = Integer.MAX_VALUE;
    public int j = Integer.MAX_VALUE;
    public boolean k = true;

    public C1617gm0() {
        XE xe = AbstractC0985aF.m;
        M60 m60 = M60.p;
        this.l = m60;
        this.m = 0;
        this.n = m60;
        this.f798o = 0;
        this.p = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.r = m60;
        this.s = m60;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = false;
        this.x = false;
        this.y = new HashMap();
        this.z = new HashSet();
    }

    public static M60 c(String[] strArr) {
        XE xe = AbstractC0985aF.m;
        U9.d(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        while (i < length) {
            String str = strArr[i];
            str.getClass();
            String strL = Lr0.L(str);
            strL.getClass();
            int i3 = i2 + 1;
            if (objArrCopyOf.length < i3) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, TE.e(objArrCopyOf.length, i3));
            } else {
                if (z) {
                    objArrCopyOf = (Object[]) objArrCopyOf.clone();
                }
                objArrCopyOf[i2] = strL;
                i++;
                i2++;
            }
            z = false;
            objArrCopyOf[i2] = strL;
            i++;
            i2++;
        }
        return AbstractC0985aF.j(i2, objArrCopyOf);
    }

    public void a(int i) {
        Iterator it = this.y.values().iterator();
        while (it.hasNext()) {
            if (((C1519fm0) it.next()).l.n == i) {
                it.remove();
            }
        }
    }

    public final void b(C1715hm0 c1715hm0) {
        this.a = c1715hm0.l;
        this.b = c1715hm0.m;
        this.c = c1715hm0.n;
        this.d = c1715hm0.f816o;
        this.e = c1715hm0.p;
        this.f = c1715hm0.q;
        this.g = c1715hm0.r;
        this.h = c1715hm0.s;
        this.i = c1715hm0.t;
        this.j = c1715hm0.u;
        this.k = c1715hm0.v;
        this.l = c1715hm0.w;
        this.m = c1715hm0.x;
        this.n = c1715hm0.y;
        this.f798o = c1715hm0.z;
        this.p = c1715hm0.A;
        this.q = c1715hm0.B;
        this.r = c1715hm0.C;
        this.s = c1715hm0.D;
        this.t = c1715hm0.E;
        this.u = c1715hm0.F;
        this.v = c1715hm0.G;
        this.w = c1715hm0.H;
        this.x = c1715hm0.I;
        this.z = new HashSet(c1715hm0.K);
        this.y = new HashMap(c1715hm0.J);
    }

    public C1617gm0 d(int i, int i2) {
        this.i = i;
        this.j = i2;
        this.k = true;
        return this;
    }
}
