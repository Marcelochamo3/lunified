package o;

import android.opengl.GLES20;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes.dex */
public final class K30 {
    public static final float[] i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public Object g;
    public Object h;

    public K30(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }

    public static boolean b(int i2, int i3, int i4) {
        if (i2 == i3) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i4 == size;
        }
        return false;
    }

    public static boolean c(J30 j30) {
        C0709Qk[] c0709QkArr = j30.a.a;
        if (c0709QkArr.length != 1 || c0709QkArr[0].l != 0) {
            return false;
        }
        C0709Qk[] c0709QkArr2 = j30.b.a;
        return c0709QkArr2.length == 1 && c0709QkArr2[0].l == 0;
    }

    public void a() {
        try {
            C1909jm0 c1909jm0 = new C1909jm0("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.h = c1909jm0;
            this.b = GLES20.glGetUniformLocation(c1909jm0.l, "uMvpMatrix");
            this.c = GLES20.glGetUniformLocation(((C1909jm0) this.h).l, "uTexMatrix");
            this.d = ((C1909jm0) this.h).t("aPosition");
            this.e = ((C1909jm0) this.h).t("aTexCoords");
            this.f = GLES20.glGetUniformLocation(((C1909jm0) this.h).l, "uTexture");
        } catch (C1273dA unused) {
        }
    }

    public void d(C0731Rg c0731Rg, C3213x8 c3213x8) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        int i2;
        int iMakeMeasureSpec3;
        boolean z;
        int measuredWidth;
        int baseline;
        int i3;
        if (c0731Rg == null) {
            return;
        }
        if (c0731Rg.g0 == 8) {
            c3213x8.e = 0;
            c3213x8.f = 0;
            c3213x8.g = 0;
            return;
        }
        if (c0731Rg.T == null) {
            return;
        }
        int i4 = c3213x8.a;
        int i5 = c3213x8.b;
        int i6 = c3213x8.c;
        int i7 = c3213x8.d;
        int i8 = this.a + this.b;
        int i9 = this.c;
        View view = (View) c0731Rg.f0;
        int iW = AbstractC1701hf0.w(i4);
        C0394Eg c0394Eg = c0731Rg.K;
        C0394Eg c0394Eg2 = c0731Rg.I;
        if (iW == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (iW == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i9, -2);
        } else if (iW == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i9, -2);
            boolean z2 = c0731Rg.r == 1;
            int i10 = c3213x8.j;
            if (i10 == 1 || i10 == 2) {
                boolean z3 = view.getMeasuredHeight() == c0731Rg.k();
                if (c3213x8.j == 2 || !z2 || ((z2 && z3) || c0731Rg.A())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c0731Rg.q(), 1073741824);
                }
            }
        } else if (iW != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i11 = this.e;
            int i12 = c0394Eg2 != null ? c0394Eg2.g : 0;
            if (c0394Eg != null) {
                i12 += c0394Eg.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int iW2 = AbstractC1701hf0.w(i5);
        if (iW2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (iW2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
        } else if (iW2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i8, -2);
            boolean z4 = c0731Rg.s == 1;
            int i13 = c3213x8.j;
            if (i13 == 1 || i13 == 2) {
                boolean z5 = view.getMeasuredWidth() == c0731Rg.q();
                if (c3213x8.j == 2 || !z4 || ((z4 && z5) || c0731Rg.B())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c0731Rg.k(), 1073741824);
                }
            }
        } else if (iW2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i14 = this.f;
            int i15 = c0394Eg2 != null ? c0731Rg.J.g : 0;
            if (c0394Eg != null) {
                i15 += c0731Rg.L.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C0757Sg c0757Sg = (C0757Sg) c0731Rg.T;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.h;
        if (c0757Sg != null && zy0.s(constraintLayout.t, 256) && view.getMeasuredWidth() == c0731Rg.q() && view.getMeasuredWidth() < c0757Sg.q() && view.getMeasuredHeight() == c0731Rg.k() && view.getMeasuredHeight() < c0757Sg.k() && view.getBaseline() == c0731Rg.a0 && !c0731Rg.z() && b(c0731Rg.G, iMakeMeasureSpec, c0731Rg.q()) && b(c0731Rg.H, iMakeMeasureSpec2, c0731Rg.k())) {
            c3213x8.e = c0731Rg.q();
            c3213x8.f = c0731Rg.k();
            c3213x8.g = c0731Rg.a0;
            return;
        }
        boolean z6 = i4 == 3;
        boolean z7 = i5 == 3;
        boolean z8 = i5 == 4 || i5 == 1;
        boolean z9 = i4 == 4 || i4 == 1;
        boolean z10 = z6 && c0731Rg.W > 0.0f;
        boolean z11 = z7 && c0731Rg.W > 0.0f;
        if (view == null) {
            return;
        }
        C0498Ig c0498Ig = (C0498Ig) view.getLayoutParams();
        int i16 = c3213x8.j;
        if (i16 != 1 && i16 != 2 && z6 && c0731Rg.r == 0 && z7 && c0731Rg.s == 0) {
            z = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            iMax = 0;
        } else {
            if ((view instanceof Ku0) && (c0731Rg instanceof C1636gw)) {
                ((Ku0) view).l((C1636gw) c0731Rg, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            c0731Rg.G = iMakeMeasureSpec;
            c0731Rg.H = iMakeMeasureSpec2;
            c0731Rg.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c0731Rg.u;
            int iMax2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c0731Rg.v;
            if (i18 > 0) {
                iMax2 = Math.min(i18, iMax2);
            }
            int i19 = c0731Rg.x;
            iMax = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = iMakeMeasureSpec;
            int i21 = c0731Rg.y;
            if (i21 > 0) {
                iMax = Math.min(i21, iMax);
            }
            if (!zy0.s(constraintLayout.t, 1)) {
                if (z10 && z8) {
                    iMax2 = (int) ((iMax * c0731Rg.W) + 0.5f);
                } else if (z11 && z9) {
                    iMax = (int) ((iMax2 / c0731Rg.W) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    i2 = 1073741824;
                    iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                } else {
                    i2 = 1073741824;
                    iMakeMeasureSpec3 = i20;
                }
                if (measuredHeight != iMax) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMax, i2);
                }
                view.measure(iMakeMeasureSpec3, iMakeMeasureSpec2);
                c0731Rg.G = iMakeMeasureSpec3;
                c0731Rg.H = iMakeMeasureSpec2;
                z = false;
                c0731Rg.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z12 = baseline != i3;
        if (measuredWidth != c3213x8.c || iMax != c3213x8.d) {
            z = true;
        }
        c3213x8.i = z;
        boolean z13 = c0498Ig.c0 ? true : z12;
        if (z13 && baseline != -1 && c0731Rg.a0 != baseline) {
            c3213x8.i = true;
        }
        c3213x8.e = measuredWidth;
        c3213x8.f = iMax;
        c3213x8.h = z13;
        c3213x8.g = baseline;
    }
}
