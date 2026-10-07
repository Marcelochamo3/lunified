package o;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: o.Nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0626Nf {
    public final Object a;
    public final AbstractC1301db b;
    public final InterfaceC0412Ey c;
    public final Object d;
    public final Throwable e;

    public C0626Nf(Object obj, AbstractC1301db abstractC1301db, InterfaceC0412Ey interfaceC0412Ey, Object obj2, Throwable th) {
        this.a = obj;
        this.b = abstractC1301db;
        this.c = interfaceC0412Ey;
        this.d = obj2;
        this.e = th;
    }

    public static C0626Nf a(C0626Nf c0626Nf, AbstractC1301db abstractC1301db, CancellationException cancellationException, int i) {
        Object obj = c0626Nf.a;
        if ((i & 2) != 0) {
            abstractC1301db = c0626Nf.b;
        }
        AbstractC1301db abstractC1301db2 = abstractC1301db;
        InterfaceC0412Ey interfaceC0412Ey = c0626Nf.c;
        Object obj2 = c0626Nf.d;
        Throwable th = cancellationException;
        if ((i & 16) != 0) {
            th = c0626Nf.e;
        }
        c0626Nf.getClass();
        return new C0626Nf(obj, abstractC1301db2, interfaceC0412Ey, obj2, th);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0626Nf)) {
            return false;
        }
        C0626Nf c0626Nf = (C0626Nf) obj;
        return AbstractC1474fG.b(this.a, c0626Nf.a) && AbstractC1474fG.b(this.b, c0626Nf.b) && AbstractC1474fG.b(this.c, c0626Nf.c) && AbstractC1474fG.b(this.d, c0626Nf.d) && AbstractC1474fG.b(this.e, c0626Nf.e);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC1301db abstractC1301db = this.b;
        int iHashCode2 = (iHashCode + (abstractC1301db == null ? 0 : abstractC1301db.hashCode())) * 31;
        InterfaceC0412Ey interfaceC0412Ey = this.c;
        int iHashCode3 = (iHashCode2 + (interfaceC0412Ey == null ? 0 : interfaceC0412Ey.hashCode())) * 31;
        Object obj2 = this.d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ C0626Nf(Object obj, AbstractC1301db abstractC1301db, InterfaceC0412Ey interfaceC0412Ey, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC1301db, (i & 4) != 0 ? null : interfaceC0412Ey, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }
}
