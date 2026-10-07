package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.x4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3205x4 extends C2720s4 {
    public final SeekBar p;
    public Drawable q;
    public ColorStateList r;
    public PorterDuff.Mode s;
    public boolean t;
    public boolean u;

    public C3205x4(SeekBar seekBar) {
        super(seekBar);
        this.r = null;
        this.s = null;
        this.t = false;
        this.u = false;
        this.p = seekBar;
    }

    @Override // o.C2720s4
    public final void b0(AttributeSet attributeSet, int i) {
        super.b0(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.p;
        Context context = seekBar.getContext();
        int[] iArr = T40.g;
        RN rnY = RN.y(context, attributeSet, iArr, R.attr.seekBarStyle, 0);
        It0.o(seekBar, seekBar.getContext(), iArr, attributeSet, (TypedArray) rnY.n, R.attr.seekBarStyle);
        Drawable drawableV = rnY.v(0);
        if (drawableV != null) {
            seekBar.setThumb(drawableV);
        }
        Drawable drawableU = rnY.u(1);
        Drawable drawable = this.q;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.q = drawableU;
        if (drawableU != null) {
            drawableU.setCallback(seekBar);
            AbstractC3045vW.J(drawableU, seekBar.getLayoutDirection());
            if (drawableU.isStateful()) {
                drawableU.setState(seekBar.getDrawableState());
            }
            p0();
        }
        seekBar.invalidate();
        TypedArray typedArray = (TypedArray) rnY.n;
        if (typedArray.hasValue(3)) {
            this.s = AbstractC3077vo.c(typedArray.getInt(3, -1), this.s);
            this.u = true;
        }
        if (typedArray.hasValue(2)) {
            this.r = rnY.s(2);
            this.t = true;
        }
        rnY.A();
        p0();
    }

    public final void p0() {
        Drawable drawable = this.q;
        if (drawable != null) {
            if (this.t || this.u) {
                Drawable drawableR = AbstractC3045vW.R(drawable.mutate());
                this.q = drawableR;
                if (this.t) {
                    AbstractC2205mo.h(drawableR, this.r);
                }
                if (this.u) {
                    AbstractC2205mo.i(this.q, this.s);
                }
                if (this.q.isStateful()) {
                    this.q.setState(this.p.getDrawableState());
                }
            }
        }
    }

    public final void q0(Canvas canvas) {
        if (this.q != null) {
            SeekBar seekBar = this.p;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.q.getIntrinsicWidth();
                int intrinsicHeight = this.q.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.q.setBounds(-i, -i2, i, i2);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.q.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }
}
