package o;

/* JADX INFO: renamed from: o.lZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2079lZ {
    public final C3188wv a;

    public C2079lZ(C3188wv c3188wv) {
        this.a = c3188wv;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }

    public final boolean b(int... iArr) {
        C3188wv c3188wv = this.a;
        c3188wv.getClass();
        for (int i : iArr) {
            if (c3188wv.a.get(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2079lZ) {
            return this.a.equals(((C2079lZ) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
