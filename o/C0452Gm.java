package o;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: o.Gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@CU("dialog")
public final class C0452Gm extends DU {
    public final Context c;
    public final C3289xx d;
    public final LinkedHashSet e = new LinkedHashSet();
    public final I50 f = new I50(2, this);
    public final LinkedHashMap g = new LinkedHashMap();

    public C0452Gm(Context context, C3289xx c3289xx) {
        this.c = context;
        this.d = c3289xx;
    }

    @Override // o.DU
    public final TT a() {
        return new C0400Em(this);
    }

    @Override // o.DU
    public final void d(List list, C1098bU c1098bU) {
        C3289xx c3289xx = this.d;
        if (c3289xx.P()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DT dt = (DT) it.next();
            k(dt).Z(c3289xx, dt.q);
            DT dt2 = (DT) AbstractC0911Ye.j0((List) b().e.l.getValue());
            boolean zW = AbstractC0911Ye.W((Iterable) b().f.l.getValue(), dt2);
            b().h(dt);
            if (dt2 != null && !zW) {
                b().b(dt2);
            }
        }
    }

    @Override // o.DU
    public final void e(FT ft) {
        C1478fK c1478fK;
        this.a = ft;
        this.b = true;
        Iterator it = ((List) ft.e.l.getValue()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C3289xx c3289xx = this.d;
            if (!zHasNext) {
                c3289xx.f1127o.add(new InterfaceC0592Lx() { // from class: o.Dm
                    @Override // o.InterfaceC0592Lx
                    public final void b(C3289xx c3289xx2, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
                        C0452Gm c0452Gm = this.l;
                        AbstractC1474fG.j(c0452Gm, "this$0");
                        LinkedHashSet linkedHashSet = c0452Gm.e;
                        String str = abstractComponentCallbacksC1247cx.L;
                        if ((linkedHashSet instanceof InterfaceC1770iI) && !(linkedHashSet instanceof InterfaceC1866jI)) {
                            Jp0.N(linkedHashSet, "kotlin.collections.MutableCollection");
                            throw null;
                        }
                        if (linkedHashSet.remove(str)) {
                            abstractComponentCallbacksC1247cx.b0.a(c0452Gm.f);
                        }
                        LinkedHashMap linkedHashMap = c0452Gm.g;
                        String str2 = abstractComponentCallbacksC1247cx.L;
                        Jp0.b(linkedHashMap);
                        linkedHashMap.remove(str2);
                    }
                });
                return;
            }
            DT dt = (DT) it.next();
            DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm = (DialogInterfaceOnCancelListenerC0348Cm) c3289xx.E(dt.q);
            if (dialogInterfaceOnCancelListenerC0348Cm == null || (c1478fK = dialogInterfaceOnCancelListenerC0348Cm.b0) == null) {
                this.e.add(dt.q);
            } else {
                c1478fK.a(this.f);
            }
        }
    }

    @Override // o.DU
    public final void f(DT dt) {
        C3289xx c3289xx = this.d;
        if (c3289xx.P()) {
            return;
        }
        LinkedHashMap linkedHashMap = this.g;
        String str = dt.q;
        DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm = (DialogInterfaceOnCancelListenerC0348Cm) linkedHashMap.get(str);
        if (dialogInterfaceOnCancelListenerC0348Cm == null) {
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxE = c3289xx.E(str);
            dialogInterfaceOnCancelListenerC0348Cm = abstractComponentCallbacksC1247cxE instanceof DialogInterfaceOnCancelListenerC0348Cm ? (DialogInterfaceOnCancelListenerC0348Cm) abstractComponentCallbacksC1247cxE : null;
        }
        if (dialogInterfaceOnCancelListenerC0348Cm != null) {
            dialogInterfaceOnCancelListenerC0348Cm.b0.f(this.f);
            dialogInterfaceOnCancelListenerC0348Cm.W(false, false);
        }
        k(dt).Z(c3289xx, str);
        FT ftB = b();
        List list = (List) ftB.e.l.getValue();
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            DT dt2 = (DT) listIterator.previous();
            if (AbstractC1474fG.b(dt2.q, str)) {
                C2771sg0 c2771sg0 = ftB.c;
                c2771sg0.f(Lc0.S(Lc0.S((Set) c2771sg0.getValue(), dt2), dt));
                ftB.c(dt);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @Override // o.DU
    public final void i(DT dt, boolean z) {
        AbstractC1474fG.j(dt, "popUpTo");
        C3289xx c3289xx = this.d;
        if (c3289xx.P()) {
            return;
        }
        List list = (List) b().e.l.getValue();
        int iIndexOf = list.indexOf(dt);
        Iterator it = AbstractC0911Ye.p0(list.subList(iIndexOf, list.size())).iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxE = c3289xx.E(((DT) it.next()).q);
            if (abstractComponentCallbacksC1247cxE != null) {
                ((DialogInterfaceOnCancelListenerC0348Cm) abstractComponentCallbacksC1247cxE).W(false, false);
            }
        }
        l(iIndexOf, dt, z);
    }

    public final DialogInterfaceOnCancelListenerC0348Cm k(DT dt) {
        TT tt = dt.m;
        AbstractC1474fG.h(tt, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        C0400Em c0400Em = (C0400Em) tt;
        String str = c0400Em.w;
        if (str == null) {
            throw new IllegalStateException("DialogFragment class was not set".toString());
        }
        char cCharAt = str.charAt(0);
        Context context = this.c;
        if (cCharAt == '.') {
            str = context.getPackageName() + str;
        }
        C2611qx c2611qxI = this.d.I();
        context.getClassLoader();
        AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cxA = c2611qxI.a(str);
        AbstractC1474fG.i(abstractComponentCallbacksC1247cxA, "fragmentManager.fragment…t.classLoader, className)");
        if (DialogInterfaceOnCancelListenerC0348Cm.class.isAssignableFrom(abstractComponentCallbacksC1247cxA.getClass())) {
            DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm = (DialogInterfaceOnCancelListenerC0348Cm) abstractComponentCallbacksC1247cxA;
            dialogInterfaceOnCancelListenerC0348Cm.U(dt.b());
            dialogInterfaceOnCancelListenerC0348Cm.b0.a(this.f);
            this.g.put(dt.q, dialogInterfaceOnCancelListenerC0348Cm);
            return dialogInterfaceOnCancelListenerC0348Cm;
        }
        StringBuilder sb = new StringBuilder("Dialog destination ");
        String str2 = c0400Em.w;
        if (str2 != null) {
            throw new IllegalArgumentException(AbstractC1701hf0.h(sb, str2, " is not an instance of DialogFragment").toString());
        }
        throw new IllegalStateException("DialogFragment class was not set".toString());
    }

    public final void l(int i, DT dt, boolean z) {
        DT dt2 = (DT) AbstractC0911Ye.e0(i - 1, (List) b().e.l.getValue());
        boolean zW = AbstractC0911Ye.W((Iterable) b().f.l.getValue(), dt2);
        b().f(dt, z);
        if (dt2 == null || zW) {
            return;
        }
        b().b(dt2);
    }
}
