package o;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: o.sw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2803sw0 extends WindowInsetsAnimation$Callback {
    public final C1508fh a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    public C2803sw0(C1508fh c1508fh) {
        super(0);
        this.d = new HashMap();
        this.a = c1508fh;
    }

    public final C3094vw0 a(WindowInsetsAnimation windowInsetsAnimation) {
        C3094vw0 c3094vw0 = (C3094vw0) this.d.get(windowInsetsAnimation);
        if (c3094vw0 == null) {
            c3094vw0 = new C3094vw0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c3094vw0.a = new C2900tw0(windowInsetsAnimation);
            }
            this.d.put(windowInsetsAnimation, c3094vw0);
        }
        return c3094vw0;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C1508fh c1508fh = this.a;
        a(windowInsetsAnimation);
        ((View) c1508fh.p).setTranslationY(0.0f);
        this.d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C1508fh c1508fh = this.a;
        a(windowInsetsAnimation);
        View view = (View) c1508fh.p;
        int[] iArr = (int[]) c1508fh.q;
        view.getLocationOnScreen(iArr);
        c1508fh.n = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationL = E0.l(list.get(size));
            C3094vw0 c3094vw0A = a(windowInsetsAnimationL);
            c3094vw0A.a.d(windowInsetsAnimationL.getFraction());
            this.c.add(c3094vw0A);
        }
        C1508fh c1508fh = this.a;
        Kw0 kw0G = Kw0.g(null, windowInsets);
        c1508fh.a(kw0G, this.b);
        return kw0G.f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C1508fh c1508fh = this.a;
        a(windowInsetsAnimation);
        TF tfC = TF.c(bounds.getLowerBound());
        TF tfC2 = TF.c(bounds.getUpperBound());
        View view = (View) c1508fh.p;
        int[] iArr = (int[]) c1508fh.q;
        view.getLocationOnScreen(iArr);
        int i = c1508fh.n - iArr[1];
        c1508fh.f779o = i;
        view.setTranslationY(i);
        E0.o();
        return E0.j(tfC.d(), tfC2.d());
    }
}
