package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.skidush.clonex.R;
import o.AbstractC1370eA;
import o.C1500fd;
import o.D40;
import o.Z20;

/* JADX INFO: loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final C1500fd d0;

    /* JADX WARN: Illegal instructions before constructor call */
    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        int iQ = AbstractC1370eA.q(context, R.attr.checkBoxPreferenceStyle, android.R.attr.checkBoxPreferenceStyle);
        super(context, attributeSet, iQ);
        this.d0 = new C1500fd(this, 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, D40.b, iQ, 0);
        String string = typedArrayObtainStyledAttributes.getString(5);
        this.Z = string == null ? typedArrayObtainStyledAttributes.getString(0) : string;
        if (this.Y) {
            h();
        }
        String string2 = typedArrayObtainStyledAttributes.getString(4);
        this.a0 = string2 == null ? typedArrayObtainStyledAttributes.getString(1) : string2;
        if (!this.Y) {
            h();
        }
        this.c0 = typedArrayObtainStyledAttributes.getBoolean(3, typedArrayObtainStyledAttributes.getBoolean(2, false));
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void C(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.Y);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.d0);
        }
    }

    @Override // androidx.preference.Preference
    public final void l(Z20 z20) {
        super.l(z20);
        C(z20.u(android.R.id.checkbox));
        B(z20.u(android.R.id.summary));
    }

    @Override // androidx.preference.Preference
    public final void s(View view) {
        super.s(view);
        if (((AccessibilityManager) this.l.getSystemService("accessibility")).isEnabled()) {
            C(view.findViewById(android.R.id.checkbox));
            B(view.findViewById(android.R.id.summary));
        }
    }
}
