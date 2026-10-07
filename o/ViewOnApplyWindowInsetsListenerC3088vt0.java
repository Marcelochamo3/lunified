package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.vt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC3088vt0 implements View.OnApplyWindowInsetsListener {
    public Kw0 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ VV c;

    public ViewOnApplyWindowInsetsListenerC3088vt0(View view, VV vv) {
        this.b = view;
        this.c = vv;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Kw0 kw0G = Kw0.g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        VV vv = this.c;
        if (i < 30) {
            AbstractC3185wt0.a(windowInsets, this.b);
            if (kw0G.equals(this.a)) {
                return vv.r(view, kw0G).f();
            }
        }
        this.a = kw0G;
        Kw0 kw0R = vv.r(view, kw0G);
        if (i >= 30) {
            return kw0R.f();
        }
        WeakHashMap weakHashMap = It0.a;
        AbstractC2991ut0.c(view);
        return kw0R.f();
    }
}
