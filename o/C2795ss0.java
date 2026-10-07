package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: o.ss0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2795ss0 extends AbstractC1921js0 {
    public static final PorterDuff.Mode u = PorterDuff.Mode.SRC_IN;
    public C2602qs0 m;
    public PorterDuffColorFilter n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ColorFilter f1034o;
    public boolean p;
    public boolean q;
    public final float[] r;
    public final Matrix s;
    public final Rect t;

    public C2795ss0() {
        this.q = true;
        this.r = new float[9];
        this.s = new Matrix();
        this.t = new Rect();
        C2602qs0 c2602qs0 = new C2602qs0();
        c2602qs0.c = null;
        c2602qs0.d = u;
        c2602qs0.b = new C2505ps0();
        this.m = c2602qs0;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.l;
        if (drawable == null) {
            return false;
        }
        AbstractC2205mo.b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.t;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f1034o;
        if (colorFilter == null) {
            colorFilter = this.n;
        }
        Matrix matrix = this.s;
        canvas.getMatrix(matrix);
        float[] fArr = this.r;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(C1672hI.a.g, iWidth);
        int iMin2 = Math.min(C1672hI.a.g, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC3045vW.p(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C2602qs0 c2602qs0 = this.m;
        Bitmap bitmap = c2602qs0.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c2602qs0.f.getHeight()) {
            c2602qs0.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c2602qs0.k = true;
        }
        if (this.q) {
            C2602qs0 c2602qs1 = this.m;
            if (c2602qs1.k || c2602qs1.g != c2602qs1.c || c2602qs1.h != c2602qs1.d || c2602qs1.j != c2602qs1.e || c2602qs1.i != c2602qs1.b.getRootAlpha()) {
                C2602qs0 c2602qs2 = this.m;
                c2602qs2.f.eraseColor(0);
                Canvas canvas2 = new Canvas(c2602qs2.f);
                C2505ps0 c2505ps0 = c2602qs2.b;
                c2505ps0.a(c2505ps0.g, C2505ps0.p, canvas2, iMin, iMin2);
                C2602qs0 c2602qs3 = this.m;
                c2602qs3.g = c2602qs3.c;
                c2602qs3.h = c2602qs3.d;
                c2602qs3.i = c2602qs3.b.getRootAlpha();
                c2602qs3.j = c2602qs3.e;
                c2602qs3.k = false;
            }
        } else {
            C2602qs0 c2602qs4 = this.m;
            c2602qs4.f.eraseColor(0);
            Canvas canvas3 = new Canvas(c2602qs4.f);
            C2505ps0 c2505ps1 = c2602qs4.b;
            c2505ps1.a(c2505ps1.g, C2505ps0.p, canvas3, iMin, iMin2);
        }
        C2602qs0 c2602qs5 = this.m;
        if (c2602qs5.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c2602qs5.l == null) {
                Paint paint2 = new Paint();
                c2602qs5.l = paint2;
                paint2.setFilterBitmap(true);
            }
            c2602qs5.l.setAlpha(c2602qs5.b.getRootAlpha());
            c2602qs5.l.setColorFilter(colorFilter);
            paint = c2602qs5.l;
        }
        canvas.drawBitmap(c2602qs5.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.getAlpha() : this.m.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.m.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.l;
        return drawable != null ? AbstractC2205mo.c(drawable) : this.f1034o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.l != null && Build.VERSION.SDK_INT >= 24) {
            return new C2698rs0(this.l.getConstantState());
        }
        this.m.a = getChangingConfigurations();
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.m.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.m.b.h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.l;
        return drawable != null ? drawable.isAutoMirrored() : this.m.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.l;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C2602qs0 c2602qs0 = this.m;
            if (c2602qs0 != null) {
                C2505ps0 c2505ps0 = c2602qs0.b;
                if (c2505ps0.n == null) {
                    c2505ps0.n = Boolean.valueOf(c2505ps0.g.a());
                }
                if (c2505ps0.n.booleanValue() || ((colorStateList = this.m.c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.p && super.mutate() == this) {
            C2602qs0 c2602qs0 = this.m;
            C2602qs0 c2602qs1 = new C2602qs0();
            c2602qs1.c = null;
            c2602qs1.d = u;
            if (c2602qs0 != null) {
                c2602qs1.a = c2602qs0.a;
                C2505ps0 c2505ps0 = new C2505ps0(c2602qs0.b);
                c2602qs1.b = c2505ps0;
                if (c2602qs0.b.e != null) {
                    c2505ps0.e = new Paint(c2602qs0.b.e);
                }
                if (c2602qs0.b.d != null) {
                    c2602qs1.b.d = new Paint(c2602qs0.b.d);
                }
                c2602qs1.c = c2602qs0.c;
                c2602qs1.d = c2602qs0.d;
                c2602qs1.e = c2602qs0.e;
            }
            this.m = c2602qs1;
            this.p = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.l;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C2602qs0 c2602qs0 = this.m;
        ColorStateList colorStateList = c2602qs0.c;
        if (colorStateList == null || (mode = c2602qs0.d) == null) {
            z = false;
        } else {
            this.n = a(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C2505ps0 c2505ps0 = c2602qs0.b;
        if (c2505ps0.n == null) {
            c2505ps0.n = Boolean.valueOf(c2505ps0.g.a());
        }
        if (c2505ps0.n.booleanValue()) {
            boolean zB = c2602qs0.b.g.b(iArr);
            c2602qs0.k |= zB;
            if (zB) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.m.b.getRootAlpha() != i) {
            this.m.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.m.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1034o = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC3045vW.M(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC2205mo.h(drawable, colorStateList);
            return;
        }
        C2602qs0 c2602qs0 = this.m;
        if (c2602qs0.c != colorStateList) {
            c2602qs0.c = colorStateList;
            this.n = a(colorStateList, c2602qs0.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC2205mo.i(drawable, mode);
            return;
        }
        C2602qs0 c2602qs0 = this.m;
        if (c2602qs0.d != mode) {
            c2602qs0.d = mode;
            this.n = a(c2602qs0.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.l;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C2505ps0 c2505ps0;
        int i;
        Paint.Cap cap;
        Drawable drawable = this.l;
        if (drawable != null) {
            AbstractC2205mo.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C2602qs0 c2602qs0 = this.m;
        c2602qs0.b = new C2505ps0();
        TypedArray typedArrayG = AbstractC1370eA.G(resources, theme, attributeSet, AbstractC1370eA.a);
        C2602qs0 c2602qs1 = this.m;
        C2505ps0 c2505ps1 = c2602qs1.b;
        int i2 = !AbstractC1370eA.w(xmlPullParser, "tintMode") ? -1 : typedArrayG.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (i2 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i2 != 5) {
            if (i2 != 9) {
                switch (i2) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c2602qs1.d = mode;
        ColorStateList colorStateListA = null;
        if (AbstractC1370eA.w(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArrayG.getValue(1, typedValue);
            int i4 = typedValue.type;
            if (i4 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i4 >= 28 && i4 <= 31) {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayG.getResources();
                int resourceId = typedArrayG.getResourceId(1, 0);
                ThreadLocal threadLocal = Cif.a;
                try {
                    colorStateListA = Cif.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception unused) {
                }
            }
        }
        ColorStateList colorStateList = colorStateListA;
        if (colorStateList != null) {
            c2602qs1.c = colorStateList;
        }
        boolean z = c2602qs1.e;
        if (AbstractC1370eA.w(xmlPullParser, "autoMirrored")) {
            z = typedArrayG.getBoolean(5, z);
        }
        c2602qs1.e = z;
        float f = c2505ps1.j;
        if (AbstractC1370eA.w(xmlPullParser, "viewportWidth")) {
            f = typedArrayG.getFloat(7, f);
        }
        c2505ps1.j = f;
        float f2 = c2505ps1.k;
        if (AbstractC1370eA.w(xmlPullParser, "viewportHeight")) {
            f2 = typedArrayG.getFloat(8, f2);
        }
        c2505ps1.k = f2;
        if (c2505ps1.j <= 0.0f) {
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f2 > 0.0f) {
            c2505ps1.h = typedArrayG.getDimension(3, c2505ps1.h);
            float dimension = typedArrayG.getDimension(2, c2505ps1.i);
            c2505ps1.i = dimension;
            if (c2505ps1.h <= 0.0f) {
                throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c2505ps1.getAlpha();
                if (AbstractC1370eA.w(xmlPullParser, "alpha")) {
                    alpha = typedArrayG.getFloat(4, alpha);
                }
                c2505ps1.setAlpha(alpha);
                String string = typedArrayG.getString(0);
                if (string != null) {
                    c2505ps1.m = string;
                    c2505ps1.f982o.put(string, c2505ps1);
                }
                typedArrayG.recycle();
                c2602qs0.a = getChangingConfigurations();
                c2602qs0.k = true;
                C2602qs0 c2602qs2 = this.m;
                C2505ps0 c2505ps2 = c2602qs2.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c2505ps2.g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z2 = true;
                for (int i5 = 1; eventType != i5 && (xmlPullParser.getDepth() >= depth || eventType != i3); i5 = 1) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C2214ms0 c2214ms0 = (C2214ms0) arrayDeque.peek();
                        boolean zEquals = "path".equals(name);
                        S5 s5 = c2505ps2.f982o;
                        c2505ps0 = c2505ps2;
                        if (zEquals) {
                            C2117ls0 c2117ls0 = new C2117ls0();
                            c2117ls0.f = 0.0f;
                            c2117ls0.h = 1.0f;
                            c2117ls0.i = 1.0f;
                            c2117ls0.j = 0.0f;
                            c2117ls0.k = 1.0f;
                            c2117ls0.l = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c2117ls0.m = cap2;
                            Paint.Join join = Paint.Join.MITER;
                            c2117ls0.n = join;
                            i = depth;
                            c2117ls0.f903o = 4.0f;
                            TypedArray typedArrayG2 = AbstractC1370eA.G(resources, theme, attributeSet, AbstractC1370eA.c);
                            if (AbstractC1370eA.w(xmlPullParser, "pathData")) {
                                String string2 = typedArrayG2.getString(0);
                                if (string2 != null) {
                                    c2117ls0.b = string2;
                                }
                                String string3 = typedArrayG2.getString(2);
                                if (string3 != null) {
                                    c2117ls0.a = zy0.p(string3);
                                }
                                c2117ls0.g = AbstractC1370eA.u(typedArrayG2, xmlPullParser, theme, "fillColor", 1);
                                float f3 = c2117ls0.i;
                                if (AbstractC1370eA.w(xmlPullParser, "fillAlpha")) {
                                    f3 = typedArrayG2.getFloat(12, f3);
                                }
                                c2117ls0.i = f3;
                                int i6 = !AbstractC1370eA.w(xmlPullParser, "strokeLineCap") ? -1 : typedArrayG2.getInt(8, -1);
                                Paint.Cap cap3 = c2117ls0.m;
                                if (i6 == 0) {
                                    cap = cap2;
                                } else if (i6 != 1) {
                                    cap = i6 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c2117ls0.m = cap;
                                int i7 = !AbstractC1370eA.w(xmlPullParser, "strokeLineJoin") ? -1 : typedArrayG2.getInt(9, -1);
                                Paint.Join join2 = c2117ls0.n;
                                if (i7 != 0) {
                                    if (i7 != 1) {
                                        join = i7 != 2 ? join2 : Paint.Join.BEVEL;
                                    } else {
                                        join = Paint.Join.ROUND;
                                    }
                                }
                                c2117ls0.n = join;
                                float f4 = c2117ls0.f903o;
                                if (AbstractC1370eA.w(xmlPullParser, "strokeMiterLimit")) {
                                    f4 = typedArrayG2.getFloat(10, f4);
                                }
                                c2117ls0.f903o = f4;
                                c2117ls0.e = AbstractC1370eA.u(typedArrayG2, xmlPullParser, theme, "strokeColor", 3);
                                float f5 = c2117ls0.h;
                                if (AbstractC1370eA.w(xmlPullParser, "strokeAlpha")) {
                                    f5 = typedArrayG2.getFloat(11, f5);
                                }
                                c2117ls0.h = f5;
                                float f6 = c2117ls0.f;
                                if (AbstractC1370eA.w(xmlPullParser, "strokeWidth")) {
                                    f6 = typedArrayG2.getFloat(4, f6);
                                }
                                c2117ls0.f = f6;
                                float f7 = c2117ls0.k;
                                if (AbstractC1370eA.w(xmlPullParser, "trimPathEnd")) {
                                    f7 = typedArrayG2.getFloat(6, f7);
                                }
                                c2117ls0.k = f7;
                                float f8 = c2117ls0.l;
                                if (AbstractC1370eA.w(xmlPullParser, "trimPathOffset")) {
                                    f8 = typedArrayG2.getFloat(7, f8);
                                }
                                c2117ls0.l = f8;
                                float f9 = c2117ls0.j;
                                if (AbstractC1370eA.w(xmlPullParser, "trimPathStart")) {
                                    f9 = typedArrayG2.getFloat(5, f9);
                                }
                                c2117ls0.j = f9;
                                int i8 = c2117ls0.c;
                                if (AbstractC1370eA.w(xmlPullParser, "fillType")) {
                                    i8 = typedArrayG2.getInt(13, i8);
                                }
                                c2117ls0.c = i8;
                            }
                            typedArrayG2.recycle();
                            c2214ms0.b.add(c2117ls0);
                            if (c2117ls0.getPathName() != null) {
                                s5.put(c2117ls0.getPathName(), c2117ls0);
                            }
                            c2602qs2.a |= c2117ls0.d;
                            z2 = false;
                        } else {
                            i = depth;
                            if ("clip-path".equals(name)) {
                                C2019ks0 c2019ks0 = new C2019ks0();
                                if (AbstractC1370eA.w(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayG3 = AbstractC1370eA.G(resources, theme, attributeSet, AbstractC1370eA.d);
                                    String string4 = typedArrayG3.getString(0);
                                    if (string4 != null) {
                                        c2019ks0.b = string4;
                                    }
                                    String string5 = typedArrayG3.getString(1);
                                    if (string5 != null) {
                                        c2019ks0.a = zy0.p(string5);
                                    }
                                    c2019ks0.c = !AbstractC1370eA.w(xmlPullParser, "fillType") ? 0 : typedArrayG3.getInt(2, 0);
                                    typedArrayG3.recycle();
                                }
                                c2214ms0.b.add(c2019ks0);
                                if (c2019ks0.getPathName() != null) {
                                    s5.put(c2019ks0.getPathName(), c2019ks0);
                                }
                                c2602qs2.a |= c2019ks0.d;
                            } else if ("group".equals(name)) {
                                C2214ms0 c2214ms1 = new C2214ms0();
                                TypedArray typedArrayG4 = AbstractC1370eA.G(resources, theme, attributeSet, AbstractC1370eA.b);
                                float f10 = c2214ms1.c;
                                if (AbstractC1370eA.w(xmlPullParser, "rotation")) {
                                    f10 = typedArrayG4.getFloat(5, f10);
                                }
                                c2214ms1.c = f10;
                                c2214ms1.d = typedArrayG4.getFloat(1, c2214ms1.d);
                                c2214ms1.e = typedArrayG4.getFloat(2, c2214ms1.e);
                                float f11 = c2214ms1.f;
                                if (AbstractC1370eA.w(xmlPullParser, "scaleX")) {
                                    f11 = typedArrayG4.getFloat(3, f11);
                                }
                                c2214ms1.f = f11;
                                float f12 = c2214ms1.g;
                                if (AbstractC1370eA.w(xmlPullParser, "scaleY")) {
                                    f12 = typedArrayG4.getFloat(4, f12);
                                }
                                c2214ms1.g = f12;
                                float f13 = c2214ms1.h;
                                if (AbstractC1370eA.w(xmlPullParser, "translateX")) {
                                    f13 = typedArrayG4.getFloat(6, f13);
                                }
                                c2214ms1.h = f13;
                                float f14 = c2214ms1.i;
                                if (AbstractC1370eA.w(xmlPullParser, "translateY")) {
                                    f14 = typedArrayG4.getFloat(7, f14);
                                }
                                c2214ms1.i = f14;
                                String string6 = typedArrayG4.getString(0);
                                if (string6 != null) {
                                    c2214ms1.l = string6;
                                }
                                c2214ms1.c();
                                typedArrayG4.recycle();
                                c2214ms0.b.add(c2214ms1);
                                arrayDeque.push(c2214ms1);
                                if (c2214ms1.getGroupName() != null) {
                                    s5.put(c2214ms1.getGroupName(), c2214ms1);
                                }
                                c2602qs2.a = c2214ms1.k | c2602qs2.a;
                            }
                        }
                        i3 = 3;
                    } else {
                        c2505ps0 = c2505ps2;
                        i = depth;
                        i3 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    c2505ps2 = c2505ps0;
                    depth = i;
                }
                if (!z2) {
                    this.n = a(c2602qs0.c, c2602qs0.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayG.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C2795ss0(C2602qs0 c2602qs0) {
        this.q = true;
        this.r = new float[9];
        this.s = new Matrix();
        this.t = new Rect();
        this.m = c2602qs0;
        this.n = a(c2602qs0.c, c2602qs0.d);
    }
}
