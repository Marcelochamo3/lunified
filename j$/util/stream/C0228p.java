package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0228p extends AbstractC0216m2 {
    public final /* synthetic */ int b = 2;
    boolean c;
    Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228p(O3 o3, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.d = o3;
        this.c = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0228p(C0181f2 c0181f2, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.d = c0181f2;
    }

    public /* synthetic */ C0228p(InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) throws Exception {
        switch (this.b) {
            case 0:
                InterfaceC0236q2 interfaceC0236q2 = this.a;
                if (obj != null) {
                    Object obj2 = this.d;
                    if (obj2 != null && obj.equals(obj2)) {
                        return;
                    }
                } else {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    obj = null;
                }
                this.d = obj;
                interfaceC0236q2.accept(obj);
                return;
            case 1:
                Stream stream = (Stream) ((C0181f2) this.d).n.apply(obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC0236q2 interfaceC0236q3 = this.a;
                        if (z) {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC0236q3.n() && spliterator.tryAdvance(interfaceC0236q3)) {
                            }
                        } else {
                            ((Stream) stream.sequential()).forEach(interfaceC0236q3);
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((O3) this.d).m.test(obj);
                    this.c = zTest;
                    if (zTest) {
                        this.a.accept(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.l(-1L);
                break;
            case 1:
                this.a.l(-1L);
                break;
            default:
                this.a.l(-1L);
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0216m2, j$.util.stream.InterfaceC0236q2
    public boolean n() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.n();
            case 2:
                return !this.c || this.a.n();
            default:
                return super.n();
        }
    }
}
