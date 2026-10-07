package o;

import android.os.Bundle;
import androidx.preference.ListPreference;

/* JADX INFO: loaded from: classes.dex */
public class MK extends Q20 {
    public int J0;
    public CharSequence[] K0;
    public CharSequence[] L0;

    @Override // o.Q20, o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void H(Bundle bundle) {
        super.H(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.J0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.K0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.L0);
    }

    @Override // o.Q20
    public final void c0(boolean z) {
        int i;
        if (!z || (i = this.J0) < 0) {
            return;
        }
        String string = this.L0[i].toString();
        ListPreference listPreference = (ListPreference) a0();
        if (listPreference.a(string)) {
            listPreference.D(string);
        }
    }

    @Override // o.Q20
    public final void d0(C2523q2 c2523q2) {
        CharSequence[] charSequenceArr = this.K0;
        int i = this.J0;
        LK lk = new LK(this);
        C2135m2 c2135m2 = c2523q2.a;
        c2135m2.m = charSequenceArr;
        c2135m2.f907o = lk;
        c2135m2.t = i;
        c2135m2.s = true;
        c2135m2.g = null;
        c2135m2.h = null;
    }

    @Override // o.Q20, o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        super.z(bundle);
        if (bundle != null) {
            this.J0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.K0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.L0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) a0();
        if (listPreference.e0 == null || listPreference.f0 == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.J0 = listPreference.A(listPreference.g0);
        this.K0 = listPreference.e0;
        this.L0 = listPreference.f0;
    }
}
