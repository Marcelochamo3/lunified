package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public final class RY implements TextWatcher {
    public final /* synthetic */ DialogInterfaceC2619r2 l;

    public RY(DialogInterfaceC2619r2 dialogInterfaceC2619r2) {
        this.l = dialogInterfaceC2619r2;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Button button = this.l.q.k;
        boolean z = false;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        }
        button.setEnabled(z);
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
