package o;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.mk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2198mk0 extends AbstractC3015v6 {
    public int A;
    public int B;
    public int C;
    public int D;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f921o;
    public boolean p;
    public F6 q;
    public String r;
    public final StringBuilder s;
    public boolean t;
    public String u;
    public final StringBuilder v;
    public boolean w;
    public boolean x;
    public final Nm0 y;
    public final boolean z;

    public AbstractC2198mk0(int i, Nm0 nm0) {
        super(i, 4);
        this.p = false;
        this.s = new StringBuilder();
        this.t = false;
        this.v = new StringBuilder();
        this.w = false;
        this.x = false;
        this.y = nm0;
        nm0.getClass();
        this.z = false;
    }

    public final void E(char c, int i, int i2) {
        K(i, i2);
        this.v.append(c);
    }

    public final void F(int i, int i2, int[] iArr) {
        K(i, i2);
        for (int i3 : iArr) {
            this.v.appendCodePoint(i3);
        }
    }

    public final void H(int i, String str, int i2) {
        K(i, i2);
        StringBuilder sb = this.v;
        if (sb.length() == 0) {
            this.u = str;
        } else {
            sb.append(str);
        }
    }

    public final void I(String str) {
        String strReplace = str.replace((char) 0, (char) 65533);
        String str2 = this.n;
        if (str2 != null) {
            strReplace = str2.concat(strReplace);
        }
        this.n = strReplace;
        this.f921o = AP.o(strReplace.trim());
    }

    public final void J(int i, int i2) {
        this.t = true;
        String str = this.r;
        if (str != null) {
            this.s.append(str);
            this.r = null;
        }
        if (this.z) {
            int i3 = this.A;
            if (i3 > -1) {
                i = i3;
            }
            this.A = i;
            this.B = i2;
        }
    }

    public final void K(int i, int i2) {
        this.w = true;
        String str = this.u;
        if (str != null) {
            this.v.append(str);
            this.u = null;
        }
        if (this.z) {
            int i3 = this.C;
            if (i3 > -1) {
                i = i3;
            }
            this.C = i;
            this.D = i2;
        }
    }

    public final boolean L() {
        return this.q != null;
    }

    public final void M(String str) {
        this.n = str;
        this.f921o = AP.o(str.trim());
    }

    public final void N() {
        String string;
        Map map;
        Map map2;
        if (this.q == null) {
            this.q = new F6();
        }
        if (this.t && this.q.l < 512) {
            StringBuilder sb = this.s;
            String strTrim = (sb.length() > 0 ? sb.toString() : this.r).trim();
            if (strTrim.length() > 0) {
                Object obj = null;
                if (this.w) {
                    StringBuilder sb2 = this.v;
                    string = sb2.length() > 0 ? sb2.toString() : this.u;
                } else {
                    string = this.x ? "" : null;
                }
                this.q.e(string, strTrim);
                if (this.z && w()) {
                    Nm0 nm0 = ((C2101lk0) this).y;
                    C1207cd c1207cd = nm0.b;
                    boolean z = nm0.h.b;
                    F6 f6 = this.q;
                    if (f6.o("/jsoup.userdata") != -1) {
                        int iO = f6.o("/jsoup.userdata");
                        if (iO == -1) {
                            map2 = new HashMap();
                            f6.e(map2, "/jsoup.userdata");
                        } else {
                            map2 = (Map) f6.n[iO];
                        }
                        obj = map2.get("jsoup.attrs");
                    }
                    Map map3 = (Map) obj;
                    if (map3 == null) {
                        map3 = new HashMap();
                        F6 f7 = this.q;
                        int iO2 = f7.o("/jsoup.userdata");
                        if (iO2 == -1) {
                            map = new HashMap();
                            f7.e(map, "/jsoup.userdata");
                        } else {
                            map = (Map) f7.n[iO2];
                        }
                        map.put("jsoup.attrs", map3);
                    }
                    if (!z) {
                        strTrim = AP.o(strTrim);
                    }
                    if (!map3.containsKey(strTrim)) {
                        if (!this.w) {
                            int i = this.B;
                            this.D = i;
                            this.C = i;
                        }
                        int i2 = this.A;
                        C2239n50 c2239n50 = new C2239n50(i2, c1207cd.p(i2), c1207cd.e(this.A));
                        int i3 = this.B;
                        C2336o50 c2336o50 = new C2336o50(c2239n50, new C2239n50(i3, c1207cd.p(i3), c1207cd.e(this.B)));
                        int i4 = this.C;
                        C2239n50 c2239n51 = new C2239n50(i4, c1207cd.p(i4), c1207cd.e(this.C));
                        int i5 = this.D;
                        map3.put(strTrim, new C2142m50(c2336o50, new C2336o50(c2239n51, new C2239n50(i5, c1207cd.p(i5), c1207cd.e(this.D)))));
                    }
                }
            }
        }
        P();
    }

    @Override // o.AbstractC3015v6
    /* JADX INFO: renamed from: O */
    public AbstractC2198mk0 C() {
        this.n = null;
        this.f921o = null;
        this.p = false;
        this.q = null;
        P();
        return this;
    }

    public final void P() {
        AbstractC3015v6.D(this.s);
        this.r = null;
        this.t = false;
        AbstractC3015v6.D(this.v);
        this.u = null;
        this.x = false;
        this.w = false;
        if (this.z) {
            this.D = -1;
            this.C = -1;
            this.B = -1;
            this.A = -1;
        }
    }
}
