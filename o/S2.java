package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.util.StateSet;

/* JADX INFO: loaded from: classes.dex */
public final class S2 extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public C1480fM I;
    public C2866tf0 J;
    public final AbstractC2399oo a;
    public Resources b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f502o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public S2(S2 s2, V2 v2, Resources resources) {
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.a = v2;
        this.b = resources != null ? resources : s2 != null ? s2.b : null;
        int i = s2 != null ? s2.c : 0;
        int i2 = AbstractC2399oo.x;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (s2 != null) {
            this.d = s2.d;
            this.e = s2.e;
            this.u = true;
            this.v = true;
            this.i = s2.i;
            this.l = s2.l;
            this.w = s2.w;
            this.x = s2.x;
            this.y = s2.y;
            this.z = s2.z;
            this.A = s2.A;
            this.B = s2.B;
            this.C = s2.C;
            this.D = s2.D;
            this.E = s2.E;
            this.F = s2.F;
            this.G = s2.G;
            if (s2.c == i) {
                if (s2.j) {
                    this.k = s2.k != null ? new Rect(s2.k) : null;
                    this.j = true;
                }
                if (s2.m) {
                    this.n = s2.n;
                    this.f502o = s2.f502o;
                    this.p = s2.p;
                    this.q = s2.q;
                    this.m = true;
                }
            }
            if (s2.r) {
                this.s = s2.s;
                this.r = true;
            }
            if (s2.t) {
                this.t = true;
            }
            Drawable[] drawableArr = s2.g;
            this.g = new Drawable[drawableArr.length];
            this.h = s2.h;
            SparseArray sparseArray = s2.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i4, constantState);
                    } else {
                        this.g[i4] = drawableArr[i4];
                    }
                }
            }
        } else {
            this.g = new Drawable[10];
            this.h = 0;
        }
        if (s2 != null) {
            this.H = s2.H;
        } else {
            this.H = new int[this.g.length][];
        }
        if (s2 != null) {
            this.I = s2.I;
            this.J = s2.J;
        } else {
            this.I = new C1480fM();
            this.J = new C2866tf0();
        }
    }

    public final int a(Drawable drawable) {
        int i = this.h;
        if (i >= this.g.length) {
            int i2 = i + 10;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.g = drawableArr;
            int[][] iArr = new int[i2][];
            System.arraycopy(this.H, 0, iArr, 0, i);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.a);
        this.g[i] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return i;
    }

    public final void b() {
        this.m = true;
        c();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.f502o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f502o) {
                this.f502o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int iKeyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.g;
                Drawable drawableNewDrawable = constantState.newDrawable(this.b);
                if (Build.VERSION.SDK_INT >= 23) {
                    AbstractC3045vW.J(drawableNewDrawable, this.x);
                }
                Drawable drawableMutate = drawableNewDrawable.mutate();
                drawableMutate.setCallback(this.a);
                drawableArr[iKeyAt] = drawableMutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (AbstractC2205mo.b(drawable)) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int iIndexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (iIndexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable drawableNewDrawable = ((Drawable.ConstantState) this.f.valueAt(iIndexOfKey)).newDrawable(this.b);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC3045vW.J(drawableNewDrawable, this.x);
        }
        Drawable drawableMutate = drawableNewDrawable.mutate();
        drawableMutate.setCallback(this.a);
        this.g[i] = drawableMutate;
        this.f.removeAt(iIndexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return drawableMutate;
    }

    public final int e(int i) {
        Object obj;
        if (i < 0) {
            return 0;
        }
        C2866tf0 c2866tf0 = this.J;
        Object obj2 = 0;
        int iD = Nr0.d(c2866tf0.f1044o, i, c2866tf0.m);
        if (iD >= 0 && (obj = c2866tf0.n[iD]) != Nr0.g) {
            obj2 = obj;
        }
        return ((Integer) obj2).intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (StateSet.stateSetMatches(iArr2[i2], iArr)) {
                return i2;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new V2(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new V2(this, resources);
    }
}
