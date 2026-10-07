package o;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: o.n9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2246n9 extends AbstractC1923jt0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ AbstractC0706Qh f;

    public /* synthetic */ C2246n9(AbstractC0706Qh abstractC0706Qh, int i) {
        this.e = i;
        this.f = abstractC0706Qh;
    }

    @Override // o.AbstractC1923jt0
    public final void A(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.e) {
            case 0:
                ((BottomSheetBehavior) this.f).y(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                WeakReference weakReference = sideSheetBehavior.q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.a.X(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.v;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.a.e(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    AbstractC1674hK.w(it.next());
                    throw null;
                }
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e6  */
    @Override // o.AbstractC1923jt0
    public final void B(View view, float f, float f2) {
        switch (this.e) {
            case 0:
                int i = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f;
                if (f2 < 0.0f) {
                    if (bottomSheetBehavior.b) {
                        i = 3;
                    } else {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        if (top <= bottomSheetBehavior.E) {
                            i = 3;
                        }
                    }
                } else if (bottomSheetBehavior.I && bottomSheetBehavior.J(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= bottomSheetBehavior.d) {
                        if (view.getTop() > (bottomSheetBehavior.C() + bottomSheetBehavior.T) / 2) {
                            i = 5;
                        } else if (bottomSheetBehavior.b || Math.abs(view.getTop() - bottomSheetBehavior.C()) < Math.abs(view.getTop() - bottomSheetBehavior.E)) {
                            i = 3;
                        }
                    } else {
                        i = 5;
                    }
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.b) {
                        int i2 = bottomSheetBehavior.E;
                        if (top2 < i2) {
                            if (top2 < Math.abs(top2 - bottomSheetBehavior.G)) {
                                i = 3;
                            }
                        } else if (Math.abs(top2 - i2) >= Math.abs(top2 - bottomSheetBehavior.G)) {
                            i = 4;
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.D) < Math.abs(top2 - bottomSheetBehavior.G)) {
                        i = 3;
                    } else {
                        i = 4;
                    }
                } else if (bottomSheetBehavior.b) {
                    i = 4;
                } else {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.E) >= Math.abs(top3 - bottomSheetBehavior.G)) {
                        i = 4;
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.K(view, i, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                int i3 = 3;
                if (!sideSheetBehavior.a.F(f)) {
                    if (sideSheetBehavior.a.S(view, f)) {
                        if (sideSheetBehavior.a.I(f, f2) || sideSheetBehavior.a.H(view)) {
                            i3 = 5;
                        }
                    } else if (f == 0.0f || Math.abs(f) <= Math.abs(f2)) {
                        int left = view.getLeft();
                        if (Math.abs(left - sideSheetBehavior.a.r()) >= Math.abs(left - sideSheetBehavior.a.s())) {
                            i3 = 5;
                        }
                    } else {
                        i3 = 5;
                    }
                }
                sideSheetBehavior.y(view, i3, true);
                break;
        }
    }

    @Override // o.AbstractC1923jt0
    public final boolean J(View view, int i) {
        WeakReference weakReference;
        switch (this.e) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f;
                int i2 = bottomSheetBehavior.L;
                if (i2 == 1 || bottomSheetBehavior.b0) {
                    return false;
                }
                if (i2 == 3 && bottomSheetBehavior.Z == i) {
                    WeakReference weakReference2 = bottomSheetBehavior.V;
                    View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                System.currentTimeMillis();
                WeakReference weakReference3 = bottomSheetBehavior.U;
                return weakReference3 != null && weakReference3.get() == view;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                return (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) ? false : true;
        }
    }

    @Override // o.AbstractC1923jt0
    public final int i(View view, int i) {
        switch (this.e) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                return AbstractC0397Ej.i(i, sideSheetBehavior.a.u(), sideSheetBehavior.a.t());
        }
    }

    @Override // o.AbstractC1923jt0
    public final int j(View view, int i) {
        switch (this.e) {
            case 0:
                return AbstractC0397Ej.i(i, ((BottomSheetBehavior) this.f).C(), p());
            default:
                return view.getTop();
        }
    }

    @Override // o.AbstractC1923jt0
    public int o(View view) {
        switch (this.e) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                return sideSheetBehavior.l + sideSheetBehavior.f44o;
            default:
                return super.o(view);
        }
    }

    @Override // o.AbstractC1923jt0
    public int p() {
        switch (this.e) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f;
                return bottomSheetBehavior.I ? bottomSheetBehavior.T : bottomSheetBehavior.G;
            default:
                return super.p();
        }
    }

    @Override // o.AbstractC1923jt0
    public final void z(int i) {
        switch (this.e) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f;
                    if (bottomSheetBehavior.K) {
                        bottomSheetBehavior.I(1);
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f;
                    if (sideSheetBehavior.g) {
                        sideSheetBehavior.w(1);
                    }
                }
                break;
        }
    }
}
