package o;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class Gb0 {
    public static final C3343yb0 a = new C3343yb0(new byte[0], 0, 0, false);
    public static final int b;
    public static final AtomicReference[] c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        c = atomicReferenceArr;
    }

    public static final void a(C3343yb0 c3343yb0) {
        if (c3343yb0.f != null || c3343yb0.g != null) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (c3343yb0.d) {
            return;
        }
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        C3343yb0 c3343yb1 = a;
        C3343yb0 c3343yb2 = (C3343yb0) atomicReference.getAndSet(c3343yb1);
        if (c3343yb2 == c3343yb1) {
            return;
        }
        int i = c3343yb2 != null ? c3343yb2.c : 0;
        if (i >= 65536) {
            atomicReference.set(c3343yb2);
            return;
        }
        c3343yb0.f = c3343yb2;
        c3343yb0.b = 0;
        c3343yb0.c = i + C1672hI.a.e;
        atomicReference.set(c3343yb0);
    }

    public static final C3343yb0 b() {
        AtomicReference atomicReference = c[(int) (Thread.currentThread().getId() & (((long) b) - 1))];
        C3343yb0 c3343yb0 = a;
        C3343yb0 c3343yb1 = (C3343yb0) atomicReference.getAndSet(c3343yb0);
        if (c3343yb1 == c3343yb0) {
            return new C3343yb0();
        }
        if (c3343yb1 == null) {
            atomicReference.set(null);
            return new C3343yb0();
        }
        atomicReference.set(c3343yb1.f);
        c3343yb1.f = null;
        c3343yb1.c = 0;
        return c3343yb1;
    }
}
