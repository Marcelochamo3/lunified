package o;

import j$.util.Objects;

/* JADX INFO: renamed from: o.eF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1375eF extends TE {
    @Override // o.TE
    public final /* bridge */ /* synthetic */ TE b(Object obj) {
        g(obj);
        return this;
    }

    public final void g(Object obj) {
        obj.getClass();
        a(obj);
    }

    public final AbstractC1571gF h() {
        int i = this.b;
        if (i == 0) {
            int i2 = AbstractC1571gF.n;
            return S60.u;
        }
        if (i != 1) {
            AbstractC1571gF abstractC1571gFK = AbstractC1571gF.k(i, this.a);
            this.b = abstractC1571gFK.size();
            this.c = true;
            return abstractC1571gFK;
        }
        Object obj = this.a[0];
        Objects.requireNonNull(obj);
        int i3 = AbstractC1571gF.n;
        return new C1893je0(obj);
    }
}
