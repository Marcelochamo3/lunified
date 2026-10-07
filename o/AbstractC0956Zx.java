package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.Zx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0956Zx {
    public static boolean i(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void e(ViewGroup viewGroup, Object obj);

    public abstract boolean f(Object obj);

    public abstract Object g(Object obj);

    public Object h(ViewGroup viewGroup, Object obj) {
        return null;
    }

    public abstract boolean j();

    public abstract boolean k(Object obj);

    public abstract Object l(Object obj, Object obj2);

    public abstract Object m(Object obj, Object obj2);

    public abstract void n(Object obj, View view, ArrayList arrayList);

    public abstract void o(Object obj, Object obj2, ArrayList arrayList);

    public abstract void q(Object obj);

    public void r(Object obj, C1790ib c1790ib, Jj0 jj0, Runnable runnable) {
        ((RunnableC0477Hl) runnable).run();
    }

    public abstract void s(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, Object obj, C1790ib c1790ib, RunnableC0477Hl runnableC0477Hl);

    public abstract void t(ArrayList arrayList, ArrayList arrayList2);

    public void c(Object obj) {
    }

    public void d(Object obj, O3 o3) {
    }

    public void p(Object obj, float f) {
    }
}
