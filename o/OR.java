package o;

/* JADX INFO: loaded from: classes.dex */
public final class OR extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ AbstractComponentCallbacksC1247cx n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ CJ f432o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OR(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, CJ cj, int i) {
        super(0);
        this.m = i;
        this.n = abstractComponentCallbacksC1247cx;
        this.f432o = cj;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        Yt0 yt0C;
        Yt0 yt0C2;
        Yt0 yt0C3;
        Yt0 yt0C4;
        switch (this.m) {
            case 0:
                InterfaceC1047au0 interfaceC1047au0 = (InterfaceC1047au0) this.f432o.getValue();
                InterfaceC1665hB interfaceC1665hB = interfaceC1047au0 instanceof InterfaceC1665hB ? (InterfaceC1665hB) interfaceC1047au0 : null;
                return (interfaceC1665hB == null || (yt0C = interfaceC1665hB.c()) == null) ? this.n.c() : yt0C;
            case 1:
                InterfaceC1047au0 interfaceC1047au1 = (InterfaceC1047au0) this.f432o.getValue();
                InterfaceC1665hB interfaceC1665hB2 = interfaceC1047au1 instanceof InterfaceC1665hB ? (InterfaceC1665hB) interfaceC1047au1 : null;
                return (interfaceC1665hB2 == null || (yt0C2 = interfaceC1665hB2.c()) == null) ? this.n.c() : yt0C2;
            case 2:
                InterfaceC1047au0 interfaceC1047au2 = (InterfaceC1047au0) this.f432o.getValue();
                InterfaceC1665hB interfaceC1665hB3 = interfaceC1047au2 instanceof InterfaceC1665hB ? (InterfaceC1665hB) interfaceC1047au2 : null;
                return (interfaceC1665hB3 == null || (yt0C3 = interfaceC1665hB3.c()) == null) ? this.n.c() : yt0C3;
            default:
                InterfaceC1047au0 interfaceC1047au3 = (InterfaceC1047au0) this.f432o.getValue();
                InterfaceC1665hB interfaceC1665hB4 = interfaceC1047au3 instanceof InterfaceC1665hB ? (InterfaceC1665hB) interfaceC1047au3 : null;
                return (interfaceC1665hB4 == null || (yt0C4 = interfaceC1665hB4.c()) == null) ? this.n.c() : yt0C4;
        }
    }
}
