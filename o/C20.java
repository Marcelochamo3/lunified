package o;

import android.net.Uri;
import com.skidush.clonex.models.Video$Type;
import java.net.URL;
import java.net.URLEncoder;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class C20 implements Q30 {
    public static final C20 b = new C20();
    public static final OV c;
    public static final LinkedHashMap d;
    public static final List e;
    public static final List f;
    public static final List g;

    static {
        NV nvH = AbstractC1370eA.h();
        nvH.h = true;
        nvH.i = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        nvH.e(15L, timeUnit);
        nvH.i(25L, timeUnit);
        nvH.c.add(new C2480pg(14));
        c = new OV(nvH);
        C1101bX[] c1101bXArr = {new C1101bX("latino", "[LAT]"), new C1101bX("spanish", "[CAST]"), new C1101bX("english", "[SUB]"), new C1101bX("subtitled", "[SUB]")};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC3327yN.x(4));
        for (int i = 0; i < 4; i++) {
            C1101bX c1101bX = c1101bXArr[i];
            linkedHashMap.put(c1101bX.l, c1101bX.m);
        }
        d = linkedHashMap;
        e = AbstractC0937Ze.K(new I60("(?is)<iframe[^>]+src=['\\\"](https?://[^'\\\"]+)['\\\"]"), new I60("(?is)(?:var\\s+url|location\\.href)\\s*=\\s*['\\\"](https?://[^'\\\"]+)['\\\"]"), new I60("(?is)(https?://(?:www\\.)?(?:streamwish|vidhide|voe|dood|waaw|netu)[^'\\\"\\s<]+)"));
        f = AbstractC0937Ze.K("cf-browser-verification", "Checking your browser", "Just a moment...");
        C1233cq c1233cq = C1233cq.l;
        g = AbstractC0937Ze.K(new C2420oz("accion", "Acción", c1233cq), new C2420oz("animacion", "Animación", c1233cq), new C2420oz("crimen", "Crimen", c1233cq), new C2420oz("familia", "Familia", c1233cq), new C2420oz("misterio", "Misterio", c1233cq), new C2420oz("suspenso", "Suspenso", c1233cq), new C2420oz("aventura", "Aventura", c1233cq), new C2420oz("ciencia-ficcion", "Ciencia ficción", c1233cq), new C2420oz("drama", "Drama", c1233cq), new C2420oz("fantasia", "Fantasía", c1233cq), new C2420oz("romance", "Romance", c1233cq), new C2420oz("terror", "Terror", c1233cq));
    }

    public static String A(Cd0 cd0) {
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

    public static String B(String str) {
        String strNormalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        AbstractC1474fG.i(strNormalize, "normalize(...)");
        Pattern patternCompile = Pattern.compile("\\p{Mn}+");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String strReplaceAll = patternCompile.matcher(strNormalize).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        Locale locale = Locale.ROOT;
        String strI = AbstractC1701hf0.i(locale, "ROOT", strReplaceAll, locale, "toLowerCase(...)");
        Pattern patternCompile2 = Pattern.compile("[^a-z0-9]+");
        AbstractC1474fG.i(patternCompile2, "compile(...)");
        String strReplaceAll2 = patternCompile2.matcher(strI).replaceAll("-");
        AbstractC1474fG.i(strReplaceAll2, "replaceAll(...)");
        return AbstractC1119bh0.F0(strReplaceAll2, '-');
    }

    public static String p(String str, String str2) {
        return AbstractC1119bh0.F0(AbstractC1119bh0.x0(str, "/" + str2 + "/", str), '/');
    }

    public static String q(JSONObject jSONObject) {
        String strOptString;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("titles");
        String string = (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) ? null : AbstractC1119bh0.E0(strOptString).toString();
        if (string == null) {
            string = "";
        }
        return AbstractC1899jh0.O(string) ? AbstractC1701hf0.j(jSONObject, "title", "optString(...)") : string;
    }

    public static List w(JSONArray jSONArray) {
        String strOptString;
        if (jSONArray == null) {
            return C1233cq.l;
        }
        ZF zfL = U9.L(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        YF it = zfL.iterator();
        while (it.n) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(it.a());
            Cd0 c1387eR = null;
            if (jSONObjectOptJSONObject != null) {
                C20 c20 = b;
                JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("url");
                String strOptString2 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("slug") : null;
                if (strOptString2 == null) {
                    strOptString2 = "";
                }
                String strF0 = AbstractC1119bh0.F0(AbstractC1119bh0.w0(strOptString2, '/', ""), '/');
                if (!AbstractC1899jh0.O(strF0)) {
                    String strQ = q(jSONObjectOptJSONObject);
                    if (!AbstractC1899jh0.O(strQ)) {
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("images");
                        if (jSONObjectOptJSONObject3 == null || (strOptString = jSONObjectOptJSONObject3.optString("poster")) == null) {
                            strOptString = jSONObjectOptJSONObject.optString("image");
                        }
                        String strV = c20.v(strOptString);
                        String strV2 = c20.v(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("backdrop") : null);
                        String strOptString3 = jSONObjectOptJSONObject.optString("releaseDate");
                        AbstractC1474fG.i(strOptString3, "optString(...)");
                        String strD0 = AbstractC1119bh0.D0(10, strOptString3);
                        String str = AbstractC1899jh0.O(strD0) ? null : strD0;
                        if (AbstractC1899jh0.U(strOptString2, "movies/", false) || AbstractC1899jh0.U(strOptString2, "pelicula/", false)) {
                            c1387eR = new C1387eR(strF0, strQ, null, str, null, null, null, null, strV, strV2, null, null, null, null, null, 31988);
                        } else if (AbstractC1899jh0.U(strOptString2, "series/", false) || AbstractC1899jh0.U(strOptString2, "serie/", false)) {
                            c1387eR = new C2109lo0(strF0, strQ, null, str, null, null, null, null, strV, strV2, null, null, null, null, null, null, 64756);
                        }
                    }
                }
            }
            if (c1387eR != null) {
                arrayList.add(c1387eR);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(A((Cd0) obj))) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    public static List x(JSONObject jSONObject) {
        C1688hY c1688hY;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cast");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray("acting") : null;
        if (jSONArrayOptJSONArray == null) {
            return C1233cq.l;
        }
        ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        YF it = zfL.iterator();
        while (it.n) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(it.a());
            if (jSONObjectOptJSONObject2 == null) {
                c1688hY = null;
            } else {
                String strJ = AbstractC1701hf0.j(jSONObjectOptJSONObject2, "name", "optString(...)");
                if (AbstractC1899jh0.O(strJ)) {
                    c1688hY = null;
                } else {
                    c1688hY = new C1688hY(B(strJ), strJ, b.v(jSONObjectOptJSONObject2.optString("profile")), null, 8);
                }
            }
            if (c1688hY != null) {
                arrayList.add(c1688hY);
            }
        }
        return arrayList;
    }

    public static List y(JSONObject jSONObject) {
        String strOptString;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("genres");
        if (jSONArrayOptJSONArray == null) {
            return C1233cq.l;
        }
        ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
        ArrayList arrayList = new ArrayList();
        YF it = zfL.iterator();
        while (it.n) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(it.a());
            String string = (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("name")) == null) ? null : AbstractC1119bh0.E0(strOptString).toString();
            if (string == null) {
                string = "";
            }
            if (!(!AbstractC1899jh0.O(string))) {
                string = null;
            }
            C2420oz c2420oz = string != null ? new C2420oz(B(string), string) : null;
            if (c2420oz != null) {
                arrayList.add(c2420oz);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object a(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        B20 b20;
        C20 c20;
        if (interfaceC0473Hh instanceof B20) {
            b20 = (B20) interfaceC0473Hh;
            int i2 = b20.f180o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b20.f180o = i2 - Integer.MIN_VALUE;
            } else {
                b20 = new B20(this, interfaceC0473Hh);
            }
        } else {
            b20 = new B20(this, interfaceC0473Hh);
        }
        Object objT = b20.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = b20.f180o;
        if (i3 == 0) {
            Jp0.O(objT);
            if (AbstractC1899jh0.O(str)) {
                return g;
            }
            String strEncode = URLEncoder.encode(AbstractC1119bh0.E0(str).toString(), "UTF-8");
            AbstractC1474fG.i(strEncode, "encode(...)");
            String strR = AbstractC1899jh0.R(strEncode, "+", "%20", false);
            String str2 = r() + "/search?q=" + strR + "&page=" + i;
            b20.l = this;
            b20.f180o = 1;
            objT = t(str2, b20);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            c20 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20 = b20.l;
            Jp0.O(objT);
        }
        JSONArray jSONArrayOptJSONArray = ((JSONObject) objT).optJSONArray("movies");
        c20.getClass();
        return w(jSONArrayOptJSONArray);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0109  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object b(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2814t20 c2814t20;
        C20 c20;
        String str2;
        Double d2;
        if (interfaceC0473Hh instanceof C2814t20) {
            c2814t20 = (C2814t20) interfaceC0473Hh;
            int i = c2814t20.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2814t20.p = i - Integer.MIN_VALUE;
            } else {
                c2814t20 = new C2814t20(this, interfaceC0473Hh);
            }
        } else {
            c2814t20 = new C2814t20(this, interfaceC0473Hh);
        }
        Object obj = c2814t20.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2814t20.p;
        if (i2 == 0) {
            Jp0.O(obj);
            String strP = p(str, "pelicula");
            String strU = u(strP);
            c2814t20.l = this;
            c2814t20.m = strP;
            c2814t20.p = 1;
            Object objT = t(strU, c2814t20);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            c20 = this;
            str2 = strP;
            obj = objT;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = c2814t20.m;
            C20 c21 = c2814t20.l;
            Jp0.O(obj);
            c20 = c21;
            str2 = str3;
        }
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("thisMovie");
        if (jSONObjectOptJSONObject == null) {
            throw new IllegalStateException("PoseidonHD2 movie data not found".toString());
        }
        List listQ = Vb0.Q(new C2591qn(new C1732hv(new C3479zv(Vb0.O("relatedMovies", "otherMovies"), new C3219xC(1, jSONObject), Xb0.t), false, new C5(str2, 6)), new C0717Qs(1, c20, C20.class, "showKey", "showKey(Lcom/skidush/clonex/models/Show;)Ljava/lang/String;", 0, 8), 0));
        c20.getClass();
        String strQ = q(jSONObjectOptJSONObject);
        String strOptString = jSONObjectOptJSONObject.optString("overview");
        String str4 = AbstractC1899jh0.O(strOptString) ? null : strOptString;
        String strOptString2 = jSONObjectOptJSONObject.optString("releaseDate");
        AbstractC1474fG.i(strOptString2, "optString(...)");
        String strD0 = AbstractC1119bh0.D0(10, strOptString2);
        String str5 = AbstractC1899jh0.O(strD0) ? null : strD0;
        Integer num = new Integer(jSONObjectOptJSONObject.optInt("runtime"));
        Integer num2 = num.intValue() > 0 ? num : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("rate");
        if (jSONObjectOptJSONObject2 != null) {
            Double d3 = new Double(jSONObjectOptJSONObject2.optDouble("average"));
            if (d3.doubleValue() > 0.0d) {
                d2 = d3;
            } else {
                d2 = null;
            }
        } else {
            d2 = null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject.optJSONObject("images");
        String strV = c20.v(jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.optString("poster") : null);
        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("images");
        return new C1387eR(str2, strQ, str4, str5, num2, null, null, d2, strV, c20.v(jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("backdrop") : null), y(jSONObjectOptJSONObject), null, x(jSONObjectOptJSONObject), listQ, null, 18528);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // o.Q30
    public final Object c(String str, String str2, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2524q20 c2524q20;
        int iIntValue;
        String str3;
        JSONArray jSONArrayOptJSONArray;
        int iOptInt;
        if (interfaceC0473Hh instanceof C2524q20) {
            c2524q20 = (C2524q20) interfaceC0473Hh;
            int i = c2524q20.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2524q20.p = i - Integer.MIN_VALUE;
            } else {
                c2524q20 = new C2524q20(this, interfaceC0473Hh);
            }
        } else {
            c2524q20 = new C2524q20(this, interfaceC0473Hh);
        }
        Object obj = c2524q20.n;
        Object obj2 = EnumC1706hi.l;
        int i2 = c2524q20.p;
        C1233cq c1233cq = C1233cq.l;
        if (i2 == 0) {
            Jp0.O(obj);
            String strP = p(str2 == null ? AbstractC1119bh0.B0(str, "/temporada/") : str2, "serie");
            Integer numJ = AbstractC1802ih0.J(AbstractC1119bh0.y0(str, '/', str));
            if (numJ != null) {
                iIntValue = numJ.intValue();
                String strZ = z(strP);
                c2524q20.l = strP;
                c2524q20.m = iIntValue;
                c2524q20.p = 1;
                Object objT = t(strZ, c2524q20);
                if (objT == obj2) {
                    return obj2;
                }
                str3 = strP;
                obj = objT;
            }
            return c1233cq;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        iIntValue = c2524q20.m;
        str3 = c2524q20.l;
        Jp0.O(obj);
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("thisSerie");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("serie");
        }
        if (jSONObjectOptJSONObject == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("seasons")) == null) {
            return c1233cq;
        }
        int length = jSONArrayOptJSONArray.length();
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.optInt("number") == iIntValue) {
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("episodes");
                if (jSONArrayOptJSONArray2 == null) {
                    return c1233cq;
                }
                ZF zfL = U9.L(z ? 1 : 0, jSONArrayOptJSONArray2.length());
                ArrayList arrayList = new ArrayList();
                YF it = zfL.iterator();
                while (it.n) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(it.a());
                    C0456Gq c0456Gq = null;
                    if (jSONObjectOptJSONObject3 != null && (iOptInt = jSONObjectOptJSONObject3.optInt("number")) >= 1) {
                        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("url");
                        String strOptString = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.optString("slug") : null;
                        if (strOptString == null) {
                            strOptString = "";
                        }
                        String strR = AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1119bh0.l0(strOptString, "series/"), "/seasons/", "/temporada/", z), "/episodes/", "/episodio/", z);
                        if (AbstractC1899jh0.O(strR)) {
                            strR = str3 + "/temporada/" + iIntValue + "/episodio/" + iOptInt;
                        }
                        String str4 = strR;
                        String strOptString2 = jSONObjectOptJSONObject3.optString("title");
                        if (AbstractC1899jh0.O(strOptString2)) {
                            strOptString2 = AbstractC1674hK.n(iOptInt, "Episodio ");
                        }
                        String str5 = strOptString2;
                        String strOptString3 = jSONObjectOptJSONObject3.optString("releaseDate");
                        AbstractC1474fG.i(strOptString3, "optString(...)");
                        String strD0 = AbstractC1119bh0.D0(10, strOptString3);
                        c0456Gq = new C0456Gq(str4, iOptInt, str5, AbstractC1899jh0.O(strD0) ? null : strD0, b.v(jSONObjectOptJSONObject3.optString("image")), null, null, 96);
                    }
                    if (c0456Gq != null) {
                        arrayList.add(c0456Gq);
                    }
                    z = false;
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (hashSet.add(((C0456Gq) obj3).a)) {
                        arrayList2.add(obj3);
                    }
                }
                return AbstractC0911Ye.r0(arrayList2, new N2(29));
            }
            i3++;
            z = false;
        }
        return c1233cq;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object d(int i, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3299y20 c3299y20;
        C20 c20;
        if (interfaceC0473Hh instanceof C3299y20) {
            c3299y20 = (C3299y20) interfaceC0473Hh;
            int i2 = c3299y20.f1130o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3299y20.f1130o = i2 - Integer.MIN_VALUE;
            } else {
                c3299y20 = new C3299y20(this, interfaceC0473Hh);
            }
        } else {
            c3299y20 = new C3299y20(this, interfaceC0473Hh);
        }
        Object objT = c3299y20.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c3299y20.f1130o;
        if (i3 == 0) {
            Jp0.O(objT);
            String strD = i <= 1 ? AbstractC1701hf0.d(r(), "/series") : r() + "/series/page/" + i;
            c3299y20.l = this;
            c3299y20.f1130o = 1;
            objT = t(strD, c3299y20);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            c20 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20 = c3299y20.l;
            Jp0.O(objT);
        }
        JSONArray jSONArrayOptJSONArray = ((JSONObject) objT).optJSONArray("movies");
        c20.getClass();
        List listW = w(jSONArrayOptJSONArray);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW) {
            if (obj instanceof C2109lo0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // o.Q30
    public final Object e(Video$Type video$Type, String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3105w20 c3105w20;
        String strE;
        JSONObject jSONObjectOptJSONObject;
        Video$Type video$Type2 = video$Type;
        if (interfaceC0473Hh instanceof C3105w20) {
            c3105w20 = (C3105w20) interfaceC0473Hh;
            int i = c3105w20.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3105w20.p = i - Integer.MIN_VALUE;
            } else {
                c3105w20 = new C3105w20(this, interfaceC0473Hh);
            }
        } else {
            c3105w20 = new C3105w20(this, interfaceC0473Hh);
        }
        Object objT = c3105w20.n;
        Object obj = EnumC1706hi.l;
        int i2 = c3105w20.p;
        if (i2 == 0) {
            Jp0.O(objT);
            if (video$Type2 instanceof Is0) {
                strE = u(p(str, "pelicula"));
            } else {
                if (!(video$Type2 instanceof Hs0)) {
                    throw new C0730Rf();
                }
                String strP = p(str, "serie");
                if (AbstractC1119bh0.W(strP, "/episodio/", false)) {
                    strE = AbstractC1701hf0.e(r(), "/serie/", strP);
                } else {
                    Hs0 hs0 = (Hs0) video$Type2;
                    strE = r() + "/serie/" + strP + "/temporada/" + hs0.q.l + "/episodio/" + hs0.m;
                }
            }
            c3105w20.l = video$Type2;
            c3105w20.m = strE;
            c3105w20.p = 1;
            objT = t(strE, c3105w20);
            if (objT == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = c3105w20.m;
            Video$Type video$Type3 = c3105w20.l;
            Jp0.O(objT);
            strE = str2;
            video$Type2 = video$Type3;
        }
        JSONObject jSONObject = (JSONObject) objT;
        if (video$Type2 instanceof Is0) {
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("thisMovie");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("videos");
            } else {
                jSONObjectOptJSONObject = null;
            }
        } else {
            if (!(video$Type2 instanceof Hs0)) {
                throw new C0730Rf();
            }
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("episode");
            if (jSONObjectOptJSONObject3 == null) {
                jSONObjectOptJSONObject3 = jSONObject.optJSONObject("thisEpisode");
            }
            if (jSONObjectOptJSONObject3 != null) {
                jSONObjectOptJSONObject = jSONObjectOptJSONObject3.optJSONObject("videos");
            } else {
                jSONObjectOptJSONObject = null;
            }
        }
        if (jSONObjectOptJSONObject == null) {
            return C1233cq.l;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : d.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str3);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i3 = 0; i3 < length; i3++) {
                    JSONObject jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject4 != null) {
                        String strJ = AbstractC1701hf0.j(jSONObjectOptJSONObject4, "result", "optString(...)");
                        if (AbstractC1899jh0.U(strJ, "http", false)) {
                            String strOptString = jSONObjectOptJSONObject4.optString("cyberlocker");
                            if (AbstractC1899jh0.O(strOptString)) {
                                strOptString = "Servidor";
                            }
                            String strOptString2 = jSONObjectOptJSONObject4.optString("quality");
                            AbstractC1474fG.g(strOptString2);
                            if (!(!AbstractC1899jh0.O(strOptString2))) {
                                strOptString2 = null;
                            }
                            arrayList.add(new Ds0(strJ, AbstractC0911Ye.h0(X5.P(new String[]{strOptString, strOptString2, str4}), " ", null, null, null, 62), strJ, AbstractC3327yN.y(new C1101bX("Referer", strE)), 48));
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((Ds0) obj2).l)) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    @Override // o.Q30
    public final String f() {
        return AbstractC1701hf0.d(r(), "/_next/image?url=%2F_next%2Fstatic%2Fmedia%2Fposeidonhd2.86e0c298.png&w=640&q=75");
    }

    /* JADX WARN: Code duplicated, block: B:55:0x015f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [o.cq] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.ArrayList] */
    @Override // o.Q30
    public final Object g(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2717s20 c2717s20;
        C20 c20;
        C20 c21;
        C2109lo0 c2109lo0;
        Cd0 cd0A;
        if (interfaceC0473Hh instanceof C2717s20) {
            c2717s20 = (C2717s20) interfaceC0473Hh;
            int i = c2717s20.f1017o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2717s20.f1017o = i - Integer.MIN_VALUE;
            } else {
                c2717s20 = new C2717s20(this, interfaceC0473Hh);
            }
        } else {
            c2717s20 = new C2717s20(this, interfaceC0473Hh);
        }
        Object objT = c2717s20.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2717s20.f1017o;
        if (i2 == 0) {
            Jp0.O(objT);
            String strR = r();
            c2717s20.l = this;
            c2717s20.f1017o = 1;
            objT = t(strR, c2717s20);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            c20 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20 = c2717s20.l;
            Jp0.O(objT);
        }
        JSONObject jSONObject = (JSONObject) objT;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("sliderItems");
        c20.getClass();
        List listW = w(jSONArrayOptJSONArray);
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(listW, 10));
        Iterator it = listW.iterator();
        while (true) {
            ?? arrayList3 = 0;
            if (!it.hasNext()) {
                if (!arrayList2.isEmpty()) {
                    arrayList.add(new C0882Xb("Featured", arrayList2));
                }
                Iterator it2 = AbstractC0937Ze.K(new C1101bX("tabLastMovies", "Últimas películas"), new C1101bX("tabTopMovies", "Películas destacadas"), new C1101bX("tabLastReleasedMovies", "Estrenos de películas"), new C1101bX("series", "Últimas series"), new C1101bX("topSeriesDay", "Series destacadas")).iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    c21 = b;
                    if (!zHasNext) {
                        break;
                    }
                    C1101bX c1101bX = (C1101bX) it2.next();
                    String str = (String) c1101bX.l;
                    String str2 = (String) c1101bX.m;
                    List listW2 = w(jSONObject.optJSONArray(str));
                    if (!(!listW2.isEmpty())) {
                        listW2 = null;
                    }
                    if (listW2 != null) {
                        arrayList.add(new C0882Xb(str2, listW2));
                    }
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("episodes");
                if (jSONArrayOptJSONArray2 != null) {
                    ZF zfL = U9.L(0, jSONArrayOptJSONArray2.length());
                    ArrayList arrayList4 = new ArrayList();
                    YF it3 = zfL.iterator();
                    while (it3.n) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray2.optJSONObject(it3.a());
                        if (jSONObjectOptJSONObject != null) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("url");
                            String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("slug") : null;
                            if (strOptString == null) {
                                strOptString = "";
                            }
                            String strB0 = AbstractC1119bh0.B0(AbstractC1119bh0.x0(strOptString, "series/", ""), "/seasons");
                            if (AbstractC1899jh0.O(strB0)) {
                                c2109lo0 = null;
                            } else {
                                String strOptString2 = jSONObjectOptJSONObject.optString("title");
                                AbstractC1474fG.i(strOptString2, "optString(...)");
                                c2109lo0 = new C2109lo0(strB0, strOptString2, null, null, null, null, null, null, c21.v(jSONObjectOptJSONObject.optString("image")), null, null, null, null, null, null, null, 65276);
                            }
                        } else {
                            c2109lo0 = null;
                        }
                        if (c2109lo0 != null) {
                            arrayList4.add(c2109lo0);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    arrayList3 = new ArrayList();
                    for (Object obj : arrayList4) {
                        if (hashSet.add(((C2109lo0) obj).a)) {
                            arrayList3.add(obj);
                        }
                    }
                }
                if (arrayList3 == 0) {
                    arrayList3 = C1233cq.l;
                }
                if (!arrayList3.isEmpty()) {
                    arrayList.add(new C0882Xb("Últimos episodios", arrayList3));
                }
                return arrayList;
            }
            Cd0 cd0 = (Cd0) it.next();
            if (cd0 instanceof C1387eR) {
                C1387eR c1387eR = (C1387eR) cd0;
                String str3 = c1387eR.i;
                if (str3 == null) {
                    str3 = c1387eR.h;
                }
                cd0A = C1387eR.f(c1387eR, str3, null, 32255);
            } else {
                if (!(cd0 instanceof C2109lo0)) {
                    throw new C0730Rf();
                }
                C2109lo0 c2109lo1 = (C2109lo0) cd0;
                String str4 = c2109lo1.i;
                if (str4 == null) {
                    str4 = c2109lo1.h;
                }
                cd0A = C2109lo0.a(c2109lo1, null, null, null, str4, null, null, 65023);
            }
            arrayList2.add(cd0A);
        }
    }

    @Override // o.Q30
    public final String getName() {
        return "PoseidonHD2";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // o.Q30
    public final Object h(String str, int i, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2620r20 c2620r20;
        String strE;
        String str2;
        C20 c20;
        Object next;
        String strS;
        if (interfaceC0473Hh instanceof C2620r20) {
            c2620r20 = (C2620r20) interfaceC0473Hh;
            int i2 = c2620r20.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2620r20.p = i2 - Integer.MIN_VALUE;
            } else {
                c2620r20 = new C2620r20(this, interfaceC0473Hh);
            }
        } else {
            c2620r20 = new C2620r20(this, interfaceC0473Hh);
        }
        Object objT = c2620r20.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2620r20.p;
        if (i3 == 0) {
            Jp0.O(objT);
            String strZ0 = AbstractC1119bh0.z0(AbstractC1119bh0.F0(str, '/'), "genero/");
            if (i <= 1) {
                strE = AbstractC1701hf0.e(r(), "/genero/", strZ0);
            } else {
                strE = r() + "/genero/" + strZ0 + "/page/" + i;
            }
            c2620r20.l = strZ0;
            c2620r20.m = this;
            c2620r20.p = 1;
            objT = t(strE, c2620r20);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strZ0;
            c20 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20 = c2620r20.m;
            str2 = c2620r20.l;
            Jp0.O(objT);
        }
        JSONArray jSONArrayOptJSONArray = ((JSONObject) objT).optJSONArray("movies");
        c20.getClass();
        List listW = w(jSONArrayOptJSONArray);
        Iterator it = g.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC1474fG.b(((C2420oz) next).a, str2));
        C2420oz c2420oz = (C2420oz) next;
        if (c2420oz == null || (strS = c2420oz.b) == null) {
            strS = AbstractC1899jh0.S(str2, '-', ' ');
            if (strS.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(strS.charAt(0));
                AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                AbstractC1474fG.i(upperCase, "toUpperCase(...)");
                sb.append((Object) upperCase);
                String strSubstring = strS.substring(1);
                AbstractC1474fG.i(strSubstring, "substring(...)");
                sb.append(strSubstring);
                strS = sb.toString();
            }
        }
        return new C2420oz(str2, strS, listW);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.Q30
    public final Object i(int i, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2911u20 c2911u20;
        C20 c20;
        if (interfaceC0473Hh instanceof C2911u20) {
            c2911u20 = (C2911u20) interfaceC0473Hh;
            int i2 = c2911u20.f1052o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c2911u20.f1052o = i2 - Integer.MIN_VALUE;
            } else {
                c2911u20 = new C2911u20(this, interfaceC0473Hh);
            }
        } else {
            c2911u20 = new C2911u20(this, interfaceC0473Hh);
        }
        Object objT = c2911u20.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = c2911u20.f1052o;
        if (i3 == 0) {
            Jp0.O(objT);
            String strD = i <= 1 ? AbstractC1701hf0.d(r(), "/peliculas") : r() + "/peliculas/page/" + i;
            c2911u20.l = this;
            c2911u20.f1052o = 1;
            objT = t(strD, c2911u20);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            c20 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20 = c2911u20.l;
            Jp0.O(objT);
        }
        JSONArray jSONArrayOptJSONArray = ((JSONObject) objT).optJSONArray("movies");
        c20.getClass();
        List listW = w(jSONArrayOptJSONArray);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listW) {
            if (obj instanceof C1387eR) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // o.Q30
    public final Object j(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3202x20 c3202x20;
        String str2;
        C20 c20;
        ArrayList arrayList;
        Double d2;
        int iOptInt;
        if (interfaceC0473Hh instanceof C3202x20) {
            c3202x20 = (C3202x20) interfaceC0473Hh;
            int i = c3202x20.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3202x20.p = i - Integer.MIN_VALUE;
            } else {
                c3202x20 = new C3202x20(this, interfaceC0473Hh);
            }
        } else {
            c3202x20 = new C3202x20(this, interfaceC0473Hh);
        }
        Object obj = c3202x20.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c3202x20.p;
        if (i2 == 0) {
            Jp0.O(obj);
            String strP = p(str, "serie");
            String strZ = z(strP);
            c3202x20.l = this;
            c3202x20.m = strP;
            c3202x20.p = 1;
            Object objT = t(strZ, c3202x20);
            if (objT == enumC1706hi) {
                return enumC1706hi;
            }
            str2 = strP;
            obj = objT;
            c20 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = c3202x20.m;
            c20 = c3202x20.l;
            Jp0.O(obj);
            str2 = str3;
        }
        JSONObject jSONObject = (JSONObject) obj;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("thisSerie");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = jSONObject.optJSONObject("serie");
        }
        if (jSONObjectOptJSONObject == null) {
            throw new IllegalStateException("PoseidonHD2 series data not found".toString());
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("images");
        String strV = c20.v(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("poster") : null);
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("seasons");
        if (jSONArrayOptJSONArray != null) {
            ZF zfL = U9.L(0, jSONArrayOptJSONArray.length());
            arrayList = new ArrayList();
            for (YF it = zfL.iterator(); it.n; it = it) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray.optJSONObject(it.a());
                Ma0 ma0 = (jSONObjectOptJSONObject3 != null && (iOptInt = jSONObjectOptJSONObject3.optInt("number")) >= 1) ? new Ma0(str2 + "/temporada/" + iOptInt, iOptInt, AbstractC1674hK.n(iOptInt, "Temporada "), strV, null, null, 48) : null;
                if (ma0 != null) {
                    arrayList.add(ma0);
                }
                arrayList = arrayList;
            }
        } else {
            arrayList = null;
        }
        List list = arrayList == null ? C1233cq.l : arrayList;
        String strQ = q(jSONObjectOptJSONObject);
        String strOptString = jSONObjectOptJSONObject.optString("overview");
        String str4 = AbstractC1899jh0.O(strOptString) ? null : strOptString;
        String strOptString2 = jSONObjectOptJSONObject.optString("releaseDate");
        AbstractC1474fG.i(strOptString2, "optString(...)");
        String strD0 = AbstractC1119bh0.D0(10, strOptString2);
        String str5 = AbstractC1899jh0.O(strD0) ? null : strD0;
        JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject.optJSONObject("rate");
        if (jSONObjectOptJSONObject4 != null) {
            Double d3 = new Double(jSONObjectOptJSONObject4.optDouble("average"));
            if (d3.doubleValue() > 0.0d) {
                d2 = d3;
            } else {
                d2 = null;
            }
        } else {
            d2 = null;
        }
        JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject.optJSONObject("images");
        return new C2109lo0(str2, strQ, str4, str5, null, null, null, d2, strV, c20.v(jSONObjectOptJSONObject5 != null ? jSONObjectOptJSONObject5.optString("backdrop") : null), null, list, y(jSONObjectOptJSONObject), null, x(jSONObjectOptJSONObject), null, 42096);
    }

    @Override // o.Q30
    public final Object k(String str, int i, InterfaceC0473Hh interfaceC0473Hh) {
        String strDecode = Uri.decode(str);
        AbstractC1474fG.i(strDecode, "decode(...)");
        String strS = AbstractC1899jh0.S(strDecode, '-', ' ');
        if (strS.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(strS.charAt(0));
            AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            AbstractC1474fG.i(upperCase, "toUpperCase(...)");
            sb.append((Object) upperCase);
            String strSubstring = strS.substring(1);
            AbstractC1474fG.i(strSubstring, "substring(...)");
            sb.append(strSubstring);
            strS = sb.toString();
        }
        return new C1688hY(str, strS, null, null, 12);
    }

    @Override // o.Q30
    public final boolean l() {
        return true;
    }

    @Override // o.Q30
    public final String m() {
        return "es";
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x010b  */
    /* JADX WARN: Code duplicated, block: B:56:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0129  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0168 A[PHI: r0
  0x0168: PHI (r0v43 java.lang.Object) = (r0v27 java.lang.Object), (r0v1 java.lang.Object) binds: [B:62:0x0165, B:13:0x0031] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00ff, please report this as an issue */
    @Override // o.Q30
    public final Object n(Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C3396z20 c3396z20;
        String strT;
        Object objK;
        C20 c20;
        boolean z;
        String path;
        Ds0 ds1 = ds0;
        if (interfaceC0473Hh instanceof C3396z20) {
            c3396z20 = (C3396z20) interfaceC0473Hh;
            int i = c3396z20.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3396z20.q = i - Integer.MIN_VALUE;
            } else {
                c3396z20 = new C3396z20(this, interfaceC0473Hh);
            }
        } else {
            c3396z20 = new C3396z20(this, interfaceC0473Hh);
        }
        Object objJ = c3396z20.f1144o;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c3396z20.q;
        if (i2 == 0) {
            Jp0.O(objJ);
            String str = ds1.n;
            if (AbstractC1899jh0.O(str)) {
                str = ds1.l;
            }
            strT = str;
            try {
                String host = new URL(strT).getHost();
                AbstractC1474fG.i(host, "getHost(...)");
                if (AbstractC1899jh0.U(host, "player.", false)) {
                    String host2 = new URL(strT).getHost();
                    AbstractC1474fG.i(host2, "getHost(...)");
                    if (AbstractC1119bh0.W(host2, "poseidonhd2", false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                objK = Boolean.valueOf(z);
            } catch (Throwable th) {
                objK = Jp0.k(th);
            }
            Object obj = Boolean.FALSE;
            if (objK instanceof C2439p80) {
                objK = obj;
            }
            if (((Boolean) objK).booleanValue()) {
                c3396z20.l = this;
                c3396z20.m = ds1;
                c3396z20.n = strT;
                c3396z20.q = 1;
                objJ = AbstractC1376eG.J(AbstractC1910jn.b, new A20(strT, null), c3396z20);
                if (objJ == enumC1706hi) {
                    return enumC1706hi;
                }
                c20 = this;
            }
            if (AbstractC1119bh0.W(strT, "voe.sx", true)) {
                path = Uri.parse(strT).getPath();
                if (path == null) {
                    path = "";
                }
                if (!AbstractC1899jh0.U(AbstractC1119bh0.I0(path, '/'), "e/", false)) {
                    String path2 = Uri.parse(strT).getPath();
                    strT = AbstractC1701hf0.t("https://voe.sx/e/", AbstractC1119bh0.I0(path2 != null ? path2 : "", '/'));
                }
            }
            int i3 = AbstractC3473zs.a;
            String str2 = ds1.m;
            AbstractC1474fG.j(strT, "id");
            AbstractC1474fG.j(str2, "name");
            Ds0 ds2 = new Ds0(strT, str2, strT, ds1.f223o, ds1.p, ds1.q);
            c3396z20.l = null;
            c3396z20.m = null;
            c3396z20.n = null;
            c3396z20.q = 3;
            objJ = C0622Nb.m(strT, ds2, c3396z20, 4);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
            return objJ;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                Jp0.O(objJ);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
            return objJ;
        }
        String str3 = c3396z20.n;
        Ds0 ds3 = c3396z20.m;
        c20 = c3396z20.l;
        Jp0.O(objJ);
        strT = str3;
        ds1 = ds3;
        String str4 = (String) objJ;
        if (str4 == null) {
            Hv0 hv0 = new Hv0();
            Map mapZ = AbstractC3327yN.z(new C1101bX("Referer", c20.r()), new C1101bX("User-Agent", "Mozilla/5.0 (Linux; Android 13; Pixel 7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Mobile Safari/537.36"));
            c3396z20.l = null;
            c3396z20.m = null;
            c3396z20.n = null;
            c3396z20.q = 2;
            objJ = hv0.g(strT, mapZ, c3396z20);
            return objJ == enumC1706hi ? enumC1706hi : objJ;
        }
        strT = str4;
        if (AbstractC1119bh0.W(strT, "voe.sx", true)) {
            path = Uri.parse(strT).getPath();
            if (path == null) {
                path = "";
            }
            if (!AbstractC1899jh0.U(AbstractC1119bh0.I0(path, '/'), "e/", false)) {
                String path3 = Uri.parse(strT).getPath();
                strT = AbstractC1701hf0.t("https://voe.sx/e/", AbstractC1119bh0.I0(path3 != null ? path3 : "", '/'));
            }
        }
        int i4 = AbstractC3473zs.a;
        String str5 = ds1.m;
        AbstractC1474fG.j(strT, "id");
        AbstractC1474fG.j(str5, "name");
        Ds0 ds4 = new Ds0(strT, str5, strT, ds1.f223o, ds1.p, ds1.q);
        c3396z20.l = null;
        c3396z20.m = null;
        c3396z20.n = null;
        c3396z20.q = 3;
        objJ = C0622Nb.m(strT, ds4, c3396z20, 4);
        if (objJ == enumC1706hi) {
            return enumC1706hi;
        }
        return objJ;
    }

    @Override // o.Q30
    public final Object o(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return C2985uq0.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0014  */
    public final String r() {
        String strB = Cr0.n.b();
        if (strB == null) {
            strB = "www.poseidonhd2.co";
        } else {
            if (!(!AbstractC1899jh0.O(strB))) {
                strB = null;
            }
            if (strB == null) {
                strB = "www.poseidonhd2.co";
            }
        }
        return "https://".concat(strB);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object s(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C2330o20 c2330o20;
        if (interfaceC0473Hh instanceof C2330o20) {
            c2330o20 = (C2330o20) interfaceC0473Hh;
            int i = c2330o20.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2330o20.n = i - Integer.MIN_VALUE;
            } else {
                c2330o20 = new C2330o20(this, interfaceC0473Hh);
            }
        } else {
            c2330o20 = new C2330o20(this, interfaceC0473Hh);
        }
        Object objJ = c2330o20.l;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c2330o20.n;
        if (i2 == 0) {
            Jp0.O(objJ);
            ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
            C2427p20 c2427p20 = new C2427p20(str, null);
            c2330o20.n = 1;
            objJ = AbstractC1376eG.J(executorC0891Xk, c2427p20, c2330o20);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objJ);
        }
        AbstractC1474fG.i(objJ, "withContext(...)");
        return objJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object t(String str, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3008v20 c3008v20;
        if (interfaceC0473Hh instanceof C3008v20) {
            c3008v20 = (C3008v20) interfaceC0473Hh;
            int i = c3008v20.f1067o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3008v20.f1067o = i - Integer.MIN_VALUE;
            } else {
                c3008v20 = new C3008v20(this, interfaceC0473Hh);
            }
        } else {
            c3008v20 = new C3008v20(this, interfaceC0473Hh);
        }
        Object objS = c3008v20.m;
        Object obj = EnumC1706hi.l;
        int i2 = c3008v20.f1067o;
        if (i2 == 0) {
            Jp0.O(objS);
            c3008v20.l = str;
            c3008v20.f1067o = 1;
            objS = s(str, c3008v20);
            if (objS == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c3008v20.l;
            Jp0.O(objS);
        }
        C3176wp c3176wpX = ((C0660On) objS).X("script#__NEXT_DATA__");
        String strM = c3176wpX != null ? c3176wpX.M() : null;
        if (strM != null) {
            JSONObject jSONObject = new JSONObject(strM).getJSONObject("props").getJSONObject("pageProps");
            AbstractC1474fG.i(jSONObject, "getJSONObject(...)");
            return jSONObject;
        }
        throw new IllegalStateException(("PoseidonHD2 __NEXT_DATA__ not found at " + str).toString());
    }

    public final String u(String str) {
        return AbstractC1899jh0.U(str, "http", false) ? str : AbstractC1701hf0.e(r(), "/pelicula/", AbstractC1119bh0.F0(str, '/'));
    }

    public final String v(String str) {
        Object objK;
        String string = str != null ? AbstractC1119bh0.E0(str).toString() : null;
        if (string == null) {
            string = "";
        }
        if (AbstractC1899jh0.O(string)) {
            return null;
        }
        try {
            objK = Uri.parse(string).getQueryParameter("url");
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        String str2 = (String) objK;
        if (str2 != null) {
            String str3 = AbstractC1899jh0.O(str2) ^ true ? str2 : null;
            if (str3 != null) {
                string = str3;
            }
        }
        if (AbstractC1899jh0.U(string, "http://", false) || AbstractC1899jh0.U(string, "https://", false)) {
            return string;
        }
        if (AbstractC1899jh0.U(string, "//", false)) {
            return "https:".concat(string);
        }
        return (string.length() <= 0 || !AbstractC3021v9.i(string.charAt(0), '/', false)) ? AbstractC1701hf0.e(r(), "/", string) : AbstractC1701hf0.d(r(), string);
    }

    public final String z(String str) {
        return AbstractC1899jh0.U(str, "http", false) ? str : AbstractC1701hf0.e(r(), "/serie/", AbstractC1119bh0.F0(str, '/'));
    }
}
