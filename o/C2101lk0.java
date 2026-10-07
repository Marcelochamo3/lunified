package o;

/* JADX INFO: renamed from: o.lk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2101lk0 extends AbstractC2198mk0 {
    @Override // o.AbstractC2198mk0, o.AbstractC3015v6
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final AbstractC2198mk0 C() {
        super.C();
        this.q = null;
        return this;
    }

    @Override // o.AbstractC3015v6
    public final String toString() {
        String str = this.p ? "/>" : ">";
        if (!L() || this.q.l <= 0) {
            StringBuilder sb = new StringBuilder("<");
            String str2 = this.n;
            return AbstractC1701hf0.h(sb, str2 != null ? str2 : "[unset]", str);
        }
        StringBuilder sb2 = new StringBuilder("<");
        String str3 = this.n;
        sb2.append(str3 != null ? str3 : "[unset]");
        sb2.append(" ");
        sb2.append(this.q.toString());
        sb2.append(str);
        return sb2.toString();
    }
}
