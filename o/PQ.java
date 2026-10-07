package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PQ {
    public final InterfaceC2450pI a;
    public final List b;
    public final InterfaceC1610gj c;

    public PQ(InterfaceC2450pI interfaceC2450pI, InterfaceC1610gj interfaceC1610gj) {
        List listEmptyList = Collections.emptyList();
        AbstractC3045vW.k(interfaceC2450pI, "Argument must not be null");
        this.a = interfaceC2450pI;
        AbstractC3045vW.k(listEmptyList, "Argument must not be null");
        this.b = listEmptyList;
        AbstractC3045vW.k(interfaceC1610gj, "Argument must not be null");
        this.c = interfaceC1610gj;
    }
}
