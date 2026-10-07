package io.sentry.android.replay.capture;

import io.sentry.C0104y;
import io.sentry.K;
import io.sentry.K1;
import io.sentry.P0;
import o.AbstractC1474fG;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public final long a;
    public final K1 b;
    public final P0 c;

    public b(long j, K1 k1, P0 p0) {
        this.a = j;
        this.b = k1;
        this.c = p0;
    }

    public final void a(K k, C0104y c0104y) {
        AbstractC1474fG.j(c0104y, "hint");
        if (k != null) {
            c0104y.f = this.c;
            k.s(this.b, c0104y);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && AbstractC1474fG.b(this.b, bVar.b) && AbstractC1474fG.b(this.c, bVar.c);
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() + ((this.b.hashCode() + (((int) (j ^ (j >>> 32))) * 31)) * 31);
    }

    public final String toString() {
        return "Created(videoDuration=" + this.a + ", replay=" + this.b + ", recording=" + this.c + ')';
    }
}
