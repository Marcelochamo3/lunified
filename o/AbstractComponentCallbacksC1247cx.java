package o;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skidush.clonex.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.cx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractComponentCallbacksC1247cx implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC1283dK, InterfaceC1047au0, InterfaceC1665hB, K90 {
    public static final Object k0 = new Object();
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public C3289xx F;
    public C1442ex G;
    public AbstractComponentCallbacksC1247cx I;
    public int J;
    public int K;
    public String L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean Q;
    public ViewGroup R;
    public View S;
    public boolean T;
    public C1052ax V;
    public boolean W;
    public LayoutInflater X;
    public boolean Y;
    public String Z;
    public TJ a0;
    public C1478fK b0;
    public C1640gy c0;
    public final TS d0;
    public L90 e0;
    public C1797ie0 f0;
    public int g0;
    public final AtomicInteger h0;
    public final ArrayList i0;
    public final C0903Xw j0;
    public Bundle m;
    public SparseArray n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Bundle f728o;
    public Bundle q;
    public AbstractComponentCallbacksC1247cx r;
    public int t;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public int l = -1;
    public String p = UUID.randomUUID().toString();
    public String s = null;
    public Boolean u = null;
    public C3289xx H = new C3289xx();
    public final boolean P = true;
    public boolean U = true;

    public AbstractComponentCallbacksC1247cx() {
        new RunnableC3102w1(10, this);
        this.a0 = TJ.p;
        this.d0 = new TS();
        this.h0 = new AtomicInteger();
        this.i0 = new ArrayList();
        this.j0 = new C0903Xw(this);
        r();
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.g0;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    public void B() {
        this.Q = true;
    }

    public void C() {
        this.Q = true;
    }

    public LayoutInflater D(Bundle bundle) {
        C1442ex c1442ex = this.G;
        if (c1442ex == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        AbstractActivityC1540fx abstractActivityC1540fx = c1442ex.s;
        LayoutInflater layoutInflaterCloneInContext = abstractActivityC1540fx.getLayoutInflater().cloneInContext(abstractActivityC1540fx);
        layoutInflaterCloneInContext.setFactory2(this.H.f);
        return layoutInflaterCloneInContext;
    }

    public void E(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.Q = true;
        C1442ex c1442ex = this.G;
        if ((c1442ex == null ? null : c1442ex.f765o) != null) {
            this.Q = true;
        }
    }

    public void F() {
        this.Q = true;
    }

    public void G() {
        this.Q = true;
    }

    public void I() {
        this.Q = true;
    }

    public void J() {
        this.Q = true;
    }

    public void L(Bundle bundle) {
        this.Q = true;
    }

    public void M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.H.R();
        this.D = true;
        this.c0 = new C1640gy(this, e(), new Jj0(18, this));
        View viewA = A(layoutInflater, viewGroup, bundle);
        this.S = viewA;
        if (viewA == null) {
            if (this.c0.p != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.c0 = null;
            return;
        }
        this.c0.g();
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(this.S);
            toString();
        }
        zy0.C(this.S, this.c0);
        View view = this.S;
        C1640gy c1640gy = this.c0;
        AbstractC1474fG.j(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, c1640gy);
        AbstractC3021v9.B(this.S, this.c0);
        this.d0.d(this.c0);
    }

    public final LayoutInflater N() {
        LayoutInflater layoutInflaterD = D(null);
        this.X = layoutInflaterD;
        return layoutInflaterD;
    }

    public final C0877Ww O(K1 k1, J1 j1) {
        C2133m1 c2133m1 = new C2133m1(27, this);
        if (this.l > 1) {
            throw new IllegalStateException(AbstractC1701hf0.f("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
        }
        AtomicReference atomicReference = new AtomicReference();
        C0955Zw c0955Zw = new C0955Zw(this, c2133m1, atomicReference, k1, j1);
        if (this.l >= 0) {
            c0955Zw.a();
        } else {
            this.i0.add(c0955Zw);
        }
        return new C0877Ww(atomicReference);
    }

    public final AbstractActivityC1540fx P() {
        AbstractActivityC1540fx abstractActivityC1540fxH = h();
        if (abstractActivityC1540fxH != null) {
            return abstractActivityC1540fxH;
        }
        throw new IllegalStateException(AbstractC1701hf0.f("Fragment ", this, " not attached to an activity."));
    }

    public final Context Q() {
        Context contextJ = j();
        if (contextJ != null) {
            return contextJ;
        }
        throw new IllegalStateException(AbstractC1701hf0.f("Fragment ", this, " not attached to a context."));
    }

    public final View R() {
        View view = this.S;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(AbstractC1701hf0.f("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final void S() {
        Bundle bundle;
        Bundle bundle2 = this.m;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.H.X(bundle);
        C3289xx c3289xx = this.H;
        c3289xx.G = false;
        c3289xx.H = false;
        c3289xx.N.g = false;
        c3289xx.u(1);
    }

    public final void T(int i, int i2, int i3, int i4) {
        if (this.V == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        g().b = i;
        g().c = i2;
        g().d = i3;
        g().e = i4;
    }

    public final void U(Bundle bundle) {
        C3289xx c3289xx = this.F;
        if (c3289xx != null) {
            if (c3289xx == null ? false : c3289xx.P()) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.q = bundle;
    }

    public final void V(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (abstractComponentCallbacksC1247cx != null) {
            C0722Qx c0722Qx = AbstractC0748Rx.a;
            AbstractC0748Rx.b(new C0646Nz(this, "Attempting to set target fragment " + abstractComponentCallbacksC1247cx + " with request code 0 for fragment " + this));
            AbstractC0748Rx.a(this).getClass();
            Object obj = EnumC0696Px.f465o;
            if (obj instanceof Void) {
            }
        }
        C3289xx c3289xx = this.F;
        C3289xx c3289xx2 = abstractComponentCallbacksC1247cx != null ? abstractComponentCallbacksC1247cx.F : null;
        if (c3289xx != null && c3289xx2 != null && c3289xx != c3289xx2) {
            throw new IllegalArgumentException(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " must share the same FragmentManager to be set as a target fragment"));
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxP = abstractComponentCallbacksC1247cx; abstractComponentCallbacksC1247cxP != null; abstractComponentCallbacksC1247cxP = abstractComponentCallbacksC1247cxP.p(false)) {
            if (super.equals(this)) {
                throw new IllegalArgumentException("Setting " + abstractComponentCallbacksC1247cx + " as the target of " + this + " would create a target cycle");
            }
        }
        if (abstractComponentCallbacksC1247cx == null) {
            this.s = null;
            this.r = null;
        } else if (this.F == null || abstractComponentCallbacksC1247cx.F == null) {
            this.s = null;
            this.r = abstractComponentCallbacksC1247cx;
        } else {
            this.s = abstractComponentCallbacksC1247cx.p;
            this.r = null;
        }
        this.t = 0;
    }

    @Override // o.K90
    public final K3 a() {
        return (K3) this.f0.f832o;
    }

    public zy0 b() {
        return new C0929Yw(this);
    }

    @Override // o.InterfaceC1665hB
    public final Yt0 c() {
        Application application;
        if (this.F == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.e0 == null) {
            Context applicationContext = Q().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(Q().getApplicationContext());
            }
            this.e0 = new L90(application, this, this.q);
        }
        return this.e0;
    }

    @Override // o.InterfaceC1665hB
    public final SS d() {
        Application application;
        Context applicationContext = Q().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(Q().getApplicationContext());
        }
        SS ss = new SS(0);
        LinkedHashMap linkedHashMap = ss.a;
        if (application != null) {
            linkedHashMap.put(Xt0.e, application);
        }
        linkedHashMap.put(AbstractC1474fG.f, this);
        linkedHashMap.put(AbstractC1474fG.g, this);
        Bundle bundle = this.q;
        if (bundle != null) {
            linkedHashMap.put(AbstractC1474fG.h, bundle);
        }
        return ss;
    }

    @Override // o.InterfaceC1047au0
    public final Zt0 e() {
        if (this.F == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (k() == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.F.N.d;
        Zt0 zt0 = (Zt0) map.get(this.p);
        if (zt0 != null) {
            return zt0;
        }
        Zt0 zt1 = new Zt0();
        map.put(this.p, zt1);
        return zt1;
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // o.InterfaceC1283dK
    public final C1478fK f() {
        return this.b0;
    }

    public final C1052ax g() {
        if (this.V == null) {
            C1052ax c1052ax = new C1052ax();
            c1052ax.g = null;
            Object obj = k0;
            c1052ax.h = obj;
            c1052ax.i = null;
            c1052ax.j = obj;
            c1052ax.k = obj;
            c1052ax.l = 1.0f;
            c1052ax.m = null;
            this.V = c1052ax;
        }
        return this.V;
    }

    public final AbstractActivityC1540fx h() {
        C1442ex c1442ex = this.G;
        if (c1442ex == null) {
            return null;
        }
        return (AbstractActivityC1540fx) c1442ex.f765o;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final C3289xx i() {
        if (this.G != null) {
            return this.H;
        }
        throw new IllegalStateException(AbstractC1701hf0.f("Fragment ", this, " has not been attached yet."));
    }

    public Context j() {
        C1442ex c1442ex = this.G;
        if (c1442ex == null) {
            return null;
        }
        return c1442ex.p;
    }

    public final int k() {
        TJ tj = this.a0;
        return (tj == TJ.m || this.I == null) ? tj.ordinal() : Math.min(tj.ordinal(), this.I.k());
    }

    public final C3289xx l() {
        C3289xx c3289xx = this.F;
        if (c3289xx != null) {
            return c3289xx;
        }
        throw new IllegalStateException(AbstractC1701hf0.f("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources m() {
        return Q().getResources();
    }

    public final String n(int i) {
        return m().getString(i);
    }

    public final String o(int i, Object... objArr) {
        return m().getString(i, objArr);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.Q = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        P().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.Q = true;
    }

    public final AbstractComponentCallbacksC1247cx p(boolean z) {
        String str;
        if (z) {
            C0722Qx c0722Qx = AbstractC0748Rx.a;
            AbstractC0748Rx.b(new C0646Nz(this, "Attempting to get target fragment from fragment " + this));
            AbstractC0748Rx.a(this).getClass();
            Object obj = EnumC0696Px.f465o;
            if (obj instanceof Void) {
            }
        }
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.r;
        if (abstractComponentCallbacksC1247cx != null) {
            return abstractComponentCallbacksC1247cx;
        }
        C3289xx c3289xx = this.F;
        if (c3289xx == null || (str = this.s) == null) {
            return null;
        }
        return c3289xx.c.o(str);
    }

    public final C1640gy q() {
        C1640gy c1640gy = this.c0;
        if (c1640gy != null) {
            return c1640gy;
        }
        throw new IllegalStateException(AbstractC1701hf0.f("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void r() {
        this.b0 = new C1478fK(this);
        this.f0 = new C1797ie0(this);
        this.e0 = null;
        ArrayList arrayList = this.i0;
        C0903Xw c0903Xw = this.j0;
        if (arrayList.contains(c0903Xw)) {
            return;
        }
        if (this.l >= 0) {
            c0903Xw.a();
        } else {
            arrayList.add(c0903Xw);
        }
    }

    public final void s() {
        r();
        this.Z = this.p;
        this.p = UUID.randomUUID().toString();
        this.v = false;
        this.w = false;
        this.z = false;
        this.A = false;
        this.C = false;
        this.E = 0;
        this.F = null;
        this.H = new C3289xx();
        this.G = null;
        this.J = 0;
        this.K = 0;
        this.L = null;
        this.M = false;
        this.N = false;
    }

    public final boolean t() {
        return this.G != null && this.v;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.p);
        if (this.J != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.J));
        }
        if (this.L != null) {
            sb.append(" tag=");
            sb.append(this.L);
        }
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        if (!this.M) {
            C3289xx c3289xx = this.F;
            if (c3289xx == null) {
                return false;
            }
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.I;
            c3289xx.getClass();
            if (!(abstractComponentCallbacksC1247cx == null ? false : abstractComponentCallbacksC1247cx.u())) {
                return false;
            }
        }
        return true;
    }

    public final boolean v() {
        return this.E > 0;
    }

    public final boolean w() {
        View view;
        return (!t() || u() || (view = this.S) == null || view.getWindowToken() == null || this.S.getVisibility() != 0) ? false : true;
    }

    public void x() {
        this.Q = true;
    }

    public void y(Context context) {
        this.Q = true;
        C1442ex c1442ex = this.G;
        if ((c1442ex == null ? null : c1442ex.f765o) != null) {
            this.Q = true;
        }
    }

    public void z(Bundle bundle) {
        this.Q = true;
        S();
        C3289xx c3289xx = this.H;
        if (c3289xx.u >= 1) {
            return;
        }
        c3289xx.G = false;
        c3289xx.H = false;
        c3289xx.N.g = false;
        c3289xx.u(1);
    }

    public void H(Bundle bundle) {
    }

    public void K(View view, Bundle bundle) {
    }
}
