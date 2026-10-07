package o;

import android.view.View;
import android.widget.AdapterView;
import androidx.preference.DropDownPreference;

/* JADX INFO: renamed from: o.Qo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0713Qo implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C0713Qo(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0687Po c0687Po;
        switch (this.l) {
            case 0:
                if (i >= 0) {
                    DropDownPreference dropDownPreference = (DropDownPreference) this.m;
                    String string = dropDownPreference.f0[i].toString();
                    if (!string.equals(dropDownPreference.g0) && dropDownPreference.a(string)) {
                        dropDownPreference.D(string);
                        break;
                    }
                }
                break;
            default:
                if (i != -1 && (c0687Po = ((JK) this.m).n) != null) {
                    c0687Po.setListSelectionHidden(false);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.l;
    }

    private final void a(AdapterView adapterView) {
    }

    private final void b(AdapterView adapterView) {
    }
}
