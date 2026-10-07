package o;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class Y50 extends ViewGroup.MarginLayoutParams {
    public AbstractC2144m60 a;
    public final Rect b;
    public boolean c;
    public boolean d;

    public Y50(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public Y50(int i, int i2) {
        super(i, i2);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public Y50(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public Y50(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }

    public Y50(Y50 y50) {
        super((ViewGroup.LayoutParams) y50);
        this.b = new Rect();
        this.c = true;
        this.d = false;
    }
}
