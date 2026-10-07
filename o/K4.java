package o;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class K4 extends AP {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ WeakReference f;
    public final /* synthetic */ P4 g;

    public K4(P4 p4, int i, int i2, WeakReference weakReference) {
        this.g = p4;
        this.d = i;
        this.e = i2;
        this.f = weakReference;
    }

    @Override // o.AP
    public final void r(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.d) != -1) {
            typeface = O4.a(typeface, i, (this.e & 2) != 0);
        }
        P4 p4 = this.g;
        if (p4.m) {
            p4.l = typeface;
            TextView textView = (TextView) this.f.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC3393z1(textView, typeface, p4.j, 1));
                } else {
                    textView.setTypeface(typeface, p4.j);
                }
            }
        }
    }

    @Override // o.AP
    public final void q(int i) {
    }
}
