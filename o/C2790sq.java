package o;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: o.sq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2790sq {
    public final P70 a;
    public final Executor b;

    public C2790sq(P70 p70, Executor executor) {
        this.a = p70;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2790sq) {
            return this.a.equals(((C2790sq) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
