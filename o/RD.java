package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class RD extends AbstractC3066vi0 {
    public final /* synthetic */ TD e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RD(String str, TD td, long j) {
        super(str, true);
        this.e = td;
        this.f = j;
    }

    @Override // o.AbstractC3066vi0
    public final long a() {
        TD td;
        boolean z;
        synchronized (this.e) {
            td = this.e;
            long j = td.y;
            long j2 = td.x;
            if (j < j2) {
                z = true;
            } else {
                td.x = j2 + 1;
                z = false;
            }
        }
        if (z) {
            td.a(2, 2, null);
            return -1L;
        }
        try {
            td.J.q(1, 0, false);
        } catch (IOException e) {
            td.a(2, 2, e);
        }
        return this.f;
    }
}
