package o;

import android.text.TextUtils;

/* JADX INFO: renamed from: o.Qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0708Qj {
    public final String a;
    public final C0643Nw b;
    public final C0643Nw c;
    public final int d;
    public final int e;

    public C0708Qj(String str, C0643Nw c0643Nw, C0643Nw c0643Nw2, int i, int i2) {
        AbstractC0397Ej.c(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.a = str;
        c0643Nw.getClass();
        this.b = c0643Nw;
        c0643Nw2.getClass();
        this.c = c0643Nw2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0708Qj.class != obj.getClass()) {
            return false;
        }
        C0708Qj c0708Qj = (C0708Qj) obj;
        return this.d == c0708Qj.d && this.e == c0708Qj.e && this.a.equals(c0708Qj.a) && this.b.equals(c0708Qj.b) && this.c.equals(c0708Qj.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + AbstractC1674hK.i((((527 + this.d) * 31) + this.e) * 31, this.a, 31)) * 31);
    }
}
