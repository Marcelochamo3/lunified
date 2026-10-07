package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.widget.TextView;
import o.C2596qp0;

/* JADX INFO: loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean Y;
    public CharSequence Z;
    public CharSequence a0;
    public boolean b0;
    public boolean c0;

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void A(boolean z) {
        boolean z2 = this.Y != z;
        if (z2 || !this.b0) {
            this.Y = z;
            this.b0 = true;
            if (y()) {
                boolean z3 = !z;
                if (y()) {
                    z3 = this.m.c().getBoolean(this.w, z3);
                }
                if (z != z3) {
                    SharedPreferences.Editor editorA = this.m.a();
                    editorA.putBoolean(this.w, z);
                    z(editorA);
                }
            }
            if (z2) {
                i(x());
                h();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:? A[RETURN, SYNTHETIC] */
    public final void B(View view) {
        boolean z;
        int i;
        CharSequence charSequenceF;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            if (!this.Y || TextUtils.isEmpty(this.Z)) {
                if (this.Y || TextUtils.isEmpty(this.a0)) {
                    z = true;
                } else {
                    textView.setText(this.a0);
                }
                if (z) {
                    charSequenceF = f();
                    if (!TextUtils.isEmpty(charSequenceF)) {
                        textView.setText(charSequenceF);
                        z = false;
                    }
                }
                i = z ? 8 : 0;
                if (i != textView.getVisibility()) {
                    textView.setVisibility(i);
                }
            }
            textView.setText(this.Z);
            z = false;
            if (z) {
                charSequenceF = f();
                if (!TextUtils.isEmpty(charSequenceF)) {
                    textView.setText(charSequenceF);
                    z = false;
                }
            }
            if (z) {
            }
            if (i != textView.getVisibility()) {
                textView.setVisibility(i);
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void m() {
        boolean z = !this.Y;
        if (a(Boolean.valueOf(z))) {
            A(z);
        }
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2596qp0.class)) {
            super.p(parcelable);
            return;
        }
        C2596qp0 c2596qp0 = (C2596qp0) parcelable;
        super.p(c2596qp0.getSuperState());
        A(c2596qp0.l);
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        this.U = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        C2596qp0 c2596qp0 = new C2596qp0(absSavedState);
        c2596qp0.l = this.Y;
        return c2596qp0;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (y()) {
            zBooleanValue = this.m.c().getBoolean(this.w, zBooleanValue);
        }
        A(zBooleanValue);
    }

    @Override // androidx.preference.Preference
    public final boolean x() {
        boolean z;
        if (this.c0) {
            z = this.Y;
        } else {
            z = !this.Y;
        }
        return z || super.x();
    }
}
