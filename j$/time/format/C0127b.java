package j$.time.format;

import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: j$.time.format.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0127b extends B {
    final /* synthetic */ A e;

    C0127b(A a) {
        this.e = a;
    }

    @Override // j$.time.format.B
    public final String e(j$.time.chrono.n nVar, j$.time.temporal.p pVar, long j, G g, Locale locale) {
        return this.e.a(j, g);
    }

    @Override // j$.time.format.B
    public final String f(j$.time.temporal.p pVar, long j, G g, Locale locale) {
        return this.e.a(j, g);
    }

    @Override // j$.time.format.B
    public final Iterator g(j$.time.chrono.n nVar, j$.time.temporal.p pVar, G g, Locale locale) {
        return this.e.b(g);
    }

    @Override // j$.time.format.B
    public final Iterator h(j$.time.temporal.p pVar, G g, Locale locale) {
        return this.e.b(g);
    }
}
