package o;

/* JADX INFO: renamed from: o.ik0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1808ik0 extends AbstractC3015v6 {
    public final StringBuilder n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f834o;
    public final StringBuilder p;
    public final StringBuilder q;
    public boolean r;

    public C1808ik0() {
        super(1, 4);
        this.n = new StringBuilder();
        this.f834o = null;
        this.p = new StringBuilder();
        this.q = new StringBuilder();
        this.r = false;
    }

    @Override // o.AbstractC3015v6
    public final void C() {
        AbstractC3015v6.D(this.n);
        this.f834o = null;
        AbstractC3015v6.D(this.p);
        AbstractC3015v6.D(this.q);
        this.r = false;
    }

    @Override // o.AbstractC3015v6
    public final String toString() {
        return "<!doctype " + this.n.toString() + ">";
    }
}
