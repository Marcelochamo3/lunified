package o;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.zv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3480zv0 implements ValueCallback {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ IF c;
    public final /* synthetic */ Map d;
    public final /* synthetic */ String e;
    public final /* synthetic */ InterfaceC1594gb f;
    public final /* synthetic */ IF g;
    public final /* synthetic */ AtomicBoolean h;
    public final /* synthetic */ AtomicBoolean i;
    public final /* synthetic */ InterfaceC1608gi j;
    public final /* synthetic */ Handler k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ IF m;
    public final /* synthetic */ WebView n;

    public C3480zv0(AtomicBoolean atomicBoolean, String str, IF r3, Map map, String str2, InterfaceC1594gb interfaceC1594gb, IF r7, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, InterfaceC1608gi interfaceC1608gi, Handler handler, Object obj, IF r13, WebView webView) {
        this.a = atomicBoolean;
        this.b = str;
        this.c = r3;
        this.d = map;
        this.e = str2;
        this.f = interfaceC1594gb;
        this.g = r7;
        this.h = atomicBoolean2;
        this.i = atomicBoolean3;
        this.j = interfaceC1608gi;
        this.k = handler;
        this.l = obj;
        this.m = r13;
        this.n = webView;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String str;
        String str2 = (String) obj;
        if (str2 == null || AbstractC1474fG.b(str2, "null")) {
            return;
        }
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        String strF0 = AbstractC1119bh0.F0(str2, '\"', '\'');
        I60 i60 = SB.a;
        String str3 = this.b;
        String strE = SB.e(strF0, str3);
        String str4 = strE == null ? strF0 : strE;
        if ((!AbstractC1899jh0.O(str4)) && AbstractC1468fA.s(str4)) {
            if (AbstractC1119bh0.W(str4, "m3u8", false) || AbstractC1119bh0.W(str4, ".mp4", false) || AbstractC1119bh0.W(str4, ".mpd", false) || AbstractC1119bh0.W(str4, "embed", false) || AbstractC1119bh0.W(str4, "player", false)) {
                if (AbstractC1119bh0.W(str4, "m3u8", true)) {
                    TB tb = TB.r;
                    String str5 = this.b;
                    Dv0.w(this.g, this.h, this.f, this.i, this.a, this.c, this.d, str5, this.e, this.j, this.k, this.l, this.m, this.n, new RB(str4, tb, null, str5, null, null, null, null, 244));
                    return;
                }
                if (atomicBoolean.compareAndSet(false, true)) {
                    Context context = Hv0.b;
                    C3325yL.y(str4);
                    System.out.getClass();
                    this.c.m = str4;
                    Map map = this.d;
                    map.clear();
                    map.put("User-Agent", this.e);
                    map.put("Referer", str3);
                    try {
                        Uri uri = Uri.parse(str3);
                        map.put("Origin", uri.getScheme() + "://" + uri.getHost());
                    } catch (Exception unused) {
                    }
                    String cookie = CookieManager.getInstance().getCookie(str4);
                    if (cookie != null) {
                        if (!(true ^ AbstractC1899jh0.O(cookie))) {
                            cookie = null;
                        }
                        if (cookie != null) {
                            map.put("Cookie", cookie);
                        }
                    }
                    Dv0.x(this.i, this.k, this.l, this.m, this.n, "video URL found by JavaScript");
                    InterfaceC1594gb interfaceC1594gb = this.f;
                    if (interfaceC1594gb.a()) {
                        if (AbstractC1119bh0.W(str4, "m3u8", false)) {
                            str = "hls";
                        } else {
                            str = AbstractC1119bh0.W(str4, ".mpd", false) ? "dash" : "mp4";
                        }
                        interfaceC1594gb.j(new Js0(str4, AbstractC3327yN.B(map), str, (String) null, (String) null, (byte[]) null, (String) null, this.b, (String) null, (List) null, false, 3960));
                    }
                }
            }
        }
    }
}
