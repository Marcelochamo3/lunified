package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: renamed from: o.Dc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0364Dc extends Cm0 {
    public static final String[] O = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final C3441zc P;
    public static final C3441zc Q;
    public static final C3441zc R;
    public static final C3441zc S;
    public static final C3441zc T;

    static {
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        P = new C3441zc(cls, str, 0);
        String str2 = "bottomRight";
        Q = new C3441zc(cls, str2, 1);
        R = new C3441zc(cls, str2, 2);
        S = new C3441zc(cls, str, 3);
        T = new C3441zc(cls, "position", 4);
    }

    public static void R(Lm0 lm0) {
        View view = lm0.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        HashMap map = lm0.a;
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", lm0.b.getParent());
    }

    @Override // o.Cm0
    public final void e(Lm0 lm0) {
        R(lm0);
    }

    @Override // o.Cm0
    public final void j(Lm0 lm0) {
        R(lm0);
    }

    @Override // o.Cm0
    public final Animator o(ViewGroup viewGroup, Lm0 lm0, Lm0 lm1) {
        int i;
        Animator animatorA;
        if (lm0 == null || lm1 == null) {
            return null;
        }
        HashMap map = lm0.a;
        HashMap map2 = lm1.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0)) {
            i = 0;
        } else {
            i = (i2 == i3 && i4 == i5) ? 0 : 1;
            if (i6 != i7 || i8 != i9) {
                i++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i++;
        }
        if (i <= 0) {
            return null;
        }
        View view = lm1.b;
        AbstractC3381yu0.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                this.G.getClass();
                animatorA = AbstractC3335yV.a(view, T, C3325yL.v(i2, i4, i3, i5));
            } else {
                C0338Cc c0338Cc = new C0338Cc(view);
                this.G.getClass();
                ObjectAnimator objectAnimatorA = AbstractC3335yV.a(c0338Cc, P, C3325yL.v(i2, i4, i3, i5));
                this.G.getClass();
                ObjectAnimator objectAnimatorA2 = AbstractC3335yV.a(c0338Cc, Q, C3325yL.v(i6, i8, i7, i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(objectAnimatorA, objectAnimatorA2);
                animatorSet.addListener(new C0286Ac(c0338Cc));
                animatorA = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            this.G.getClass();
            animatorA = AbstractC3335yV.a(view, R, C3325yL.v(i6, i8, i7, i9));
        } else {
            this.G.getClass();
            animatorA = AbstractC3335yV.a(view, S, C3325yL.v(i2, i4, i3, i5));
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            Ou0.F(viewGroup4, true);
            s().b(new C0312Bc(viewGroup4));
        }
        return animatorA;
    }

    @Override // o.Cm0
    public final String[] u() {
        return O;
    }
}
