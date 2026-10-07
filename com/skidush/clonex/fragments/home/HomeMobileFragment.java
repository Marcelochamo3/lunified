package com.skidush.clonex.fragments.home;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.a;
import com.skidush.clonex.R;
import java.util.Iterator;
import o.AC;
import o.AbstractC0397Ej;
import o.AbstractC1376eG;
import o.AbstractC1459f50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.AbstractC2822t60;
import o.AbstractComponentCallbacksC1247cx;
import o.C0560Kq;
import o.C1816io0;
import o.C1930jx;
import o.C2285nf0;
import o.C2630r70;
import o.C3182ws;
import o.C3300y3;
import o.C3376ys;
import o.C3413zC;
import o.CJ;
import o.ComponentCallbacks2C3406z70;
import o.Cr0;
import o.Eh0;
import o.IJ;
import o.P30;
import o.Q30;
import o.QW;
import o.RC;
import o.Rh0;
import o.ViewOnClickListenerC3251xe;
import o.X50;

/* JADX INFO: loaded from: classes.dex */
public class HomeMobileFragment extends AbstractComponentCallbacksC1247cx {
    public C1930jx l0;
    public final Rh0 m0 = new Rh0(new C3413zC(this, 0));
    public final C0560Kq n0;
    public final C3300y3 o0;

    public HomeMobileFragment() {
        C3413zC c3413zC = new C3413zC(this, 1);
        CJ cjN = AbstractC1701hf0.n(new C3182ws(0, this), IJ.n);
        this.n0 = new C0560Kq(AbstractC2822t60.a(RC.class), new C3376ys(cjN, 0), c3413zC, new C3376ys(cjN, 1));
        this.o0 = new C3300y3();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        C1930jx c1930jxA = C1930jx.a(layoutInflater, viewGroup);
        this.l0 = c1930jxA;
        ConstraintLayout constraintLayout = c1930jxA.m;
        AbstractC1474fG.i(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        this.Q = true;
        C1930jx c1930jx = this.l0;
        AbstractC1474fG.g(c1930jx);
        RecyclerView recyclerView = c1930jx.p;
        AbstractC1474fG.i(recyclerView, "rvHome");
        this.o0.k(recyclerView);
        this.l0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void G() {
        this.Q = true;
        ((RC) this.n0.getValue()).g(false);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e7  */
    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        Object next;
        Q30 q30;
        Object objValueOf;
        Object next2;
        AbstractC1474fG.j(view, "view");
        Q30 q30W = W();
        Cr0 cr0 = Cr0.m;
        if (q30W == null) {
            String strB = cr0.b();
            if (AbstractC1474fG.b(strB, "PPV.TO")) {
                q30W = QW.b;
            } else {
                Q30.a.getClass();
                Iterator it = P30.b.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!AbstractC1474fG.b(((Q30) next2).getName(), strB));
                Q30 q31 = (Q30) next2;
                if (q31 == null) {
                    q31 = C1816io0.b;
                }
                q30W = q31;
            }
        }
        if (q30W instanceof C1816io0) {
            C1816io0.b.B(Q());
        } else if (q30W instanceof Eh0) {
            int i = Eh0.b;
            Q();
        }
        C1930jx c1930jx = this.l0;
        AbstractC1474fG.g(c1930jx);
        C3300y3 c3300y3 = this.o0;
        c3300y3.j();
        RecyclerView recyclerView = c1930jx.p;
        recyclerView.setAdapter(c3300y3);
        recyclerView.setItemViewCacheSize(6);
        X50 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.K0(true);
        }
        recyclerView.g(new C2285nf0(AbstractC0397Ej.k(Q(), 20)));
        C1930jx c1930jx2 = this.l0;
        AbstractC1474fG.g(c1930jx2);
        ImageView imageView = c1930jx2.f858o;
        ComponentCallbacks2C3406z70 componentCallbacks2C3406z70E = a.e(imageView.getContext());
        String strB2 = cr0.b();
        if (AbstractC1474fG.b(strB2, "PPV.TO")) {
            q30 = QW.b;
        } else {
            Q30.a.getClass();
            Iterator it2 = P30.b.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!AbstractC1474fG.b(((Q30) next).getName(), strB2));
            Q30 q32 = (Q30) next;
            q30 = q32 == null ? C1816io0.b : q32;
        }
        String strF = q30.f();
        if (strF == null) {
            objValueOf = Integer.valueOf(R.drawable.ic_provider_default_logo);
        } else {
            if (strF.length() <= 0) {
                objValueOf = strF;
                objValueOf = null;
            }
            if (objValueOf == null) {
                objValueOf = Integer.valueOf(R.drawable.ic_provider_default_logo);
            }
        }
        componentCallbacks2C3406z70E.getClass();
        ((C2630r70) new C2630r70(componentCallbacks2C3406z70E.l, componentCallbacks2C3406z70E, Drawable.class, componentCallbacks2C3406z70E.m).J(objValueOf).k()).H(imageView);
        imageView.setOnClickListener(new ViewOnClickListenerC3251xe(4, imageView));
        AbstractC1376eG.w(AbstractC1459f50.y(q()), null, 0, new AC(this, null), 3);
    }

    public Q30 W() {
        return null;
    }
}
