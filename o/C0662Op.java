package o;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.Op, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0662Op extends AbstractC0403Ep {
    public final WeakReference a;
    public final WeakReference b;

    public C0662Op(TextView textView, C0688Pp c0688Pp) {
        this.a = new WeakReference(textView);
        this.b = new WeakReference(c0688Pp);
    }

    @Override // o.AbstractC0403Ep
    public final void b() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.a.get();
        InputFilter inputFilter = (InputFilter) this.b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0455Gp c0455GpA = C0455Gp.a();
                    if (text == null) {
                        length = 0;
                    } else {
                        c0455GpA.getClass();
                        length = text.length();
                    }
                    CharSequence charSequenceF = c0455GpA.f(text, 0, length);
                    if (text == charSequenceF) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(charSequenceF);
                    int selectionEnd = Selection.getSelectionEnd(charSequenceF);
                    textView.setText(charSequenceF);
                    if (charSequenceF instanceof Spannable) {
                        Spannable spannable = (Spannable) charSequenceF;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
