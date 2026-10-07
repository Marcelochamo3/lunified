package o;

/* JADX INFO: renamed from: o.Of, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0652Of implements InterfaceC0473Hh {
    public static final C0652Of m = new C0652Of(0);
    public static final C0652Of n = new C0652Of(1);
    public final /* synthetic */ int l;

    public /* synthetic */ C0652Of(int i) {
        this.l = i;
    }

    @Override // o.InterfaceC0473Hh
    public final InterfaceC1022ai g() {
        switch (this.l) {
            case 0:
                throw new IllegalStateException("This continuation is already complete".toString());
            default:
                return C1038aq.l;
        }
    }

    @Override // o.InterfaceC0473Hh
    public final void j(Object obj) {
        switch (this.l) {
            case 0:
                throw new IllegalStateException("This continuation is already complete".toString());
            default:
                return;
        }
    }

    public String toString() {
        switch (this.l) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }

    private final void b(Object obj) {
    }
}
