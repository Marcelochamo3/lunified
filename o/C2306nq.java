package o;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: o.nq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2306nq {
    public final /* synthetic */ C2403oq a;

    public C2306nq(C2403oq c2403oq) {
        this.a = c2403oq;
    }

    public final void a(TextInputLayout textInputLayout) {
        C2403oq c2403oq = this.a;
        if (c2403oq.D == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c2403oq.D;
        C2209mq c2209mq = c2403oq.G;
        if (editText != null) {
            editText.removeTextChangedListener(c2209mq);
            if (c2403oq.D.getOnFocusChangeListener() == c2403oq.b().e()) {
                c2403oq.D.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c2403oq.D = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c2209mq);
        }
        c2403oq.b().m(c2403oq.D);
        c2403oq.j(c2403oq.b());
    }
}
