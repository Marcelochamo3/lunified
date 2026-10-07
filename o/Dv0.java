package o;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import j$.util.Objects;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class Dv0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f225o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Map q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dv0(Context context, String str, Map map, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f225o = context;
        this.p = str;
        this.q = map;
    }

    public static final void w(IF r15, AtomicBoolean atomicBoolean, InterfaceC1594gb interfaceC1594gb, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, IF r20, Map map, String str, String str2, InterfaceC1608gi interfaceC1608gi, Handler handler, Object obj, IF r27, WebView webView, RB rb) {
        int i;
        String str3;
        if (Lc0.T(TB.l, TB.m, TB.n, TB.q).contains(rb.b)) {
            y(interfaceC1594gb, atomicBoolean2, atomicBoolean3, r20, map, str, str2, handler, obj, r27, webView, rb);
            return;
        }
        RB rb2 = (RB) r15.m;
        if (rb2 == null || (str3 = rb2.a) == null) {
            i = -1;
        } else {
            String strW0 = AbstractC1119bh0.w0(str3, '?', "");
            i = 0;
            for (int i2 = 0; i2 < strW0.length(); i2++) {
                if (strW0.charAt(i2) == '&') {
                    i++;
                }
            }
        }
        String strW1 = AbstractC1119bh0.w0(rb.a, '?', "");
        int i3 = 0;
        for (int i4 = 0; i4 < strW1.length(); i4++) {
            if (strW1.charAt(i4) == '&') {
                i3++;
            }
        }
        if (rb2 == null || i3 > i) {
            r15.m = rb;
        }
        if (atomicBoolean.compareAndSet(false, true)) {
            z(atomicBoolean2, interfaceC1594gb, handler, obj, 7000L, new Cv0(r15, interfaceC1594gb, atomicBoolean2, atomicBoolean3, r20, map, str, str2, interfaceC1608gi, handler, obj, r27, webView));
        }
    }

    public static final void x(AtomicBoolean atomicBoolean, Handler handler, Object obj, IF r5, WebView webView, String str) {
        if (atomicBoolean.compareAndSet(false, true)) {
            handler.removeCallbacksAndMessages(obj);
            RunnableC1938k1 runnableC1938k1 = new RunnableC1938k1(str, r5, webView);
            if (AbstractC1474fG.b(Looper.myLooper(), Looper.getMainLooper())) {
                runnableC1938k1.run();
            } else {
                handler.post(runnableC1938k1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:91:0x018e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0195  */
    /* JADX WARN: Code duplicated, block: B:95:0x0198  */
    public static final void y(InterfaceC1594gb interfaceC1594gb, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, IF r23, Map map, String str, String str2, Handler handler, Object obj, IF r29, WebView webView, RB rb) {
        String str3;
        String cookie;
        String str4;
        Uri uri;
        String scheme;
        String host;
        if (interfaceC1594gb.a() && !atomicBoolean.get() && AbstractC1468fA.s(rb.a) && atomicBoolean2.compareAndSet(false, true)) {
            String str5 = rb.a;
            r23.m = str5;
            map.clear();
            Set setT = Lc0.T("referer", "origin", "user-agent", "authorization", "cookie", "accept", "accept-language", "range");
            for (Map.Entry entry : AbstractC1468fA.a(rb.h, str5, rb.g).entrySet()) {
                String str6 = (String) entry.getKey();
                String str7 = (String) entry.getValue();
                String lowerCase = str6.toLowerCase(Locale.ROOT);
                AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
                if (setT.contains(lowerCase)) {
                    map.put(str6, str7);
                }
            }
            String str8 = rb.d;
            if (str8 == null) {
                str3 = str;
            } else {
                if (!AbstractC1899jh0.U(str8, "http", false)) {
                    str8 = null;
                }
                if (str8 == null) {
                    str3 = str;
                } else {
                    str3 = str8;
                }
            }
            Set setKeySet = map.keySet();
            if ((setKeySet instanceof Collection) && setKeySet.isEmpty()) {
                map.put("User-Agent", str2);
            } else {
                Iterator it = setKeySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        map.put("User-Agent", str2);
                    } else if (AbstractC1899jh0.N((String) it.next(), "User-Agent", true)) {
                    }
                }
            }
            Set setKeySet2 = map.keySet();
            if (!(setKeySet2 instanceof Collection) || !setKeySet2.isEmpty()) {
                Iterator it2 = setKeySet2.iterator();
                do {
                    if (!it2.hasNext()) {
                        map.put("Referer", str3);
                        break;
                    }
                } while (!AbstractC1899jh0.N((String) it2.next(), "Referer", true));
            } else {
                map.put("Referer", str3);
                break;
            }
            Set setKeySet3 = map.keySet();
            if ((setKeySet3 instanceof Collection) && setKeySet3.isEmpty()) {
                uri = Uri.parse(str3);
                scheme = uri.getScheme();
                if (scheme != null) {
                    map.put("Origin", uri.getScheme() + "://" + uri.getHost());
                }
            } else {
                Iterator it3 = setKeySet3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        try {
                            uri = Uri.parse(str3);
                            scheme = uri.getScheme();
                            if (scheme != null && !AbstractC1899jh0.O(scheme) && (host = uri.getHost()) != null && !AbstractC1899jh0.O(host)) {
                                map.put("Origin", uri.getScheme() + "://" + uri.getHost());
                            }
                        } catch (Throwable th) {
                            Jp0.k(th);
                        }
                    } else if (AbstractC1899jh0.N((String) it3.next(), "Origin", true)) {
                    }
                }
            }
            Set setKeySet4 = map.keySet();
            if ((setKeySet4 instanceof Collection) && setKeySet4.isEmpty()) {
                cookie = CookieManager.getInstance().getCookie(str5);
                if (cookie != null) {
                    if (true ^ AbstractC1899jh0.O(cookie)) {
                    }
                    if (str4 != null) {
                        map.put("Cookie", str4);
                    }
                }
            } else {
                Iterator it4 = setKeySet4.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        cookie = CookieManager.getInstance().getCookie(str5);
                        if (cookie != null) {
                            str4 = true ^ AbstractC1899jh0.O(cookie) ? cookie : null;
                            if (str4 != null) {
                                map.put("Cookie", str4);
                            }
                        }
                    } else if (AbstractC1899jh0.N((String) it4.next(), "Cookie", true)) {
                    }
                }
            }
            Objects.toString(rb.b);
            System.out.getClass();
            x(atomicBoolean, handler, obj, r29, webView, "HLS found by reusable detector");
            if (interfaceC1594gb.a()) {
                interfaceC1594gb.j(new Js0(rb.a, AbstractC3327yN.B(map), "hls", (String) null, (String) null, (byte[]) null, rb.e, str3, (String) null, (List) null, false, 3896));
            }
        }
    }

    public static final void z(AtomicBoolean atomicBoolean, InterfaceC1594gb interfaceC1594gb, Handler handler, Object obj, long j, InterfaceC0360Cy interfaceC0360Cy) {
        if (atomicBoolean.get() || !interfaceC1594gb.a()) {
            return;
        }
        handler.postAtTime(new RunnableC3018v70(atomicBoolean, interfaceC1594gb, interfaceC0360Cy), obj, SystemClock.uptimeMillis() + j);
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Dv0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Dv0 dv0 = new Dv0(this.f225o, this.p, this.q, interfaceC0473Hh);
        dv0.n = obj;
        return dv0;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x01a6 A[PHI: r32 r34
  0x01a6: PHI (r32v2 o.hb) = (r32v1 o.hb), (r32v3 o.hb) binds: [B:50:0x01d4, B:65:0x01a6] A[DONT_GENERATE, DONT_INLINE]
  0x01a6: PHI (r34v3 o.hi) = (r34v1 o.hi), (r34v4 o.hi) binds: [B:50:0x01d4, B:65:0x01a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:51:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:54:0x01e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi;
        IF r4;
        AtomicBoolean atomicBoolean;
        Handler handler;
        WebView webView;
        C1692hb c1692hb;
        C1692hb c1692hb2;
        Object objX;
        EnumC1706hi enumC1706hi2;
        String str = "";
        EnumC1706hi enumC1706hi3 = EnumC1706hi.l;
        int i = this.m;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
            return obj;
        }
        Jp0.O(obj);
        InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
        this.n = interfaceC1608gi;
        Context context = this.f225o;
        String str2 = this.p;
        Map map = this.q;
        this.m = 1;
        C1692hb c1692hb3 = new C1692hb(1, Ou0.p(this));
        c1692hb3.y();
        WebView webView2 = new WebView(context);
        Handler handler2 = new Handler(Looper.getMainLooper());
        Object obj2 = new Object();
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        IF r9 = new IF();
        c1692hb3.A(new JT(atomicBoolean2, handler2, obj2, r9, webView2, 1));
        try {
            WebSettings settings = webView2.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setDatabaseEnabled(true);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            settings.setMediaPlaybackRequiresUserGesture(false);
            if (AbstractC1119bh0.W(str2, "epicplayplay", false) || AbstractC1119bh0.W(str2, "marshlitigation", false)) {
                settings.setBlockNetworkImage(false);
                settings.setLoadsImagesAutomatically(true);
                System.out.getClass();
            } else {
                settings.setBlockNetworkImage(true);
                settings.setLoadsImagesAutomatically(false);
            }
            settings.setCacheMode(2);
            settings.setSupportZoom(false);
            settings.setBuiltInZoomControls(false);
            settings.setDisplayZoomControls(false);
            settings.setMixedContentMode(1);
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
            settings.setAllowFileAccess(false);
            settings.setAllowContentAccess(false);
            settings.setAllowFileAccessFromFileURLs(false);
            settings.setAllowUniversalAccessFromFileURLs(false);
            settings.setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36");
            Ov0.b(webView2);
            System.out.getClass();
            IF r19 = new IF();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AtomicBoolean atomicBoolean3 = new AtomicBoolean(false);
            C2628r60 c2628r60 = new C2628r60();
            AtomicBoolean atomicBoolean4 = new AtomicBoolean(false);
            AtomicBoolean atomicBoolean5 = new AtomicBoolean(false);
            IF r22 = new IF();
            C2628r60 c2628r61 = new C2628r60();
            C2628r60 c2628r62 = new C2628r60();
            try {
                String host = Uri.parse(str2).getHost();
                if (host != null) {
                    str = host;
                }
            } catch (Exception unused) {
            }
            System.out.getClass();
            atomicBoolean = atomicBoolean2;
            handler = handler2;
            WebView webView3 = webView2;
            c1692hb = c1692hb3;
            enumC1706hi = enumC1706hi3;
            try {
                try {
                    C3025vC c3025vC = new C3025vC(webView3, str2, new C3189wv0(r22, atomicBoolean5, c1692hb3, atomicBoolean2, atomicBoolean3, r19, linkedHashMap, str2, interfaceC1608gi, handler, obj2, r9, webView3));
                    c3025vC.b();
                    r4 = r9;
                    try {
                        r4.m = c3025vC;
                        webView3 = webView3;
                        try {
                            Bv0 bv0 = new Bv0(r4, atomicBoolean3, c2628r60, str, linkedHashMap, str2, c1692hb, c2628r62, c2628r61, r19, atomicBoolean, handler, obj2, webView3, atomicBoolean4, r22, atomicBoolean5, interfaceC1608gi);
                            webView = webView3;
                            try {
                                webView.setWebViewClient(bv0);
                                if (!map.isEmpty()) {
                                    Context context2 = Hv0.b;
                                    C3325yL.y(str2);
                                    webView.loadUrl(str2, new HashMap(map));
                                } else {
                                    Context context3 = Hv0.b;
                                    C3325yL.y(str2);
                                    webView.loadUrl(str2);
                                }
                            } catch (Throwable th) {
                                th = th;
                                x(atomicBoolean, handler, obj2, r4, webView, "error configuring or starting WebView");
                                if (c1692hb.a()) {
                                    c1692hb2 = c1692hb;
                                    c1692hb2.j(Jp0.k(th));
                                }
                                objX = c1692hb2.x();
                                enumC1706hi2 = enumC1706hi;
                                if (objX == enumC1706hi2) {
                                    return enumC1706hi2;
                                }
                                return objX;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            webView = webView3;
                            x(atomicBoolean, handler, obj2, r4, webView, "error configuring or starting WebView");
                            if (c1692hb.a()) {
                                c1692hb2 = c1692hb;
                                c1692hb2.j(Jp0.k(th));
                            } else {
                                c1692hb2 = c1692hb;
                            }
                            objX = c1692hb2.x();
                            enumC1706hi2 = enumC1706hi;
                            if (objX == enumC1706hi2) {
                                return enumC1706hi2;
                            }
                            return objX;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        webView = webView3;
                        x(atomicBoolean, handler, obj2, r4, webView, "error configuring or starting WebView");
                        if (c1692hb.a()) {
                            c1692hb2 = c1692hb;
                            c1692hb2.j(Jp0.k(th));
                        } else {
                            c1692hb2 = c1692hb;
                        }
                        objX = c1692hb2.x();
                        enumC1706hi2 = enumC1706hi;
                        if (objX == enumC1706hi2) {
                            return enumC1706hi2;
                        }
                        return objX;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r4 = r9;
                }
            } catch (Throwable th5) {
                th = th5;
                r4 = r9;
            }
        } catch (Throwable th6) {
            th = th6;
            enumC1706hi = enumC1706hi3;
            r4 = r9;
            atomicBoolean = atomicBoolean2;
            handler = handler2;
            webView = webView2;
            c1692hb = c1692hb3;
        }
        c1692hb2 = c1692hb;
        objX = c1692hb2.x();
        enumC1706hi2 = enumC1706hi;
        if (objX == enumC1706hi2) {
            return enumC1706hi2;
        }
        return objX;
    }
}
