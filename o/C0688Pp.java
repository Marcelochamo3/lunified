package o;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: o.Pp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0688Pp implements InputFilter {
    public final TextView a;
    public C0662Op b;

    public C0688Pp(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int iB = C0455Gp.a().b();
        if (iB != 0) {
            if (iB == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0455Gp.a().f(charSequence, 0, charSequence.length());
            }
            if (iB != 3) {
                return charSequence;
            }
        }
        C0455Gp c0455GpA = C0455Gp.a();
        if (this.b == null) {
            this.b = new C0662Op(textView, this);
        }
        c0455GpA.g(this.b);
        return charSequence;
    }
}
