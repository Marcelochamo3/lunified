package o;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class Mi0 implements TextWatcher {
    public int l;
    public final /* synthetic */ EditText m;
    public final /* synthetic */ TextInputLayout n;

    public Mi0(TextInputLayout textInputLayout, EditText editText) {
        this.n = textInputLayout;
        this.m = editText;
        this.l = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.n;
        textInputLayout.u(!textInputLayout.L0, false);
        if (textInputLayout.v) {
            textInputLayout.n(editable);
        }
        if (textInputLayout.D) {
            textInputLayout.v(editable);
        }
        EditText editText = this.m;
        int lineCount = editText.getLineCount();
        int i = this.l;
        if (lineCount != i) {
            if (lineCount < i) {
                WeakHashMap weakHashMap = It0.a;
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.E0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.l = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
