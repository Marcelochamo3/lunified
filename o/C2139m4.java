package o;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: o.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2139m4 {
    public final TextView a;
    public final C2133m1 b;

    public C2139m4(TextView textView) {
        this.a = textView;
        this.b = new C2133m1(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((UK) this.b.m).p(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, T40.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            d(z);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void c(boolean z) {
        ((UK) this.b.m).R(z);
    }

    public final void d(boolean z) {
        ((UK) this.b.m).S(z);
    }
}
