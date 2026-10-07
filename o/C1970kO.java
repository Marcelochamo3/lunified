package o;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o.kO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1970kO extends Drawable.ConstantState {
    public C1891jd0 a;
    public C3467zp b;
    public ColorStateList c;
    public ColorStateList d;
    public final ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f865o;
    public final int p;
    public int q;
    public int r;
    public final int s;
    public final boolean t;
    public final Paint.Style u;

    public C1970kO(C1891jd0 c1891jd0) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.f865o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.a = c1891jd0;
        this.b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C2068lO c2068lO = new C2068lO(this);
        c2068lO.p = true;
        return c2068lO;
    }

    public C1970kO(C1970kO c1970kO) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.f865o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.a = c1970kO.a;
        this.b = c1970kO.b;
        this.k = c1970kO.k;
        this.c = c1970kO.c;
        this.d = c1970kO.d;
        this.g = c1970kO.g;
        this.f = c1970kO.f;
        this.l = c1970kO.l;
        this.i = c1970kO.i;
        this.r = c1970kO.r;
        this.p = c1970kO.p;
        this.t = c1970kO.t;
        this.j = c1970kO.j;
        this.m = c1970kO.m;
        this.n = c1970kO.n;
        this.f865o = c1970kO.f865o;
        this.q = c1970kO.q;
        this.s = c1970kO.s;
        this.e = c1970kO.e;
        this.u = c1970kO.u;
        if (c1970kO.h != null) {
            this.h = new Rect(c1970kO.h);
        }
    }
}
