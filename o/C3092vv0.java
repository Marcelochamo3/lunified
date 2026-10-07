package o;

/* JADX INFO: renamed from: o.vv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3092vv0 extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ long m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3092vv0(long j) {
        super(1);
        this.m = j;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        C0628Nh c0628Nh = (C0628Nh) obj;
        AbstractC1474fG.j(c0628Nh, "it");
        return Boolean.valueOf(c0628Nh.c <= this.m);
    }
}
