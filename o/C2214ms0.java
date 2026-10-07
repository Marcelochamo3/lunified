package o;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.ms0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2214ms0 extends AbstractC2311ns0 {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public C2214ms0() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.l = null;
    }

    @Override // o.AbstractC2311ns0
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC2311ns0) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // o.AbstractC2311ns0
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean zB = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return zB;
            }
            zB |= ((AbstractC2311ns0) arrayList.get(i)).b(iArr);
            i++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public C2214ms0(C2214ms0 c2214ms0, S5 s5) {
        AbstractC2408os0 c2019ks0;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = c2214ms0.c;
        this.d = c2214ms0.d;
        this.e = c2214ms0.e;
        this.f = c2214ms0.f;
        this.g = c2214ms0.g;
        this.h = c2214ms0.h;
        this.i = c2214ms0.i;
        String str = c2214ms0.l;
        this.l = str;
        this.k = c2214ms0.k;
        if (str != null) {
            s5.put(str, this);
        }
        matrix.set(c2214ms0.j);
        ArrayList arrayList = c2214ms0.b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C2214ms0) {
                this.b.add(new C2214ms0((C2214ms0) obj, s5));
            } else {
                if (obj instanceof C2117ls0) {
                    C2117ls0 c2117ls0 = (C2117ls0) obj;
                    C2117ls0 c2117ls1 = new C2117ls0(c2117ls0);
                    c2117ls1.f = 0.0f;
                    c2117ls1.h = 1.0f;
                    c2117ls1.i = 1.0f;
                    c2117ls1.j = 0.0f;
                    c2117ls1.k = 1.0f;
                    c2117ls1.l = 0.0f;
                    c2117ls1.m = Paint.Cap.BUTT;
                    c2117ls1.n = Paint.Join.MITER;
                    c2117ls1.f903o = 4.0f;
                    c2117ls1.e = c2117ls0.e;
                    c2117ls1.f = c2117ls0.f;
                    c2117ls1.h = c2117ls0.h;
                    c2117ls1.g = c2117ls0.g;
                    c2117ls1.c = c2117ls0.c;
                    c2117ls1.i = c2117ls0.i;
                    c2117ls1.j = c2117ls0.j;
                    c2117ls1.k = c2117ls0.k;
                    c2117ls1.l = c2117ls0.l;
                    c2117ls1.m = c2117ls0.m;
                    c2117ls1.n = c2117ls0.n;
                    c2117ls1.f903o = c2117ls0.f903o;
                    c2019ks0 = c2117ls1;
                } else if (obj instanceof C2019ks0) {
                    c2019ks0 = new C2019ks0((C2019ks0) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(c2019ks0);
                Object obj2 = c2019ks0.b;
                if (obj2 != null) {
                    s5.put(obj2, c2019ks0);
                }
            }
        }
    }
}
