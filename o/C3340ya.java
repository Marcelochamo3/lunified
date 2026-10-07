package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.ya, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3340ya extends AbstractC0799Tw {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ AbstractC2051l80 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3340ya(KV kv, N9 n9) {
        super(n9);
        this.n = kv;
    }

    @Override // o.AbstractC0799Tw, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.m) {
            case 0:
                ((C3437za) this.n).m.close();
                super.close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // o.AbstractC0799Tw, o.InterfaceC2091lf0
    public long y(E9 e9, long j) throws IOException {
        switch (this.m) {
            case 1:
                try {
                    return super.y(e9, j);
                } catch (IOException e) {
                    ((KV) this.n).f361o = e;
                    throw e;
                }
            default:
                return super.y(e9, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3340ya(InterfaceC2091lf0 interfaceC2091lf0, C3437za c3437za) {
        super(interfaceC2091lf0);
        this.n = c3437za;
    }
}
