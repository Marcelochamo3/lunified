package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Kq0 implements CJ, Serializable {
    public InterfaceC0360Cy l;
    public Object m;

    private final Object writeReplace() {
        return new IF(getValue());
    }

    @Override // o.CJ
    public final Object getValue() {
        if (this.m == O9.F) {
            InterfaceC0360Cy interfaceC0360Cy = this.l;
            AbstractC1474fG.g(interfaceC0360Cy);
            this.m = interfaceC0360Cy.c();
            this.l = null;
        }
        return this.m;
    }

    public final String toString() {
        return this.m != O9.F ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
