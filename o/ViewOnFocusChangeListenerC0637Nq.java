package o;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.skidush.clonex.R;
import com.skidush.clonex.fragments.home.HomeTvFragment;

/* JADX INFO: renamed from: o.Nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0637Nq implements View.OnFocusChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ AbstractC2144m60 d;

    public /* synthetic */ ViewOnFocusChangeListenerC0637Nq(Object obj, Object obj2, AbstractC2144m60 abstractC2144m60, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = abstractC2144m60;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.a) {
            case 0:
                ConstraintLayout constraintLayout = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout, "$this_apply");
                C3223xG c3223xG = (C3223xG) this.c;
                AbstractC1474fG.j(c3223xG, "$binding");
                C0663Oq c0663Oq = (C0663Oq) this.d;
                AbstractC1474fG.j(c0663Oq, "this$0");
                Animation animationLoadAnimation = z ? AnimationUtils.loadAnimation(constraintLayout.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout.getContext(), R.anim.zoom_out);
                c3223xG.l.startAnimation(animationLoadAnimation);
                animationLoadAnimation.setFillAfter(true);
                if (z) {
                    Context context = constraintLayout.getContext();
                    AbstractC1474fG.i(context, "getContext(...)");
                    AbstractActivityC1540fx abstractActivityC1540fx = context instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context : null;
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = abstractActivityC1540fx != null ? AbstractC0397Ej.o(abstractActivityC1540fx) : null;
                    if (abstractComponentCallbacksC1247cxO instanceof HomeTvFragment) {
                        HomeTvFragment homeTvFragment = (HomeTvFragment) abstractComponentCallbacksC1247cxO;
                        C0456Gq c0456Gq = c0663Oq.w;
                        if (c0456Gq == null) {
                            AbstractC1474fG.U("episode");
                            throw null;
                        }
                        C2109lo0 c2109lo0 = c0456Gq.e;
                        homeTvFragment.Y(c2109lo0 != null ? c2109lo0.i : null, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout2, "$this_apply");
                HG hg = (HG) this.c;
                AbstractC1474fG.j(hg, "$binding");
                DR dr = (DR) this.d;
                AbstractC1474fG.j(dr, "this$0");
                Animation animationLoadAnimation2 = z ? AnimationUtils.loadAnimation(constraintLayout2.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout2.getContext(), R.anim.zoom_out);
                hg.l.startAnimation(animationLoadAnimation2);
                animationLoadAnimation2.setFillAfter(true);
                if (z) {
                    Context context2 = constraintLayout2.getContext();
                    AbstractC1474fG.i(context2, "getContext(...)");
                    AbstractActivityC1540fx abstractActivityC1540fx2 = context2 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context2 : null;
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = abstractActivityC1540fx2 != null ? AbstractC0397Ej.o(abstractActivityC1540fx2) : null;
                    if (abstractComponentCallbacksC1247cxO2 instanceof HomeTvFragment) {
                        HomeTvFragment homeTvFragment2 = (HomeTvFragment) abstractComponentCallbacksC1247cxO2;
                        C1387eR c1387eR = dr.w;
                        if (c1387eR != null) {
                            homeTvFragment2.Y(c1387eR.i, Boolean.FALSE);
                            return;
                        } else {
                            AbstractC1474fG.U("movie");
                            throw null;
                        }
                    }
                    return;
                }
                return;
            case 2:
                C1387eR c1387eR2 = (C1387eR) this.b;
                AbstractC1474fG.j(c1387eR2, "$channel");
                C1717hn0 c1717hn0 = (C1717hn0) this.c;
                AbstractC1474fG.j(c1717hn0, "this$0");
                C1619gn0 c1619gn0 = (C1619gn0) this.d;
                AbstractC1474fG.j(c1619gn0, "$holder");
                if (AbstractC1474fG.b(c1387eR2.a, c1717hn0.e)) {
                    return;
                }
                float f = z ? 1.0f : 0.7f;
                View view2 = c1619gn0.a;
                view2.setAlpha(f);
                c1619gn0.u.setTextColor(z ? -1 : view2.getContext().getResources().getColor(android.R.color.darker_gray));
                return;
            case 3:
                ConstraintLayout constraintLayout3 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout3, "$this_apply");
                RG rg = (RG) this.c;
                AbstractC1474fG.j(rg, "$binding");
                C2107ln0 c2107ln0 = (C2107ln0) this.d;
                AbstractC1474fG.j(c2107ln0, "this$0");
                Animation animationLoadAnimation3 = z ? AnimationUtils.loadAnimation(constraintLayout3.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout3.getContext(), R.anim.zoom_out);
                rg.l.startAnimation(animationLoadAnimation3);
                animationLoadAnimation3.setFillAfter(true);
                if (z) {
                    Context context3 = constraintLayout3.getContext();
                    AbstractC1474fG.i(context3, "getContext(...)");
                    AbstractActivityC1540fx abstractActivityC1540fx3 = context3 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context3 : null;
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO3 = abstractActivityC1540fx3 != null ? AbstractC0397Ej.o(abstractActivityC1540fx3) : null;
                    if (abstractComponentCallbacksC1247cxO3 instanceof HomeTvFragment) {
                        HomeTvFragment homeTvFragment3 = (HomeTvFragment) abstractComponentCallbacksC1247cxO3;
                        C1387eR c1387eR3 = c2107ln0.w;
                        if (c1387eR3 == null) {
                            AbstractC1474fG.U("channel");
                            throw null;
                        }
                        String str = c1387eR3.i;
                        if (str == null) {
                            str = c1387eR3.h;
                        }
                        homeTvFragment3.Y(str, Boolean.FALSE);
                        return;
                    }
                    return;
                }
                return;
            default:
                ConstraintLayout constraintLayout4 = (ConstraintLayout) this.b;
                AbstractC1474fG.j(constraintLayout4, "$this_apply");
                VG vg = (VG) this.c;
                AbstractC1474fG.j(vg, "$binding");
                Jo0 jo0 = (Jo0) this.d;
                AbstractC1474fG.j(jo0, "this$0");
                Animation animationLoadAnimation4 = z ? AnimationUtils.loadAnimation(constraintLayout4.getContext(), R.anim.zoom_in) : AnimationUtils.loadAnimation(constraintLayout4.getContext(), R.anim.zoom_out);
                vg.l.startAnimation(animationLoadAnimation4);
                animationLoadAnimation4.setFillAfter(true);
                if (z) {
                    Context context4 = constraintLayout4.getContext();
                    AbstractC1474fG.i(context4, "getContext(...)");
                    AbstractActivityC1540fx abstractActivityC1540fx4 = context4 instanceof AbstractActivityC1540fx ? (AbstractActivityC1540fx) context4 : null;
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO4 = abstractActivityC1540fx4 != null ? AbstractC0397Ej.o(abstractActivityC1540fx4) : null;
                    if (abstractComponentCallbacksC1247cxO4 instanceof HomeTvFragment) {
                        HomeTvFragment homeTvFragment4 = (HomeTvFragment) abstractComponentCallbacksC1247cxO4;
                        C2109lo0 c2109lo1 = jo0.w;
                        if (c2109lo1 != null) {
                            homeTvFragment4.Y(c2109lo1.i, Boolean.FALSE);
                            return;
                        } else {
                            AbstractC1474fG.U("tvShow");
                            throw null;
                        }
                    }
                    return;
                }
                return;
        }
    }
}
