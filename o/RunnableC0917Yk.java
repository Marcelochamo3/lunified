package o;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.Yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0917Yk implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ ArrayList m;
    public final /* synthetic */ C1418el n;

    public /* synthetic */ RunnableC0917Yk(C1418el c1418el, ArrayList arrayList, int i) {
        this.l = i;
        this.n = c1418el;
        this.m = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.l) {
            case 0:
                ArrayList arrayList = this.m;
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    C1418el c1418el = this.n;
                    if (!zHasNext) {
                        arrayList.clear();
                        c1418el.m.remove(arrayList);
                    } else {
                        C1321dl c1321dl = (C1321dl) it.next();
                        AbstractC2144m60 abstractC2144m60 = c1321dl.a;
                        c1418el.getClass();
                        View view = abstractC2144m60.a;
                        int i = c1321dl.d - c1321dl.b;
                        int i2 = c1321dl.e - c1321dl.c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                        c1418el.p.add(abstractC2144m60);
                        viewPropertyAnimatorAnimate.setDuration(c1418el.e).setListener(new C1028al(c1418el, abstractC2144m60, i, view, i2, viewPropertyAnimatorAnimate)).start();
                    }
                    break;
                }
                break;
            case 1:
                ArrayList arrayList2 = this.m;
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    C1418el c1418el2 = this.n;
                    if (!zHasNext2) {
                        arrayList2.clear();
                        c1418el2.n.remove(arrayList2);
                    } else {
                        C1223cl c1223cl = (C1223cl) it2.next();
                        c1418el2.getClass();
                        AbstractC2144m60 abstractC2144m61 = c1223cl.a;
                        View view2 = abstractC2144m61 == null ? null : abstractC2144m61.a;
                        AbstractC2144m60 abstractC2144m62 = c1223cl.b;
                        View view3 = abstractC2144m62 != null ? abstractC2144m62.a : null;
                        ArrayList arrayList3 = c1418el2.r;
                        long j = c1418el2.f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j);
                            arrayList3.add(c1223cl.a);
                            duration.translationX(c1223cl.e - c1223cl.c);
                            duration.translationY(c1223cl.f - c1223cl.d);
                            duration.alpha(0.0f).setListener(new C1126bl(c1418el2, c1223cl, duration, view2, 0)).start();
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                            arrayList3.add(c1223cl.b);
                            viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new C1126bl(c1418el2, c1223cl, viewPropertyAnimatorAnimate2, view3, 1)).start();
                        }
                        it2 = it2;
                    }
                    break;
                }
                break;
            default:
                ArrayList arrayList4 = this.m;
                Iterator it3 = arrayList4.iterator();
                while (true) {
                    boolean zHasNext3 = it3.hasNext();
                    C1418el c1418el3 = this.n;
                    if (!zHasNext3) {
                        arrayList4.clear();
                        c1418el3.l.remove(arrayList4);
                    } else {
                        AbstractC2144m60 abstractC2144m63 = (AbstractC2144m60) it3.next();
                        c1418el3.getClass();
                        View view4 = abstractC2144m63.a;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                        c1418el3.f761o.add(abstractC2144m63);
                        viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(c1418el3.c).setListener(new C0943Zk(c1418el3, abstractC2144m63, view4, viewPropertyAnimatorAnimate3)).start();
                    }
                    break;
                }
                break;
        }
    }
}
