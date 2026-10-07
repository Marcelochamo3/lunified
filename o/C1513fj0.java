package o;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: o.fj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1513fj0 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C1513fj0.class, "_size");
    private volatile int _size;
    public AbstractRunnableC1626gr[] a;

    public final void a(AbstractRunnableC1626gr abstractRunnableC1626gr) {
        abstractRunnableC1626gr.c((C1724hr) this);
        AbstractRunnableC1626gr[] abstractRunnableC1626grArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (abstractRunnableC1626grArr == null) {
            abstractRunnableC1626grArr = new AbstractRunnableC1626gr[4];
            this.a = abstractRunnableC1626grArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC1626grArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC1626grArr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
            abstractRunnableC1626grArr = (AbstractRunnableC1626gr[]) objArrCopyOf;
            this.a = abstractRunnableC1626grArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC1626grArr[i] = abstractRunnableC1626gr;
        abstractRunnableC1626gr.m = i;
        e(i);
    }

    public final AbstractRunnableC1626gr b() {
        AbstractRunnableC1626gr abstractRunnableC1626gr;
        synchronized (this) {
            AbstractRunnableC1626gr[] abstractRunnableC1626grArr = this.a;
            abstractRunnableC1626gr = abstractRunnableC1626grArr != null ? abstractRunnableC1626grArr[0] : null;
        }
        return abstractRunnableC1626gr;
    }

    public final void c(AbstractRunnableC1626gr abstractRunnableC1626gr) {
        synchronized (this) {
            if (abstractRunnableC1626gr.a() != null) {
                d(abstractRunnableC1626gr.m);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    /* JADX WARN: Code duplicated, block: B:17:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075 A[LOOP:0: B:9:0x003a->B:21:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a A[EDGE_INSN: B:24:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x007a A[EDGE_INSN: B:25:0x007a->B:22:0x007a BREAK  A[LOOP:0: B:9:0x003a->B:21:0x0075], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:? A[SYNTHETIC] */
    public final AbstractRunnableC1626gr d(int i) {
        int i2;
        int i3;
        Object[] objArr;
        int i4;
        Comparable comparable;
        Comparable comparable2;
        Comparable comparable3;
        Object obj;
        Object[] objArr2 = this.a;
        AbstractC1474fG.g(objArr2);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            f(i, atomicIntegerFieldUpdater.get(this));
            int i5 = (i - 1) / 2;
            if (i > 0) {
                AbstractRunnableC1626gr abstractRunnableC1626gr = objArr2[i];
                AbstractC1474fG.g(abstractRunnableC1626gr);
                Object obj2 = objArr2[i5];
                AbstractC1474fG.g(obj2);
                if (abstractRunnableC1626gr.compareTo(obj2) < 0) {
                    f(i, i5);
                    e(i5);
                } else {
                    while (true) {
                        i2 = i * 2;
                        i3 = i2 + 1;
                        if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        objArr = this.a;
                        AbstractC1474fG.g(objArr);
                        i4 = i2 + 2;
                        if (i4 < atomicIntegerFieldUpdater.get(this)) {
                            comparable3 = objArr[i4];
                            AbstractC1474fG.g(comparable3);
                            obj = objArr[i3];
                            AbstractC1474fG.g(obj);
                            if (comparable3.compareTo(obj) >= 0) {
                                i4 = i3;
                            }
                        } else {
                            i4 = i3;
                        }
                        comparable = objArr[i];
                        AbstractC1474fG.g(comparable);
                        comparable2 = objArr[i4];
                        AbstractC1474fG.g(comparable2);
                        if (comparable.compareTo(comparable2) <= 0) {
                            break;
                        }
                        f(i, i4);
                        i = i4;
                    }
                }
            } else {
                while (true) {
                    i2 = i * 2;
                    i3 = i2 + 1;
                    if (i3 >= atomicIntegerFieldUpdater.get(this)) {
                        break;
                        break;
                    }
                    objArr = this.a;
                    AbstractC1474fG.g(objArr);
                    i4 = i2 + 2;
                    if (i4 < atomicIntegerFieldUpdater.get(this)) {
                        comparable3 = objArr[i4];
                        AbstractC1474fG.g(comparable3);
                        obj = objArr[i3];
                        AbstractC1474fG.g(obj);
                        if (comparable3.compareTo(obj) >= 0) {
                            i4 = i3;
                        }
                    } else {
                        i4 = i3;
                    }
                    comparable = objArr[i];
                    AbstractC1474fG.g(comparable);
                    comparable2 = objArr[i4];
                    AbstractC1474fG.g(comparable2);
                    if (comparable.compareTo(comparable2) <= 0) {
                        break;
                        break;
                    }
                    f(i, i4);
                    i = i4;
                }
            }
        }
        AbstractRunnableC1626gr abstractRunnableC1626gr2 = objArr2[atomicIntegerFieldUpdater.get(this)];
        AbstractC1474fG.g(abstractRunnableC1626gr2);
        abstractRunnableC1626gr2.c(null);
        abstractRunnableC1626gr2.m = -1;
        objArr2[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC1626gr2;
    }

    public final void e(int i) {
        while (i > 0) {
            AbstractRunnableC1626gr[] abstractRunnableC1626grArr = this.a;
            AbstractC1474fG.g(abstractRunnableC1626grArr);
            int i2 = (i - 1) / 2;
            AbstractRunnableC1626gr abstractRunnableC1626gr = abstractRunnableC1626grArr[i2];
            AbstractC1474fG.g(abstractRunnableC1626gr);
            AbstractRunnableC1626gr abstractRunnableC1626gr2 = abstractRunnableC1626grArr[i];
            AbstractC1474fG.g(abstractRunnableC1626gr2);
            if (abstractRunnableC1626gr.compareTo(abstractRunnableC1626gr2) <= 0) {
                return;
            }
            f(i, i2);
            i = i2;
        }
    }

    public final void f(int i, int i2) {
        AbstractRunnableC1626gr[] abstractRunnableC1626grArr = this.a;
        AbstractC1474fG.g(abstractRunnableC1626grArr);
        AbstractRunnableC1626gr abstractRunnableC1626gr = abstractRunnableC1626grArr[i2];
        AbstractC1474fG.g(abstractRunnableC1626gr);
        AbstractRunnableC1626gr abstractRunnableC1626gr2 = abstractRunnableC1626grArr[i];
        AbstractC1474fG.g(abstractRunnableC1626gr2);
        abstractRunnableC1626grArr[i] = abstractRunnableC1626gr;
        abstractRunnableC1626grArr[i2] = abstractRunnableC1626gr2;
        abstractRunnableC1626gr.m = i;
        abstractRunnableC1626gr2.m = i2;
    }
}
