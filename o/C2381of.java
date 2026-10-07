package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2381of implements Serializable {
    private static final long serialVersionUID = 0;
    public final InterfaceC1022ai[] l;

    public C2381of(InterfaceC1022ai[] interfaceC1022aiArr) {
        this.l = interfaceC1022aiArr;
    }

    private final Object readResolve() {
        InterfaceC1022ai interfaceC1022aiQ = C1038aq.l;
        for (InterfaceC1022ai interfaceC1022ai : this.l) {
            interfaceC1022aiQ = interfaceC1022aiQ.Q(interfaceC1022ai);
        }
        return interfaceC1022aiQ;
    }
}
