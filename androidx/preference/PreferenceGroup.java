package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import java.util.ArrayList;
import o.D40;
import o.Nd0;
import o.T20;

/* JADX INFO: loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final Nd0 Y;
    public final ArrayList Z;
    public boolean a0;
    public int b0;
    public boolean c0;
    public int d0;

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.Y = new Nd0(0);
        new Handler(Looper.getMainLooper());
        this.a0 = true;
        this.b0 = 0;
        this.c0 = false;
        this.d0 = Integer.MAX_VALUE;
        this.Z = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.i, i, 0);
        this.a0 = typedArrayObtainStyledAttributes.getBoolean(2, typedArrayObtainStyledAttributes.getBoolean(2, true));
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            int i2 = typedArrayObtainStyledAttributes.getInt(1, typedArrayObtainStyledAttributes.getInt(1, Integer.MAX_VALUE));
            if (i2 != Integer.MAX_VALUE) {
                TextUtils.isEmpty(this.w);
            }
            this.d0 = i2;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final Preference A(CharSequence charSequence) {
        Preference preferenceA;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.w, charSequence)) {
            return this;
        }
        int iC = C();
        for (int i = 0; i < iC; i++) {
            Preference preferenceB = B(i);
            if (TextUtils.equals(preferenceB.w, charSequence)) {
                return preferenceB;
            }
            if ((preferenceB instanceof PreferenceGroup) && (preferenceA = ((PreferenceGroup) preferenceB).A(charSequence)) != null) {
                return preferenceA;
            }
        }
        return null;
    }

    public final Preference B(int i) {
        return (Preference) this.Z.get(i);
    }

    public final int C() {
        return this.Z.size();
    }

    @Override // androidx.preference.Preference
    public final void b(Bundle bundle) {
        super.b(bundle);
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            B(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void c(Bundle bundle) {
        super.c(bundle);
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            B(i).c(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public final void i(boolean z) {
        super.i(z);
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            Preference preferenceB = B(i);
            if (preferenceB.G == z) {
                preferenceB.G = !z;
                preferenceB.i(preferenceB.x());
                preferenceB.h();
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void j() {
        super.j();
        this.c0 = true;
        int iC = C();
        for (int i = 0; i < iC; i++) {
            B(i).j();
        }
    }

    @Override // androidx.preference.Preference
    public final void n() {
        super.n();
        this.c0 = false;
        int size = this.Z.size();
        for (int i = 0; i < size; i++) {
            B(i).n();
        }
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(T20.class)) {
            super.p(parcelable);
            return;
        }
        T20 t20 = (T20) parcelable;
        this.d0 = t20.l;
        super.p(t20.getSuperState());
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        this.U = true;
        return new T20(AbsSavedState.EMPTY_STATE, this.d0);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
