package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
final class Z extends AbstractC0206k2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i, InterfaceC0236q2 interfaceC0236q2) {
        super(interfaceC0236q2);
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC0226o2, j$.util.stream.InterfaceC0236q2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                break;
            default:
                this.a.accept(i);
                break;
        }
    }
}
