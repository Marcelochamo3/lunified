package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.gY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1590gY implements Q30 {
    public static final C1590gY b = new C1590gY();
    public static final RX c;
    public static final Rh0 d;

    static {
        NV nvJ = AbstractC1370eA.j();
        nvJ.h = true;
        nvJ.i = true;
        ConcurrentHashMap concurrentHashMap = C0323Bn.a;
        C0323Bn.b(nvJ);
        nvJ.c.add(new C2480pg(13));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvJ.i(30L, timeUnit);
        nvJ.e(30L, timeUnit);
        OV ov = new OV(nvJ);
        C1583gR c1583gRK = AbstractC1370eA.k();
        c1583gRK.f("https://pelisplus.to");
        ((ArrayList) c1583gRK.f793o).add(new P9(1));
        c1583gRK.m = ov;
        c = (RX) c1583gRK.m().b(RX.class);
        d = new Rh0(C2428p3.M);
    }

    public static Object p(String str, InterfaceC0473Hh interfaceC0473Hh) {
        InterfaceC0473Hh interfaceC0473Hh2 = null;
        return C0856Wb.a.c("PelisPlus", false, new C1552g3(str, 2, interfaceC0473Hh2), new C1552g3(str, 3, interfaceC0473Hh2), interfaceC0473Hh);
    }

    public static String q(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        String strM0 = AbstractC1119bh0.m0(AbstractC1119bh0.l0(str, "background-image: url(\""), "\");");
        return AbstractC1899jh0.U(strM0, "http", false) ? strM0 : "https://pelisplus.to".concat(strM0);
    }

    public static ArrayList r(C0660On c0660On) {
        String strZ;
        C3370yp<C3176wp> c3370ypW = c0660On.W("article.item.liste.relative a.itemA");
        AbstractC1474fG.g(c3370ypW);
        ArrayList arrayList = new ArrayList();
        for (C3176wp c3176wp : c3370ypW) {
            String strD = c3176wp.d("href");
            C3176wp c3176wpX = c3176wp.X("img");
            Cd0 c2109lo0 = null;
            String strD2 = c3176wpX != null ? c3176wpX.d("data-src") : null;
            if (strD2 == null) {
                strD2 = "";
            }
            String str = strD2;
            C3176wp c3176wpX2 = c3176wp.X("h2");
            if (c3176wpX2 != null && (strZ = c3176wpX2.Z()) != null) {
                String strB0 = AbstractC1119bh0.B0(strZ, " (");
                AbstractC1474fG.g(strD);
                if (AbstractC1119bh0.W(strD, "/pelicula/", false)) {
                    c2109lo0 = new C1387eR(AbstractC1119bh0.m0(AbstractC1119bh0.x0(strD, "/pelicula/", strD), "/"), strB0, null, null, null, null, null, null, str, null, null, null, null, null, null, 32508);
                } else if (AbstractC1119bh0.W(strD, "/serie/", false)) {
                    c2109lo0 = new C2109lo0(AbstractC1119bh0.m0(AbstractC1119bh0.x0(strD, "/serie/", strD), "/"), strB0, null, null, null, null, null, null, str, null, null, null, null, null, null, null, 65276);
                } else if (AbstractC1119bh0.W(strD, "/anime/", false)) {
                    c2109lo0 = new C2109lo0("anime/".concat(AbstractC1119bh0.m0(AbstractC1119bh0.x0(strD, "/anime/", strD), "/")), strB0, null, null, null, null, null, null, str, null, null, null, null, null, null, null, 65276);
                }
            }
            if (c2109lo0 != null) {
                arrayList.add(c2109lo0);
            }
        }
        return arrayList;
    }

    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        boolean zO = AbstractC1899jh0.O(str);
        C1233cq c1233cq = C1233cq.l;
        if (zO) {
            return AbstractC0937Ze.K(new C2420oz("genero/accion", "Acción", c1233cq), new C2420oz("genero/animacion", "Animación", c1233cq), new C2420oz("genero/anime", "Anime", c1233cq), new C2420oz("genero/aventura", "Aventura", c1233cq), new C2420oz("genero/belica", "Bélica", c1233cq), new C2420oz("genero/ciencia-ficcion", "Ciencia ficción", c1233cq), new C2420oz("genero/comedia", "Comedia", c1233cq), new C2420oz("genero/crimen", "Crimen", c1233cq), new C2420oz("genero/documental", "Documental", c1233cq), new C2420oz("genero/drama", "Drama", c1233cq), new C2420oz("genero/familia", "Familia", c1233cq), new C2420oz("genero/fantasia", "Fantasía", c1233cq), new C2420oz("genero/guerra", "Guerra", c1233cq), new C2420oz("genero/historia", "Historia", c1233cq), new C2420oz("genero/misterio", "Misterio", c1233cq), new C2420oz("genero/musica", "Música", c1233cq), new C2420oz("genero/romance", "Romance", c1233cq), new C2420oz("genero/suspense", "Suspenso", c1233cq), new C2420oz("genero/terror", "Terror", c1233cq));
        }
        return i > 1 ? c1233cq : Pu0.t(str, new C1492fY(2, null), interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) {
        ZX zx;
        C1590gY c1590gY;
        Double dI;
        List list;
        C3370yp<C3176wp> c3370ypW;
        C3176wp c3176wpX;
        C3370yp c3370ypW2;
        Object next;
        String strZ;
        String string;
        String strZ2;
        String strZ3;
        String strD;
        String str2 = str;
        if (interfaceC0473Hh instanceof ZX) {
            zx = (ZX) interfaceC0473Hh;
            int i = zx.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                zx.p = i - Integer.MIN_VALUE;
            } else {
                zx = new ZX(this, interfaceC0473Hh);
            }
        } else {
            zx = new ZX(this, interfaceC0473Hh);
        }
        Object objP = zx.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = zx.p;
        if (i2 == 0) {
            Jp0.O(objP);
            zx.l = this;
            zx.m = str2;
            zx.p = 1;
            objP = p("https://pelisplus.to/pelicula/" + str2, zx);
            if (objP == enumC1706hi) {
                return enumC1706hi;
            }
            c1590gY = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = zx.m;
            c1590gY = zx.l;
            Jp0.O(objP);
        }
        String str3 = str2;
        C0660On c0660On = (C0660On) objP;
        C3176wp c3176wpX2 = c0660On.X("div.genres.rating");
        C3176wp c3176wpX3 = c0660On.X("meta[property=og:image]");
        Object obj = null;
        String strD2 = c3176wpX3 != null ? c3176wpX3.d("content") : null;
        C3176wp c3176wpX4 = c0660On.X("div.bg");
        String strN0 = (c3176wpX4 == null || (strD = c3176wpX4.d("style")) == null) ? null : AbstractC1119bh0.n0(AbstractC1119bh0.n0(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strD, "url(", strD), ")"), "'"), "\"");
        C3176wp c3176wpX5 = c0660On.X("h1.slugh1");
        String strB0 = (c3176wpX5 == null || (strZ3 = c3176wpX5.Z()) == null) ? "" : AbstractC1119bh0.B0(strZ3, " (");
        C3176wp c3176wpX6 = c0660On.X("div.description p");
        String strZ4 = c3176wpX6 != null ? c3176wpX6.Z() : null;
        c1590gY.getClass();
        String strQ = q(strD2);
        String strQ2 = q(strN0);
        if (c3176wpX2 == null || (c3370ypW2 = c3176wpX2.W("span")) == null) {
            dI = null;
        } else {
            Iterator it = c3370ypW2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                strZ2 = ((C3176wp) next).Z();
                AbstractC1474fG.i(strZ2, "text(...)");
            } while (!AbstractC1119bh0.W(strZ2, "Rating:", false));
            C3176wp c3176wp = (C3176wp) next;
            if (c3176wp == null || (strZ = c3176wp.Z()) == null || (string = AbstractC1119bh0.E0(AbstractC1119bh0.x0(strZ, ":", strZ)).toString()) == null) {
                dI = null;
            } else {
                dI = AbstractC1705hh0.I(string);
            }
        }
        String strZ5 = (c3176wpX2 == null || (c3176wpX = c3176wpX2.X("a")) == null) ? null : c3176wpX.Z();
        C3370yp c3370ypW3 = c0660On.W("div.genres");
        AbstractC1474fG.i(c3370ypW3, "select(...)");
        for (Object obj2 : c3370ypW3) {
            C3176wp c3176wpX7 = ((C3176wp) obj2).X("span b");
            if (AbstractC1474fG.b(c3176wpX7 != null ? c3176wpX7.Z() : null, "Generos")) {
                obj = obj2;
                break;
            }
        }
        C3176wp c3176wp2 = (C3176wp) obj;
        C1233cq c1233cq = C1233cq.l;
        if (c3176wp2 == null || (c3370ypW = c3176wp2.W("a")) == null) {
            list = c1233cq;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(c3370ypW, 10));
            for (C3176wp c3176wp3 : c3370ypW) {
                String strD3 = c3176wp3.d("href");
                AbstractC1474fG.i(strD3, "attr(...)");
                String strZ6 = c3176wp3.Z();
                AbstractC1474fG.i(strZ6, "text(...)");
                arrayList.add(new C2420oz(strD3, strZ6, c1233cq));
            }
            list = arrayList;
        }
        return new C1387eR(str3, strB0, strZ4, strZ5, null, null, null, dI, strQ, strQ2, list, null, null, null, null, 30832);
    }

    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new SX(str, null), interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C1297dY c1297dY;
        C1590gY c1590gY;
        if (interfaceC0473Hh instanceof C1297dY) {
            c1297dY = (C1297dY) interfaceC0473Hh;
            int i2 = c1297dY.f737o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1297dY.f737o = i2 - Integer.MIN_VALUE;
            } else {
                c1297dY = new C1297dY(this, interfaceC0473Hh);
            }
        } else {
            c1297dY = new C1297dY(this, interfaceC0473Hh);
        }
        Object objP = c1297dY.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c1297dY.f737o;
        if (i3 == 0) {
            Jp0.O(objP);
            String strN = i == 1 ? "https://pelisplus.to/series" : AbstractC1674hK.n(i, "https://pelisplus.to/series/");
            c1297dY.l = this;
            c1297dY.f737o = 1;
            objP = p(strN, c1297dY);
            if (objP == enumC1706hi) {
                return enumC1706hi;
            }
            c1590gY = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1590gY = c1297dY.l;
            Jp0.O(objP);
        }
        c1590gY.getClass();
        ArrayList arrayListR = r((C0660On) objP);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (obj instanceof C2109lo0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:101:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e1 A[Catch: Exception -> 0x0343, TRY_LEAVE, TryCatch #36 {Exception -> 0x0343, blocks: (B:104:0x02db, B:106:0x02e1), top: B:375:0x02db }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0338  */
    /* JADX WARN: Code duplicated, block: B:161:0x03ac  */
    /* JADX WARN: Code duplicated, block: B:165:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:166:0x03c9 A[Catch: Exception -> 0x03da, TRY_LEAVE, TryCatch #12 {Exception -> 0x03da, blocks: (B:163:0x03c2, B:166:0x03c9), top: B:327:0x03c2 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x0406 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:177:0x0407  */
    /* JADX WARN: Code duplicated, block: B:327:0x03c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:382:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x01f9 A[Catch: Exception -> 0x008d, TRY_LEAVE, TryCatch #28 {Exception -> 0x008d, blocks: (B:21:0x006d, B:182:0x044c, B:184:0x0452, B:290:0x0607, B:289:0x0603, B:295:0x062c, B:32:0x00fb, B:58:0x01f3, B:60:0x01f9, B:174:0x03ea, B:173:0x03e6, B:179:0x041f, B:181:0x043c, B:40:0x0174, B:57:0x01dc, B:53:0x01cf), top: B:359:0x0052 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0205 A[Catch: Exception -> 0x0237, TRY_LEAVE, TryCatch #7 {Exception -> 0x0237, blocks: (B:61:0x01ff, B:63:0x0205), top: B:317:0x01ff }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0234  */
    /* JADX WARN: Code duplicated, block: B:79:0x025c A[LOOP:1: B:58:0x01f3->B:79:0x025c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:85:0x027b A[Catch: Exception -> 0x039f, TRY_LEAVE, TryCatch #9 {Exception -> 0x039f, blocks: (B:83:0x026f, B:85:0x027b, B:89:0x0287, B:93:0x0292), top: B:321:0x026f }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:177:0x0407 -> B:178:0x040a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:293:0x061e -> B:294:0x0621). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.Q30
    public final java.lang.Object e(com.skidush.clonex.models.Video$Type r39, java.lang.String r40, o.InterfaceC0473Hh r41) {
        /*
            Method dump skipped, instruction units count: 1596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1590gY.e(com.skidush.clonex.models.Video$Type, java.lang.String, o.Hh):java.lang.Object");
    }

    @Override // o.Q30
    public final String f() {
        return "https://pelisplus.to/images/logo2.png";
    }

    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) {
        return zy0.n(new YX(2, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final String getName() {
        return "SERIES Y PELICULAS SOLO PARAGUAY 2";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        TX tx;
        C1590gY c1590gY;
        if (interfaceC0473Hh instanceof TX) {
            tx = (TX) interfaceC0473Hh;
            int i2 = tx.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tx.p = i2 - Integer.MIN_VALUE;
            } else {
                tx = new TX(this, interfaceC0473Hh);
            }
        } else {
            tx = new TX(this, interfaceC0473Hh);
        }
        Object objP = tx.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = tx.p;
        if (i3 == 0) {
            Jp0.O(objP);
            String strT = i == 1 ? AbstractC1701hf0.t("https://pelisplus.to/", str) : "https://pelisplus.to/" + str + "/page/" + i;
            tx.l = this;
            tx.m = str;
            tx.p = 1;
            objP = p(strT, tx);
            if (objP == enumC1706hi) {
                return enumC1706hi;
            }
            c1590gY = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = tx.m;
            c1590gY = tx.l;
            Jp0.O(objP);
        }
        c1590gY.getClass();
        ArrayList arrayListR = r((C0660On) objP);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (obj instanceof Cd0) {
                arrayList.add(obj);
            }
        }
        String strX0 = AbstractC1119bh0.x0(str, "genero/", str);
        if (strX0.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(strX0.charAt(0));
            AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC1474fG.i(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String strSubstring = strX0.substring(1);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            sb.append(strSubstring);
            strX0 = sb.toString();
        }
        return new C2420oz(str, strX0, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) {
        C1004aY c1004aY;
        C1590gY c1590gY;
        if (interfaceC0473Hh instanceof C1004aY) {
            c1004aY = (C1004aY) interfaceC0473Hh;
            int i2 = c1004aY.f676o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1004aY.f676o = i2 - Integer.MIN_VALUE;
            } else {
                c1004aY = new C1004aY(this, interfaceC0473Hh);
            }
        } else {
            c1004aY = new C1004aY(this, interfaceC0473Hh);
        }
        Object objP = c1004aY.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c1004aY.f676o;
        if (i3 == 0) {
            Jp0.O(objP);
            String strN = i == 1 ? "https://pelisplus.to/peliculas" : AbstractC1674hK.n(i, "https://pelisplus.to/peliculas/");
            c1004aY.l = this;
            c1004aY.f676o = 1;
            objP = p(strN, c1004aY);
            if (objP == enumC1706hi) {
                return enumC1706hi;
            }
            c1590gY = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1590gY = c1004aY.l;
            Jp0.O(objP);
        }
        c1590gY.getClass();
        ArrayList arrayListR = r((C0660On) objP);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListR) {
            if (obj instanceof C1387eR) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x016e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) {
        C1199cY c1199cY;
        C1590gY c1590gY;
        Object next;
        Double dI;
        List list;
        C3370yp<C3176wp> c3370ypW;
        C3176wp c3176wpX;
        C3370yp c3370ypW2;
        Object next2;
        String strZ;
        String string;
        String strZ2;
        String strZ3;
        String strM;
        String strD;
        String str2 = str;
        if (interfaceC0473Hh instanceof C1199cY) {
            c1199cY = (C1199cY) interfaceC0473Hh;
            int i = c1199cY.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1199cY.p = i - Integer.MIN_VALUE;
            } else {
                c1199cY = new C1199cY(this, interfaceC0473Hh);
            }
        } else {
            c1199cY = new C1199cY(this, interfaceC0473Hh);
        }
        Object objP = c1199cY.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1199cY.p;
        if (i2 == 0) {
            Jp0.O(objP);
            String strConcat = (AbstractC1899jh0.U(str2, "anime/", false) ? "https://pelisplus.to/" : "https://pelisplus.to/serie/").concat(str2);
            c1199cY.l = this;
            c1199cY.m = str2;
            c1199cY.p = 1;
            objP = p(strConcat, c1199cY);
            if (objP == enumC1706hi) {
                return enumC1706hi;
            }
            c1590gY = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = c1199cY.m;
            c1590gY = c1199cY.l;
            Jp0.O(objP);
        }
        String str3 = str2;
        C0660On c0660On = (C0660On) objP;
        C3176wp c3176wpX2 = c0660On.X("div.genres.rating");
        C3176wp c3176wpX3 = c0660On.X("meta[property=og:image]");
        Object obj = null;
        String strD2 = c3176wpX3 != null ? c3176wpX3.d("content") : null;
        C3176wp c3176wpX4 = c0660On.X("div.bg");
        String strN0 = (c3176wpX4 == null || (strD = c3176wpX4.d("style")) == null) ? null : AbstractC1119bh0.n0(AbstractC1119bh0.n0(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strD, "url(", strD), ")"), "'"), "\"");
        C3370yp c3370ypW3 = c0660On.W("script");
        AbstractC1474fG.i(c3370ypW3, "select(...)");
        Iterator it = c3370ypW3.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            strM = ((C3176wp) next).M();
            AbstractC1474fG.i(strM, "data(...)");
        } while (!AbstractC1119bh0.W(strM, "seasonsJson", false));
        C3176wp c3176wp = (C3176wp) next;
        String strM2 = c3176wp != null ? c3176wp.M() : null;
        if (strM2 == null) {
            strM2 = "";
        }
        JSONObject jSONObject = new JSONObject(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strM2, "const seasonsJson = ", strM2), ";"));
        C3176wp c3176wpX5 = c0660On.X("h1.slugh1");
        String strB0 = (c3176wpX5 == null || (strZ3 = c3176wpX5.Z()) == null) ? "" : AbstractC1119bh0.B0(strZ3, " (");
        C3176wp c3176wpX6 = c0660On.X("div.description p");
        String strZ4 = c3176wpX6 != null ? c3176wpX6.Z() : null;
        c1590gY.getClass();
        String strQ = q(strD2);
        String strQ2 = q(strN0);
        if (c3176wpX2 == null || (c3370ypW2 = c3176wpX2.W("span")) == null) {
            dI = null;
        } else {
            Iterator it2 = c3370ypW2.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                strZ2 = ((C3176wp) next2).Z();
                AbstractC1474fG.i(strZ2, "text(...)");
            } while (!AbstractC1119bh0.W(strZ2, "Rating:", false));
            C3176wp c3176wp2 = (C3176wp) next2;
            if (c3176wp2 == null || (strZ = c3176wp2.Z()) == null || (string = AbstractC1119bh0.E0(AbstractC1119bh0.x0(strZ, ":", strZ)).toString()) == null) {
                dI = null;
            } else {
                dI = AbstractC1705hh0.I(string);
            }
        }
        String strZ5 = (c3176wpX2 == null || (c3176wpX = c3176wpX2.X("a")) == null) ? null : c3176wpX.Z();
        C3370yp c3370ypW4 = c0660On.W("div.genres");
        AbstractC1474fG.i(c3370ypW4, "select(...)");
        for (Object obj2 : c3370ypW4) {
            C3176wp c3176wpX7 = ((C3176wp) obj2).X("span b");
            if (AbstractC1474fG.b(c3176wpX7 != null ? c3176wpX7.Z() : null, "Generos")) {
                obj = obj2;
                break;
            }
        }
        C3176wp c3176wp3 = (C3176wp) obj;
        C1233cq c1233cq = C1233cq.l;
        if (c3176wp3 == null || (c3370ypW = c3176wp3.W("a")) == null) {
            list = c1233cq;
        } else {
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(c3370ypW, 10));
            for (C3176wp c3176wp4 : c3370ypW) {
                String strD3 = c3176wp4.d("href");
                AbstractC1474fG.i(strD3, "attr(...)");
                String strZ6 = c3176wp4.Z();
                AbstractC1474fG.i(strZ6, "text(...)");
                arrayList.add(new C2420oz(strD3, strZ6, c1233cq));
            }
            list = arrayList;
        }
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC1474fG.i(itKeys, "keys(...)");
        return new C2109lo0(str3, strB0, strZ4, strZ5, null, null, null, dI, strQ, strQ2, null, Vb0.Q(new C0927Yu(Vb0.M(Vb0.G(itKeys), new C5(str3, 5)), 2, new N2(24))), list, null, null, null, 58480);
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        throw new Exception("Not yet implemented");
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
        return AbstractC1376eG.J(AbstractC1910jn.b, new C1394eY(ds0, null), interfaceC0473Hh);
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }
}
