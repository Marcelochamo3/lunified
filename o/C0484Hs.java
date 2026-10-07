package o;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.skidush.clonex.R;
import java.util.HashMap;

/* JADX INFO: renamed from: o.Hs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0484Hs extends Cm0 {
    public static final String[] P = {"android:visibility:visibility", "android:visibility:parent"};
    public final int O;

    public C0484Hs(int i) {
        this();
        this.O = i;
    }

    public static void R(Lm0 lm0) {
        int visibility = lm0.b.getVisibility();
        HashMap map = lm0.a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = lm0.b;
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    public static float T(Lm0 lm0, float f) {
        Float f2;
        return (lm0 == null || (f2 = (Float) lm0.a.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static Nu0 U(Lm0 lm0, Lm0 lm1) {
        Nu0 nu0 = new Nu0();
        nu0.a = false;
        nu0.b = false;
        if (lm0 != null) {
            HashMap map = lm0.a;
            if (map.containsKey("android:visibility:visibility")) {
                nu0.c = ((Integer) map.get("android:visibility:visibility")).intValue();
                nu0.e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                nu0.c = -1;
                nu0.e = null;
            }
        } else {
            nu0.c = -1;
            nu0.e = null;
        }
        if (lm1 != null) {
            HashMap map2 = lm1.a;
            if (map2.containsKey("android:visibility:visibility")) {
                nu0.d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                nu0.f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                nu0.d = -1;
                nu0.f = null;
            }
        } else {
            nu0.d = -1;
            nu0.f = null;
        }
        if (lm0 != null && lm1 != null) {
            int i = nu0.c;
            int i2 = nu0.d;
            if (i == i2 && nu0.e == nu0.f) {
                return nu0;
            }
            if (i != i2) {
                if (i == 0) {
                    nu0.b = false;
                    nu0.a = true;
                } else if (i2 == 0) {
                    nu0.b = true;
                    nu0.a = true;
                }
            } else if (nu0.f == null) {
                nu0.b = false;
                nu0.a = true;
            } else if (nu0.e == null) {
                nu0.b = true;
                nu0.a = true;
            }
        } else if (lm0 == null && nu0.d == 0) {
            nu0.b = true;
            nu0.a = true;
        } else if (lm1 == null && nu0.c == 0) {
            nu0.b = false;
            nu0.a = true;
        }
        return nu0;
    }

    public final ObjectAnimator S(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        AbstractC3381yu0.a.F(view, f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, AbstractC3381yu0.b, f2);
        C0458Gs c0458Gs = new C0458Gs(view);
        objectAnimatorOfFloat.addListener(c0458Gs);
        s().b(c0458Gs);
        return objectAnimatorOfFloat;
    }

    @Override // o.Cm0
    public final void e(Lm0 lm0) {
        R(lm0);
    }

    @Override // o.Cm0
    public final void j(Lm0 lm0) {
        R(lm0);
        View view = lm0.b;
        Float fValueOf = (Float) view.getTag(R.id.transition_pause_alpha);
        if (fValueOf == null) {
            fValueOf = view.getVisibility() == 0 ? Float.valueOf(AbstractC3381yu0.a.r(view)) : Float.valueOf(0.0f);
        }
        lm0.a.put("android:fade:transitionAlpha", fValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0092  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01fc  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (U(r(r3, false), v(r3, false)).a != false) goto L20;
     */
    @Override // o.Cm0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator o(android.view.ViewGroup r21, o.Lm0 r22, o.Lm0 r23) {
        /*
            Method dump skipped, instruction units count: 704
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0484Hs.o(android.view.ViewGroup, o.Lm0, o.Lm0):android.animation.Animator");
    }

    @Override // o.Cm0
    public final String[] u() {
        return P;
    }

    @Override // o.Cm0
    public final boolean x() {
        return true;
    }

    @Override // o.Cm0
    public final boolean y(Lm0 lm0, Lm0 lm1) {
        if (lm0 == null && lm1 == null) {
            return false;
        }
        if (lm0 != null && lm1 != null && lm1.a.containsKey("android:visibility:visibility") != lm0.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        Nu0 nu0U = U(lm0, lm1);
        if (nu0U.a) {
            return nu0U.c == 0 || nu0U.d == 0;
        }
        return false;
    }

    public C0484Hs() {
        this.O = 3;
    }
}
