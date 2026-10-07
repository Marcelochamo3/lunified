package o;

import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class JT extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ Serializable n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f343o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JT(Serializable serializable, Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(1);
        this.m = i;
        this.n = serializable;
        this.f343o = obj;
        this.p = obj2;
        this.q = obj3;
        this.r = obj4;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        List listSubList;
        switch (this.m) {
            case 0:
                DT dt = (DT) obj;
                AbstractC1474fG.j(dt, "entry");
                ((C2532q60) this.n).l = true;
                List list = (List) this.f343o;
                int iIndexOf = list.indexOf(dt);
                if (iIndexOf != -1) {
                    C2628r60 c2628r60 = (C2628r60) this.p;
                    int i = iIndexOf + 1;
                    listSubList = list.subList(c2628r60.l, i);
                    c2628r60.l = i;
                } else {
                    listSubList = C1233cq.l;
                }
                ((YT) this.q).a(dt.m, (Bundle) this.r, dt, listSubList);
                break;
            default:
                System.out.getClass();
                Dv0.x((AtomicBoolean) this.n, (Handler) this.f343o, this.p, (IF) this.q, (WebView) this.r, "coroutine cancelled");
                break;
        }
        return C2985uq0.a;
    }
}
