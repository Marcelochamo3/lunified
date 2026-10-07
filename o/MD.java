package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class MD extends AbstractC3066vi0 {
    public final /* synthetic */ int e;
    public final /* synthetic */ TD f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MD(String str, TD td, int i, int i2, int i3) {
        super(str, true);
        this.e = i3;
        this.f = td;
        this.g = i;
        this.h = i2;
    }

    @Override // o.AbstractC3066vi0
    public final long a() {
        switch (this.e) {
            case 0:
                int i = this.g;
                int i2 = this.h;
                TD td = this.f;
                td.getClass();
                try {
                    td.J.q(i, i2, true);
                    return -1L;
                } catch (IOException e) {
                    td.a(2, 2, e);
                    return -1L;
                }
            case 1:
                C2691rp c2691rp = this.f.w;
                int i3 = this.h;
                c2691rp.getClass();
                AbstractC1701hf0.q(i3, "errorCode");
                synchronized (this.f) {
                    this.f.L.remove(Integer.valueOf(this.g));
                }
                return -1L;
            default:
                TD td2 = this.f;
                try {
                    int i4 = this.g;
                    int i5 = this.h;
                    td2.getClass();
                    AbstractC1701hf0.q(i5, "statusCode");
                    td2.J.t(i4, i5);
                    return -1L;
                } catch (IOException e2) {
                    td2.a(2, 2, e2);
                    return -1L;
                }
        }
    }
}
