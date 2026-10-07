package o;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;

/* JADX INFO: renamed from: o.Wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0870Wp implements TextWatcher {
    public final EditText l;
    public C0844Vp n;
    public final boolean m = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f606o = true;

    public C0870Wp(EditText editText) {
        this.l = editText;
    }

    public static void a(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            C0455Gp c0455GpA = C0455Gp.a();
            if (editableText == null) {
                length = 0;
            } else {
                c0455GpA.getClass();
                length = editableText.length();
            }
            c0455GpA.f(editableText, 0, length);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditText editText = this.l;
        if (editText.isInEditMode() || !this.f606o) {
            return;
        }
        if ((this.m || C0455Gp.k != null) && i2 <= i3 && (charSequence instanceof Spannable)) {
            int iB = C0455Gp.a().b();
            if (iB != 0) {
                if (iB == 1) {
                    C0455Gp.a().f((Spannable) charSequence, i, i3 + i);
                    return;
                } else if (iB != 3) {
                    return;
                }
            }
            C0455Gp c0455GpA = C0455Gp.a();
            if (this.n == null) {
                this.n = new C0844Vp(editText);
            }
            c0455GpA.g(this.n);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
