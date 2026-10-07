package o;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class Ii0 {
    public float c;
    public float d;
    public final WeakReference f;
    public Fi0 g;
    public final TextPaint a = new TextPaint(1);
    public final C2280nd b = new C2280nd(1, this);
    public boolean e = true;

    public Ii0(Hi0 hi0) {
        this.f = new WeakReference(null);
        this.f = new WeakReference(hi0);
    }

    public final void a(String str) {
        TextPaint textPaint = this.a;
        this.c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.e = false;
    }

    public final void b(Fi0 fi0, Context context) {
        if (this.g != fi0) {
            this.g = fi0;
            if (fi0 != null) {
                TextPaint textPaint = this.a;
                C2280nd c2280nd = this.b;
                fi0.f(context, textPaint, c2280nd);
                Hi0 hi0 = (Hi0) this.f.get();
                if (hi0 != null) {
                    textPaint.drawableState = hi0.getState();
                }
                fi0.e(context, textPaint, c2280nd);
                this.e = true;
            }
            Hi0 hi1 = (Hi0) this.f.get();
            if (hi1 != null) {
                hi1.a();
                hi1.onStateChange(hi1.getState());
            }
        }
    }
}
