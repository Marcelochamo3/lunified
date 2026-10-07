package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import com.skidush.clonex.R;
import java.util.HashSet;
import java.util.Set;
import o.AbstractC1370eA;
import o.D40;
import o.HS;

/* JADX INFO: loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public final CharSequence[] e0;
    public final CharSequence[] f0;
    public final HashSet g0;

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        int iQ = AbstractC1370eA.q(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle);
        super(context, attributeSet, iQ);
        this.g0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.f, iQ, 0);
        CharSequence[] textArray = typedArrayObtainStyledAttributes.getTextArray(2);
        this.e0 = textArray == null ? typedArrayObtainStyledAttributes.getTextArray(0) : textArray;
        CharSequence[] textArray2 = typedArrayObtainStyledAttributes.getTextArray(3);
        this.f0 = textArray2 == null ? typedArrayObtainStyledAttributes.getTextArray(1) : textArray2;
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void A(Set set) {
        HashSet hashSet = this.g0;
        hashSet.clear();
        hashSet.addAll(set);
        if (y()) {
            if (!set.equals(y() ? this.m.c().getStringSet(this.w, null) : null)) {
                SharedPreferences.Editor editorA = this.m.a();
                editorA.putStringSet(this.w, set);
                z(editorA);
            }
        }
        h();
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(HS.class)) {
            super.p(parcelable);
            return;
        }
        HS hs = (HS) parcelable;
        super.p(hs.getSuperState());
        A(hs.l);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        this.U = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        HS hs = new HS(absSavedState);
        hs.l = this.g0;
        return hs;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        Set<String> stringSet = (Set) obj;
        if (y()) {
            stringSet = this.m.c().getStringSet(this.w, stringSet);
        }
        A(stringSet);
    }
}
