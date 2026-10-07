package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.Xm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0893Xm extends AbstractC0799Tw {
    public boolean m;
    public final /* synthetic */ C1227cn n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0919Ym f622o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0893Xm(C2046l6 c2046l6, C1227cn c1227cn, C0919Ym c0919Ym) {
        super(c2046l6);
        this.n = c1227cn;
        this.f622o = c0919Ym;
    }

    @Override // o.AbstractC0799Tw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        if (this.m) {
            return;
        }
        this.m = true;
        C1227cn c1227cn = this.n;
        C0919Ym c0919Ym = this.f622o;
        synchronized (c1227cn) {
            int i = c0919Ym.h - 1;
            c0919Ym.h = i;
            if (i == 0 && c0919Ym.f) {
                c1227cn.X(c0919Ym);
            }
        }
    }
}
