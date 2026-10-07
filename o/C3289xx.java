package o;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.skidush.clonex.R;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.xx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3289xx {
    public final C0519Jb A;
    public N1 B;
    public N1 C;
    public N1 D;
    public ArrayDeque E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ArrayList K;
    public ArrayList L;
    public ArrayList M;
    public C0307Ax N;
    public final RunnableC3102w1 O;
    public boolean b;
    public ArrayList e;
    public C1490fW g;
    public final ArrayList m;
    public final C2994uv n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f1127o;
    public final C2320nx p;
    public final C2320nx q;
    public final C2320nx r;
    public final C2320nx s;
    public final C2514px t;
    public int u;
    public C1442ex v;
    public zy0 w;
    public AbstractComponentCallbacksC1247cx x;
    public AbstractComponentCallbacksC1247cx y;
    public final C2611qx z;
    public final ArrayList a = new ArrayList();
    public final C1583gR c = new C1583gR(8);
    public ArrayList d = new ArrayList();
    public final LayoutInflaterFactory2C2223mx f = new LayoutInflaterFactory2C2223mx(this);
    public F7 h = null;
    public final C0781Te i = new C0781Te(1, this, false);
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = DesugarCollections.synchronizedMap(new HashMap());
    public final Map l = DesugarCollections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [o.nx] */
    /* JADX WARN: Type inference failed for: r0v16, types: [o.nx] */
    /* JADX WARN: Type inference failed for: r0v17, types: [o.nx] */
    /* JADX WARN: Type inference failed for: r0v18, types: [o.nx] */
    public C3289xx() {
        DesugarCollections.synchronizedMap(new HashMap());
        this.m = new ArrayList();
        this.n = new C2994uv(this);
        this.f1127o = new CopyOnWriteArrayList();
        final int i = 0;
        this.p = new InterfaceC0835Vg(this) { // from class: o.nx
            public final /* synthetic */ C3289xx b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0835Vg
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        C3289xx c3289xx = this.b;
                        if (c3289xx.M()) {
                            c3289xx.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C3289xx c3289xx2 = this.b;
                        if (c3289xx2.M() && num.intValue() == 80) {
                            c3289xx2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        KS ks = (KS) obj;
                        C3289xx c3289xx3 = this.b;
                        if (c3289xx3.M()) {
                            c3289xx3.n(ks.a, false);
                        }
                        break;
                    default:
                        PY py = (PY) obj;
                        C3289xx c3289xx4 = this.b;
                        if (c3289xx4.M()) {
                            c3289xx4.s(py.a, false);
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.q = new InterfaceC0835Vg(this) { // from class: o.nx
            public final /* synthetic */ C3289xx b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0835Vg
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        C3289xx c3289xx = this.b;
                        if (c3289xx.M()) {
                            c3289xx.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C3289xx c3289xx2 = this.b;
                        if (c3289xx2.M() && num.intValue() == 80) {
                            c3289xx2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        KS ks = (KS) obj;
                        C3289xx c3289xx3 = this.b;
                        if (c3289xx3.M()) {
                            c3289xx3.n(ks.a, false);
                        }
                        break;
                    default:
                        PY py = (PY) obj;
                        C3289xx c3289xx4 = this.b;
                        if (c3289xx4.M()) {
                            c3289xx4.s(py.a, false);
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.r = new InterfaceC0835Vg(this) { // from class: o.nx
            public final /* synthetic */ C3289xx b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0835Vg
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        C3289xx c3289xx = this.b;
                        if (c3289xx.M()) {
                            c3289xx.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C3289xx c3289xx2 = this.b;
                        if (c3289xx2.M() && num.intValue() == 80) {
                            c3289xx2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        KS ks = (KS) obj;
                        C3289xx c3289xx3 = this.b;
                        if (c3289xx3.M()) {
                            c3289xx3.n(ks.a, false);
                        }
                        break;
                    default:
                        PY py = (PY) obj;
                        C3289xx c3289xx4 = this.b;
                        if (c3289xx4.M()) {
                            c3289xx4.s(py.a, false);
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.s = new InterfaceC0835Vg(this) { // from class: o.nx
            public final /* synthetic */ C3289xx b;

            {
                this.b = this;
            }

            @Override // o.InterfaceC0835Vg
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        C3289xx c3289xx = this.b;
                        if (c3289xx.M()) {
                            c3289xx.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C3289xx c3289xx2 = this.b;
                        if (c3289xx2.M() && num.intValue() == 80) {
                            c3289xx2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        KS ks = (KS) obj;
                        C3289xx c3289xx3 = this.b;
                        if (c3289xx3.M()) {
                            c3289xx3.n(ks.a, false);
                        }
                        break;
                    default:
                        PY py = (PY) obj;
                        C3289xx c3289xx4 = this.b;
                        if (c3289xx4.M()) {
                            c3289xx4.s(py.a, false);
                        }
                        break;
                }
            }
        };
        this.t = new C2514px(this);
        this.u = -1;
        this.z = new C2611qx(this);
        this.A = new C0519Jb(23);
        this.E = new ArrayDeque();
        this.O = new RunnableC3102w1(11, this);
    }

    public static HashSet G(F7 f7) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < f7.a.size(); i++) {
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = ((C0774Sx) f7.a.get(i)).b;
            if (abstractComponentCallbacksC1247cx != null && f7.g) {
                hashSet.add(abstractComponentCallbacksC1247cx);
            }
        }
        return hashSet;
    }

    public static boolean L(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        boolean zL = false;
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 : abstractComponentCallbacksC1247cx.H.c.t()) {
            if (abstractComponentCallbacksC1247cx2 != null) {
                zL = L(abstractComponentCallbacksC1247cx2);
            }
            if (zL) {
                return true;
            }
        }
        return false;
    }

    public static boolean N(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (abstractComponentCallbacksC1247cx == null) {
            return true;
        }
        return abstractComponentCallbacksC1247cx.P && (abstractComponentCallbacksC1247cx.F == null || N(abstractComponentCallbacksC1247cx.I));
    }

    public static boolean O(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (abstractComponentCallbacksC1247cx == null) {
            return true;
        }
        C3289xx c3289xx = abstractComponentCallbacksC1247cx.F;
        return abstractComponentCallbacksC1247cx.equals(c3289xx.y) && O(c3289xx.x);
    }

    public final void A(InterfaceC2901tx interfaceC2901tx, boolean z) {
        if (z && (this.v == null || this.I)) {
            return;
        }
        y(z);
        if (interfaceC2901tx.a(this.K, this.L)) {
            this.b = true;
            try {
                W(this.K, this.L);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        g0();
        if (this.J) {
            this.J = false;
            e0();
        }
        ((HashMap) this.c.n).values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:63:0x0161  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3;
        F7 f7;
        ArrayList arrayList4;
        C1583gR c1583gR;
        C1583gR c1583gR2;
        C1583gR c1583gR3;
        int i3;
        int i4;
        ArrayList arrayList5 = arrayList;
        boolean z = ((F7) arrayList5.get(i)).p;
        ArrayList arrayList6 = this.M;
        if (arrayList6 == null) {
            this.M = new ArrayList();
        } else {
            arrayList6.clear();
        }
        ArrayList arrayList7 = this.M;
        C1583gR c1583gR4 = this.c;
        arrayList7.addAll(c1583gR4.x());
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.y;
        int i5 = i;
        boolean z2 = false;
        while (true) {
            int i6 = 1;
            if (i5 >= i2) {
                C1583gR c1583gR5 = c1583gR4;
                this.M.clear();
                if (!z && this.u >= 1) {
                    for (int i7 = i; i7 < i2; i7++) {
                        Iterator it = ((F7) arrayList.get(i7)).a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C0774Sx) it.next()).b;
                            if (abstractComponentCallbacksC1247cx2 == null || abstractComponentCallbacksC1247cx2.F == null) {
                                c1583gR = c1583gR5;
                            } else {
                                c1583gR = c1583gR5;
                                c1583gR.z(g(abstractComponentCallbacksC1247cx2));
                            }
                            c1583gR5 = c1583gR;
                        }
                    }
                }
                for (int i8 = i; i8 < i2; i8++) {
                    F7 f8 = (F7) arrayList.get(i8);
                    if (((Boolean) arrayList2.get(i8)).booleanValue()) {
                        f8.d(-1);
                        ArrayList arrayList8 = f8.a;
                        int size = arrayList8.size() - 1;
                        while (size >= 0) {
                            C0774Sx c0774Sx = (C0774Sx) arrayList8.get(size);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx3 = c0774Sx.b;
                            if (abstractComponentCallbacksC1247cx3 != null) {
                                abstractComponentCallbacksC1247cx3.y = f8.u;
                                if (abstractComponentCallbacksC1247cx3.V != null) {
                                    abstractComponentCallbacksC1247cx3.g().a = true;
                                }
                                int i9 = f8.f;
                                int i10 = 8194;
                                if (i9 != 4097) {
                                    if (i9 != 8194) {
                                        i10 = 4100;
                                        if (i9 != 8197) {
                                            i10 = i9 != 4099 ? i9 != 4100 ? 0 : 8197 : 4099;
                                        }
                                    } else {
                                        i10 = 4097;
                                    }
                                }
                                if (abstractComponentCallbacksC1247cx3.V != null || i10 != 0) {
                                    abstractComponentCallbacksC1247cx3.g();
                                    abstractComponentCallbacksC1247cx3.V.f = i10;
                                }
                                abstractComponentCallbacksC1247cx3.g();
                                abstractComponentCallbacksC1247cx3.V.getClass();
                            }
                            int i11 = c0774Sx.a;
                            C3289xx c3289xx = f8.r;
                            switch (i11) {
                                case 1:
                                    arrayList4 = arrayList8;
                                    abstractComponentCallbacksC1247cx3.T(c0774Sx.d, c0774Sx.e, c0774Sx.f, c0774Sx.g);
                                    c3289xx.a0(abstractComponentCallbacksC1247cx3, true);
                                    c3289xx.V(abstractComponentCallbacksC1247cx3);
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0774Sx.a);
                                case 3:
                                    arrayList4 = arrayList8;
                                    abstractComponentCallbacksC1247cx3.T(c0774Sx.d, c0774Sx.e, c0774Sx.f, c0774Sx.g);
                                    c3289xx.a(abstractComponentCallbacksC1247cx3);
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                                case 4:
                                    arrayList4 = arrayList8;
                                    abstractComponentCallbacksC1247cx3.T(c0774Sx.d, c0774Sx.e, c0774Sx.f, c0774Sx.g);
                                    c3289xx.getClass();
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(abstractComponentCallbacksC1247cx3);
                                    }
                                    if (abstractComponentCallbacksC1247cx3.M) {
                                        abstractComponentCallbacksC1247cx3.M = false;
                                        abstractComponentCallbacksC1247cx3.W = !abstractComponentCallbacksC1247cx3.W;
                                    }
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                                case 5:
                                    arrayList4 = arrayList8;
                                    abstractComponentCallbacksC1247cx3.T(c0774Sx.d, c0774Sx.e, c0774Sx.f, c0774Sx.g);
                                    c3289xx.a0(abstractComponentCallbacksC1247cx3, true);
                                    c3289xx.K(abstractComponentCallbacksC1247cx3);
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                                case 6:
                                    arrayList4 = arrayList8;
                                    abstractComponentCallbacksC1247cx3.T(c0774Sx.d, c0774Sx.e, c0774Sx.f, c0774Sx.g);
                                    c3289xx.c(abstractComponentCallbacksC1247cx3);
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                                case 7:
                                    arrayList4 = arrayList8;
                                    abstractComponentCallbacksC1247cx3.T(c0774Sx.d, c0774Sx.e, c0774Sx.f, c0774Sx.g);
                                    c3289xx.a0(abstractComponentCallbacksC1247cx3, true);
                                    c3289xx.h(abstractComponentCallbacksC1247cx3);
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                                case 8:
                                    c3289xx.c0(null);
                                    arrayList4 = arrayList8;
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                                case 9:
                                    c3289xx.c0(abstractComponentCallbacksC1247cx3);
                                    arrayList4 = arrayList8;
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                                case 10:
                                    c3289xx.b0(abstractComponentCallbacksC1247cx3, c0774Sx.h);
                                    arrayList4 = arrayList8;
                                    size--;
                                    arrayList8 = arrayList4;
                                    break;
                            }
                        }
                    } else {
                        f8.d(1);
                        ArrayList arrayList9 = f8.a;
                        int size2 = arrayList9.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            C0774Sx c0774Sx2 = (C0774Sx) arrayList9.get(i12);
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx4 = c0774Sx2.b;
                            if (abstractComponentCallbacksC1247cx4 != null) {
                                abstractComponentCallbacksC1247cx4.y = f8.u;
                                if (abstractComponentCallbacksC1247cx4.V != null) {
                                    abstractComponentCallbacksC1247cx4.g().a = false;
                                }
                                int i13 = f8.f;
                                if (abstractComponentCallbacksC1247cx4.V != null || i13 != 0) {
                                    abstractComponentCallbacksC1247cx4.g();
                                    abstractComponentCallbacksC1247cx4.V.f = i13;
                                }
                                abstractComponentCallbacksC1247cx4.g();
                                abstractComponentCallbacksC1247cx4.V.getClass();
                            }
                            int i14 = c0774Sx2.a;
                            C3289xx c3289xx2 = f8.r;
                            switch (i14) {
                                case 1:
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    abstractComponentCallbacksC1247cx4.T(c0774Sx2.d, c0774Sx2.e, c0774Sx2.f, c0774Sx2.g);
                                    c3289xx2.a0(abstractComponentCallbacksC1247cx4, false);
                                    c3289xx2.a(abstractComponentCallbacksC1247cx4);
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0774Sx2.a);
                                case 3:
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    abstractComponentCallbacksC1247cx4.T(c0774Sx2.d, c0774Sx2.e, c0774Sx2.f, c0774Sx2.g);
                                    c3289xx2.V(abstractComponentCallbacksC1247cx4);
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                                case 4:
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    abstractComponentCallbacksC1247cx4.T(c0774Sx2.d, c0774Sx2.e, c0774Sx2.f, c0774Sx2.g);
                                    c3289xx2.K(abstractComponentCallbacksC1247cx4);
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                                case 5:
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    abstractComponentCallbacksC1247cx4.T(c0774Sx2.d, c0774Sx2.e, c0774Sx2.f, c0774Sx2.g);
                                    c3289xx2.a0(abstractComponentCallbacksC1247cx4, false);
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                        Objects.toString(abstractComponentCallbacksC1247cx4);
                                    }
                                    if (abstractComponentCallbacksC1247cx4.M) {
                                        abstractComponentCallbacksC1247cx4.M = false;
                                        abstractComponentCallbacksC1247cx4.W = !abstractComponentCallbacksC1247cx4.W;
                                    }
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                                case 6:
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    abstractComponentCallbacksC1247cx4.T(c0774Sx2.d, c0774Sx2.e, c0774Sx2.f, c0774Sx2.g);
                                    c3289xx2.h(abstractComponentCallbacksC1247cx4);
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                                case 7:
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    abstractComponentCallbacksC1247cx4.T(c0774Sx2.d, c0774Sx2.e, c0774Sx2.f, c0774Sx2.g);
                                    c3289xx2.a0(abstractComponentCallbacksC1247cx4, false);
                                    c3289xx2.c(abstractComponentCallbacksC1247cx4);
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                                case 8:
                                    c3289xx2.c0(abstractComponentCallbacksC1247cx4);
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                                case 9:
                                    c3289xx2.c0(null);
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                                case 10:
                                    c3289xx2.b0(abstractComponentCallbacksC1247cx4, c0774Sx2.i);
                                    arrayList3 = arrayList9;
                                    f7 = f8;
                                    i12++;
                                    arrayList9 = arrayList3;
                                    f8 = f7;
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList<C0515Ix> arrayList10 = this.m;
                if (z2 && !arrayList10.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(G((F7) it2.next()));
                    }
                    if (this.h == null) {
                        for (C0515Ix c0515Ix : arrayList10) {
                            Iterator it3 = linkedHashSet.iterator();
                            while (it3.hasNext()) {
                                c0515Ix.b((AbstractComponentCallbacksC1247cx) it3.next(), zBooleanValue);
                            }
                        }
                        for (C0515Ix c0515Ix2 : arrayList10) {
                            Iterator it4 = linkedHashSet.iterator();
                            while (it4.hasNext()) {
                                c0515Ix2.a((AbstractComponentCallbacksC1247cx) it4.next(), zBooleanValue);
                            }
                        }
                    }
                }
                for (int i15 = i; i15 < i2; i15++) {
                    F7 f9 = (F7) arrayList.get(i15);
                    if (zBooleanValue) {
                        for (int size3 = f9.a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx5 = ((C0774Sx) f9.a.get(size3)).b;
                            if (abstractComponentCallbacksC1247cx5 != null) {
                                g(abstractComponentCallbacksC1247cx5).k();
                            }
                        }
                    } else {
                        Iterator it5 = f9.a.iterator();
                        while (it5.hasNext()) {
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx6 = ((C0774Sx) it5.next()).b;
                            if (abstractComponentCallbacksC1247cx6 != null) {
                                g(abstractComponentCallbacksC1247cx6).k();
                            }
                        }
                    }
                }
                Q(this.u, true);
                int i16 = i;
                for (C0581Ll c0581Ll : f(arrayList, i16, i2)) {
                    c0581Ll.d = zBooleanValue;
                    c0581Ll.j();
                    c0581Ll.e();
                }
                while (i16 < i2) {
                    F7 f10 = (F7) arrayList.get(i16);
                    if (((Boolean) arrayList2.get(i16)).booleanValue() && f10.t >= 0) {
                        f10.t = -1;
                    }
                    if (f10.q != null) {
                        for (int i17 = 0; i17 < f10.q.size(); i17++) {
                            ((Runnable) f10.q.get(i17)).run();
                        }
                        f10.q = null;
                    }
                    i16++;
                }
                if (z2) {
                    for (int i18 = 0; i18 < arrayList10.size(); i18++) {
                        ((C0515Ix) arrayList10.get(i18)).getClass();
                    }
                    return;
                }
                return;
            }
            F7 f11 = (F7) arrayList5.get(i5);
            if (((Boolean) arrayList2.get(i5)).booleanValue()) {
                c1583gR2 = c1583gR4;
                int i19 = 1;
                ArrayList arrayList11 = this.M;
                ArrayList arrayList12 = f11.a;
                int size4 = arrayList12.size() - 1;
                while (size4 >= 0) {
                    C0774Sx c0774Sx3 = (C0774Sx) arrayList12.get(size4);
                    int i20 = c0774Sx3.a;
                    if (i20 != i19) {
                        if (i20 != 3) {
                            switch (i20) {
                                case 6:
                                    arrayList11.add(c0774Sx3.b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC1247cx = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC1247cx = c0774Sx3.b;
                                    break;
                                case 10:
                                    c0774Sx3.i = c0774Sx3.h;
                                    break;
                            }
                        } else {
                            arrayList11.add(c0774Sx3.b);
                        }
                        size4--;
                        i19 = 1;
                    }
                    arrayList11.remove(c0774Sx3.b);
                    size4--;
                    i19 = 1;
                }
            } else {
                ArrayList arrayList13 = this.M;
                int i21 = 0;
                while (true) {
                    ArrayList arrayList14 = f11.a;
                    if (i21 < arrayList14.size()) {
                        C0774Sx c0774Sx4 = (C0774Sx) arrayList14.get(i21);
                        int i22 = c0774Sx4.a;
                        if (i22 == i6) {
                            c1583gR3 = c1583gR4;
                            i3 = 1;
                            arrayList13.add(c0774Sx4.b);
                        } else if (i22 != 2) {
                            if (i22 == 3 || i22 == 6) {
                                arrayList13.remove(c0774Sx4.b);
                                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx7 = c0774Sx4.b;
                                if (abstractComponentCallbacksC1247cx7 == abstractComponentCallbacksC1247cx) {
                                    arrayList14.add(i21, new C0774Sx(9, abstractComponentCallbacksC1247cx7));
                                    i21++;
                                    c1583gR3 = c1583gR4;
                                    i3 = 1;
                                    abstractComponentCallbacksC1247cx = null;
                                }
                            } else if (i22 == 7) {
                                c1583gR3 = c1583gR4;
                                i3 = 1;
                                arrayList13.add(c0774Sx4.b);
                            } else if (i22 == 8) {
                                arrayList14.add(i21, new C0774Sx(9, abstractComponentCallbacksC1247cx, 0));
                                c0774Sx4.c = true;
                                i21++;
                                abstractComponentCallbacksC1247cx = c0774Sx4.b;
                            }
                            c1583gR3 = c1583gR4;
                            i3 = 1;
                        } else {
                            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx8 = c0774Sx4.b;
                            int i23 = abstractComponentCallbacksC1247cx8.K;
                            int size5 = arrayList13.size() - 1;
                            boolean z3 = false;
                            while (size5 >= 0) {
                                C1583gR c1583gR6 = c1583gR4;
                                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx9 = (AbstractComponentCallbacksC1247cx) arrayList13.get(size5);
                                if (abstractComponentCallbacksC1247cx9.K != i23) {
                                    i23 = i23;
                                } else if (abstractComponentCallbacksC1247cx9 == abstractComponentCallbacksC1247cx8) {
                                    i23 = i23;
                                    z3 = true;
                                } else {
                                    if (abstractComponentCallbacksC1247cx9 == abstractComponentCallbacksC1247cx) {
                                        arrayList14.add(i21, new C0774Sx(9, abstractComponentCallbacksC1247cx9, 0));
                                        i21++;
                                        i4 = 0;
                                        abstractComponentCallbacksC1247cx = null;
                                    } else {
                                        i4 = 0;
                                    }
                                    C0774Sx c0774Sx5 = new C0774Sx(3, abstractComponentCallbacksC1247cx9, i4);
                                    c0774Sx5.d = c0774Sx4.d;
                                    c0774Sx5.f = c0774Sx4.f;
                                    c0774Sx5.e = c0774Sx4.e;
                                    c0774Sx5.g = c0774Sx4.g;
                                    arrayList14.add(i21, c0774Sx5);
                                    arrayList13.remove(abstractComponentCallbacksC1247cx9);
                                    i21++;
                                    abstractComponentCallbacksC1247cx = abstractComponentCallbacksC1247cx;
                                }
                                size5--;
                                i23 = i23;
                                c1583gR4 = c1583gR6;
                            }
                            c1583gR3 = c1583gR4;
                            i3 = 1;
                            if (z3) {
                                arrayList14.remove(i21);
                                i21--;
                            } else {
                                c0774Sx4.a = 1;
                                c0774Sx4.c = true;
                                arrayList13.add(abstractComponentCallbacksC1247cx8);
                            }
                        }
                        i21 += i3;
                        c1583gR4 = c1583gR3;
                        i6 = 1;
                    } else {
                        c1583gR2 = c1583gR4;
                    }
                }
            }
            z2 = z2 || f11.g;
            i5++;
            arrayList5 = arrayList;
            c1583gR4 = c1583gR2;
        }
    }

    public final int C(int i, String str, boolean z) {
        if (this.d.isEmpty()) {
            return -1;
        }
        if (str == null && i < 0) {
            if (z) {
                return 0;
            }
            return this.d.size() - 1;
        }
        int size = this.d.size() - 1;
        while (size >= 0) {
            F7 f7 = (F7) this.d.get(size);
            if ((str != null && str.equals(f7.i)) || (i >= 0 && i == f7.t)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z) {
            if (size == this.d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            F7 f8 = (F7) this.d.get(size - 1);
            if ((str == null || !str.equals(f8.i)) && (i < 0 || i != f8.t)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public final AbstractComponentCallbacksC1247cx D(int i) {
        C1583gR c1583gR = this.c;
        ArrayList arrayList = (ArrayList) c1583gR.m;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = (AbstractComponentCallbacksC1247cx) arrayList.get(size);
            if (abstractComponentCallbacksC1247cx != null && abstractComponentCallbacksC1247cx.J == i) {
                return abstractComponentCallbacksC1247cx;
            }
        }
        for (C0670Ox c0670Ox : ((HashMap) c1583gR.n).values()) {
            if (c0670Ox != null) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c0670Ox.c;
                if (abstractComponentCallbacksC1247cx2.J == i) {
                    return abstractComponentCallbacksC1247cx2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC1247cx E(String str) {
        C1583gR c1583gR = this.c;
        if (str != null) {
            ArrayList arrayList = (ArrayList) c1583gR.m;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = (AbstractComponentCallbacksC1247cx) arrayList.get(size);
                if (abstractComponentCallbacksC1247cx != null && str.equals(abstractComponentCallbacksC1247cx.L)) {
                    return abstractComponentCallbacksC1247cx;
                }
            }
        }
        if (str != null) {
            for (C0670Ox c0670Ox : ((HashMap) c1583gR.n).values()) {
                if (c0670Ox != null) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c0670Ox.c;
                    if (str.equals(abstractComponentCallbacksC1247cx2.L)) {
                        return abstractComponentCallbacksC1247cx2;
                    }
                }
            }
        } else {
            c1583gR.getClass();
        }
        return null;
    }

    public final void F() {
        for (C0581Ll c0581Ll : e()) {
            if (c0581Ll.e) {
                Log.isLoggable("FragmentManager", 2);
                c0581Ll.e = false;
                c0581Ll.e();
            }
        }
    }

    public final ViewGroup H(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        ViewGroup viewGroup = abstractComponentCallbacksC1247cx.R;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC1247cx.K > 0 && this.w.w()) {
            View viewV = this.w.v(abstractComponentCallbacksC1247cx.K);
            if (viewV instanceof ViewGroup) {
                return (ViewGroup) viewV;
            }
        }
        return null;
    }

    public final C2611qx I() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.x;
        return abstractComponentCallbacksC1247cx != null ? abstractComponentCallbacksC1247cx.F.I() : this.z;
    }

    public final C0519Jb J() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.x;
        return abstractComponentCallbacksC1247cx != null ? abstractComponentCallbacksC1247cx.F.J() : this.A;
    }

    public final void K(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        if (abstractComponentCallbacksC1247cx.M) {
            return;
        }
        abstractComponentCallbacksC1247cx.M = true;
        abstractComponentCallbacksC1247cx.W = true ^ abstractComponentCallbacksC1247cx.W;
        d0(abstractComponentCallbacksC1247cx);
    }

    public final boolean M() {
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.x;
        if (abstractComponentCallbacksC1247cx == null) {
            return true;
        }
        return abstractComponentCallbacksC1247cx.t() && this.x.l().M();
    }

    public final boolean P() {
        return this.G || this.H;
    }

    public final void Q(int i, boolean z) {
        HashMap map;
        C1442ex c1442ex;
        if (this.v == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.u) {
            this.u = i;
            C1583gR c1583gR = this.c;
            Iterator it = ((ArrayList) c1583gR.m).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) c1583gR.n;
                if (!zHasNext) {
                    break;
                }
                C0670Ox c0670Ox = (C0670Ox) map.get(((AbstractComponentCallbacksC1247cx) it.next()).p);
                if (c0670Ox != null) {
                    c0670Ox.k();
                }
            }
            for (C0670Ox c0670Ox2 : map.values()) {
                if (c0670Ox2 != null) {
                    c0670Ox2.k();
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox2.c;
                    if (abstractComponentCallbacksC1247cx.w && !abstractComponentCallbacksC1247cx.v()) {
                        if (abstractComponentCallbacksC1247cx.y && !((HashMap) c1583gR.f793o).containsKey(abstractComponentCallbacksC1247cx.p)) {
                            c1583gR.H(abstractComponentCallbacksC1247cx.p, c0670Ox2.o());
                        }
                        c1583gR.A(c0670Ox2);
                    }
                }
            }
            e0();
            if (this.F && (c1442ex = this.v) != null && this.u == 7) {
                c1442ex.s.invalidateOptionsMenu();
                this.F = false;
            }
        }
    }

    public final void R() {
        if (this.v == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.N.g = false;
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null) {
                abstractComponentCallbacksC1247cx.H.R();
            }
        }
    }

    public final boolean S() {
        return T(-1, 0);
    }

    public final boolean T(int i, int i2) {
        z(false);
        y(true);
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.y;
        if (abstractComponentCallbacksC1247cx != null && i < 0 && abstractComponentCallbacksC1247cx.i().T(-1, 0)) {
            return true;
        }
        boolean zU = U(this.K, this.L, null, i, i2);
        if (zU) {
            this.b = true;
            try {
                W(this.K, this.L);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        g0();
        if (this.J) {
            this.J = false;
            e0();
        }
        ((HashMap) this.c.n).values().removeAll(Collections.singleton(null));
        return zU;
    }

    public final boolean U(ArrayList arrayList, ArrayList arrayList2, String str, int i, int i2) {
        int iC = C(i, str, (i2 & 1) != 0);
        if (iC < 0) {
            return false;
        }
        for (int size = this.d.size() - 1; size >= iC; size--) {
            arrayList.add((F7) this.d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void V(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        boolean z = !abstractComponentCallbacksC1247cx.v();
        if (!abstractComponentCallbacksC1247cx.N || z) {
            C1583gR c1583gR = this.c;
            synchronized (((ArrayList) c1583gR.m)) {
                ((ArrayList) c1583gR.m).remove(abstractComponentCallbacksC1247cx);
            }
            abstractComponentCallbacksC1247cx.v = false;
            if (L(abstractComponentCallbacksC1247cx)) {
                this.F = true;
            }
            abstractComponentCallbacksC1247cx.w = true;
            d0(abstractComponentCallbacksC1247cx);
        }
    }

    public final void W(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((F7) arrayList.get(i)).p) {
                if (i2 != i) {
                    B(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((F7) arrayList.get(i2)).p) {
                        i2++;
                    }
                }
                B(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            B(arrayList, arrayList2, i2, size);
        }
    }

    public final void X(Bundle bundle) {
        C2994uv c2994uv;
        C0670Ox c0670Ox;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.v.p.getClassLoader());
                this.l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.v.p.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        C1583gR c1583gR = this.c;
        HashMap map2 = (HashMap) c1583gR.f793o;
        map2.clear();
        map2.putAll(map);
        C3386yx c3386yx = (C3386yx) bundle.getParcelable("state");
        if (c3386yx == null) {
            return;
        }
        HashMap map3 = (HashMap) c1583gR.n;
        map3.clear();
        Iterator it = c3386yx.l.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            c2994uv = this.n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleH = c1583gR.H((String) it.next(), null);
            if (bundleH != null) {
                C0644Nx c0644Nx = (C0644Nx) bundleH.getParcelable("state");
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = (AbstractComponentCallbacksC1247cx) this.N.b.get(c0644Nx.m);
                if (abstractComponentCallbacksC1247cx != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        abstractComponentCallbacksC1247cx.toString();
                    }
                    c0670Ox = new C0670Ox(c2994uv, c1583gR, abstractComponentCallbacksC1247cx, bundleH);
                } else {
                    c0670Ox = new C0670Ox(this.n, this.c, this.v.p.getClassLoader(), I(), bundleH);
                }
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c0670Ox.c;
                abstractComponentCallbacksC1247cx2.m = bundleH;
                abstractComponentCallbacksC1247cx2.F = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC1247cx2.toString();
                }
                c0670Ox.m(this.v.p.getClassLoader());
                c1583gR.z(c0670Ox);
                c0670Ox.e = this.u;
            }
        }
        C0307Ax c0307Ax = this.N;
        c0307Ax.getClass();
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx3 : new ArrayList(c0307Ax.b.values())) {
            if (map3.get(abstractComponentCallbacksC1247cx3.p) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC1247cx3.toString();
                    Objects.toString(c3386yx.l);
                }
                this.N.f(abstractComponentCallbacksC1247cx3);
                abstractComponentCallbacksC1247cx3.F = this;
                C0670Ox c0670Ox2 = new C0670Ox(c2994uv, c1583gR, abstractComponentCallbacksC1247cx3);
                c0670Ox2.e = 1;
                c0670Ox2.k();
                abstractComponentCallbacksC1247cx3.w = true;
                c0670Ox2.k();
            }
        }
        ArrayList<String> arrayList = c3386yx.m;
        ((ArrayList) c1583gR.m).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO = c1583gR.o(str3);
                if (abstractComponentCallbacksC1247cxO == null) {
                    throw new IllegalStateException(AbstractC1701hf0.u("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC1247cxO.toString();
                }
                c1583gR.a(abstractComponentCallbacksC1247cxO);
            }
        }
        if (c3386yx.n != null) {
            this.d = new ArrayList(c3386yx.n.length);
            int i = 0;
            while (true) {
                G7[] g7Arr = c3386yx.n;
                if (i >= g7Arr.length) {
                    break;
                }
                G7 g7 = g7Arr[i];
                g7.getClass();
                F7 f7 = new F7(this);
                g7.a(f7);
                f7.t = g7.r;
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = g7.m;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i2);
                    if (str4 != null) {
                        ((C0774Sx) f7.a.get(i2)).b = c1583gR.o(str4);
                    }
                    i2++;
                }
                f7.d(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    f7.toString();
                    PrintWriter printWriter = new PrintWriter(new BL());
                    f7.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(f7);
                i++;
            }
        } else {
            this.d = new ArrayList();
        }
        this.j.set(c3386yx.f1141o);
        String str5 = c3386yx.p;
        if (str5 != null) {
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxO2 = c1583gR.o(str5);
            this.y = abstractComponentCallbacksC1247cxO2;
            r(abstractComponentCallbacksC1247cxO2);
        }
        ArrayList arrayList3 = c3386yx.q;
        if (arrayList3 != null) {
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                this.k.put((String) arrayList3.get(i3), (H7) c3386yx.r.get(i3));
            }
        }
        this.E = new ArrayDeque(c3386yx.s);
    }

    public final Bundle Y() {
        ArrayList arrayList;
        G7[] g7Arr;
        Bundle bundle = new Bundle();
        F();
        w();
        z(true);
        this.G = true;
        this.N.g = true;
        C1583gR c1583gR = this.c;
        c1583gR.getClass();
        HashMap map = (HashMap) c1583gR.n;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (C0670Ox c0670Ox : map.values()) {
            if (c0670Ox != null) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
                c1583gR.H(abstractComponentCallbacksC1247cx.p, c0670Ox.o());
                arrayList2.add(abstractComponentCallbacksC1247cx.p);
                if (Log.isLoggable("FragmentManager", 2)) {
                    abstractComponentCallbacksC1247cx.toString();
                    Objects.toString(abstractComponentCallbacksC1247cx.m);
                }
            }
        }
        HashMap map2 = (HashMap) this.c.f793o;
        if (map2.isEmpty()) {
            Log.isLoggable("FragmentManager", 2);
        } else {
            C1583gR c1583gR2 = this.c;
            synchronized (((ArrayList) c1583gR2.m)) {
                try {
                    if (((ArrayList) c1583gR2.m).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c1583gR2.m).size());
                        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 : (ArrayList) c1583gR2.m) {
                            arrayList.add(abstractComponentCallbacksC1247cx2.p);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                abstractComponentCallbacksC1247cx2.toString();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.d.size();
            if (size > 0) {
                g7Arr = new G7[size];
                for (int i = 0; i < size; i++) {
                    g7Arr[i] = new G7((F7) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.d.get(i));
                    }
                }
            } else {
                g7Arr = null;
            }
            C3386yx c3386yx = new C3386yx();
            c3386yx.p = null;
            ArrayList arrayList3 = new ArrayList();
            c3386yx.q = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            c3386yx.r = arrayList4;
            c3386yx.l = arrayList2;
            c3386yx.m = arrayList;
            c3386yx.n = g7Arr;
            c3386yx.f1141o = this.j.get();
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx3 = this.y;
            if (abstractComponentCallbacksC1247cx3 != null) {
                c3386yx.p = abstractComponentCallbacksC1247cx3.p;
            }
            arrayList3.addAll(this.k.keySet());
            arrayList4.addAll(this.k.values());
            c3386yx.s = new ArrayList(this.E);
            bundle.putParcelable("state", c3386yx);
            for (String str : this.l.keySet()) {
                bundle.putBundle(AbstractC1701hf0.t("result_", str), (Bundle) this.l.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(AbstractC1701hf0.t("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    public final void Z() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.v.q.removeCallbacks(this.O);
                    this.v.q.post(this.O);
                    g0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0670Ox a(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        String str = abstractComponentCallbacksC1247cx.Z;
        if (str != null) {
            AbstractC0748Rx.c(abstractComponentCallbacksC1247cx, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            abstractComponentCallbacksC1247cx.toString();
        }
        C0670Ox c0670OxG = g(abstractComponentCallbacksC1247cx);
        abstractComponentCallbacksC1247cx.F = this;
        C1583gR c1583gR = this.c;
        c1583gR.z(c0670OxG);
        if (!abstractComponentCallbacksC1247cx.N) {
            c1583gR.a(abstractComponentCallbacksC1247cx);
            abstractComponentCallbacksC1247cx.w = false;
            if (abstractComponentCallbacksC1247cx.S == null) {
                abstractComponentCallbacksC1247cx.W = false;
            }
            if (L(abstractComponentCallbacksC1247cx)) {
                this.F = true;
            }
        }
        return c0670OxG;
    }

    public final void a0(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        ViewGroup viewGroupH = H(abstractComponentCallbacksC1247cx);
        if (viewGroupH == null || !(viewGroupH instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupH).setDrawDisappearingViewsLast(!z);
    }

    public final void b(C1442ex c1442ex, zy0 zy0Var, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (this.v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.v = c1442ex;
        this.w = zy0Var;
        this.x = abstractComponentCallbacksC1247cx;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1127o;
        if (abstractComponentCallbacksC1247cx != null) {
            copyOnWriteArrayList.add(new C2707rx(abstractComponentCallbacksC1247cx));
        } else if (c1442ex instanceof InterfaceC0592Lx) {
            copyOnWriteArrayList.add(c1442ex);
        }
        if (this.x != null) {
            g0();
        }
        if (c1442ex instanceof InterfaceC1588gW) {
            C1490fW c1490fWN = c1442ex.s.n();
            this.g = c1490fWN;
            c1490fWN.a(abstractComponentCallbacksC1247cx != null ? abstractComponentCallbacksC1247cx : c1442ex, this.i);
        }
        if (abstractComponentCallbacksC1247cx != null) {
            C0307Ax c0307Ax = abstractComponentCallbacksC1247cx.F.N;
            HashMap map = c0307Ax.c;
            C0307Ax c0307Ax2 = (C0307Ax) map.get(abstractComponentCallbacksC1247cx.p);
            if (c0307Ax2 == null) {
                c0307Ax2 = new C0307Ax(c0307Ax.e);
                map.put(abstractComponentCallbacksC1247cx.p, c0307Ax2);
            }
            this.N = c0307Ax2;
        } else if (c1442ex instanceof InterfaceC1047au0) {
            Zt0 zt0E = c1442ex.s.e();
            C3483zx c3483zx = C0307Ax.h;
            AbstractC1474fG.j(zt0E, "store");
            C2290ni c2290ni = C2290ni.b;
            AbstractC1474fG.j(c2290ni, "defaultCreationExtras");
            RN rn = new RN(zt0E, c3483zx, c2290ni);
            C2766se c2766seA = AbstractC2822t60.a(C0307Ax.class);
            String strK = Pu0.k(c2766seA);
            if (strK == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
            }
            this.N = (C0307Ax) rn.x(c2766seA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK));
        } else {
            this.N = new C0307Ax(false);
        }
        this.N.g = P();
        this.c.p = this.N;
        C1442ex c1442ex2 = this.v;
        if ((c1442ex2 instanceof K90) && abstractComponentCallbacksC1247cx == null) {
            K3 k3A = c1442ex2.a();
            k3A.f("android:support:fragments", new C0782Tf(2, this));
            Bundle bundleC = k3A.c("android:support:fragments");
            if (bundleC != null) {
                X(bundleC);
            }
        }
        C1442ex c1442ex3 = this.v;
        if (c1442ex3 instanceof Q1) {
            C0834Vf c0834Vf = c1442ex3.s.v;
            String strT = AbstractC1701hf0.t("FragmentManager:", abstractComponentCallbacksC1247cx != null ? AbstractC1701hf0.h(new StringBuilder(), abstractComponentCallbacksC1247cx.p, ":") : "");
            this.B = c0834Vf.c(AbstractC1701hf0.d(strT, "StartActivityForResult"), new K1(2), new C2417ox(this, 1));
            this.C = c0834Vf.c(AbstractC1701hf0.d(strT, "StartIntentSenderForResult"), new K1(3), new C2417ox(this, 2));
            this.D = c0834Vf.c(AbstractC1701hf0.d(strT, "RequestPermissions"), new K1(1), new C2417ox(this, 0));
        }
        C1442ex c1442ex4 = this.v;
        if (c1442ex4 instanceof InterfaceC1978kW) {
            c1442ex4.F(this.p);
        }
        C1442ex c1442ex5 = this.v;
        if (c1442ex5 instanceof InterfaceC2657rW) {
            c1442ex5.I(this.q);
        }
        C1442ex c1442ex6 = this.v;
        if (c1442ex6 instanceof InterfaceC2270nW) {
            c1442ex6.G(this.r);
        }
        C1442ex c1442ex7 = this.v;
        if (c1442ex7 instanceof InterfaceC2367oW) {
            c1442ex7.H(this.s);
        }
        C1442ex c1442ex8 = this.v;
        if ((c1442ex8 instanceof InterfaceC1094bQ) && abstractComponentCallbacksC1247cx == null) {
            c1442ex8.E(this.t);
        }
    }

    public final void b0(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, TJ tj) {
        if (abstractComponentCallbacksC1247cx.equals(this.c.o(abstractComponentCallbacksC1247cx.p)) && (abstractComponentCallbacksC1247cx.G == null || abstractComponentCallbacksC1247cx.F == this)) {
            abstractComponentCallbacksC1247cx.a0 = tj;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1247cx + " is not an active fragment of FragmentManager " + this);
    }

    public final void c(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        if (abstractComponentCallbacksC1247cx.N) {
            abstractComponentCallbacksC1247cx.N = false;
            if (abstractComponentCallbacksC1247cx.v) {
                return;
            }
            this.c.a(abstractComponentCallbacksC1247cx);
            if (Log.isLoggable("FragmentManager", 2)) {
                abstractComponentCallbacksC1247cx.toString();
            }
            if (L(abstractComponentCallbacksC1247cx)) {
                this.F = true;
            }
        }
    }

    public final void c0(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (abstractComponentCallbacksC1247cx != null) {
            if (!abstractComponentCallbacksC1247cx.equals(this.c.o(abstractComponentCallbacksC1247cx.p)) || (abstractComponentCallbacksC1247cx.G != null && abstractComponentCallbacksC1247cx.F != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC1247cx + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = this.y;
        this.y = abstractComponentCallbacksC1247cx;
        r(abstractComponentCallbacksC1247cx2);
        r(this.y);
    }

    public final void d() {
        this.b = false;
        this.L.clear();
        this.K.clear();
    }

    public final void d0(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        ViewGroup viewGroupH = H(abstractComponentCallbacksC1247cx);
        if (viewGroupH != null) {
            C1052ax c1052ax = abstractComponentCallbacksC1247cx.V;
            if ((c1052ax == null ? 0 : c1052ax.e) + (c1052ax == null ? 0 : c1052ax.d) + (c1052ax == null ? 0 : c1052ax.c) + (c1052ax == null ? 0 : c1052ax.b) > 0) {
                if (viewGroupH.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupH.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC1247cx);
                }
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = (AbstractComponentCallbacksC1247cx) viewGroupH.getTag(R.id.visible_removing_fragment_view_tag);
                C1052ax c1052ax2 = abstractComponentCallbacksC1247cx.V;
                boolean z = c1052ax2 != null ? c1052ax2.a : false;
                if (abstractComponentCallbacksC1247cx2.V == null) {
                    return;
                }
                abstractComponentCallbacksC1247cx2.g().a = z;
            }
        }
    }

    public final HashSet e() {
        C0581Ll c0581Ll;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.s().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0670Ox) it.next()).c.R;
            if (viewGroup != null) {
                AbstractC1474fG.j(J(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0581Ll) {
                    c0581Ll = (C0581Ll) tag;
                } else {
                    c0581Ll = new C0581Ll(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0581Ll);
                }
                hashSet.add(c0581Ll);
            }
        }
        return hashSet;
    }

    public final void e0() {
        for (C0670Ox c0670Ox : this.c.s()) {
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
            if (abstractComponentCallbacksC1247cx.T) {
                if (this.b) {
                    this.J = true;
                } else {
                    abstractComponentCallbacksC1247cx.T = false;
                    c0670Ox.k();
                }
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((F7) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = ((C0774Sx) it.next()).b;
                if (abstractComponentCallbacksC1247cx != null && (viewGroup = abstractComponentCallbacksC1247cx.R) != null) {
                    hashSet.add(C0581Ll.i(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new BL());
        C1442ex c1442ex = this.v;
        try {
            if (c1442ex != null) {
                c1442ex.s.dump("  ", null, printWriter, new String[0]);
            } else {
                v("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final C0670Ox g(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        String str = abstractComponentCallbacksC1247cx.p;
        C1583gR c1583gR = this.c;
        C0670Ox c0670Ox = (C0670Ox) ((HashMap) c1583gR.n).get(str);
        if (c0670Ox != null) {
            return c0670Ox;
        }
        C0670Ox c0670Ox2 = new C0670Ox(this.n, c1583gR, abstractComponentCallbacksC1247cx);
        c0670Ox2.m(this.v.p.getClassLoader());
        c0670Ox2.e = this.u;
        return c0670Ox2;
    }

    public final void g0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    C0781Te c0781Te = this.i;
                    c0781Te.a = true;
                    InterfaceC0360Cy interfaceC0360Cy = c0781Te.c;
                    if (interfaceC0360Cy != null) {
                        interfaceC0360Cy.c();
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        toString();
                    }
                    return;
                }
                boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && O(this.x);
                if (Log.isLoggable("FragmentManager", 3)) {
                    toString();
                }
                C0781Te c0781Te2 = this.i;
                c0781Te2.a = z;
                InterfaceC0360Cy interfaceC0360Cy2 = c0781Te2.c;
                if (interfaceC0360Cy2 != null) {
                    interfaceC0360Cy2.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(abstractComponentCallbacksC1247cx);
        }
        if (abstractComponentCallbacksC1247cx.N) {
            return;
        }
        abstractComponentCallbacksC1247cx.N = true;
        if (abstractComponentCallbacksC1247cx.v) {
            if (Log.isLoggable("FragmentManager", 2)) {
                abstractComponentCallbacksC1247cx.toString();
            }
            C1583gR c1583gR = this.c;
            synchronized (((ArrayList) c1583gR.m)) {
                ((ArrayList) c1583gR.m).remove(abstractComponentCallbacksC1247cx);
            }
            abstractComponentCallbacksC1247cx.v = false;
            if (L(abstractComponentCallbacksC1247cx)) {
                this.F = true;
            }
            d0(abstractComponentCallbacksC1247cx);
        }
    }

    public final void i(boolean z) {
        if (z && (this.v instanceof InterfaceC1978kW)) {
            f0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null) {
                abstractComponentCallbacksC1247cx.Q = true;
                if (z) {
                    abstractComponentCallbacksC1247cx.H.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null) {
                if (!abstractComponentCallbacksC1247cx.M ? abstractComponentCallbacksC1247cx.H.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null && N(abstractComponentCallbacksC1247cx)) {
                if (!abstractComponentCallbacksC1247cx.M ? abstractComponentCallbacksC1247cx.H.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC1247cx);
                    z = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = (AbstractComponentCallbacksC1247cx) this.e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC1247cx2)) {
                    abstractComponentCallbacksC1247cx2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.I = true;
        z(true);
        w();
        C1442ex c1442ex = this.v;
        boolean z = c1442ex instanceof InterfaceC1047au0;
        C1583gR c1583gR = this.c;
        if (z) {
            zIsChangingConfigurations = ((C0307Ax) c1583gR.p).f;
        } else {
            Context context = c1442ex.p;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                for (String str : ((H7) it.next()).l) {
                    C0307Ax c0307Ax = (C0307Ax) c1583gR.p;
                    c0307Ax.getClass();
                    Log.isLoggable("FragmentManager", 3);
                    c0307Ax.e(str, false);
                }
            }
        }
        u(-1);
        C1442ex c1442ex2 = this.v;
        if (c1442ex2 instanceof InterfaceC2657rW) {
            c1442ex2.N(this.q);
        }
        C1442ex c1442ex3 = this.v;
        if (c1442ex3 instanceof InterfaceC1978kW) {
            c1442ex3.K(this.p);
        }
        C1442ex c1442ex4 = this.v;
        if (c1442ex4 instanceof InterfaceC2270nW) {
            c1442ex4.L(this.r);
        }
        C1442ex c1442ex5 = this.v;
        if (c1442ex5 instanceof InterfaceC2367oW) {
            c1442ex5.M(this.s);
        }
        C1442ex c1442ex6 = this.v;
        if ((c1442ex6 instanceof InterfaceC1094bQ) && this.x == null) {
            c1442ex6.J(this.t);
        }
        this.v = null;
        this.w = null;
        this.x = null;
        if (this.g != null) {
            Iterator it2 = this.i.b.iterator();
            while (it2.hasNext()) {
                ((InterfaceC1496fb) it2.next()).cancel();
            }
            this.g = null;
        }
        N1 n1 = this.B;
        if (n1 != null) {
            n1.b();
            this.C.b();
            this.D.b();
        }
    }

    public final void m(boolean z) {
        if (z && (this.v instanceof InterfaceC2657rW)) {
            f0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null) {
                abstractComponentCallbacksC1247cx.Q = true;
                if (z) {
                    abstractComponentCallbacksC1247cx.H.m(true);
                }
            }
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z2 && (this.v instanceof InterfaceC2270nW)) {
            f0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null && z2) {
                abstractComponentCallbacksC1247cx.H.n(z, true);
            }
        }
    }

    public final void o() {
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.t()) {
            if (abstractComponentCallbacksC1247cx != null) {
                abstractComponentCallbacksC1247cx.u();
                abstractComponentCallbacksC1247cx.H.o();
            }
        }
    }

    public final boolean p() {
        if (this.u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null) {
                if (!abstractComponentCallbacksC1247cx.M ? abstractComponentCallbacksC1247cx.H.p() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.u < 1) {
            return;
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null && !abstractComponentCallbacksC1247cx.M) {
                abstractComponentCallbacksC1247cx.H.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        if (abstractComponentCallbacksC1247cx != null) {
            if (abstractComponentCallbacksC1247cx.equals(this.c.o(abstractComponentCallbacksC1247cx.p))) {
                abstractComponentCallbacksC1247cx.F.getClass();
                boolean zO = O(abstractComponentCallbacksC1247cx);
                Boolean bool = abstractComponentCallbacksC1247cx.u;
                if (bool == null || bool.booleanValue() != zO) {
                    abstractComponentCallbacksC1247cx.u = Boolean.valueOf(zO);
                    C3289xx c3289xx = abstractComponentCallbacksC1247cx.H;
                    c3289xx.g0();
                    c3289xx.r(c3289xx.y);
                }
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        if (z2 && (this.v instanceof InterfaceC2367oW)) {
            f0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null && z2) {
                abstractComponentCallbacksC1247cx.H.s(z, true);
            }
        }
    }

    public final boolean t() {
        if (this.u < 1) {
            return false;
        }
        boolean z = false;
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx : this.c.x()) {
            if (abstractComponentCallbacksC1247cx != null && N(abstractComponentCallbacksC1247cx)) {
                if (!abstractComponentCallbacksC1247cx.M ? abstractComponentCallbacksC1247cx.H.t() : false) {
                    z = true;
                }
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = this.x;
        if (abstractComponentCallbacksC1247cx != null) {
            sb.append(abstractComponentCallbacksC1247cx.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.x)));
            sb.append("}");
        } else {
            C1442ex c1442ex = this.v;
            if (c1442ex != null) {
                sb.append(c1442ex.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (C0670Ox c0670Ox : ((HashMap) this.c.n).values()) {
                if (c0670Ox != null) {
                    c0670Ox.e = i;
                }
            }
            Q(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0581Ll) it.next()).h();
            }
            this.b = false;
            z(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strD = AbstractC1701hf0.d(str, "    ");
        C1583gR c1583gR = this.c;
        c1583gR.getClass();
        String str2 = str + "    ";
        HashMap map = (HashMap) c1583gR.n;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0670Ox c0670Ox : map.values()) {
                printWriter.print(str);
                if (c0670Ox != null) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
                    printWriter.println(abstractComponentCallbacksC1247cx);
                    abstractComponentCallbacksC1247cx.getClass();
                    printWriter.print(str2);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC1247cx.J));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC1247cx.K));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC1247cx.L);
                    printWriter.print(str2);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC1247cx.l);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC1247cx.p);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC1247cx.E);
                    printWriter.print(str2);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC1247cx.v);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC1247cx.w);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC1247cx.z);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC1247cx.A);
                    printWriter.print(str2);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC1247cx.M);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC1247cx.N);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC1247cx.P);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str2);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC1247cx.O);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC1247cx.U);
                    if (abstractComponentCallbacksC1247cx.F != null) {
                        printWriter.print(str2);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC1247cx.F);
                    }
                    if (abstractComponentCallbacksC1247cx.G != null) {
                        printWriter.print(str2);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC1247cx.G);
                    }
                    if (abstractComponentCallbacksC1247cx.I != null) {
                        printWriter.print(str2);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC1247cx.I);
                    }
                    if (abstractComponentCallbacksC1247cx.q != null) {
                        printWriter.print(str2);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC1247cx.q);
                    }
                    if (abstractComponentCallbacksC1247cx.m != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC1247cx.m);
                    }
                    if (abstractComponentCallbacksC1247cx.n != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC1247cx.n);
                    }
                    if (abstractComponentCallbacksC1247cx.f728o != null) {
                        printWriter.print(str2);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC1247cx.f728o);
                    }
                    Object objP = abstractComponentCallbacksC1247cx.p(false);
                    if (objP != null) {
                        printWriter.print(str2);
                        printWriter.print("mTarget=");
                        printWriter.print(objP);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC1247cx.t);
                    }
                    printWriter.print(str2);
                    printWriter.print("mPopDirection=");
                    C1052ax c1052ax = abstractComponentCallbacksC1247cx.V;
                    printWriter.println(c1052ax == null ? false : c1052ax.a);
                    C1052ax c1052ax2 = abstractComponentCallbacksC1247cx.V;
                    if ((c1052ax2 == null ? 0 : c1052ax2.b) != 0) {
                        printWriter.print(str2);
                        printWriter.print("getEnterAnim=");
                        C1052ax c1052ax3 = abstractComponentCallbacksC1247cx.V;
                        printWriter.println(c1052ax3 == null ? 0 : c1052ax3.b);
                    }
                    C1052ax c1052ax4 = abstractComponentCallbacksC1247cx.V;
                    if ((c1052ax4 == null ? 0 : c1052ax4.c) != 0) {
                        printWriter.print(str2);
                        printWriter.print("getExitAnim=");
                        C1052ax c1052ax5 = abstractComponentCallbacksC1247cx.V;
                        printWriter.println(c1052ax5 == null ? 0 : c1052ax5.c);
                    }
                    C1052ax c1052ax6 = abstractComponentCallbacksC1247cx.V;
                    if ((c1052ax6 == null ? 0 : c1052ax6.d) != 0) {
                        printWriter.print(str2);
                        printWriter.print("getPopEnterAnim=");
                        C1052ax c1052ax7 = abstractComponentCallbacksC1247cx.V;
                        printWriter.println(c1052ax7 == null ? 0 : c1052ax7.d);
                    }
                    C1052ax c1052ax8 = abstractComponentCallbacksC1247cx.V;
                    if ((c1052ax8 == null ? 0 : c1052ax8.e) != 0) {
                        printWriter.print(str2);
                        printWriter.print("getPopExitAnim=");
                        C1052ax c1052ax9 = abstractComponentCallbacksC1247cx.V;
                        printWriter.println(c1052ax9 == null ? 0 : c1052ax9.e);
                    }
                    if (abstractComponentCallbacksC1247cx.R != null) {
                        printWriter.print(str2);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC1247cx.R);
                    }
                    if (abstractComponentCallbacksC1247cx.S != null) {
                        printWriter.print(str2);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC1247cx.S);
                    }
                    if (abstractComponentCallbacksC1247cx.j() != null) {
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
                            printWriter.print(str2);
                            printWriter.println("Loaders:");
                            if (c2866tf0.h() > 0) {
                                AbstractC1674hK.w(c2866tf0.j(0));
                                printWriter.print(str2);
                                printWriter.print("  #");
                                printWriter.print(c2866tf0.e(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str2);
                    printWriter.println("Child " + abstractComponentCallbacksC1247cx.H + ":");
                    abstractComponentCallbacksC1247cx.H.v(AbstractC1701hf0.d(str2, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c1583gR.m;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = (AbstractComponentCallbacksC1247cx) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1247cx2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx3 = (AbstractComponentCallbacksC1247cx) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC1247cx3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                F7 f7 = (F7) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(f7.toString());
                f7.g(strD, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (InterfaceC2901tx) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.w);
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0581Ll) it.next()).h();
        }
    }

    public final void x(InterfaceC2901tx interfaceC2901tx, boolean z) {
        if (!z) {
            if (this.v == null) {
                if (!this.I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (P()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.v == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(interfaceC2901tx);
                    Z();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.v == null) {
            if (!this.I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.v.q.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && P()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.K == null) {
            this.K = new ArrayList();
            this.L = new ArrayList();
        }
    }

    public final boolean z(boolean z) {
        boolean zA;
        y(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.K;
            ArrayList arrayList2 = this.L;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((InterfaceC2901tx) this.a.get(i)).a(arrayList, arrayList2);
                        }
                        this.a.clear();
                        this.v.q.removeCallbacks(this.O);
                    } catch (Throwable th) {
                        this.a.clear();
                        this.v.q.removeCallbacks(this.O);
                        throw th;
                    }
                }
            }
            if (!zA) {
                break;
            }
            z2 = true;
            this.b = true;
            try {
                W(this.K, this.L);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        g0();
        if (this.J) {
            this.J = false;
            e0();
        }
        ((HashMap) this.c.n).values().removeAll(Collections.singleton(null));
        return z2;
    }
}
