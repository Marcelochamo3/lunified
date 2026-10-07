package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Rh0 implements CJ, Serializable {
    public InterfaceC0360Cy l;
    public volatile Object m = O9.F;
    public final Object n = this;

    public Rh0(InterfaceC0360Cy interfaceC0360Cy) {
        this.l = interfaceC0360Cy;
    }

    private final Object writeReplace() {
        return new IF(getValue());
    }

    @Override // o.CJ
    public final Object getValue() {
        Object objC;
        Object obj = this.m;
        O9 o9 = O9.F;
        if (obj != o9) {
            return obj;
        }
        synchronized (this.n) {
            objC = this.m;
            if (objC == o9) {
                InterfaceC0360Cy interfaceC0360Cy = this.l;
                AbstractC1474fG.g(interfaceC0360Cy);
                objC = interfaceC0360Cy.c();
                this.m = objC;
                this.l = null;
            }
        }
        return objC;
    }

    public final String toString() {
        return this.m != O9.F ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
