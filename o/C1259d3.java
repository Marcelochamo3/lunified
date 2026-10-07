package o;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: o.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1259d3 implements TypeEvaluator {
    public CX[] a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        CX[] cxArr = (CX[]) obj;
        CX[] cxArr2 = (CX[]) obj2;
        if (!zy0.h(cxArr, cxArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!zy0.h(this.a, cxArr)) {
            this.a = zy0.r(cxArr);
        }
        for (int i = 0; i < cxArr.length; i++) {
            CX cx = this.a[i];
            CX cx2 = cxArr[i];
            CX cx3 = cxArr2[i];
            cx.getClass();
            cx.a = cx2.a;
            int i2 = 0;
            while (true) {
                float[] fArr = cx2.b;
                if (i2 < fArr.length) {
                    cx.b[i2] = (cx3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                    i2++;
                }
            }
        }
        return this.a;
    }
}
