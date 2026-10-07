package o;

/* JADX INFO: renamed from: o.Fb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0415Fb extends AbstractC0499Ih {
    public C0441Gb l;
    public Object m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f262o;
    public final /* synthetic */ C0441Gb p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0415Fb(C0441Gb c0441Gb, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.p = c0441Gb;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        this.f262o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, 0, this);
    }
}
