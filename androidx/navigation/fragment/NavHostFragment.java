package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.skidush.clonex.R;
import io.sentry.android.replay.f;
import o.AbstractC1474fG;
import o.AbstractComponentCallbacksC1247cx;
import o.C40;
import o.F7;
import o.R40;
import o.Rh0;
import o.U9;
import o.YT;

/* JADX INFO: loaded from: classes.dex */
public class NavHostFragment extends AbstractComponentCallbacksC1247cx {
    public final Rh0 l0 = new Rh0(new f(13, this));
    public View m0;
    public int n0;
    public boolean o0;

    @Override // o.AbstractComponentCallbacksC1247cx
    public final View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC1474fG.j(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        AbstractC1474fG.i(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.J;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        this.Q = true;
        View view = this.m0;
        if (view != null && U9.o(view) == W()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.m0 = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void E(Context context, AttributeSet attributeSet, Bundle bundle) {
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(attributeSet, "attrs");
        super.E(context, attributeSet, bundle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R40.b);
        AbstractC1474fG.i(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.n0 = resourceId;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C40.c);
        AbstractC1474fG.i(typedArrayObtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (typedArrayObtainStyledAttributes2.getBoolean(0, false)) {
            this.o0 = true;
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void H(Bundle bundle) {
        if (this.o0) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void K(View view, Bundle bundle) {
        AbstractC1474fG.j(view, "view");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, W());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            AbstractC1474fG.h(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.m0 = view2;
            if (view2.getId() == this.J) {
                View view3 = this.m0;
                AbstractC1474fG.g(view3);
                view3.setTag(R.id.nav_controller_view_tag, W());
            }
        }
    }

    public final YT W() {
        return (YT) this.l0.getValue();
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void y(Context context) {
        AbstractC1474fG.j(context, "context");
        super.y(context);
        if (this.o0) {
            F7 f7 = new F7(l());
            f7.i(this);
            f7.e(false);
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        W();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.o0 = true;
            F7 f7 = new F7(l());
            f7.i(this);
            f7.e(false);
        }
        super.z(bundle);
    }
}
