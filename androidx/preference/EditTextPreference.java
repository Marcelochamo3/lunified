package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.skidush.clonex.R;
import o.AbstractC1370eA;
import o.C0519Jb;
import o.C2788sp;
import o.D40;

/* JADX INFO: loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String e0;

    /* JADX WARN: Illegal instructions before constructor call */
    public EditTextPreference(Context context, AttributeSet attributeSet) {
        int iQ = AbstractC1370eA.q(context, R.attr.editTextPreferenceStyle, android.R.attr.editTextPreferenceStyle);
        super(context, attributeSet, iQ);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.d, iQ, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(0, typedArrayObtainStyledAttributes.getBoolean(0, false))) {
            if (C0519Jb.m == null) {
                C0519Jb.m = new C0519Jb(14);
            }
            w(C0519Jb.m);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void A(String str) {
        boolean zX = x();
        this.e0 = str;
        t(str);
        boolean zX2 = x();
        if (zX2 != zX) {
            i(zX2);
        }
        h();
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2788sp.class)) {
            super.p(parcelable);
            return;
        }
        C2788sp c2788sp = (C2788sp) parcelable;
        super.p(c2788sp.getSuperState());
        A(c2788sp.l);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        this.U = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        C2788sp c2788sp = new C2788sp(absSavedState);
        c2788sp.l = this.e0;
        return c2788sp;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        A(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final boolean x() {
        return TextUtils.isEmpty(this.e0) || super.x();
    }
}
