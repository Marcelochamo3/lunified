package o;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: renamed from: o.wg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3159wg0 {
    public static final int m;
    public static boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Constructor f1097o;
    public static TextDirectionHeuristic p;
    public CharSequence a;
    public final TextPaint b;
    public final int c;
    public int d;
    public boolean k;
    public Layout.Alignment e = Layout.Alignment.ALIGN_NORMAL;
    public int f = Integer.MAX_VALUE;
    public float g = 0.0f;
    public float h = 1.0f;
    public int i = m;
    public boolean j = true;
    public TextUtils.TruncateAt l = null;

    static {
        m = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    public C3159wg0(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.c = i;
        this.d = charSequence.length();
    }

    public final StaticLayout a() throws C3062vg0 {
        TextPaint textPaint = this.b;
        if (this.a == null) {
            this.a = "";
        }
        int iMax = Math.max(0, this.c);
        CharSequence charSequenceEllipsize = this.a;
        if (this.f == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint, iMax, this.l);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.d);
        this.d = iMin;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.k && this.f == 1) {
                this.e = Layout.Alignment.ALIGN_OPPOSITE;
            }
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, 0, iMin, textPaint, iMax);
            builderObtain.setAlignment(this.e);
            builderObtain.setIncludePad(this.j);
            builderObtain.setTextDirection(this.k ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
            TextUtils.TruncateAt truncateAt = this.l;
            if (truncateAt != null) {
                builderObtain.setEllipsize(truncateAt);
            }
            builderObtain.setMaxLines(this.f);
            float f = this.g;
            if (f != 0.0f || this.h != 1.0f) {
                builderObtain.setLineSpacing(f, this.h);
            }
            if (this.f > 1) {
                builderObtain.setHyphenationFrequency(this.i);
            }
            return builderObtain.build();
        }
        if (!n) {
            try {
                p = this.k && i >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                f1097o = declaredConstructor;
                declaredConstructor.setAccessible(true);
                n = true;
            } catch (Exception e) {
                throw new C3062vg0(e);
            }
        }
        try {
            Constructor constructor = f1097o;
            constructor.getClass();
            Integer numValueOf = Integer.valueOf(this.d);
            Integer numValueOf2 = Integer.valueOf(iMax);
            Layout.Alignment alignment = this.e;
            TextDirectionHeuristic textDirectionHeuristic = p;
            textDirectionHeuristic.getClass();
            return (StaticLayout) constructor.newInstance(charSequenceEllipsize, 0, numValueOf, textPaint, numValueOf2, alignment, textDirectionHeuristic, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.j), null, Integer.valueOf(iMax), Integer.valueOf(this.f));
        } catch (Exception e2) {
            throw new C3062vg0(e2);
        }
    }
}
