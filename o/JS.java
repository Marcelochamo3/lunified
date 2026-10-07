package o;

import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class JS extends Q20 {
    public final HashSet J0 = new HashSet();
    public boolean K0;
    public CharSequence[] L0;
    public CharSequence[] M0;

    @Override // o.Q20, o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void H(Bundle bundle) {
        super.H(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.J0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.K0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.L0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.M0);
    }

    @Override // o.Q20
    public final void c0(boolean z) {
        if (z && this.K0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a0();
            HashSet hashSet = this.J0;
            if (multiSelectListPreference.a(hashSet)) {
                multiSelectListPreference.A(hashSet);
            }
        }
        this.K0 = false;
    }

    @Override // o.Q20
    public final void d0(C2523q2 c2523q2) {
        int length = this.M0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.J0.contains(this.M0[i].toString());
        }
        CharSequence[] charSequenceArr = this.L0;
        IS is = new IS(this);
        C2135m2 c2135m2 = c2523q2.a;
        c2135m2.m = charSequenceArr;
        c2135m2.u = is;
        c2135m2.q = zArr;
        c2135m2.r = true;
    }

    @Override // o.Q20, o.DialogInterfaceOnCancelListenerC0348Cm, o.AbstractComponentCallbacksC1247cx
    public final void z(Bundle bundle) {
        CharSequence[] charSequenceArr;
        super.z(bundle);
        HashSet hashSet = this.J0;
        if (bundle != null) {
            hashSet.clear();
            hashSet.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.K0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.L0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.M0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) a0();
        if (multiSelectListPreference.e0 == null || (charSequenceArr = multiSelectListPreference.f0) == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        hashSet.clear();
        hashSet.addAll(multiSelectListPreference.g0);
        this.K0 = false;
        this.L0 = multiSelectListPreference.e0;
        this.M0 = charSequenceArr;
    }
}
