package o;

/* JADX INFO: loaded from: classes.dex */
public final class LV extends AbstractC2051l80 {
    public final TP m;
    public final long n;

    public LV(TP tp, long j) {
        this.m = tp;
        this.n = j;
    }

    @Override // o.AbstractC2051l80
    public final long i() {
        return this.n;
    }

    @Override // o.AbstractC2051l80
    public final TP l() {
        return this.m;
    }

    @Override // o.AbstractC2051l80
    public final N9 p() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
