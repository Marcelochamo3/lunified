package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0233q extends AbstractC0216m2 {
    public final /* synthetic */ int b;
    Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0233q(AbstractC0158b abstractC0158b, InterfaceC0236q2 interfaceC0236q2, int i) {
        super(interfaceC0236q2);
        this.b = i;
        this.c = abstractC0158b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0233q(InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.b = 0;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    this.a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((C0257v) this.c).n).accept(obj);
                this.a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((C0257v) this.c).n).test(obj)) {
                    this.a.accept(obj);
                }
                break;
            case 3:
                this.a.accept(((C0181f2) this.c).n.apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((Y) this.c).n).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((C0199j0) this.c).n).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((A) this.c).n).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public void l(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.l(-1L);
                break;
            case 1:
            default:
                super.l(j);
                break;
            case 2:
                this.a.l(-1L);
                break;
        }
    }
}
