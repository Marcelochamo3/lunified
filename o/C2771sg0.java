package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: o.sg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2771sg0 extends AbstractC2131m0 implements US, InterfaceC1538fw {
    public static final AtomicReferenceFieldUpdater p = AtomicReferenceFieldUpdater.newUpdater(C2771sg0.class, Object.class, "_state");
    private volatile Object _state;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1029o;

    public C2771sg0(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00ec A[Catch: all -> 0x003e, TryCatch #0 {all -> 0x003e, blocks: (B:14:0x0039, B:28:0x007d, B:30:0x0085, B:33:0x008c, B:34:0x0092, B:36:0x0095, B:46:0x00b6, B:49:0x00c9, B:50:0x00e1, B:56:0x00f5, B:53:0x00ec, B:55:0x00f2, B:38:0x009b, B:42:0x00a2, B:21:0x0053, B:24:0x005d, B:27:0x006e), top: B:63:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[LOOP:0: B:50:0x00e1->B:68:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00c8 -> B:28:0x007d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.InterfaceC1538fw
    public final java.lang.Object a(o.InterfaceC1734hw r17, o.InterfaceC0473Hh r18) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2771sg0.a(o.hw, o.Hh):java.lang.Object");
    }

    @Override // o.AbstractC2131m0
    public final AbstractC2228n0 c() {
        return new C2868tg0();
    }

    @Override // o.AbstractC2131m0
    public final AbstractC2228n0[] d() {
        return new C2868tg0[2];
    }

    public final void f(Object obj) {
        int i;
        AbstractC2228n0[] abstractC2228n0Arr;
        J2 j2;
        if (obj == null) {
            obj = Pu0.c;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = p;
            if (AbstractC1474fG.b(atomicReferenceFieldUpdater.get(this), obj)) {
                return;
            }
            atomicReferenceFieldUpdater.set(this, obj);
            int i2 = this.f1029o;
            if ((i2 & 1) != 0) {
                this.f1029o = i2 + 2;
                return;
            }
            int i3 = i2 + 1;
            this.f1029o = i3;
            AbstractC2228n0[] abstractC2228n0Arr2 = this.l;
            while (true) {
                C2868tg0[] c2868tg0Arr = (C2868tg0[]) abstractC2228n0Arr2;
                if (c2868tg0Arr != null) {
                    for (C2868tg0 c2868tg0 : c2868tg0Arr) {
                        if (c2868tg0 != null) {
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2868tg0.a;
                                Object obj2 = atomicReferenceFieldUpdater2.get(c2868tg0);
                                if (obj2 == null || obj2 == (j2 = Sr0.k)) {
                                    break;
                                }
                                J2 j3 = Sr0.j;
                                if (obj2 != j3) {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(c2868tg0, obj2, j3)) {
                                            ((C1692hb) obj2).j(C2985uq0.a);
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(c2868tg0) == obj2);
                                } else {
                                    do {
                                        if (atomicReferenceFieldUpdater2.compareAndSet(c2868tg0, obj2, j2)) {
                                            break;
                                        }
                                    } while (atomicReferenceFieldUpdater2.get(c2868tg0) == obj2);
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f1029o;
                    if (i == i3) {
                        this.f1029o = i3 + 1;
                        return;
                    }
                    abstractC2228n0Arr = this.l;
                }
                abstractC2228n0Arr2 = abstractC2228n0Arr;
                i3 = i;
            }
        }
    }

    @Override // o.InterfaceC2578qg0
    public final Object getValue() {
        J2 j2 = Pu0.c;
        Object obj = p.get(this);
        if (obj == j2) {
            return null;
        }
        return obj;
    }

    @Override // o.InterfaceC1734hw
    public final Object l(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        f(obj);
        return C2985uq0.a;
    }
}
