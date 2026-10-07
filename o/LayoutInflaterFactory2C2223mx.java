package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* JADX INFO: renamed from: o.mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutInflaterFactory2C2223mx implements LayoutInflater.Factory2 {
    public final C3289xx l;

    public LayoutInflaterFactory2C2223mx(C3289xx c3289xx) {
        this.l = c3289xx;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0670Ox c0670OxG;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        C3289xx c3289xx = this.l;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, c3289xx);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P40.a);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        String string = typedArrayObtainStyledAttributes.getString(2);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                zIsAssignableFrom = AbstractComponentCallbacksC1247cx.class.isAssignableFrom(C2611qx.b(context.getClassLoader(), attributeValue));
            } catch (ClassNotFoundException unused) {
                zIsAssignableFrom = false;
            }
            if (zIsAssignableFrom) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxD = resourceId != -1 ? c3289xx.D(resourceId) : null;
                if (abstractComponentCallbacksC1247cxD == null && string != null) {
                    abstractComponentCallbacksC1247cxD = c3289xx.E(string);
                }
                if (abstractComponentCallbacksC1247cxD == null && id != -1) {
                    abstractComponentCallbacksC1247cxD = c3289xx.D(id);
                }
                if (abstractComponentCallbacksC1247cxD == null) {
                    C2611qx c2611qxI = c3289xx.I();
                    context.getClassLoader();
                    abstractComponentCallbacksC1247cxD = c2611qxI.a(attributeValue);
                    abstractComponentCallbacksC1247cxD.z = true;
                    abstractComponentCallbacksC1247cxD.J = resourceId != 0 ? resourceId : id;
                    abstractComponentCallbacksC1247cxD.K = id;
                    abstractComponentCallbacksC1247cxD.L = string;
                    abstractComponentCallbacksC1247cxD.A = true;
                    abstractComponentCallbacksC1247cxD.F = c3289xx;
                    C1442ex c1442ex = c3289xx.v;
                    abstractComponentCallbacksC1247cxD.G = c1442ex;
                    abstractComponentCallbacksC1247cxD.E(c1442ex.p, attributeSet, abstractComponentCallbacksC1247cxD.m);
                    c0670OxG = c3289xx.a(abstractComponentCallbacksC1247cxD);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        abstractComponentCallbacksC1247cxD.toString();
                        Integer.toHexString(resourceId);
                    }
                } else {
                    if (abstractComponentCallbacksC1247cxD.A) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    abstractComponentCallbacksC1247cxD.A = true;
                    abstractComponentCallbacksC1247cxD.F = c3289xx;
                    C1442ex c1442ex2 = c3289xx.v;
                    abstractComponentCallbacksC1247cxD.G = c1442ex2;
                    abstractComponentCallbacksC1247cxD.E(c1442ex2.p, attributeSet, abstractComponentCallbacksC1247cxD.m);
                    c0670OxG = c3289xx.g(abstractComponentCallbacksC1247cxD);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        abstractComponentCallbacksC1247cxD.toString();
                        Integer.toHexString(resourceId);
                    }
                }
                ViewGroup viewGroup = (ViewGroup) view;
                C0722Qx c0722Qx = AbstractC0748Rx.a;
                AbstractC0748Rx.b(new C0618Mx(abstractComponentCallbacksC1247cxD, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC1247cxD + " to container " + viewGroup));
                AbstractC0748Rx.a(abstractComponentCallbacksC1247cxD).getClass();
                Object obj = EnumC0696Px.m;
                if (obj instanceof Void) {
                }
                abstractComponentCallbacksC1247cxD.R = viewGroup;
                c0670OxG.k();
                c0670OxG.j();
                View view2 = abstractComponentCallbacksC1247cxD.S;
                if (view2 == null) {
                    throw new IllegalStateException(AbstractC1701hf0.u("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (abstractComponentCallbacksC1247cxD.S.getTag() == null) {
                    abstractComponentCallbacksC1247cxD.S.setTag(string);
                }
                abstractComponentCallbacksC1247cxD.S.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC2126lx(this, c0670OxG));
                return abstractComponentCallbacksC1247cxD.S;
            }
        }
        return null;
    }
}
