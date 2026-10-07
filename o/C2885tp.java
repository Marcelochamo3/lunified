package o;

import android.R;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.preference.EditTextPreference;

/* JADX INFO: renamed from: o.tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2885tp extends Q20 {
    public EditText J0;
    public CharSequence K0;
    public final RunnableC3102w1 L0 = new RunnableC3102w1(8, this);
    public long M0 = -1;

    @Override // o.Q20, o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void H(Bundle bundle) {
        super.H(bundle);
        bundle.putCharSequence("EditTextPreferenceDialogFragment.text", this.K0);
    }

    @Override // o.Q20
    public final void b0(View view) {
        super.b0(view);
        EditText editText = (EditText) view.findViewById(R.id.edit);
        this.J0 = editText;
        if (editText == null) {
            throw new IllegalStateException("Dialog view must contain an EditText with id @android:id/edit");
        }
        editText.requestFocus();
        this.J0.setText(this.K0);
        EditText editText2 = this.J0;
        editText2.setSelection(editText2.getText().length());
        ((EditTextPreference) a0()).getClass();
    }

    @Override // o.Q20
    public final void c0(boolean z) {
        if (z) {
            String string = this.J0.getText().toString();
            EditTextPreference editTextPreference = (EditTextPreference) a0();
            if (editTextPreference.a(string)) {
                editTextPreference.A(string);
            }
        }
    }

    @Override // o.Q20
    public final void e0() {
        this.M0 = SystemClock.currentThreadTimeMillis();
        f0();
    }

    public final void f0() {
        long j = this.M0;
        if (j == -1 || j + 1000 <= SystemClock.currentThreadTimeMillis()) {
            return;
        }
        EditText editText = this.J0;
        if (editText == null || !editText.isFocused()) {
            this.M0 = -1L;
            return;
        }
        if (((InputMethodManager) this.J0.getContext().getSystemService("input_method")).showSoftInput(this.J0, 0)) {
            this.M0 = -1L;
            return;
        }
        EditText editText2 = this.J0;
        RunnableC3102w1 runnableC3102w1 = this.L0;
        editText2.removeCallbacks(runnableC3102w1);
        this.J0.postDelayed(runnableC3102w1, 50L);
    }

    @Override // o.Q20, o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle == null) {
            this.K0 = ((EditTextPreference) a0()).e0;
        } else {
            this.K0 = bundle.getCharSequence("EditTextPreferenceDialogFragment.text");
        }
    }
}
