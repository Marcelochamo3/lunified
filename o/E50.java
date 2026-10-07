package o;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class E50 extends AbstractC2051l80 {
    public final /* synthetic */ int m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final N9 f230o;
    public final Object p;

    public /* synthetic */ E50(Object obj, long j, N9 n9, int i) {
        this.m = i;
        this.p = obj;
        this.n = j;
        this.f230o = n9;
    }

    @Override // o.AbstractC2051l80
    public final long i() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.n;
    }

    @Override // o.AbstractC2051l80
    public final TP l() {
        Object obj = this.p;
        switch (this.m) {
            case 0:
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                Pattern pattern = TP.e;
                return AbstractC1474fG.N(str);
            default:
                return (TP) obj;
        }
    }

    @Override // o.AbstractC2051l80
    public final N9 p() {
        switch (this.m) {
            case 0:
                break;
        }
        return this.f230o;
    }
}
