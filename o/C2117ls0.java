package o;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* JADX INFO: renamed from: o.ls0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2117ls0 extends AbstractC2408os0 {
    public C2613qy e;
    public float f;
    public C2613qy g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public Paint.Cap m;
    public Paint.Join n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f903o;

    @Override // o.AbstractC2311ns0
    public final boolean a() {
        return this.g.t() || this.e.t();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001e  */
    @Override // o.AbstractC2311ns0
    public final boolean b(int[] iArr) {
        boolean z;
        C2613qy c2613qy = this.g;
        boolean z2 = false;
        if (c2613qy.t()) {
            ColorStateList colorStateList = (ColorStateList) c2613qy.f996o;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c2613qy.m) {
                c2613qy.m = colorForState;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        C2613qy c2613qy2 = this.e;
        if (c2613qy2.t()) {
            ColorStateList colorStateList2 = (ColorStateList) c2613qy2.f996o;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c2613qy2.m) {
                c2613qy2.m = colorForState2;
                z2 = true;
            }
        }
        return z | z2;
    }

    public float getFillAlpha() {
        return this.i;
    }

    public int getFillColor() {
        return this.g.m;
    }

    public float getStrokeAlpha() {
        return this.h;
    }

    public int getStrokeColor() {
        return this.e.m;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public float getTrimPathEnd() {
        return this.k;
    }

    public float getTrimPathOffset() {
        return this.l;
    }

    public float getTrimPathStart() {
        return this.j;
    }

    public void setFillAlpha(float f) {
        this.i = f;
    }

    public void setFillColor(int i) {
        this.g.m = i;
    }

    public void setStrokeAlpha(float f) {
        this.h = f;
    }

    public void setStrokeColor(int i) {
        this.e.m = i;
    }

    public void setStrokeWidth(float f) {
        this.f = f;
    }

    public void setTrimPathEnd(float f) {
        this.k = f;
    }

    public void setTrimPathOffset(float f) {
        this.l = f;
    }

    public void setTrimPathStart(float f) {
        this.j = f;
    }
}
