package o;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class KF extends AbstractC1258d20 {
    public final boolean l;

    public KF(String str, LF lf) {
        super(str, lf, 1);
        this.l = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof KF) {
            Zb0 zb0 = (Zb0) obj;
            if (AbstractC1474fG.b(this.a, zb0.a())) {
                KF kf = (KF) obj;
                if (kf.l && Arrays.equals((Zb0[]) this.j.getValue(), (Zb0[]) kf.j.getValue())) {
                    int iC = zb0.c();
                    int i = this.c;
                    if (i == iC) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (AbstractC1474fG.b(f(i2).a(), zb0.f(i2).a()) && AbstractC1474fG.b(f(i2).b(), zb0.f(i2).b())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // o.AbstractC1258d20
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
