package o;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.skidush.clonex.R;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: renamed from: o.Ll, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0581Ll {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;

    public C0581Ll(ViewGroup viewGroup) {
        AbstractC1474fG.j(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final C0581Ll i(ViewGroup viewGroup, C3289xx c3289xx) {
        AbstractC1474fG.j(viewGroup, "container");
        AbstractC1474fG.j(c3289xx, "fragmentManager");
        AbstractC1474fG.i(c3289xx.J(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0581Ll) {
            return (C0581Ll) tag;
        }
        C0581Ll c0581Ll = new C0581Ll(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0581Ll);
        return c0581Ll;
    }

    public final void a(C3157wf0 c3157wf0) {
        AbstractC1474fG.j(c3157wf0, "operation");
        if (c3157wf0.i) {
            AbstractC1674hK.d(c3157wf0.a, c3157wf0.c.R(), this.a);
            c3157wf0.i = false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x0165  */
    public final void b(ArrayList arrayList, boolean z) {
        Object next;
        Object objPrevious;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            C3157wf0 c3157wf0 = (C3157wf0) next;
            View view = c3157wf0.c.S;
            AbstractC1474fG.i(view, "operation.fragment.mView");
            if (AbstractC1923jt0.b(view) == 2 && c3157wf0.a != 2) {
                break;
            }
        }
        C3157wf0 c3157wf1 = (C3157wf0) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            C3157wf0 c3157wf2 = (C3157wf0) objPrevious;
            View view2 = c3157wf2.c.S;
            AbstractC1474fG.i(view2, "operation.fragment.mView");
            if (AbstractC1923jt0.b(view2) != 2 && c3157wf2.a == 2) {
                break;
            }
        }
        C3157wf0 c3157wf3 = (C3157wf0) objPrevious;
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(c3157wf1);
            Objects.toString(c3157wf3);
        }
        ArrayList<C0347Cl> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = ((C3157wf0) AbstractC0911Ye.i0(arrayList)).c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C1052ax c1052ax = ((C3157wf0) it2.next()).c.V;
            C1052ax c1052ax2 = abstractComponentCallbacksC1247cx.V;
            c1052ax.b = c1052ax2.b;
            c1052ax.c = c1052ax2.c;
            c1052ax.d = c1052ax2.d;
            c1052ax.e = c1052ax2.e;
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            boolean z2 = false;
            if (!it3.hasNext()) {
                break;
            }
            C3157wf0 c3157wf4 = (C3157wf0) it3.next();
            arrayList2.add(new C0347Cl(c3157wf4, z));
            if (z) {
                if (c3157wf4 == c3157wf1) {
                    z2 = true;
                }
            } else if (c3157wf4 == c3157wf3) {
                z2 = true;
            }
            arrayList3.add(new C0555Kl(c3157wf4, z, z2));
            c3157wf4.d.add(new RunnableC3459zl(this, c3157wf4, 0));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (!((C0555Kl) obj).g()) {
                arrayList4.add(obj);
            }
        }
        ArrayList<C0555Kl> arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            if (((C0555Kl) obj2).r() != null) {
                arrayList5.add(obj2);
            }
        }
        AbstractC0956Zx abstractC0956Zx = null;
        for (C0555Kl c0555Kl : arrayList5) {
            AbstractC0956Zx abstractC0956ZxR = c0555Kl.r();
            if (abstractC0956Zx != null && abstractC0956ZxR != abstractC0956Zx) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((C3157wf0) c0555Kl.a).c + " returned Transition " + c0555Kl.b + " which uses a different Transition type than other Fragments.").toString());
            }
            abstractC0956Zx = abstractC0956ZxR;
        }
        if (abstractC0956Zx == null) {
            break;
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        S5 s5 = new S5(0);
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        S5 s6 = new S5(0);
        S5 s7 = new S5(0);
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            ((C0555Kl) it4.next()).getClass();
        }
        if (arrayList5.isEmpty()) {
            break;
            break;
        }
        Iterator it5 = arrayList5.iterator();
        while (true) {
            if (it5.hasNext()) {
                if (((C0555Kl) it5.next()).b != null) {
                    C0529Jl c0529Jl = new C0529Jl(arrayList5, c3157wf1, c3157wf3, abstractC0956Zx, arrayList6, arrayList7, s5, arrayList8, arrayList9, s6, s7, z);
                    Iterator it6 = arrayList5.iterator();
                    while (it6.hasNext()) {
                        ((C3157wf0) ((C0555Kl) it6.next()).a).j.add(c0529Jl);
                    }
                    break;
                }
            } else {
                break;
                break;
            }
        }
        ArrayList<C0347Cl> arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            AbstractC1406ef.Q(arrayList11, ((C3157wf0) ((C0347Cl) it7.next()).a).k);
        }
        boolean z3 = !arrayList11.isEmpty();
        boolean z4 = false;
        for (C0347Cl c0347Cl : arrayList2) {
            Context context = this.a.getContext();
            C3157wf0 c3157wf5 = (C3157wf0) c0347Cl.a;
            AbstractC1474fG.i(context, "context");
            C2994uv c2994uvR = c0347Cl.r(context);
            if (c2994uvR != null) {
                if (((AnimatorSet) c2994uvR.n) == null) {
                    arrayList10.add(c0347Cl);
                } else {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c3157wf5.c;
                    if (!(!c3157wf5.k.isEmpty())) {
                        if (c3157wf5.a == 3) {
                            c3157wf5.i = false;
                        }
                        c3157wf5.j.add(new C0399El(c0347Cl));
                        z4 = true;
                    } else if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(abstractComponentCallbacksC1247cx2);
                    }
                }
            }
        }
        for (C0347Cl c0347Cl2 : arrayList10) {
            C3157wf0 c3157wf6 = (C3157wf0) c0347Cl2.a;
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx3 = c3157wf6.c;
            if (z3) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(abstractComponentCallbacksC1247cx3);
                }
            } else if (!z4) {
                c3157wf6.j.add(new C0321Bl(c0347Cl2));
            } else if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(abstractComponentCallbacksC1247cx3);
            }
        }
    }

    public final void c(ArrayList arrayList) {
        AbstractC1474fG.j(arrayList, "operations");
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1406ef.Q(arrayList2, ((C3157wf0) it.next()).k);
        }
        List listX0 = AbstractC0911Ye.x0(AbstractC0911Ye.B0(arrayList2));
        int size = listX0.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC3060vf0) listX0.get(i)).c(this.a);
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((C3157wf0) arrayList.get(i2));
        }
        List listX1 = AbstractC0911Ye.x0(arrayList);
        int size3 = listX1.size();
        for (int i3 = 0; i3 < size3; i3++) {
            C3157wf0 c3157wf0 = (C3157wf0) listX1.get(i3);
            if (c3157wf0.k.isEmpty()) {
                c3157wf0.b();
            }
        }
    }

    public final void d(int i, int i2, C0670Ox c0670Ox) {
        synchronized (this.b) {
            try {
                AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
                AbstractC1474fG.i(abstractComponentCallbacksC1247cx, "fragmentStateManager.fragment");
                C3157wf0 c3157wf0F = f(abstractComponentCallbacksC1247cx);
                if (c3157wf0F == null) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c0670Ox.c;
                    c3157wf0F = abstractComponentCallbacksC1247cx2.x ? g(abstractComponentCallbacksC1247cx2) : null;
                }
                if (c3157wf0F != null) {
                    c3157wf0F.d(i, i2);
                    return;
                }
                C3157wf0 c3157wf0 = new C3157wf0(i, i2, c0670Ox);
                this.b.add(c3157wf0);
                c3157wf0.d.add(new RunnableC3459zl(this, c3157wf0, 1));
                c3157wf0.d.add(new RunnableC3459zl(this, c3157wf0, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0143  */
    public final void e() {
        boolean z;
        boolean z2;
        if (this.e) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            h();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (this.b.isEmpty()) {
                    ArrayList<C3157wf0> arrayListY0 = AbstractC0911Ye.y0(this.c);
                    this.c.clear();
                    for (C3157wf0 c3157wf0 : arrayListY0) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(c3157wf0);
                        }
                        ViewGroup viewGroup = this.a;
                        c3157wf0.getClass();
                        AbstractC1474fG.j(viewGroup, "container");
                        if (!c3157wf0.e) {
                            c3157wf0.a(viewGroup);
                        }
                        if (!c3157wf0.f) {
                            this.c.add(c3157wf0);
                        }
                    }
                } else {
                    ArrayList arrayListY1 = AbstractC0911Ye.y0(this.c);
                    this.c.clear();
                    Iterator it = arrayListY1.iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        C3157wf0 c3157wf1 = (C3157wf0) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(c3157wf1);
                        }
                        ViewGroup viewGroup2 = this.a;
                        boolean z3 = c3157wf1.c.x;
                        AbstractC1474fG.j(viewGroup2, "container");
                        if (!c3157wf1.e) {
                            if (z3) {
                                c3157wf1.g = true;
                            }
                            c3157wf1.a(viewGroup2);
                        }
                        if (!c3157wf1.f) {
                            this.c.add(c3157wf1);
                        }
                    }
                    l();
                    ArrayList<C3157wf0> arrayListY2 = AbstractC0911Ye.y0(this.b);
                    if (arrayListY2.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(arrayListY2);
                    Log.isLoggable("FragmentManager", 2);
                    b(arrayListY2, this.d);
                    boolean z4 = true;
                    boolean z5 = true;
                    for (C3157wf0 c3157wf2 : arrayListY2) {
                        if (!c3157wf2.k.isEmpty()) {
                            ArrayList arrayList = c3157wf2.k;
                            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                                Iterator it2 = arrayList.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (!((AbstractC3060vf0) it2.next()).a()) {
                                            z2 = false;
                                        }
                                    }
                                }
                            }
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!c3157wf2.c.x) {
                            z4 = false;
                        }
                        z5 = z2;
                    }
                    if (z5) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it3 = arrayListY2.iterator();
                        while (it3.hasNext()) {
                            AbstractC1406ef.Q(arrayList2, ((C3157wf0) it3.next()).k);
                        }
                        if (!(!arrayList2.isEmpty())) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (!z4) {
                        k(arrayListY2);
                        c(arrayListY2);
                    } else if (z) {
                        k(arrayListY2);
                        int size = arrayListY2.size();
                        for (int i = 0; i < size; i++) {
                            a((C3157wf0) arrayListY2.get(i));
                        }
                    }
                    this.d = false;
                    Log.isLoggable("FragmentManager", 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C3157wf0 f(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        Object next;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            C3157wf0 c3157wf0 = (C3157wf0) next;
            if (AbstractC1474fG.b(c3157wf0.c, abstractComponentCallbacksC1247cx) && !c3157wf0.e) {
                return (C3157wf0) next;
            }
        }
        next = null;
        return (C3157wf0) next;
    }

    public final C3157wf0 g(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        Object next;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            C3157wf0 c3157wf0 = (C3157wf0) next;
            if (AbstractC1474fG.b(c3157wf0.c, abstractComponentCallbacksC1247cx) && !c3157wf0.e) {
                return (C3157wf0) next;
            }
        }
        next = null;
        return (C3157wf0) next;
    }

    public final void h() {
        Log.isLoggable("FragmentManager", 2);
        boolean zIsAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                l();
                k(this.b);
                for (C3157wf0 c3157wf0 : AbstractC0911Ye.y0(this.c)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(c3157wf0);
                    }
                    c3157wf0.a(this.a);
                }
                for (C3157wf0 c3157wf1 : AbstractC0911Ye.y0(this.b)) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (!zIsAttachedToWindow) {
                            Objects.toString(this.a);
                        }
                        Objects.toString(c3157wf1);
                    }
                    c3157wf1.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        Object objPrevious;
        synchronized (this.b) {
            try {
                l();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    C3157wf0 c3157wf0 = (C3157wf0) objPrevious;
                    View view = c3157wf0.c.S;
                    AbstractC1474fG.i(view, "operation.fragment.mView");
                    int iB = AbstractC1923jt0.b(view);
                    if (c3157wf0.a == 2 && iB != 2) {
                        break;
                    }
                }
                this.e = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C3157wf0 c3157wf0 = (C3157wf0) arrayList.get(i);
            if (!c3157wf0.h) {
                c3157wf0.h = true;
                int i2 = c3157wf0.b;
                C0670Ox c0670Ox = c3157wf0.l;
                if (i2 == 2) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx = c0670Ox.c;
                    AbstractC1474fG.i(abstractComponentCallbacksC1247cx, "fragmentStateManager.fragment");
                    View viewFindFocus = abstractComponentCallbacksC1247cx.S.findFocus();
                    if (viewFindFocus != null) {
                        abstractComponentCallbacksC1247cx.g().m = viewFindFocus;
                        if (Log.isLoggable("FragmentManager", 2)) {
                            viewFindFocus.toString();
                            abstractComponentCallbacksC1247cx.toString();
                        }
                    }
                    View viewR = c3157wf0.c.R();
                    if (viewR.getParent() == null) {
                        c0670Ox.b();
                        viewR.setAlpha(0.0f);
                    }
                    if (viewR.getAlpha() == 0.0f && viewR.getVisibility() == 0) {
                        viewR.setVisibility(4);
                    }
                    C1052ax c1052ax = abstractComponentCallbacksC1247cx.V;
                    viewR.setAlpha(c1052ax == null ? 1.0f : c1052ax.l);
                } else if (i2 == 3) {
                    AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = c0670Ox.c;
                    AbstractC1474fG.i(abstractComponentCallbacksC1247cx2, "fragmentStateManager.fragment");
                    View viewR2 = abstractComponentCallbacksC1247cx2.R();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(viewR2.findFocus());
                        viewR2.toString();
                        abstractComponentCallbacksC1247cx2.toString();
                    }
                    viewR2.clearFocus();
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC1406ef.Q(arrayList2, ((C3157wf0) it.next()).k);
        }
        List listX0 = AbstractC0911Ye.x0(AbstractC0911Ye.B0(arrayList2));
        int size2 = listX0.size();
        for (int i3 = 0; i3 < size2; i3++) {
            AbstractC3060vf0 abstractC3060vf0 = (AbstractC3060vf0) listX0.get(i3);
            abstractC3060vf0.getClass();
            ViewGroup viewGroup = this.a;
            AbstractC1474fG.j(viewGroup, "container");
            if (!abstractC3060vf0.a) {
                abstractC3060vf0.e(viewGroup);
            }
            abstractC3060vf0.a = true;
        }
    }

    public final void l() {
        for (C3157wf0 c3157wf0 : this.b) {
            int i = 2;
            if (c3157wf0.b == 2) {
                int visibility = c3157wf0.c.R().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC1674hK.n(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                c3157wf0.d(i, 1);
            }
        }
    }
}
