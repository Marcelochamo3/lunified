package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: o.ac0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1011ac0 implements Zb0, InterfaceC0518Ja {
    public final String a;
    public final U9 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final Zb0[] f;
    public final boolean[] g;
    public final Zb0[] h;
    public final Rh0 i;

    public C1011ac0(String str, U9 u9, int i, List list, C2863te c2863te) {
        AbstractC1474fG.j(str, "serialName");
        this.a = str;
        this.b = u9;
        this.c = i;
        ArrayList arrayList = c2863te.b;
        AbstractC1474fG.j(arrayList, "<this>");
        HashSet hashSet = new HashSet(AbstractC3327yN.x(AbstractC1016af.O(arrayList, 12)));
        AbstractC0911Ye.v0(arrayList, hashSet);
        this.d = hashSet;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.e = strArr;
        this.f = UK.g(c2863te.d);
        this.g = AbstractC0911Ye.t0(c2863te.f);
        AbstractC1474fG.j(strArr, "<this>");
        AF af = new AF(0, new io.sentry.android.replay.f(4, strArr));
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(af, 10));
        Iterator it = af.iterator();
        while (true) {
            C0739Ro c0739Ro = (C0739Ro) it;
            if (!c0739Ro.m.hasNext()) {
                AbstractC3327yN.A(arrayList2);
                this.h = UK.g(list);
                this.i = new Rh0(new io.sentry.android.replay.f(20, this));
                return;
            }
            C3416zF c3416zF = (C3416zF) c0739Ro.next();
            arrayList2.add(new C1101bX(c3416zF.b, Integer.valueOf(c3416zF.a)));
        }
    }

    @Override // o.Zb0
    public final String a() {
        return this.a;
    }

    @Override // o.Zb0
    public final U9 b() {
        return this.b;
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
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1011ac0) {
            Zb0 zb0 = (Zb0) obj;
            if (AbstractC1474fG.b(this.a, zb0.a()) && Arrays.equals(this.h, ((C1011ac0) obj).h)) {
                int iC = zb0.c();
                int i = this.c;
                if (i == iC) {
                    for (int i2 = 0; i2 < i; i2++) {
                        Zb0[] zb0Arr = this.f;
                        if (AbstractC1474fG.b(zb0Arr[i2].a(), zb0.f(i2).a()) && AbstractC1474fG.b(zb0Arr[i2].b(), zb0.f(i2).b())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.Zb0
    public final Zb0 f(int i) {
        return this.f[i];
    }

    @Override // o.Zb0
    public final boolean g(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.i.getValue()).intValue();
    }

    public final String toString() {
        return AbstractC0911Ye.h0(U9.L(0, this.c), ", ", this.a + '(', ")", new io.sentry.android.replay.v(19, this), 24);
    }
}
