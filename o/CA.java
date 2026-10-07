package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class CA {
    public final C2986ur a = C2986ur.q;
    public final int b = 1;
    public final C0330Bu c = EnumC0512Iu.l;
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final int g = 2;
    public final int h = 2;
    public final boolean i = true;
    public final boolean j = true;
    public final C1027ak0 k = EnumC1417ek0.l;
    public final C1125bk0 l = EnumC1417ek0.m;
    public final LinkedList m = new LinkedList();

    public final BA a() {
        int i;
        InterfaceC3274xp0 interfaceC3274xp0A;
        InterfaceC3274xp0 interfaceC3274xp0A2;
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = Sf0.a;
        C3166wk c3166wk = AbstractC3263xk.b;
        int i2 = this.g;
        if (i2 != 2 && (i = this.h) != 2) {
            InterfaceC3274xp0 interfaceC3274xp0A3 = c3166wk.a(i2, i);
            if (z) {
                interfaceC3274xp0A = Sf0.c.a(i2, i);
                interfaceC3274xp0A2 = Sf0.b.a(i2, i);
            } else {
                interfaceC3274xp0A = null;
                interfaceC3274xp0A2 = null;
            }
            arrayList3.add(interfaceC3274xp0A3);
            if (z) {
                arrayList3.add(interfaceC3274xp0A);
                arrayList3.add(interfaceC3274xp0A2);
            }
        }
        C0330Bu c0330Bu = this.c;
        HashMap map = new HashMap(this.d);
        int i3 = this.b;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        return new BA(this.a, c0330Bu, map, this.i, this.j, i3, arrayList3, this.k, this.l, new ArrayList(this.m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Class cls, PH ph) {
        ArrayList arrayList = this.e;
        arrayList.add(Pm0.e(new Kp0(cls), ph));
        if (ph instanceof AbstractC3177wp0) {
            arrayList.add(Hp0.c(new Kp0(cls), (AbstractC3177wp0) ph));
        }
    }
}
