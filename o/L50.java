package o;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class L50 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ RecyclerView m;

    public /* synthetic */ L50(int i, RecyclerView recyclerView) {
        this.l = i;
        this.m = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        RecyclerView recyclerView3 = this.m;
        switch (this.l) {
            case 0:
                if (recyclerView3.G && !recyclerView3.isLayoutRequested()) {
                    if (!recyclerView3.E) {
                        recyclerView3.requestLayout();
                    } else if (!recyclerView3.J) {
                        recyclerView3.n();
                    } else {
                        recyclerView3.I = true;
                    }
                    break;
                }
                break;
            default:
                T50 t50 = recyclerView3.b0;
                if (t50 != null) {
                    C1418el c1418el = (C1418el) t50;
                    ArrayList arrayList = c1418el.h;
                    boolean z = !arrayList.isEmpty();
                    ArrayList arrayList2 = c1418el.j;
                    boolean z2 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = c1418el.k;
                    boolean z3 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = c1418el.i;
                    boolean z4 = !arrayList4.isEmpty();
                    if (z || z2 || z4 || z3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            recyclerView2 = recyclerView3;
                            long j = c1418el.d;
                            if (zHasNext) {
                                AbstractC2144m60 abstractC2144m60 = (AbstractC2144m60) it.next();
                                View view = abstractC2144m60.a;
                                ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                                c1418el.q.add(abstractC2144m60);
                                viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C0943Zk(c1418el, abstractC2144m60, viewPropertyAnimatorAnimate, view)).start();
                                recyclerView3 = recyclerView2;
                            } else {
                                arrayList.clear();
                                if (z2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c1418el.m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0917Yk runnableC0917Yk = new RunnableC0917Yk(c1418el, arrayList5, 0);
                                    if (z) {
                                        View view2 = ((C1321dl) arrayList5.get(0)).a.a;
                                        WeakHashMap weakHashMap = It0.a;
                                        view2.postOnAnimationDelayed(runnableC0917Yk, j);
                                    } else {
                                        runnableC0917Yk.run();
                                    }
                                }
                                if (z3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c1418el.n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0917Yk runnableC0917Yk2 = new RunnableC0917Yk(c1418el, arrayList6, 1);
                                    if (z) {
                                        View view3 = ((C1223cl) arrayList6.get(0)).a.a;
                                        WeakHashMap weakHashMap2 = It0.a;
                                        view3.postOnAnimationDelayed(runnableC0917Yk2, j);
                                    } else {
                                        runnableC0917Yk2.run();
                                    }
                                }
                                if (z4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c1418el.l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0917Yk runnableC0917Yk3 = new RunnableC0917Yk(c1418el, arrayList7, 2);
                                    if (z || z2 || z3) {
                                        if (!z) {
                                            j = 0;
                                        }
                                        long jMax = Math.max(z2 ? c1418el.e : 0L, z3 ? c1418el.f : 0L) + j;
                                        View view4 = ((AbstractC2144m60) arrayList7.get(0)).a;
                                        WeakHashMap weakHashMap3 = It0.a;
                                        view4.postOnAnimationDelayed(runnableC0917Yk3, jMax);
                                    } else {
                                        runnableC0917Yk3.run();
                                    }
                                }
                            }
                        }
                    } else {
                        recyclerView2 = recyclerView3;
                    }
                    recyclerView = recyclerView2;
                } else {
                    recyclerView = recyclerView3;
                }
                recyclerView.z0 = false;
                break;
        }
    }
}
