package androidx.leanback.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;
import o.AbstractC3045vW;
import o.Q40;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
class ResizingTextView extends TextView {
    public final int l;
    public final int m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f23o;
    public final int p;
    public boolean q;
    public int r;
    public float s;
    public int t;
    public int u;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.textViewStyle);
        this.q = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Q40.g, R.attr.textViewStyle, 0);
        try {
            this.l = typedArrayObtainStyledAttributes.getInt(1, 1);
            this.m = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, -1);
            this.n = typedArrayObtainStyledAttributes.getBoolean(0, false);
            this.f23o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0);
            this.p = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i, int i2) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i, getPaddingEnd(), i2);
        } else {
            setPadding(getPaddingLeft(), i, getPaddingRight(), i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:42:0x00cd A[PHI: r2
  0x00cd: PHI (r2v6 boolean) = (r2v2 boolean), (r2v8 boolean) binds: [B:40:0x00ca, B:27:0x0097] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2 = true;
        if (!this.q) {
            this.r = (int) getTextSize();
            this.s = getLineSpacingExtra();
            this.t = getPaddingTop();
            this.u = getPaddingBottom();
            this.q = true;
        }
        boolean z3 = false;
        setTextSize(0, this.r);
        setLineSpacing(this.s, getLineSpacingMultiplier());
        a(this.t, this.u);
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        if (layout == null || (this.l & 1) <= 0) {
            z = false;
        } else {
            int lineCount = layout.getLineCount();
            int maxLines = getMaxLines();
            if (maxLines <= 1 || lineCount != maxLines) {
                z = false;
            } else {
                z = true;
            }
        }
        int textSize = (int) getTextSize();
        boolean z4 = this.n;
        int i4 = this.m;
        if (z) {
            if (i4 != -1 && textSize != i4) {
                setTextSize(0, i4);
                z3 = true;
            }
            float f = (this.s + this.r) - i4;
            if (z4 && getLineSpacingExtra() != f) {
                setLineSpacing(f, getLineSpacingMultiplier());
                z3 = true;
            }
            int i5 = this.t + this.f23o;
            int i6 = this.u + this.p;
            if (getPaddingTop() == i5 && getPaddingBottom() == i6) {
                z2 = z3;
            } else {
                a(i5, i6);
            }
        } else {
            if (i4 != -1 && textSize != (i3 = this.r)) {
                setTextSize(0, i3);
                z3 = true;
            }
            if (z4) {
                float lineSpacingExtra = getLineSpacingExtra();
                float f2 = this.s;
                if (lineSpacingExtra != f2) {
                    setLineSpacing(f2, getLineSpacingMultiplier());
                    z3 = true;
                }
            }
            if (getPaddingTop() == this.t && getPaddingBottom() == this.u) {
                z2 = z3;
            } else {
                a(this.t, this.u);
            }
        }
        if (z2) {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC3045vW.S(callback, this));
    }
}
