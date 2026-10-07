package o;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class DT implements InterfaceC1283dK, InterfaceC1047au0, InterfaceC1665hB, K90 {
    public final Context l;
    public TT m;
    public final Bundle n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TJ f214o;
    public final LT p;
    public final String q;
    public final Bundle r;
    public final C1478fK s = new C1478fK(this);
    public final C1797ie0 t = new C1797ie0(this);
    public boolean u;
    public TJ v;
    public final L90 w;

    public DT(Context context, TT tt, Bundle bundle, TJ tj, LT lt, String str, Bundle bundle2) {
        this.l = context;
        this.m = tt;
        this.n = bundle;
        this.f214o = tj;
        this.p = lt;
        this.q = str;
        this.r = bundle2;
        Rh0 rh0 = new Rh0(new io.sentry.android.replay.f(11, this));
        this.v = TJ.m;
        this.w = (L90) rh0.getValue();
    }

    @Override // o.K90
    public final K3 a() {
        return (K3) this.t.f832o;
    }

    public final Bundle b() {
        Bundle bundle = this.n;
        if (bundle == null) {
            return null;
        }
        return new Bundle(bundle);
    }

    @Override // o.InterfaceC1665hB
    public final Yt0 c() {
        return this.w;
    }

    @Override // o.InterfaceC1665hB
    public final SS d() {
        SS ss = new SS(0);
        Context context = this.l;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
        LinkedHashMap linkedHashMap = ss.a;
        if (application != null) {
            linkedHashMap.put(Xt0.e, application);
        }
        linkedHashMap.put(AbstractC1474fG.f, this);
        linkedHashMap.put(AbstractC1474fG.g, this);
        Bundle bundleB = b();
        if (bundleB != null) {
            linkedHashMap.put(AbstractC1474fG.h, bundleB);
        }
        return ss;
    }

    @Override // o.InterfaceC1047au0
    public final Zt0 e() {
        if (!this.u) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
        if (this.s.d == TJ.l) {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
        }
        LT lt = this.p;
        if (lt == null) {
            throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
        }
        String str = this.q;
        AbstractC1474fG.j(str, "backStackEntryId");
        LinkedHashMap linkedHashMap = lt.b;
        Zt0 zt0 = (Zt0) linkedHashMap.get(str);
        if (zt0 != null) {
            return zt0;
        }
        Zt0 zt1 = new Zt0();
        linkedHashMap.put(str, zt1);
        return zt1;
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        if (obj == null || !(obj instanceof DT)) {
            return false;
        }
        DT dt = (DT) obj;
        if (!AbstractC1474fG.b(this.q, dt.q) || !AbstractC1474fG.b(this.m, dt.m) || !AbstractC1474fG.b(this.s, dt.s) || !AbstractC1474fG.b((K3) this.t.f832o, (K3) dt.t.f832o)) {
            return false;
        }
        Bundle bundle = this.n;
        Bundle bundle2 = dt.n;
        if (!AbstractC1474fG.b(bundle, bundle2)) {
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            if (!setKeySet.isEmpty()) {
                for (String str : setKeySet) {
                    if (!AbstractC1474fG.b(bundle.get(str), bundle2 != null ? bundle2.get(str) : null)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // o.InterfaceC1283dK
    public final C1478fK f() {
        return this.s;
    }

    public final void g(TJ tj) {
        AbstractC1474fG.j(tj, "maxState");
        this.v = tj;
        h();
    }

    public final void h() {
        if (!this.u) {
            C1797ie0 c1797ie0 = this.t;
            c1797ie0.g();
            this.u = true;
            if (this.p != null) {
                AbstractC1474fG.n(this);
            }
            c1797ie0.h(this.r);
        }
        int iOrdinal = this.f214o.ordinal();
        int iOrdinal2 = this.v.ordinal();
        C1478fK c1478fK = this.s;
        if (iOrdinal < iOrdinal2) {
            c1478fK.g(this.f214o);
        } else {
            c1478fK.g(this.v);
        }
    }

    public final int hashCode() {
        Set<String> setKeySet;
        int iHashCode = this.m.hashCode() + (this.q.hashCode() * 31);
        Bundle bundle = this.n;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                int i = iHashCode * 31;
                Object obj = bundle.get((String) it.next());
                iHashCode = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return ((K3) this.t.f832o).hashCode() + ((this.s.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DT.class.getSimpleName());
        sb.append("(" + this.q + ')');
        sb.append(" destination=");
        sb.append(this.m);
        String string = sb.toString();
        AbstractC1474fG.i(string, "sb.toString()");
        return string;
    }
}
