package o;

/* JADX INFO: renamed from: o.m70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2146m70 extends AbstractC2340o70 {
    public final /* synthetic */ int a = 0;
    public final TP b;
    public final Object c;

    public C2146m70(TP tp, C2468pa c2468pa) {
        this.b = tp;
        this.c = c2468pa;
    }

    @Override // o.AbstractC2340o70
    public final long a() {
        switch (this.a) {
            case 0:
                return ((C2468pa) this.c).d();
            default:
                return ((AbstractC2340o70) this.c).a();
        }
    }

    @Override // o.AbstractC2340o70
    public final TP b() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    @Override // o.AbstractC2340o70
    public final void c(M9 m9) {
        switch (this.a) {
            case 0:
                m9.E((C2468pa) this.c);
                break;
            default:
                ((AbstractC2340o70) this.c).c(m9);
                break;
        }
    }

    public C2146m70(AbstractC2340o70 abstractC2340o70, TP tp) {
        this.c = abstractC2340o70;
        this.b = tp;
    }
}
