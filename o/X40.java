package o;

import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lombok.Generated;

/* JADX INFO: loaded from: classes.dex */
public class X40 implements Serializable {
    private final ArrayList<H50> l;
    private final ArrayList<W40> m;
    private short n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f612o;

    public X40() {
        this.l = new ArrayList<>(1);
        this.m = new ArrayList<>(0);
    }

    private <X extends H50> void e(X x, List<X> list) {
        if (this.m.isEmpty() && this.l.isEmpty()) {
            list.add(x);
            this.f612o = x.x();
            return;
        }
        i(x, this.l);
        i(x, this.m);
        if (x.x() > this.f612o) {
            x = (X) x.k();
            x.L(this.f612o);
        } else if (x.x() < this.f612o) {
            this.f612o = x.x();
            f(x.x(), this.l);
            f(x.x(), this.m);
        }
        if (list.contains(x)) {
            return;
        }
        list.add(x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <X extends H50> void f(long j, List<X> list) {
        for (int i = 0; i < list.size(); i++) {
            H50 h50K = ((H50) list.get(i)).k();
            h50K.L(j);
            list.set(i, h50K);
        }
    }

    private void g(Iterator<? extends H50> it, StringBuilder sb) {
        while (it.hasNext()) {
            H50 next = it.next();
            sb.append("[");
            sb.append(next.F());
            sb.append("]");
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
    }

    private void i(H50 h50, List<? extends H50> list) {
        if (!list.isEmpty() && !h50.K(list.get(0))) {
            throw new IllegalArgumentException("record does not match rrset");
        }
    }

    public void c(W40 w40) {
        e(w40, this.m);
    }

    public void d(H50 h50) {
        if (h50 instanceof W40) {
            e((W40) h50, this.m);
        } else {
            e(h50, this.l);
        }
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X40)) {
            return false;
        }
        X40 x40 = (X40) obj;
        if (!x40.h(this)) {
            return false;
        }
        ArrayList<H50> arrayList = this.l;
        ArrayList<H50> arrayList2 = x40.l;
        if (arrayList != null ? !arrayList.equals(arrayList2) : arrayList2 != null) {
            return false;
        }
        ArrayList<W40> arrayList3 = this.m;
        ArrayList<W40> arrayList4 = x40.m;
        return arrayList3 != null ? arrayList3.equals(arrayList4) : arrayList4 == null;
    }

    public int getType() {
        return m().w();
    }

    @Generated
    public boolean h(Object obj) {
        return obj instanceof X40;
    }

    @Generated
    public int hashCode() {
        ArrayList<H50> arrayList = this.l;
        int iHashCode = arrayList == null ? 43 : arrayList.hashCode();
        ArrayList<W40> arrayList2 = this.m;
        return ((iHashCode + 59) * 59) + (arrayList2 != null ? arrayList2.hashCode() : 43);
    }

    public void j() {
        this.l.clear();
        this.m.clear();
    }

    public void k(W40 w40) {
        this.m.remove(w40);
    }

    public void l(H50 h50) {
        if (h50 instanceof W40) {
            this.m.remove(h50);
        } else {
            this.l.remove(h50);
        }
    }

    public H50 m() {
        if (!this.l.isEmpty()) {
            return this.l.get(0);
        }
        if (this.m.isEmpty()) {
            throw new IllegalStateException("rrset is empty");
        }
        return this.m.get(0);
    }

    public int n() {
        return m().t();
    }

    public C2848tT o() {
        return m().v();
    }

    public long p() {
        return m().x();
    }

    public List<H50> q() {
        return r(true);
    }

    public List<H50> r(boolean z) {
        if (!z || this.l.size() <= 1) {
            return Collections.unmodifiableList(this.l);
        }
        ArrayList arrayList = new ArrayList(this.l.size());
        if (this.n == Short.MAX_VALUE) {
            this.n = (short) 0;
        }
        short s = this.n;
        this.n = (short) (s + 1);
        int size = s % this.l.size();
        ArrayList<H50> arrayList2 = this.l;
        arrayList.addAll(arrayList2.subList(size, arrayList2.size()));
        arrayList.addAll(this.l.subList(0, size));
        return arrayList;
    }

    public List<W40> s() {
        return Collections.unmodifiableList(this.m);
    }

    public int t() {
        return this.l.size();
    }

    public String toString() {
        if (this.l.isEmpty() && this.m.isEmpty()) {
            return "{empty}";
        }
        StringBuilder sbK = AbstractC1701hf0.k("{ ");
        sbK.append(o());
        sbK.append(" ");
        sbK.append(p());
        sbK.append(" ");
        sbK.append(C0344Ci.b(n()));
        sbK.append(" ");
        sbK.append(C3080vp0.e(getType()));
        sbK.append(" ");
        g(this.l.iterator(), sbK);
        if (!this.m.isEmpty()) {
            sbK.append(" sigs: ");
            g(this.m.iterator(), sbK);
        }
        sbK.append(" }");
        return sbK.toString();
    }

    public X40(H50 h50) {
        this();
        d(h50);
    }

    public X40(H50... h50Arr) {
        this();
        Objects.requireNonNull(h50Arr);
        for (H50 h50 : h50Arr) {
            d(h50);
        }
    }

    public X40(X40 x40) {
        this.l = new ArrayList<>(x40.l);
        this.m = new ArrayList<>(x40.m);
        this.n = x40.n;
        this.f612o = x40.f612o;
    }
}
