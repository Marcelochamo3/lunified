package o;

import com.skidush.clonex.models.Video$Type;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2525q3 implements Q30 {
    public static final C2525q3 b = new C2525q3();
    public static final InterfaceC1356e3 c = O9.m(false);
    public static final Rh0 d = new Rh0(C2428p3.n);
    public static final List e = AbstractC0937Ze.K(new C1101bX("Anal-12", "Anal"), new C1101bX("Oiled-22", "Aceite"), new C1101bX("Amateur-65", "Amateur"), new C1101bX("Asian_Woman-32", "Asiatica"), new C1101bX("Creampie-40", "Creampie"), new C1101bX("Ass-14", "Culazos"), new C1101bX("Fucked_Up_Family-81", "Familia Jodida"), new C1101bX("Interracial-27", "Interracial"), new C1101bX("Teen-13", "Jovencitas"), new C1101bX("Latina-16", "Latinas"), new C1101bX("Lingerie-83", "Lenceria"), new C1101bX("Blonde-20", "Rubias"), new C1101bX("Big_Cock-34", "Polla Grande"), new C1101bX("Lesbian-26", "Lesvianas"));

    public static final ArrayList p(C0660On c0660On) {
        String strD;
        String strD2;
        C3370yp<C3176wp> c3370ypW = c0660On.W("div.thumb-block");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(c3370ypW, 10));
        for (C3176wp c3176wp : c3370ypW) {
            C3176wp c3176wpX = c3176wp.X("a");
            String strL0 = (c3176wpX == null || (strD2 = c3176wpX.d("href")) == null) ? "" : AbstractC1119bh0.l0(strD2, "/");
            C3176wp c3176wpX2 = c3176wp.X("p.title a");
            String strZ = c3176wpX2 != null ? c3176wpX2.Z() : null;
            String str = strZ != null ? strZ : "";
            C3176wp c3176wpX3 = c3176wp.X("span.duration");
            String strZ2 = c3176wpX3 != null ? c3176wpX3.Z() : null;
            C3176wp c3176wpX4 = c3176wp.X("img");
            String strS = (c3176wpX4 == null || (strD = c3176wpX4.d("data-src")) == null) ? null : s(strD);
            C3176wp c3176wpX5 = c3176wp.X("p.title a");
            String strD3 = c3176wpX5 != null ? c3176wpX5.d("title") : null;
            int iR = strZ2 != null ? r(strZ2) : 0;
            C1233cq c1233cq = C1233cq.l;
            arrayList.add(new C1387eR(strL0, str, strD3, null, Integer.valueOf(iR), null, "HD", null, strS, null, c1233cq, c1233cq, c1233cq, c1233cq, null, 16896));
        }
        return arrayList;
    }

    public static String q(String str) {
        String str2;
        Pattern patternCompile = Pattern.compile("html5player\\.setVideoHLS\\('([^']+)'\\);");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        Pattern patternCompile2 = Pattern.compile("html5player\\.setVideoUrlHigh\\('([^']+)'\\);");
        AbstractC1474fG.i(patternCompile2, "compile(...)");
        Pattern patternCompile3 = Pattern.compile("html5player\\.setVideoUrl\\('([^']+)'\\);");
        AbstractC1474fG.i(patternCompile3, "compile(...)");
        Pattern patternCompile4 = Pattern.compile("https?://[^\\s<>\"]+?(?:\\.mp4|\\.m3u8)[^\\s<>\"]*");
        AbstractC1474fG.i(patternCompile4, "compile(...)");
        Matcher matcher = patternCompile.matcher(str);
        AbstractC1474fG.i(matcher, "matcher(...)");
        JN jnA = AbstractC1370eA.a(matcher, 0, str);
        if (jnA != null && (str2 = (String) ((HN) jnA.a()).get(1)) != null) {
            return str2;
        }
        Matcher matcher2 = patternCompile2.matcher(str);
        AbstractC1474fG.i(matcher2, "matcher(...)");
        JN jnA2 = AbstractC1370eA.a(matcher2, 0, str);
        if (jnA2 != null) {
            return (String) ((HN) jnA2.a()).get(1);
        }
        Matcher matcher3 = patternCompile3.matcher(str);
        AbstractC1474fG.i(matcher3, "matcher(...)");
        JN jnA3 = AbstractC1370eA.a(matcher3, 0, str);
        String str3 = jnA3 != null ? (String) ((HN) jnA3.a()).get(1) : null;
        if (str3 != null) {
            return str3;
        }
        Matcher matcher4 = patternCompile4.matcher(str);
        AbstractC1474fG.i(matcher4, "matcher(...)");
        JN jnA4 = AbstractC1370eA.a(matcher4, 0, str);
        if (jnA4 != null) {
            return jnA4.c();
        }
        return null;
    }

    public static int r(String str) {
        List listT0 = AbstractC1119bh0.t0(str, new String[]{":"}, 0, 6);
        int size = listT0.size();
        if (size == 2) {
            return Integer.parseInt((String) listT0.get(1)) + (Integer.parseInt((String) listT0.get(0)) * 60);
        }
        if (size != 3) {
            return 0;
        }
        return (Integer.parseInt((String) listT0.get(1)) * 60) + (Integer.parseInt((String) listT0.get(0)) * 3600) + Integer.parseInt((String) listT0.get(2));
    }

    public static String s(String str) {
        if (!AbstractC1899jh0.U(str, "https:", false) && AbstractC1899jh0.U(str, "//", false)) {
            str = "https:".concat(str);
        }
        return AbstractC1119bh0.B0(str, "?");
    }

    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        throw new UnsupportedOperationException("Search not implemented");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [o.Hh] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.lang.String] */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C2040l3 c2040l3;
        String str2;
        C2525q3 c2525q3;
        String strD;
        String strZ;
        String strD2;
        if (interfaceC0473Hh instanceof C2040l3) {
            c2040l3 = (C2040l3) interfaceC0473Hh;
            int i = c2040l3.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2040l3.p = i - Integer.MIN_VALUE;
            } else {
                c2040l3 = new C2040l3(this, interfaceC0473Hh);
            }
        } else {
            c2040l3 = new C2040l3(this, interfaceC0473Hh);
        }
        C2040l3 c2040l4 = c2040l3;
        Object objC = c2040l4.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2040l4.p;
        ?? S = 0;
        S = 0;
        try {
            if (i2 == 0) {
                Jp0.O(objC);
                c2040l4.l = this;
                c2040l4.m = str;
                c2040l4.p = 1;
                objC = C0856Wb.a.c("xAdultos detalle", false, new C1552g3(str, 0, S), new C1552g3(str, 1, S), c2040l4);
                if (objC == enumC1706hi) {
                    return enumC1706hi;
                }
                str2 = str;
                c2525q3 = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = c2040l4.m;
                c2525q3 = c2040l4.l;
                Jp0.O(objC);
                str2 = str3;
            }
            C0660On c0660On = (C0660On) objC;
            Objects.toString(c0660On);
            String strR = c0660On.R();
            AbstractC1474fG.i(strR, "toString(...)");
            c2525q3.getClass();
            q(strR);
            C3176wp c3176wpX = c0660On.X("h1.entry-title");
            if (c3176wpX == null || (strD = c3176wpX.Z()) == null) {
                C3176wp c3176wpX2 = c0660On.X("meta[property=og:title]");
                strD = c3176wpX2 != null ? c3176wpX2.d("content") : null;
                if (strD == null) {
                    strD = "";
                }
            }
            String str4 = strD;
            C3176wp c3176wpX3 = c0660On.X("meta[property=og:description]");
            String strD3 = c3176wpX3 != null ? c3176wpX3.d("content") : null;
            C3176wp c3176wpX4 = c0660On.X("meta[property=og:image]");
            if (c3176wpX4 != null && (strD2 = c3176wpX4.d("content")) != null) {
                S = s(strD2);
            }
            ?? r20 = S;
            C3176wp c3176wpX5 = c0660On.X("span.duration");
            int iR = (c3176wpX5 == null || (strZ = c3176wpX5.Z()) == null) ? 0 : r(strZ);
            C1233cq c1233cq = C1233cq.l;
            return new C1387eR(str2, str4, strD3, null, new Integer(iR), null, "HD", null, r20, null, c1233cq, c1233cq, c1233cq, c1233cq, null, 16896);
        } catch (Exception e2) {
            e2.getMessage();
            throw e2;
        }
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        throw new UnsupportedOperationException("Episodes not supported");
    }

    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        throw new UnsupportedOperationException("TV Shows not supported");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C2234n3 c2234n3;
        C2525q3 c2525q3;
        if (interfaceC0473Hh instanceof C2234n3) {
            c2234n3 = (C2234n3) interfaceC0473Hh;
            int i = c2234n3.f929o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2234n3.f929o = i - Integer.MIN_VALUE;
            } else {
                c2234n3 = new C2234n3(this, interfaceC0473Hh);
            }
        } else {
            c2234n3 = new C2234n3(this, interfaceC0473Hh);
        }
        C2234n3 c2234n4 = c2234n3;
        Object objC = c2234n4.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2234n4.f929o;
        if (i2 == 0) {
            Jp0.O(objC);
            Objects.toString(video$Type);
            System.out.getClass();
            if (!(video$Type instanceof Is0)) {
                if (video$Type instanceof Hs0) {
                    throw new UnsupportedOperationException("Episodes not supported");
                }
                throw new C0730Rf();
            }
            c2234n4.l = this;
            c2234n4.f929o = 1;
            InterfaceC0473Hh interfaceC0473Hh2 = null;
            objC = C0856Wb.a.c("xAdultos detalle", false, new C1552g3(str, 0, interfaceC0473Hh2), new C1552g3(str, 1, interfaceC0473Hh2), c2234n4);
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
            c2525q3 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2525q3 = c2234n4.l;
            Jp0.O(objC);
        }
        C0660On c0660On = (C0660On) objC;
        Objects.toString(c0660On);
        System.out.getClass();
        String strR = c0660On.R();
        AbstractC1474fG.i(strR, "toString(...)");
        c2525q3.getClass();
        String strQ = q(strR);
        if (strQ == null) {
            strQ = "";
        }
        Ds0 ds0 = new Ds0("main", "Main Server", strQ, null, 56);
        ds0.toString();
        return AbstractC2506pt.A(ds0);
    }

    @Override // o.Q30
    public final String f() {
        return "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ73c4ycr-AagSUOsLtu6KMOl3RG1u3VzftIgDC8DXRFr7PoByst5R4Ucd0binO1mZ9p7o&usqp=CAU";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new C1942k3(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "xADULTOS";
    }

    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        throw new UnsupportedOperationException("Genres not supported");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C2137m3 c2137m3;
        String strD;
        String strZ;
        String strD2;
        if (interfaceC0473Hh instanceof C2137m3) {
            c2137m3 = (C2137m3) interfaceC0473Hh;
            int i2 = c2137m3.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2137m3.n = i2 - Integer.MIN_VALUE;
            } else {
                c2137m3 = new C2137m3(this, interfaceC0473Hh);
            }
        } else {
            c2137m3 = new C2137m3(this, interfaceC0473Hh);
        }
        C2137m3 c2137m4 = c2137m3;
        Object objC = c2137m4.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2137m4.n;
        InterfaceC0473Hh interfaceC0473Hh2 = null;
        if (i3 == 0) {
            Jp0.O(objC);
            c2137m4.n = 1;
            objC = C0856Wb.a.c("xAdultos página", false, new C1650h3(i, interfaceC0473Hh2, 0), new C1650h3(i, interfaceC0473Hh2, 1), c2137m4);
            if (objC == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objC);
        }
        C0660On c0660On = (C0660On) objC;
        Objects.toString(c0660On);
        C3370yp<C3176wp> c3370ypW = c0660On.W("div.thumb-block");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(c3370ypW, 10));
        for (C3176wp c3176wp : c3370ypW) {
            C3176wp c3176wpX = c3176wp.X("a");
            String strL0 = (c3176wpX == null || (strD2 = c3176wpX.d("href")) == null) ? "" : AbstractC1119bh0.l0(strD2, "/");
            C3176wp c3176wpX2 = c3176wp.X("p.title a");
            String strZ2 = c3176wpX2 != null ? c3176wpX2.Z() : null;
            String str = strZ2 == null ? "" : strZ2;
            C3176wp c3176wpX3 = c3176wp.X("p.title a");
            String strD3 = c3176wpX3 != null ? c3176wpX3.d("title") : null;
            C3176wp c3176wpX4 = c3176wp.X("span.duration");
            int iR = (c3176wpX4 == null || (strZ = c3176wpX4.Z()) == null) ? 0 : r(strZ);
            C3176wp c3176wpX5 = c3176wp.X("span.quality");
            String strZ3 = c3176wpX5 != null ? c3176wpX5.Z() : null;
            if (strZ3 == null) {
                strZ3 = "HD";
            }
            String str2 = strZ3;
            C3176wp c3176wpX6 = c3176wp.X("img");
            String strS = (c3176wpX6 == null || (strD = c3176wpX6.d("data-src")) == null) ? null : s(strD);
            C1233cq c1233cq = C1233cq.l;
            arrayList.add(new C1387eR(strL0, str, strD3, null, new Integer(iR), null, str2, null, strS, null, c1233cq, c1233cq, c1233cq, c1233cq, null, 16896));
        }
        arrayList.size();
        return arrayList;
    }

    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        throw new UnsupportedOperationException("TV Shows not supported");
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        throw new UnsupportedOperationException("People not supported");
    }

    @Override // o.Q30
    public final boolean l() {
        return false;
    }

    @Override // o.Q30
    public final String m() {
        return "en";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C2331o3 c2331o3;
        if (interfaceC0473Hh instanceof C2331o3) {
            c2331o3 = (C2331o3) interfaceC0473Hh;
            int i = c2331o3.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2331o3.n = i - Integer.MIN_VALUE;
            } else {
                c2331o3 = new C2331o3(this, interfaceC0473Hh);
            }
        } else {
            c2331o3 = new C2331o3(this, interfaceC0473Hh);
        }
        Object objA = c2331o3.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2331o3.n;
        try {
            if (i2 == 0) {
                Jp0.O(objA);
                String str = ds0.l;
                System.out.getClass();
                String str2 = ds0.n;
                C1292dT c1292dT = new C1292dT(10);
                c2331o3.n = 1;
                objA = c1292dT.a(str2, c2331o3);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objA);
            }
            Js0 js0 = (Js0) objA;
            Objects.toString(js0);
            System.out.getClass();
            return js0;
        } catch (Exception e2) {
            e2.getMessage();
            System.out.getClass();
            throw e2;
        }
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }
}
