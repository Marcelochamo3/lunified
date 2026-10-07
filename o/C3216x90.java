package o;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.x90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3216x90 implements CJ, Serializable {
    public static final AtomicReferenceFieldUpdater n = AtomicReferenceFieldUpdater.newUpdater(C3216x90.class, Object.class, "m");
    public volatile InterfaceC0360Cy l;
    public volatile Object m;

    private final Object writeReplace() {
        return new IF(getValue());
    }

    @Override // o.CJ
    public final Object getValue() {
        Object obj = this.m;
        O9 o9 = O9.F;
        if (obj != o9) {
            return obj;
        }
        InterfaceC0360Cy interfaceC0360Cy = this.l;
        if (interfaceC0360Cy != null) {
            Object objC = interfaceC0360Cy.c();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = n;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, o9, objC)) {
                if (atomicReferenceFieldUpdater.get(this) != o9) {
                }
            }
            this.l = null;
            return objC;
        }
        return this.m;
    }

    public final String toString() {
        return this.m != O9.F ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
