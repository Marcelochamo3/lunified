package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.ps0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2505ps0 {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final C2214ms0 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final S5 f982o;

    public C2505ps0() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.f982o = new S5();
        this.g = new C2214ms0();
        this.a = new Path();
        this.b = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0148  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0161  */
    /* JADX WARN: Code duplicated, block: B:58:0x0173  */
    /* JADX WARN: Code duplicated, block: B:61:0x0195  */
    /* JADX WARN: Code duplicated, block: B:62:0x0198  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01eb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    public final void a(C2214ms0 c2214ms0, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        float f;
        float f2;
        C2613qy c2613qy;
        boolean z;
        C2613qy c2613qy2;
        Paint paint;
        Paint.Join join;
        Paint.Cap cap;
        Shader shader;
        Paint paint2;
        Shader shader2;
        Path.FillType fillType;
        char c = 1;
        c2214ms0.a.set(matrix);
        Matrix matrix3 = c2214ms0.j;
        Matrix matrix4 = c2214ms0.a;
        matrix4.preConcat(matrix3);
        canvas.save();
        ?? r11 = 0;
        int i3 = 0;
        while (true) {
            ArrayList arrayList = c2214ms0.b;
            if (i3 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC2311ns0 abstractC2311ns0 = (AbstractC2311ns0) arrayList.get(i3);
            if (abstractC2311ns0 instanceof C2214ms0) {
                a((C2214ms0) abstractC2311ns0, matrix4, canvas, i, i2);
            } else {
                if (abstractC2311ns0 instanceof AbstractC2408os0) {
                    AbstractC2408os0 abstractC2408os0 = (AbstractC2408os0) abstractC2311ns0;
                    float f3 = i / this.j;
                    float f4 = i2 / this.k;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix5 = this.c;
                    matrix5.set(matrix4);
                    matrix5.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix4.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[r11], fArr[c]);
                    matrix2 = matrix4;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        abstractC2408os0.getClass();
                        Path path = this.a;
                        path.reset();
                        CX[] cxArr = abstractC2408os0.a;
                        if (cxArr != null) {
                            CX.b(cxArr, path);
                        }
                        Path path2 = this.b;
                        path2.reset();
                        if (abstractC2408os0 instanceof C2019ks0) {
                            path2.setFillType(abstractC2408os0.c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix5);
                            canvas.clipPath(path2);
                        } else {
                            C2117ls0 c2117ls0 = (C2117ls0) abstractC2408os0;
                            float f6 = c2117ls0.j;
                            if (f6 == 0.0f) {
                                f = 1.0f;
                                if (c2117ls0.k != 1.0f) {
                                }
                                path2.addPath(path, matrix5);
                                c2613qy = c2117ls0.g;
                                if (((Shader) c2613qy.n) != null && c2613qy.m == 0) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (z) {
                                    if (this.e == null) {
                                        Paint paint3 = new Paint(1);
                                        this.e = paint3;
                                        paint3.setStyle(Paint.Style.FILL);
                                    }
                                    paint2 = this.e;
                                    shader2 = (Shader) c2613qy.n;
                                    if (shader2 != null) {
                                        shader2.setLocalMatrix(matrix5);
                                        paint2.setShader(shader2);
                                        paint2.setAlpha(Math.round(c2117ls0.i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i4 = c2613qy.m;
                                        float f7 = c2117ls0.i;
                                        PorterDuff.Mode mode = C2795ss0.u;
                                        paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f7)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (c2117ls0.c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                c2613qy2 = c2117ls0.e;
                                if (((Shader) c2613qy2.n) == null || c2613qy2.m != 0) {
                                    if (this.d == null) {
                                        Paint paint4 = new Paint(1);
                                        this.d = paint4;
                                        paint4.setStyle(Paint.Style.STROKE);
                                    }
                                    paint = this.d;
                                    join = c2117ls0.n;
                                    if (join != null) {
                                        paint.setStrokeJoin(join);
                                    }
                                    cap = c2117ls0.m;
                                    if (cap != null) {
                                        paint.setStrokeCap(cap);
                                    }
                                    paint.setStrokeMiter(c2117ls0.f903o);
                                    shader = (Shader) c2613qy2.n;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix5);
                                        paint.setShader(shader);
                                        paint.setAlpha(Math.round(c2117ls0.h * 255.0f));
                                    } else {
                                        paint.setShader(null);
                                        paint.setAlpha(255);
                                        int i5 = c2613qy2.m;
                                        float f8 = c2117ls0.h;
                                        PorterDuff.Mode mode2 = C2795ss0.u;
                                        paint.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f8)) << 24));
                                    }
                                    paint.setColorFilter(null);
                                    paint.setStrokeWidth(c2117ls0.f * fAbs * fMin);
                                    canvas.drawPath(path2, paint);
                                }
                            } else {
                                f = 1.0f;
                            }
                            float f9 = c2117ls0.l;
                            float f10 = (f6 + f9) % f;
                            float f11 = (c2117ls0.k + f9) % f;
                            if (this.f == null) {
                                this.f = new PathMeasure();
                            }
                            this.f.setPath(path, r11);
                            float length = this.f.getLength();
                            float f12 = f10 * length;
                            float f13 = f11 * length;
                            path.reset();
                            if (f12 > f13) {
                                this.f.getSegment(f12, length, path, true);
                                f2 = 0.0f;
                                this.f.getSegment(0.0f, f13, path, true);
                            } else {
                                f2 = 0.0f;
                                this.f.getSegment(f12, f13, path, true);
                            }
                            path.rLineTo(f2, f2);
                            path2.addPath(path, matrix5);
                            c2613qy = c2117ls0.g;
                            if (((Shader) c2613qy.n) != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                if (this.e == null) {
                                    Paint paint5 = new Paint(1);
                                    this.e = paint5;
                                    paint5.setStyle(Paint.Style.FILL);
                                }
                                paint2 = this.e;
                                shader2 = (Shader) c2613qy.n;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix5);
                                    paint2.setShader(shader2);
                                    paint2.setAlpha(Math.round(c2117ls0.i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i6 = c2613qy.m;
                                    float f14 = c2117ls0.i;
                                    PorterDuff.Mode mode3 = C2795ss0.u;
                                    paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f14)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (c2117ls0.c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            c2613qy2 = c2117ls0.e;
                            if (((Shader) c2613qy2.n) == null) {
                                if (this.d == null) {
                                    Paint paint6 = new Paint(1);
                                    this.d = paint6;
                                    paint6.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.d;
                                join = c2117ls0.n;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = c2117ls0.m;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(c2117ls0.f903o);
                                shader = (Shader) c2613qy2.n;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix5);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(c2117ls0.h * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i7 = c2613qy2.m;
                                    float f15 = c2117ls0.h;
                                    PorterDuff.Mode mode4 = C2795ss0.u;
                                    paint.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f15)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(c2117ls0.f * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            } else {
                                if (this.d == null) {
                                    Paint paint7 = new Paint(1);
                                    this.d = paint7;
                                    paint7.setStyle(Paint.Style.STROKE);
                                }
                                paint = this.d;
                                join = c2117ls0.n;
                                if (join != null) {
                                    paint.setStrokeJoin(join);
                                }
                                cap = c2117ls0.m;
                                if (cap != null) {
                                    paint.setStrokeCap(cap);
                                }
                                paint.setStrokeMiter(c2117ls0.f903o);
                                shader = (Shader) c2613qy2.n;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix5);
                                    paint.setShader(shader);
                                    paint.setAlpha(Math.round(c2117ls0.h * 255.0f));
                                } else {
                                    paint.setShader(null);
                                    paint.setAlpha(255);
                                    int i8 = c2613qy2.m;
                                    float f16 = c2117ls0.h;
                                    PorterDuff.Mode mode5 = C2795ss0.u;
                                    paint.setColor((i8 & 16777215) | (((int) (Color.alpha(i8) * f16)) << 24));
                                }
                                paint.setColorFilter(null);
                                paint.setStrokeWidth(c2117ls0.f * fAbs * fMin);
                                canvas.drawPath(path2, paint);
                            }
                        }
                    }
                }
                i3++;
                matrix4 = matrix2;
                c = 1;
                r11 = 0;
            }
            matrix2 = matrix4;
            i3++;
            matrix4 = matrix2;
            c = 1;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public C2505ps0(C2505ps0 c2505ps0) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        S5 s5 = new S5(0);
        this.f982o = s5;
        this.g = new C2214ms0(c2505ps0.g, s5);
        this.a = new Path(c2505ps0.a);
        this.b = new Path(c2505ps0.b);
        this.h = c2505ps0.h;
        this.i = c2505ps0.i;
        this.j = c2505ps0.j;
        this.k = c2505ps0.k;
        this.l = c2505ps0.l;
        this.m = c2505ps0.m;
        String str = c2505ps0.m;
        if (str != null) {
            s5.put(str, this);
        }
        this.n = c2505ps0.n;
    }
}
