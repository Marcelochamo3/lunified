package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
abstract class E2 extends AbstractC0216m2 {
    protected final Comparator b;
    protected boolean c;

    E2(InterfaceC0236q2 interfaceC0236q2, Comparator comparator) {
        super(interfaceC0236q2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public final boolean n() {
        this.c = true;
        return false;
    }
}
