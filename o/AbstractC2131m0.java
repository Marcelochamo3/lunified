package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2131m0 {
    public AbstractC2228n0[] l;
    public int m;
    public int n;

    public final AbstractC2228n0 b() {
        AbstractC2228n0 abstractC2228n0C;
        synchronized (this) {
            try {
                AbstractC2228n0[] abstractC2228n0ArrD = this.l;
                if (abstractC2228n0ArrD == null) {
                    abstractC2228n0ArrD = d();
                    this.l = abstractC2228n0ArrD;
                } else if (this.m >= abstractC2228n0ArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC2228n0ArrD, abstractC2228n0ArrD.length * 2);
                    AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
                    this.l = (AbstractC2228n0[]) objArrCopyOf;
                    abstractC2228n0ArrD = (AbstractC2228n0[]) objArrCopyOf;
                }
                int i = this.n;
                do {
                    abstractC2228n0C = abstractC2228n0ArrD[i];
                    if (abstractC2228n0C == null) {
                        abstractC2228n0C = c();
                        abstractC2228n0ArrD[i] = abstractC2228n0C;
                    }
                    i++;
                    if (i >= abstractC2228n0ArrD.length) {
                        i = 0;
                    }
                } while (!abstractC2228n0C.a(this));
                this.n = i;
                this.m++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC2228n0C;
    }

    public abstract AbstractC2228n0 c();

    public abstract AbstractC2228n0[] d();

    public final void e(AbstractC2228n0 abstractC2228n0) {
        int i;
        InterfaceC0473Hh[] interfaceC0473HhArrB;
        synchronized (this) {
            try {
                int i2 = this.m - 1;
                this.m = i2;
                if (i2 == 0) {
                    this.n = 0;
                }
                AbstractC1474fG.h(abstractC2228n0, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC0473HhArrB = abstractC2228n0.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0473Hh interfaceC0473Hh : interfaceC0473HhArrB) {
            if (interfaceC0473Hh != null) {
                interfaceC0473Hh.j(C2985uq0.a);
            }
        }
    }
}
