package o;

import android.util.Log;
import android.view.ViewGroup;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.wf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3157wf0 {
    public int a;
    public int b;
    public final AbstractComponentCallbacksC1247cx c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final C0670Ox l;

    public C3157wf0(int i, int i2, C0670Ox c0670Ox) {
        AbstractC1701hf0.q(i, "finalState");
        AbstractC1701hf0.q(i2, "lifecycleImpact");
        AbstractC1474fG.j(c0670Ox, "fragmentStateManager");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
        AbstractC1474fG.i(abstractComponentCallbacksC1247cx, "fragmentStateManager.fragment");
        AbstractC1701hf0.q(i, "finalState");
        AbstractC1701hf0.q(i2, "lifecycleImpact");
        this.a = i;
        this.b = i2;
        this.c = abstractComponentCallbacksC1247cx;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = c0670Ox;
    }

    public final void a(ViewGroup viewGroup) {
        AbstractC1474fG.j(viewGroup, "container");
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (AbstractC3060vf0 abstractC3060vf0 : AbstractC0911Ye.x0(this.k)) {
            abstractC3060vf0.getClass();
            if (!abstractC3060vf0.b) {
                abstractC3060vf0.b(viewGroup);
            }
            abstractC3060vf0.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.x = false;
        this.l.k();
    }

    public final void c(AbstractC3060vf0 abstractC3060vf0) {
        AbstractC1474fG.j(abstractC3060vf0, "effect");
        ArrayList arrayList = this.j;
        if (arrayList.remove(abstractC3060vf0) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i, int i2) {
        AbstractC1701hf0.q(i, "finalState");
        AbstractC1701hf0.q(i2, "lifecycleImpact");
        int iW = AbstractC1701hf0.w(i2);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (iW == 0) {
            if (this.a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC1247cx);
                    AbstractC1674hK.x(i);
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iW != 1) {
            if (iW != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC1247cx);
            }
            this.a = 1;
            this.b = 3;
            this.i = true;
            return;
        }
        if (this.a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC1247cx);
            }
            this.a = 2;
            this.b = 2;
            this.i = true;
        }
    }

    public final String toString() {
        StringBuilder sbL = AbstractC1701hf0.l("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbL.append(AbstractC1674hK.z(this.a));
        sbL.append(" lifecycleImpact = ");
        sbL.append(AbstractC1674hK.y(this.b));
        sbL.append(" fragment = ");
        sbL.append(this.c);
        sbL.append('}');
        return sbL.toString();
    }
}
