package o;

import j$.util.Objects;

/* JADX INFO: renamed from: o.hE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1668hE extends RuntimeException {
    public final int l;

    public C1668hE(C1759i80 c1759i80) {
        Objects.requireNonNull(c1759i80, "response == null");
        StringBuilder sb = new StringBuilder("HTTP ");
        C1855j80 c1855j80 = c1759i80.a;
        sb.append(c1855j80.f840o);
        sb.append(" ");
        sb.append(c1855j80.n);
        super(sb.toString());
        this.l = c1855j80.f840o;
        String str = c1855j80.n;
    }
}
