package o;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class G20 {
    public final TextPaint a;
    public final TextDirectionHeuristic b;
    public final int c;
    public final int d;

    public G20(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            OU.f(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.a = textPaint;
        this.b = textDirectionHeuristic;
        this.c = i;
        this.d = i2;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:16:0x0022  */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public final boolean equals(Object obj) {
        TextPaint textPaint;
        float textScaleX;
        TextPaint textPaint2;
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G20)) {
            return false;
        }
        G20 g20 = (G20) obj;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.c == g20.c && this.d == g20.d) {
                textPaint = this.a;
                if (textPaint.getTextSize() != g20.a.getTextSize()) {
                    z = false;
                } else {
                    textScaleX = textPaint.getTextScaleX();
                    textPaint2 = g20.a;
                    if (textScaleX != textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && (i < 24 ? textPaint.getTextLocale().equals(textPaint2.getTextLocale()) : textPaint.getTextLocales().equals(textPaint2.getTextLocales())) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            } else {
                z = false;
            }
        } else {
            textPaint = this.a;
            if (textPaint.getTextSize() != g20.a.getTextSize()) {
                z = false;
            } else {
                textScaleX = textPaint.getTextScaleX();
                textPaint2 = g20.a;
                if (textScaleX != textPaint2.getTextScaleX()) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        return z && this.b == g20.b;
    }

    public final int hashCode() {
        TextDirectionHeuristic textDirectionHeuristic = this.b;
        int i = Build.VERSION.SDK_INT;
        int i2 = this.d;
        int i3 = this.c;
        TextPaint textPaint = this.a;
        return i >= 24 ? Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2)) : Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i >= 24) {
            sb.append(", textLocale=" + textPaint.getTextLocales());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            sb.append(", variationSettings=" + textPaint.getFontVariationSettings());
        }
        sb.append(", textDir=" + this.b);
        sb.append(", breakStrategy=" + this.c);
        sb.append(", hyphenationFrequency=" + this.d);
        sb.append("}");
        return sb.toString();
    }

    public G20(PrecomputedText.Params params) {
        this.a = params.getTextPaint();
        this.b = params.getTextDirection();
        this.c = params.getBreakStrategy();
        this.d = params.getHyphenationFrequency();
    }
}
