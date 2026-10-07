package o;

/* JADX INFO: renamed from: o.pr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2503pr0 extends AbstractC0499Ih {
    public long l;
    public YS m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C3084vr0 f981o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2503pr0(C3084vr0 c3084vr0, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f981o = c3084vr0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.f981o.r(0L, this);
    }
}
