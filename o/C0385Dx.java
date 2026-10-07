package o;

/* JADX INFO: renamed from: o.Dx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0385Dx implements ZJ {
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ C0385Dx(int i, Object obj) {
        this.l = i;
        this.m = obj;
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        switch (this.l) {
            case 0:
                C0567Kx c0567Kx = (C0567Kx) this.m;
                AbstractC1474fG.j(c0567Kx, "this$0");
                if (sj == SJ.ON_DESTROY) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = (AbstractComponentCallbacksC1247cx) interfaceC1283dK;
                    Object obj = null;
                    for (Object obj2 : (Iterable) c0567Kx.b().f.l.getValue()) {
                        if (AbstractC1474fG.b(((DT) obj2).q, abstractComponentCallbacksC1247cx.L)) {
                            obj = obj2;
                        }
                    }
                    DT dt = (DT) obj;
                    if (dt != null) {
                        if (C0567Kx.n()) {
                            dt.toString();
                            interfaceC1283dK.toString();
                        }
                        c0567Kx.b().b(dt);
                    }
                }
                break;
            case 1:
                YT yt = (YT) this.m;
                AbstractC1474fG.j(yt, "this$0");
                yt.q = sj.a();
                if (yt.c != null) {
                    for (DT dt2 : yt.g) {
                        dt2.getClass();
                        dt2.f214o = sj.a();
                        dt2.h();
                    }
                }
                break;
            default:
                K3 k3 = (K3) this.m;
                AbstractC1474fG.j(k3, "this$0");
                if (sj == SJ.ON_START) {
                    k3.e = true;
                } else if (sj == SJ.ON_STOP) {
                    k3.e = false;
                }
                break;
        }
    }
}
