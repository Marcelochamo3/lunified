package androidx.preference;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.skidush.clonex.R;
import o.C0713Qo;
import o.Z20;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    public final ArrayAdapter j0;
    public Spinner k0;
    public final C0713Qo l0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.dropdownPreferenceStyle);
        this.l0 = new C0713Qo(0, this);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, android.R.layout.simple_spinner_dropdown_item);
        this.j0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.e0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.ListPreference
    public final void C(CharSequence[] charSequenceArr) {
        this.e0 = charSequenceArr;
        ArrayAdapter arrayAdapter = this.j0;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr2 = this.e0;
        if (charSequenceArr2 != null) {
            for (CharSequence charSequence : charSequenceArr2) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public final void h() {
        super.h();
        ArrayAdapter arrayAdapter = this.j0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.Preference
    public final void l(Z20 z20) {
        int length;
        Spinner spinner = (Spinner) z20.a.findViewById(R.id.spinner);
        this.k0 = spinner;
        spinner.setAdapter((SpinnerAdapter) this.j0);
        this.k0.setOnItemSelectedListener(this.l0);
        Spinner spinner2 = this.k0;
        String str = this.g0;
        CharSequence[] charSequenceArr = this.f0;
        if (str == null || charSequenceArr == null) {
            length = -1;
        } else {
            length = charSequenceArr.length - 1;
            while (length >= 0) {
                if (!TextUtils.equals(charSequenceArr[length].toString(), str)) {
                    length--;
                }
            }
            length = -1;
        }
        spinner2.setSelection(length);
        super.l(z20);
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public final void m() {
        this.k0.performClick();
    }
}
