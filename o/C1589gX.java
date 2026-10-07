package o;

import j$.util.Objects;

/* JADX INFO: renamed from: o.gX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1589gX extends Pu0 {
    public final /* synthetic */ int f;
    public final String g;
    public final InterfaceC0602Mh h;
    public final boolean i;

    public C1589gX(int i, String str, boolean z) {
        this.f = i;
        switch (i) {
            case 1:
                O9 o9 = O9.m;
                Objects.requireNonNull(str, "name == null");
                this.g = str;
                this.h = o9;
                this.i = z;
                break;
            case 2:
                O9 o10 = O9.m;
                Objects.requireNonNull(str, "name == null");
                this.g = str;
                this.h = o10;
                this.i = z;
                break;
            default:
                O9 o11 = O9.m;
                Objects.requireNonNull(str, "name == null");
                this.g = str;
                this.h = o11;
                this.i = z;
                break;
        }
    }

    @Override // o.Pu0
    public final void a(C2534q70 c2534q70, Object obj) {
        String str;
        String str2;
        String str3;
        switch (this.f) {
            case 0:
                if (obj != null && (str = (String) this.h.l(obj)) != null) {
                    c2534q70.a(this.g, str, this.i);
                }
                break;
            case 1:
                if (obj != null && (str2 = (String) this.h.l(obj)) != null) {
                    c2534q70.b(this.g, str2, this.i);
                }
                break;
            default:
                if (obj != null && (str3 = (String) this.h.l(obj)) != null) {
                    c2534q70.d(this.g, str3, this.i);
                }
                break;
        }
    }
}
