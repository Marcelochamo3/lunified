package o;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class VQ extends AbstractC3473zs {
    public final /* synthetic */ int b;
    public final Object c;

    public VQ(int i) {
        int i2 = 1;
        this.b = i;
        switch (i) {
            case 1:
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
                TimeUnit timeUnit = TimeUnit.SECONDS;
                nvO.i(30L, timeUnit);
                nvO.e(30L, timeUnit);
                ConcurrentHashMap concurrentHashMap = C0323Bn.a;
                C0323Bn.b(nvO);
                this.c = new OV(nvO);
                break;
            case 2:
                NV nvJ = AbstractC1370eA.j();
                nvJ.h = true;
                nvJ.c.add(new C2480pg(9));
                OV ov = new OV(nvJ);
                C1583gR c1583gRK = AbstractC1370eA.k();
                c1583gRK.f("https://ok.ru");
                ((ArrayList) c1583gRK.f793o).add(new P9(i2));
                c1583gRK.m = ov;
                Object objB = c1583gRK.m().b(TV.class);
                AbstractC1474fG.i(objB, "create(...)");
                this.c = (TV) objB;
                break;
            default:
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
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                nvO2.i(15L, timeUnit2);
                nvO2.e(5L, timeUnit2);
                ConcurrentHashMap concurrentHashMap2 = C0323Bn.a;
                C0323Bn.b(nvO2);
                this.c = new OV(nvO2);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0278  */
    /* JADX WARN: Code duplicated, block: B:9:0x002f  */
    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        UQ uq;
        String str2;
        String str3;
        UV uv;
        VQ vq;
        String str4;
        String str5;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        Object obj = this.c;
        int i = 1;
        switch (this.b) {
            case 0:
                if (interfaceC0473Hh instanceof UQ) {
                    uq = (UQ) interfaceC0473Hh;
                    int i2 = uq.f552o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        uq.f552o = i2 - Integer.MIN_VALUE;
                    } else {
                        uq = new UQ(this, interfaceC0473Hh);
                    }
                } else {
                    uq = new UQ(this, interfaceC0473Hh);
                }
                Object objA = uq.m;
                int i3 = uq.f552o;
                if (i3 == 0) {
                    Jp0.O(objA);
                    if (AbstractC1119bh0.W(str, "ok.ru", false)) {
                        JN jnA = AbstractC1370eA.a(AbstractC1701hf0.m("(?:\\/\\/|\\.)(ok\\.ru|odnoklassniki\\.ru)\\/(?:videoembed|video)\\/(\\d+)", "compile(...)", str, "matcher(...)"), 0, str);
                        if (jnA == null) {
                            throw new Exception("Invalid OK.ru URL format");
                        }
                        String strT = AbstractC1701hf0.t("cmd=videoPlayerMetadata&mid=", (String) ((HN) jnA.a()).get(2));
                        C0560Kq c0560Kq = new C0560Kq();
                        c0560Kq.u("https://www.ok.ru/dk");
                        Pattern pattern = TP.e;
                        c0560Kq.m("POST", C2743sL.k(strT, AbstractC1474fG.N("application/x-www-form-urlencoded")));
                        c0560Kq.j("User-Agent", "Mozilla/5.0 (Linux; Android 10.1.2) MXPlayer");
                        c0560Kq.j("Referer", "https://www.ok.ru");
                        AbstractC2051l80 abstractC2051l80 = ((OV) obj).c(c0560Kq.c()).g().r;
                        if (abstractC2051l80 == null) {
                            throw new Exception("Empty response from OK.ru metadata endpoint");
                        }
                        JSONArray jSONArrayOptJSONArray = new JSONObject(abstractC2051l80.q()).optJSONArray("videos");
                        if (jSONArrayOptJSONArray == null) {
                            throw new Exception("No videos array found in OK.ru response");
                        }
                        if (jSONArrayOptJSONArray.length() == 0) {
                            throw new Exception("No video links found in OK.ru response");
                        }
                        String strOptString = jSONArrayOptJSONArray.getJSONObject(jSONArrayOptJSONArray.length() - 1).optString("url");
                        if (strOptString == null) {
                            throw new Exception("No URL found in OK.ru video metadata");
                        }
                        List listT0 = AbstractC1119bh0.t0(strOptString, new String[]{"?"}, 0, 6);
                        if (listT0.size() > 1) {
                            str2 = listT0.get(0) + "/ok.mp4?" + listT0.get(1);
                        } else {
                            str2 = listT0.get(0) + "/ok.mp4";
                        }
                        return new Js0(str2, AbstractC3327yN.y(new C1101bX("Referer", "https://www.ok.ru/")), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4092);
                    }
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
                    c1583gR.f("https://moflix-stream.xyz");
                    P9 p9 = new P9(i);
                    ArrayList arrayList3 = (ArrayList) c1583gR.f793o;
                    arrayList3.add(p9);
                    arrayList3.add(DA.c());
                    Object objB = c1583gR.m().b(TQ.class);
                    AbstractC1474fG.i(objB, "create(...)");
                    TQ tq = (TQ) objB;
                    uq.getClass();
                    uq.l = tq;
                    uq.f552o = 1;
                    objA = tq.a(str, "https://moflix-stream.xyz", uq);
                    if (objA == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Jp0.O(objA);
                        return (Js0) objA;
                    }
                    Jp0.O(objA);
                }
                AbstractC1674hK.w(objA);
                throw null;
            case 1:
                C0560Kq c0560Kq2 = new C0560Kq();
                c0560Kq2.u(str);
                c0560Kq2.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
                c0560Kq2.j("Referer", "https://www.cinecalidad.ec/");
                AbstractC2051l80 abstractC2051l81 = ((OV) obj).c(c0560Kq2.c()).g().r;
                if (abstractC2051l81 == null) {
                    throw new IllegalStateException("Failed to fetch Goodstream HTML");
                }
                String strQ = abstractC2051l81.q();
                System.out.getClass();
                Pattern patternCompile = Pattern.compile("sources:\\s*\\[\\s*\\{\\s*file:\\s*[\"']?(https?://[^\"']+)[\"']?\\s*\\}\\s*\\]");
                AbstractC1474fG.i(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(strQ);
                AbstractC1474fG.i(matcher, "matcher(...)");
                JN jnA2 = AbstractC1370eA.a(matcher, 0, strQ);
                if (jnA2 == null || (str3 = (String) ((HN) jnA2.a()).get(1)) == null) {
                    throw new IllegalStateException("No HLS URL found in Goodstream HTML");
                }
                return new Js0(str3, AbstractC3327yN.z(new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36"), new C1101bX("Referer", "https://goodstream.one/")), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) C1233cq.l, false, 3580);
            default:
                if (interfaceC0473Hh instanceof UV) {
                    uv = (UV) interfaceC0473Hh;
                    int i4 = uv.f553o;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        uv.f553o = i4 - Integer.MIN_VALUE;
                    } else {
                        uv = new UV(this, interfaceC0473Hh);
                    }
                } else {
                    uv = new UV(this, interfaceC0473Hh);
                }
                Object objA2 = uv.m;
                int i5 = uv.f553o;
                if (i5 == 0) {
                    Jp0.O(objA2);
                    uv.l = this;
                    uv.f553o = 1;
                    objA2 = ((TV) obj).a(str, uv);
                    if (objA2 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    vq = this;
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    vq = uv.l;
                    Jp0.O(objA2);
                }
                Pattern patternCompile2 = Pattern.compile("data-options\\s*=\\s*[\\\"']([^\\\"']+)[\\\"']", C3325yL.p(2));
                AbstractC1474fG.i(patternCompile2, "compile(...)");
                String strR = ((C0660On) objA2).R();
                AbstractC1474fG.i(strR, "outerHtml(...)");
                Matcher matcher2 = patternCompile2.matcher(strR);
                AbstractC1474fG.i(matcher2, "matcher(...)");
                JN jnA3 = AbstractC1370eA.a(matcher2, 0, strR);
                if (jnA3 == null || (str4 = (String) ((HN) jnA3.a()).get(1)) == null) {
                    throw new Exception("No se encontró 'data-options' en la página de Ok.ru");
                }
                RN rn = new RN(new C1081bD());
                StringReader stringReader = new StringReader(str4);
                Nm0 nm0 = (Nm0) rn.m;
                nm0.e(stringReader, "", rn);
                C2392ok0 c2392ok0 = new C2392ok0(nm0);
                StringBuilder sbB = AbstractC1021ah0.b();
                while (true) {
                    C1207cd c1207cd = c2392ok0.a;
                    if (c1207cd.n()) {
                        String strH = AbstractC1021ah0.h(sbB);
                        AbstractC1474fG.i(strH, "unescapeEntities(...)");
                        String strR2 = AbstractC1899jh0.R(AbstractC1899jh0.R(strH, "\\&quot;", "\"", false), "&quot;", "\"", false);
                        J60 j60 = J60.IGNORE_CASE;
                        Iterator it = Lc0.T(j60, J60.DOT_MATCHES_ALL).iterator();
                        int i6 = 0;
                        while (it.hasNext()) {
                            i6 |= ((J60) it.next()).l;
                        }
                        Pattern patternCompile3 = Pattern.compile("\\\"videos\\\"\\s*:\\s*\\[(.*?)]", C3325yL.p(i6));
                        AbstractC1474fG.i(patternCompile3, "compile(...)");
                        Matcher matcher3 = patternCompile3.matcher(strR2);
                        AbstractC1474fG.i(matcher3, "matcher(...)");
                        JN jnA4 = AbstractC1370eA.a(matcher3, 0, strR2);
                        if (jnA4 == null || (str5 = (String) ((HN) jnA4.a()).get(1)) == null) {
                            throw new Exception("Ok.ru no publicó el campo 'videos'");
                        }
                        if (AbstractC1899jh0.O(str5)) {
                            throw new Exception("Ok.ru respondió sin fuentes de video");
                        }
                        List listP0 = AbstractC0911Ye.p0(Vb0.Q(Vb0.N(I60.c(new I60("\\{[^{}]*\\\"name\\\"\\s*:\\s*\\\"([^\\\"]+)\\\"[^{}]*\\\"url\\\"\\s*:\\s*\\\"([^\\\"]+)\\\"[^{}]*}", j60), str5), new io.sentry.android.replay.v(13, vq))));
                        if (listP0.isEmpty()) {
                            throw new Exception("No se encontraron videos válidos en el JSON de Ok.ru");
                        }
                        String str6 = (String) ((C1101bX) AbstractC0911Ye.b0(listP0)).m;
                        vq.getClass();
                        return new Js0(str6, AbstractC3327yN.z(new C1101bX("Referer", "https://ok.ru"), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/115.0.0.0 Safari/537.36")), (String) null, (String) null, (String) null, (byte[]) null, (String) null, (String) null, (String) null, (List) null, false, 4092);
                    }
                    sbB.append(c1207cd.j('&'));
                    if (c1207cd.s('&')) {
                        c1207cd.f();
                        int[] iArrB = c2392ok0.b(null, true);
                        if (iArrB == null || iArrB.length == 0) {
                            sbB.append('&');
                        } else {
                            sbB.appendCodePoint(iArrB[0]);
                            if (iArrB.length == 2) {
                                sbB.appendCodePoint(iArrB[1]);
                            }
                        }
                    }
                }
                break;
        }
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        switch (this.b) {
            case 0:
                return "https://moflix-stream.xyz";
            case 1:
                return "https://goodstream.one/";
            default:
                return "https://ok.ru";
        }
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        switch (this.b) {
            case 0:
                return "Moflix";
            case 1:
                return "Goodstream";
            default:
                return "Okru";
        }
    }
}
