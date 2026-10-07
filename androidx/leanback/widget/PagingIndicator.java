package androidx.leanback.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.skidush.clonex.R;
import o.C3441zc;
import o.It0;
import o.Q40;
import o.YW;

/* JADX INFO: loaded from: classes.dex */
public class PagingIndicator extends View {
    public static final DecelerateInterpolator H = new DecelerateInterpolator();
    public static final C3441zc I;
    public static final C3441zc J;
    public static final C3441zc K;
    public int A;
    public final Paint B;
    public final Paint C;
    public Bitmap D;
    public Paint E;
    public final Rect F;
    public final float G;
    public boolean l;
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f22o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public YW[] t;
    public int[] u;
    public int[] v;
    public int[] w;
    public int x;
    public int y;
    public int z;

    static {
        Class<Float> cls = Float.class;
        I = new C3441zc(cls, "alpha", 5);
        J = new C3441zc(cls, "diameter", 6);
        K = new C3441zc(cls, "translation_x", 7);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AnimatorSet animatorSet = new AnimatorSet();
        Resources resources = getResources();
        int[] iArr = Q40.b;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        It0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_dot_radius));
        this.n = dimensionPixelOffset;
        int i = dimensionPixelOffset * 2;
        this.m = i;
        int dimensionPixelOffset2 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_arrow_radius));
        this.q = dimensionPixelOffset2;
        int i2 = dimensionPixelOffset2 * 2;
        this.p = i2;
        this.f22o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_dot_gap));
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, getResources().getDimensionPixelOffset(R.dimen.lb_page_indicator_arrow_gap));
        int color = typedArrayObtainStyledAttributes.getColor(3, getResources().getColor(R.color.lb_page_indicator_dot));
        Paint paint = new Paint(1);
        this.B = paint;
        paint.setColor(color);
        this.A = typedArrayObtainStyledAttributes.getColor(0, getResources().getColor(R.color.lb_page_indicator_arrow_background));
        if (this.E == null && typedArrayObtainStyledAttributes.hasValue(1)) {
            setArrowColor(typedArrayObtainStyledAttributes.getColor(1, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.l = resources.getConfiguration().getLayoutDirection() == 0;
        int color2 = resources.getColor(R.color.lb_page_indicator_arrow_shadow);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_radius);
        this.s = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.C = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.lb_page_indicator_arrow_shadow_offset);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color2);
        this.D = d();
        this.F = new Rect(0, 0, this.D.getWidth(), this.D.getHeight());
        float f = i2;
        this.G = this.D.getWidth() / f;
        AnimatorSet animatorSet2 = new AnimatorSet();
        C3441zc c3441zc = I;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, c3441zc, 0.0f, 1.0f);
        objectAnimatorOfFloat.setDuration(167L);
        DecelerateInterpolator decelerateInterpolator = H;
        objectAnimatorOfFloat.setInterpolator(decelerateInterpolator);
        float f2 = i;
        C3441zc c3441zc2 = J;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat((Object) null, c3441zc2, f2, f);
        objectAnimatorOfFloat2.setDuration(417L);
        objectAnimatorOfFloat2.setInterpolator(decelerateInterpolator);
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, c());
        AnimatorSet animatorSet3 = new AnimatorSet();
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat((Object) null, c3441zc, 1.0f, 0.0f);
        objectAnimatorOfFloat3.setDuration(167L);
        objectAnimatorOfFloat3.setInterpolator(decelerateInterpolator);
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat((Object) null, c3441zc2, f, f2);
        objectAnimatorOfFloat4.setDuration(417L);
        objectAnimatorOfFloat4.setInterpolator(decelerateInterpolator);
        animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, c());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingBottom() + getPaddingTop() + this.p + this.s;
    }

    private int getDesiredWidth() {
        return getPaddingRight() + getPaddingLeft() + getRequiredWidth();
    }

    private int getRequiredWidth() {
        return ((this.y - 3) * this.f22o) + (this.r * 2) + (this.n * 2);
    }

    private void setSelectedPage(int i) {
        if (i == this.z) {
            return;
        }
        this.z = i;
        a();
    }

    public final void a() {
        int i;
        int i2 = 0;
        while (true) {
            i = this.z;
            float f = -1.0f;
            if (i2 >= i) {
                break;
            }
            this.t[i2].b();
            YW yw = this.t[i2];
            if (i2 != 0) {
                f = 1.0f;
            }
            yw.h = f;
            yw.d = this.v[i2];
            i2++;
        }
        YW yw2 = this.t[i];
        yw2.c = 0.0f;
        yw2.d = 0.0f;
        PagingIndicator pagingIndicator = yw2.j;
        yw2.e = pagingIndicator.p;
        float f2 = pagingIndicator.q;
        yw2.f = f2;
        yw2.g = f2 * pagingIndicator.G;
        yw2.a = 1.0f;
        yw2.a();
        YW[] ywArr = this.t;
        int i3 = this.z;
        YW yw3 = ywArr[i3];
        yw3.h = i3 <= 0 ? 1.0f : -1.0f;
        yw3.d = this.u[i3];
        while (true) {
            i3++;
            if (i3 >= this.y) {
                return;
            }
            this.t[i3].b();
            YW yw4 = this.t[i3];
            yw4.h = 1.0f;
            yw4.d = this.w[i3];
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i = (paddingLeft + width) / 2;
        int i2 = this.y;
        int[] iArr = new int[i2];
        this.u = iArr;
        int[] iArr2 = new int[i2];
        this.v = iArr2;
        int[] iArr3 = new int[i2];
        this.w = iArr3;
        boolean z = this.l;
        int i3 = this.n;
        int i4 = this.r;
        int i5 = this.f22o;
        int i6 = 1;
        if (z) {
            int i7 = i - (requiredWidth / 2);
            iArr[0] = ((i7 + i3) - i5) + i4;
            iArr2[0] = i7 + i3;
            iArr3[0] = (i4 * 2) + ((i7 + i3) - (i5 * 2));
            while (i6 < this.y) {
                int[] iArr4 = this.u;
                int[] iArr5 = this.v;
                int i8 = i6 - 1;
                iArr4[i6] = iArr5[i8] + i4;
                iArr5[i6] = iArr5[i8] + i5;
                this.w[i6] = iArr4[i8] + i4;
                i6++;
            }
        } else {
            int i9 = (requiredWidth / 2) + i;
            iArr[0] = ((i9 - i3) + i5) - i4;
            iArr2[0] = i9 - i3;
            iArr3[0] = ((i5 * 2) + (i9 - i3)) - (i4 * 2);
            while (i6 < this.y) {
                int[] iArr6 = this.u;
                int[] iArr7 = this.v;
                int i10 = i6 - 1;
                iArr6[i6] = iArr7[i10] - i4;
                iArr7[i6] = iArr7[i10] - i5;
                this.w[i6] = iArr6[i10] - i4;
                i6++;
            }
        }
        this.x = paddingTop + this.q;
        a();
    }

    public final ObjectAnimator c() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, K, (-this.r) + this.f22o, 0.0f);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(H);
        return objectAnimatorOfFloat;
    }

    public final Bitmap d() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), R.drawable.lb_ic_nav_arrow);
        if (this.l) {
            return bitmapDecodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
    }

    public int[] getDotSelectedLeftX() {
        return this.v;
    }

    public int[] getDotSelectedRightX() {
        return this.w;
    }

    public int[] getDotSelectedX() {
        return this.u;
    }

    public int getPageCount() {
        return this.y;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        for (int i = 0; i < this.y; i++) {
            YW yw = this.t[i];
            float f = yw.d + yw.c;
            PagingIndicator pagingIndicator = yw.j;
            canvas.drawCircle(f, pagingIndicator.x, yw.f, pagingIndicator.B);
            if (yw.a > 0.0f) {
                Paint paint = pagingIndicator.C;
                paint.setColor(yw.b);
                canvas.drawCircle(f, pagingIndicator.x, yw.f, paint);
                Bitmap bitmap = pagingIndicator.D;
                float f2 = yw.g;
                float f3 = pagingIndicator.x;
                canvas.drawBitmap(bitmap, pagingIndicator.F, new Rect((int) (f - f2), (int) (f3 - f2), (int) (f + f2), (int) (f3 + f2)), pagingIndicator.E);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i2));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i2);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 0;
        if (this.l != z) {
            this.l = z;
            this.D = d();
            YW[] ywArr = this.t;
            if (ywArr != null) {
                for (YW yw : ywArr) {
                    yw.i = yw.j.l ? 1.0f : -1.0f;
                }
            }
            b();
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        setMeasuredDimension(i, i2);
        b();
    }

    public void setArrowBackgroundColor(int i) {
        this.A = i;
    }

    public void setArrowColor(int i) {
        if (this.E == null) {
            this.E = new Paint();
        }
        this.E.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i) {
        this.B.setColor(i);
    }

    public void setPageCount(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.y = i;
        this.t = new YW[i];
        for (int i2 = 0; i2 < this.y; i2++) {
            this.t[i2] = new YW(this);
        }
        b();
        setSelectedPage(0);
    }
}
