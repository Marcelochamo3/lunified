package o;

/* JADX INFO: renamed from: o.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2296nl implements Gh0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C2296nl(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // o.Gh0
    public final Object get() {
        switch (this.l) {
            case 0:
                try {
                    return (BP) ((Class) this.m).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (C1906jl) this.m;
            case 2:
                return (AbstractC3133wN) this.m;
            case 3:
                return (C3168wl) this.m;
            default:
                return Boolean.valueOf(((C1628gs) this.m).K);
        }
    }
}
