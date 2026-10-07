package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.Switch;
import com.skidush.clonex.R;
import o.AbstractC1370eA;
import o.C1500fd;
import o.D40;
import o.Z20;

/* JADX INFO: loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final C1500fd d0;
    public final CharSequence e0;
    public final CharSequence f0;

    /* JADX WARN: Illegal instructions before constructor call */
    public SwitchPreference(Context context, AttributeSet attributeSet) {
        int iQ = AbstractC1370eA.q(context, R.attr.switchPreferenceStyle, android.R.attr.switchPreferenceStyle);
        super(context, attributeSet, iQ);
        this.d0 = new C1500fd(this, 1);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.l, iQ, 0);
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
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Y);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.e0);
            r4.setTextOff(this.f0);
            r4.setOnCheckedChangeListener(this.d0);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(Z20 z20) {
        super.l(z20);
        C(z20.u(android.R.id.switch_widget));
        B(z20.u(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.l.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(android.R.id.switch_widget));
            B(view.findViewById(android.R.id.summary));
        }
    }
}
