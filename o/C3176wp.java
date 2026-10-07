package o;

import j$.util.stream.Collectors;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.wp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3176wp extends AbstractC1099bV {
    public static final List s = Collections.emptyList();
    public static final String t;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2678ri0 f1103o;
    public WeakReference p;
    public List q;
    public F6 r;

    static {
        Pattern.compile("\\s+");
        t = "/baseUri";
    }

    public C3176wp(C2678ri0 c2678ri0, String str, F6 f6) {
        Sr0.w(c2678ri0);
        this.q = AbstractC1099bV.n;
        this.r = f6;
        this.f1103o = c2678ri0;
        if (str != null) {
            N(str);
        }
    }

    public static boolean V(AbstractC1099bV abstractC1099bV) {
        if (abstractC1099bV instanceof C3176wp) {
            C3176wp c3176wp = (C3176wp) abstractC1099bV;
            int i = 0;
            while (!c3176wp.f1103o.s) {
                c3176wp = (C3176wp) c3176wp.l;
                i++;
                if (i >= 6 || c3176wp == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // o.AbstractC1099bV
    public void A(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        boolean zIsEmpty = this.q.isEmpty();
        C2678ri0 c2678ri0 = this.f1103o;
        if (zIsEmpty && (c2678ri0.q || c2678ri0.r)) {
            return;
        }
        if (c0634Nn.p && !this.q.isEmpty() && c2678ri0.p && !V(this.l)) {
            AbstractC1099bV.t(appendable, i, c0634Nn);
        }
        appendable.append("</").append(c2678ri0.l).append('>');
    }

    @Override // o.AbstractC1099bV
    public final AbstractC1099bV B() {
        return (C3176wp) this.l;
    }

    @Override // o.AbstractC1099bV
    public final AbstractC1099bV H() {
        AbstractC1099bV abstractC1099bV = this;
        while (true) {
            AbstractC1099bV abstractC1099bV2 = abstractC1099bV.l;
            if (abstractC1099bV2 == null) {
                return (C3176wp) abstractC1099bV;
            }
            abstractC1099bV = abstractC1099bV2;
        }
    }

    public final void I(AbstractC1099bV abstractC1099bV) {
        AbstractC1099bV abstractC1099bV2 = abstractC1099bV.l;
        if (abstractC1099bV2 != null) {
            abstractC1099bV2.F(abstractC1099bV);
        }
        abstractC1099bV.l = this;
        q();
        this.q.add(abstractC1099bV);
        abstractC1099bV.m = this.q.size() - 1;
    }

    public final C3176wp J(String str) {
        C3176wp c3176wp = new C3176wp(C2678ri0.c(str, this.f1103o.n, (C2852tX) AbstractC1474fG.O(this).f488o), h(), null);
        I(c3176wp);
        return c3176wp;
    }

    public final List K() {
        List list;
        if (this.q.size() == 0) {
            return s;
        }
        WeakReference weakReference = this.p;
        if (weakReference != null && (list = (List) weakReference.get()) != null) {
            return list;
        }
        int size = this.q.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC1099bV abstractC1099bV = (AbstractC1099bV) this.q.get(i);
            if (abstractC1099bV instanceof C3176wp) {
                arrayList.add((C3176wp) abstractC1099bV);
            }
        }
        this.p = new WeakReference(arrayList);
        return arrayList;
    }

    @Override // o.AbstractC1099bV
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C3176wp clone() {
        return (C3176wp) super.clone();
    }

    public final String M() {
        StringBuilder sbB = AbstractC1021ah0.b();
        AbstractC1376eG.H(new C2278nc(7, sbB), this);
        return AbstractC1021ah0.h(sbB);
    }

    public final void N(String str) {
        g().r(t, str);
    }

    public final int O() {
        AbstractC1099bV abstractC1099bV = this.l;
        if (((C3176wp) abstractC1099bV) == null) {
            return 0;
        }
        List listK = ((C3176wp) abstractC1099bV).K();
        int size = listK.size();
        for (int i = 0; i < size; i++) {
            if (listK.get(i) == this) {
                return i;
            }
        }
        return 0;
    }

    public final C3176wp P() {
        for (AbstractC1099bV abstractC1099bVV = k() == 0 ? null : (AbstractC1099bV) q().get(0); abstractC1099bVV != null; abstractC1099bVV = abstractC1099bVV.v()) {
            if (abstractC1099bVV instanceof C3176wp) {
                return (C3176wp) abstractC1099bVV;
            }
        }
        return null;
    }

    public final boolean Q(String str) {
        F6 f6 = this.r;
        if (f6 == null) {
            return false;
        }
        String strM = f6.m("class");
        int length = strM.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return strM.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    public final String R() {
        C0660On c0660On;
        StringBuilder sbB = AbstractC1021ah0.b();
        int size = this.q.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            AbstractC1099bV abstractC1099bV = (AbstractC1099bV) this.q.get(i);
            AbstractC1099bV abstractC1099bVH = abstractC1099bV.H();
            c0660On = abstractC1099bVH instanceof C0660On ? (C0660On) abstractC1099bVH : null;
            if (c0660On == null) {
                c0660On = new C0660On("");
            }
            AbstractC1376eG.H(new C2994uv(sbB, c0660On.u), abstractC1099bV);
            i++;
        }
        String strH = AbstractC1021ah0.h(sbB);
        AbstractC1099bV abstractC1099bVH2 = H();
        c0660On = abstractC1099bVH2 instanceof C0660On ? (C0660On) abstractC1099bVH2 : null;
        return (c0660On != null ? c0660On.u : new C0660On("").u).p ? strH.trim() : strH;
    }

    public final String S() {
        F6 f6 = this.r;
        return f6 != null ? f6.m("id") : "";
    }

    public final C3176wp T() {
        AbstractC1099bV abstractC1099bVV = this;
        do {
            abstractC1099bVV = abstractC1099bVV.v();
            if (abstractC1099bVV == null) {
                return null;
            }
        } while (!(abstractC1099bVV instanceof C3176wp));
        return (C3176wp) abstractC1099bVV;
    }

    public final String U() {
        StringBuilder sbB = AbstractC1021ah0.b();
        for (int i = 0; i < this.q.size(); i++) {
            AbstractC1099bV abstractC1099bV = (AbstractC1099bV) this.q.get(i);
            if (abstractC1099bV instanceof Qi0) {
                Qi0 qi0 = (Qi0) abstractC1099bV;
                String strI = qi0.I();
                if (V(qi0.l) || (qi0 instanceof C3049va)) {
                    sbB.append(strI);
                } else {
                    AbstractC1021ah0.a(sbB, strI, Qi0.L(sbB));
                }
            } else if (abstractC1099bV.u("br") && !Qi0.L(sbB)) {
                sbB.append(" ");
            }
        }
        return AbstractC1021ah0.h(sbB).trim();
    }

    public final C3370yp W(String str) {
        Sr0.u(str);
        AbstractC1332dr abstractC1332drK = A40.k(str);
        Sr0.w(abstractC1332drK);
        abstractC1332drK.c();
        return (C3370yp) AbstractC1474fG.T(this, C3176wp.class).filter(new C0767Sq(abstractC1332drK, this)).collect(Collectors.toCollection(new C1504ff(0)));
    }

    public final C3176wp X(String str) {
        Sr0.u(str);
        AbstractC1332dr abstractC1332drK = A40.k(str);
        abstractC1332drK.c();
        return (C3176wp) AbstractC1474fG.T(this, C3176wp.class).filter(new C0767Sq(abstractC1332drK, this)).findFirst().orElse(null);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0044  */
    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public final boolean Y(C0634Nn c0634Nn) {
        boolean z;
        C3176wp c3176wp;
        int i;
        C3176wp c3176wp2;
        if (c0634Nn.p && ((z = this.f1103o.f1008o) || ((c3176wp2 = (C3176wp) this.l) != null && c3176wp2.f1103o.p))) {
            if ((!z) && (((c3176wp = (C3176wp) this.l) == null || c3176wp.f1103o.f1008o) && (i = this.m) != 0)) {
                if (i == 1) {
                    AbstractC1099bV abstractC1099bVC = C();
                    if ((abstractC1099bVC instanceof Qi0) && AbstractC1021ah0.e(((Qi0) abstractC1099bVC).I())) {
                        if (!V(this.l)) {
                            return true;
                        }
                    } else if (u("br")) {
                        if (!V(this.l)) {
                            return true;
                        }
                    }
                } else if (u("br")) {
                    if (!V(this.l)) {
                        return true;
                    }
                }
            } else if (!V(this.l)) {
                return true;
            }
        }
        return false;
    }

    public final String Z() {
        StringBuilder sbB = AbstractC1021ah0.b();
        AbstractC1376eG.H(new C2133m1(21, sbB), this);
        return AbstractC1021ah0.h(sbB).trim();
    }

    public final String a0() {
        StringBuilder sbB = AbstractC1021ah0.b();
        int size = this.q.size();
        for (int i = 0; i < size; i++) {
            AbstractC1099bV abstractC1099bV = (AbstractC1099bV) this.q.get(i);
            if (abstractC1099bV instanceof Qi0) {
                sbB.append(((Qi0) abstractC1099bV).I());
            } else if (abstractC1099bV.u("br")) {
                sbB.append("\n");
            }
        }
        return AbstractC1021ah0.h(sbB);
    }

    @Override // o.AbstractC1099bV
    public final F6 g() {
        if (this.r == null) {
            this.r = new F6();
        }
        return this.r;
    }

    @Override // o.AbstractC1099bV
    public final String h() {
        for (C3176wp c3176wp = this; c3176wp != null; c3176wp = (C3176wp) c3176wp.l) {
            F6 f6 = c3176wp.r;
            if (f6 != null) {
                String str = t;
                if (f6.o(str) != -1) {
                    return c3176wp.r.k(str);
                }
            }
        }
        return "";
    }

    @Override // o.AbstractC1099bV
    public final int k() {
        return this.q.size();
    }

    @Override // o.AbstractC1099bV
    public final AbstractC1099bV o(AbstractC1099bV abstractC1099bV) {
        C3176wp c3176wp = (C3176wp) super.o(abstractC1099bV);
        F6 f6 = this.r;
        c3176wp.r = f6 != null ? f6.clone() : null;
        io.sentry.android.replay.l lVar = new io.sentry.android.replay.l(c3176wp, this.q.size());
        c3176wp.q = lVar;
        lVar.addAll(this.q);
        return c3176wp;
    }

    @Override // o.AbstractC1099bV
    public final AbstractC1099bV p() {
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            ((AbstractC1099bV) it.next()).l = null;
        }
        this.q.clear();
        return this;
    }

    @Override // o.AbstractC1099bV
    public final List q() {
        if (this.q == AbstractC1099bV.n) {
            this.q = new io.sentry.android.replay.l(this, 4);
        }
        return this.q;
    }

    @Override // o.AbstractC1099bV
    public final boolean s() {
        return this.r != null;
    }

    @Override // o.AbstractC1099bV
    public String w() {
        return this.f1103o.l;
    }

    @Override // o.AbstractC1099bV
    public final String x() {
        return this.f1103o.m;
    }

    @Override // o.AbstractC1099bV
    public void z(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        if (Y(c0634Nn) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            AbstractC1099bV.t(appendable, i, c0634Nn);
        }
        Appendable appendableAppend = appendable.append('<');
        C2678ri0 c2678ri0 = this.f1103o;
        appendableAppend.append(c2678ri0.l);
        F6 f6 = this.r;
        if (f6 != null) {
            f6.n(appendable, c0634Nn);
        }
        if (this.q.isEmpty()) {
            boolean z = c2678ri0.q;
            if (z || c2678ri0.r) {
                if (c0634Nn.s == 1 && z) {
                    appendable.append('>');
                    return;
                } else {
                    appendable.append(" />");
                    return;
                }
            }
        }
        appendable.append('>');
    }
}
