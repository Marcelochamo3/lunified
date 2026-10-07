package o;

/* JADX INFO: renamed from: o.n80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2245n80 extends R7 {
    public AbstractC2245n80(InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        if (interfaceC0473Hh != null && interfaceC0473Hh.g() != C1038aq.l) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
        }
    }

    @Override // o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        return C1038aq.l;
    }
}
