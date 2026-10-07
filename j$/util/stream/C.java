package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: loaded from: classes2.dex */
abstract class C extends D {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(AbstractC0158b abstractC0158b, int i, int i2) {
        super(abstractC0158b, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC0158b
    final boolean M() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G parallel() {
        switch (this.l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream, j$.util.stream.G
    public final /* bridge */ /* synthetic */ G sequential() {
        switch (this.l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.AbstractC0158b, j$.util.stream.BaseStream
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        switch (this.l) {
            case 0:
                break;
        }
        return spliterator();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        switch (this.l) {
            case 0:
                return !H() ? this : new C0261w(this, EnumC0177e3.r, 1);
            default:
                return !H() ? this : new C0261w(this, EnumC0177e3.r, 1);
        }
    }
}
