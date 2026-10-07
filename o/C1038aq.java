package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1038aq implements InterfaceC1022ai, Serializable {
    public static final C1038aq l = new C1038aq();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return l;
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC1022ai Q(InterfaceC1022ai interfaceC1022ai) {
        AbstractC1474fG.j(interfaceC1022ai, "context");
        return interfaceC1022ai;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC1022ai p(InterfaceC0940Zh interfaceC0940Zh) {
        AbstractC1474fG.j(interfaceC0940Zh, "key");
        return this;
    }

    @Override // o.InterfaceC1022ai
    public final InterfaceC0914Yh q(InterfaceC0940Zh interfaceC0940Zh) {
        AbstractC1474fG.j(interfaceC0940Zh, "key");
        return null;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // o.InterfaceC1022ai
    public final Object l(Object obj, InterfaceC0775Sy interfaceC0775Sy) {
        return obj;
    }
}
