package o;

import java.util.HashMap;

/* JADX INFO: renamed from: o.Kt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0563Kt extends C3022v90 {
    public final HashMap p = new HashMap();

    @Override // o.C3022v90
    public final C2731s90 a(Object obj) {
        return (C2731s90) this.p.get(obj);
    }

    @Override // o.C3022v90
    public final Object d(Object obj) {
        Object objD = super.d(obj);
        this.p.remove(obj);
        return objD;
    }

    public final Object e(Object obj, Object obj2) {
        C2731s90 c2731s90A = a(obj);
        if (c2731s90A != null) {
            return c2731s90A.m;
        }
        HashMap map = this.p;
        C2731s90 c2731s90 = new C2731s90(obj, obj2);
        this.f1071o++;
        C2731s90 c2731s91 = this.m;
        if (c2731s91 == null) {
            this.l = c2731s90;
            this.m = c2731s90;
        } else {
            c2731s91.n = c2731s90;
            c2731s90.f1020o = c2731s91;
            this.m = c2731s90;
        }
        map.put(obj, c2731s90);
        return null;
    }
}
