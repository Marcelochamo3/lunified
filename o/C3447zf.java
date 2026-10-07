package o;

import java.util.Map;

/* JADX INFO: renamed from: o.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3447zf extends Z {
    public final Object l;
    public int m;
    public final /* synthetic */ C0289Af n;

    public C3447zf(C0289Af c0289Af, int i) {
        this.n = c0289Af;
        Object obj = C0289Af.u;
        this.l = c0289Af.i()[i];
        this.m = i;
    }

    public final void a() {
        int i = this.m;
        Object obj = this.l;
        C0289Af c0289Af = this.n;
        if (i != -1 && i < c0289Af.size()) {
            if (AbstractC1459f50.p(obj, c0289Af.i()[this.m])) {
                return;
            }
        }
        Object obj2 = C0289Af.u;
        this.m = c0289Af.d(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        C0289Af c0289Af = this.n;
        Map mapB = c0289Af.b();
        if (mapB != null) {
            return mapB.get(this.l);
        }
        a();
        int i = this.m;
        if (i == -1) {
            return null;
        }
        return c0289Af.j()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        C0289Af c0289Af = this.n;
        Map mapB = c0289Af.b();
        Object obj2 = this.l;
        if (mapB != null) {
            return mapB.put(obj2, obj);
        }
        a();
        int i = this.m;
        if (i == -1) {
            c0289Af.put(obj2, obj);
            return null;
        }
        Object obj3 = c0289Af.j()[i];
        c0289Af.j()[this.m] = obj;
        return obj3;
    }
}
