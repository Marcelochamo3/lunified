package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import o.C0519Jb;
import o.C2720s4;
import o.H80;
import o.L40;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] q = {R.attr.colorBackground};
    public static final C0519Jb r = new C0519Jb(0);
    public boolean l;
    public boolean m;
    public final Rect n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f12o;
    public final C2720s4 p;

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, com.skidush.clonex.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.n = rect;
        this.f12o = new Rect();
        C2720s4 c2720s4 = new C2720s4(this);
        this.p = c2720s4;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, L40.a, com.skidush.clonex.R.attr.cardViewStyle, com.skidush.clonex.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(q);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(com.skidush.clonex.R.color.cardview_light_background) : getResources().getColor(com.skidush.clonex.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.l = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.m = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        C0519Jb c0519Jb = r;
        H80 h80 = new H80(colorStateListValueOf, dimension);
        c2720s4.m = h80;
        setBackgroundDrawable(h80);
        setClipToOutline(true);
        setElevation(dimension2);
        c0519Jb.G(c2720s4, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((H80) ((Drawable) this.p.m)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.p.n).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.n.bottom;
    }

    public int getContentPaddingLeft() {
        return this.n.left;
    }

    public int getContentPaddingRight() {
        return this.n.right;
    }

    public int getContentPaddingTop() {
        return this.n.top;
    }

    public float getMaxCardElevation() {
        return ((H80) ((Drawable) this.p.m)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.m;
    }

    public float getRadius() {
        return ((H80) ((Drawable) this.p.m)).a;
    }

    public boolean getUseCompatPadding() {
        return this.l;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        H80 h80 = (H80) ((Drawable) this.p.m);
        if (colorStateListValueOf == null) {
            h80.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        h80.h = colorStateListValueOf;
        h80.b.setColor(colorStateListValueOf.getColorForState(h80.getState(), h80.h.getDefaultColor()));
        h80.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.p.n).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        r.G(this.p, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.m) {
            this.m = z;
            C0519Jb c0519Jb = r;
            C2720s4 c2720s4 = this.p;
            c0519Jb.G(c2720s4, ((H80) ((Drawable) c2720s4.m)).e);
        }
    }

    public void setRadius(float f) {
        H80 h80 = (H80) ((Drawable) this.p.m);
        if (f == h80.a) {
            return;
        }
        h80.a = f;
        h80.b(null);
        h80.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.l != z) {
            this.l = z;
            C0519Jb c0519Jb = r;
            C2720s4 c2720s4 = this.p;
            c0519Jb.G(c2720s4, ((H80) ((Drawable) c2720s4.m)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        H80 h80 = (H80) ((Drawable) this.p.m);
        if (colorStateList == null) {
            h80.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        h80.h = colorStateList;
        h80.b.setColor(colorStateList.getColorForState(h80.getState(), h80.h.getDefaultColor()));
        h80.invalidateSelf();
    }
}
