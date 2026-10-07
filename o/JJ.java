package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class JJ extends AbstractC1099bV {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f339o;

    public final String I() {
        return d(w());
    }

    public final void J() {
        Object obj = this.f339o;
        if (obj instanceof F6) {
            return;
        }
        F6 f6 = new F6();
        this.f339o = f6;
        if (obj != null) {
            f6.r(w(), (String) obj);
        }
    }

    @Override // o.AbstractC1099bV
    public final String b(String str) {
        J();
        return super.b(str);
    }

    @Override // o.AbstractC1099bV
    public final String d(String str) {
        if (this.f339o instanceof F6) {
            return super.d(str);
        }
        return w().equals(str) ? (String) this.f339o : "";
    }

    @Override // o.AbstractC1099bV
    public final void e(String str, String str2) {
        if (!(this.f339o instanceof F6) && str.equals(w())) {
            this.f339o = str2;
        } else {
            J();
            super.e(str, str2);
        }
    }

    @Override // o.AbstractC1099bV
    public final F6 g() {
        J();
        return (F6) this.f339o;
    }

    @Override // o.AbstractC1099bV
    public final String h() {
        AbstractC1099bV abstractC1099bV = this.l;
        return abstractC1099bV != null ? abstractC1099bV.h() : "";
    }

    @Override // o.AbstractC1099bV
    public final int k() {
        return 0;
    }

    @Override // o.AbstractC1099bV
    public final AbstractC1099bV o(AbstractC1099bV abstractC1099bV) {
        JJ jj = (JJ) super.o(abstractC1099bV);
        Object obj = this.f339o;
        if (obj instanceof F6) {
            jj.f339o = ((F6) obj).clone();
        }
        return jj;
    }

    @Override // o.AbstractC1099bV
    public final List q() {
        return AbstractC1099bV.n;
    }

    @Override // o.AbstractC1099bV
    public final boolean r(String str) {
        J();
        return super.r("version");
    }

    @Override // o.AbstractC1099bV
    public final boolean s() {
        return this.f339o instanceof F6;
    }

    @Override // o.AbstractC1099bV
    public final AbstractC1099bV p() {
        return this;
    }
}
