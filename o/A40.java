package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class A40 {
    public static final char[] d = {',', '>', '+', '~', ' '};
    public static final String[] e = {"=", "!=", "^=", "$=", "*=", "~="};
    public static final Pattern f = Pattern.compile("(([+-])?(\\d+)?)n(\\s*([+-])?\\s*\\d+)?", 2);
    public static final Pattern g = Pattern.compile("([+-])?(\\d+)");
    public final C2295nk0 a;
    public final String b;
    public final ArrayList c = new ArrayList();

    public A40(String str) {
        Sr0.u(str);
        String strTrim = str.trim();
        this.b = strTrim;
        this.a = new C2295nk0(strTrim);
    }

    public static AbstractC1332dr k(String str) {
        try {
            return new A40(str).j();
        } catch (IllegalArgumentException e2) {
            throw new C0599Me(e2.getMessage());
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:41:0x00be  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:49:0x010c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x014b  */
    public final void a(char c) {
        AbstractC1332dr c2768sf;
        AbstractC1332dr abstractC1332dr;
        boolean z;
        C2768sf c2768sf2;
        Object obj;
        Object obj2;
        C2192mh0 c2192mh0;
        C2865tf c2865tf;
        int i = 0;
        C2295nk0 c2295nk0 = this.a;
        c2295nk0.m();
        StringBuilder sbB = AbstractC1021ah0.b();
        boolean z2 = false;
        while (!c2295nk0.o()) {
            if (!c2295nk0.r(d)) {
                if (c2295nk0.q("(")) {
                    sbB.append("(");
                    sbB.append(c2295nk0.e('(', ')'));
                    sbB.append(")");
                } else if (c2295nk0.q("[")) {
                    sbB.append("[");
                    sbB.append(c2295nk0.e('[', ']'));
                    sbB.append("]");
                } else {
                    sbB.append(c2295nk0.i());
                }
                z2 = true;
            } else if (z2) {
                break;
            } else {
                sbB.append(c2295nk0.i());
            }
        }
        AbstractC1332dr abstractC1332drK = k(AbstractC1021ah0.h(sbB));
        ArrayList arrayList = this.c;
        if (arrayList.size() == 1) {
            c2768sf = (AbstractC1332dr) arrayList.get(0);
            if ((c2768sf instanceof C2865tf) && c != ',') {
                C2865tf c2865tf2 = (C2865tf) c2768sf;
                int i2 = c2865tf2.c;
                AbstractC1332dr abstractC1332dr2 = i2 > 0 ? (AbstractC1332dr) c2865tf2.a.get(i2 - 1) : null;
                z = true;
                AbstractC1332dr abstractC1332dr3 = abstractC1332dr2;
                abstractC1332dr = c2768sf;
                c2768sf = abstractC1332dr3;
            }
            arrayList.clear();
            if (c != ' ') {
                if (c != '>') {
                    if (c2768sf instanceof C2192mh0) {
                        c2192mh0 = (C2192mh0) c2768sf;
                    } else {
                        c2192mh0 = new C2192mh0(c2768sf);
                    }
                    c2192mh0.a.add(abstractC1332drK);
                    c2192mh0.b = abstractC1332drK.a() + c2192mh0.b;
                    obj = c2192mh0;
                } else if (c != '~') {
                    c2768sf2 = new C2768sf(new C2289nh0(c2768sf, 4), abstractC1332drK);
                } else if (c != '+') {
                    c2768sf2 = new C2768sf(new C2289nh0(c2768sf, i), abstractC1332drK);
                } else {
                    if (c == ',') {
                        throw new C0599Me("Unknown combinator '%s'", Character.valueOf(c));
                    }
                    if (c2768sf instanceof C2865tf) {
                        c2865tf = (C2865tf) c2768sf;
                    } else {
                        C2865tf c2865tf3 = new C2865tf();
                        c2865tf3.a.add(c2768sf);
                        c2865tf3.d();
                        c2865tf = c2865tf3;
                    }
                    c2865tf.a.add(abstractC1332drK);
                    c2865tf.d();
                    obj = c2865tf;
                }
                if (z) {
                    C2865tf c2865tf4 = (C2865tf) abstractC1332dr;
                    c2865tf4.a.set(c2865tf4.c - 1, obj);
                    c2865tf4.d();
                    obj2 = abstractC1332dr;
                } else {
                    obj2 = obj;
                }
                arrayList.add(obj2);
            }
            c2768sf2 = new C2768sf(new C2289nh0(c2768sf, 3), abstractC1332drK);
            obj = c2768sf2;
            if (z) {
                C2865tf c2865tf5 = (C2865tf) abstractC1332dr;
                c2865tf5.a.set(c2865tf5.c - 1, obj);
                c2865tf5.d();
                obj2 = abstractC1332dr;
            } else {
                obj2 = obj;
            }
            arrayList.add(obj2);
        }
        c2768sf = new C2768sf(arrayList);
        abstractC1332dr = c2768sf;
        z = false;
        arrayList.clear();
        if (c != ' ') {
            if (c != '>') {
                if (c2768sf instanceof C2192mh0) {
                    c2192mh0 = (C2192mh0) c2768sf;
                } else {
                    c2192mh0 = new C2192mh0(c2768sf);
                }
                c2192mh0.a.add(abstractC1332drK);
                c2192mh0.b = abstractC1332drK.a() + c2192mh0.b;
                obj = c2192mh0;
            } else if (c != '~') {
                c2768sf2 = new C2768sf(new C2289nh0(c2768sf, 4), abstractC1332drK);
            } else if (c != '+') {
                c2768sf2 = new C2768sf(new C2289nh0(c2768sf, i), abstractC1332drK);
            } else {
                if (c == ',') {
                    throw new C0599Me("Unknown combinator '%s'", Character.valueOf(c));
                }
                if (c2768sf instanceof C2865tf) {
                    c2865tf = (C2865tf) c2768sf;
                } else {
                    C2865tf c2865tf6 = new C2865tf();
                    c2865tf6.a.add(c2768sf);
                    c2865tf6.d();
                    c2865tf = c2865tf6;
                }
                c2865tf.a.add(abstractC1332drK);
                c2865tf.d();
                obj = c2865tf;
            }
            if (z) {
                C2865tf c2865tf7 = (C2865tf) abstractC1332dr;
                c2865tf7.a.set(c2865tf7.c - 1, obj);
                c2865tf7.d();
                obj2 = abstractC1332dr;
            } else {
                obj2 = obj;
            }
            arrayList.add(obj2);
        }
        c2768sf2 = new C2768sf(new C2289nh0(c2768sf, 3), abstractC1332drK);
        obj = c2768sf2;
        if (z) {
            C2865tf c2865tf8 = (C2865tf) abstractC1332dr;
            c2865tf8.a.set(c2865tf8.c - 1, obj);
            c2865tf8.d();
            obj2 = abstractC1332dr;
        } else {
            obj2 = obj;
        }
        arrayList.add(obj2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final AbstractC1332dr b() {
        AbstractC1332dr c0819Uq;
        AbstractC1332dr c0897Xq;
        int i = 5;
        int i2 = 7;
        int i3 = 6;
        int i4 = 8;
        int i5 = 9;
        int i6 = 4;
        int i7 = 3;
        int i8 = 2;
        boolean z = true;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        boolean z6 = true;
        boolean z7 = false;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        C2295nk0 c2295nk0 = this.a;
        boolean zP = c2295nk0.p("#");
        String[] strArr = C2295nk0.p;
        if (zP) {
            String strK = c2295nk0.k(strArr);
            Sr0.u(strK);
            return new C0819Uq(i4, strK, z7);
        }
        if (c2295nk0.p(".")) {
            String strK2 = c2295nk0.k(strArr);
            Sr0.u(strK2);
            return new C0819Uq(i8, strK2.trim(), b10 == true ? 1 : 0);
        }
        if ((!c2295nk0.o() && Character.isLetterOrDigit(((String) c2295nk0.n).charAt(c2295nk0.m))) || c2295nk0.q("*|")) {
            String strP = AP.p(c2295nk0.k(C2295nk0.f940o));
            Sr0.u(strP);
            if (!strP.startsWith("*|")) {
                if (strP.contains("|")) {
                    strP = strP.replace("|", ":");
                }
                return new C0819Uq(i5, strP, b == true ? 1 : 0);
            }
            List listAsList = Arrays.asList(new C0819Uq(i5, strP.substring(2), b3 == true ? 1 : 0), new C0819Uq(10, strP.replace("*|", ":"), b2 == true ? 1 : 0));
            C2865tf c2865tf = new C2865tf();
            int i9 = c2865tf.c;
            ArrayList arrayList = c2865tf.a;
            if (i9 > 1) {
                arrayList.add(new C2768sf(listAsList));
            } else {
                arrayList.addAll(listAsList);
            }
            c2865tf.d();
            return c2865tf;
        }
        boolean zQ = c2295nk0.q("[");
        String str = this.b;
        if (zQ) {
            C2295nk0 c2295nk1 = new C2295nk0(c2295nk0.e('[', ']'));
            String[] strArr2 = e;
            int i10 = c2295nk1.m;
            loop0: while (!c2295nk1.o()) {
                for (int i11 = 0; i11 < 6; i11++) {
                    if (c2295nk1.q(strArr2[i11])) {
                        break loop0;
                    }
                }
                c2295nk1.m++;
            }
            String strSubstring = ((String) c2295nk1.n).substring(i10, c2295nk1.m);
            Sr0.u(strSubstring);
            c2295nk1.m();
            if (c2295nk1.o()) {
                if (strSubstring.startsWith("^")) {
                    return new C0819Uq(strSubstring.substring(1), 1);
                }
                return strSubstring.equals("*") ? new C0819Uq("", 1) : new C0819Uq(b9 == true ? 1 : 0, strSubstring, b8 == true ? 1 : 0);
            }
            if (c2295nk1.p("=")) {
                c0897Xq = new C0871Wq(b7 == true ? 1 : 0, strSubstring, c2295nk1.u(), z);
            } else if (c2295nk1.p("!=")) {
                c0897Xq = new C0871Wq(i7, strSubstring, c2295nk1.u(), z6 ? 1 : 0);
            } else if (c2295nk1.p("^=")) {
                c0897Xq = new C0871Wq(i6, strSubstring, c2295nk1.u(), b6 == true ? 1 : 0);
            } else if (c2295nk1.p("$=")) {
                c0897Xq = new C0871Wq(i8, strSubstring, c2295nk1.u(), b5 == true ? 1 : 0);
            } else if (c2295nk1.p("*=")) {
                c0897Xq = new C0871Wq(z5 ? 1 : 0, strSubstring, c2295nk1.u(), z4 ? 1 : 0);
            } else {
                if (!c2295nk1.p("~=")) {
                    throw new C0599Me("Could not parse attribute query '%s': unexpected token at '%s'", str, c2295nk1.u());
                }
                c0897Xq = new C0897Xq(strSubstring, Pattern.compile(c2295nk1.u()));
            }
            return c0897Xq;
        }
        if (c2295nk0.p("*")) {
            return new C0793Tq(b4 == true ? 1 : 0);
        }
        if (!c2295nk0.p(":")) {
            throw new C0599Me("Could not parse query '%s': unexpected token at '%s'", str, c2295nk0.u());
        }
        String strK3 = c2295nk0.k(strArr);
        strK3.getClass();
        byte b11 = -1;
        switch (strK3.hashCode()) {
            case -2141736343:
                if (strK3.equals("containsData")) {
                    b11 = 0;
                }
                break;
            case -2136991809:
                if (strK3.equals("first-child")) {
                    b11 = 1;
                }
                break;
            case -1939921007:
                if (strK3.equals("matchesWholeText")) {
                    b11 = 2;
                }
                break;
            case -1754914063:
                if (strK3.equals("nth-child")) {
                    b11 = 3;
                }
                break;
            case -1629748624:
                if (strK3.equals("nth-last-child")) {
                    b11 = 4;
                }
                break;
            case -947996741:
                if (strK3.equals("only-child")) {
                    b11 = 5;
                }
                break;
            case -897532411:
                if (strK3.equals("nth-of-type")) {
                    b11 = 6;
                }
                break;
            case -872629820:
                if (strK3.equals("nth-last-of-type")) {
                    b11 = 7;
                }
                break;
            case -567445985:
                if (strK3.equals("contains")) {
                    b11 = 8;
                }
                break;
            case -55413797:
                if (strK3.equals("containsWholeOwnText")) {
                    b11 = 9;
                }
                break;
            case 3244:
                if (strK3.equals("eq")) {
                    b11 = 10;
                }
                break;
            case 3309:
                if (strK3.equals("gt")) {
                    b11 = C3285xv.h;
                }
                break;
            case 3370:
                if (strK3.equals("is")) {
                    b11 = 12;
                }
                break;
            case 3464:
                if (strK3.equals("lt")) {
                    b11 = 13;
                }
                break;
            case 103066:
                if (strK3.equals("has")) {
                    b11 = 14;
                }
                break;
            case 109267:
                if (strK3.equals("not")) {
                    b11 = 15;
                }
                break;
            case 3506402:
                if (strK3.equals("root")) {
                    b11 = 16;
                }
                break;
            case 96634189:
                if (strK3.equals("empty")) {
                    b11 = 17;
                }
                break;
            case 208017639:
                if (strK3.equals("containsOwn")) {
                    b11 = 18;
                }
                break;
            case 614017170:
                if (strK3.equals("matchText")) {
                    b11 = 19;
                }
                break;
            case 835834661:
                if (strK3.equals("last-child")) {
                    b11 = 20;
                }
                break;
            case 840862003:
                if (strK3.equals("matches")) {
                    b11 = 21;
                }
                break;
            case 1255901423:
                if (strK3.equals("matchesWholeOwnText")) {
                    b11 = 22;
                }
                break;
            case 1292941139:
                if (strK3.equals("first-of-type")) {
                    b11 = 23;
                }
                break;
            case 1455900751:
                if (strK3.equals("only-of-type")) {
                    b11 = 24;
                }
                break;
            case 1870740819:
                if (strK3.equals("matchesOwn")) {
                    b11 = 25;
                }
                break;
            case 2014184485:
                if (strK3.equals("containsWholeText")) {
                    b11 = 26;
                }
                break;
            case 2025926969:
                if (strK3.equals("last-of-type")) {
                    b11 = 27;
                }
                break;
        }
        switch (b11) {
            case 0:
                String strV = C2295nk0.v(d());
                Sr0.v(strV, ":containsData(text) query must not be empty");
                c0819Uq = new C0819Uq(strV, 3);
                break;
            case 1:
                return new C0793Tq(i8);
            case 2:
                return i(false);
            case 3:
                return g(false, false);
            case 4:
                return g(true, false);
            case 5:
                return new C0793Tq(i6);
            case 6:
                return g(false, true);
            case 7:
                return g(true, true);
            case 8:
                return e(false);
            case 9:
                return f(true);
            case 10:
                return new C0923Yq(c(), 0);
            case 11:
                return new C0923Yq(c(), 1);
            case 12:
                String strD = d();
                Sr0.v(strD, ":is(selector) sub-select must not be empty");
                c0819Uq = new C2289nh0(k(strD), z2 ? 1 : 0);
                break;
            case 13:
                return new C0923Yq(c(), 2);
            case 14:
                String strD2 = d();
                Sr0.v(strD2, ":has(selector) sub-select must not be empty");
                c0819Uq = new C2095lh0(k(strD2));
                break;
            case 15:
                String strD3 = d();
                Sr0.v(strD3, ":not(selector) subselect must not be empty");
                c0819Uq = new C2289nh0(k(strD3), i8);
                break;
            case 16:
                return new C0793Tq(i3);
            case 17:
                return new C0793Tq(z3 ? 1 : 0);
            case 18:
                return e(true);
            case 19:
                return new C0793Tq(i2);
            case 20:
                return new C0793Tq(i7);
            case 21:
                return h(false);
            case 22:
                return i(true);
            case 23:
                return new C0949Zq(0, 1, 3);
            case 24:
                c0819Uq = new C0793Tq(i);
                break;
            case 25:
                return h(true);
            case 26:
                return f(false);
            case 27:
                return new C1040ar(0, 1, 2);
            default:
                throw new C0599Me("Could not parse query '%s': unexpected token at '%s'", str, c2295nk0.u());
        }
        return c0819Uq;
    }

    public final int c() {
        boolean z = true;
        String strTrim = d().trim();
        String[] strArr = AbstractC1021ah0.a;
        if (strTrim == null || strTrim.length() == 0) {
            z = false;
            break;
        }
        int length = strTrim.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(strTrim.codePointAt(i))) {
                z = false;
                break;
            }
        }
        if (z) {
            return Integer.parseInt(strTrim);
        }
        throw new C1629gs0("Index must be numeric");
    }

    public final String d() {
        return this.a.e('(', ')');
    }

    public final AbstractC1332dr e(boolean z) {
        String str = z ? ":containsOwn" : ":contains";
        String strV = C2295nk0.v(d());
        Sr0.v(strV, str.concat("(text) query must not be empty"));
        return z ? new C0819Uq(strV, 4) : new C0819Uq(strV, 5);
    }

    public final AbstractC1332dr f(boolean z) {
        String str = z ? ":containsWholeOwnText" : ":containsWholeText";
        String strV = C2295nk0.v(d());
        Sr0.v(strV, str.concat("(text) query must not be empty"));
        return z ? new C0819Uq(6, strV, false) : new C0819Uq(7, strV, false);
    }

    public final C1138br g(boolean z, boolean z2) {
        int i;
        int i2;
        String strP = AP.p(d());
        Matcher matcher = f.matcher(strP);
        Matcher matcher2 = g.matcher(strP);
        if ("odd".equals(strP)) {
            i2 = 2;
            i = 1;
        } else {
            if ("even".equals(strP)) {
                i2 = 2;
            } else if (matcher.matches()) {
                i2 = matcher.group(3) != null ? Integer.parseInt(matcher.group(1).replaceFirst("^\\+", "")) : 1;
                if (matcher.group(4) != null) {
                    i = Integer.parseInt(matcher.group(4).replaceFirst("^\\+", ""));
                }
            } else {
                if (!matcher2.matches()) {
                    throw new C0599Me("Could not parse nth-index '%s': unexpected format", strP);
                }
                i = Integer.parseInt(matcher2.group().replaceFirst("^\\+", ""));
                i2 = 0;
            }
            i = 0;
        }
        if (z2) {
            return z ? new C1138br(i2, i, 2) : new C1138br(i2, i, 3);
        }
        return z ? new C1138br(i2, i, 1) : new C1138br(i2, i, 0);
    }

    public final AbstractC1332dr h(boolean z) {
        String str = z ? ":matchesOwn" : ":matches";
        String strD = d();
        Sr0.v(strD, str.concat("(regex) query must not be empty"));
        return z ? new C1235cr(Pattern.compile(strD), 1) : new C1235cr(Pattern.compile(strD), 0);
    }

    public final AbstractC1332dr i(boolean z) {
        String str = z ? ":matchesWholeOwnText" : ":matchesWholeText";
        String strD = d();
        Sr0.v(strD, str.concat("(regex) query must not be empty"));
        return z ? new C1235cr(Pattern.compile(strD), 2) : new C1235cr(Pattern.compile(strD), 3);
    }

    public final AbstractC1332dr j() {
        C2295nk0 c2295nk0 = this.a;
        c2295nk0.m();
        char[] cArr = d;
        boolean zR = c2295nk0.r(cArr);
        ArrayList arrayList = this.c;
        if (zR) {
            arrayList.add(new C0793Tq(8));
            a(c2295nk0.i());
        } else {
            arrayList.add(b());
        }
        while (!c2295nk0.o()) {
            boolean zM = c2295nk0.m();
            if (c2295nk0.r(cArr)) {
                a(c2295nk0.i());
            } else if (zM) {
                a(' ');
            } else {
                arrayList.add(b());
            }
        }
        return arrayList.size() == 1 ? (AbstractC1332dr) arrayList.get(0) : new C2768sf(arrayList);
    }

    public final String toString() {
        return this.b;
    }
}
