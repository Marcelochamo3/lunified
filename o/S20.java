package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class S20 extends AbstractComponentCallbacksC1247cx {
    public X20 m0;
    public RecyclerView n0;
    public boolean o0;
    public boolean p0;
    public final R20 l0 = new R20(this);
    public int q0 = R.layout.preference_list_fragment;
    public final HandlerC2232n2 r0 = new HandlerC2232n2(this, Looper.getMainLooper(), 4);
    public final RunnableC3102w1 s0 = new RunnableC3102w1(17, this);

    @Override // o.AbstractComponentCallbacksC1247cx
    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray typedArrayObtainStyledAttributes = Q().obtainStyledAttributes(null, D40.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.q0 = typedArrayObtainStyledAttributes.getResourceId(0, this.q0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(3, true);
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(Q());
        View viewInflate = layoutInflaterCloneInContext.inflate(this.q0, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(android.R.id.list_container);
        if (!(viewFindViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) viewFindViewById;
        RecyclerView recyclerViewY = Y(layoutInflaterCloneInContext, viewGroup2);
        this.n0 = recyclerViewY;
        R20 r20 = this.l0;
        recyclerViewY.g(r20);
        if (drawable != null) {
            r20.getClass();
            r20.b = drawable.getIntrinsicHeight();
        } else {
            r20.b = 0;
        }
        r20.a = drawable;
        RecyclerView recyclerView = r20.d.n0;
        if (recyclerView.B.size() != 0) {
            X50 x50 = recyclerView.y;
            if (x50 != null) {
                x50.c("Cannot invalidate item decorations during a scroll or layout");
            }
            recyclerView.R();
            recyclerView.requestLayout();
        }
        if (dimensionPixelSize != -1) {
            r20.b = dimensionPixelSize;
            RecyclerView recyclerView2 = r20.d.n0;
            if (recyclerView2.B.size() != 0) {
                X50 x51 = recyclerView2.y;
                if (x51 != null) {
                    x51.c("Cannot invalidate item decorations during a scroll or layout");
                }
                recyclerView2.R();
                recyclerView2.requestLayout();
            }
        }
        r20.c = z;
        if (this.n0.getParent() == null) {
            viewGroup2.addView(this.n0);
        }
        this.r0.post(this.s0);
        return viewInflate;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void B() {
        RunnableC3102w1 runnableC3102w1 = this.s0;
        HandlerC2232n2 handlerC2232n2 = this.r0;
        handlerC2232n2.removeCallbacks(runnableC3102w1);
        handlerC2232n2.removeMessages(1);
        if (this.o0) {
            this.n0.setAdapter(null);
            PreferenceScreen preferenceScreen = this.m0.g;
            if (preferenceScreen != null) {
                preferenceScreen.n();
            }
        }
        this.n0 = null;
        this.Q = true;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void H(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.m0.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.c(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void I() {
        this.Q = true;
        X20 x20 = this.m0;
        x20.h = this;
        x20.i = this;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void J() {
        this.Q = true;
        X20 x20 = this.m0;
        x20.h = null;
        x20.i = null;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public void K(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.m0.g) != null) {
            preferenceScreen2.b(bundle2);
        }
        if (this.o0 && (preferenceScreen = this.m0.g) != null) {
            this.n0.setAdapter(new V20(preferenceScreen));
            preferenceScreen.j();
        }
        this.p0 = true;
    }

    public final Preference W(String str) {
        PreferenceScreen preferenceScreen;
        X20 x20 = this.m0;
        if (x20 == null || (preferenceScreen = x20.g) == null) {
            return null;
        }
        return preferenceScreen.A(str);
    }

    public abstract void X(String str);

    public RecyclerView Y(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        if (Q().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        Q();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1));
        recyclerView2.setAccessibilityDelegateCompat(new Y20(recyclerView2));
        return recyclerView2;
    }

    public void Z(Preference preference) {
        DialogInterfaceOnCancelListenerC0348Cm js;
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this; abstractComponentCallbacksC1247cx != null; abstractComponentCallbacksC1247cx = abstractComponentCallbacksC1247cx.I) {
        }
        j();
        h();
        if (l().E("androidx.preference.PreferenceFragment.DIALOG") != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            String str = preference.w;
            js = new C2885tp();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", str);
            js.U(bundle);
        } else if (preference instanceof ListPreference) {
            String str2 = preference.w;
            js = new MK();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", str2);
            js.U(bundle2);
        } else {
            if (!(preference instanceof MultiSelectListPreference)) {
                throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + preference.getClass().getSimpleName() + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
            }
            String str3 = preference.w;
            js = new JS();
            Bundle bundle3 = new Bundle(1);
            bundle3.putString("key", str3);
            js.U(bundle3);
        }
        js.V(this);
        js.Z(l(), "androidx.preference.PreferenceFragment.DIALOG");
    }

    public final void a0(String str) {
        Preference preferenceA;
        X20 x20 = this.m0;
        if (x20 == null) {
            throw new RuntimeException("This should be called after super.onCreate.");
        }
        Context contextQ = Q();
        x20.e = true;
        W20 w20 = new W20(contextQ, x20);
        XmlResourceParser xml = contextQ.getResources().getXml(R.xml.settings_app);
        try {
            PreferenceGroup preferenceGroupC = w20.c(xml);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) preferenceGroupC;
            preferenceScreen.k(x20);
            SharedPreferences.Editor editor = x20.d;
            if (editor != null) {
                editor.apply();
            }
            x20.e = false;
            PreferenceScreen preferenceScreen2 = preferenceScreen;
            if (str != null) {
                preferenceA = preferenceScreen.A(str);
                if (!(preferenceA instanceof PreferenceScreen)) {
                    preferenceScreen2 = preferenceA;
                    throw new IllegalArgumentException(AbstractC1701hf0.u("Preference object with key ", str, " is not a PreferenceScreen"));
                }
            }
            preferenceScreen2 = preferenceA;
            PreferenceScreen preferenceScreen3 = preferenceScreen2;
            X20 x21 = this.m0;
            PreferenceScreen preferenceScreen4 = x21.g;
            if (preferenceScreen3 != preferenceScreen4) {
                if (preferenceScreen4 != null) {
                    preferenceScreen4.n();
                }
                x21.g = preferenceScreen3;
                if (preferenceScreen3 != null) {
                    this.o0 = true;
                    if (this.p0) {
                        HandlerC2232n2 handlerC2232n2 = this.r0;
                        if (handlerC2232n2.hasMessages(1)) {
                            return;
                        }
                        handlerC2232n2.obtainMessage(1).sendToTarget();
                    }
                }
            }
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        super.z(bundle);
        TypedValue typedValue = new TypedValue();
        Q().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        Q().getTheme().applyStyle(i, false);
        X20 x20 = new X20(Q());
        this.m0 = x20;
        x20.j = this;
        Bundle bundle2 = this.q;
        X(bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }
}
