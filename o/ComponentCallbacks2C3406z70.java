package o;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: o.z70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3406z70 implements ComponentCallbacks2, InterfaceC1088bK {
    public static final B70 v;
    public final com.bumptech.glide.a l;
    public final Context m;
    public final UJ n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1797ie0 f1147o;
    public final C0519Jb p;
    public final C2969ui0 q;
    public final RunnableC3102w1 r;
    public final InterfaceC3061vg s;
    public final CopyOnWriteArrayList t;
    public B70 u;

    static {
        B70 b70 = (B70) new B70().e(Bitmap.class);
        b70.E = true;
        v = b70;
        ((B70) new B70().e(C0672Oz.class)).E = true;
    }

    public ComponentCallbacks2C3406z70(com.bumptech.glide.a aVar, UJ uj, C0519Jb c0519Jb, Context context) {
        C1797ie0 c1797ie0 = new C1797ie0(6);
        C0519Jb c0519Jb2 = aVar.r;
        this.q = new C2969ui0();
        RunnableC3102w1 runnableC3102w1 = new RunnableC3102w1(19, this);
        this.r = runnableC3102w1;
        this.l = aVar;
        this.n = uj;
        this.p = c0519Jb;
        this.f1147o = c1797ie0;
        this.m = context;
        Context applicationContext = context.getApplicationContext();
        C3309y70 c3309y70 = new C3309y70(this, c1797ie0);
        c0519Jb2.getClass();
        boolean z = AbstractC1459f50.k(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        InterfaceC3061vg c2488pk = z ? new C2488pk(applicationContext, c3309y70) : new C2269nV();
        this.s = c2488pk;
        synchronized (aVar.s) {
            if (aVar.s.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.s.add(this);
        }
        char[] cArr = Kr0.a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            Kr0.f().post(runnableC3102w1);
        } else {
            uj.c(this);
        }
        uj.c(c2488pk);
        this.t = new CopyOnWriteArrayList(aVar.f34o.e);
        q(aVar.f34o.a());
    }

    @Override // o.InterfaceC1088bK
    public final synchronized void b() {
        this.q.b();
        o();
    }

    @Override // o.InterfaceC1088bK
    public final synchronized void j() {
        p();
        this.q.j();
    }

    @Override // o.InterfaceC1088bK
    public final synchronized void k() {
        this.q.k();
        m();
        C1797ie0 c1797ie0 = this.f1147o;
        Iterator it = Kr0.e((Set) c1797ie0.n).iterator();
        while (it.hasNext()) {
            c1797ie0.c((InterfaceC2049l70) it.next());
        }
        ((HashSet) c1797ie0.f832o).clear();
        this.n.j(this);
        this.n.j(this.s);
        Kr0.f().removeCallbacks(this.r);
        this.l.d(this);
    }

    public final void l(InterfaceC2872ti0 interfaceC2872ti0) {
        if (interfaceC2872ti0 == null) {
            return;
        }
        boolean zR = r(interfaceC2872ti0);
        InterfaceC2049l70 interfaceC2049l70E = interfaceC2872ti0.e();
        if (zR) {
            return;
        }
        com.bumptech.glide.a aVar = this.l;
        synchronized (aVar.s) {
            try {
                Iterator it = aVar.s.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C3406z70) it.next()).r(interfaceC2872ti0)) {
                    }
                }
                if (interfaceC2049l70E != null) {
                    interfaceC2872ti0.c(null);
                    interfaceC2049l70E.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void m() {
        try {
            Iterator it = Kr0.e(this.q.l).iterator();
            while (it.hasNext()) {
                l((InterfaceC2872ti0) it.next());
            }
            this.q.l.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C2630r70 n(String str) {
        return new C2630r70(this.l, this, Drawable.class, this.m).J(str);
    }

    public final synchronized void o() {
        C1797ie0 c1797ie0 = this.f1147o;
        c1797ie0.m = true;
        for (InterfaceC2049l70 interfaceC2049l70 : Kr0.e((Set) c1797ie0.n)) {
            if (interfaceC2049l70.isRunning()) {
                interfaceC2049l70.f();
                ((HashSet) c1797ie0.f832o).add(interfaceC2049l70);
            }
        }
    }

    public final synchronized void p() {
        C1797ie0 c1797ie0 = this.f1147o;
        c1797ie0.m = false;
        for (InterfaceC2049l70 interfaceC2049l70 : Kr0.e((Set) c1797ie0.n)) {
            if (!interfaceC2049l70.k() && !interfaceC2049l70.isRunning()) {
                interfaceC2049l70.i();
            }
        }
        ((HashSet) c1797ie0.f832o).clear();
    }

    public final synchronized void q(B70 b70) {
        B70 b71 = (B70) b70.clone();
        if (b71.E && !b71.G) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        b71.G = true;
        b71.E = true;
        this.u = b71;
    }

    public final synchronized boolean r(InterfaceC2872ti0 interfaceC2872ti0) {
        InterfaceC2049l70 interfaceC2049l70E = interfaceC2872ti0.e();
        if (interfaceC2049l70E == null) {
            return true;
        }
        if (!this.f1147o.c(interfaceC2049l70E)) {
            return false;
        }
        this.q.l.remove(interfaceC2872ti0);
        interfaceC2872ti0.c(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f1147o + ", treeNode=" + this.p + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
