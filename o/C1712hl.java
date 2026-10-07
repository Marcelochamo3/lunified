package o;

import androidx.lifecycle.DefaultLifecycleObserver;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: o.hl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1712hl implements ZJ {
    public final /* synthetic */ int l = 0;
    public final Object m;
    public final Object n;

    public C1712hl(DefaultLifecycleObserver defaultLifecycleObserver, ZJ zj) {
        AbstractC1474fG.j(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.m = defaultLifecycleObserver;
        this.n = zj;
    }

    @Override // o.ZJ
    public final void a(InterfaceC1283dK interfaceC1283dK, SJ sj) {
        switch (this.l) {
            case 0:
                int i = AbstractC1614gl.a[sj.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.m;
                switch (i) {
                    case 1:
                        defaultLifecycleObserver.onCreate(interfaceC1283dK);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(interfaceC1283dK);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(interfaceC1283dK);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(interfaceC1283dK);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(interfaceC1283dK);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(interfaceC1283dK);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                ZJ zj = (ZJ) this.n;
                if (zj != null) {
                    zj.a(interfaceC1283dK, sj);
                    return;
                }
                return;
            case 1:
                if (sj == SJ.ON_START) {
                    ((C1478fK) this.m).f(this);
                    ((K3) this.n).g();
                    return;
                }
                return;
            default:
                HashMap map = ((C2960ue) this.n).a;
                List list = (List) map.get(sj);
                Object obj = this.m;
                C2960ue.a(list, interfaceC1283dK, sj, obj);
                C2960ue.a((List) map.get(SJ.ON_ANY), interfaceC1283dK, sj, obj);
                return;
        }
    }

    public C1712hl(Object obj) {
        this.m = obj;
        C3154we c3154we = C3154we.c;
        Class<?> cls = obj.getClass();
        C2960ue c2960ue = (C2960ue) c3154we.a.get(cls);
        this.n = c2960ue == null ? c3154we.a(cls, null) : c2960ue;
    }

    public C1712hl(K3 k3, C1478fK c1478fK) {
        this.m = c1478fK;
        this.n = k3;
    }
}
