package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.skidush.clonex.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o.AbstractC1370eA;
import o.AbstractC1701hf0;
import o.AbstractComponentCallbacksC1247cx;
import o.C2611qx;
import o.C3289xx;
import o.D40;
import o.F7;
import o.It0;
import o.L20;
import o.M20;
import o.N20;
import o.O20;
import o.Ou0;
import o.V20;
import o.X20;
import o.Z0;
import o.Z20;

/* JADX INFO: loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public final boolean A;
    public final boolean B;
    public boolean C;
    public final String D;
    public final Object E;
    public boolean F;
    public boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public boolean M;
    public final boolean N;
    public final boolean O;
    public int P;
    public int Q;
    public V20 R;
    public ArrayList S;
    public PreferenceGroup T;
    public boolean U;
    public N20 V;
    public O20 W;
    public final Z0 X;
    public final Context l;
    public X20 m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f30o;
    public L20 p;
    public M20 q;
    public int r;
    public CharSequence s;
    public CharSequence t;
    public int u;
    public Drawable v;
    public final String w;
    public Intent x;
    public final String y;
    public Bundle z;

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this.r = Integer.MAX_VALUE;
        this.A = true;
        this.B = true;
        this.C = true;
        this.F = true;
        this.G = true;
        this.H = true;
        this.I = true;
        this.J = true;
        this.L = true;
        this.O = true;
        this.P = R.layout.preference;
        this.X = new Z0(5, this);
        this.l = context;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.g, i, 0);
        this.u = typedArrayObtainStyledAttributes.getResourceId(23, typedArrayObtainStyledAttributes.getResourceId(0, 0));
        String string = typedArrayObtainStyledAttributes.getString(26);
        this.w = string == null ? typedArrayObtainStyledAttributes.getString(6) : string;
        CharSequence text = typedArrayObtainStyledAttributes.getText(34);
        this.s = text == null ? typedArrayObtainStyledAttributes.getText(4) : text;
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(33);
        this.t = text2 == null ? typedArrayObtainStyledAttributes.getText(7) : text2;
        this.r = typedArrayObtainStyledAttributes.getInt(28, typedArrayObtainStyledAttributes.getInt(8, Integer.MAX_VALUE));
        String string2 = typedArrayObtainStyledAttributes.getString(22);
        this.y = string2 == null ? typedArrayObtainStyledAttributes.getString(13) : string2;
        this.P = typedArrayObtainStyledAttributes.getResourceId(27, typedArrayObtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.Q = typedArrayObtainStyledAttributes.getResourceId(35, typedArrayObtainStyledAttributes.getResourceId(9, 0));
        this.A = typedArrayObtainStyledAttributes.getBoolean(21, typedArrayObtainStyledAttributes.getBoolean(2, true));
        boolean z = typedArrayObtainStyledAttributes.getBoolean(30, typedArrayObtainStyledAttributes.getBoolean(5, true));
        this.B = z;
        this.C = typedArrayObtainStyledAttributes.getBoolean(29, typedArrayObtainStyledAttributes.getBoolean(1, true));
        String string3 = typedArrayObtainStyledAttributes.getString(19);
        this.D = string3 == null ? typedArrayObtainStyledAttributes.getString(10) : string3;
        this.I = typedArrayObtainStyledAttributes.getBoolean(16, typedArrayObtainStyledAttributes.getBoolean(16, z));
        this.J = typedArrayObtainStyledAttributes.getBoolean(17, typedArrayObtainStyledAttributes.getBoolean(17, z));
        if (typedArrayObtainStyledAttributes.hasValue(18)) {
            this.E = o(typedArrayObtainStyledAttributes, 18);
        } else if (typedArrayObtainStyledAttributes.hasValue(11)) {
            this.E = o(typedArrayObtainStyledAttributes, 11);
        }
        this.O = typedArrayObtainStyledAttributes.getBoolean(31, typedArrayObtainStyledAttributes.getBoolean(12, true));
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(32);
        this.K = zHasValue;
        if (zHasValue) {
            this.L = typedArrayObtainStyledAttributes.getBoolean(32, typedArrayObtainStyledAttributes.getBoolean(14, true));
        }
        this.M = typedArrayObtainStyledAttributes.getBoolean(24, typedArrayObtainStyledAttributes.getBoolean(15, false));
        this.H = typedArrayObtainStyledAttributes.getBoolean(25, typedArrayObtainStyledAttributes.getBoolean(25, true));
        this.N = typedArrayObtainStyledAttributes.getBoolean(20, typedArrayObtainStyledAttributes.getBoolean(20, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    public static void u(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                u(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public final boolean a(Serializable serializable) {
        L20 l20 = this.p;
        return l20 == null || l20.f(this, serializable);
    }

    public void b(Bundle bundle) {
        Parcelable parcelable;
        if (!(!TextUtils.isEmpty(this.w)) || (parcelable = bundle.getParcelable(this.w)) == null) {
            return;
        }
        this.U = false;
        p(parcelable);
        if (!this.U) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void c(Bundle bundle) {
        if (!TextUtils.isEmpty(this.w)) {
            this.U = false;
            Parcelable parcelableQ = q();
            if (!this.U) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (parcelableQ != null) {
                bundle.putParcelable(this.w, parcelableQ);
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.r;
        int i2 = preference2.r;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.s;
        CharSequence charSequence2 = preference2.s;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.s.toString());
    }

    public long d() {
        return this.n;
    }

    public final String e(String str) {
        return !y() ? str : this.m.c().getString(this.w, str);
    }

    public CharSequence f() {
        O20 o20 = this.W;
        return o20 != null ? o20.p(this) : this.t;
    }

    public boolean g() {
        return this.A && this.F && this.G;
    }

    public void h() {
        int iIndexOf;
        V20 v20 = this.R;
        if (v20 == null || (iIndexOf = v20.f.indexOf(this)) == -1) {
            return;
        }
        v20.a.d(iIndexOf, 1, this);
    }

    public void i(boolean z) {
        ArrayList arrayList = this.S;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) arrayList.get(i);
            if (preference.F == z) {
                preference.F = !z;
                preference.i(preference.x());
                preference.h();
            }
        }
    }

    public void j() {
        PreferenceScreen preferenceScreen;
        String str = this.D;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        X20 x20 = this.m;
        Preference preferenceA = null;
        if (x20 != null && (preferenceScreen = x20.g) != null) {
            preferenceA = preferenceScreen.A(str);
        }
        if (preferenceA == null) {
            StringBuilder sbL = AbstractC1701hf0.l("Dependency \"", str, "\" not found for preference \"");
            sbL.append(this.w);
            sbL.append("\" (title: \"");
            sbL.append((Object) this.s);
            sbL.append("\"");
            throw new IllegalStateException(sbL.toString());
        }
        if (preferenceA.S == null) {
            preferenceA.S = new ArrayList();
        }
        preferenceA.S.add(this);
        boolean zX = preferenceA.x();
        if (this.F == zX) {
            this.F = !zX;
            i(x());
            h();
        }
    }

    public final void k(X20 x20) {
        this.m = x20;
        if (!this.f30o) {
            this.n = x20.b();
        }
        if (y()) {
            X20 x21 = this.m;
            if ((x21 != null ? x21.c() : null).contains(this.w)) {
                r(null);
                return;
            }
        }
        Object obj = this.E;
        if (obj != null) {
            r(obj);
        }
    }

    public void l(Z20 z20) {
        Integer numValueOf;
        Z0 z0 = this.X;
        View view = z20.a;
        view.setOnClickListener(z0);
        view.setId(0);
        TextView textView = (TextView) z20.u(android.R.id.summary);
        if (textView != null) {
            CharSequence charSequenceF = f();
            if (TextUtils.isEmpty(charSequenceF)) {
                textView.setVisibility(8);
                numValueOf = null;
            } else {
                textView.setText(charSequenceF);
                textView.setVisibility(0);
                numValueOf = Integer.valueOf(textView.getCurrentTextColor());
            }
        } else {
            numValueOf = null;
        }
        TextView textView2 = (TextView) z20.u(android.R.id.title);
        boolean z = this.B;
        if (textView2 != null) {
            CharSequence charSequence = this.s;
            if (TextUtils.isEmpty(charSequence)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(charSequence);
                textView2.setVisibility(0);
                if (this.K) {
                    textView2.setSingleLine(this.L);
                }
                if (!z && g() && numValueOf != null) {
                    textView2.setTextColor(numValueOf.intValue());
                }
            }
        }
        ImageView imageView = (ImageView) z20.u(android.R.id.icon);
        if (imageView != null) {
            int i = this.u;
            if (i != 0 || this.v != null) {
                if (this.v == null) {
                    this.v = Ou0.l(this.l, i);
                }
                Drawable drawable = this.v;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            if (this.v != null) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(this.M ? 4 : 8);
            }
        }
        View viewU = z20.u(R.id.icon_frame);
        if (viewU == null) {
            viewU = z20.u(android.R.id.icon_frame);
        }
        if (viewU != null) {
            if (this.v != null) {
                viewU.setVisibility(0);
            } else {
                viewU.setVisibility(this.M ? 4 : 8);
            }
        }
        if (this.O) {
            u(view, g());
        } else {
            u(view, true);
        }
        view.setFocusable(z);
        view.setClickable(z);
        z20.x = this.I;
        z20.y = this.J;
        boolean z2 = this.N;
        if (z2 && this.V == null) {
            this.V = new N20(this);
        }
        view.setOnCreateContextMenuListener(z2 ? this.V : null);
        view.setLongClickable(z2);
        if (!z2 || z) {
            return;
        }
        WeakHashMap weakHashMap = It0.a;
        view.setBackground(null);
    }

    public void m() {
    }

    public void n() {
        ArrayList arrayList;
        PreferenceScreen preferenceScreen;
        String str = this.D;
        if (str != null) {
            X20 x20 = this.m;
            Preference preferenceA = null;
            if (x20 != null && (preferenceScreen = x20.g) != null) {
                preferenceA = preferenceScreen.A(str);
            }
            if (preferenceA == null || (arrayList = preferenceA.S) == null) {
                return;
            }
            arrayList.remove(this);
        }
    }

    public Object o(TypedArray typedArray, int i) {
        return null;
    }

    public void p(Parcelable parcelable) {
        this.U = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable q() {
        this.U = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void r(Object obj) {
    }

    public void s(View view) {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx;
        String str;
        if (g() && this.B) {
            m();
            M20 m20 = this.q;
            if (m20 != null) {
                m20.a(this);
                return;
            }
            X20 x20 = this.m;
            if (x20 == null || (abstractComponentCallbacksC1247cx = x20.h) == null || (str = this.y) == null) {
                Intent intent = this.x;
                if (intent != null) {
                    this.l.startActivity(intent);
                    return;
                }
                return;
            }
            for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = abstractComponentCallbacksC1247cx; abstractComponentCallbacksC1247cx2 != null; abstractComponentCallbacksC1247cx2 = abstractComponentCallbacksC1247cx2.I) {
            }
            abstractComponentCallbacksC1247cx.j();
            abstractComponentCallbacksC1247cx.h();
            C3289xx c3289xxL = abstractComponentCallbacksC1247cx.l();
            if (this.z == null) {
                this.z = new Bundle();
            }
            Bundle bundle = this.z;
            C2611qx c2611qxI = c3289xxL.I();
            abstractComponentCallbacksC1247cx.P().getClassLoader();
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxA = c2611qxI.a(str);
            abstractComponentCallbacksC1247cxA.U(bundle);
            abstractComponentCallbacksC1247cxA.V(abstractComponentCallbacksC1247cx);
            F7 f7 = new F7(c3289xxL);
            f7.h(((View) abstractComponentCallbacksC1247cx.R().getParent()).getId(), abstractComponentCallbacksC1247cxA, null);
            f7.c(null);
            f7.e(false);
        }
    }

    public final void t(String str) {
        if (y() && !TextUtils.equals(str, e(null))) {
            SharedPreferences.Editor editorA = this.m.a();
            editorA.putString(this.w, str);
            z(editorA);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.s;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence charSequenceF = f();
        if (!TextUtils.isEmpty(charSequenceF)) {
            sb.append(charSequenceF);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public void v(CharSequence charSequence) {
        if (this.W != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (TextUtils.equals(this.t, charSequence)) {
            return;
        }
        this.t = charSequence;
        h();
    }

    public final void w(O20 o20) {
        this.W = o20;
        h();
    }

    public boolean x() {
        return !g();
    }

    public final boolean y() {
        return this.m != null && this.C && (TextUtils.isEmpty(this.w) ^ true);
    }

    public final void z(SharedPreferences.Editor editor) {
        if (!this.m.e) {
            editor.apply();
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1370eA.q(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle));
    }
}
