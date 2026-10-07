package o;

/* JADX INFO: loaded from: classes.dex */
public final class AA extends AbstractC1304dc0 {
    public AbstractC3177wp0 a;

    @Override // o.AbstractC3177wp0
    public final Object a(WH wh) {
        AbstractC3177wp0 abstractC3177wp0 = this.a;
        if (abstractC3177wp0 != null) {
            return abstractC3177wp0.a(wh);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // o.AbstractC3177wp0
    public final void b(C1183cI c1183cI, Object obj) {
        AbstractC3177wp0 abstractC3177wp0 = this.a;
        if (abstractC3177wp0 == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        abstractC3177wp0.b(c1183cI, obj);
    }

    @Override // o.AbstractC1304dc0
    public final AbstractC3177wp0 c() {
        AbstractC3177wp0 abstractC3177wp0 = this.a;
        if (abstractC3177wp0 != null) {
            return abstractC3177wp0;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
