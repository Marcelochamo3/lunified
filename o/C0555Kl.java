package o;

import android.transition.Transition;

/* JADX INFO: renamed from: o.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0555Kl extends AbstractC1074b8 {
    public final Object b;
    public final boolean c;

    /* JADX WARN: Code duplicated, block: B:13:0x001e A[PHI: r5
  0x001e: PHI (r5v1 java.lang.Object) = (r5v0 java.lang.Object), (r5v2 java.lang.Object) binds: [B:23:0x0031, B:9:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    public C0555Kl(C3157wf0 c3157wf0, boolean z, boolean z2) {
        Object obj;
        super(c3157wf0);
        int i = c3157wf0.a;
        Object obj2 = AbstractComponentCallbacksC1247cx.k0;
        Object obj3 = null;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c3157wf0.c;
        if (i == 2) {
            if (z) {
                C1052ax c1052ax = abstractComponentCallbacksC1247cx.V;
                if (c1052ax != null) {
                    obj = c1052ax.j;
                    if (obj != obj2) {
                        obj3 = obj;
                    } else if (c1052ax != null) {
                        obj3 = c1052ax.i;
                    }
                }
            } else {
                C1052ax c1052ax2 = abstractComponentCallbacksC1247cx.V;
                if (c1052ax2 != null) {
                    obj3 = c1052ax2.g;
                }
            }
        } else if (z) {
            C1052ax c1052ax3 = abstractComponentCallbacksC1247cx.V;
            if (c1052ax3 != null) {
                obj = c1052ax3.h;
                if (obj != obj2) {
                    obj3 = obj;
                } else if (c1052ax3 != null) {
                    obj3 = c1052ax3.g;
                }
            }
        } else {
            C1052ax c1052ax4 = abstractComponentCallbacksC1247cx.V;
            if (c1052ax4 != null) {
                obj3 = c1052ax4.i;
            }
        }
        this.b = obj3;
        if (i == 2) {
            if (z) {
                C1052ax c1052ax5 = abstractComponentCallbacksC1247cx.V;
            } else {
                C1052ax c1052ax6 = abstractComponentCallbacksC1247cx.V;
            }
        }
        this.c = true;
        if (z2) {
            if (z) {
                C1052ax c1052ax7 = abstractComponentCallbacksC1247cx.V;
            } else {
                abstractComponentCallbacksC1247cx.getClass();
            }
        }
    }

    public final AbstractC0956Zx r() {
        Object obj = this.b;
        AbstractC0956Zx abstractC0956ZxS = s(obj);
        AbstractC0956Zx abstractC0956ZxS2 = s(null);
        if (abstractC0956ZxS == null || abstractC0956ZxS2 == null || abstractC0956ZxS == abstractC0956ZxS2) {
            return abstractC0956ZxS == null ? abstractC0956ZxS2 : abstractC0956ZxS;
        }
        throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((C3157wf0) this.a).c + " returned Transition " + obj + " which uses a different Transition  type than its shared element transition null").toString());
    }

    public final AbstractC0956Zx s(Object obj) {
        if (obj == null) {
            return null;
        }
        C0904Xx c0904Xx = AbstractC0800Tx.a;
        if (obj instanceof Transition) {
            return c0904Xx;
        }
        AbstractC0956Zx abstractC0956Zx = AbstractC0800Tx.b;
        if (abstractC0956Zx != null && abstractC0956Zx.f(obj)) {
            return abstractC0956Zx;
        }
        throw new IllegalArgumentException("Transition " + obj + " for fragment " + ((C3157wf0) this.a).c + " is not a valid framework Transition or AndroidX Transition");
    }
}
