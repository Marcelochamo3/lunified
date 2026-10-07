package o;

import android.os.Handler;
import android.webkit.WebView;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: o.wv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3189wv0 extends AbstractC1153bz implements InterfaceC0412Ey {
    public final /* synthetic */ String A;
    public final /* synthetic */ InterfaceC1608gi B;
    public final /* synthetic */ Handler C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ IF E;
    public final /* synthetic */ WebView F;
    public final /* synthetic */ IF t;
    public final /* synthetic */ AtomicBoolean u;
    public final /* synthetic */ InterfaceC1594gb v;
    public final /* synthetic */ AtomicBoolean w;
    public final /* synthetic */ AtomicBoolean x;
    public final /* synthetic */ IF y;
    public final /* synthetic */ Map z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3189wv0(IF r1, AtomicBoolean atomicBoolean, C1692hb c1692hb, AtomicBoolean atomicBoolean2, AtomicBoolean atomicBoolean3, IF r6, LinkedHashMap linkedHashMap, String str, InterfaceC1608gi interfaceC1608gi, Handler handler, Object obj, IF r12, WebView webView) {
        super(1, AbstractC1376eG.class, "completeFromReusableHlsDetector", "invokeSuspend$lambda$12$completeFromReusableHlsDetector(Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlinx/coroutines/CancellableContinuation;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/atomic/AtomicBoolean;Lkotlin/jvm/internal/Ref$ObjectRef;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Lkotlinx/coroutines/CoroutineScope;Landroid/os/Handler;Ljava/lang/Object;Lkotlin/jvm/internal/Ref$ObjectRef;Landroid/webkit/WebView;Lcom/skidush/clonex/extractors/HlsDetectionCandidate;)V", 0);
        this.t = r1;
        this.u = atomicBoolean;
        this.v = c1692hb;
        this.w = atomicBoolean2;
        this.x = atomicBoolean3;
        this.y = r6;
        this.z = linkedHashMap;
        this.A = str;
        this.B = interfaceC1608gi;
        this.C = handler;
        this.D = obj;
        this.E = r12;
        this.F = webView;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        RB rb = (RB) obj;
        AbstractC1474fG.j(rb, "p0");
        Dv0.w(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/137.0.0.0 Safari/537.36", this.B, this.C, this.D, this.E, this.F, rb);
        return C2985uq0.a;
    }
}
