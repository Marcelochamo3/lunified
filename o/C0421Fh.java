package o;

/* JADX INFO: renamed from: o.Fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0421Fh implements InterfaceC1608gi {
    public final InterfaceC1022ai l;

    public C0421Fh(InterfaceC1022ai interfaceC1022ai) {
        this.l = interfaceC1022ai;
    }

    @Override // o.InterfaceC1608gi
    public final InterfaceC1022ai t() {
        return this.l;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.l + ')';
    }
}
