package o;

import android.animation.Animator;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Fm0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public Cm0 l;
    public ViewGroup m;

    /* JADX WARN: Code duplicated, block: B:101:0x0214  */
    /* JADX WARN: Code duplicated, block: B:102:0x0220  */
    /* JADX WARN: Code duplicated, block: B:106:0x0232  */
    /* JADX WARN: Code duplicated, block: B:129:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:140:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:144:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:14:0x004e  */
    /* JADX WARN: Code duplicated, block: B:150:0x01e0 A[EDGE_INSN: B:150:0x01e0->B:89:0x01e0 BREAK  A[LOOP:1: B:19:0x0087->B:88:0x01d7], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0058 A[LOOP:0: B:15:0x0052->B:17:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:183:0x01fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:25:0x0093  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106  */
    /* JADX WARN: Code duplicated, block: B:61:0x014e  */
    /* JADX WARN: Code duplicated, block: B:63:0x015c  */
    /* JADX WARN: Code duplicated, block: B:76:0x019f  */
    /* JADX WARN: Code duplicated, block: B:78:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:92:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:94:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:99:0x0206  */
    /* JADX WARN: Instruction removed from duplicated block: B:144:0x02d8, please report this as an issue */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ArrayList arrayList;
        Cm0 cm0;
        C2303no0 c2303no0;
        C2303no0 c2303no1;
        S5 s5;
        S5 s6;
        int i;
        int[] iArr;
        int i2;
        int i3;
        S5 s5T;
        int i4;
        Animator animator;
        C3268xm0 c3268xm0;
        View view;
        Lm0 lm0;
        Lm0 lm1;
        int i5;
        C2303no0 c2303no2;
        int i6;
        View view2;
        Lm0 lm2;
        S5 s7;
        int i7;
        int i8;
        View view3;
        View view4;
        SparseArray sparseArray;
        int size;
        int i9;
        View view5;
        View view6;
        C1480fM c1480fM;
        int iK;
        int i10;
        View view7;
        C2303no0 c2303no3;
        Iterator it;
        ViewGroup viewGroup = this.m;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = Gm0.c;
        ViewGroup viewGroup2 = this.m;
        int i11 = 1;
        if (!arrayList2.remove(viewGroup2)) {
            return true;
        }
        S5 s5B = Gm0.b();
        ArrayList arrayList3 = (ArrayList) s5B.get(viewGroup2);
        if (arrayList3 != null) {
            arrayList = arrayList3.size() > 0 ? new ArrayList(arrayList3) : null;
            cm0 = this.l;
            arrayList3.add(cm0);
            cm0.b(new Em0(this, s5B));
            cm0.k(viewGroup2, false);
            if (arrayList != null) {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Cm0) it.next()).G(viewGroup2);
                }
            }
            cm0.v = new ArrayList();
            cm0.w = new ArrayList();
            c2303no0 = cm0.r;
            c2303no1 = cm0.s;
            s5 = new S5((S5) c2303no0.m);
            s6 = new S5((S5) c2303no1.m);
            i = 0;
            while (true) {
                iArr = cm0.u;
                if (i < iArr.length) {
                    break;
                }
                i5 = iArr[i];
                if (i5 != i11) {
                    c2303no2 = c2303no0;
                    for (i6 = s5.n - 1; i6 >= 0; i6--) {
                        view2 = (View) s5.f(i6);
                        if (view2 == null && cm0.z(view2) && (lm2 = (Lm0) s6.remove(view2)) != null && cm0.z(lm2.b)) {
                            cm0.v.add((Lm0) s5.h(i6));
                            cm0.w.add(lm2);
                        }
                    }
                } else if (i5 != 2) {
                    c2303no2 = c2303no0;
                    s7 = (S5) c2303no2.p;
                    S5 s8 = (S5) c2303no1.p;
                    i7 = s7.n;
                    for (i8 = 0; i8 < i7; i8++) {
                        view3 = (View) s7.j(i8);
                        if (view3 == null && cm0.z(view3) && (view4 = (View) s8.get(s7.f(i8))) != null && cm0.z(view4)) {
                            Lm0 lm3 = (Lm0) s5.get(view3);
                            Lm0 lm4 = (Lm0) s6.get(view4);
                            if (lm3 != null && lm4 != null) {
                                cm0.v.add(lm3);
                                cm0.w.add(lm4);
                                s5.remove(view3);
                                s6.remove(view4);
                            }
                        }
                    }
                } else if (i5 != 3) {
                    if (i5 == 4) {
                        c1480fM = (C1480fM) c2303no0.f941o;
                        iK = c1480fM.k();
                        i10 = 0;
                        while (i10 < iK) {
                            view7 = (View) c1480fM.m(i10);
                            if (view7 == null && cm0.z(view7)) {
                                c2303no3 = c2303no0;
                                View view8 = (View) ((C1480fM) c2303no1.f941o).e(c1480fM.h(i10));
                                if (view8 != null && cm0.z(view8)) {
                                    Lm0 lm5 = (Lm0) s5.get(view7);
                                    Lm0 lm6 = (Lm0) s6.get(view8);
                                    if (lm5 != null && lm6 != null) {
                                        cm0.v.add(lm5);
                                        cm0.w.add(lm6);
                                        s5.remove(view7);
                                        s6.remove(view8);
                                    }
                                }
                            } else {
                                c2303no3 = c2303no0;
                            }
                            i10++;
                            c2303no0 = c2303no3;
                        }
                    }
                    c2303no2 = c2303no0;
                } else {
                    c2303no2 = c2303no0;
                    sparseArray = (SparseArray) c2303no2.n;
                    SparseArray sparseArray2 = (SparseArray) c2303no1.n;
                    size = sparseArray.size();
                    for (i9 = 0; i9 < size; i9++) {
                        view5 = (View) sparseArray.valueAt(i9);
                        if (view5 == null && cm0.z(view5) && (view6 = (View) sparseArray2.get(sparseArray.keyAt(i9))) != null && cm0.z(view6)) {
                            Lm0 lm7 = (Lm0) s5.get(view5);
                            Lm0 lm8 = (Lm0) s6.get(view6);
                            if (lm7 != null && lm8 != null) {
                                cm0.v.add(lm7);
                                cm0.w.add(lm8);
                                s5.remove(view5);
                                s6.remove(view6);
                            }
                        }
                    }
                }
                i++;
                c2303no0 = c2303no2;
                i11 = 1;
            }
            for (i2 = 0; i2 < s5.n; i2++) {
                lm1 = (Lm0) s5.j(i2);
                if (cm0.z(lm1.b)) {
                    cm0.v.add(lm1);
                    cm0.w.add(null);
                }
            }
            for (i3 = 0; i3 < s6.n; i3++) {
                lm0 = (Lm0) s6.j(i3);
                if (cm0.z(lm0.b)) {
                    cm0.w.add(lm0);
                    cm0.v.add(null);
                }
            }
            s5T = Cm0.t();
            int i12 = s5T.n;
            WindowId windowId = viewGroup2.getWindowId();
            for (i4 = i12 - 1; i4 >= 0; i4--) {
                animator = (Animator) s5T.f(i4);
                if (animator == null && (c3268xm0 = (C3268xm0) s5T.get(animator)) != null && (view = c3268xm0.a) != null && windowId.equals(c3268xm0.d)) {
                    Lm0 lm0V = cm0.v(view, true);
                    Lm0 lm0R = cm0.r(view, true);
                    if (lm0V == null && lm0R == null) {
                        lm0R = (Lm0) ((S5) cm0.s.m).get(view);
                    }
                    if (lm0V != null || lm0R != null) {
                        Lm0 lm9 = c3268xm0.c;
                        Cm0 cm1 = c3268xm0.e;
                        if (cm1.y(lm9, lm0R)) {
                            if (cm1.s().I != null) {
                                animator.cancel();
                                ArrayList arrayList4 = cm1.y;
                                arrayList4.remove(animator);
                                s5T.remove(animator);
                                if (arrayList4.size() == 0) {
                                    cm1.B(cm1, C1306dd0.f739o, false);
                                    if (!cm1.C) {
                                        cm1.C = true;
                                        cm1.B(cm1, C1306dd0.n, false);
                                    }
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                s5T.remove(animator);
                            }
                        }
                    }
                }
            }
            cm0.p(viewGroup2, cm0.r, cm0.s, cm0.v, cm0.w);
            if (cm0.I == null) {
                cm0.H();
            } else if (Build.VERSION.SDK_INT >= 34) {
                cm0.D();
                Am0 am0 = cm0.I;
                Cm0 cm2 = am0.g;
                long j = cm2.H == 0 ? 1L : 0L;
                cm2.I(j, am0.a);
                am0.a = j;
                cm0.I.b = true;
                return true;
            }
            return true;
        }
        arrayList3 = new ArrayList();
        s5B.put(viewGroup2, arrayList3);
        cm0 = this.l;
        arrayList3.add(cm0);
        cm0.b(new Em0(this, s5B));
        cm0.k(viewGroup2, false);
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
                ((Cm0) it.next()).G(viewGroup2);
            }
        }
        cm0.v = new ArrayList();
        cm0.w = new ArrayList();
        c2303no0 = cm0.r;
        c2303no1 = cm0.s;
        s5 = new S5((S5) c2303no0.m);
        s6 = new S5((S5) c2303no1.m);
        i = 0;
        while (true) {
            iArr = cm0.u;
            if (i < iArr.length) {
                break;
                break;
            }
            i5 = iArr[i];
            if (i5 != i11) {
                c2303no2 = c2303no0;
                while (i6 >= 0) {
                    view2 = (View) s5.f(i6);
                    if (view2 == null) {
                    }
                }
            } else if (i5 != 2) {
                c2303no2 = c2303no0;
                s7 = (S5) c2303no2.p;
                S5 s9 = (S5) c2303no1.p;
                i7 = s7.n;
                while (i8 < i7) {
                    view3 = (View) s7.j(i8);
                    if (view3 == null) {
                    }
                }
            } else if (i5 != 3) {
                if (i5 == 4) {
                    c1480fM = (C1480fM) c2303no0.f941o;
                    iK = c1480fM.k();
                    i10 = 0;
                    while (i10 < iK) {
                        view7 = (View) c1480fM.m(i10);
                        if (view7 == null) {
                            c2303no3 = c2303no0;
                        } else {
                            c2303no3 = c2303no0;
                        }
                        i10++;
                        c2303no0 = c2303no3;
                    }
                }
                c2303no2 = c2303no0;
            } else {
                c2303no2 = c2303no0;
                sparseArray = (SparseArray) c2303no2.n;
                SparseArray sparseArray3 = (SparseArray) c2303no1.n;
                size = sparseArray.size();
                while (i9 < size) {
                    view5 = (View) sparseArray.valueAt(i9);
                    if (view5 == null) {
                    }
                }
            }
            i++;
            c2303no0 = c2303no2;
            i11 = 1;
        }
        while (i2 < s5.n) {
            lm1 = (Lm0) s5.j(i2);
            if (cm0.z(lm1.b)) {
                cm0.v.add(lm1);
                cm0.w.add(null);
            }
        }
        while (i3 < s6.n) {
            lm0 = (Lm0) s6.j(i3);
            if (cm0.z(lm0.b)) {
                cm0.w.add(lm0);
                cm0.v.add(null);
            }
        }
        s5T = Cm0.t();
        int i13 = s5T.n;
        WindowId windowId2 = viewGroup2.getWindowId();
        while (i4 >= 0) {
            animator = (Animator) s5T.f(i4);
            if (animator == null) {
            }
        }
        cm0.p(viewGroup2, cm0.r, cm0.s, cm0.v, cm0.w);
        if (cm0.I == null) {
            cm0.H();
        } else if (Build.VERSION.SDK_INT >= 34) {
            cm0.D();
            Am0 am1 = cm0.I;
            Cm0 cm3 = am1.g;
            if (cm3.H == 0) {
            }
            cm3.I(j, am1.a);
            am1.a = j;
            cm0.I.b = true;
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.m;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = Gm0.c;
        ViewGroup viewGroup2 = this.m;
        arrayList.remove(viewGroup2);
        ArrayList arrayList2 = (ArrayList) Gm0.b().get(viewGroup2);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((Cm0) it.next()).G(viewGroup2);
            }
        }
        this.l.m(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
