package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.skidush.clonex.R;
import o.AbstractC1370eA;
import o.C0622Nb;
import o.D40;
import o.KK;
import o.O20;

/* JADX INFO: loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] e0;
    public CharSequence[] f0;
    public String g0;
    public String h0;
    public boolean i0;

    public ListPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.e, i, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.e0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        if (typedArrayObtainStyledAttributes.getBoolean(4, typedArrayObtainStyledAttributes.getBoolean(4, false))) {
            w(C0622Nb.q());
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, D40.g, i, 0);
        String string = typedArrayObtainStyledAttributes2.getString(33);
        this.h0 = string == null ? typedArrayObtainStyledAttributes2.getString(7) : string;
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int A(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f0) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f0[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public final CharSequence B() {
        CharSequence[] charSequenceArr;
        int iA = A(this.g0);
        if (iA < 0 || (charSequenceArr = this.e0) == null) {
            return null;
        }
        return charSequenceArr[iA];
    }

    public void C(CharSequence[] charSequenceArr) {
        this.e0 = charSequenceArr;
    }

    public final void D(String str) {
        boolean z = !TextUtils.equals(this.g0, str);
        if (z || !this.i0) {
            this.g0 = str;
            this.i0 = true;
            t(str);
            if (z) {
                h();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final CharSequence f() {
        O20 o20 = this.W;
        if (o20 != null) {
            return o20.p(this);
        }
        CharSequence charSequenceB = B();
        CharSequence charSequenceF = super.f();
        String str = this.h0;
        if (str == null) {
            return charSequenceF;
        }
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        String str2 = String.format(str, charSequenceB);
        return TextUtils.equals(str2, charSequenceF) ? charSequenceF : str2;
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(KK.class)) {
            super.p(parcelable);
            return;
        }
        KK kk = (KK) parcelable;
        super.p(kk.getSuperState());
        D(kk.l);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        this.U = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        KK kk = new KK(absSavedState);
        kk.l = this.g0;
        return kk;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        D(e((String) obj));
    }

    @Override // androidx.preference.Preference
    public final void v(CharSequence charSequence) {
        super.v(charSequence);
        if (charSequence == null) {
            this.h0 = null;
        } else {
            this.h0 = ((String) charSequence).toString();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1370eA.q(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }
}
