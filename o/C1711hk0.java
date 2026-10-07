package o;

/* JADX INFO: renamed from: o.hk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1711hk0 extends AbstractC3015v6 {
    public final StringBuilder n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f815o;
    public boolean p;

    public C1711hk0() {
        super(4, 4);
        this.n = new StringBuilder();
        this.p = false;
    }

    @Override // o.AbstractC3015v6
    public final void C() {
        AbstractC3015v6.D(this.n);
        this.f815o = null;
        this.p = false;
    }

    public final void E(char c) {
        String str = this.f815o;
        StringBuilder sb = this.n;
        if (str != null) {
            sb.append(str);
            this.f815o = null;
        }
        sb.append(c);
    }

    public final void F(String str) {
        String str2 = this.f815o;
        StringBuilder sb = this.n;
        if (str2 != null) {
            sb.append(str2);
            this.f815o = null;
        }
        if (sb.length() == 0) {
            this.f815o = str;
        } else {
            sb.append(str);
        }
    }

    @Override // o.AbstractC3015v6
    public final String toString() {
        StringBuilder sb = new StringBuilder("<!--");
        String string = this.f815o;
        if (string == null) {
            string = this.n.toString();
        }
        return AbstractC1701hf0.h(sb, string, "-->");
    }
}
