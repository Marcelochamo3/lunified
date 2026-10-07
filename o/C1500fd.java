package o;

import android.widget.CompoundButton;
import androidx.preference.CheckBoxPreference;
import androidx.preference.SwitchPreference;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;

/* JADX INFO: renamed from: o.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1500fd implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoStatePreference b;

    public /* synthetic */ C1500fd(TwoStatePreference twoStatePreference, int i) {
        this.a = i;
        this.b = twoStatePreference;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.a) {
            case 0:
                Boolean boolValueOf = Boolean.valueOf(z);
                CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.b;
                if (!checkBoxPreference.a(boolValueOf)) {
                    compoundButton.setChecked(!z);
                } else {
                    checkBoxPreference.A(z);
                }
                break;
            case 1:
                Boolean boolValueOf2 = Boolean.valueOf(z);
                SwitchPreference switchPreference = (SwitchPreference) this.b;
                if (!switchPreference.a(boolValueOf2)) {
                    compoundButton.setChecked(!z);
                } else {
                    switchPreference.A(z);
                }
                break;
            default:
                Boolean boolValueOf3 = Boolean.valueOf(z);
                SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.b;
                if (!switchPreferenceCompat.a(boolValueOf3)) {
                    compoundButton.setChecked(!z);
                } else {
                    switchPreferenceCompat.A(z);
                }
                break;
        }
    }
}
