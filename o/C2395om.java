package o;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2395om implements InterfaceC2201mm {
    public final AbstractC1637gw0 d;
    public int f;
    public int g;
    public AbstractC1637gw0 a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public C0685Pm i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public C2395om(AbstractC1637gw0 abstractC1637gw0) {
        this.d = abstractC1637gw0;
    }

    @Override // o.InterfaceC2201mm
    public final void a(InterfaceC2201mm interfaceC2201mm) {
        ArrayList<C2395om> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C2395om) it.next()).j) {
                return;
            }
        }
        this.c = true;
        AbstractC1637gw0 abstractC1637gw0 = this.a;
        if (abstractC1637gw0 != null) {
            abstractC1637gw0.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        C2395om c2395om = null;
        int i = 0;
        for (C2395om c2395om2 : arrayList) {
            if (!(c2395om2 instanceof C0685Pm)) {
                i++;
                c2395om = c2395om2;
            }
        }
        if (c2395om != null && i == 1 && c2395om.j) {
            C0685Pm c0685Pm = this.i;
            if (c0685Pm != null) {
                if (!c0685Pm.j) {
                    return;
                } else {
                    this.f = this.h * c0685Pm.g;
                }
            }
            d(c2395om.g + this.f);
        }
        AbstractC1637gw0 abstractC1637gw1 = this.a;
        if (abstractC1637gw1 != null) {
            abstractC1637gw1.a(this);
        }
    }

    public final void b(InterfaceC2201mm interfaceC2201mm) {
        this.k.add(interfaceC2201mm);
        if (this.j) {
            interfaceC2201mm.a(interfaceC2201mm);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (InterfaceC2201mm interfaceC2201mm : this.k) {
            interfaceC2201mm.a(interfaceC2201mm);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.h0);
        sb.append(":");
        sb.append(AbstractC1701hf0.B(this.e));
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
