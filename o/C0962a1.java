package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0962a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C0962a1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.H = null;
                actionBarOverlayLayout.u = false;
                break;
            case 8:
                ((InterfaceC2702ru0) this.b).b();
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.H = null;
                actionBarOverlayLayout.u = false;
                break;
            case 1:
                Z2 z2 = (Z2) this.b;
                ArrayList arrayList = new ArrayList(z2.p);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ColorStateList colorStateList = ((C1384eO) arrayList.get(i)).b.z;
                    if (colorStateList != null) {
                        AbstractC2205mo.h(z2, colorStateList);
                    }
                }
                break;
            case 2:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.b;
                bottomSheetBehavior.I(5);
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    ((View) bottomSheetBehavior.U.get()).requestLayout();
                    break;
                }
                break;
            case 3:
                C0869Wo c0869Wo = (C0869Wo) this.b;
                c0869Wo.q();
                c0869Wo.r.start();
                break;
            case 4:
                ((HideBottomViewOnScrollBehavior) this.b).h = null;
                break;
            case 5:
                SN sn = (SN) this.b;
                sn.b.setTranslationY(0.0f);
                sn.b(0.0f);
                break;
            case 6:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.b;
                sideSheetBehavior.w(5);
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    ((View) sideSheetBehavior.p.get()).requestLayout();
                    break;
                }
                break;
            case 7:
                ((Cm0) this.b).q();
                animator.removeListener(this);
                break;
            default:
                ((InterfaceC2702ru0) this.b).a();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                Z2 z2 = (Z2) this.b;
                ArrayList arrayList = new ArrayList(z2.p);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    C1580gO c1580gO = ((C1384eO) arrayList.get(i)).b;
                    ColorStateList colorStateList = c1580gO.z;
                    if (colorStateList != null) {
                        AbstractC2205mo.g(z2, colorStateList.getColorForState(c1580gO.D, colorStateList.getDefaultColor()));
                    }
                }
                break;
            case 8:
                ((InterfaceC2702ru0) this.b).c();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0962a1(InterfaceC2702ru0 interfaceC2702ru0, View view) {
        this.a = 8;
        this.b = interfaceC2702ru0;
    }
}
