package o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.Oz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0672Oz extends Drawable implements InterfaceC0802Tz, Animatable {
    public final Y2 l;
    public boolean m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f445o;
    public int q;
    public boolean s;
    public Paint t;
    public Rect u;
    public boolean p = true;
    public final int r = -1;

    public C0672Oz(Y2 y2) {
        AbstractC3045vW.k(y2, "Argument must not be null");
        this.l = y2;
    }

    public final void a() {
        AbstractC3045vW.h("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f445o);
        C0854Vz c0854Vz = (C0854Vz) this.l.b;
        if (c0854Vz.a.l.c == 1) {
            invalidateSelf();
            return;
        }
        if (this.m) {
            return;
        }
        this.m = true;
        if (c0854Vz.j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        ArrayList arrayList = c0854Vz.c;
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c0854Vz.f) {
            c0854Vz.f = true;
            c0854Vz.j = false;
            c0854Vz.a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f445o) {
            return;
        }
        if (this.s) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.u == null) {
                this.u = new Rect();
            }
            Gravity.apply(Yu0.b.g0, intrinsicWidth, intrinsicHeight, bounds, this.u);
            this.s = false;
        }
        C0854Vz c0854Vz = (C0854Vz) this.l.b;
        C0776Sz c0776Sz = c0854Vz.i;
        Bitmap bitmap = c0776Sz != null ? c0776Sz.r : c0854Vz.l;
        if (this.u == null) {
            this.u = new Rect();
        }
        Rect rect = this.u;
        if (this.t == null) {
            this.t = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.t);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C0854Vz) this.l.b).p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C0854Vz) this.l.b).f584o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.m;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.s = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.t == null) {
            this.t = new Paint(2);
        }
        this.t.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.t == null) {
            this.t = new Paint(2);
        }
        this.t.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        AbstractC3045vW.h("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f445o);
        this.p = z;
        if (!z) {
            this.m = false;
            C0854Vz c0854Vz = (C0854Vz) this.l.b;
            ArrayList arrayList = c0854Vz.c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c0854Vz.f = false;
            }
        } else if (this.n) {
            a();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.n = true;
        this.q = 0;
        if (this.p) {
            a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.n = false;
        this.m = false;
        C0854Vz c0854Vz = (C0854Vz) this.l.b;
        ArrayList arrayList = c0854Vz.c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c0854Vz.f = false;
        }
    }
}
