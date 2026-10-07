package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC0191h2 extends AbstractC0196i2 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC0191h2(AbstractC0158b abstractC0158b, int i, int i2) {
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

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        switch (this.l) {
            case 0:
                return !H() ? this : new C0176e2(this, EnumC0177e3.r, 1);
            default:
                return !H() ? this : new C0176e2(this, EnumC0177e3.r, 1);
        }
    }
}
