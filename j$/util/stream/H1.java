package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
final class H1 extends AbstractC0274z0 {
    public final /* synthetic */ int h;

    public /* synthetic */ H1(int i) {
        this.h = i;
    }

    @Override // j$.util.stream.AbstractC0274z0, j$.util.stream.K3
    public final Object b(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return EnumC0177e3.SIZED.u(abstractC0158b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC0158b, spliterator);
            case 1:
                return EnumC0177e3.SIZED.u(abstractC0158b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC0158b, spliterator);
            case 2:
                return EnumC0177e3.SIZED.u(abstractC0158b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC0158b, spliterator);
            default:
                return EnumC0177e3.SIZED.u(abstractC0158b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.b(abstractC0158b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC0274z0, j$.util.stream.K3
    public final Object c(AbstractC0158b abstractC0158b, Spliterator spliterator) {
        switch (this.h) {
            case 0:
                return EnumC0177e3.SIZED.u(abstractC0158b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC0158b, spliterator);
            case 1:
                return EnumC0177e3.SIZED.u(abstractC0158b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC0158b, spliterator);
            case 2:
                return EnumC0177e3.SIZED.u(abstractC0158b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC0158b, spliterator);
            default:
                return EnumC0177e3.SIZED.u(abstractC0158b.G()) ? Long.valueOf(spliterator.getExactSizeIfKnown()) : (Long) super.c(abstractC0158b, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC0274z0
    public final V1 c0() {
        switch (this.h) {
            case 0:
                return new Z1();
            case 1:
                return new X1();
            case 2:
                return new C0156a2();
            default:
                return new Y1();
        }
    }

    @Override // j$.util.stream.AbstractC0274z0, j$.util.stream.K3
    public final int d() {
        switch (this.h) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return EnumC0177e3.r;
    }
}
