package o;

import android.os.Handler;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class Av0 extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ IF m;
    public final /* synthetic */ InterfaceC1594gb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2628r60 f179o;
    public final /* synthetic */ C2628r60 p;
    public final /* synthetic */ C2628r60 q;
    public final /* synthetic */ AtomicBoolean r;
    public final /* synthetic */ Handler s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ IF u;
    public final /* synthetic */ WebView v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Av0(IF r1, InterfaceC1594gb interfaceC1594gb, C2628r60 c2628r60, C2628r60 c2628r61, C2628r60 c2628r62, AtomicBoolean atomicBoolean, Handler handler, Object obj, IF r9, WebView webView) {
        super(0);
        this.m = r1;
        this.n = interfaceC1594gb;
        this.f179o = c2628r60;
        this.p = c2628r61;
        this.q = c2628r62;
        this.r = atomicBoolean;
        this.s = handler;
        this.t = obj;
        this.u = r9;
        this.v = webView;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        if (this.m.m == null) {
            InterfaceC1594gb interfaceC1594gb = this.n;
            if (interfaceC1594gb.a()) {
                System.out.getClass();
                int i = this.f179o.l;
                int i2 = this.p.l;
                int i3 = this.q.l;
                Dv0.x(this.r, this.s, this.t, this.u, this.v, "page extraction timeout");
                interfaceC1594gb.j(Jp0.k(new Exception("No video URL (M3U8/MP4/MPD) found after page load timeout")));
            }
        }
        return C2985uq0.a;
    }
}
