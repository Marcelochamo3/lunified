package o;

import android.content.Context;

/* JADX INFO: renamed from: o.xy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3291xy implements Mh0 {
    public final Context l;
    public final String m;
    public final C1909jm0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rh0 f1128o;
    public boolean p;

    public C3291xy(Context context, String str, C1909jm0 c1909jm0) {
        AbstractC1474fG.j(context, "context");
        AbstractC1474fG.j(c1909jm0, "callback");
        this.l = context;
        this.m = str;
        this.n = c1909jm0;
        this.f1128o = new Rh0(new io.sentry.android.replay.f(8, this));
    }

    @Override // o.Mh0
    public final C2903ty P() {
        return ((C3194wy) this.f1128o.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1128o.m != O9.F) {
            ((C3194wy) this.f1128o.getValue()).close();
        }
    }

    @Override // o.Mh0
    public final void setWriteAheadLoggingEnabled(boolean z) {
        if (this.f1128o.m != O9.F) {
            C3194wy c3194wy = (C3194wy) this.f1128o.getValue();
            AbstractC1474fG.j(c3194wy, "sQLiteOpenHelper");
            c3194wy.setWriteAheadLoggingEnabled(z);
        }
        this.p = z;
    }
}
