package j$.util.stream;

import j$.util.Collection$EL;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class M2 extends E2 {
    private ArrayList d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.d.add(obj);
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public final void k() {
        List list = this.d;
        boolean z = list instanceof j$.util.List;
        Comparator comparator = this.b;
        if (z) {
            ((j$.util.List) list).sort(comparator);
        } else {
            j$.util.List.CC.$default$sort(list, comparator);
        }
        long size = this.d.size();
        InterfaceC0236q2 interfaceC0236q2 = this.a;
        interfaceC0236q2.l(size);
        if (this.c) {
            for (Object obj : this.d) {
                if (interfaceC0236q2.n()) {
                    break;
                } else {
                    interfaceC0236q2.accept(obj);
                }
            }
        } else {
            ArrayList arrayList = this.d;
            Objects.requireNonNull(interfaceC0236q2);
            Collection$EL.a(arrayList, new C0153a(interfaceC0236q2, 1));
        }
        interfaceC0236q2.k();
        this.d = null;
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = j >= 0 ? new ArrayList((int) j) : new ArrayList();
    }
}
