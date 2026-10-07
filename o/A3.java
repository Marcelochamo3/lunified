package o;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public final class A3 extends Ph0 implements InterfaceC0775Sy {
    public /* synthetic */ Object m;
    public final /* synthetic */ Context n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A3(Context context, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = context;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((A3) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        A3 a3 = new A3(this.n, interfaceC0473Hh);
        a3.m = obj;
        return a3;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object objK;
        Context context = this.n;
        Jp0.O(obj);
        try {
            com.bumptech.glide.a aVarA = com.bumptech.glide.a.a(context);
            aVarA.getClass();
            Kr0.a();
            aVarA.n.e(0L);
            aVarA.m.g();
            aVarA.p.a();
        } catch (Throwable th) {
            Jp0.k(th);
        }
        try {
            WebView webView = new WebView(context);
            webView.clearCache(true);
            webView.clearHistory();
            webView.destroy();
            objK = webView;
        } catch (Throwable th2) {
            objK = Jp0.k(th2);
        }
        return new C2536q80(objK);
    }
}
