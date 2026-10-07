package o;

/* JADX INFO: renamed from: o.Eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0389Eb extends AbstractC0499Ih {
    public long l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0441Gb n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f240o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0389Eb(C0441Gb c0441Gb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.n = c0441Gb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.m = obj;
        this.f240o |= Integer.MIN_VALUE;
        return this.n.G(null, null, null, this);
    }
}
