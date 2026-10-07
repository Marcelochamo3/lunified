package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class WT extends TT implements Iterable, InterfaceC1770iI {
    public static final /* synthetic */ int A = 0;
    public final C2866tf0 w;
    public int x;
    public String y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WT(DU du) {
        super(du);
        AbstractC1474fG.j(du, "navGraphNavigator");
        this.w = new C2866tf0(0);
    }

    @Override // o.TT
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof WT) && super.equals(obj)) {
            C2866tf0 c2866tf0 = this.w;
            int iH = c2866tf0.h();
            WT wt = (WT) obj;
            C2866tf0 c2866tf1 = wt.w;
            if (iH == c2866tf1.h() && this.x == wt.x) {
                for (TT tt : (C0368Dg) Vb0.G(new G(2, c2866tf0))) {
                    if (!AbstractC1474fG.b(tt, c2866tf1.d(tt.s))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // o.TT
    public final RT f(RN rn) {
        return l(rn, false, this);
    }

    @Override // o.TT
    public final void h(Context context, AttributeSet attributeSet) {
        String strValueOf;
        AbstractC1474fG.j(context, "context");
        super.h(context, attributeSet);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, S40.d);
        AbstractC1474fG.i(typedArrayObtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
        if (resourceId == this.s) {
            throw new IllegalArgumentException(("Start destination " + resourceId + " cannot use the same id as the graph " + this).toString());
        }
        if (this.z != null) {
            this.x = 0;
            this.z = null;
        }
        this.x = resourceId;
        this.y = null;
        if (resourceId <= 16777215) {
            strValueOf = String.valueOf(resourceId);
        } else {
            try {
                strValueOf = context.getResources().getResourceName(resourceId);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(resourceId);
            }
            AbstractC1474fG.i(strValueOf, "try {\n                  …tring()\n                }");
        }
        this.y = strValueOf;
        typedArrayObtainAttributes.recycle();
    }

    @Override // o.TT
    public final int hashCode() {
        int iE = this.x;
        C2866tf0 c2866tf0 = this.w;
        int iH = c2866tf0.h();
        for (int i = 0; i < iH; i++) {
            iE = (((iE * 31) + c2866tf0.e(i)) * 31) + ((TT) c2866tf0.j(i)).hashCode();
        }
        return iE;
    }

    public final void i(TT tt) {
        AbstractC1474fG.j(tt, "node");
        int i = tt.s;
        String str = tt.t;
        if (i == 0 && str == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        String str2 = this.t;
        if (str2 != null && !(!AbstractC1474fG.b(str, str2))) {
            throw new IllegalArgumentException(("Destination " + tt + " cannot have the same route as graph " + this).toString());
        }
        if (i == this.s) {
            throw new IllegalArgumentException(("Destination " + tt + " cannot have the same id as graph " + this).toString());
        }
        C2866tf0 c2866tf0 = this.w;
        TT tt2 = (TT) c2866tf0.d(i);
        if (tt2 == tt) {
            return;
        }
        if (tt.m != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (tt2 != null) {
            tt2.m = null;
        }
        tt.m = this;
        c2866tf0.g(tt.s, tt);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new VT(this);
    }

    public final TT j(String str, boolean z) {
        Object next;
        WT wt;
        TT tt;
        AbstractC1474fG.j(str, "route");
        C2866tf0 c2866tf0 = this.w;
        AbstractC1474fG.j(c2866tf0, "<this>");
        Iterator it = ((C0368Dg) Vb0.G(new G(2, c2866tf0))).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            tt = (TT) next;
            if (AbstractC1899jh0.N(tt.t, str, false)) {
                break;
            }
        } while (tt.g(str) == null);
        TT tt2 = (TT) next;
        if (tt2 != null) {
            return tt2;
        }
        if (!z || (wt = this.m) == null || AbstractC1899jh0.O(str)) {
            return null;
        }
        return wt.j(str, true);
    }

    public final TT k(int i, TT tt, boolean z) {
        C2866tf0 c2866tf0 = this.w;
        TT ttK = (TT) c2866tf0.d(i);
        if (ttK != null) {
            return ttK;
        }
        if (z) {
            Iterator it = ((C0368Dg) Vb0.G(new G(2, c2866tf0))).iterator();
            do {
                if (!it.hasNext()) {
                    ttK = null;
                    break;
                }
                TT tt2 = (TT) it.next();
                ttK = (!(tt2 instanceof WT) || AbstractC1474fG.b(tt2, tt)) ? null : ((WT) tt2).k(i, this, true);
            } while (ttK == null);
        }
        if (ttK != null) {
            return ttK;
        }
        WT wt = this.m;
        if (wt == null || AbstractC1474fG.b(wt, tt)) {
            return null;
        }
        WT wt2 = this.m;
        AbstractC1474fG.g(wt2);
        return wt2.k(i, this, z);
    }

    public final RT l(RN rn, boolean z, TT tt) {
        RT rtL;
        AbstractC1474fG.j(tt, "lastVisited");
        RT rtF = super.f(rn);
        ArrayList arrayList = new ArrayList();
        VT vt = new VT(this);
        while (true) {
            rtL = null;
            if (!vt.hasNext()) {
                break;
            }
            TT tt2 = (TT) vt.next();
            rtL = AbstractC1474fG.b(tt2, tt) ? null : tt2.f(rn);
            if (rtL != null) {
                arrayList.add(rtL);
            }
        }
        RT rt = (RT) AbstractC0911Ye.k0(arrayList);
        WT wt = this.m;
        if (wt != null && z && !AbstractC1474fG.b(wt, tt)) {
            rtL = wt.l(rn, true, this);
        }
        return (RT) AbstractC0911Ye.k0(X5.P(new RT[]{rtF, rt, rtL}));
    }

    @Override // o.TT
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        String str = this.z;
        TT ttJ = (str == null || AbstractC1899jh0.O(str)) ? null : j(str, true);
        if (ttJ == null) {
            ttJ = k(this.x, this, false);
        }
        sb.append(" startDestination=");
        if (ttJ == null) {
            String str2 = this.z;
            if (str2 != null) {
                sb.append(str2);
            } else {
                String str3 = this.y;
                if (str3 != null) {
                    sb.append(str3);
                } else {
                    sb.append("0x" + Integer.toHexString(this.x));
                }
            }
        } else {
            sb.append("{");
            sb.append(ttJ.toString());
            sb.append("}");
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "sb.toString()");
        return string;
    }
}
