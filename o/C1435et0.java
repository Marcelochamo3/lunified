package o;

/* JADX INFO: renamed from: o.et0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1435et0 extends C1292dT {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1435et0(int i) {
        super(6, false);
        this.c = i;
    }

    @Override // o.C1292dT, o.AbstractC3473zs
    public final String c() {
        switch (this.c) {
            case 0:
                return "https://mcloud.bz";
            default:
                return "https://vidplay.online";
        }
    }

    @Override // o.C1292dT, o.AbstractC3473zs
    public String d() {
        switch (this.c) {
            case 0:
                return "MyCloud";
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1435et0(int i, boolean z) {
        super(6, z);
        this.c = i;
    }
}
