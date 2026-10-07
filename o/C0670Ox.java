package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.FragmentContainerView;
import com.skidush.clonex.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.Ox, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0670Ox {
    public final C2994uv a;
    public final C1583gR b;
    public final AbstractComponentCallbacksC1247cx c;
    public boolean d = false;
    public int e = -1;

    public C0670Ox(C2994uv c2994uv, C1583gR c1583gR, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        this.a = c2994uv;
        this.b = c1583gR;
        this.c = abstractComponentCallbacksC1247cx;
    }

    public final void a() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        Bundle bundle = abstractComponentCallbacksC1247cx.m;
        if (bundle != null) {
            bundle.getBundle("savedInstanceState");
        }
        abstractComponentCallbacksC1247cx.H.R();
        abstractComponentCallbacksC1247cx.l = 3;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.x();
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onActivityCreated()"));
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            abstractComponentCallbacksC1247cx.toString();
        }
        if (abstractComponentCallbacksC1247cx.S != null) {
            Bundle bundle2 = abstractComponentCallbacksC1247cx.m;
            Bundle bundle3 = bundle2 != null ? bundle2.getBundle("savedInstanceState") : null;
            SparseArray<Parcelable> sparseArray = abstractComponentCallbacksC1247cx.n;
            if (sparseArray != null) {
                abstractComponentCallbacksC1247cx.S.restoreHierarchyState(sparseArray);
                abstractComponentCallbacksC1247cx.n = null;
            }
            abstractComponentCallbacksC1247cx.Q = false;
            abstractComponentCallbacksC1247cx.L(bundle3);
            if (!abstractComponentCallbacksC1247cx.Q) {
                throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onViewStateRestored()"));
            }
            if (abstractComponentCallbacksC1247cx.S != null) {
                abstractComponentCallbacksC1247cx.c0.b(SJ.ON_CREATE);
            }
        }
        abstractComponentCallbacksC1247cx.m = null;
        C3289xx c3289xx = abstractComponentCallbacksC1247cx.H;
        c3289xx.G = false;
        c3289xx.H = false;
        c3289xx.N.g = false;
        c3289xx.u(4);
        this.a.v(abstractComponentCallbacksC1247cx, false);
    }

    public final void b() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx;
        View view;
        View view2;
        int iIndexOfChild = -1;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = this.c;
        View view3 = abstractComponentCallbacksC1247cx2.R;
        while (true) {
            abstractComponentCallbacksC1247cx = null;
            if (view3 == null) {
                break;
            }
            Object tag = view3.getTag(R.id.fragment_container_view_tag);
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx3 = tag instanceof AbstractComponentCallbacksC1247cx ? (AbstractComponentCallbacksC1247cx) tag : null;
            if (abstractComponentCallbacksC1247cx3 != null) {
                abstractComponentCallbacksC1247cx = abstractComponentCallbacksC1247cx3;
                break;
            } else {
                Object parent = view3.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx4 = abstractComponentCallbacksC1247cx2.I;
        if (abstractComponentCallbacksC1247cx != null && !abstractComponentCallbacksC1247cx.equals(abstractComponentCallbacksC1247cx4)) {
            int i = abstractComponentCallbacksC1247cx2.K;
            C0722Qx c0722Qx = AbstractC0748Rx.a;
            StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
            sb.append(abstractComponentCallbacksC1247cx2);
            sb.append(" within the view of parent fragment ");
            sb.append(abstractComponentCallbacksC1247cx);
            sb.append(" via container with ID ");
            AbstractC0748Rx.b(new C0618Mx(abstractComponentCallbacksC1247cx2, AbstractC1701hf0.g(sb, i, " without using parent's childFragmentManager")));
            AbstractC0748Rx.a(abstractComponentCallbacksC1247cx2).getClass();
            Object obj = EnumC0696Px.n;
            if (obj instanceof Void) {
            }
        }
        C1583gR c1583gR = this.b;
        c1583gR.getClass();
        ViewGroup viewGroup = abstractComponentCallbacksC1247cx2.R;
        if (viewGroup != null) {
            ArrayList arrayList = (ArrayList) c1583gR.m;
            int iIndexOf = arrayList.indexOf(abstractComponentCallbacksC1247cx2);
            for (int i2 = iIndexOf - 1; i2 >= 0; i2--) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx5 = (AbstractComponentCallbacksC1247cx) arrayList.get(i2);
                if (abstractComponentCallbacksC1247cx5.R == viewGroup && (view2 = abstractComponentCallbacksC1247cx5.S) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view2) + 1;
                }
            }
            while (true) {
                iIndexOf++;
                if (iIndexOf >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx6 = (AbstractComponentCallbacksC1247cx) arrayList.get(iIndexOf);
                if (abstractComponentCallbacksC1247cx6.R == viewGroup && (view = abstractComponentCallbacksC1247cx6.S) != null) {
                    iIndexOfChild = viewGroup.indexOfChild(view);
                    break;
                }
            }
        }
        abstractComponentCallbacksC1247cx2.R.addView(abstractComponentCallbacksC1247cx2.S, iIndexOfChild);
    }

    public final void c() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = abstractComponentCallbacksC1247cx.r;
        C0670Ox c0670Ox = null;
        C1583gR c1583gR = this.b;
        if (abstractComponentCallbacksC1247cx2 != null) {
            C0670Ox c0670Ox2 = (C0670Ox) ((HashMap) c1583gR.n).get(abstractComponentCallbacksC1247cx2.p);
            if (c0670Ox2 == null) {
                throw new IllegalStateException("Fragment " + abstractComponentCallbacksC1247cx + " declared target fragment " + abstractComponentCallbacksC1247cx.r + " that does not belong to this FragmentManager!");
            }
            abstractComponentCallbacksC1247cx.s = abstractComponentCallbacksC1247cx.r.p;
            abstractComponentCallbacksC1247cx.r = null;
            c0670Ox = c0670Ox2;
        } else {
            String str = abstractComponentCallbacksC1247cx.s;
            if (str != null && (c0670Ox = (C0670Ox) ((HashMap) c1583gR.n).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(abstractComponentCallbacksC1247cx);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(AbstractC1701hf0.h(sb, abstractComponentCallbacksC1247cx.s, " that does not belong to this FragmentManager!"));
            }
        }
        if (c0670Ox != null) {
            c0670Ox.k();
        }
        C3289xx c3289xx = abstractComponentCallbacksC1247cx.F;
        abstractComponentCallbacksC1247cx.G = c3289xx.v;
        abstractComponentCallbacksC1247cx.I = c3289xx.x;
        C2994uv c2994uv = this.a;
        c2994uv.M(abstractComponentCallbacksC1247cx, false);
        ArrayList arrayList = abstractComponentCallbacksC1247cx.i0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1150bx) it.next()).a();
        }
        arrayList.clear();
        abstractComponentCallbacksC1247cx.H.b(abstractComponentCallbacksC1247cx.G, abstractComponentCallbacksC1247cx.b(), abstractComponentCallbacksC1247cx);
        abstractComponentCallbacksC1247cx.l = 0;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.y(abstractComponentCallbacksC1247cx.G.p);
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onAttach()"));
        }
        C3289xx c3289xx2 = abstractComponentCallbacksC1247cx.F;
        Iterator it2 = c3289xx2.f1127o.iterator();
        while (it2.hasNext()) {
            ((InterfaceC0592Lx) it2.next()).b(c3289xx2, abstractComponentCallbacksC1247cx);
        }
        C3289xx c3289xx3 = abstractComponentCallbacksC1247cx.H;
        c3289xx3.G = false;
        c3289xx3.H = false;
        c3289xx3.N.g = false;
        c3289xx3.u(0);
        c2994uv.w(abstractComponentCallbacksC1247cx, false);
    }

    public final int d() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (abstractComponentCallbacksC1247cx.F == null) {
            return abstractComponentCallbacksC1247cx.l;
        }
        int iMin = this.e;
        int iOrdinal = abstractComponentCallbacksC1247cx.a0.ordinal();
        int i = 0;
        if (iOrdinal == 1) {
            iMin = Math.min(iMin, 0);
        } else if (iOrdinal == 2) {
            iMin = Math.min(iMin, 1);
        } else if (iOrdinal == 3) {
            iMin = Math.min(iMin, 5);
        } else if (iOrdinal != 4) {
            iMin = Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC1247cx.z) {
            if (abstractComponentCallbacksC1247cx.A) {
                iMin = Math.max(this.e, 2);
                View view = abstractComponentCallbacksC1247cx.S;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.e < 4 ? Math.min(iMin, abstractComponentCallbacksC1247cx.l) : Math.min(iMin, 1);
            }
        }
        if (abstractComponentCallbacksC1247cx.B && abstractComponentCallbacksC1247cx.R == null) {
            iMin = Math.min(iMin, 4);
        }
        if (!abstractComponentCallbacksC1247cx.v) {
            iMin = Math.min(iMin, 1);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1247cx.R;
        if (viewGroup != null) {
            C0581Ll c0581LlI = C0581Ll.i(viewGroup, abstractComponentCallbacksC1247cx.l());
            c0581LlI.getClass();
            C3157wf0 c3157wf0F = c0581LlI.f(abstractComponentCallbacksC1247cx);
            int i2 = c3157wf0F != null ? c3157wf0F.b : 0;
            C3157wf0 c3157wf0G = c0581LlI.g(abstractComponentCallbacksC1247cx);
            i = c3157wf0G != null ? c3157wf0G.b : 0;
            int i3 = i2 == 0 ? -1 : AbstractC3254xf0.a[AbstractC1701hf0.w(i2)];
            if (i3 != -1 && i3 != 1) {
                i = i2;
            }
        }
        if (i == 2) {
            iMin = Math.min(iMin, 6);
        } else if (i == 3) {
            iMin = Math.max(iMin, 3);
        } else if (abstractComponentCallbacksC1247cx.w) {
            iMin = abstractComponentCallbacksC1247cx.v() ? Math.min(iMin, 1) : Math.min(iMin, -1);
        }
        if (abstractComponentCallbacksC1247cx.T && abstractComponentCallbacksC1247cx.l < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (abstractComponentCallbacksC1247cx.x) {
            iMin = Math.max(iMin, 3);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        return iMin;
    }

    public final void e() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        Bundle bundle = abstractComponentCallbacksC1247cx.m;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        if (abstractComponentCallbacksC1247cx.Y) {
            abstractComponentCallbacksC1247cx.l = 1;
            abstractComponentCallbacksC1247cx.S();
            return;
        }
        C2994uv c2994uv = this.a;
        c2994uv.N(abstractComponentCallbacksC1247cx, false);
        abstractComponentCallbacksC1247cx.H.R();
        abstractComponentCallbacksC1247cx.l = 1;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.b0.a(new I50(3, abstractComponentCallbacksC1247cx));
        abstractComponentCallbacksC1247cx.z(bundle2);
        abstractComponentCallbacksC1247cx.Y = true;
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onCreate()"));
        }
        abstractComponentCallbacksC1247cx.b0.d(SJ.ON_CREATE);
        c2994uv.z(abstractComponentCallbacksC1247cx, false);
    }

    public final void f() {
        String resourceName;
        int i = 2;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (abstractComponentCallbacksC1247cx.z) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        Bundle bundle = abstractComponentCallbacksC1247cx.m;
        Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
        LayoutInflater layoutInflaterD = abstractComponentCallbacksC1247cx.D(bundle2);
        abstractComponentCallbacksC1247cx.X = layoutInflaterD;
        ViewGroup viewGroup = abstractComponentCallbacksC1247cx.R;
        if (viewGroup == null) {
            int i2 = abstractComponentCallbacksC1247cx.K;
            if (i2 == 0) {
                viewGroup = null;
            } else {
                if (i2 == -1) {
                    throw new IllegalArgumentException(AbstractC1701hf0.f("Cannot create fragment ", abstractComponentCallbacksC1247cx, " for a container view with no id"));
                }
                viewGroup = (ViewGroup) abstractComponentCallbacksC1247cx.F.w.v(i2);
                if (viewGroup == null) {
                    if (!abstractComponentCallbacksC1247cx.C && !abstractComponentCallbacksC1247cx.B) {
                        try {
                            resourceName = abstractComponentCallbacksC1247cx.m().getResourceName(abstractComponentCallbacksC1247cx.K);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(abstractComponentCallbacksC1247cx.K) + " (" + resourceName + ") for fragment " + abstractComponentCallbacksC1247cx);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    C0722Qx c0722Qx = AbstractC0748Rx.a;
                    AbstractC0748Rx.b(new C0618Mx(abstractComponentCallbacksC1247cx, "Attempting to add fragment " + abstractComponentCallbacksC1247cx + " to container " + viewGroup + " which is not a FragmentContainerView"));
                    AbstractC0748Rx.a(abstractComponentCallbacksC1247cx).getClass();
                    Object obj = EnumC0696Px.p;
                    if (obj instanceof Void) {
                    }
                }
            }
        }
        abstractComponentCallbacksC1247cx.R = viewGroup;
        abstractComponentCallbacksC1247cx.M(layoutInflaterD, viewGroup, bundle2);
        if (abstractComponentCallbacksC1247cx.S != null) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC1247cx);
            }
            abstractComponentCallbacksC1247cx.S.setSaveFromParentEnabled(false);
            abstractComponentCallbacksC1247cx.S.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1247cx);
            if (viewGroup != null) {
                b();
            }
            if (abstractComponentCallbacksC1247cx.M) {
                abstractComponentCallbacksC1247cx.S.setVisibility(8);
            }
            if (abstractComponentCallbacksC1247cx.S.isAttachedToWindow()) {
                View view = abstractComponentCallbacksC1247cx.S;
                WeakHashMap weakHashMap = It0.a;
                AbstractC2991ut0.c(view);
            } else {
                View view2 = abstractComponentCallbacksC1247cx.S;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0674Pb(i, view2));
            }
            Bundle bundle3 = abstractComponentCallbacksC1247cx.m;
            abstractComponentCallbacksC1247cx.K(abstractComponentCallbacksC1247cx.S, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
            abstractComponentCallbacksC1247cx.H.u(2);
            this.a.S(abstractComponentCallbacksC1247cx, abstractComponentCallbacksC1247cx.S, false);
            int visibility = abstractComponentCallbacksC1247cx.S.getVisibility();
            abstractComponentCallbacksC1247cx.g().l = abstractComponentCallbacksC1247cx.S.getAlpha();
            if (abstractComponentCallbacksC1247cx.R != null && visibility == 0) {
                View viewFindFocus = abstractComponentCallbacksC1247cx.S.findFocus();
                if (viewFindFocus != null) {
                    abstractComponentCallbacksC1247cx.g().m = viewFindFocus;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        viewFindFocus.toString();
                        Objects.toString(abstractComponentCallbacksC1247cx);
                    }
                }
                abstractComponentCallbacksC1247cx.S.setAlpha(0.0f);
            }
        }
        abstractComponentCallbacksC1247cx.l = 2;
    }

    public final void g() {
        boolean z;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        boolean z2 = abstractComponentCallbacksC1247cx.w && !abstractComponentCallbacksC1247cx.v();
        C1583gR c1583gR = this.b;
        if (z2 && !abstractComponentCallbacksC1247cx.y) {
            c1583gR.H(abstractComponentCallbacksC1247cx.p, null);
        }
        if (!z2) {
            C0307Ax c0307Ax = (C0307Ax) c1583gR.p;
            if (!((c0307Ax.b.containsKey(abstractComponentCallbacksC1247cx.p) && c0307Ax.e) ? c0307Ax.f : true)) {
                String str = abstractComponentCallbacksC1247cx.s;
                if (str != null && (abstractComponentCallbacksC1247cxO = c1583gR.o(str)) != null && abstractComponentCallbacksC1247cxO.O) {
                    abstractComponentCallbacksC1247cx.r = abstractComponentCallbacksC1247cxO;
                }
                abstractComponentCallbacksC1247cx.l = 0;
                return;
            }
        }
        C1442ex c1442ex = abstractComponentCallbacksC1247cx.G;
        if (c1442ex instanceof InterfaceC1047au0) {
            z = ((C0307Ax) c1583gR.p).f;
        } else {
            Context context = c1442ex.p;
            z = context instanceof Activity ? !((Activity) context).isChangingConfigurations() : true;
        }
        if ((z2 && !abstractComponentCallbacksC1247cx.y) || z) {
            C0307Ax c0307Ax2 = (C0307Ax) c1583gR.p;
            c0307Ax2.getClass();
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC1247cx);
            }
            c0307Ax2.e(abstractComponentCallbacksC1247cx.p, false);
        }
        abstractComponentCallbacksC1247cx.H.l();
        abstractComponentCallbacksC1247cx.b0.d(SJ.ON_DESTROY);
        abstractComponentCallbacksC1247cx.l = 0;
        abstractComponentCallbacksC1247cx.Y = false;
        abstractComponentCallbacksC1247cx.Q = true;
        this.a.F(abstractComponentCallbacksC1247cx, false);
        for (C0670Ox c0670Ox : c1583gR.s()) {
            if (c0670Ox != null) {
                String str2 = abstractComponentCallbacksC1247cx.p;
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c0670Ox.c;
                if (str2.equals(abstractComponentCallbacksC1247cx2.s)) {
                    abstractComponentCallbacksC1247cx2.r = abstractComponentCallbacksC1247cx;
                    abstractComponentCallbacksC1247cx2.s = null;
                }
            }
        }
        String str3 = abstractComponentCallbacksC1247cx.s;
        if (str3 != null) {
            abstractComponentCallbacksC1247cx.r = c1583gR.o(str3);
        }
        c1583gR.A(this);
    }

    public final void h() {
        View view;
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        ViewGroup viewGroup = abstractComponentCallbacksC1247cx.R;
        if (viewGroup != null && (view = abstractComponentCallbacksC1247cx.S) != null) {
            viewGroup.removeView(view);
        }
        abstractComponentCallbacksC1247cx.H.u(1);
        if (abstractComponentCallbacksC1247cx.S != null) {
            C1640gy c1640gy = abstractComponentCallbacksC1247cx.c0;
            c1640gy.g();
            if (c1640gy.p.d.compareTo(TJ.n) >= 0) {
                abstractComponentCallbacksC1247cx.c0.b(SJ.ON_DESTROY);
            }
        }
        abstractComponentCallbacksC1247cx.l = 1;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.B();
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onDestroyView()"));
        }
        Zt0 zt0E = abstractComponentCallbacksC1247cx.e();
        AbstractC1474fG.j(zt0E, "store");
        C3483zx c3483zx = C1869jL.c;
        C2290ni c2290ni = C2290ni.b;
        AbstractC1474fG.j(c2290ni, "defaultCreationExtras");
        RN rn = new RN(zt0E, c3483zx, c2290ni);
        C2766se c2766seA = AbstractC2822t60.a(C1869jL.class);
        String strK = Pu0.k(c2766seA);
        if (strK == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        C2866tf0 c2866tf0 = ((C1869jL) rn.x(c2766seA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK))).b;
        if (c2866tf0.h() > 0) {
            AbstractC1674hK.w(c2866tf0.j(0));
            throw null;
        }
        abstractComponentCallbacksC1247cx.D = false;
        this.a.T(abstractComponentCallbacksC1247cx, false);
        abstractComponentCallbacksC1247cx.R = null;
        abstractComponentCallbacksC1247cx.S = null;
        abstractComponentCallbacksC1247cx.c0 = null;
        abstractComponentCallbacksC1247cx.d0.d(null);
        abstractComponentCallbacksC1247cx.A = false;
    }

    public final void i() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        abstractComponentCallbacksC1247cx.l = -1;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.C();
        abstractComponentCallbacksC1247cx.X = null;
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onDetach()"));
        }
        C3289xx c3289xx = abstractComponentCallbacksC1247cx.H;
        if (!c3289xx.I) {
            c3289xx.l();
            abstractComponentCallbacksC1247cx.H = new C3289xx();
        }
        this.a.I(abstractComponentCallbacksC1247cx, false);
        abstractComponentCallbacksC1247cx.l = -1;
        abstractComponentCallbacksC1247cx.G = null;
        abstractComponentCallbacksC1247cx.I = null;
        abstractComponentCallbacksC1247cx.F = null;
        if (!abstractComponentCallbacksC1247cx.w || abstractComponentCallbacksC1247cx.v()) {
            C0307Ax c0307Ax = (C0307Ax) this.b.p;
            boolean z = true;
            if (c0307Ax.b.containsKey(abstractComponentCallbacksC1247cx.p) && c0307Ax.e) {
                z = c0307Ax.f;
            }
            if (!z) {
                return;
            }
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        abstractComponentCallbacksC1247cx.s();
    }

    public final void j() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (abstractComponentCallbacksC1247cx.z && abstractComponentCallbacksC1247cx.A && !abstractComponentCallbacksC1247cx.D) {
            if (Log.isLoggable("FragmentManager", 3)) {
                Objects.toString(abstractComponentCallbacksC1247cx);
            }
            Bundle bundle = abstractComponentCallbacksC1247cx.m;
            Bundle bundle2 = bundle != null ? bundle.getBundle("savedInstanceState") : null;
            LayoutInflater layoutInflaterD = abstractComponentCallbacksC1247cx.D(bundle2);
            abstractComponentCallbacksC1247cx.X = layoutInflaterD;
            abstractComponentCallbacksC1247cx.M(layoutInflaterD, null, bundle2);
            View view = abstractComponentCallbacksC1247cx.S;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                abstractComponentCallbacksC1247cx.S.setTag(R.id.fragment_container_view_tag, abstractComponentCallbacksC1247cx);
                if (abstractComponentCallbacksC1247cx.M) {
                    abstractComponentCallbacksC1247cx.S.setVisibility(8);
                }
                Bundle bundle3 = abstractComponentCallbacksC1247cx.m;
                abstractComponentCallbacksC1247cx.K(abstractComponentCallbacksC1247cx.S, bundle3 != null ? bundle3.getBundle("savedInstanceState") : null);
                abstractComponentCallbacksC1247cx.H.u(2);
                this.a.S(abstractComponentCallbacksC1247cx, abstractComponentCallbacksC1247cx.S, false);
                abstractComponentCallbacksC1247cx.l = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        boolean z = this.d;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (z) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC1247cx);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int iD = d();
                int i = abstractComponentCallbacksC1247cx.l;
                int i2 = 3;
                C1583gR c1583gR = this.b;
                if (iD == i) {
                    if (!z2 && i == -1 && abstractComponentCallbacksC1247cx.w && !abstractComponentCallbacksC1247cx.v() && !abstractComponentCallbacksC1247cx.y) {
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC1247cx);
                        }
                        C0307Ax c0307Ax = (C0307Ax) c1583gR.p;
                        c0307Ax.getClass();
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC1247cx);
                        }
                        c0307Ax.e(abstractComponentCallbacksC1247cx.p, true);
                        c1583gR.A(this);
                        if (Log.isLoggable("FragmentManager", 3)) {
                            Objects.toString(abstractComponentCallbacksC1247cx);
                        }
                        abstractComponentCallbacksC1247cx.s();
                    }
                    if (abstractComponentCallbacksC1247cx.W) {
                        if (abstractComponentCallbacksC1247cx.S != null && (viewGroup = abstractComponentCallbacksC1247cx.R) != null) {
                            C0581Ll c0581LlI = C0581Ll.i(viewGroup, abstractComponentCallbacksC1247cx.l());
                            if (abstractComponentCallbacksC1247cx.M) {
                                c0581LlI.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC1247cx);
                                }
                                c0581LlI.d(3, 1, this);
                            } else {
                                c0581LlI.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC1247cx);
                                }
                                c0581LlI.d(2, 1, this);
                            }
                        }
                        C3289xx c3289xx = abstractComponentCallbacksC1247cx.F;
                        if (c3289xx != null && abstractComponentCallbacksC1247cx.v && C3289xx.L(abstractComponentCallbacksC1247cx)) {
                            c3289xx.F = true;
                        }
                        abstractComponentCallbacksC1247cx.W = false;
                        abstractComponentCallbacksC1247cx.H.o();
                    }
                    this.d = false;
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            if (abstractComponentCallbacksC1247cx.y) {
                                if (((Bundle) ((HashMap) c1583gR.f793o).get(abstractComponentCallbacksC1247cx.p)) == null) {
                                    c1583gR.H(abstractComponentCallbacksC1247cx.p, o());
                                }
                            }
                            g();
                            break;
                        case 1:
                            h();
                            abstractComponentCallbacksC1247cx.l = 1;
                            break;
                        case 2:
                            abstractComponentCallbacksC1247cx.A = false;
                            abstractComponentCallbacksC1247cx.l = 2;
                            break;
                        case 3:
                            if (Log.isLoggable("FragmentManager", 3)) {
                                Objects.toString(abstractComponentCallbacksC1247cx);
                            }
                            if (abstractComponentCallbacksC1247cx.y) {
                                c1583gR.H(abstractComponentCallbacksC1247cx.p, o());
                            } else if (abstractComponentCallbacksC1247cx.S != null && abstractComponentCallbacksC1247cx.n == null) {
                                p();
                            }
                            if (abstractComponentCallbacksC1247cx.S != null && (viewGroup2 = abstractComponentCallbacksC1247cx.R) != null) {
                                C0581Ll c0581LlI2 = C0581Ll.i(viewGroup2, abstractComponentCallbacksC1247cx.l());
                                c0581LlI2.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC1247cx);
                                }
                                c0581LlI2.d(1, 3, this);
                            }
                            abstractComponentCallbacksC1247cx.l = 3;
                            break;
                        case 4:
                            r();
                            break;
                        case 5:
                            abstractComponentCallbacksC1247cx.l = 5;
                            break;
                        case 6:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (abstractComponentCallbacksC1247cx.S != null && (viewGroup3 = abstractComponentCallbacksC1247cx.R) != null) {
                                C0581Ll c0581LlI3 = C0581Ll.i(viewGroup3, abstractComponentCallbacksC1247cx.l());
                                int visibility = abstractComponentCallbacksC1247cx.S.getVisibility();
                                if (visibility == 0) {
                                    i2 = 2;
                                } else if (visibility == 4) {
                                    i2 = 4;
                                } else if (visibility != 8) {
                                    throw new IllegalArgumentException("Unknown visibility " + visibility);
                                }
                                c0581LlI3.getClass();
                                if (Log.isLoggable("FragmentManager", 2)) {
                                    Objects.toString(abstractComponentCallbacksC1247cx);
                                }
                                c0581LlI3.d(i2, 2, this);
                            }
                            abstractComponentCallbacksC1247cx.l = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case 6:
                            abstractComponentCallbacksC1247cx.l = 6;
                            break;
                        case 7:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        abstractComponentCallbacksC1247cx.H.u(5);
        if (abstractComponentCallbacksC1247cx.S != null) {
            abstractComponentCallbacksC1247cx.c0.b(SJ.ON_PAUSE);
        }
        abstractComponentCallbacksC1247cx.b0.d(SJ.ON_PAUSE);
        abstractComponentCallbacksC1247cx.l = 6;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.F();
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onPause()"));
        }
        this.a.J(abstractComponentCallbacksC1247cx, false);
    }

    public final void m(ClassLoader classLoader) {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        Bundle bundle = abstractComponentCallbacksC1247cx.m;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        if (abstractComponentCallbacksC1247cx.m.getBundle("savedInstanceState") == null) {
            abstractComponentCallbacksC1247cx.m.putBundle("savedInstanceState", new Bundle());
        }
        try {
            abstractComponentCallbacksC1247cx.n = abstractComponentCallbacksC1247cx.m.getSparseParcelableArray("viewState");
            abstractComponentCallbacksC1247cx.f728o = abstractComponentCallbacksC1247cx.m.getBundle("viewRegistryState");
            C0644Nx c0644Nx = (C0644Nx) abstractComponentCallbacksC1247cx.m.getParcelable("state");
            if (c0644Nx != null) {
                abstractComponentCallbacksC1247cx.s = c0644Nx.x;
                abstractComponentCallbacksC1247cx.t = c0644Nx.y;
                abstractComponentCallbacksC1247cx.U = c0644Nx.z;
            }
            if (abstractComponentCallbacksC1247cx.U) {
                return;
            }
            abstractComponentCallbacksC1247cx.T = true;
        } catch (BadParcelableException e) {
            throw new IllegalStateException("Failed to restore view hierarchy state for fragment " + abstractComponentCallbacksC1247cx, e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0032  */
    public final void n() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        C1052ax c1052ax = abstractComponentCallbacksC1247cx.V;
        View view = c1052ax == null ? null : c1052ax.m;
        if (view != null) {
            if (view == abstractComponentCallbacksC1247cx.S) {
                view.requestFocus();
                if (Log.isLoggable("FragmentManager", 2)) {
                    view.toString();
                    Objects.toString(abstractComponentCallbacksC1247cx);
                    Objects.toString(abstractComponentCallbacksC1247cx.S.findFocus());
                }
            } else {
                ViewParent parent = view.getParent();
                while (true) {
                    if (parent != null) {
                        if (parent == abstractComponentCallbacksC1247cx.S) {
                            view.requestFocus();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                view.toString();
                                Objects.toString(abstractComponentCallbacksC1247cx);
                                Objects.toString(abstractComponentCallbacksC1247cx.S.findFocus());
                            }
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
            }
        }
        abstractComponentCallbacksC1247cx.g().m = null;
        abstractComponentCallbacksC1247cx.H.R();
        abstractComponentCallbacksC1247cx.H.z(true);
        abstractComponentCallbacksC1247cx.l = 7;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.G();
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onResume()"));
        }
        C1478fK c1478fK = abstractComponentCallbacksC1247cx.b0;
        SJ sj = SJ.ON_RESUME;
        c1478fK.d(sj);
        if (abstractComponentCallbacksC1247cx.S != null) {
            abstractComponentCallbacksC1247cx.c0.p.d(sj);
        }
        C3289xx c3289xx = abstractComponentCallbacksC1247cx.H;
        c3289xx.G = false;
        c3289xx.H = false;
        c3289xx.N.g = false;
        c3289xx.u(7);
        this.a.O(abstractComponentCallbacksC1247cx, false);
        this.b.H(abstractComponentCallbacksC1247cx.p, null);
        abstractComponentCallbacksC1247cx.m = null;
        abstractComponentCallbacksC1247cx.n = null;
        abstractComponentCallbacksC1247cx.f728o = null;
    }

    public final Bundle o() {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (abstractComponentCallbacksC1247cx.l == -1 && (bundle = abstractComponentCallbacksC1247cx.m) != null) {
            bundle2.putAll(bundle);
        }
        bundle2.putParcelable("state", new C0644Nx(abstractComponentCallbacksC1247cx));
        if (abstractComponentCallbacksC1247cx.l > -1) {
            Bundle bundle3 = new Bundle();
            abstractComponentCallbacksC1247cx.H(bundle3);
            if (!bundle3.isEmpty()) {
                bundle2.putBundle("savedInstanceState", bundle3);
            }
            this.a.P(abstractComponentCallbacksC1247cx, bundle3, false);
            Bundle bundle4 = new Bundle();
            abstractComponentCallbacksC1247cx.f0.i(bundle4);
            if (!bundle4.isEmpty()) {
                bundle2.putBundle("registryState", bundle4);
            }
            Bundle bundleY = abstractComponentCallbacksC1247cx.H.Y();
            if (!bundleY.isEmpty()) {
                bundle2.putBundle("childFragmentManager", bundleY);
            }
            if (abstractComponentCallbacksC1247cx.S != null) {
                p();
            }
            SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC1247cx.n;
            if (sparseArray != null) {
                bundle2.putSparseParcelableArray("viewState", sparseArray);
            }
            Bundle bundle5 = abstractComponentCallbacksC1247cx.f728o;
            if (bundle5 != null) {
                bundle2.putBundle("viewRegistryState", bundle5);
            }
        }
        Bundle bundle6 = abstractComponentCallbacksC1247cx.q;
        if (bundle6 != null) {
            bundle2.putBundle("arguments", bundle6);
        }
        return bundle2;
    }

    public final void p() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (abstractComponentCallbacksC1247cx.S == null) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC1247cx);
            Objects.toString(abstractComponentCallbacksC1247cx.S);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        abstractComponentCallbacksC1247cx.S.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            abstractComponentCallbacksC1247cx.n = sparseArray;
        }
        Bundle bundle = new Bundle();
        abstractComponentCallbacksC1247cx.c0.q.i(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        abstractComponentCallbacksC1247cx.f728o = bundle;
    }

    public final void q() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        abstractComponentCallbacksC1247cx.H.R();
        abstractComponentCallbacksC1247cx.H.z(true);
        abstractComponentCallbacksC1247cx.l = 5;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.I();
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onStart()"));
        }
        C1478fK c1478fK = abstractComponentCallbacksC1247cx.b0;
        SJ sj = SJ.ON_START;
        c1478fK.d(sj);
        if (abstractComponentCallbacksC1247cx.S != null) {
            abstractComponentCallbacksC1247cx.c0.p.d(sj);
        }
        C3289xx c3289xx = abstractComponentCallbacksC1247cx.H;
        c3289xx.G = false;
        c3289xx.H = false;
        c3289xx.N.g = false;
        c3289xx.u(5);
        this.a.Q(abstractComponentCallbacksC1247cx, false);
    }

    public final void r() {
        boolean zIsLoggable = Log.isLoggable("FragmentManager", 3);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.c;
        if (zIsLoggable) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        C3289xx c3289xx = abstractComponentCallbacksC1247cx.H;
        c3289xx.H = true;
        c3289xx.N.g = true;
        c3289xx.u(4);
        if (abstractComponentCallbacksC1247cx.S != null) {
            abstractComponentCallbacksC1247cx.c0.b(SJ.ON_STOP);
        }
        abstractComponentCallbacksC1247cx.b0.d(SJ.ON_STOP);
        abstractComponentCallbacksC1247cx.l = 4;
        abstractComponentCallbacksC1247cx.Q = false;
        abstractComponentCallbacksC1247cx.J();
        if (!abstractComponentCallbacksC1247cx.Q) {
            throw new Dh0(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " did not call through to super.onStop()"));
        }
        this.a.R(abstractComponentCallbacksC1247cx, false);
    }

    public C0670Ox(C2994uv c2994uv, C1583gR c1583gR, ClassLoader classLoader, C2611qx c2611qx, Bundle bundle) {
        this.a = c2994uv;
        this.b = c1583gR;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxA = ((C0644Nx) bundle.getParcelable("state")).a(c2611qx);
        this.c = abstractComponentCallbacksC1247cxA;
        abstractComponentCallbacksC1247cxA.m = bundle;
        Bundle bundle2 = bundle.getBundle("arguments");
        if (bundle2 != null) {
            bundle2.setClassLoader(classLoader);
        }
        abstractComponentCallbacksC1247cxA.U(bundle2);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC1247cxA);
        }
    }

    public C0670Ox(C2994uv c2994uv, C1583gR c1583gR, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, Bundle bundle) {
        this.a = c2994uv;
        this.b = c1583gR;
        this.c = abstractComponentCallbacksC1247cx;
        abstractComponentCallbacksC1247cx.n = null;
        abstractComponentCallbacksC1247cx.f728o = null;
        abstractComponentCallbacksC1247cx.E = 0;
        abstractComponentCallbacksC1247cx.A = false;
        abstractComponentCallbacksC1247cx.v = false;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = abstractComponentCallbacksC1247cx.r;
        abstractComponentCallbacksC1247cx.s = abstractComponentCallbacksC1247cx2 != null ? abstractComponentCallbacksC1247cx2.p : null;
        abstractComponentCallbacksC1247cx.r = null;
        abstractComponentCallbacksC1247cx.m = bundle;
        abstractComponentCallbacksC1247cx.q = bundle.getBundle("arguments");
    }
}
