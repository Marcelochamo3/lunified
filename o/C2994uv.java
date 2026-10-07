package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.skidush.clonex.R;
import io.sentry.android.core.C0020q;
import java.io.IOException;
import java.nio.charset.Charset;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.uv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2994uv implements InterfaceC0602Mh, InterfaceC2604qt0, IP, InterfaceC0376Do, InterfaceC1391eV, InterfaceC0803Ua, InterfaceC2486pj, M20, K8, InterfaceC1512fj, InterfaceC1912jo, InterfaceC2967uh0 {
    public final /* synthetic */ int l;
    public Object m;
    public Object n;

    public /* synthetic */ C2994uv(int i, boolean z) {
        this.l = i;
    }

    public static C2994uv d0(LayoutInflater layoutInflater, RecyclerView recyclerView) {
        View viewInflate = layoutInflater.inflate(R.layout.item_see_all_tv, (ViewGroup) recyclerView, false);
        CardView cardView = (CardView) Sr0.g(viewInflate, R.id.cv_see_all);
        if (cardView != null) {
            return new C2994uv((ConstraintLayout) viewInflate, 10, cardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.cv_see_all)));
    }

    @Override // o.InterfaceC1912jo
    public void A() {
        K50 k50 = (K50) this.m;
        synchronized (k50) {
            k50.n = k50.l.length;
        }
    }

    @Override // o.IP
    public void B(int i, CP cp, C2069lP c2069lP) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new NP(this, pairX, c2069lP, 0));
        }
    }

    @Override // o.IP
    public void C(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new LP(this, pairX, c0991aL, c2069lP, 2));
        }
    }

    @Override // o.InterfaceC0376Do
    public void D(int i, CP cp) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new MP(this, pairX, 2));
        }
    }

    @Override // o.InterfaceC0803Ua
    public void E(A50 a50, IOException iOException) {
        try {
            ((InterfaceC0777Ta) this.m).w((MV) this.n, iOException);
        } catch (Throwable th) {
            UK.U(th);
        }
    }

    public void F(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.F(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // o.InterfaceC2967uh0
    public int G() {
        return ((long[]) this.m).length;
    }

    @Override // o.InterfaceC2486pj
    public InterfaceC2583qj H() {
        return new PV((InterfaceC0595Ma) this.n, (C2994uv) this.m);
    }

    public void I(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.I(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void J(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.J(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // o.IP
    public void K(int i, CP cp, C2069lP c2069lP) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new NP(this, pairX, c2069lP, 1));
        }
    }

    @Override // o.IP
    public void L(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new LP(this, pairX, c0991aL, c2069lP, 0));
        }
    }

    public void M(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        C3289xx c3289xx = (C3289xx) this.m;
        Context context = c3289xx.v.p;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c3289xx.x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.M(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void N(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.N(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void O(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.O(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void P(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, Bundle bundle, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.P(abstractComponentCallbacksC1247cx, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void Q(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.Q(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void R(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.R(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void S(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, View view, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractC1474fG.j(view, "v");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.S(abstractComponentCallbacksC1247cx, view, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void T(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.T(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void U(int i) {
        int[] iArr = (int[]) this.m;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.m = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.m = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.m;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public Object V(InterfaceC1747i20 interfaceC1747i20) {
        HashMap map = (HashMap) this.n;
        C3314yA c3314yA = (C3314yA) map.get(interfaceC1747i20);
        if (c3314yA == null) {
            c3314yA = new C3314yA(interfaceC1747i20);
            map.put(interfaceC1747i20, c3314yA);
        } else {
            interfaceC1747i20.a();
        }
        C3314yA c3314yA2 = c3314yA.d;
        c3314yA2.c = c3314yA.c;
        c3314yA.c.d = c3314yA2;
        C3314yA c3314yA3 = (C3314yA) this.m;
        c3314yA.d = c3314yA3;
        C3314yA c3314yA4 = c3314yA3.c;
        c3314yA.c = c3314yA4;
        c3314yA4.d = c3314yA;
        c3314yA.d.c = c3314yA;
        ArrayList arrayList = c3314yA.b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c3314yA.b.remove(size - 1);
        }
        return null;
    }

    public synchronized ArrayList W(Class cls) {
        return ((C1583gR) this.m).w(cls);
    }

    public Pair X(int i, CP cp) {
        CP cpB;
        PP pp = (PP) this.m;
        CP cp2 = null;
        if (cp != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= pp.c.size()) {
                    cpB = null;
                    break;
                }
                if (((CP) pp.c.get(i2)).d == cp.d) {
                    Object obj = pp.b;
                    int i3 = C1063b20.v;
                    cpB = cp.b(Pair.create(obj, cp.a));
                    break;
                }
                i2++;
            }
            if (cpB == null) {
                return null;
            }
            cp2 = cpB;
        }
        return Pair.create(Integer.valueOf(i + pp.d), cp2);
    }

    public synchronized List Y(String str) {
        List arrayList;
        if (!((ArrayList) this.m).contains(str)) {
            ((ArrayList) this.m).add(str);
        }
        arrayList = (List) ((HashMap) this.n).get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            ((HashMap) this.n).put(str, arrayList);
        }
        return arrayList;
    }

    public ComponentCallbacks2C3406z70 Z(Context context, com.bumptech.glide.a aVar, C1478fK c1478fK, C3289xx c3289xx, boolean z) {
        Kr0.a();
        Kr0.a();
        HashMap map = (HashMap) this.m;
        ComponentCallbacks2C3406z70 componentCallbacks2C3406z70 = (ComponentCallbacks2C3406z70) map.get(c1478fK);
        if (componentCallbacks2C3406z70 != null) {
            return componentCallbacks2C3406z70;
        }
        C0990aK c0990aK = new C0990aK(c1478fK);
        C0519Jb c0519Jb = new C0519Jb(this, c3289xx);
        ((C3325yL) this.n).getClass();
        ComponentCallbacks2C3406z70 componentCallbacks2C3406z71 = new ComponentCallbacks2C3406z70(aVar, c0990aK, c0519Jb, context);
        map.put(c1478fK, componentCallbacks2C3406z71);
        c0990aK.c(new C1576gK(this, c1478fK));
        if (z) {
            componentCallbacks2C3406z71.j();
        }
        return componentCallbacks2C3406z71;
    }

    @Override // o.M20
    public void a(Preference preference) {
        ((PreferenceGroup) this.m).d0 = Integer.MAX_VALUE;
        V20 v20 = (V20) this.n;
        Handler handler = v20.h;
        RunnableC3102w1 runnableC3102w1 = v20.i;
        handler.removeCallbacks(runnableC3102w1);
        handler.post(runnableC3102w1);
    }

    public synchronized ArrayList a0(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.m).iterator();
        while (it.hasNext()) {
            List<R70> list = (List) ((HashMap) this.n).get((String) it.next());
            if (list != null) {
                for (R70 r70 : list) {
                    if (r70.a.isAssignableFrom(cls) && cls2.isAssignableFrom(r70.b) && !arrayList.contains(r70.b)) {
                        arrayList.add(r70.b);
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // o.InterfaceC2604qt0
    public View b() {
        return (ConstraintLayout) this.m;
    }

    public String b0(InterfaceC2450pI interfaceC2450pI) {
        String strS;
        synchronized (((C0020q) this.m)) {
            strS = (String) ((C0020q) this.m).a(interfaceC2450pI);
        }
        if (strS == null) {
            strS = s(interfaceC2450pI);
        }
        synchronized (((C0020q) this.m)) {
            ((C0020q) this.m).d(interfaceC2450pI, strS);
        }
        return strS;
    }

    @Override // o.InterfaceC0376Do
    public void c(int i, CP cp) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new MP(this, pairX, 1));
        }
    }

    public synchronized Map c0() {
        try {
            if (((Map) this.n) == null) {
                this.n = Collections.unmodifiableMap(new HashMap((HashMap) this.m));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.n;
    }

    @Override // o.InterfaceC1512fj
    public void d(Exception exc) {
        C2188mf0 c2188mf0 = (C2188mf0) this.n;
        PQ pq = (PQ) this.m;
        PQ pq2 = c2188mf0.q;
        if (pq2 == null || pq2 != pq) {
            return;
        }
        C2188mf0 c2188mf1 = (C2188mf0) this.n;
        PQ pq3 = (PQ) this.m;
        InterfaceC1708hj interfaceC1708hj = c2188mf1.m;
        C1414ej c1414ej = c2188mf1.r;
        InterfaceC1610gj interfaceC1610gj = pq3.c;
        interfaceC1708hj.b(c1414ej, exc, interfaceC1610gj, interfaceC1610gj.c());
    }

    @Override // o.InterfaceC2967uh0
    public int e(long j) {
        long[] jArr = (long[]) this.m;
        int iB = Lr0.b(jArr, j, false);
        if (iB < jArr.length) {
            return iB;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0012  */
    public int e0(int i) {
        int i2;
        int[] iArr = (int[]) this.m;
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        List list = (List) this.n;
        if (list == null) {
            i2 = -1;
        } else {
            C1409eg0 c1409eg0 = null;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1409eg0 c1409eg1 = (C1409eg0) ((List) this.n).get(size);
                    if (c1409eg1.l == i) {
                        c1409eg0 = c1409eg1;
                        break;
                    }
                }
            }
            if (c1409eg0 != null) {
                ((List) this.n).remove(c1409eg0);
            }
            int size2 = ((List) this.n).size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    i3 = -1;
                    break;
                }
                if (((C1409eg0) ((List) this.n).get(i3)).l >= i) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                C1409eg0 c1409eg2 = (C1409eg0) ((List) this.n).get(i3);
                ((List) this.n).remove(i3);
                i2 = c1409eg2.l;
            } else {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            int[] iArr2 = (int[]) this.m;
            Arrays.fill(iArr2, i, iArr2.length, -1);
            return ((int[]) this.m).length;
        }
        int iMin = Math.min(i2 + 1, ((int[]) this.m).length);
        Arrays.fill((int[]) this.m, i, iMin, -1);
        return iMin;
    }

    @Override // o.InterfaceC1512fj
    public void f(Object obj) {
        C2188mf0 c2188mf0 = (C2188mf0) this.n;
        PQ pq = (PQ) this.m;
        PQ pq2 = c2188mf0.q;
        if (pq2 == null || pq2 != pq) {
            return;
        }
        C2188mf0 c2188mf1 = (C2188mf0) this.n;
        PQ pq3 = (PQ) this.m;
        C0789Tm c0789Tm = c2188mf1.l.p;
        if (obj != null && c0789Tm.c(pq3.c.c())) {
            c2188mf1.p = obj;
            c2188mf1.m.a();
        } else {
            InterfaceC1708hj interfaceC1708hj = c2188mf1.m;
            InterfaceC2450pI interfaceC2450pI = pq3.a;
            InterfaceC1610gj interfaceC1610gj = pq3.c;
            interfaceC1708hj.d(interfaceC2450pI, obj, interfaceC1610gj, interfaceC1610gj.c(), c2188mf1.r);
        }
    }

    public void f0(int i, int i2) {
        int[] iArr = (int[]) this.m;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        U(i3);
        int[] iArr2 = (int[]) this.m;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.m, i, i3, -1);
        List list = (List) this.n;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            C1409eg0 c1409eg0 = (C1409eg0) ((List) this.n).get(size);
            int i4 = c1409eg0.l;
            if (i4 >= i) {
                c1409eg0.l = i4 + i2;
            }
        }
    }

    @Override // o.IP
    public void g(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new LP(this, pairX, c0991aL, c2069lP, 1));
        }
    }

    public void g0(int i, int i2) {
        int[] iArr = (int[]) this.m;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        U(i3);
        int[] iArr2 = (int[]) this.m;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.m;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        List list = (List) this.n;
        if (list == null) {
            return;
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            C1409eg0 c1409eg0 = (C1409eg0) ((List) this.n).get(size);
            int i4 = c1409eg0.l;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((List) this.n).remove(size);
                } else {
                    c1409eg0.l = i4 - i2;
                }
            }
        }
    }

    @Override // o.InterfaceC2967uh0
    public long h(int i) {
        AbstractC0397Ej.c(i >= 0);
        long[] jArr = (long[]) this.m;
        AbstractC0397Ej.c(i < jArr.length);
        return jArr[i];
    }

    public void h0(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((S5) this.n)) {
            ((S5) this.n).put(new C3332yS(cls, cls2, cls3), list);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00e9  */
    @Override // o.K8
    public J8 i(C0554Kk c0554Kk, long j) {
        int iA;
        J8 j8;
        long j2 = c0554Kk.f369o;
        int iMin = (int) Math.min(20000L, c0554Kk.n - j2);
        C2562qX c2562qX = (C2562qX) this.n;
        c2562qX.C(iMin);
        c0554Kk.x(c2562qX.a, 0, iMin, false);
        int i = -1;
        long j3 = -9223372036854775807L;
        int i2 = -1;
        while (c2562qX.a() >= 4) {
            if (C2607qv.a(c2562qX.b, c2562qX.a) != 442) {
                c2562qX.G(1);
            } else {
                c2562qX.G(4);
                long jC = C2528q40.c(c2562qX);
                if (jC != -9223372036854775807L) {
                    long jB = ((Oj0) this.m).b(jC);
                    if (jB > j) {
                        if (j3 == -9223372036854775807L) {
                            return new J8(-1, jB, j2);
                        }
                        j8 = new J8(0, -9223372036854775807L, j2 + ((long) i2));
                    } else if (100000 + jB > j) {
                        j8 = new J8(0, -9223372036854775807L, j2 + ((long) c2562qX.b));
                    } else {
                        i2 = c2562qX.b;
                        j3 = jB;
                    }
                    return j8;
                }
                int i3 = c2562qX.c;
                if (c2562qX.a() >= 10) {
                    c2562qX.G(9);
                    int iU = c2562qX.u() & 7;
                    if (c2562qX.a() >= iU) {
                        c2562qX.G(iU);
                        if (c2562qX.a() >= 4) {
                            if (C2607qv.a(c2562qX.b, c2562qX.a) != 443) {
                                while (c2562qX.a() >= 4) {
                                    iA = C2607qv.a(c2562qX.b, c2562qX.a);
                                    if (iA == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            c2562qX.G(4);
                            int iZ = c2562qX.z();
                            if (c2562qX.a() < iZ) {
                                c2562qX.F(i3);
                            } else {
                                c2562qX.G(iZ);
                                while (c2562qX.a() >= 4) {
                                    iA = C2607qv.a(c2562qX.b, c2562qX.a);
                                    if (iA == 442 || iA == 441 || (iA >>> 8) != 1) {
                                        break;
                                    }
                                    c2562qX.G(4);
                                    if (c2562qX.a() < 2) {
                                        c2562qX.F(i3);
                                        break;
                                    }
                                    c2562qX.F(Math.min(c2562qX.c, c2562qX.b + c2562qX.z()));
                                }
                            }
                        } else {
                            c2562qX.F(i3);
                        }
                    } else {
                        c2562qX.F(i3);
                    }
                } else {
                    c2562qX.F(i3);
                }
                i = c2562qX.b;
            }
        }
        return j3 != -9223372036854775807L ? new J8(-2, j3, j2 + ((long) i)) : J8.d;
    }

    public void i0(InterfaceC1747i20 interfaceC1747i20, Object obj) {
        HashMap map = (HashMap) this.n;
        C3314yA c3314yA = (C3314yA) map.get(interfaceC1747i20);
        if (c3314yA == null) {
            c3314yA = new C3314yA(interfaceC1747i20);
            c3314yA.c = c3314yA;
            c3314yA.d = c3314yA;
            C3314yA c3314yA2 = (C3314yA) this.m;
            c3314yA.d = c3314yA2.d;
            c3314yA.c = c3314yA2;
            c3314yA2.d = c3314yA;
            c3314yA.d.c = c3314yA;
            map.put(interfaceC1747i20, c3314yA);
        } else {
            interfaceC1747i20.a();
        }
        if (c3314yA.b == null) {
            c3314yA.b = new ArrayList();
        }
        c3314yA.b.add(obj);
    }

    @Override // o.InterfaceC0376Do
    public void j(int i, CP cp) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new MP(this, pairX, 0));
        }
    }

    public Object j0() {
        C3314yA c3314yA = (C3314yA) this.m;
        C3314yA c3314yA2 = c3314yA.d;
        while (true) {
            if (c3314yA2.equals(c3314yA)) {
                return null;
            }
            ArrayList arrayList = c3314yA2.b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c3314yA2.b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C3314yA c3314yA3 = c3314yA2.d;
            c3314yA3.c = c3314yA2.c;
            c3314yA2.c.d = c3314yA3;
            HashMap map = (HashMap) this.n;
            Object obj = c3314yA2.a;
            map.remove(obj);
            ((InterfaceC1747i20) obj).a();
            c3314yA2 = c3314yA2.d;
        }
    }

    @Override // o.InterfaceC0376Do
    public void k(int i, CP cp, int i2) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new RunnableC2976um(this, pairX, i2, 3));
        }
    }

    @Override // o.InterfaceC0602Mh
    public Object l(Object obj) {
        Charset charsetA;
        AbstractC2051l80 abstractC2051l80 = (AbstractC2051l80) obj;
        C1953k80 c1953k80 = abstractC2051l80.l;
        if (c1953k80 == null) {
            N9 n9P = abstractC2051l80.p();
            TP tpL = abstractC2051l80.l();
            if (tpL == null || (charsetA = tpL.a(AbstractC1305dd.a)) == null) {
                charsetA = AbstractC1305dd.a;
            }
            c1953k80 = new C1953k80(n9P, charsetA);
            abstractC2051l80.l = c1953k80;
        }
        BA ba = (BA) this.m;
        ba.getClass();
        WH wh = new WH(c1953k80);
        wh.m = ba.j;
        try {
            Object objA = ((AbstractC3177wp0) this.n).a(wh);
            if (wh.j0() != 10) {
                throw new RH("JSON document was not fully consumed.");
            }
            abstractC2051l80.close();
            return objA;
        } catch (Throwable th) {
            abstractC2051l80.close();
            throw th;
        }
    }

    @Override // o.InterfaceC1391eV
    public void m(AbstractC1099bV abstractC1099bV, int i) {
        if (abstractC1099bV.w().equals("#text")) {
            return;
        }
        try {
            abstractC1099bV.A((Appendable) this.m, i, (C0634Nn) this.n);
        } catch (IOException e) {
            throw new C0730Rf(e);
        }
    }

    @Override // o.InterfaceC1391eV
    public void n(AbstractC1099bV abstractC1099bV, int i) {
        try {
            abstractC1099bV.z((Appendable) this.m, i, (C0634Nn) this.n);
        } catch (IOException e) {
            throw new C0730Rf(e);
        }
    }

    @Override // o.IP
    public void o(int i, CP cp, C0991aL c0991aL, C2069lP c2069lP, IOException iOException, boolean z) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new FP(this, pairX, c0991aL, c2069lP, iOException, z, 1));
        }
    }

    @Override // o.InterfaceC0803Ua
    public void p(A50 a50, C1855j80 c1855j80) {
        InterfaceC0777Ta interfaceC0777Ta = (InterfaceC0777Ta) this.m;
        MV mv = (MV) this.n;
        try {
            try {
                interfaceC0777Ta.E(mv, mv.d(c1855j80));
            } catch (Throwable th) {
                UK.U(th);
            }
        } catch (Throwable th2) {
            UK.U(th2);
            try {
                interfaceC0777Ta.w(mv, th2);
            } catch (Throwable th3) {
                UK.U(th3);
            }
        }
    }

    @Override // o.K8
    public void q() {
        byte[] bArr = Lr0.e;
        C2562qX c2562qX = (C2562qX) this.n;
        c2562qX.getClass();
        c2562qX.D(bArr.length, bArr);
    }

    @Override // o.InterfaceC1912jo
    public void r(Bitmap bitmap, Q8 q8) throws IOException {
        IOException iOException = ((C2308nr) this.n).m;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            q8.d(bitmap);
            throw iOException;
        }
    }

    public String s(InterfaceC2450pI interfaceC2450pI) {
        String str;
        C3119w90 c3119w90 = (C3119w90) ((Na0) this.n).n();
        try {
            interfaceC2450pI.a(c3119w90.l);
            byte[] bArrDigest = c3119w90.l.digest();
            char[] cArr = Kr0.b;
            synchronized (cArr) {
                for (int i = 0; i < bArrDigest.length; i++) {
                    byte b = bArrDigest[i];
                    int i2 = i * 2;
                    char[] cArr2 = Kr0.a;
                    cArr[i2] = cArr2[(b & 255) >>> 4];
                    cArr[i2 + 1] = cArr2[b & 15];
                }
                str = new String(cArr);
            }
            ((Na0) this.n).e(c3119w90);
            return str;
        } catch (Throwable th) {
            ((Na0) this.n).e(c3119w90);
            throw th;
        }
    }

    @Override // o.InterfaceC2967uh0
    public List t(long j) {
        C3162wi c3162wi;
        int iF = Lr0.f((long[]) this.m, j, false);
        return (iF == -1 || (c3162wi = ((C3162wi[]) this.n)[iF]) == C3162wi.C) ? Collections.emptyList() : Collections.singletonList(c3162wi);
    }

    public String toString() {
        switch (this.l) {
            case 6:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C3314yA c3314yA = (C3314yA) this.m;
                C3314yA c3314yA2 = c3314yA.c;
                boolean z = false;
                while (!c3314yA2.equals(c3314yA)) {
                    sb.append('{');
                    sb.append(c3314yA2.a);
                    sb.append(':');
                    ArrayList arrayList = c3314yA2.b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c3314yA2 = c3314yA2.c;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 21:
                String string = "[ ";
                if (((C1798if0) this.m) != null) {
                    for (int i = 0; i < 9; i++) {
                        StringBuilder sbK = AbstractC1701hf0.k(string);
                        sbK.append(((C1798if0) this.m).s[i]);
                        sbK.append(" ");
                        string = sbK.toString();
                    }
                }
                StringBuilder sbS = AbstractC1674hK.s(string, "] ");
                sbS.append((C1798if0) this.m);
                return sbS.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        switch (this.l) {
            case 1:
                this.m = null;
                this.n = null;
                break;
            default:
                int[] iArr = (int[]) this.m;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.n = null;
                break;
        }
    }

    public void v(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.v(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public void w(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        C3289xx c3289xx = (C3289xx) this.m;
        Context context = c3289xx.v.p;
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c3289xx.x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.w(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    @Override // o.InterfaceC0376Do
    public void x(int i, CP cp) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new MP(this, pairX, 3));
        }
    }

    @Override // o.InterfaceC0376Do
    public void y(int i, CP cp, Exception exc) {
        Pair pairX = X(i, cp);
        if (pairX != null) {
            ((Uh0) ((InterfaceC1274dB) ((QP) this.n).j)).c(new RunnableC1169c7(this, pairX, exc, 8));
        }
    }

    public void z(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "f");
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = ((C3289xx) this.m).x;
        if (abstractComponentCallbacksC1247cx2 != null) {
            abstractComponentCallbacksC1247cx2.l().n.z(abstractComponentCallbacksC1247cx, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.n).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            if (!z) {
                throw null;
            }
            throw null;
        }
    }

    public /* synthetic */ C2994uv(Object obj, int i, Object obj2) {
        this.l = i;
        this.m = obj;
        this.n = obj2;
    }

    public /* synthetic */ C2994uv(Object obj, Object obj2, int i, boolean z) {
        this.l = i;
        this.n = obj;
        this.m = obj2;
    }

    public C2994uv(int i) {
        this.l = i;
        switch (i) {
            case 8:
                this.m = new HashMap();
                break;
            case 11:
                this.m = new HashMap();
                this.n = new HashMap();
                break;
            case 15:
                this.m = new AtomicReference();
                this.n = new S5();
                break;
            case 23:
                this.m = new ArrayList();
                this.n = new HashMap();
                break;
            case 24:
                this.m = new C0020q(1000L);
                this.n = AbstractC2506pt.H(10, new C2743sL(11));
                break;
            default:
                this.m = new C3314yA(null);
                this.n = new HashMap();
                break;
        }
    }

    public C2994uv(C3325yL c3325yL) {
        this.l = 12;
        this.m = new HashMap();
        this.n = c3325yL;
    }

    public C2994uv(C3289xx c3289xx) {
        this.l = 3;
        AbstractC1474fG.j(c3289xx, "fragmentManager");
        this.m = c3289xx;
        this.n = new CopyOnWriteArrayList();
    }

    public C2994uv(Na0 na0) {
        this.l = 14;
        C1583gR c1583gR = new C1583gR(na0);
        this.n = new C2292nj(2);
        this.m = c1583gR;
    }

    public C2994uv(Context context) {
        this.l = 9;
        this.m = context;
        this.n = "image_manager_disk_cache";
    }

    public C2994uv(C1845j30 c1845j30) {
        this.l = 21;
        this.n = c1845j30;
    }

    public C2994uv(Locale locale) {
        this.l = 19;
        this.m = locale;
        this.n = DateFormatSymbols.getInstance(locale).getShortMonths();
        Calendar calendar = Calendar.getInstance(locale);
        int minimum = calendar.getMinimum(5);
        int maximum = calendar.getMaximum(5);
        String[] strArr = new String[(maximum - minimum) + 1];
        for (int i = minimum; i <= maximum; i++) {
            strArr[i - minimum] = String.format("%02d", Integer.valueOf(i));
        }
    }

    public C2994uv(Oj0 oj0) {
        this.l = 22;
        this.m = oj0;
        this.n = new C2562qX();
    }

    public C2994uv(OV ov) {
        this.l = 18;
        this.n = ov;
        this.m = new C2994uv(8);
    }

    public C2994uv(Animation animation) {
        this.l = 2;
        this.m = animation;
        this.n = null;
    }

    public C2994uv(Animator animator) {
        this.l = 2;
        this.m = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.n = animatorSet;
        animatorSet.play(animator);
    }

    public C2994uv(ArrayList arrayList, ArrayList arrayList2) {
        this.l = 5;
        int size = arrayList.size();
        this.m = new int[size];
        this.n = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.m)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.n)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C2994uv(int i, int i2) {
        this.l = 5;
        this.m = new int[]{i, i2};
        this.n = new float[]{0.0f, 1.0f};
    }

    public C2994uv(int i, int i2, int i3) {
        this.l = 5;
        this.m = new int[]{i, i2, i3};
        this.n = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C2994uv(StringBuilder sb, C0634Nn c0634Nn) {
        this.l = 16;
        this.m = sb;
        this.n = c0634Nn;
        c0634Nn.f417o.set(c0634Nn.m.newEncoder());
    }
}
