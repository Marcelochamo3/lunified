package o;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.bI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1086bI extends C1183cI {
    public static final C0988aI A = new C0988aI();
    public static final VH B = new VH("closed");
    public final ArrayList x;
    public String y;
    public QH z;

    public C1086bI() {
        super(A);
        this.x = new ArrayList();
        this.z = SH.l;
    }

    @Override // o.C1183cI
    public final C1183cI Q() {
        f0(SH.l);
        return this;
    }

    @Override // o.C1183cI
    public final void X(double d) {
        if (this.q || !(Double.isNaN(d) || Double.isInfinite(d))) {
            f0(new VH(Double.valueOf(d)));
        } else {
            throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
        }
    }

    @Override // o.C1183cI
    public final void Y(long j) {
        f0(new VH(Long.valueOf(j)));
    }

    @Override // o.C1183cI
    public final void Z(Boolean bool) {
        if (bool == null) {
            f0(SH.l);
        } else {
            f0(new VH(bool));
        }
    }

    @Override // o.C1183cI
    public final void a0(Number number) {
        if (number == null) {
            f0(SH.l);
            return;
        }
        if (!this.q) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        f0(new VH(number));
    }

    @Override // o.C1183cI
    public final void b0(String str) {
        if (str == null) {
            f0(SH.l);
        } else {
            f0(new VH(str));
        }
    }

    @Override // o.C1183cI
    public final void c0(boolean z) {
        f0(new VH(Boolean.valueOf(z)));
    }

    @Override // o.C1183cI, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.x;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(B);
    }

    public final QH e0() {
        return (QH) AbstractC1701hf0.c(1, this.x);
    }

    @Override // o.C1183cI
    public final void f() {
        OH oh = new OH();
        f0(oh);
        this.x.add(oh);
    }

    public final void f0(QH qh) {
        if (this.y != null) {
            if (!(qh instanceof SH) || this.t) {
                TH th = (TH) e0();
                th.l.put(this.y, qh);
            }
            this.y = null;
            return;
        }
        if (this.x.isEmpty()) {
            this.z = qh;
            return;
        }
        QH qhE0 = e0();
        if (!(qhE0 instanceof OH)) {
            throw new IllegalStateException();
        }
        OH oh = (OH) qhE0;
        oh.getClass();
        oh.l.add(qh);
    }

    @Override // o.C1183cI
    public final void i() {
        TH th = new TH();
        f0(th);
        this.x.add(th);
    }

    @Override // o.C1183cI
    public final void p() {
        ArrayList arrayList = this.x;
        if (arrayList.isEmpty() || this.y != null) {
            throw new IllegalStateException();
        }
        if (!(e0() instanceof OH)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // o.C1183cI
    public final void q() {
        ArrayList arrayList = this.x;
        if (arrayList.isEmpty() || this.y != null) {
            throw new IllegalStateException();
        }
        if (!(e0() instanceof TH)) {
            throw new IllegalStateException();
        }
        arrayList.remove(arrayList.size() - 1);
    }

    @Override // o.C1183cI
    public final void t(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.x.isEmpty() || this.y != null) {
            throw new IllegalStateException();
        }
        if (!(e0() instanceof TH)) {
            throw new IllegalStateException();
        }
        this.y = str;
    }

    @Override // o.C1183cI, java.io.Flushable
    public final void flush() {
    }
}
