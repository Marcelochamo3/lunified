package o;

import com.skidush.clonex.models.Video$Type;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.Od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0650Od implements Q30 {
    public static final C0650Od b = new C0650Od();
    public static final InterfaceC3346yd c;
    public static final List d;

    static {
        NV nvH = AbstractC1370eA.h();
        nvH.h = true;
        nvH.i = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvH.e(20L, timeUnit);
        nvH.i(30L, timeUnit);
        nvH.c.add(new C2480pg(3));
        OV ov = new OV(nvH);
        C1583gR c1583gRK = AbstractC1370eA.k();
        c1583gRK.f("https://www.cinecalidad.am/");
        ((ArrayList) c1583gRK.f793o).add(new P9(1));
        c1583gRK.m = ov;
        c = (InterfaceC3346yd) c1583gRK.m().b(InterfaceC3346yd.class);
        C1233cq c1233cq = C1233cq.l;
        d = AbstractC0937Ze.K(new C2420oz("genero-de-la-pelicula/accion", "Acción", c1233cq), new C2420oz("genero-de-la-pelicula/animacion", "Animación", c1233cq), new C2420oz("genero-de-la-pelicula/anime", "Anime", c1233cq), new C2420oz("genero-de-la-pelicula/aventura", "Aventura", c1233cq), new C2420oz("genero-de-la-pelicula/belica", "Bélico", c1233cq), new C2420oz("genero-de-la-pelicula/ciencia-ficcion", "Ciencia ficción", c1233cq), new C2420oz("genero-de-la-pelicula/crimen", "Crimen", c1233cq), new C2420oz("genero-de-la-pelicula/comedia", "Comedia", c1233cq), new C2420oz("genero-de-la-pelicula/documental", "Documental", c1233cq), new C2420oz("genero-de-la-pelicula/drama", "Drama", c1233cq), new C2420oz("genero-de-la-pelicula/familia", "Familiar", c1233cq), new C2420oz("genero-de-la-pelicula/fantasia", "Fantasía", c1233cq), new C2420oz("genero-de-la-pelicula/historia", "Historia", c1233cq), new C2420oz("genero-de-la-pelicula/musica", "Música", c1233cq), new C2420oz("genero-de-la-pelicula/misterio", "Misterio", c1233cq), new C2420oz("genero-de-la-pelicula/terror", "Terror", c1233cq), new C2420oz("genero-de-la-pelicula/suspense", "Suspenso", c1233cq), new C2420oz("genero-de-la-pelicula/romance", "Romance", c1233cq), new C2420oz("genero-de-la-pelicula/peliculas-de-dc-comics-online-cinecalidad", "DC Comics", c1233cq), new C2420oz("genero-de-la-pelicula/universo-marvel", "Marvel", c1233cq));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x005e  */
    /* JADX WARN: Code duplicated, block: B:18:0x0063  */
    /* JADX WARN: Code duplicated, block: B:22:0x001d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[LOOP:0: B:13:0x002e->B:26:?, LOOP_END, SYNTHETIC] */
    public static String p(C0660On c0660On) {
        JN jnA;
        String strC;
        C3176wp c3176wpX = c0660On.X("#playeroptionsul li.dooplay_player_option_trailer[data-option]");
        if (c3176wpX == null || (strC = c3176wpX.d("data-option")) == null) {
            C3370yp<C3176wp> c3370ypW = c0660On.W("script");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            for (C3176wp c3176wp : c3370ypW) {
                Pattern patternCompile = Pattern.compile("https?://(?:www\\.)?(?:youtube\\.com|youtu\\.be)/[^'\\\"\\s]+");
                AbstractC1474fG.i(patternCompile, "compile(...)");
                String strM = c3176wp.M();
                AbstractC1474fG.i(strM, "data(...)");
                Matcher matcher = patternCompile.matcher(strM);
                AbstractC1474fG.i(matcher, "matcher(...)");
                jnA = AbstractC1370eA.a(matcher, 0, strM);
                if (jnA != null) {
                    strC = jnA.c();
                } else {
                    strC = null;
                }
                if (strC != null) {
                }
            }
            return null;
        }
        if (!(!AbstractC1899jh0.O(strC))) {
            strC = null;
        }
        if (strC == null) {
            C3370yp<C3176wp> c3370ypW2 = c0660On.W("script");
            AbstractC1474fG.i(c3370ypW2, "select(...)");
            while (r4.hasNext()) {
                Pattern patternCompile2 = Pattern.compile("https?://(?:www\\.)?(?:youtube\\.com|youtu\\.be)/[^'\\\"\\s]+");
                AbstractC1474fG.i(patternCompile2, "compile(...)");
                String strM2 = c3176wp.M();
                AbstractC1474fG.i(strM2, "data(...)");
                Matcher matcher2 = patternCompile2.matcher(strM2);
                AbstractC1474fG.i(matcher2, "matcher(...)");
                jnA = AbstractC1370eA.a(matcher2, 0, strM2);
                if (jnA != null) {
                    strC = jnA.c();
                } else {
                    strC = null;
                }
                if (strC != null) {
                }
            }
            return null;
        }
        return strC;
    }

    public static String r(String str) {
        String string = str != null ? AbstractC1119bh0.E0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (AbstractC1899jh0.O(string)) {
            return null;
        }
        if (AbstractC1899jh0.U(string, "http://", false) || AbstractC1899jh0.U(string, "https://", false)) {
            return string;
        }
        return AbstractC1899jh0.U(string, "//", false) ? "https:".concat(string) : new URL(new URL("https://www.cinecalidad.am/"), string).toString();
    }

    public static String s(int i, String str) {
        if (i <= 1) {
            return str;
        }
        return AbstractC1119bh0.G0(str, '/') + "/page/" + i + "/";
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e5  */
    public static C3443zd t(C0660On c0660On) {
        ArrayList arrayList;
        ArrayList arrayList2;
        String strD;
        String string;
        String strZ;
        String string2;
        C3370yp c3370ypW;
        Object next;
        String strZ2;
        char c2;
        String strZ3;
        C3370yp<C3176wp> c3370ypW2;
        C3370yp<C3176wp> c3370ypW3;
        C3176wp c3176wpX = c0660On.X(".single_left td[style*=justify]");
        C3176wp c3176wpX2 = c3176wpX != null ? c3176wpX.X("p:has(span:contains(Género))") : null;
        C1233cq c1233cq = C1233cq.l;
        if (c3176wpX2 == null || (c3370ypW3 = c3176wpX2.W("span:contains(Género) a[href]")) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(AbstractC1016af.O(c3370ypW3, 10));
            for (C3176wp c3176wp : c3370ypW3) {
                String strR = r(c3176wp.d("href"));
                if (strR == null) {
                    strR = "";
                }
                String strZ4 = c3176wp.Z();
                AbstractC1474fG.i(strZ4, "text(...)");
                arrayList.add(new C2420oz(strR, AbstractC1119bh0.E0(strZ4).toString(), c1233cq));
            }
        }
        List list = arrayList == null ? c1233cq : arrayList;
        if (c3176wpX2 == null || (c3370ypW2 = c3176wpX2.W("span:contains(Elenco) a[href]")) == null) {
            arrayList2 = null;
        } else {
            arrayList2 = new ArrayList(AbstractC1016af.O(c3370ypW2, 10));
            for (C3176wp c3176wp2 : c3370ypW2) {
                String strR2 = r(c3176wp2.d("href"));
                String str = strR2 == null ? "" : strR2;
                String strZ5 = c3176wp2.Z();
                AbstractC1474fG.i(strZ5, "text(...)");
                arrayList2.add(new C1688hY(str, AbstractC1119bh0.E0(strZ5).toString(), null, null, 12));
            }
        }
        List list2 = arrayList2 == null ? c1233cq : arrayList2;
        C3176wp c3176wpX3 = c0660On.X(".single_left table img");
        if (c3176wpX3 == null || (strD = c3176wpX3.d("data-src")) == null) {
            strD = null;
        } else if (AbstractC1899jh0.O(strD)) {
            C3176wp c3176wpX4 = c0660On.X(".single_left table img");
            if (c3176wpX4 != null) {
                strD = c3176wpX4.d("src");
            } else {
                strD = null;
            }
        }
        String strR3 = r(strD);
        C3176wp c3176wpX5 = c0660On.X(".single_left h1, h1");
        String string3 = (c3176wpX5 == null || (strZ3 = c3176wpX5.Z()) == null) ? null : AbstractC1119bh0.E0(strZ3).toString();
        String str2 = string3 == null ? "" : string3;
        if (c3176wpX == null || (c3370ypW = c3176wpX.W("p")) == null) {
            string = null;
        } else {
            Iterator it = c3370ypW.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                C3176wp c3176wp3 = (C3176wp) next;
                c3176wp3.getClass();
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                AbstractC1099bV abstractC1099bVJ = c3176wp3;
                int i = 0;
                while (abstractC1099bVJ != null) {
                    char c3 = 1;
                    if (!(abstractC1099bVJ instanceof Qi0) || AbstractC1021ah0.e(((Qi0) abstractC1099bVJ).I())) {
                        c2 = 1;
                    } else {
                        atomicBoolean.set(true);
                        c2 = 5;
                    }
                    if (c2 == 5) {
                        break;
                    }
                    if (c2 != 1 || abstractC1099bVJ.k() <= 0) {
                        while (abstractC1099bVJ.v() == null && i > 0) {
                            if (c2 == 1 || c2 == 2) {
                                c2 = 1;
                            }
                            AbstractC1099bV abstractC1099bV = abstractC1099bVJ.l;
                            i--;
                            if (c2 == 4) {
                                abstractC1099bVJ.E();
                            }
                            abstractC1099bVJ = abstractC1099bV;
                            c2 = 1;
                        }
                        if (c2 != 1 && c2 != 2) {
                            c3 = c2;
                        }
                        if (abstractC1099bVJ == c3176wp3) {
                            break;
                        }
                        AbstractC1099bV abstractC1099bVV = abstractC1099bVJ.v();
                        if (c3 == 4) {
                            abstractC1099bVJ.E();
                        }
                        abstractC1099bVJ = abstractC1099bVV;
                    } else {
                        abstractC1099bVJ = abstractC1099bVJ.j(0);
                        i++;
                    }
                }
                if (atomicBoolean.get() && c3176wp3.X("span") == null) {
                    break;
                }
            }
            C3176wp c3176wp4 = (C3176wp) next;
            if (c3176wp4 == null || (strZ2 = c3176wp4.Z()) == null) {
                string = null;
            } else {
                string = AbstractC1119bh0.E0(strZ2).toString();
            }
        }
        C3176wp c3176wpX6 = c0660On.X("span:contains(TMDB) b");
        Double dI = (c3176wpX6 == null || (strZ = c3176wpX6.Z()) == null || (string2 = AbstractC1119bh0.E0(strZ).toString()) == null) ? null : AbstractC1705hh0.I(string2);
        C3176wp c3176wpX7 = c0660On.X("meta[property=og:image]");
        String strR4 = r(c3176wpX7 != null ? c3176wpX7.d("content") : null);
        return new C3443zd(str2, string, dI, strR3, strR4 == null ? strR3 : strR4, list, list2);
    }

    public static ArrayList u(C3370yp c3370yp) {
        String strR;
        String strD;
        String strZ;
        String strD2;
        ArrayList arrayList = new ArrayList();
        Iterator it = c3370yp.iterator();
        while (it.hasNext()) {
            C3176wp c3176wp = (C3176wp) it.next();
            C3176wp c3176wpX = c3176wp.X("a[href]");
            Cd0 c2109lo0 = null;
            if (c3176wpX != null && (strR = r(c3176wpX.d("href"))) != null) {
                C3176wp c3176wpX2 = c3176wp.X("div.poster img, img");
                String string = (c3176wpX2 == null || (strD2 = c3176wpX2.d("alt")) == null) ? null : AbstractC1119bh0.E0(strD2).toString();
                String str = "";
                if (string == null) {
                    string = "";
                }
                if (AbstractC1899jh0.O(string)) {
                    C3176wp c3176wpX3 = c3176wp.X("h3, .data h3");
                    String string2 = (c3176wpX3 == null || (strZ = c3176wpX3.Z()) == null) ? null : AbstractC1119bh0.E0(strZ).toString();
                    if (string2 != null) {
                        str = string2;
                    }
                } else {
                    str = string;
                }
                if (!AbstractC1899jh0.O(str)) {
                    if (c3176wpX2 == null || (strD = c3176wpX2.d("data-src")) == null) {
                        strD = null;
                    } else if (AbstractC1899jh0.O(strD)) {
                        strD = c3176wpX2.d("src");
                    }
                    String strR2 = r(strD);
                    if (AbstractC1119bh0.W(strR, "/ver-pelicula/", false)) {
                        c2109lo0 = new C1387eR(strR, str, null, null, null, null, null, null, strR2, null, null, null, null, null, null, 32508);
                    } else if (AbstractC1119bh0.W(strR, "/ver-serie/", false)) {
                        c2109lo0 = new C2109lo0(strR, str, null, null, null, null, null, null, strR2, null, null, null, null, null, null, null, 65276);
                    }
                }
            }
            if (c2109lo0 != null) {
                arrayList.add(c2109lo0);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(v((Cd0) obj))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static String v(Cd0 cd0) {
        String str;
        String str2;
        if (cd0 instanceof C1387eR) {
            str = ((C1387eR) cd0).a;
            str2 = "movie:";
        } else {
            if (!(cd0 instanceof C2109lo0)) {
                throw new C0730Rf();
            }
            str = ((C2109lo0) cd0).a;
            str2 = "tv:";
        }
        return AbstractC1701hf0.t(str2, str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws UnsupportedEncodingException {
        C0624Nd c0624Nd;
        String strConcat;
        ArrayList arrayListU;
        if (interfaceC0473Hh instanceof C0624Nd) {
            c0624Nd = (C0624Nd) interfaceC0473Hh;
            int i2 = c0624Nd.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0624Nd.n = i2 - Integer.MIN_VALUE;
            } else {
                c0624Nd = new C0624Nd(this, interfaceC0473Hh);
            }
        } else {
            c0624Nd = new C0624Nd(this, interfaceC0473Hh);
        }
        Object objQ = c0624Nd.l;
        Object obj = EnumC1706hi.l;
        int i3 = c0624Nd.n;
        if (i3 == 0) {
            Jp0.O(objQ);
            if (AbstractC1899jh0.O(str)) {
                return d;
            }
            String strEncode = URLEncoder.encode(AbstractC1119bh0.E0(str).toString(), "UTF-8");
            AbstractC1474fG.i(strEncode, "encode(...)");
            String strR = AbstractC1899jh0.R(strEncode, "+", "%20", false);
            if (i <= 1) {
                strConcat = "https://www.cinecalidad.am/?s=".concat(strR);
            } else {
                strConcat = "https://www.cinecalidad.am/page/" + i + "/?s=" + strR;
            }
            c0624Nd.n = 1;
            objQ = q(strConcat, c0624Nd);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objQ);
        }
        C0660On c0660On = (C0660On) objQ;
        if (c0660On != null) {
            C3370yp c3370ypW = c0660On.W("article.item[id^=post-]");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            arrayListU = u(c3370ypW);
        } else {
            arrayListU = null;
        }
        return arrayListU == null ? C1233cq.l : arrayListU;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C0469Hd c0469Hd;
        String str2;
        C0650Od c0650Od;
        if (interfaceC0473Hh instanceof C0469Hd) {
            c0469Hd = (C0469Hd) interfaceC0473Hh;
            int i = c0469Hd.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0469Hd.p = i - Integer.MIN_VALUE;
            } else {
                c0469Hd = new C0469Hd(this, interfaceC0473Hh);
            }
        } else {
            c0469Hd = new C0469Hd(this, interfaceC0473Hh);
        }
        Object obj = c0469Hd.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0469Hd.p;
        if (i2 == 0) {
            Jp0.O(obj);
            String strR = r(str);
            if (strR == null) {
                throw new IllegalArgumentException(AbstractC1701hf0.t("URL de CineCalidad inválida: ", str).toString());
            }
            c0469Hd.l = this;
            c0469Hd.m = strR;
            c0469Hd.p = 1;
            Object objA = c.a(strR, c0469Hd);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strR;
            obj = objA;
            c0650Od = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = c0469Hd.m;
            c0650Od = c0469Hd.l;
            Jp0.O(obj);
            str2 = str3;
        }
        C0660On c0660On = (C0660On) obj;
        c0650Od.getClass();
        C3443zd c3443zdT = t(c0660On);
        return new C1387eR(str2, c3443zdT.a, c3443zdT.b, null, null, p(c0660On), null, c3443zdT.c, c3443zdT.d, c3443zdT.e, c3443zdT.f, null, c3443zdT.g, null, null, 26712);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        C0313Bd c0313Bd;
        int iIntValue;
        String str3;
        Integer numJ;
        String strR;
        String strD;
        if (interfaceC0473Hh instanceof C0313Bd) {
            c0313Bd = (C0313Bd) interfaceC0473Hh;
            int i = c0313Bd.f187o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0313Bd.f187o = i - Integer.MIN_VALUE;
            } else {
                c0313Bd = new C0313Bd(this, interfaceC0473Hh);
            }
        } else {
            c0313Bd = new C0313Bd(this, interfaceC0473Hh);
        }
        Object objA = c0313Bd.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0313Bd.f187o;
        if (i2 == 0) {
            Jp0.O(objA);
            int iG0 = AbstractC1119bh0.g0(str, '|', 0, 6);
            C1233cq c1233cq = C1233cq.l;
            if (iG0 < 1) {
                return c1233cq;
            }
            String strSubstring = str.substring(0, iG0);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            String strSubstring2 = str.substring(iG0 + 1);
            AbstractC1474fG.i(strSubstring2, "substring(...)");
            Integer numJ2 = AbstractC1802ih0.J(strSubstring2);
            if (numJ2 == null) {
                return c1233cq;
            }
            iIntValue = numJ2.intValue();
            c0313Bd.l = iIntValue;
            c0313Bd.f187o = 1;
            objA = c.a(strSubstring, c0313Bd);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iIntValue = c0313Bd.l;
            Jp0.O(objA);
        }
        C3370yp<C3176wp> c3370ypW = ((C0660On) objA).W(".mark-1");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp : c3370ypW) {
            C3176wp c3176wpX = c3176wp.X(".numerando");
            C0456Gq c0456Gq = null;
            strD = null;
            strD = null;
            String strD2 = null;
            c0456Gq = null;
            c0456Gq = null;
            c0456Gq = null;
            c0456Gq = null;
            c0456Gq = null;
            String strZ = c3176wpX != null ? c3176wpX.Z() : null;
            if (strZ == null) {
                strZ = "";
            }
            if (AbstractC1899jh0.U(strZ, "S" + iIntValue + "-", true)) {
                Pattern patternCompile = Pattern.compile("-E(\\d+)", C3325yL.p(2));
                AbstractC1474fG.i(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(strZ);
                AbstractC1474fG.i(matcher, "matcher(...)");
                JN jnA = AbstractC1370eA.a(matcher, 0, strZ);
                if (jnA != null && (str3 = (String) AbstractC0911Ye.e0(1, jnA.a())) != null && (numJ = AbstractC1802ih0.J(str3)) != null) {
                    int iIntValue2 = numJ.intValue();
                    C3176wp c3176wpX2 = c3176wp.X(".episodiotitle a[href]");
                    if (c3176wpX2 != null && (strR = r(c3176wpX2.d("href"))) != null) {
                        String strZ2 = c3176wpX2.Z();
                        AbstractC1474fG.i(strZ2, "text(...)");
                        String string = AbstractC1119bh0.E0(strZ2).toString();
                        if (AbstractC1899jh0.O(string)) {
                            string = AbstractC1674hK.n(iIntValue2, "Episodio ");
                        }
                        String str4 = string;
                        C3176wp c3176wpX3 = c3176wp.X("div.imagen img");
                        if (c3176wpX3 != null && (strD = c3176wpX3.d("data-src")) != null) {
                            if (AbstractC1899jh0.O(strD)) {
                                C3176wp c3176wpX4 = c3176wp.X("div.imagen img");
                                if (c3176wpX4 != null) {
                                    strD2 = c3176wpX4.d("src");
                                }
                            } else {
                                strD2 = strD;
                            }
                        }
                        c0456Gq = new C0456Gq(strR, iIntValue2, str4, null, r(strD2), null, null, 104);
                    }
                }
            }
            if (c0456Gq != null) {
                arrayList.add(c0456Gq);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((C0456Gq) obj).a)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC0911Ye.r0(arrayList2, new N2(3));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C0598Md c0598Md;
        C0650Od c0650Od;
        if (interfaceC0473Hh instanceof C0598Md) {
            c0598Md = (C0598Md) interfaceC0473Hh;
            int i2 = c0598Md.f397o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0598Md.f397o = i2 - Integer.MIN_VALUE;
            } else {
                c0598Md = new C0598Md(this, interfaceC0473Hh);
            }
        } else {
            c0598Md = new C0598Md(this, interfaceC0473Hh);
        }
        Object objQ = c0598Md.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0598Md.f397o;
        if (i3 == 0) {
            Jp0.O(objQ);
            String strS = s(i, "https://www.cinecalidad.am/ver-serie/");
            c0598Md.l = this;
            c0598Md.f397o = 1;
            objQ = q(strS, c0598Md);
            if (objQ == enumC1706hi) {
                return enumC1706hi;
            }
            c0650Od = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0650Od = c0598Md.l;
            Jp0.O(objQ);
        }
        C0660On c0660On = (C0660On) objQ;
        if (c0660On == null) {
            return C1233cq.l;
        }
        C3370yp c3370ypW = c0660On.W("article.item[id^=post-]");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        c0650Od.getClass();
        ArrayList arrayListU = u(c3370ypW);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListU) {
            if (obj instanceof C2109lo0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) {
        C0547Kd c0547Kd;
        if (interfaceC0473Hh instanceof C0547Kd) {
            c0547Kd = (C0547Kd) interfaceC0473Hh;
            int i = c0547Kd.f366o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0547Kd.f366o = i - Integer.MIN_VALUE;
            } else {
                c0547Kd = new C0547Kd(this, interfaceC0473Hh);
            }
        } else {
            c0547Kd = new C0547Kd(this, interfaceC0473Hh);
        }
        Object objQ = c0547Kd.m;
        Object obj = EnumC1706hi.l;
        int i2 = c0547Kd.f366o;
        C1233cq c1233cq = C1233cq.l;
        if (i2 == 0) {
            Jp0.O(objQ);
            String strR = r(str);
            if (strR == null) {
                return c1233cq;
            }
            c0547Kd.l = str;
            c0547Kd.f366o = 1;
            objQ = q(strR, c0547Kd);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c0547Kd.l;
            Jp0.O(objQ);
        }
        C0660On c0660On = (C0660On) objQ;
        if (c0660On == null) {
            return c1233cq;
        }
        C3370yp c3370ypW = c0660On.W("#playeroptionsul li[data-option]");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : c3370ypW) {
            C3176wp c3176wp = (C3176wp) obj2;
            if (!c3176wp.Q("dooplay_player_option_trailer") && !AbstractC1119bh0.W(c3176wp.S(), "trailer", true)) {
                String strU = c3176wp.U();
                AbstractC1474fG.i(strU, "ownText(...)");
                if (!AbstractC1119bh0.W(strU, "trailer", true)) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (Object obj3 : arrayList) {
            int i4 = i3 + 1;
            Ds0 ds0 = null;
            if (i3 < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            C3176wp c3176wp2 = (C3176wp) obj3;
            String strR2 = r(c3176wp2.d("data-option"));
            if (strR2 != null && AbstractC1899jh0.U(strR2, "http", false)) {
                String strU2 = c3176wp2.U();
                AbstractC1474fG.i(strU2, "ownText(...)");
                String string = AbstractC1119bh0.E0(strU2).toString();
                if (AbstractC1899jh0.O(string)) {
                    string = AbstractC1674hK.n(i4, "Servidor ");
                }
                String strD = AbstractC1701hf0.d(string, " [LAT]");
                String strR3 = r(str);
                if (strR3 == null) {
                    strR3 = "";
                }
                ds0 = new Ds0(strR2, strD, strR2, AbstractC3327yN.y(new C1101bX("Referer", strR3)), 48);
            }
            if (ds0 != null) {
                arrayList2.add(ds0);
            }
            i3 = i4;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList2) {
            if (hashSet.add(((Ds0) obj4).l)) {
                arrayList3.add(obj4);
            }
        }
        return arrayList3;
    }

    @Override // o.Q30
    public final String f() {
        return "https://www.cinecalidad.am/wp-content/themes/Cinecalidad/assets/img/logo.png";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new C0443Gd(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "CineCalidad";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        C0339Cd c0339Cd;
        String str2;
        String str3;
        List listU;
        if (interfaceC0473Hh instanceof C0339Cd) {
            c0339Cd = (C0339Cd) interfaceC0473Hh;
            int i2 = c0339Cd.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0339Cd.p = i2 - Integer.MIN_VALUE;
            } else {
                c0339Cd = new C0339Cd(this, interfaceC0473Hh);
            }
        } else {
            c0339Cd = new C0339Cd(this, interfaceC0473Hh);
        }
        Object obj = c0339Cd.n;
        Object obj2 = EnumC1706hi.l;
        int i3 = c0339Cd.p;
        if (i3 == 0) {
            Jp0.O(obj);
            String strR = r(str);
            if (strR == null) {
                strR = "";
            }
            String strS = s(i, strR);
            c0339Cd.l = str;
            c0339Cd.m = strR;
            c0339Cd.p = 1;
            Object objQ = q(strS, c0339Cd);
            if (objQ == obj2) {
                return obj2;
            }
            str2 = str;
            str3 = strR;
            obj = objQ;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c0339Cd.m;
            str2 = c0339Cd.l;
            Jp0.O(obj);
        }
        C0660On c0660On = (C0660On) obj;
        String strG0 = AbstractC1119bh0.G0(str3, '/');
        String strS2 = AbstractC1899jh0.S(AbstractC1119bh0.y0(strG0, '/', strG0), '-', ' ');
        if (strS2.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(strS2.charAt(0));
            AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC1474fG.i(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String strSubstring = strS2.substring(1);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            sb.append(strSubstring);
            strS2 = sb.toString();
        }
        if (c0660On != null) {
            C3370yp c3370ypW = c0660On.W("article.item[id^=post-]");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            listU = u(c3370ypW);
        } else {
            listU = null;
        }
        if (listU == null) {
            listU = C1233cq.l;
        }
        return new C2420oz(str2, strS2, listU);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C0495Id c0495Id;
        C0650Od c0650Od;
        if (interfaceC0473Hh instanceof C0495Id) {
            c0495Id = (C0495Id) interfaceC0473Hh;
            int i2 = c0495Id.f326o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0495Id.f326o = i2 - Integer.MIN_VALUE;
            } else {
                c0495Id = new C0495Id(this, interfaceC0473Hh);
            }
        } else {
            c0495Id = new C0495Id(this, interfaceC0473Hh);
        }
        Object objQ = c0495Id.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c0495Id.f326o;
        if (i3 == 0) {
            Jp0.O(objQ);
            String strS = s(i, "https://www.cinecalidad.am");
            c0495Id.l = this;
            c0495Id.f326o = 1;
            objQ = q(strS, c0495Id);
            if (objQ == enumC1706hi) {
                return enumC1706hi;
            }
            c0650Od = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c0650Od = c0495Id.l;
            Jp0.O(objQ);
        }
        C0660On c0660On = (C0660On) objQ;
        if (c0660On == null) {
            return C1233cq.l;
        }
        C3370yp c3370ypW = c0660On.W("article.item[id^=post-]");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        c0650Od.getClass();
        ArrayList arrayListU = u(c3370ypW);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListU) {
            if (obj instanceof C1387eR) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C0573Ld c0573Ld;
        String str2;
        C0650Od c0650Od;
        String str3;
        if (interfaceC0473Hh instanceof C0573Ld) {
            c0573Ld = (C0573Ld) interfaceC0473Hh;
            int i = c0573Ld.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0573Ld.p = i - Integer.MIN_VALUE;
            } else {
                c0573Ld = new C0573Ld(this, interfaceC0473Hh);
            }
        } else {
            c0573Ld = new C0573Ld(this, interfaceC0473Hh);
        }
        Object obj = c0573Ld.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0573Ld.p;
        if (i2 == 0) {
            Jp0.O(obj);
            String strR = r(str);
            if (strR == null) {
                throw new IllegalArgumentException(AbstractC1701hf0.t("URL de CineCalidad inválida: ", str).toString());
            }
            c0573Ld.l = this;
            c0573Ld.m = strR;
            c0573Ld.p = 1;
            Object objA = c.a(strR, c0573Ld);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strR;
            obj = objA;
            c0650Od = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str4 = c0573Ld.m;
            c0650Od = c0573Ld.l;
            Jp0.O(obj);
            str2 = str4;
        }
        C0660On c0660On = (C0660On) obj;
        c0650Od.getClass();
        C3443zd c3443zdT = t(c0660On);
        C3370yp<C3176wp> c3370ypW = c0660On.W(".mark-1 .numerando");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp : c3370ypW) {
            Pattern patternCompile = Pattern.compile("S(\\d+)-", C3325yL.p(2));
            AbstractC1474fG.i(patternCompile, "compile(...)");
            String strZ = c3176wp.Z();
            AbstractC1474fG.i(strZ, "text(...)");
            Matcher matcher = patternCompile.matcher(strZ);
            AbstractC1474fG.i(matcher, "matcher(...)");
            JN jnA = AbstractC1370eA.a(matcher, 0, strZ);
            Integer numJ = (jnA == null || (str3 = (String) AbstractC0911Ye.e0(1, jnA.a())) == null) ? null : AbstractC1802ih0.J(str3);
            if (numJ != null) {
                arrayList.add(numJ);
            }
        }
        List listQ0 = AbstractC0911Ye.q0(AbstractC0911Ye.X(arrayList));
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(listQ0, 10));
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList2.add(new Ma0(str2 + "|" + iIntValue, iIntValue, AbstractC1674hK.n(iIntValue, "Temporada "), c3443zdT.d, null, null, 48));
        }
        return new C2109lo0(str2, c3443zdT.a, c3443zdT.b, null, null, p(c0660On), null, c3443zdT.c, c3443zdT.d, c3443zdT.e, null, arrayList2, c3443zdT.f, null, c3443zdT.g, null, 42072);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws UnsupportedEncodingException {
        C0521Jd c0521Jd;
        String str2;
        String str3;
        String str4;
        C3176wp c3176wpX;
        String strZ;
        String string;
        if (interfaceC0473Hh instanceof C0521Jd) {
            c0521Jd = (C0521Jd) interfaceC0473Hh;
            int i2 = c0521Jd.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0521Jd.p = i2 - Integer.MIN_VALUE;
            } else {
                c0521Jd = new C0521Jd(this, interfaceC0473Hh);
            }
        } else {
            c0521Jd = new C0521Jd(this, interfaceC0473Hh);
        }
        Object obj = c0521Jd.n;
        Object obj2 = EnumC1706hi.l;
        int i3 = c0521Jd.p;
        if (i3 == 0) {
            Jp0.O(obj);
            String strR = r(str);
            if (strR == null) {
                strR = "";
            }
            String strS = s(i, strR);
            c0521Jd.l = str;
            c0521Jd.m = strR;
            c0521Jd.p = 1;
            Object objQ = q(strS, c0521Jd);
            if (objQ == obj2) {
                return obj2;
            }
            str2 = str;
            str3 = strR;
            obj = objQ;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c0521Jd.m;
            String str5 = c0521Jd.l;
            Jp0.O(obj);
            str2 = str5;
        }
        C0660On c0660On = (C0660On) obj;
        String strG0 = AbstractC1119bh0.G0(str3, '/');
        String strDecode = URLDecoder.decode(AbstractC1119bh0.y0(strG0, '/', strG0), "UTF-8");
        AbstractC1474fG.i(strDecode, "decode(...)");
        String strS2 = AbstractC1899jh0.S(strDecode, '+', ' ');
        ArrayList arrayListU = null;
        if (c0660On == null || (c3176wpX = c0660On.X("h1 span, .single_left h1, h1")) == null || (strZ = c3176wpX.Z()) == null || (string = AbstractC1119bh0.E0(AbstractC1119bh0.w0(strZ, ':', strZ)).toString()) == null) {
            str4 = strS2;
        } else {
            if (AbstractC1899jh0.O(string)) {
                string = null;
            }
            if (string != null) {
                str4 = string;
            } else {
                str4 = strS2;
            }
        }
        if (c0660On != null) {
            C3370yp c3370ypW = c0660On.W("article.item[id^=post-]");
            AbstractC1474fG.i(c3370ypW, "select(...)");
            arrayListU = u(c3370ypW);
        }
        return new C1688hY(str2, str4, null, arrayListU == null ? C1233cq.l : arrayListU, 4);
    }

    @Override // o.Q30
    public final boolean l() {
        return true;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) {
        int i = AbstractC3473zs.a;
        String str = ds0.n;
        if (AbstractC1899jh0.O(str)) {
            str = ds0.l;
        }
        return C0622Nb.m(str, ds0, interfaceC0473Hh, 4);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C0287Ad c0287Ad;
        if (interfaceC0473Hh instanceof C0287Ad) {
            c0287Ad = (C0287Ad) interfaceC0473Hh;
            int i = c0287Ad.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0287Ad.n = i - Integer.MIN_VALUE;
            } else {
                c0287Ad = new C0287Ad(this, interfaceC0473Hh);
            }
        } else {
            c0287Ad = new C0287Ad(this, interfaceC0473Hh);
        }
        Object objA = c0287Ad.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0287Ad.n;
        try {
            if (i2 == 0) {
                Jp0.O(objA);
                InterfaceC3346yd interfaceC3346yd = c;
                c0287Ad.n = 1;
                objA = interfaceC3346yd.a(str, c0287Ad);
                if (objA == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objA);
            }
            return (C0660On) objA;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }
}
