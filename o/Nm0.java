package o;

import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Nm0 {
    public RN a;
    public C1207cd b;
    public C2392ok0 c;
    public C0660On d;
    public ArrayList e;
    public String f;
    public AbstractC3015v6 g;
    public C2852tX h;
    public HashMap i;
    public C2101lk0 j;
    public final C2003kk0 k = new C2003kk0(3, this);

    public final C3176wp a() {
        int size = this.e.size();
        return size > 0 ? (C3176wp) this.e.get(size - 1) : this.d;
    }

    public final boolean b(String str) {
        C3176wp c3176wpA;
        if (this.e.size() == 0 || (c3176wpA = a()) == null) {
            return false;
        }
        C2678ri0 c2678ri0 = c3176wpA.f1103o;
        return c2678ri0.m.equals(str) && c2678ri0.n.equals("http://www.w3.org/1999/xhtml");
    }

    public String c() {
        return "http://www.w3.org/1999/xhtml";
    }

    public abstract C2852tX d();

    public void e(Reader reader, String str, RN rn) {
        if (str == null) {
            throw new C1629gs0("The parameter 'baseUri' must not be null.");
        }
        Sr0.w(rn);
        C0660On c0660On = new C0660On(((Nm0) rn.m).c(), str);
        this.d = c0660On;
        c0660On.v = rn;
        this.a = rn;
        this.h = (C2852tX) rn.f488o;
        C1207cd c1207cd = new C1207cd(reader, 32768);
        this.b = c1207cd;
        boolean z = ((C2755sX) rn.n).l > 0;
        if (z && c1207cd.i == null) {
            c1207cd.i = new ArrayList(409);
            c1207cd.A();
        } else if (!z) {
            c1207cd.i = null;
        }
        this.c = new C2392ok0(this);
        this.e = new ArrayList(32);
        this.i = new HashMap();
        C2101lk0 c2101lk0 = new C2101lk0(2, this);
        this.j = c2101lk0;
        this.g = c2101lk0;
        this.f = str;
    }

    public final C0660On f(Reader reader, String str, RN rn) {
        AbstractC3015v6 abstractC3015v6;
        e(reader, str, rn);
        C2392ok0 c2392ok0 = this.c;
        while (true) {
            if (c2392ok0.e) {
                StringBuilder sb = c2392ok0.g;
                int length = sb.length();
                C1613gk0 c1613gk0 = c2392ok0.l;
                if (length != 0) {
                    String string = sb.toString();
                    sb.delete(0, sb.length());
                    c1613gk0.n = string;
                    c2392ok0.f = null;
                    abstractC3015v6 = c1613gk0;
                } else {
                    String str2 = c2392ok0.f;
                    if (str2 != null) {
                        c1613gk0.n = str2;
                        c2392ok0.f = null;
                        abstractC3015v6 = c1613gk0;
                    } else {
                        c2392ok0.e = false;
                        abstractC3015v6 = c2392ok0.d;
                    }
                }
                this.g = abstractC3015v6;
                h(abstractC3015v6);
                if (abstractC3015v6.m == 6) {
                    break;
                }
                abstractC3015v6.C();
            } else {
                c2392ok0.c.d(c2392ok0, c2392ok0.a);
            }
        }
        while (!this.e.isEmpty()) {
            g();
        }
        this.b.d();
        this.b = null;
        this.c = null;
        this.e = null;
        this.i = null;
        return this.d;
    }

    public final C3176wp g() {
        return (C3176wp) this.e.remove(this.e.size() - 1);
    }

    public abstract boolean h(AbstractC3015v6 abstractC3015v6);

    public final boolean i(String str) {
        AbstractC3015v6 abstractC3015v6 = this.g;
        C2003kk0 c2003kk0 = this.k;
        if (abstractC3015v6 == c2003kk0) {
            C2003kk0 c2003kk1 = new C2003kk0(3, this);
            c2003kk1.M(str);
            return h(c2003kk1);
        }
        c2003kk0.C();
        c2003kk0.M(str);
        return h(c2003kk0);
    }

    public final void j(String str) {
        C2101lk0 c2101lk0 = this.j;
        if (this.g == c2101lk0) {
            C2101lk0 c2101lk1 = new C2101lk0(2, this);
            c2101lk1.M(str);
            h(c2101lk1);
        } else {
            c2101lk0.C();
            c2101lk0.M(str);
            h(c2101lk0);
        }
    }
}
