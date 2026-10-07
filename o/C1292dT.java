package o;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.dT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1292dT extends AbstractC3473zs {
    public final /* synthetic */ int b;

    public /* synthetic */ C1292dT(int i) {
        this.b = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(String str, InterfaceC0999aT interfaceC0999aT, InterfaceC0473Hh interfaceC0473Hh) {
        C1194cT c1194cT;
        boolean zP;
        if (interfaceC0473Hh instanceof C1194cT) {
            c1194cT = (C1194cT) interfaceC0473Hh;
            int i = c1194cT.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1194cT.m = i - Integer.MIN_VALUE;
            } else {
                c1194cT = new C1194cT(interfaceC0473Hh);
            }
        } else {
            c1194cT = new C1194cT(interfaceC0473Hh);
        }
        Object objA = c1194cT.l;
        Object obj = EnumC1706hi.l;
        int i2 = c1194cT.m;
        try {
            if (i2 == 0) {
                Jp0.O(objA);
                c1194cT.m = 1;
                objA = interfaceC0999aT.a(str, "https://bflix.gs/", c1194cT);
                if (objA == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Jp0.O(objA);
            }
            zP = ((C1759i80) objA).a.p();
        } catch (Exception unused) {
            zP = false;
        }
        return Boolean.valueOf(zP);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    private final Object g(String str, InterfaceC0473Hh interfaceC0473Hh) {
        Ru0 ru0;
        int i = 1;
        if (interfaceC0473Hh instanceof Ru0) {
            ru0 = (Ru0) interfaceC0473Hh;
            int i2 = ru0.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ru0.n = i2 - Integer.MIN_VALUE;
            } else {
                ru0 = new Ru0(this, interfaceC0473Hh);
            }
        } else {
            ru0 = new Ru0(this, interfaceC0473Hh);
        }
        Object objA = ru0.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = ru0.n;
        if (i3 == 0) {
            Jp0.O(objA);
            C1583gR c1583gR = new C1583gR(12);
            C3084vr0 c3084vr0 = C3084vr0.a;
            NV nvO = AbstractC1701hf0.o();
            X9 x9 = Sr0.a;
            ArrayList arrayList = nvO.c;
            arrayList.add(x9);
            X9 x10 = Sr0.b;
            ArrayList arrayList2 = nvO.d;
            arrayList2.add(x10);
            X9 x11 = AbstractC1370eA.m;
            AbstractC1406ef.S(arrayList, X10.q);
            AbstractC1406ef.S(arrayList2, X10.r);
            arrayList.add(x11);
            arrayList2.add(x11);
            c1583gR.m = new OV(nvO);
            c1583gR.f("https://vixcloud.co/");
            ((ArrayList) c1583gR.f793o).add(new P9(i));
            Object objB = c1583gR.m().b(Qu0.class);
            AbstractC1474fG.i(objB, "create(...)");
            String strR = AbstractC1899jh0.R(str, "https://vixcloud.co/", "", false);
            ru0.getClass();
            ru0.n = 1;
            objA = ((Qu0) objB).a(strR, ru0);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objA);
        }
        C3176wp c3176wpX = ((C0660On) objA).b0().X("script");
        String strM = c3176wpX != null ? c3176wpX.M() : null;
        String str2 = strM != null ? strM : "";
        String strB0 = AbstractC1119bh0.B0(AbstractC1119bh0.x0(str2, "window.video = ", str2), ";");
        String strX0 = AbstractC1119bh0.x0(str2, "window.masterPlaylist", str2);
        String strConcat = AbstractC1119bh0.C0(AbstractC1119bh0.B0(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1119bh0.x0(strX0, "params: ", strX0), "'token'", "token", false), "'expires'", "expires", false), "'", "\"", false), "}"), ",").concat("}");
        BA ba = new BA();
        AbstractC1674hK.w(ba.b(strB0, Pu0.class));
        AbstractC1674hK.w(ba.b(strConcat, Ou0.class));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void h(C1292dT c1292dT, String str, InterfaceC0473Hh interfaceC0473Hh) {
        C1655h50 c1655h50;
        if (interfaceC0473Hh instanceof C1655h50) {
            c1655h50 = (C1655h50) interfaceC0473Hh;
            int i = c1655h50.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1655h50.p = i - Integer.MIN_VALUE;
            } else {
                c1655h50 = new C1655h50(c1292dT, interfaceC0473Hh);
            }
        } else {
            c1655h50 = new C1655h50(c1292dT, interfaceC0473Hh);
        }
        Object objB = c1655h50.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c1655h50.p;
        if (i2 == 0) {
            Jp0.O(objB);
            C1069b50 c1069b50 = InterfaceC1557g50.a;
            String strC = c1292dT.c();
            c1069b50.getClass();
            InterfaceC1557g50 interfaceC1557g50A = C1069b50.a(strC);
            String strB0 = AbstractC1119bh0.B0(AbstractC1119bh0.z0(str, "/"), "?");
            c1655h50.l = c1292dT;
            c1655h50.m = interfaceC1557g50A;
            c1655h50.p = 1;
            objB = interfaceC1557g50A.b(strB0, c1655h50);
            if (objB == enumC1706hi) {
                return;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1674hK.w(c1655h50.l);
                Jp0.O(objB);
                AbstractC1674hK.w(objB);
                throw null;
            }
            Jp0.O(objB);
        }
        AbstractC1674hK.w(objB);
        throw new C0730Rf();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public static void i(C1292dT c1292dT, String str, InterfaceC0473Hh interfaceC0473Hh) {
        C2021kt0 c2021kt0;
        int i = 1;
        if (interfaceC0473Hh instanceof C2021kt0) {
            c2021kt0 = (C2021kt0) interfaceC0473Hh;
            int i2 = c2021kt0.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2021kt0.p = i2 - Integer.MIN_VALUE;
            } else {
                c2021kt0 = new C2021kt0(c1292dT, interfaceC0473Hh);
            }
        } else {
            c2021kt0 = new C2021kt0(c1292dT, interfaceC0473Hh);
        }
        Object objB = c2021kt0.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2021kt0.p;
        if (i3 == 0) {
            Jp0.O(objB);
            String strC = c1292dT.c();
            AbstractC1474fG.j(strC, "baseUrl");
            C1583gR c1583gR = new C1583gR(12);
            C3084vr0 c3084vr0 = C3084vr0.a;
            NV nvO = AbstractC1701hf0.o();
            X9 x9 = Sr0.a;
            ArrayList arrayList = nvO.c;
            arrayList.add(x9);
            X9 x10 = Sr0.b;
            ArrayList arrayList2 = nvO.d;
            arrayList2.add(x10);
            X9 x11 = AbstractC1370eA.m;
            AbstractC1406ef.S(arrayList, X10.q);
            AbstractC1406ef.S(arrayList2, X10.r);
            arrayList.add(x11);
            arrayList2.add(x11);
            c1583gR.m = new OV(nvO);
            c1583gR.f(strC);
            P9 p9 = new P9(i);
            ArrayList arrayList3 = (ArrayList) c1583gR.f793o;
            arrayList3.add(p9);
            arrayList3.add(new P9(4));
            CA ca = new CA();
            ca.b(AbstractC1923jt0.class, new C1825it0());
            arrayList3.add(new DA(ca.a()));
            Object objB2 = c1583gR.m().b(InterfaceC1533ft0.class);
            AbstractC1474fG.i(objB2, "create(...)");
            InterfaceC1533ft0 interfaceC1533ft0 = (InterfaceC1533ft0) objB2;
            AbstractC1119bh0.z0(AbstractC1119bh0.B0(str, "?"), "/");
            c2021kt0.l = c1292dT;
            c2021kt0.getClass();
            c2021kt0.m = interfaceC1533ft0;
            c2021kt0.getClass();
            c2021kt0.p = 1;
            objB = interfaceC1533ft0.b("https://raw.githubusercontent.com/Ciarands/vidsrc-keys/main/keys.json", c2021kt0);
            if (objB == enumC1706hi) {
                return;
            }
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1674hK.w(c2021kt0.l);
                Jp0.O(objB);
                AbstractC1674hK.w(objB);
                throw new C0730Rf();
            }
            Jp0.O(objB);
        }
        AbstractC1674hK.w(objB);
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:180:0x06da A[PHI: r3
  0x06da: PHI (r3v71 char) = (r3v67 char), (r3v75 char) binds: [B:184:0x06e9, B:179:0x06d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:205:0x0759  */
    /* JADX WARN: Code duplicated, block: B:21:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:229:0x0826  */
    /* JADX WARN: Code duplicated, block: B:264:0x0920  */
    /* JADX WARN: Code duplicated, block: B:299:0x0a59  */
    /* JADX WARN: Code duplicated, block: B:330:0x0b6a  */
    /* JADX WARN: Code duplicated, block: B:355:0x0c3a  */
    /* JADX WARN: Code duplicated, block: B:358:0x0c4b  */
    /* JADX WARN: Code duplicated, block: B:361:0x0c54  */
    /* JADX WARN: Code duplicated, block: B:362:0x0c56  */
    /* JADX WARN: Code duplicated, block: B:399:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:408:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x024c  */
    /* JADX WARN: Code duplicated, block: B:61:0x025e  */
    @Override // o.AbstractC3473zs
    public Object a(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C1097bT c1097bT;
        InterfaceC0999aT interfaceC0999aT;
        String strR;
        String str2;
        String str3;
        C3450zg0 c3450zg0;
        C1292dT c1292dT;
        IN in;
        GN gnD;
        String str4;
        Tg0 tg0;
        Sg0 sg0;
        String str5;
        C1292dT c1292dT2;
        C1855j80 c1855j80;
        C1951k70 c1951k70;
        C2446pE c2446pE;
        String str6;
        C2499pp0 c2499pp0;
        C1292dT c1292dT3;
        String strSubstring;
        C1337dt0 c1337dt0;
        C2216mt0 c2216mt0;
        C1292dT c1292dT4;
        InterfaceC2119lt0 interfaceC2119lt0;
        String strConcat;
        String str7;
        InterfaceC2119lt0 interfaceC2119lt1;
        JN jnA;
        String str8;
        String strConcat2;
        String str9;
        C1292dT c1292dT5;
        JN jnA2;
        String str10;
        String str11;
        String strH0;
        String str12;
        String str13;
        int i;
        String str14 = str;
        String str15 = "substring(...)";
        String str16 = "/";
        String strD = "";
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        switch (this.b) {
            case 0:
                if (interfaceC0473Hh instanceof C1097bT) {
                    c1097bT = (C1097bT) interfaceC0473Hh;
                    int i2 = c1097bT.q;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c1097bT.q = i2 - Integer.MIN_VALUE;
                    } else {
                        c1097bT = new C1097bT(this, interfaceC0473Hh);
                    }
                } else {
                    c1097bT = new C1097bT(this, interfaceC0473Hh);
                }
                Object objF = c1097bT.f695o;
                int i3 = c1097bT.q;
                if (i3 != 0) {
                    if (i3 == 1) {
                        strR = c1097bT.n;
                        interfaceC0999aT = (InterfaceC0999aT) c1097bT.m;
                        str2 = c1097bT.l;
                        Jp0.O(objF);
                    } else {
                        if (i3 == 2) {
                            strR = c1097bT.n;
                            interfaceC0999aT = (InterfaceC0999aT) c1097bT.m;
                            str2 = c1097bT.l;
                            Jp0.O(objF);
                            if (!((Boolean) objF).booleanValue()) {
                                c1097bT.l = str2;
                                c1097bT.m = null;
                                c1097bT.n = null;
                                c1097bT.q = 3;
                                objF = f(str2, interfaceC0999aT, c1097bT);
                                if (objF == enumC1706hi) {
                                    return enumC1706hi;
                                }
                                str3 = str2;
                            }
                            return new Js0(strR, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, "https://bflix.gs/", (String) null, (List) C1233cq.l, false, 3454);
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str3 = c1097bT.l;
                        Jp0.O(objF);
                    }
                    if (((Boolean) objF).booleanValue()) {
                        throw new Exception("404 not found");
                    }
                    strR = str3;
                    return new Js0(strR, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, "https://bflix.gs/", (String) null, (List) C1233cq.l, false, 3454);
                }
                Jp0.O(objF);
                C1583gR c1583gR = new C1583gR(12);
                C3084vr0 c3084vr0 = C3084vr0.a;
                NV nvO = AbstractC1701hf0.o();
                X9 x9 = Sr0.a;
                ArrayList arrayList = nvO.c;
                arrayList.add(x9);
                X9 x10 = Sr0.b;
                ArrayList arrayList2 = nvO.d;
                arrayList2.add(x10);
                X9 x11 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList, X10.q);
                AbstractC1406ef.S(arrayList2, X10.r);
                arrayList.add(x11);
                arrayList2.add(x11);
                c1583gR.m = new OV(nvO);
                c1583gR.f("https://myfilestorage.xyz");
                ((ArrayList) c1583gR.f793o).add(new P9(4));
                Object objB = c1583gR.m().b(InterfaceC0999aT.class);
                AbstractC1474fG.i(objB, "create(...)");
                InterfaceC0999aT interfaceC0999aT2 = (InterfaceC0999aT) objB;
                c1097bT.l = str14;
                c1097bT.m = interfaceC0999aT2;
                c1097bT.n = str14;
                c1097bT.q = 1;
                Object objF2 = f(str14, interfaceC0999aT2, c1097bT);
                if (objF2 == enumC1706hi) {
                    return enumC1706hi;
                }
                interfaceC0999aT = interfaceC0999aT2;
                objF = objF2;
                strR = str14;
                str2 = strR;
                if (!((Boolean) objF).booleanValue()) {
                    strR = AbstractC1899jh0.R(str2, ".mp4", "-1.mp4", false);
                    c1097bT.l = str2;
                    c1097bT.m = interfaceC0999aT;
                    c1097bT.n = strR;
                    c1097bT.q = 2;
                    objF = f(strR, interfaceC0999aT, c1097bT);
                    if (objF == enumC1706hi) {
                        return enumC1706hi;
                    }
                    if (!((Boolean) objF).booleanValue()) {
                        c1097bT.l = str2;
                        c1097bT.m = null;
                        c1097bT.n = null;
                        c1097bT.q = 3;
                        objF = f(str2, interfaceC0999aT, c1097bT);
                        if (objF == enumC1706hi) {
                            return enumC1706hi;
                        }
                        str3 = str2;
                        if (((Boolean) objF).booleanValue()) {
                            throw new Exception("404 not found");
                        }
                        strR = str3;
                    }
                }
                return new Js0(strR, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, "https://bflix.gs/", (String) null, (List) C1233cq.l, false, 3454);
            case 1:
                h(this, str, interfaceC0473Hh);
                return enumC1706hi;
            case 2:
                if (interfaceC0473Hh instanceof C3450zg0) {
                    c3450zg0 = (C3450zg0) interfaceC0473Hh;
                    int i4 = c3450zg0.f1161o;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        c3450zg0.f1161o = i4 - Integer.MIN_VALUE;
                    } else {
                        c3450zg0 = new C3450zg0(this, interfaceC0473Hh);
                    }
                } else {
                    c3450zg0 = new C3450zg0(this, interfaceC0473Hh);
                }
                Object objA = c3450zg0.m;
                int i5 = c3450zg0.f1161o;
                if (i5 == 0) {
                    Jp0.O(objA);
                    C1583gR c1583gR2 = new C1583gR(12);
                    C3084vr0 c3084vr1 = C3084vr0.a;
                    NV nvO2 = AbstractC1701hf0.o();
                    X9 x12 = Sr0.a;
                    ArrayList arrayList3 = nvO2.c;
                    arrayList3.add(x12);
                    X9 x13 = Sr0.b;
                    ArrayList arrayList4 = nvO2.d;
                    arrayList4.add(x13);
                    X9 x14 = AbstractC1370eA.m;
                    AbstractC1406ef.S(arrayList3, X10.q);
                    AbstractC1406ef.S(arrayList4, X10.r);
                    arrayList3.add(x14);
                    arrayList4.add(x14);
                    c1583gR2.m = new OV(nvO2);
                    c1583gR2.f("https://streamtp3.com/");
                    ((ArrayList) c1583gR2.f793o).add(new P9(1));
                    Object objB2 = c1583gR2.m().b(InterfaceC3353yg0.class);
                    AbstractC1474fG.i(objB2, "create(...)");
                    String strR2 = AbstractC1899jh0.R(str14, "https://streamtp3.com/", "", false);
                    c3450zg0.l = this;
                    c3450zg0.f1161o = 1;
                    objA = ((InterfaceC3353yg0) objB2).a(strR2, c3450zg0);
                    if (objA == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1292dT = this;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1292dT = c3450zg0.l;
                    Jp0.O(objA);
                }
                String strR3 = ((C0660On) objA).R();
                Pattern patternCompile = Pattern.compile("var\\s+playbackURL\\s*=\\s*\"([^\"]+)\"");
                AbstractC1474fG.i(patternCompile, "compile(...)");
                AbstractC1474fG.g(strR3);
                Matcher matcher = patternCompile.matcher(strR3);
                AbstractC1474fG.i(matcher, "matcher(...)");
                JN jnA3 = AbstractC1370eA.a(matcher, 0, strR3);
                if (jnA3 == null || (in = jnA3.c) == null || (gnD = in.d(1)) == null || (str4 = gnD.a) == null) {
                    throw new Exception("No se pudo encontrar la fuente de video en la respuesta.");
                }
                C1101bX c1101bX = new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
                c1292dT.getClass();
                return new Js0(str4, AbstractC3327yN.z(c1101bX, new C1101bX("Referer", "https://streamtp3.com/")), "hls", (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) C1233cq.l, false, 3576);
            case 3:
                if (interfaceC0473Hh instanceof Tg0) {
                    tg0 = (Tg0) interfaceC0473Hh;
                    int i6 = tg0.q;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        tg0.q = i6 - Integer.MIN_VALUE;
                    } else {
                        tg0 = new Tg0(this, interfaceC0473Hh);
                    }
                } else {
                    tg0 = new Tg0(this, interfaceC0473Hh);
                }
                Object objA2 = tg0.f539o;
                int i7 = tg0.q;
                if (i7 != 0) {
                    if (i7 == 1) {
                        sg0 = (Sg0) tg0.n;
                        str5 = tg0.m;
                        c1292dT2 = tg0.l;
                        Jp0.O(objA2);
                    } else {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Jp0.O(objA2);
                    }
                    C1855j80 c1855j81 = ((C1759i80) objA2).a;
                    AbstractC1474fG.h(c1855j81, "null cannot be cast to non-null type okhttp3.Response");
                    c1855j80 = c1855j81.s;
                    if (c1855j80 != null || (c1951k70 = c1855j80.l) == null || (c2446pE = c1951k70.a) == null || (str6 = c2446pE.i) == null) {
                        throw new Exception("Can't retrieve URL");
                    }
                    return new Js0(str6, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) C1233cq.l, false, 3582);
                }
                Jp0.O(objA2);
                String strR4 = AbstractC1899jh0.R(str14, "https://streamtape.com", "", false);
                String strR5 = AbstractC1899jh0.R(str14, "https://streamtape.com/e/", "", false);
                C1583gR c1583gR3 = new C1583gR(12);
                C3084vr0 c3084vr2 = C3084vr0.a;
                NV nvO3 = AbstractC1701hf0.o();
                X9 x15 = Sr0.a;
                ArrayList arrayList5 = nvO3.c;
                arrayList5.add(x15);
                X9 x16 = Sr0.b;
                ArrayList arrayList6 = nvO3.d;
                arrayList6.add(x16);
                X9 x17 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList5, X10.q);
                AbstractC1406ef.S(arrayList6, X10.r);
                arrayList5.add(x17);
                arrayList6.add(x17);
                c1583gR3.m = new OV(nvO3);
                c1583gR3.f("https://streamtape.com");
                ((ArrayList) c1583gR3.f793o).add(new P9(1));
                Object objB3 = c1583gR3.m().b(Sg0.class);
                AbstractC1474fG.i(objB3, "create(...)");
                sg0 = (Sg0) objB3;
                tg0.l = this;
                tg0.m = strR5;
                tg0.n = sg0;
                tg0.q = 1;
                objA2 = sg0.a(strR4, tg0);
                if (objA2 == enumC1706hi) {
                    return enumC1706hi;
                }
                str5 = strR5;
                c1292dT2 = this;
                String strR6 = ((C0660On) objA2).R();
                AbstractC1474fG.i(strR6, "html(...)");
                String str17 = (String) AbstractC1119bh0.t0((CharSequence) AbstractC1119bh0.t0(strR6, new String[]{str5}, 0, 6).get(10), new String[]{"').substring("}, 0, 6).get(0);
                c1292dT2.getClass();
                tg0.l = null;
                tg0.m = null;
                tg0.n = null;
                tg0.q = 2;
                objA2 = sg0.b("https://streamtape.com/get_video?id=" + str5 + str17, tg0);
                if (objA2 == enumC1706hi) {
                    return enumC1706hi;
                }
                C1855j80 c1855j82 = ((C1759i80) objA2).a;
                AbstractC1474fG.h(c1855j82, "null cannot be cast to non-null type okhttp3.Response");
                c1855j80 = c1855j82.s;
                if (c1855j80 != null) {
                }
                throw new Exception("Can't retrieve URL");
            case 4:
                if (interfaceC0473Hh instanceof C2499pp0) {
                    c2499pp0 = (C2499pp0) interfaceC0473Hh;
                    int i8 = c2499pp0.f979o;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c2499pp0.f979o = i8 - Integer.MIN_VALUE;
                    } else {
                        c2499pp0 = new C2499pp0(this, interfaceC0473Hh);
                    }
                } else {
                    c2499pp0 = new C2499pp0(this, interfaceC0473Hh);
                }
                Object objA3 = c2499pp0.m;
                int i9 = c2499pp0.f979o;
                if (i9 != 0) {
                    if (i9 == 1) {
                        c1292dT3 = c2499pp0.l;
                        Jp0.O(objA3);
                    } else {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Jp0.O(objA3);
                    }
                    return objA3;
                }
                Jp0.O(objA3);
                C1583gR c1583gR4 = new C1583gR(12);
                C3084vr0 c3084vr3 = C3084vr0.a;
                NV nvO4 = AbstractC1701hf0.o();
                X9 x18 = Sr0.a;
                ArrayList arrayList7 = nvO4.c;
                arrayList7.add(x18);
                X9 x19 = Sr0.b;
                ArrayList arrayList8 = nvO4.d;
                arrayList8.add(x19);
                X9 x20 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList7, X10.q);
                AbstractC1406ef.S(arrayList8, X10.r);
                arrayList7.add(x20);
                arrayList8.add(x20);
                c1583gR4.m = new OV(nvO4);
                c1583gR4.f("https://www.2embed.cc");
                ((ArrayList) c1583gR4.f793o).add(new P9(1));
                Object objB4 = c1583gR4.m().b(InterfaceC2402op0.class);
                AbstractC1474fG.i(objB4, "create(...)");
                c2499pp0.l = this;
                c2499pp0.f979o = 1;
                objA3 = ((InterfaceC2402op0) objB4).a(str14, c2499pp0);
                if (objA3 == enumC1706hi) {
                    return enumC1706hi;
                }
                c1292dT3 = this;
                C3176wp c3176wpX = ((C0660On) objA3).X("iframe");
                String strD2 = c3176wpX != null ? c3176wpX.d("data-src") : null;
                if (strD2 == null) {
                    throw new Exception("Can't retrieve iframe src");
                }
                c1292dT3.getClass();
                int iE0 = AbstractC1119bh0.e0(strD2, "/", AbstractC1119bh0.e0(strD2, "://", 0, false, 6) + 3, false, 4);
                if (iE0 == -1) {
                    strSubstring = strD2;
                } else {
                    strSubstring = strD2.substring(0, iE0);
                    AbstractC1474fG.i(strSubstring, "substring(...)");
                }
                String strConcat3 = "https://uqloads.xyz/e/".concat(AbstractC1119bh0.B0(AbstractC1119bh0.x0(strD2, "id=", strD2), "&"));
                Ig0 ig0 = new Ig0();
                c2499pp0.l = null;
                c2499pp0.f979o = 2;
                ig0.b = strSubstring;
                objA3 = Mg0.h(ig0, strConcat3, c2499pp0);
                if (objA3 == enumC1706hi) {
                    return enumC1706hi;
                }
                return objA3;
            case 5:
                if (interfaceC0473Hh instanceof C1337dt0) {
                    c1337dt0 = (C1337dt0) interfaceC0473Hh;
                    int i10 = c1337dt0.n;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        c1337dt0.n = i10 - Integer.MIN_VALUE;
                    } else {
                        c1337dt0 = new C1337dt0(this, interfaceC0473Hh);
                    }
                } else {
                    c1337dt0 = new C1337dt0(this, interfaceC0473Hh);
                }
                Object objA4 = c1337dt0.l;
                int i11 = c1337dt0.n;
                if (i11 == 0) {
                    Jp0.O(objA4);
                    C1583gR c1583gR5 = new C1583gR(12);
                    C3084vr0 c3084vr4 = C3084vr0.a;
                    NV nvO5 = AbstractC1701hf0.o();
                    X9 x21 = Sr0.a;
                    ArrayList arrayList9 = nvO5.c;
                    arrayList9.add(x21);
                    X9 x22 = Sr0.b;
                    ArrayList arrayList10 = nvO5.d;
                    arrayList10.add(x22);
                    X9 x23 = AbstractC1370eA.m;
                    AbstractC1406ef.S(arrayList9, X10.q);
                    AbstractC1406ef.S(arrayList10, X10.r);
                    arrayList9.add(x23);
                    arrayList10.add(x23);
                    c1583gR5.m = new OV(nvO5);
                    c1583gR5.f("https://vidoza.net");
                    ((ArrayList) c1583gR5.f793o).add(new P9(1));
                    Object objB5 = c1583gR5.m().b(InterfaceC1240ct0.class);
                    AbstractC1474fG.i(objB5, "create(...)");
                    String strR7 = AbstractC1899jh0.R(str14, "https://vidoza.net", "", false);
                    c1337dt0.n = 1;
                    objA4 = ((InterfaceC1240ct0) objB5).a(strR7, c1337dt0);
                    if (objA4 == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(objA4);
                }
                for (C3176wp c3176wp : ((C0660On) objA4).W("source")) {
                    if (c3176wp.r("src")) {
                        strD = c3176wp.d("src");
                        String str18 = strD;
                        AbstractC1474fG.g(str18);
                        return new Js0(str18, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) C1233cq.l, false, 3582);
                    }
                }
                String str19 = strD;
                AbstractC1474fG.g(str19);
                return new Js0(str19, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) C1233cq.l, false, 3582);
            case 6:
                i(this, str, interfaceC0473Hh);
                return enumC1706hi;
            case 7:
                if (interfaceC0473Hh instanceof C2216mt0) {
                    c2216mt0 = (C2216mt0) interfaceC0473Hh;
                    int i12 = c2216mt0.q;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        c2216mt0.q = i12 - Integer.MIN_VALUE;
                    } else {
                        c2216mt0 = new C2216mt0(this, interfaceC0473Hh);
                    }
                } else {
                    c2216mt0 = new C2216mt0(this, interfaceC0473Hh);
                }
                Object objA5 = c2216mt0.f925o;
                int i13 = c2216mt0.q;
                if (i13 != 0) {
                    if (i13 == 1) {
                        InterfaceC2119lt0 interfaceC2119lt2 = (InterfaceC2119lt0) c2216mt0.n;
                        String str20 = (String) c2216mt0.m;
                        c1292dT4 = c2216mt0.l;
                        Jp0.O(objA5);
                        interfaceC2119lt0 = interfaceC2119lt2;
                        str14 = str20;
                    } else {
                        if (i13 == 2) {
                            str7 = (String) c2216mt0.n;
                            interfaceC2119lt1 = (InterfaceC2119lt0) c2216mt0.m;
                            C1292dT c1292dT6 = c2216mt0.l;
                            Jp0.O(objA5);
                            str15 = "substring(...)";
                            str16 = "/";
                            c1292dT4 = c1292dT6;
                            Pattern patternCompile2 = Pattern.compile("src: '(/prorcp/.*?)'");
                            AbstractC1474fG.i(patternCompile2, "compile(...)");
                            String strR8 = ((C0660On) objA5).R();
                            AbstractC1474fG.i(strR8, "toString(...)");
                            Matcher matcher2 = patternCompile2.matcher(strR8);
                            AbstractC1474fG.i(matcher2, "matcher(...)");
                            jnA = AbstractC1370eA.a(matcher2, 0, strR8);
                            if (jnA != null && (str8 = (String) ((HN) jnA.a()).get(1)) != null) {
                                AbstractC1474fG.g(str7);
                                strConcat2 = AbstractC1119bh0.B0(str7, "/rcp").concat(str8);
                                if (strConcat2 != null) {
                                    c2216mt0.l = c1292dT4;
                                    c2216mt0.m = str7;
                                    c2216mt0.n = null;
                                    c2216mt0.q = 3;
                                    objA5 = interfaceC2119lt1.a(strConcat2, str7, c2216mt0);
                                    if (objA5 == enumC1706hi) {
                                        return enumC1706hi;
                                    }
                                    str9 = str7;
                                    c1292dT5 = c1292dT4;
                                }
                            }
                            throw new Exception("Can't retrieve source");
                        }
                        if (i13 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        String str21 = (String) c2216mt0.m;
                        c1292dT5 = c2216mt0.l;
                        Jp0.O(objA5);
                        str9 = str21;
                        str15 = "substring(...)";
                        str16 = "/";
                    }
                    String strR9 = ((C0660On) objA5).R();
                    AbstractC1474fG.i(strR9, "toString(...)");
                    Pattern patternCompile3 = Pattern.compile("Playerjs.*file: ([a-zA-Z0-9]*?) ,");
                    AbstractC1474fG.i(patternCompile3, "compile(...)");
                    Matcher matcher3 = patternCompile3.matcher(strR9);
                    AbstractC1474fG.i(matcher3, "matcher(...)");
                    jnA2 = AbstractC1370eA.a(matcher3, 0, strR9);
                    if (jnA2 != null || (str10 = (String) ((HN) jnA2.a()).get(1)) == null) {
                        throw new Exception("Can't retrieve player ID");
                    }
                    String str22 = "<div id=\"" + str10 + "\" style=\"display:none;\">\\s*(.*?)\\s*</div>";
                    AbstractC1474fG.j(str22, "pattern");
                    Pattern patternCompile4 = Pattern.compile(str22);
                    AbstractC1474fG.i(patternCompile4, "compile(...)");
                    Matcher matcher4 = patternCompile4.matcher(strR9);
                    AbstractC1474fG.i(matcher4, "matcher(...)");
                    JN jnA4 = AbstractC1370eA.a(matcher4, 0, strR9);
                    if (jnA4 == null || (str11 = (String) ((HN) jnA4.a()).get(1)) == null) {
                        throw new Exception("Can't retrieve source");
                    }
                    c1292dT5.getClass();
                    switch (str10.hashCode()) {
                        case -2067013265:
                            if (str10.equals("o2VSUnjnZl")) {
                                ArrayList arrayList11 = new ArrayList(str11.length());
                                for (int i14 = 0; i14 < str11.length(); i14++) {
                                    char cCharAt = str11.charAt(i14);
                                    if ('a' <= cCharAt && cCharAt < '{') {
                                        cCharAt = (char) (cCharAt - 3);
                                        if (AbstractC1474fG.k(cCharAt, 97) < 0) {
                                            cCharAt = (char) (cCharAt + 26);
                                        }
                                    } else if ('A' <= cCharAt && cCharAt < '[') {
                                        cCharAt = (char) (cCharAt - 3);
                                        if (AbstractC1474fG.k(cCharAt, 65) < 0) {
                                            cCharAt = (char) (cCharAt + 26);
                                        }
                                    }
                                    arrayList11.add(Character.valueOf(cCharAt));
                                }
                                strH0 = AbstractC0911Ye.h0(arrayList11, "", null, null, null, 62);
                                str12 = strH0;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case -1611365689:
                            String str23 = str16;
                            if (str10.equals("Oi3v1dAlaM")) {
                                byte[] bArrDecode = Base64.decode(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1119bh0.q0(str11).toString(), "-", "+", false), "_", str23, false), 0);
                                AbstractC1474fG.i(bArrDecode, "decode(...)");
                                String str24 = new String(bArrDecode, AbstractC1305dd.a);
                                int length = str24.length();
                                for (int i15 = 0; i15 < length; i15++) {
                                    strD = strD + ((char) (str24.charAt(i15) - 5));
                                }
                                str12 = strD;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case -1222770887:
                            if (str10.equals("xTyBxQyGTA")) {
                                String string = AbstractC1119bh0.q0(str11).toString();
                                StringBuilder sb = new StringBuilder();
                                int i16 = 0;
                                int i17 = 0;
                                while (i16 < string.length()) {
                                    char cCharAt2 = string.charAt(i16);
                                    int i18 = i17 + 1;
                                    if (i17 % 2 == 0) {
                                        sb.append(cCharAt2);
                                    }
                                    i16++;
                                    i17 = i18;
                                }
                                String string2 = sb.toString();
                                AbstractC1474fG.i(string2, "toString(...)");
                                byte[] bArrDecode2 = Base64.decode(string2, 0);
                                AbstractC1474fG.i(bArrDecode2, "decode(...)");
                                str12 = new String(bArrDecode2, AbstractC1305dd.a);
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case -1176510395:
                            String str25 = str15;
                            if (str10.equals("NdonQLf1Tzyx7bMG")) {
                                ArrayList arrayList12 = new ArrayList();
                                int iN = Sr0.n(0, str11.length() - 1, 3);
                                if (iN >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        int i20 = i19 + 3;
                                        String strSubstring2 = str11.substring(i19, Math.min(i20, str11.length()));
                                        AbstractC1474fG.i(strSubstring2, str25);
                                        arrayList12.add(strSubstring2);
                                        if (i19 != iN) {
                                            i19 = i20;
                                        }
                                    }
                                }
                                strH0 = AbstractC0911Ye.h0(AbstractC0911Ye.p0(arrayList12), "", null, null, null, 62);
                                str12 = strH0;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case -1120108789:
                            String str26 = str16;
                            if (str10.equals("JoAHUMCLXV")) {
                                byte[] bArrDecode3 = Base64.decode(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1119bh0.q0(str11).toString(), "-", "+", false), "_", str26, false), 0);
                                AbstractC1474fG.i(bArrDecode3, "decode(...)");
                                String str27 = new String(bArrDecode3, AbstractC1305dd.a);
                                int length2 = str27.length();
                                for (int i21 = 0; i21 < length2; i21++) {
                                    strD = strD + ((char) (str27.charAt(i21) - 3));
                                }
                                str12 = strD;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case -235832515:
                            if (str10.equals("ux8qjPHC66")) {
                                ArrayList<String> arrayListV = AbstractC1119bh0.V(AbstractC1119bh0.q0(str11).toString());
                                ArrayList arrayList13 = new ArrayList(AbstractC1016af.O(arrayListV, 10));
                                for (String str28 : arrayListV) {
                                    AbstractC3021v9.e(16);
                                    arrayList13.add(Character.valueOf((char) Integer.parseInt(str28, 16)));
                                }
                                String strH1 = AbstractC0911Ye.h0(arrayList13, "", null, null, null, 62);
                                int length3 = strH1.length();
                                for (int i22 = 0; i22 < length3; i22++) {
                                    strD = strD + ((char) (strH1.charAt(i22) ^ "X9a(O;FMV2-7VO5x;Ao\u0005:dN1NoFs?j,".charAt(i22 % 31)));
                                }
                                str12 = strD;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case -67178318:
                            if (str10.equals("TsA2KGDGux")) {
                                byte[] bArrDecode4 = Base64.decode(AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1119bh0.q0(str11).toString(), "-", "+", false), "_", str16, false), 0);
                                AbstractC1474fG.i(bArrDecode4, "decode(...)");
                                String str29 = new String(bArrDecode4, AbstractC1305dd.a);
                                int length4 = str29.length();
                                for (int i23 = 0; i23 < length4; i23++) {
                                    strD = strD + ((char) (str29.charAt(i23) - 7));
                                }
                                str12 = strD;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case 128189634:
                            if (str10.equals("KJHidj7det")) {
                                String strSubstring3 = str11.substring(10, str11.length() - 16);
                                AbstractC1474fG.i(strSubstring3, str15);
                                byte[] bArrDecode5 = Base64.decode(strSubstring3, 0);
                                AbstractC1474fG.i(bArrDecode5, "decode(...)");
                                String str30 = new String(bArrDecode5, AbstractC1305dd.a);
                                String strD0 = AbstractC1119bh0.D0(str30.length(), AbstractC1899jh0.Q((str30.length() + 31) / 32, "3SAY~#%Y(V%>5d/Yg\"$G[Lh1rK4a;7ok"));
                                int length5 = str30.length();
                                for (int i24 = 0; i24 < length5; i24++) {
                                    strD = strD + ((char) (str30.charAt(i24) ^ strD0.charAt(i24)));
                                }
                                str12 = strD;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case 258656854:
                            if (str10.equals("eSfH1IRMyL")) {
                                String string3 = AbstractC1119bh0.q0(str11).toString();
                                ArrayList arrayList14 = new ArrayList(string3.length());
                                for (int i25 = 0; i25 < string3.length(); i25++) {
                                    arrayList14.add(Character.valueOf((char) (string3.charAt(i25) - 1)));
                                }
                                ArrayList<String> arrayListV2 = AbstractC1119bh0.V(AbstractC0911Ye.h0(arrayList14, "", null, null, null, 62));
                                ArrayList arrayList15 = new ArrayList(AbstractC1016af.O(arrayListV2, 10));
                                for (String str31 : arrayListV2) {
                                    AbstractC3021v9.e(16);
                                    arrayList15.add(Character.valueOf((char) Integer.parseInt(str31, 16)));
                                }
                                strH0 = AbstractC0911Ye.h0(arrayList15, "", null, null, null, 62);
                                str12 = strH0;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case 1132519359:
                            if (str10.equals("IhWrImMIGL")) {
                                String string4 = AbstractC1119bh0.q0(str11).toString();
                                ArrayList arrayList16 = new ArrayList(string4.length());
                                for (int i26 = 0; i26 < string4.length(); i26++) {
                                    char cCharAt3 = string4.charAt(i26);
                                    if (('a' > cCharAt3 || cCharAt3 >= 'n') && ('A' > cCharAt3 || cCharAt3 >= 'N')) {
                                        if (('n' <= cCharAt3 && cCharAt3 < '{') || ('N' <= cCharAt3 && cCharAt3 < '[')) {
                                            i = cCharAt3 - '\r';
                                        }
                                        arrayList16.add(Character.valueOf(cCharAt3));
                                    } else {
                                        i = cCharAt3 + '\r';
                                    }
                                    cCharAt3 = (char) i;
                                    arrayList16.add(Character.valueOf(cCharAt3));
                                }
                                byte[] bArrDecode6 = Base64.decode(AbstractC1119bh0.q0(AbstractC0911Ye.h0(arrayList16, "", null, null, null, 62)).toString(), 0);
                                AbstractC1474fG.i(bArrDecode6, "decode(...)");
                                str13 = new String(bArrDecode6, AbstractC1305dd.a);
                                str12 = str13;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        case 1900419062:
                            if (str10.equals("sXnL9MQIry")) {
                                ArrayList<String> arrayListV3 = AbstractC1119bh0.V(str11);
                                ArrayList arrayList17 = new ArrayList(AbstractC1016af.O(arrayListV3, 10));
                                for (String str32 : arrayListV3) {
                                    AbstractC3021v9.e(16);
                                    arrayList17.add(Character.valueOf((char) Integer.parseInt(str32, 16)));
                                }
                                String strH2 = AbstractC0911Ye.h0(arrayList17, "", null, null, null, 62);
                                int length6 = strH2.length();
                                String str33 = "";
                                for (int i27 = 0; i27 < length6; i27++) {
                                    str33 = str33 + ((char) (strH2.charAt(i27) ^ "pWB9V)[*4I`nJpp?ozyB~dbr9yt!_n4u".charAt(i27 % 32)));
                                }
                                int length7 = str33.length();
                                for (int i28 = 0; i28 < length7; i28++) {
                                    strD = strD + ((char) (str33.charAt(i28) - 3));
                                }
                                byte[] bArrDecode7 = Base64.decode(strD, 0);
                                AbstractC1474fG.i(bArrDecode7, "decode(...)");
                                str13 = new String(bArrDecode7, AbstractC1305dd.a);
                                str12 = str13;
                                return new Js0(str12, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, str9, (String) null, (List) C1233cq.l, false, 3454);
                            }
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                        default:
                            throw new Exception("Encryption type not implemented yet: ".concat(str10));
                    }
                }
                Jp0.O(objA5);
                C1583gR c1583gR6 = new C1583gR(12);
                C3084vr0 c3084vr5 = C3084vr0.a;
                NV nvO6 = AbstractC1701hf0.o();
                X9 x24 = Sr0.a;
                ArrayList arrayList18 = nvO6.c;
                arrayList18.add(x24);
                X9 x25 = Sr0.b;
                ArrayList arrayList19 = nvO6.d;
                arrayList19.add(x25);
                X9 x26 = AbstractC1370eA.m;
                AbstractC1406ef.S(arrayList18, X10.q);
                AbstractC1406ef.S(arrayList19, X10.r);
                arrayList18.add(x26);
                arrayList19.add(x26);
                c1583gR6.m = new OV(nvO6);
                c1583gR6.f("https://vidsrc.net");
                ((ArrayList) c1583gR6.f793o).add(new P9(1));
                Object objB6 = c1583gR6.m().b(InterfaceC2119lt0.class);
                AbstractC1474fG.i(objB6, "create(...)");
                InterfaceC2119lt0 interfaceC2119lt3 = (InterfaceC2119lt0) objB6;
                c2216mt0.l = this;
                c2216mt0.m = str14;
                c2216mt0.n = interfaceC2119lt3;
                c2216mt0.q = 1;
                Object objA6 = interfaceC2119lt3.a(str14, "", c2216mt0);
                if (objA6 == enumC1706hi) {
                    return enumC1706hi;
                }
                c1292dT4 = this;
                interfaceC2119lt0 = interfaceC2119lt3;
                objA5 = objA6;
                Iterator<E> it = ((C0660On) objA5).W("iframe#player_iframe").iterator();
                while (true) {
                    if (it.hasNext()) {
                        C3176wp c3176wp2 = (C3176wp) it.next();
                        if (c3176wp2.r("src")) {
                            strConcat = c3176wp2.d("src");
                        }
                    } else {
                        strConcat = "";
                    }
                }
                AbstractC1474fG.g(strConcat);
                if (AbstractC1899jh0.U(strConcat, "//", false)) {
                    strConcat = "https:".concat(strConcat);
                }
                AbstractC1474fG.g(strConcat);
                c2216mt0.l = c1292dT4;
                c2216mt0.m = interfaceC2119lt0;
                c2216mt0.n = strConcat;
                c2216mt0.q = 2;
                Object objA7 = interfaceC2119lt0.a(strConcat, str14, c2216mt0);
                if (objA7 == enumC1706hi) {
                    return enumC1706hi;
                }
                str7 = strConcat;
                interfaceC2119lt1 = interfaceC2119lt0;
                objA5 = objA7;
                Pattern patternCompile5 = Pattern.compile("src: '(/prorcp/.*?)'");
                AbstractC1474fG.i(patternCompile5, "compile(...)");
                String strR10 = ((C0660On) objA5).R();
                AbstractC1474fG.i(strR10, "toString(...)");
                Matcher matcher5 = patternCompile5.matcher(strR10);
                AbstractC1474fG.i(matcher5, "matcher(...)");
                jnA = AbstractC1370eA.a(matcher5, 0, strR10);
                if (jnA != null) {
                    AbstractC1474fG.g(str7);
                    strConcat2 = AbstractC1119bh0.B0(str7, "/rcp").concat(str8);
                    if (strConcat2 != null) {
                        c2216mt0.l = c1292dT4;
                        c2216mt0.m = str7;
                        c2216mt0.n = null;
                        c2216mt0.q = 3;
                        objA5 = interfaceC2119lt1.a(strConcat2, str7, c2216mt0);
                        if (objA5 == enumC1706hi) {
                            return enumC1706hi;
                        }
                        str9 = str7;
                        c1292dT5 = c1292dT4;
                        String strR11 = ((C0660On) objA5).R();
                        AbstractC1474fG.i(strR11, "toString(...)");
                        Pattern patternCompile6 = Pattern.compile("Playerjs.*file: ([a-zA-Z0-9]*?) ,");
                        AbstractC1474fG.i(patternCompile6, "compile(...)");
                        Matcher matcher6 = patternCompile6.matcher(strR11);
                        AbstractC1474fG.i(matcher6, "matcher(...)");
                        jnA2 = AbstractC1370eA.a(matcher6, 0, strR11);
                        if (jnA2 != null) {
                        }
                        throw new Exception("Can't retrieve player ID");
                    }
                }
                throw new Exception("Can't retrieve source");
            case 8:
                return g(str, interfaceC0473Hh);
            case 9:
                return new Hv0().g(str14, AbstractC3327yN.z(new C1101bX("Referer", "https://animeav1.com/"), new C1101bX("User-Agent", "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Mobile Safari/537.36")), interfaceC0473Hh);
            case 10:
                return new Js0(str, (Map) null, (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) C1233cq.l, false, 3454);
            default:
                String strG0 = AbstractC1119bh0.G0(AbstractC1119bh0.A0(str14, '?', str14), '/');
                String strY0 = AbstractC1119bh0.y0(strG0, '/', strG0);
                if (!AbstractC1899jh0.O(strY0)) {
                    return new Js0("https://player.zilla-networks.com/m3u8/".concat(strY0), AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:148.0) Gecko/20100101 Firefox/148.0"), new C1101bX("Accept", "*/*"), new C1101bX("Accept-Language", "es-ES,es;q=0.9,en;q=0.7"), new C1101bX("Referer", str14), new C1101bX("Origin", "https://player.zilla-networks.com")), "hls", (String) null, (String) null, (byte[]) null, (String) null, str, (String) null, (List) null, false, 3960);
                }
                throw new IllegalArgumentException("Zilla video id is missing".toString());
        }
    }

    @Override // o.AbstractC3473zs
    public String c() {
        switch (this.b) {
            case 0:
                return "https://myfilestorage.xyz";
            case 1:
                return "https://rabbitstream.net";
            case 2:
                return "https://streamtp3.com/";
            case 3:
                return "https://streamtape.com";
            case 4:
                return "https://www.2embed.cc";
            case 5:
                return "https://vidoza.net";
            case 6:
                return "https://vidplay.site";
            case 7:
                return "https://vidsrc.net";
            case 8:
                return "https://vixcloud.co/";
            case 9:
                return "https://animeav1.uns.bio";
            case 10:
                return "";
            default:
                return "https://player.zilla-networks.com";
        }
    }

    @Override // o.AbstractC3473zs
    public String d() {
        switch (this.b) {
            case 0:
                return "MyFileStorage";
            case 1:
                return "Rabbitstream";
            case 2:
                return "StreamTP3";
            case 3:
                return "Streamtape";
            case 4:
                return "2Embed";
            case 5:
                return "Vidoza";
            case 6:
                return "Vidplay";
            case 7:
                return "Vidsrc.net";
            case 8:
                return "vixcloud";
            case 9:
                return "UPNShare";
            case 10:
                return "Generic Extractor";
            default:
                return "Zilla";
        }
    }

    public /* synthetic */ C1292dT(int i, boolean z) {
        this.b = i;
    }
}
