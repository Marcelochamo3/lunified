package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.Hb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0467Hb extends View implements Bh0 {
    public final ArrayList l;
    public List m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f305o;
    public C0493Ib p;
    public float q;

    public C0467Hb(Context context) {
        super(context, null);
        this.l = new ArrayList();
        this.m = Collections.emptyList();
        this.n = 0;
        this.f305o = 0.0533f;
        this.p = C0493Ib.g;
        this.q = 0.08f;
    }

    @Override // o.Bh0
    public final void a(List list, C0493Ib c0493Ib, float f, int i, float f2) {
        this.m = list;
        this.p = c0493Ib;
        this.f305o = f;
        this.n = i;
        this.q = f2;
        while (true) {
            ArrayList arrayList = this.l;
            if (arrayList.size() >= list.size()) {
                invalidate();
                return;
            }
            arrayList.add(new C3452zh0(getContext()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x04ba  */
    /* JADX WARN: Code duplicated, block: B:199:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:201:0x04c0  */
    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TextPaint textPaint;
        int i6;
        int i7;
        Canvas canvas2;
        boolean z;
        float f;
        int i8;
        float f2;
        int i9;
        int iMax;
        int iMin;
        int iRound;
        C0467Hb c0467Hb = this;
        Canvas canvas3 = canvas;
        List list = c0467Hb.m;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float fB = AbstractC3409z9.B(c0467Hb.f305o, c0467Hb.n, height, i10);
        if (fB <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            C3162wi c3162wiA = (C3162wi) list.get(i11);
            if (c3162wiA.A != Integer.MIN_VALUE) {
                C3065vi c3065viA = c3162wiA.a();
                c3065viA.h = -3.4028235E38f;
                c3065viA.i = Integer.MIN_VALUE;
                c3065viA.c = null;
                int i12 = c3162wiA.q;
                float f3 = c3162wiA.p;
                if (i12 == 0) {
                    c3065viA.e = 1.0f - f3;
                    c3065viA.f = 0;
                } else {
                    c3065viA.e = (-f3) - 1.0f;
                    c3065viA.f = 1;
                }
                int i13 = c3162wiA.r;
                if (i13 == 0) {
                    c3065viA.g = 2;
                } else if (i13 == 2) {
                    c3065viA.g = 0;
                }
                c3162wiA = c3065viA.a();
            }
            float fB2 = AbstractC3409z9.B(c3162wiA.z, c3162wiA.y, height, i10);
            C3452zh0 c3452zh0 = (C3452zh0) c0467Hb.l.get(i11);
            C0493Ib c0493Ib = c0467Hb.p;
            List list2 = list;
            float f4 = c0467Hb.q;
            c3452zh0.getClass();
            Bitmap bitmap = c3162wiA.f1099o;
            int i14 = height;
            int i15 = i10;
            boolean z2 = bitmap == null;
            CharSequence charSequence = c3162wiA.l;
            if (z2) {
                if (TextUtils.isEmpty(charSequence)) {
                    canvas2 = canvas3;
                    i7 = paddingLeft;
                    i5 = paddingTop;
                    i4 = width;
                    i6 = paddingBottom;
                    i = size;
                    i3 = i11;
                } else {
                    i = size;
                    i2 = c3162wiA.w ? c3162wiA.x : c0493Ib.c;
                }
                i11 = i3 + 1;
                canvas3 = canvas2;
                list = list2;
                height = i14;
                i10 = i15;
                size = i;
                fB = fB;
                paddingBottom = i6;
                width = i4;
                paddingTop = i5;
                paddingLeft = i7;
                c0467Hb = this;
            } else {
                i = size;
                i2 = -16777216;
            }
            i3 = i11;
            CharSequence charSequence2 = c3452zh0.i;
            TextPaint textPaint2 = c3452zh0.f;
            boolean z3 = z2;
            float f5 = c3162wiA.v;
            int i16 = paddingBottom;
            float f6 = c3162wiA.u;
            i4 = width;
            int i17 = c3162wiA.t;
            i5 = paddingTop;
            float f7 = c3162wiA.s;
            int i18 = paddingLeft;
            int i19 = c3162wiA.r;
            int i20 = c3162wiA.q;
            float f8 = c3162wiA.p;
            Layout.Alignment alignment = c3162wiA.m;
            if ((charSequence2 == charSequence || (charSequence2 != null && charSequence2.equals(charSequence))) && Lr0.a(c3452zh0.j, alignment) && c3452zh0.k == bitmap && c3452zh0.l == f8 && c3452zh0.m == i20) {
                if (Lr0.a(Integer.valueOf(c3452zh0.n), Integer.valueOf(i19)) && c3452zh0.f1162o == f7 && Lr0.a(Integer.valueOf(c3452zh0.p), Integer.valueOf(i17)) && c3452zh0.q == f6 && c3452zh0.r == f5 && c3452zh0.s == c0493Ib.a && c3452zh0.t == c0493Ib.b && c3452zh0.u == i2 && c3452zh0.w == c0493Ib.d && c3452zh0.v == c0493Ib.e && Lr0.a(textPaint2.getTypeface(), c0493Ib.f) && c3452zh0.x == fB && c3452zh0.y == fB2 && c3452zh0.z == f4) {
                    if (c3452zh0.A == i18) {
                        if (c3452zh0.B != i5) {
                            i5 = i5;
                        } else if (c3452zh0.C != i4) {
                            i5 = i5;
                            i4 = i4;
                        } else if (c3452zh0.D == i16) {
                            i5 = i5;
                            i4 = i4;
                            i6 = i16;
                            i7 = i18;
                            c3452zh0.a(canvas, z3);
                            canvas2 = canvas;
                            i11 = i3 + 1;
                            canvas3 = canvas2;
                            list = list2;
                            height = i14;
                            i10 = i15;
                            size = i;
                            fB = fB;
                            paddingBottom = i6;
                            width = i4;
                            paddingTop = i5;
                            paddingLeft = i7;
                            c0467Hb = this;
                        } else {
                            i5 = i5;
                            i4 = i4;
                            i16 = i16;
                        }
                        i18 = i18;
                        textPaint = textPaint2;
                    } else {
                        i18 = i18;
                    }
                }
                textPaint = textPaint2;
            } else {
                textPaint = textPaint2;
            }
            c3452zh0.i = charSequence;
            c3452zh0.j = alignment;
            c3452zh0.k = bitmap;
            c3452zh0.l = f8;
            c3452zh0.m = i20;
            c3452zh0.n = i19;
            c3452zh0.f1162o = f7;
            c3452zh0.p = i17;
            c3452zh0.q = f6;
            c3452zh0.r = f5;
            c3452zh0.s = c0493Ib.a;
            c3452zh0.t = c0493Ib.b;
            c3452zh0.u = i2;
            c3452zh0.w = c0493Ib.d;
            c3452zh0.v = c0493Ib.e;
            textPaint.setTypeface(c0493Ib.f);
            c3452zh0.x = fB;
            c3452zh0.y = fB2;
            c3452zh0.z = f4;
            int i21 = i18;
            c3452zh0.A = i21;
            i5 = i5;
            c3452zh0.B = i5;
            i4 = i4;
            c3452zh0.C = i4;
            i6 = i16;
            c3452zh0.D = i6;
            if (z3 != 0) {
                c3452zh0.i.getClass();
                CharSequence charSequence3 = c3452zh0.i;
                SpannableStringBuilder spannableStringBuilder = charSequence3 instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence3 : new SpannableStringBuilder(c3452zh0.i);
                int i22 = c3452zh0.C - c3452zh0.A;
                int i23 = c3452zh0.D - c3452zh0.B;
                textPaint.setTextSize(c3452zh0.x);
                int i24 = (int) ((c3452zh0.x * 0.125f) + 0.5f);
                int i25 = i24 * 2;
                int i26 = i22 - i25;
                float f9 = c3452zh0.q;
                if (f9 != -3.4028235E38f) {
                    i26 = (int) (i26 * f9);
                }
                if (i26 <= 0) {
                    AP.z();
                    i7 = i21;
                    z = z3;
                    i5 = i5;
                    i6 = i6;
                    i4 = i4;
                    fB = fB;
                } else {
                    i7 = i21;
                    if (c3452zh0.y > 0.0f) {
                        i9 = 0;
                        spannableStringBuilder.setSpan(new AbsoluteSizeSpan((int) c3452zh0.y), 0, spannableStringBuilder.length(), 16711680);
                    } else {
                        i9 = 0;
                    }
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
                    if (c3452zh0.w == 1) {
                        ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) spannableStringBuilder2.getSpans(i9, spannableStringBuilder2.length(), ForegroundColorSpan.class);
                        int i27 = 0;
                        for (int length = foregroundColorSpanArr.length; i27 < length; length = length) {
                            spannableStringBuilder2.removeSpan(foregroundColorSpanArr[i27]);
                            i27++;
                        }
                    }
                    if (Color.alpha(c3452zh0.t) > 0) {
                        int i28 = c3452zh0.w;
                        if (i28 == 0 || i28 == 2) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(c3452zh0.t), 0, spannableStringBuilder.length(), 16711680);
                        } else {
                            spannableStringBuilder2.setSpan(new BackgroundColorSpan(c3452zh0.t), 0, spannableStringBuilder2.length(), 16711680);
                        }
                    }
                    Layout.Alignment alignment2 = c3452zh0.j;
                    if (alignment2 == null) {
                        alignment2 = Layout.Alignment.ALIGN_CENTER;
                    }
                    StaticLayout staticLayout = new StaticLayout(spannableStringBuilder, textPaint, i26, alignment2, c3452zh0.d, c3452zh0.e, true);
                    c3452zh0.E = staticLayout;
                    int height2 = staticLayout.getHeight();
                    int lineCount = c3452zh0.E.getLineCount();
                    fB = fB;
                    int iMax2 = 0;
                    int i29 = 0;
                    while (i29 < lineCount) {
                        iMax2 = Math.max((int) Math.ceil(c3452zh0.E.getLineWidth(i29)), iMax2);
                        i29++;
                        lineCount = lineCount;
                        z3 = z3;
                    }
                    z = z3;
                    if (c3452zh0.q == -3.4028235E38f || iMax2 >= i26) {
                        i26 = iMax2;
                    }
                    int i30 = i26 + i25;
                    float f10 = c3452zh0.f1162o;
                    if (f10 != -3.4028235E38f) {
                        int iRound2 = Math.round(i22 * f10);
                        int i31 = c3452zh0.A;
                        int i32 = iRound2 + i31;
                        int i33 = c3452zh0.p;
                        if (i33 == 1) {
                            i32 = ((i32 * 2) - i30) / 2;
                        } else if (i33 == 2) {
                            i32 -= i30;
                        }
                        iMax = Math.max(i32, i31);
                        iMin = Math.min(i30 + iMax, c3452zh0.C);
                    } else {
                        iMax = c3452zh0.A + ((i22 - i30) / 2);
                        iMin = iMax + i30;
                    }
                    int i34 = iMin - iMax;
                    if (i34 <= 0) {
                        AP.z();
                    } else {
                        float f11 = c3452zh0.l;
                        if (f11 != -3.4028235E38f) {
                            if (c3452zh0.m == 0) {
                                iRound = Math.round(i23 * f11) + c3452zh0.B;
                                int i35 = c3452zh0.n;
                                if (i35 == 2) {
                                    iRound -= height2;
                                } else if (i35 == 1) {
                                    iRound = ((iRound * 2) - height2) / 2;
                                }
                            } else {
                                int lineBottom = c3452zh0.E.getLineBottom(0) - c3452zh0.E.getLineTop(0);
                                float f12 = c3452zh0.l;
                                iRound = f12 >= 0.0f ? Math.round(f12 * lineBottom) + c3452zh0.B : (Math.round((f12 + 1.0f) * lineBottom) + c3452zh0.D) - height2;
                            }
                            int i36 = iRound + height2;
                            int i37 = c3452zh0.D;
                            if (i36 > i37) {
                                iRound = i37 - height2;
                            } else {
                                int i38 = c3452zh0.B;
                                if (iRound < i38) {
                                    iRound = i38;
                                }
                            }
                        } else {
                            iRound = (c3452zh0.D - height2) - ((int) (i23 * c3452zh0.z));
                        }
                        TextPaint textPaint3 = textPaint;
                        Layout.Alignment alignment3 = alignment2;
                        c3452zh0.E = new StaticLayout(spannableStringBuilder, textPaint3, i34, alignment3, c3452zh0.d, c3452zh0.e, true);
                        c3452zh0.F = new StaticLayout(spannableStringBuilder2, textPaint3, i34, alignment3, c3452zh0.d, c3452zh0.e, true);
                        c3452zh0.G = iMax;
                        c3452zh0.H = iRound;
                        c3452zh0.I = i24;
                    }
                }
            } else {
                i7 = i21;
                z = z3;
                i5 = i5;
                i6 = i6;
                i4 = i4;
                fB = fB;
                c3452zh0.k.getClass();
                Bitmap bitmap2 = c3452zh0.k;
                int i39 = c3452zh0.C;
                int i40 = c3452zh0.A;
                int i41 = c3452zh0.D;
                int i42 = c3452zh0.B;
                float f13 = i39 - i40;
                float f14 = (c3452zh0.f1162o * f13) + i40;
                float f15 = i41 - i42;
                float f16 = (c3452zh0.l * f15) + i42;
                int iRound3 = Math.round(f13 * c3452zh0.q);
                float f17 = c3452zh0.r;
                int iRound4 = f17 != -3.4028235E38f ? Math.round(f15 * f17) : Math.round((bitmap2.getHeight() / bitmap2.getWidth()) * iRound3);
                int i43 = c3452zh0.p;
                if (i43 == 2) {
                    f = iRound3;
                } else {
                    if (i43 == 1) {
                        f = iRound3 / 2;
                    }
                    int iRound5 = Math.round(f14);
                    i8 = c3452zh0.n;
                    if (i8 == 2) {
                        f2 = iRound4;
                    } else {
                        if (i8 == 1) {
                            f2 = iRound4 / 2;
                        }
                        int iRound6 = Math.round(f16);
                        c3452zh0.J = new Rect(iRound5, iRound6, iRound3 + iRound5, iRound4 + iRound6);
                    }
                    f16 -= f2;
                    int iRound7 = Math.round(f16);
                    c3452zh0.J = new Rect(iRound5, iRound7, iRound3 + iRound5, iRound4 + iRound7);
                }
                f14 -= f;
                int iRound8 = Math.round(f14);
                i8 = c3452zh0.n;
                if (i8 == 2) {
                    f2 = iRound4;
                } else {
                    if (i8 == 1) {
                        f2 = iRound4 / 2;
                    }
                    int iRound9 = Math.round(f16);
                    c3452zh0.J = new Rect(iRound8, iRound9, iRound3 + iRound8, iRound4 + iRound9);
                }
                f16 -= f2;
                int iRound10 = Math.round(f16);
                c3452zh0.J = new Rect(iRound8, iRound10, iRound3 + iRound8, iRound4 + iRound10);
            }
            canvas2 = canvas;
            c3452zh0.a(canvas2, z);
            i11 = i3 + 1;
            canvas3 = canvas2;
            list = list2;
            height = i14;
            i10 = i15;
            size = i;
            fB = fB;
            paddingBottom = i6;
            width = i4;
            paddingTop = i5;
            paddingLeft = i7;
            c0467Hb = this;
        }
    }
}
