package o;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class OU {
    public static /* synthetic */ PrecomputedText.Params.Builder f(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ boolean n(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}
