package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import androidx.appcompat.widget.SwitchCompat;
import com.skidush.clonex.R;
import o.C1500fd;
import o.D40;
import o.Z20;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final C1500fd d0;
    public final CharSequence e0;
    public final CharSequence f0;

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle);
        this.d0 = new C1500fd(this, 2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.m, R.attr.switchPreferenceCompatStyle, 0);
        String string = typedArrayObtainStyledAttributes.getString(7);
        this.Z = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.Y) {
            h();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(6);
        this.a0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.Y) {
            h();
        }
        String string3 = typedArrayObtainStyledAttributes.getString(9);
        this.e0 = string3 == null ? typedArrayObtainStyledAttributes.getString(3) : string3;
        h();
        String string4 = typedArrayObtainStyledAttributes.getString(8);
        this.f0 = string4 == null ? typedArrayObtainStyledAttributes.getString(4) : string4;
        h();
        this.c0 = typedArrayObtainStyledAttributes.getBoolean(5, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Y);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.e0);
            switchCompat.setTextOff(this.f0);
            switchCompat.setOnCheckedChangeListener(this.d0);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(Z20 z20) {
        super.l(z20);
        C(z20.u(R.id.switchWidget));
        B(z20.u(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.l.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(R.id.switchWidget));
            B(view.findViewById(android.R.id.summary));
        }
    }
}
