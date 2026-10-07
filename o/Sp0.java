package o;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Sp0 extends ReplacementSpan {
    public final Rp0 b;
    public TextPaint e;
    public final Paint.FontMetricsInt a = new Paint.FontMetricsInt();
    public short c = -1;
    public float d = 1.0f;

    public Sp0(Rp0 rp0) {
        Jp0.h(rp0, "rasterizer cannot be null");
        this.b = rp0;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        TextPaint textPaint = null;
        if (charSequence instanceof Spanned) {
            CharacterStyle[] characterStyleArr = (CharacterStyle[]) ((Spanned) charSequence).getSpans(i, i2, CharacterStyle.class);
            if (characterStyleArr.length != 0) {
                if (characterStyleArr.length != 1 || characterStyleArr[0] != this) {
                    TextPaint textPaint2 = this.e;
                    if (textPaint2 == null) {
                        textPaint2 = new TextPaint();
                        this.e = textPaint2;
                    }
                    textPaint = textPaint2;
                    textPaint.set(paint2);
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        characterStyle.updateDrawState(textPaint);
                    }
                } else if (paint2 instanceof TextPaint) {
                    textPaint = (TextPaint) paint2;
                }
            } else if (paint2 instanceof TextPaint) {
                textPaint = (TextPaint) paint2;
            }
        } else if (paint2 instanceof TextPaint) {
            textPaint = (TextPaint) paint2;
        }
        if (textPaint != null && textPaint.bgColor != 0) {
            int color = textPaint.getColor();
            Paint.Style style = textPaint.getStyle();
            textPaint.setColor(textPaint.bgColor);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawRect(f, i3, f + this.c, i5, textPaint);
            textPaint.setStyle(style);
            textPaint.setColor(color);
        }
        C0455Gp.a().getClass();
        float f2 = i4;
        if (textPaint != null) {
            paint2 = textPaint;
        }
        Rp0 rp0 = this.b;
        C1583gR c1583gR = rp0.b;
        Typeface typeface = (Typeface) c1583gR.p;
        Typeface typeface2 = paint2.getTypeface();
        paint2.setTypeface(typeface);
        canvas.drawText((char[]) c1583gR.n, rp0.a * 2, 2, f, f2, paint2);
        paint2.setTypeface(typeface2);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.a;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        Rp0 rp0 = this.b;
        EQ eqC = rp0.c();
        int iA = eqC.a(14);
        this.d = fAbs / (iA != 0 ? ((ByteBuffer) eqC.f969o).getShort(iA + eqC.l) : (short) 0);
        EQ eqC2 = rp0.c();
        int iA2 = eqC2.a(14);
        if (iA2 != 0) {
            ((ByteBuffer) eqC2.f969o).getShort(iA2 + eqC2.l);
        }
        EQ eqC3 = rp0.c();
        int iA3 = eqC3.a(12);
        short s = (short) ((iA3 != 0 ? ((ByteBuffer) eqC3.f969o).getShort(iA3 + eqC3.l) : (short) 0) * this.d);
        this.c = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
