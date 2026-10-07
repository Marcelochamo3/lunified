package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class Cm0 implements Cloneable {
    public static final Animator[] K = new Animator[0];
    public static final int[] L = {2, 1, 3, 4};
    public static final C3325yL M = new C3325yL();
    public static final ThreadLocal N = new ThreadLocal();
    public long H;
    public Am0 I;
    public long J;
    public ArrayList v;
    public ArrayList w;
    public Bm0[] x;
    public final String l = getClass().getName();
    public long m = -1;
    public long n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TimeInterpolator f202o = null;
    public final ArrayList p = new ArrayList();
    public final ArrayList q = new ArrayList();
    public C2303no0 r = new C2303no0(13);
    public C2303no0 s = new C2303no0(13);
    public Im0 t = null;
    public final int[] u = L;
    public final ArrayList y = new ArrayList();
    public Animator[] z = K;
    public int A = 0;
    public boolean B = false;
    public boolean C = false;
    public Cm0 D = null;
    public ArrayList E = null;
    public ArrayList F = new ArrayList();
    public C3325yL G = M;

    public static boolean A(Lm0 lm0, Lm0 lm1, String str) {
        Object obj = lm0.a.get(str);
        Object obj2 = lm1.a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    public static void d(C2303no0 c2303no0, View view, Lm0 lm0) {
        ((S5) c2303no0.m).put(view, lm0);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c2303no0.n;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = It0.a;
        String strK = AbstractC3185wt0.k(view);
        if (strK != null) {
            S5 s5 = (S5) c2303no0.p;
            if (s5.containsKey(strK)) {
                s5.put(strK, null);
            } else {
                s5.put(strK, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1480fM c1480fM = (C1480fM) c2303no0.f941o;
                if (c1480fM.l) {
                    int i = c1480fM.f772o;
                    long[] jArr = c1480fM.m;
                    Object[] objArr = c1480fM.n;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != AbstractC3045vW.c) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    c1480fM.l = false;
                    c1480fM.f772o = i2;
                }
                if (Nr0.e(c1480fM.m, c1480fM.f772o, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1480fM.j(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1480fM.e(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1480fM.j(itemIdAtPosition, null);
                }
            }
        }
    }

    public static S5 t() {
        ThreadLocal threadLocal = N;
        S5 s5 = (S5) threadLocal.get();
        if (s5 != null) {
            return s5;
        }
        S5 s6 = new S5();
        threadLocal.set(s6);
        return s6;
    }

    public final void B(Cm0 cm0, C1306dd0 c1306dd0, boolean z) {
        Cm0 cm1 = this.D;
        if (cm1 != null) {
            cm1.B(cm0, c1306dd0, z);
        }
        ArrayList arrayList = this.E;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.E.size();
        Bm0[] bm0Arr = this.x;
        if (bm0Arr == null) {
            bm0Arr = new Bm0[size];
        }
        this.x = null;
        Bm0[] bm0Arr2 = (Bm0[]) this.E.toArray(bm0Arr);
        for (int i = 0; i < size; i++) {
            c1306dd0.a(bm0Arr2[i], cm0, z);
            bm0Arr2[i] = null;
        }
        this.x = bm0Arr2;
    }

    public void C(View view) {
        if (this.C) {
            return;
        }
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = K;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.z = animatorArr;
        B(this, C1306dd0.p, false);
        this.B = true;
    }

    public void D() {
        S5 s5T = t();
        this.H = 0L;
        for (int i = 0; i < this.F.size(); i++) {
            Animator animator = (Animator) this.F.get(i);
            C3268xm0 c3268xm0 = (C3268xm0) s5T.get(animator);
            if (animator != null && c3268xm0 != null) {
                long j = this.n;
                Animator animator2 = c3268xm0.f;
                if (j >= 0) {
                    animator2.setDuration(j);
                }
                long j2 = this.m;
                if (j2 >= 0) {
                    animator2.setStartDelay(animator2.getStartDelay() + j2);
                }
                TimeInterpolator timeInterpolator = this.f202o;
                if (timeInterpolator != null) {
                    animator2.setInterpolator(timeInterpolator);
                }
                this.y.add(animator);
                this.H = Math.max(this.H, AbstractC3365ym0.a(animator));
            }
        }
        this.F.clear();
    }

    public Cm0 E(Bm0 bm0) {
        Cm0 cm0;
        ArrayList arrayList = this.E;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(bm0) && (cm0 = this.D) != null) {
            cm0.E(bm0);
        }
        if (this.E.size() == 0) {
            this.E = null;
        }
        return this;
    }

    public void F(View view) {
        this.q.remove(view);
    }

    public void G(ViewGroup viewGroup) {
        if (this.B) {
            if (!this.C) {
                ArrayList arrayList = this.y;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
                this.z = K;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.z = animatorArr;
                B(this, C1306dd0.q, false);
            }
            this.B = false;
        }
    }

    public void H() {
        P();
        S5 s5T = t();
        for (Animator animator : this.F) {
            if (s5T.containsKey(animator)) {
                P();
                if (animator != null) {
                    animator.addListener(new C3171wm0(this, s5T));
                    long j = this.n;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.m;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.f202o;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0962a1(7, this));
                    animator.start();
                }
            }
        }
        this.F.clear();
        q();
    }

    public void I(long j, long j2) {
        long j3 = this.H;
        boolean z = j < j2;
        if ((j2 < 0 && j >= 0) || (j2 > j3 && j <= j3)) {
            this.C = false;
            B(this, C1306dd0.m, z);
        }
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = K;
        for (int i = 0; i < size; i++) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            AbstractC3365ym0.b(animator, Math.min(Math.max(0L, j), AbstractC3365ym0.a(animator)));
        }
        this.z = animatorArr;
        if ((j <= j3 || j2 > j3) && (j >= 0 || j2 < 0)) {
            return;
        }
        if (j > j3) {
            this.C = true;
        }
        B(this, C1306dd0.n, z);
    }

    public void J(long j) {
        this.n = j;
    }

    public void L(TimeInterpolator timeInterpolator) {
        this.f202o = timeInterpolator;
    }

    public void M(C3325yL c3325yL) {
        if (c3325yL == null) {
            this.G = M;
        } else {
            this.G = c3325yL;
        }
    }

    public void O(long j) {
        this.m = j;
    }

    public final void P() {
        if (this.A == 0) {
            B(this, C1306dd0.m, false);
            this.C = false;
        }
        this.A++;
    }

    public String Q(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.n != -1) {
            sb.append("dur(");
            sb.append(this.n);
            sb.append(") ");
        }
        if (this.m != -1) {
            sb.append("dly(");
            sb.append(this.m);
            sb.append(") ");
        }
        if (this.f202o != null) {
            sb.append("interp(");
            sb.append(this.f202o);
            sb.append(") ");
        }
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        ArrayList arrayList2 = this.q;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void b(Bm0 bm0) {
        if (this.E == null) {
            this.E = new ArrayList();
        }
        this.E.add(bm0);
    }

    public void c(View view) {
        this.q.add(view);
    }

    public void cancel() {
        ArrayList arrayList = this.y;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.z);
        this.z = K;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.z = animatorArr;
        B(this, C1306dd0.f739o, false);
    }

    public abstract void e(Lm0 lm0);

    public final void g(View view, boolean z) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            Lm0 lm0 = new Lm0(view);
            if (z) {
                j(lm0);
            } else {
                e(lm0);
            }
            lm0.c.add(this);
            h(lm0);
            if (z) {
                d(this.r, view, lm0);
            } else {
                d(this.s, view, lm0);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void j(Lm0 lm0);

    public final void k(ViewGroup viewGroup, boolean z) {
        m(z);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        ArrayList arrayList2 = this.q;
        if (size <= 0 && arrayList2.size() <= 0) {
            g(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View viewFindViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (viewFindViewById != null) {
                Lm0 lm0 = new Lm0(viewFindViewById);
                if (z) {
                    j(lm0);
                } else {
                    e(lm0);
                }
                lm0.c.add(this);
                h(lm0);
                if (z) {
                    d(this.r, viewFindViewById, lm0);
                } else {
                    d(this.s, viewFindViewById, lm0);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            Lm0 lm1 = new Lm0(view);
            if (z) {
                j(lm1);
            } else {
                e(lm1);
            }
            lm1.c.add(this);
            h(lm1);
            if (z) {
                d(this.r, view, lm1);
            } else {
                d(this.s, view, lm1);
            }
        }
    }

    public final void m(boolean z) {
        if (z) {
            ((S5) this.r.m).clear();
            ((SparseArray) this.r.n).clear();
            ((C1480fM) this.r.f941o).c();
        } else {
            ((S5) this.s.m).clear();
            ((SparseArray) this.s.n).clear();
            ((C1480fM) this.s.f941o).c();
        }
    }

    @Override // 
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Cm0 clone() {
        try {
            Cm0 cm0 = (Cm0) super.clone();
            cm0.F = new ArrayList();
            cm0.r = new C2303no0(13);
            cm0.s = new C2303no0(13);
            cm0.v = null;
            cm0.w = null;
            cm0.I = null;
            cm0.D = this;
            cm0.E = null;
            return cm0;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator o(ViewGroup viewGroup, Lm0 lm0, Lm0 lm1) {
        return null;
    }

    public void p(ViewGroup viewGroup, C2303no0 c2303no0, C2303no0 c2303no1, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        Lm0 lm0;
        Animator animator;
        Object obj;
        Animator animator2;
        Lm0 lm1;
        S5 s5T = t();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        boolean z = s().I != null;
        int i2 = 0;
        while (i2 < size) {
            Lm0 lm2 = (Lm0) arrayList.get(i2);
            Lm0 lm3 = (Lm0) arrayList2.get(i2);
            if (lm2 != null && !lm2.c.contains(this)) {
                lm2 = null;
            }
            if (lm3 != null && !lm3.c.contains(this)) {
                lm3 = null;
            }
            if ((lm2 != null || lm3 != null) && (lm2 == null || lm3 == null || y(lm2, lm3))) {
                Animator animatorO = o(viewGroup, lm2, lm3);
                if (animatorO != null) {
                    String str = this.l;
                    if (lm3 != null) {
                        String[] strArrU = u();
                        view = lm3.b;
                        if (strArrU != null && strArrU.length > 0) {
                            lm1 = new Lm0(view);
                            Lm0 lm4 = (Lm0) ((S5) c2303no1.m).get(view);
                            i = size;
                            if (lm4 != null) {
                                int i3 = 0;
                                while (i3 < strArrU.length) {
                                    HashMap map = lm1.a;
                                    String str2 = strArrU[i3];
                                    map.put(str2, lm4.a.get(str2));
                                    i3++;
                                    strArrU = strArrU;
                                }
                            }
                            int i4 = s5T.n;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator2 = animatorO;
                                    break;
                                }
                                C3268xm0 c3268xm0 = (C3268xm0) s5T.get((Animator) s5T.f(i5));
                                if (c3268xm0.c != null && c3268xm0.a == view && c3268xm0.b.equals(str) && c3268xm0.c.equals(lm1)) {
                                    animator2 = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator2 = animatorO;
                            lm1 = null;
                        }
                        animator = animator2;
                        lm0 = lm1;
                    } else {
                        i = size;
                        view = lm2.b;
                        lm0 = null;
                    }
                    if (animator != null) {
                        animator = animatorO;
                        WindowId windowId = viewGroup.getWindowId();
                        C3268xm0 c3268xm1 = new C3268xm0();
                        c3268xm1.a = view;
                        c3268xm1.b = str;
                        c3268xm1.c = lm0;
                        c3268xm1.d = windowId;
                        c3268xm1.e = this;
                        c3268xm1.f = animator;
                        if (z) {
                            obj = animator;
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.play(animator);
                            obj = animatorSet;
                        }
                        obj = animator;
                        s5T.put(obj, c3268xm1);
                        this.F.add(obj);
                    } else {
                        animator = animatorO;
                    }
                }
                i2++;
                size = i;
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                C3268xm0 c3268xm2 = (C3268xm0) s5T.get((Animator) this.F.get(sparseIntArray.keyAt(i6)));
                c3268xm2.f.setStartDelay(c3268xm2.f.getStartDelay() + (((long) sparseIntArray.valueAt(i6)) - Long.MAX_VALUE));
            }
        }
    }

    public final void q() {
        int i = this.A - 1;
        this.A = i;
        if (i == 0) {
            B(this, C1306dd0.n, false);
            for (int i2 = 0; i2 < ((C1480fM) this.r.f941o).k(); i2++) {
                View view = (View) ((C1480fM) this.r.f941o).m(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C1480fM) this.s.f941o).k(); i3++) {
                View view2 = (View) ((C1480fM) this.s.f941o).m(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.C = true;
        }
    }

    public final Lm0 r(View view, boolean z) {
        Im0 im0 = this.t;
        if (im0 != null) {
            return im0.r(view, z);
        }
        ArrayList arrayList = z ? this.v : this.w;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            Lm0 lm0 = (Lm0) arrayList.get(i);
            if (lm0 == null) {
                return null;
            }
            if (lm0.b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (Lm0) (z ? this.w : this.v).get(i);
        }
        return null;
    }

    public final Cm0 s() {
        Im0 im0 = this.t;
        return im0 != null ? im0.s() : this;
    }

    public final String toString() {
        return Q("");
    }

    public String[] u() {
        return null;
    }

    public final Lm0 v(View view, boolean z) {
        Im0 im0 = this.t;
        if (im0 != null) {
            return im0.v(view, z);
        }
        return (Lm0) ((S5) (z ? this.r : this.s).m).get(view);
    }

    public boolean w() {
        return !this.y.isEmpty();
    }

    public boolean x() {
        return this instanceof C0364Dc;
    }

    public boolean y(Lm0 lm0, Lm0 lm1) {
        if (lm0 == null || lm1 == null) {
            return false;
        }
        String[] strArrU = u();
        if (strArrU == null) {
            Iterator it = lm0.a.keySet().iterator();
            while (it.hasNext()) {
                if (A(lm0, lm1, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrU) {
            if (!A(lm0, lm1, str)) {
            }
        }
        return false;
        return true;
    }

    public final boolean z(View view) {
        int id = view.getId();
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        ArrayList arrayList2 = this.q;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public void N() {
    }

    public void K(UK uk) {
    }

    public void h(Lm0 lm0) {
    }
}
