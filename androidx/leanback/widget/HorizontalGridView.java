package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import o.AbstractC0976a8;
import o.C2926uA;
import o.C3217xA;
import o.It0;
import o.Q40;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalGridView extends AbstractC0976a8 {
    public boolean b1;
    public boolean c1;
    public final Paint d1;
    public Bitmap e1;
    public LinearGradient f1;
    public int g1;
    public int h1;
    public Bitmap i1;
    public LinearGradient j1;
    public int k1;
    public int l1;
    public final Rect m1;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d1 = new Paint();
        this.m1 = new Rect();
        this.U0.y1(0);
        q0(context, attributeSet);
        int[] iArr = Q40.e;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        It0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        setRowHeight(typedArrayObtainStyledAttributes);
        setNumRows(typedArrayObtainStyledAttributes.getInt(0, 1));
        typedArrayObtainStyledAttributes.recycle();
        s0();
        Paint paint = new Paint();
        this.d1 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.i1;
        if (bitmap == null || bitmap.getWidth() != this.k1 || this.i1.getHeight() != getHeight()) {
            this.i1 = Bitmap.createBitmap(this.k1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.i1;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.e1;
        if (bitmap == null || bitmap.getWidth() != this.g1 || this.e1.getHeight() != getHeight()) {
            this.e1 = Bitmap.createBitmap(this.g1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.e1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        boolean z2 = this.b1;
        C3217xA c3217xA = this.U0;
        boolean z3 = true;
        if (!z2) {
            z = false;
            break;
        }
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            }
            View childAt = getChildAt(i);
            c3217xA.getClass();
            C2926uA c2926uA = (C2926uA) childAt.getLayoutParams();
            c2926uA.getClass();
            if (childAt.getLeft() + c2926uA.e < getPaddingLeft() - this.h1) {
                z = true;
                break;
            }
            i++;
        }
        if (!this.c1) {
            z3 = false;
            break;
        }
        int childCount2 = getChildCount() - 1;
        while (true) {
            if (childCount2 < 0) {
                z3 = false;
                break;
            }
            View childAt2 = getChildAt(childCount2);
            c3217xA.getClass();
            C2926uA c2926uA2 = (C2926uA) childAt2.getLayoutParams();
            c2926uA2.getClass();
            if (childAt2.getRight() - c2926uA2.g > (getWidth() - getPaddingRight()) + this.l1) {
                break;
            } else {
                childCount2--;
            }
        }
        if (!z) {
            this.e1 = null;
        }
        if (!z3) {
            this.i1 = null;
        }
        if (!z && !z3) {
            super.draw(canvas);
            return;
        }
        int paddingLeft = this.b1 ? (getPaddingLeft() - this.h1) - this.g1 : 0;
        int width = this.c1 ? (getWidth() - getPaddingRight()) + this.l1 + this.k1 : getWidth();
        int iSave = canvas.save();
        canvas.clipRect((this.b1 ? this.g1 : 0) + paddingLeft, 0, width - (this.c1 ? this.k1 : 0), getHeight());
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        Canvas canvas2 = new Canvas();
        Rect rect = this.m1;
        rect.top = 0;
        rect.bottom = getHeight();
        if (z && this.g1 > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int iSave2 = canvas2.save();
            canvas2.clipRect(0, 0, this.g1, getHeight());
            float f = -paddingLeft;
            canvas2.translate(f, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            this.d1.setShader(this.f1);
            canvas2.drawRect(0.0f, 0.0f, this.g1, getHeight(), this.d1);
            rect.left = 0;
            rect.right = this.g1;
            canvas.translate(paddingLeft, 0.0f);
            canvas.drawBitmap(tempBitmapLow, rect, rect, (Paint) null);
            canvas.translate(f, 0.0f);
        }
        if (!z3 || this.k1 <= 0) {
            return;
        }
        Bitmap tempBitmapHigh = getTempBitmapHigh();
        tempBitmapHigh.eraseColor(0);
        canvas2.setBitmap(tempBitmapHigh);
        int iSave3 = canvas2.save();
        canvas2.clipRect(0, 0, this.k1, getHeight());
        canvas2.translate(-(width - this.k1), 0.0f);
        super.draw(canvas2);
        canvas2.restoreToCount(iSave3);
        this.d1.setShader(this.j1);
        canvas2.drawRect(0.0f, 0.0f, this.k1, getHeight(), this.d1);
        rect.left = 0;
        int i2 = this.k1;
        rect.right = i2;
        canvas.translate(width - i2, 0.0f);
        canvas.drawBitmap(tempBitmapHigh, rect, rect, (Paint) null);
        canvas.translate(-(width - this.k1), 0.0f);
    }

    public final boolean getFadingLeftEdge() {
        return this.b1;
    }

    public final int getFadingLeftEdgeLength() {
        return this.g1;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.h1;
    }

    public final boolean getFadingRightEdge() {
        return this.c1;
    }

    public final int getFadingRightEdgeLength() {
        return this.k1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.l1;
    }

    public final void s0() {
        if (this.b1 || this.c1) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }

    public final void setFadingLeftEdge(boolean z) {
        if (this.b1 != z) {
            this.b1 = z;
            if (!z) {
                this.e1 = null;
            }
            invalidate();
            s0();
        }
    }

    public final void setFadingLeftEdgeLength(int i) {
        if (this.g1 != i) {
            this.g1 = i;
            if (i != 0) {
                this.f1 = new LinearGradient(0.0f, 0.0f, this.g1, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
            } else {
                this.f1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i) {
        if (this.h1 != i) {
            this.h1 = i;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z) {
        if (this.c1 != z) {
            this.c1 = z;
            if (!z) {
                this.i1 = null;
            }
            invalidate();
            s0();
        }
    }

    public final void setFadingRightEdgeLength(int i) {
        if (this.k1 != i) {
            this.k1 = i;
            if (i != 0) {
                this.j1 = new LinearGradient(0.0f, 0.0f, this.k1, 0.0f, -16777216, 0, Shader.TileMode.CLAMP);
            } else {
                this.j1 = null;
            }
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i) {
        if (this.l1 != i) {
            this.l1 = i;
            invalidate();
        }
    }

    public void setNumRows(int i) {
        C3217xA c3217xA = this.U0;
        if (i < 0) {
            c3217xA.getClass();
            throw new IllegalArgumentException();
        }
        c3217xA.V = i;
        requestLayout();
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(1) != null) {
            setRowHeight(typedArray.getLayoutDimension(1, 0));
        }
    }

    public void setRowHeight(int i) {
        this.U0.z1(i);
        requestLayout();
    }
}
