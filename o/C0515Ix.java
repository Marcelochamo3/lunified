package o;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* JADX INFO: renamed from: o.Ix, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0515Ix {
    public final /* synthetic */ FT a;
    public final /* synthetic */ C0567Kx b;

    public C0515Ix(FT ft, C0567Kx c0567Kx) {
        this.a = ft;
        this.b = c0567Kx;
    }

    public final void a(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        Object obj;
        Object objPrevious;
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "fragment");
        FT ft = this.a;
        ArrayList arrayListM0 = AbstractC0911Ye.m0((Collection) ft.e.l.getValue(), (Iterable) ft.f.l.getValue());
        ListIterator listIterator = arrayListM0.listIterator(arrayListM0.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!AbstractC1474fG.b(((DT) objPrevious).q, abstractComponentCallbacksC1247cx.L));
        DT dt = (DT) objPrevious;
        C0567Kx c0567Kx = this.b;
        boolean z2 = z && c0567Kx.g.isEmpty() && abstractComponentCallbacksC1247cx.w;
        for (Object obj2 : c0567Kx.g) {
            if (AbstractC1474fG.b(((C1101bX) obj2).l, abstractComponentCallbacksC1247cx.L)) {
                obj = obj2;
                break;
            }
        }
        C1101bX c1101bX = (C1101bX) obj;
        if (c1101bX != null) {
            c0567Kx.g.remove(c1101bX);
        }
        if (!z2 && C0567Kx.n()) {
            abstractComponentCallbacksC1247cx.toString();
            Objects.toString(dt);
        }
        boolean z3 = c1101bX != null && ((Boolean) c1101bX.m).booleanValue();
        if (!z && !z3 && dt == null) {
            throw new IllegalArgumentException(AbstractC1701hf0.f("The fragment ", abstractComponentCallbacksC1247cx, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
        }
        if (dt != null) {
            c0567Kx.l(abstractComponentCallbacksC1247cx, dt, ft);
            if (z2) {
                if (C0567Kx.n()) {
                    abstractComponentCallbacksC1247cx.toString();
                    dt.toString();
                }
                ft.f(dt, false);
            }
        }
    }

    public final void b(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, boolean z) {
        Object objPrevious;
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "fragment");
        if (z) {
            FT ft = this.a;
            List list = (List) ft.e.l.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!AbstractC1474fG.b(((DT) objPrevious).q, abstractComponentCallbacksC1247cx.L));
            DT dt = (DT) objPrevious;
            this.b.getClass();
            if (C0567Kx.n()) {
                abstractComponentCallbacksC1247cx.toString();
                Objects.toString(dt);
            }
            if (dt != null) {
                C2771sg0 c2771sg0 = ft.c;
                c2771sg0.f(Lc0.S((Set) c2771sg0.getValue(), dt));
                if (!ft.h.g.contains(dt)) {
                    throw new IllegalStateException("Cannot transition entry that is not in the back stack");
                }
                dt.g(TJ.f532o);
            }
        }
    }
}
