package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.widget.SeekBar;
import android.widget.TextView;
import com.skidush.clonex.R;
import o.C2277nb0;
import o.C2471pb0;
import o.D40;
import o.ViewOnKeyListenerC2374ob0;
import o.Z20;

/* JADX INFO: loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int Y;
    public int Z;
    public int a0;
    public int b0;
    public boolean c0;
    public SeekBar d0;
    public TextView e0;
    public final boolean f0;
    public final boolean g0;
    public final boolean h0;
    public final C2277nb0 i0;
    public final ViewOnKeyListenerC2374ob0 j0;

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle);
        this.i0 = new C2277nb0(this);
        this.j0 = new ViewOnKeyListenerC2374ob0(this);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.k, R.attr.seekBarPreferenceStyle, 0);
        this.Z = typedArrayObtainStyledAttributes.getInt(3, 0);
        int i = typedArrayObtainStyledAttributes.getInt(1, 100);
        int i2 = this.Z;
        i = i < i2 ? i2 : i;
        if (i != this.a0) {
            this.a0 = i;
            h();
        }
        int i3 = typedArrayObtainStyledAttributes.getInt(4, 0);
        if (i3 != this.b0) {
            this.b0 = Math.min(this.a0 - this.Z, Math.abs(i3));
            h();
        }
        this.f0 = typedArrayObtainStyledAttributes.getBoolean(2, true);
        this.g0 = typedArrayObtainStyledAttributes.getBoolean(5, false);
        this.h0 = typedArrayObtainStyledAttributes.getBoolean(6, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void A(int i, boolean z) {
        int i2 = this.Z;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.a0;
        if (i > i3) {
            i = i3;
        }
        if (i != this.Y) {
            this.Y = i;
            TextView textView = this.e0;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
            if (y()) {
                int i4 = ~i;
                if (y()) {
                    i4 = this.m.c().getInt(this.w, i4);
                }
                if (i != i4) {
                    SharedPreferences.Editor editorA = this.m.a();
                    editorA.putInt(this.w, i);
                    z(editorA);
                }
            }
            if (z) {
                h();
            }
        }
    }

    public final void B(SeekBar seekBar) {
        int progress = seekBar.getProgress() + this.Z;
        if (progress != this.Y) {
            if (a(Integer.valueOf(progress))) {
                A(progress, false);
                return;
            }
            seekBar.setProgress(this.Y - this.Z);
            int i = this.Y;
            TextView textView = this.e0;
            if (textView != null) {
                textView.setText(String.valueOf(i));
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void l(Z20 z20) {
        super.l(z20);
        z20.a.setOnKeyListener(this.j0);
        this.d0 = (SeekBar) z20.u(R.id.seekbar);
        TextView textView = (TextView) z20.u(R.id.seekbar_value);
        this.e0 = textView;
        if (this.g0) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.e0 = null;
        }
        SeekBar seekBar = this.d0;
        if (seekBar == null) {
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.i0);
        this.d0.setMax(this.a0 - this.Z);
        int i = this.b0;
        if (i != 0) {
            this.d0.setKeyProgressIncrement(i);
        } else {
            this.b0 = this.d0.getKeyProgressIncrement();
        }
        this.d0.setProgress(this.Y - this.Z);
        int i2 = this.Y;
        TextView textView2 = this.e0;
        if (textView2 != null) {
            textView2.setText(String.valueOf(i2));
        }
        this.d0.setEnabled(g());
    }

    @Override // androidx.preference.Preference
    public final Object o(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public final void p(Parcelable parcelable) {
        if (!parcelable.getClass().equals(C2471pb0.class)) {
            super.p(parcelable);
            return;
        }
        C2471pb0 c2471pb0 = (C2471pb0) parcelable;
        super.p(c2471pb0.getSuperState());
        this.Y = c2471pb0.l;
        this.Z = c2471pb0.m;
        this.a0 = c2471pb0.n;
        h();
    }

    @Override // androidx.preference.Preference
    public final Parcelable q() {
        this.U = true;
        AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
        if (this.C) {
            return absSavedState;
        }
        C2471pb0 c2471pb0 = new C2471pb0(absSavedState);
        c2471pb0.l = this.Y;
        c2471pb0.m = this.Z;
        c2471pb0.n = this.a0;
        return c2471pb0;
    }

    @Override // androidx.preference.Preference
    public final void r(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        int iIntValue = ((Integer) obj).intValue();
        if (y()) {
            iIntValue = this.m.c().getInt(this.w, iIntValue);
        }
        A(iIntValue, true);
    }
}
