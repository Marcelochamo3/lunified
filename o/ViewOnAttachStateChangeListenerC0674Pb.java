package o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.Pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0674Pb implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0674Pb(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.m;
        switch (this.l) {
            case 1:
                C2403oq c2403oq = (C2403oq) obj;
                if (c2403oq.F != null && (accessibilityManager = c2403oq.E) != null) {
                    WeakHashMap weakHashMap = It0.a;
                    if (c2403oq.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3100w0(c2403oq.F));
                    }
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap2 = It0.a;
                AbstractC2991ut0.c(view2);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.l) {
            case 0:
                ViewOnKeyListenerC0752Sb viewOnKeyListenerC0752Sb = (ViewOnKeyListenerC0752Sb) this.m;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC0752Sb.J;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC0752Sb.J = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC0752Sb.J.removeGlobalOnLayoutListener(viewOnKeyListenerC0752Sb.u);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                C2403oq c2403oq = (C2403oq) this.m;
                C2278nc c2278nc = c2403oq.F;
                if (c2278nc != null && (accessibilityManager = c2403oq.E) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC3100w0(c2278nc));
                    break;
                }
                break;
            case 2:
                break;
            default:
                ViewOnKeyListenerC1995kg0 viewOnKeyListenerC1995kg0 = (ViewOnKeyListenerC1995kg0) this.m;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1995kg0.A;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1995kg0.A = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1995kg0.A.removeGlobalOnLayoutListener(viewOnKeyListenerC1995kg0.u);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }
}
