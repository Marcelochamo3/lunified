package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.dy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1346dy extends Dm0 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c = null;
    public final /* synthetic */ ArrayList d = null;
    public final /* synthetic */ Object e = null;
    public final /* synthetic */ ArrayList f = null;
    public final /* synthetic */ C1542fy g;

    public C1346dy(C1542fy c1542fy, Object obj, ArrayList arrayList) {
        this.g = c1542fy;
        this.a = obj;
        this.b = arrayList;
    }

    @Override // o.Dm0, o.Bm0
    public final void f(Cm0 cm0) {
        cm0.E(this);
    }

    @Override // o.Dm0, o.Bm0
    public final void g(Cm0 cm0) {
        C1542fy c1542fy = this.g;
        Object obj = this.a;
        if (obj != null) {
            c1542fy.u(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            c1542fy.u(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            c1542fy.u(obj3, this.f, null);
        }
    }
}
