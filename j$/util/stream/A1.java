package j$.util.stream;

import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
class A1 extends CountedCompleter {
    protected final L0 a;
    protected final int b;
    public final /* synthetic */ int c;
    private final Object d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a1, K0 k0, int i) {
        this(a1, k0, i, (byte) 0);
        this.c = 0;
        this.d = a1.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public A1(A1 a1, L0 l0, int i) {
        this(a1, l0, i, (byte) 0);
        this.c = 1;
        this.d = (Object[]) a1.d;
    }

    A1(A1 a1, L0 l0, int i, byte b) {
        super(a1);
        this.a = l0;
        this.b = i;
    }

    public A1(L0 l0, Object obj, int i) {
        this.c = i;
        this.a = l0;
        this.b = 0;
        this.d = obj;
    }

    final void a() {
        switch (this.c) {
            case 0:
                ((K0) this.a).d(this.d, this.b);
                break;
            default:
                this.a.i((Object[]) this.d, this.b);
                break;
        }
    }

    final A1 b(int i, int i2) {
        switch (this.c) {
            case 0:
                return new A1(this, ((K0) this.a).b(i), i2);
            default:
                return new A1(this, this.a.b(i), i2);
        }
    }

    @Override // java.util.concurrent.CountedCompleter
    public final void compute() {
        A1 a1B = this;
        while (a1B.a.q() != 0) {
            a1B.setPendingCount(a1B.a.q() - 1);
            int i = 0;
            int iCount = 0;
            while (i < a1B.a.q() - 1) {
                A1 a1B2 = a1B.b(i, a1B.b + iCount);
                iCount = (int) (((long) iCount) + a1B2.a.count());
                a1B2.fork();
                i++;
            }
            a1B = a1B.b(i, a1B.b + iCount);
        }
        a1B.a();
        a1B.propagateCompletion();
    }
}
