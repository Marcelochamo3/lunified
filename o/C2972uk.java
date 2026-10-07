package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2972uk {
    public final InterfaceC1773iL a;
    public final C1583gR b;
    public final int[] c;
    public final int d;
    public final InterfaceC2583qj e;
    public final long f;
    public final C3145wZ g;
    public final C2778sk[] h;
    public InterfaceC1920js i;
    public C0733Ri j;
    public int k;
    public B8 l;
    public boolean m;

    public C2972uk(InterfaceC1773iL interfaceC1773iL, C0733Ri c0733Ri, C1583gR c1583gR, int i, int[] iArr, InterfaceC1920js interfaceC1920js, int i2, InterfaceC2583qj interfaceC2583qj, long j, boolean z, ArrayList arrayList, C3145wZ c3145wZ) {
        this.a = interfaceC1773iL;
        this.j = c0733Ri;
        this.b = c1583gR;
        this.c = iArr;
        this.i = interfaceC1920js;
        this.d = i2;
        this.e = interfaceC2583qj;
        this.k = i;
        this.f = j;
        this.g = c3145wZ;
        long jD = c0733Ri.d(i);
        ArrayList arrayListA = a();
        this.h = new C2778sk[interfaceC1920js.length()];
        int i3 = 0;
        while (i3 < this.h.length) {
            AbstractC1853j70 abstractC1853j70 = (AbstractC1853j70) arrayListA.get(interfaceC1920js.f(i3));
            C2922u8 c2922u8G = c1583gR.G(abstractC1853j70.m);
            int i4 = i3;
            this.h[i4] = new C2778sk(jD, abstractC1853j70, c2922u8G == null ? (C2922u8) abstractC1853j70.m.get(0) : c2922u8G, S1.a(i2, abstractC1853j70.l, z, arrayList, c3145wZ), 0L, abstractC1853j70.d());
            i3 = i4 + 1;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((V1) list.get(i)).c);
        }
        return arrayList;
    }

    public final C2778sk b(int i) {
        C2778sk[] c2778skArr = this.h;
        C2778sk c2778sk = c2778skArr[i];
        C2922u8 c2922u8G = this.b.G(c2778sk.b.m);
        if (c2922u8G == null || c2922u8G.equals(c2778sk.c)) {
            return c2778sk;
        }
        C2778sk c2778sk2 = new C2778sk(c2778sk.e, c2778sk.b, c2922u8G, c2778sk.a, c2778sk.f, c2778sk.d);
        c2778skArr[i] = c2778sk2;
        return c2778sk2;
    }
}
