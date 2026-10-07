package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class P3 extends AbstractC0216m2 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ Q3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    P3(Q3 q3, InterfaceC0236q2 interfaceC0236q2, boolean z) {
        super(interfaceC0236q2);
        this.e = q3;
        this.d = z;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z = true;
        if (!this.c) {
            boolean z2 = !this.e.m.test(obj);
            this.c = z2;
            if (!z2) {
                z = false;
            }
        }
        boolean z3 = this.d;
        if (z3 && !z) {
            this.b++;
        }
        if (z3 || z) {
            this.a.accept(obj);
        }
    }
}
