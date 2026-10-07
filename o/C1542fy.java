package o;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.skidush.clonex.R;
import j$.util.Objects;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.fy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1542fy extends AbstractC0956Zx {
    @Override // o.AbstractC0956Zx
    public final void a(View view, Object obj) {
        ((Cm0) obj).c(view);
    }

    @Override // o.AbstractC0956Zx
    public final void b(Object obj, ArrayList arrayList) {
        Cm0 cm0 = (Cm0) obj;
        if (cm0 == null) {
            return;
        }
        int i = 0;
        if (cm0 instanceof Im0) {
            Im0 im0 = (Im0) cm0;
            int size = im0.O.size();
            while (i < size) {
                b(im0.S(i), arrayList);
                i++;
            }
            return;
        }
        if (AbstractC0956Zx.i(cm0.p) && AbstractC0956Zx.i(null) && AbstractC0956Zx.i(null) && AbstractC0956Zx.i(cm0.q)) {
            int size2 = arrayList.size();
            while (i < size2) {
                cm0.c((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // o.AbstractC0956Zx
    public final void c(Object obj) {
        Am0 am0 = (Am0) obj;
        am0.h();
        am0.d.a(am0.g.H + 1);
    }

    @Override // o.AbstractC0956Zx
    public final void d(Object obj, O3 o3) {
        Am0 am0 = (Am0) obj;
        am0.f = o3;
        am0.h();
        am0.d.a(0.0f);
    }

    @Override // o.AbstractC0956Zx
    public final void e(ViewGroup viewGroup, Object obj) {
        Gm0.a(viewGroup, (Cm0) obj);
    }

    @Override // o.AbstractC0956Zx
    public final boolean f(Object obj) {
        return obj instanceof Cm0;
    }

    @Override // o.AbstractC0956Zx
    public final Object g(Object obj) {
        if (obj != null) {
            return ((Cm0) obj).clone();
        }
        return null;
    }

    @Override // o.AbstractC0956Zx
    public final Object h(ViewGroup viewGroup, Object obj) {
        Cm0 cm0 = (Cm0) obj;
        ArrayList arrayList = Gm0.c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (!cm0.x()) {
            throw new IllegalArgumentException("The Transition must support seeking.");
        }
        arrayList.add(viewGroup);
        Cm0 cm0Clone = cm0.clone();
        Im0 im0 = new Im0();
        im0.R(cm0Clone);
        Gm0.c(viewGroup, im0);
        viewGroup.setTag(R.id.transition_current_scene, null);
        Fm0 fm0 = new Fm0();
        fm0.l = im0;
        fm0.m = viewGroup;
        viewGroup.addOnAttachStateChangeListener(fm0);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(fm0);
        viewGroup.invalidate();
        Am0 am0 = new Am0(im0);
        im0.I = am0;
        im0.b(am0);
        return im0.I;
    }

    @Override // o.AbstractC0956Zx
    public final boolean j() {
        return true;
    }

    @Override // o.AbstractC0956Zx
    public final boolean k(Object obj) {
        boolean zX = ((Cm0) obj).x();
        if (!zX) {
            Objects.toString(obj);
        }
        return zX;
    }

    @Override // o.AbstractC0956Zx
    public final Object l(Object obj, Object obj2) {
        Cm0 cm0 = (Cm0) obj;
        Cm0 cm1 = (Cm0) obj2;
        if (cm0 == null || cm1 == null) {
            if (cm0 != null) {
                return cm0;
            }
            if (cm1 != null) {
                return cm1;
            }
            return null;
        }
        Im0 im0 = new Im0();
        im0.R(cm0);
        im0.R(cm1);
        im0.V(1);
        return im0;
    }

    @Override // o.AbstractC0956Zx
    public final Object m(Object obj, Object obj2) {
        Im0 im0 = new Im0();
        if (obj != null) {
            im0.R((Cm0) obj);
        }
        im0.R((Cm0) obj2);
        return im0;
    }

    @Override // o.AbstractC0956Zx
    public final void n(Object obj, View view, ArrayList arrayList) {
        ((Cm0) obj).b(new C1249cy(view, arrayList));
    }

    @Override // o.AbstractC0956Zx
    public final void o(Object obj, Object obj2, ArrayList arrayList) {
        ((Cm0) obj).b(new C1346dy(this, obj2, arrayList));
    }

    @Override // o.AbstractC0956Zx
    public final void p(Object obj, float f) {
        Am0 am0 = (Am0) obj;
        boolean z = am0.b;
        if (z) {
            Cm0 cm0 = am0.g;
            long j = cm0.H;
            long j2 = (long) (f * j);
            if (j2 == 0) {
                j2 = 1;
            }
            if (j2 == j) {
                j2 = j - 1;
            }
            if (am0.d != null) {
                throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
            }
            long j3 = am0.a;
            if (j2 == j3 || !z) {
                return;
            }
            if (!am0.c) {
                if (j2 == 0 && j3 > 0) {
                    j2 = -1;
                } else if (j2 == j && j3 < j) {
                    j2 = j + 1;
                }
                if (j2 != j3) {
                    cm0.I(j2, j3);
                    am0.a = j2;
                }
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            C2613qy c2613qy = am0.e;
            int i = (c2613qy.m + 1) % 20;
            c2613qy.m = i;
            ((long[]) c2613qy.n)[i] = jCurrentAnimationTimeMillis;
            ((float[]) c2613qy.f996o)[i] = j2;
        }
    }

    @Override // o.AbstractC0956Zx
    public final void r(Object obj, C1790ib c1790ib, Jj0 jj0, Runnable runnable) {
        Cm0 cm0 = (Cm0) obj;
        C1054ay c1054ay = new C1054ay(jj0, cm0, runnable);
        synchronized (c1790ib) {
            while (c1790ib.c) {
                try {
                    try {
                        c1790ib.wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (c1790ib.b != c1054ay) {
                c1790ib.b = c1054ay;
                if (c1790ib.a) {
                    Runnable runnable2 = (Runnable) c1054ay.m;
                    if (runnable2 == null) {
                        ((Cm0) c1054ay.f685o).cancel();
                        ((Runnable) c1054ay.n).run();
                    } else {
                        runnable2.run();
                    }
                }
            }
        }
        cm0.b(new C1444ey(runnable));
    }

    @Override // o.AbstractC0956Zx
    public final void s(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, Object obj, C1790ib c1790ib, RunnableC0477Hl runnableC0477Hl) {
        r(obj, c1790ib, null, runnableC0477Hl);
    }

    public final void u(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        Cm0 cm0 = (Cm0) obj;
        int i = 0;
        if (cm0 instanceof Im0) {
            Im0 im0 = (Im0) cm0;
            int size = im0.O.size();
            while (i < size) {
                u(im0.S(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (AbstractC0956Zx.i(cm0.p) && AbstractC0956Zx.i(null) && AbstractC0956Zx.i(null)) {
            ArrayList arrayList3 = cm0.q;
            if (arrayList3.size() == arrayList.size() && arrayList3.containsAll(arrayList)) {
                int size2 = arrayList2 == null ? 0 : arrayList2.size();
                while (i < size2) {
                    cm0.c((View) arrayList2.get(i));
                    i++;
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    cm0.F((View) arrayList.get(size3));
                }
            }
        }
    }

    @Override // o.AbstractC0956Zx
    public final void q(Object obj) {
    }

    @Override // o.AbstractC0956Zx
    public final void t(ArrayList arrayList, ArrayList arrayList2) {
    }
}
