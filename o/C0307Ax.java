package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0307Ax extends Ut0 {
    public static final C3483zx h = new C3483zx(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public C0307Ax(boolean z) {
        this.e = z;
    }

    @Override // o.Ut0
    public final void d() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        this.f = true;
    }

    public final void e(String str, boolean z) {
        HashMap map = this.c;
        C0307Ax c0307Ax = (C0307Ax) map.get(str);
        if (c0307Ax != null) {
            if (z) {
                ArrayList<String> arrayList = new ArrayList();
                arrayList.addAll(c0307Ax.c.keySet());
                for (String str2 : arrayList) {
                    Log.isLoggable("FragmentManager", 3);
                    c0307Ax.e(str2, true);
                }
            }
            c0307Ax.d();
            map.remove(str);
        }
        HashMap map2 = this.d;
        Zt0 zt0 = (Zt0) map2.get(str);
        if (zt0 != null) {
            zt0.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0307Ax.class != obj.getClass()) {
            return false;
        }
        C0307Ax c0307Ax = (C0307Ax) obj;
        return this.b.equals(c0307Ax.b) && this.c.equals(c0307Ax.c) && this.d.equals(c0307Ax.d);
    }

    public final void f(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (this.g) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            if (this.b.remove(abstractComponentCallbacksC1247cx.p) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            abstractComponentCallbacksC1247cx.toString();
        }
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
