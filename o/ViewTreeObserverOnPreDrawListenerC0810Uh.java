package o;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0810Uh implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int l = 0;
    public final Object m;

    public ViewTreeObserverOnPreDrawListenerC0810Uh(C2993uu0 c2993uu0) {
        this.m = new WeakReference(c2993uu0);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.l) {
            case 0:
                ((CoordinatorLayout) this.m).o(0);
                break;
            default:
                Log.isLoggable("ViewTarget", 2);
                C2993uu0 c2993uu0 = (C2993uu0) ((WeakReference) this.m).get();
                if (c2993uu0 != null) {
                    ArrayList arrayList = c2993uu0.b;
                    if (!arrayList.isEmpty()) {
                        View view = c2993uu0.a;
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int iA = c2993uu0.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iA2 = c2993uu0.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iA > 0 || iA == Integer.MIN_VALUE) {
                            if (iA2 > 0 || iA2 == Integer.MIN_VALUE) {
                                Iterator it = new ArrayList(arrayList).iterator();
                                while (it.hasNext()) {
                                    ((Wd0) ((InterfaceC2574qe0) it.next())).l(iA, iA2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c2993uu0.c);
                                }
                                c2993uu0.c = null;
                                arrayList.clear();
                            }
                        }
                        break;
                    }
                }
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC0810Uh(CoordinatorLayout coordinatorLayout) {
        this.m = coordinatorLayout;
    }
}
