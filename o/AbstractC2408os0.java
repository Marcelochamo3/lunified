package o;

/* JADX INFO: renamed from: o.os0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2408os0 extends AbstractC2311ns0 {
    public CX[] a;
    public String b;
    public int c;
    public final int d;

    public AbstractC2408os0() {
        this.a = null;
        this.c = 0;
    }

    public CX[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(CX[] cxArr) {
        if (!zy0.h(this.a, cxArr)) {
            this.a = zy0.r(cxArr);
            return;
        }
        CX[] cxArr2 = this.a;
        for (int i = 0; i < cxArr.length; i++) {
            cxArr2[i].a = cxArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = cxArr[i].b;
                if (i2 < fArr.length) {
                    cxArr2[i].b[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    public AbstractC2408os0(AbstractC2408os0 abstractC2408os0) {
        this.a = null;
        this.c = 0;
        this.b = abstractC2408os0.b;
        this.d = abstractC2408os0.d;
        this.a = zy0.r(abstractC2408os0.a);
    }
}
