package o;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.home.HomeTvFragment;

/* JADX INFO: renamed from: o.Yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0908Yb implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnFocusChangeListenerC0908Yb(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        int iD;
        int i;
        switch (this.a) {
            case 0:
                TextView textView = (TextView) this.b;
                AbstractC1474fG.j(textView, "$this_apply");
                Cd0 cd0 = (Cd0) this.c;
                AbstractC1474fG.j(cd0, "$selected");
                if (z) {
                    Context context = textView.getContext();
                    AbstractC1474fG.i(context, "getContext(...)");
                    AbstractActivityC1540fx abstractActivityC1540fxJ = AbstractC0397Ej.J(context);
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fxJ != null ? AbstractC0397Ej.o(abstractActivityC1540fxJ) : null;
                    if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                        if (cd0 instanceof C1387eR) {
                            ((HomeTvFragment) abstractComponentCallbacksC1247cxO).Y(((C1387eR) cd0).i, Boolean.TRUE);
                            return;
                        } else {
                            if (cd0 instanceof C2109lo0) {
                                ((HomeTvFragment) abstractComponentCallbacksC1247cxO).Y(((C2109lo0) cd0).i, Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout, "$this_apply");
                C3417zG c3417zG = (C3417zG) this.c;
                AbstractC1474fG.j(c3417zG, "$binding");
                Animation animationLoadAnimation = z ? AnimationUtils.loadAnimation(constraintLayout.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout.getContext(), R.anim.zoom_out);
                c3417zG.l.startAnimation(animationLoadAnimation);
                animationLoadAnimation.setFillAfter(true);
                return;
            case 2:
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout2, "$this_apply");
                DG dg = (DG) this.c;
                AbstractC1474fG.j(dg, "$binding");
                Animation animationLoadAnimation2 = z ? AnimationUtils.loadAnimation(constraintLayout2.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout2.getContext(), R.anim.zoom_out);
                dg.l.startAnimation(animationLoadAnimation2);
                animationLoadAnimation2.setFillAfter(true);
                return;
            case 3:
                ConstraintLayout constraintLayout3 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout3, "$this_apply");
                DR dr = (DR) this.c;
                AbstractC1474fG.j(dr, "this$0");
                Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(constraintLayout3.getContext(), z ? R.anim.zoom_in : R.anim.zoom_out);
                constraintLayout3.startAnimation(animationLoadAnimation3);
                animationLoadAnimation3.setFillAfter(true);
                if (z) {
                    C1387eR c1387eR = dr.w;
                    if (c1387eR == null) {
                        AbstractC1474fG.U("movie");
                        throw null;
                    }
                    String str = c1387eR.i;
                    if (str == null || AbstractC1899jh0.O(str)) {
                        return;
                    }
                    Context context2 = constraintLayout3.getContext();
                    AbstractC1474fG.i(context2, "getContext(...)");
                    AbstractActivityC1540fx abstractActivityC1540fx = context2 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context2 : null;
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null;
                    HomeTvFragment homeTvFragment = abstractComponentCallbacksC1247cxO2 instanceof HomeTvFragment ? (HomeTvFragment) abstractComponentCallbacksC1247cxO2 : null;
                    if (homeTvFragment != null) {
                        C1387eR c1387eR2 = dr.w;
                        if (c1387eR2 != null) {
                            homeTvFragment.Y(c1387eR2.i, Boolean.FALSE);
                            return;
                        } else {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            case 4:
                ConstraintLayout constraintLayout4 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout4, "$this_apply");
                FG fg = (FG) this.c;
                AbstractC1474fG.j(fg, "$binding");
                Animation animationLoadAnimation4 = z ? AnimationUtils.loadAnimation(constraintLayout4.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout4.getContext(), R.anim.zoom_out);
                fg.l.startAnimation(animationLoadAnimation4);
                animationLoadAnimation4.setFillAfter(true);
                return;
            case 5:
                ConstraintLayout constraintLayout5 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout5, "$this_apply");
                JG jg = (JG) this.c;
                AbstractC1474fG.j(jg, "$binding");
                Animation animationLoadAnimation5 = z ? AnimationUtils.loadAnimation(constraintLayout5.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout5.getContext(), R.anim.zoom_out);
                jg.l.startAnimation(animationLoadAnimation5);
                animationLoadAnimation5.setFillAfter(true);
                return;
            case 6:
                ConstraintLayout constraintLayout6 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout6, "$this_apply");
                NG ng = (NG) this.c;
                AbstractC1474fG.j(ng, "$binding");
                Animation animationLoadAnimation6 = z ? AnimationUtils.loadAnimation(constraintLayout6.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout6.getContext(), R.anim.zoom_out);
                ng.l.startAnimation(animationLoadAnimation6);
                animationLoadAnimation6.setFillAfter(true);
                return;
            case 7:
                C1423en0 c1423en0 = (C1423en0) this.b;
                AbstractC1474fG.j(c1423en0, "this$0");
                C1521fn0 c1521fn0 = (C1521fn0) this.c;
                AbstractC1474fG.j(c1521fn0, "this$1");
                if (!z || (iD = c1423en0.d()) == -1 || iD == (i = c1521fn0.h)) {
                    return;
                }
                c1521fn0.h = iD;
                c1521fn0.d(i);
                c1521fn0.d(c1521fn0.h);
                Runnable runnable = c1521fn0.j;
                Handler handler = c1521fn0.i;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                R6 r6 = new R6(iD, 5, c1521fn0);
                c1521fn0.j = r6;
                handler.postDelayed(r6, 250L);
                return;
            default:
                ConstraintLayout constraintLayout7 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout7, "$this_apply");
                SG sg = (SG) this.c;
                AbstractC1474fG.j(sg, "$binding");
                Animation animationLoadAnimation7 = z ? AnimationUtils.loadAnimation(constraintLayout7.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout7.getContext(), R.anim.zoom_out);
                sg.l.startAnimation(animationLoadAnimation7);
                animationLoadAnimation7.setFillAfter(true);
                return;
        }
    }
}
