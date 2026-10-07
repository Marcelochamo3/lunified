package o;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.bV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1099bV implements Cloneable {
    public static final List n = Collections.emptyList();
    public AbstractC1099bV l;
    public int m;

    public static void t(Appendable appendable, int i, C0634Nn c0634Nn) throws IOException {
        String strValueOf;
        Appendable appendableAppend = appendable.append('\n');
        int iMin = i * c0634Nn.q;
        String[] strArr = AbstractC1021ah0.a;
        if (!(iMin >= 0)) {
            throw new C1629gs0("width must be >= 0");
        }
        int i2 = c0634Nn.r;
        Sr0.s(i2 >= -1);
        if (i2 != -1) {
            iMin = Math.min(iMin, i2);
        }
        if (iMin < 21) {
            strValueOf = AbstractC1021ah0.a[iMin];
        } else {
            char[] cArr = new char[iMin];
            for (int i3 = 0; i3 < iMin; i3++) {
                cArr[i3] = ' ';
            }
            strValueOf = String.valueOf(cArr);
        }
        appendableAppend.append(strValueOf);
    }

    public abstract void A(Appendable appendable, int i, C0634Nn c0634Nn);

    public AbstractC1099bV B() {
        return this.l;
    }

    public final AbstractC1099bV C() {
        AbstractC1099bV abstractC1099bV = this.l;
        if (abstractC1099bV != null && this.m > 0) {
            return (AbstractC1099bV) abstractC1099bV.q().get(this.m - 1);
        }
        return null;
    }

    public final void D(int i) {
        int iK = k();
        if (iK == 0) {
            return;
        }
        List listQ = q();
        while (i < iK) {
            ((AbstractC1099bV) listQ.get(i)).m = i;
            i++;
        }
    }

    public final void E() {
        AbstractC1099bV abstractC1099bV = this.l;
        if (abstractC1099bV != null) {
            abstractC1099bV.F(this);
        }
    }

    public void F(AbstractC1099bV abstractC1099bV) {
        Sr0.s(abstractC1099bV.l == this);
        int i = abstractC1099bV.m;
        q().remove(i);
        D(i);
        abstractC1099bV.l = null;
    }

    public final void G(AbstractC1099bV abstractC1099bV) {
        Sr0.w(abstractC1099bV);
        Sr0.w(this.l);
        AbstractC1099bV abstractC1099bV2 = this.l;
        abstractC1099bV2.getClass();
        Sr0.s(this.l == abstractC1099bV2);
        if (this == abstractC1099bV) {
            return;
        }
        AbstractC1099bV abstractC1099bV3 = abstractC1099bV.l;
        if (abstractC1099bV3 != null) {
            abstractC1099bV3.F(abstractC1099bV);
        }
        int i = this.m;
        abstractC1099bV2.q().set(i, abstractC1099bV);
        abstractC1099bV.l = abstractC1099bV2;
        abstractC1099bV.m = i;
        this.l = null;
    }

    public AbstractC1099bV H() {
        AbstractC1099bV abstractC1099bV = this;
        while (true) {
            AbstractC1099bV abstractC1099bV2 = abstractC1099bV.l;
            if (abstractC1099bV2 == null) {
                return abstractC1099bV;
            }
            abstractC1099bV = abstractC1099bV2;
        }
    }

    public String b(String str) {
        Sr0.u(str);
        if (!s() || g().p(str) == -1) {
            return "";
        }
        String strH = h();
        String strM = g().m(str);
        Pattern pattern = AbstractC1021ah0.d;
        String strReplaceAll = pattern.matcher(strH).replaceAll("");
        String strReplaceAll2 = pattern.matcher(strM).replaceAll("");
        try {
            try {
                strReplaceAll2 = AbstractC1021ah0.i(new URL(strReplaceAll), strReplaceAll2).toExternalForm();
            } catch (MalformedURLException unused) {
                strReplaceAll2 = new URL(strReplaceAll2).toExternalForm();
            }
            return strReplaceAll2;
        } catch (MalformedURLException unused2) {
            return AbstractC1021ah0.c.matcher(strReplaceAll2).find() ? strReplaceAll2 : "";
        }
    }

    public final void c(int i, AbstractC1099bV... abstractC1099bVArr) {
        Sr0.w(abstractC1099bVArr);
        if (abstractC1099bVArr.length == 0) {
            return;
        }
        List listQ = q();
        AbstractC1099bV abstractC1099bVB = abstractC1099bVArr[0].B();
        if (abstractC1099bVB != null && abstractC1099bVB.k() == abstractC1099bVArr.length) {
            List listQ2 = abstractC1099bVB.q();
            int length = abstractC1099bVArr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    boolean z = k() == 0;
                    abstractC1099bVB.p();
                    listQ.addAll(i, Arrays.asList(abstractC1099bVArr));
                    int length2 = abstractC1099bVArr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        abstractC1099bVArr[i3].l = this;
                        length2 = i3;
                    }
                    if (z && abstractC1099bVArr[0].m == 0) {
                        return;
                    }
                    D(i);
                    return;
                }
                if (abstractC1099bVArr[i2] != listQ2.get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        for (AbstractC1099bV abstractC1099bV : abstractC1099bVArr) {
            if (abstractC1099bV == null) {
                throw new C1629gs0("Array must not contain any null objects");
            }
        }
        for (AbstractC1099bV abstractC1099bV2 : abstractC1099bVArr) {
            abstractC1099bV2.getClass();
            AbstractC1099bV abstractC1099bV3 = abstractC1099bV2.l;
            if (abstractC1099bV3 != null) {
                abstractC1099bV3.F(abstractC1099bV2);
            }
            abstractC1099bV2.l = this;
        }
        listQ.addAll(i, Arrays.asList(abstractC1099bVArr));
        D(i);
    }

    public String d(String str) {
        Sr0.w(str);
        if (!s()) {
            return "";
        }
        String strM = g().m(str);
        if (strM.length() > 0) {
            return strM;
        }
        return str.startsWith("abs:") ? b(str.substring(4)) : "";
    }

    public void e(String str, String str2) {
        C2852tX c2852tX = (C2852tX) AbstractC1474fG.O(this).f488o;
        c2852tX.getClass();
        String strTrim = str.trim();
        if (!c2852tX.b) {
            strTrim = AP.o(strTrim);
        }
        F6 f6G = g();
        int iP = f6G.p(strTrim);
        if (iP == -1) {
            f6G.e(str2, strTrim);
            return;
        }
        f6G.n[iP] = str2;
        if (f6G.m[iP].equals(strTrim)) {
            return;
        }
        f6G.m[iP] = strTrim;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public abstract F6 g();

    public abstract String h();

    public final int hashCode() {
        return super.hashCode();
    }

    public final AbstractC1099bV j(int i) {
        return (AbstractC1099bV) q().get(i);
    }

    public abstract int k();

    public final List m() {
        if (k() == 0) {
            return n;
        }
        List listQ = q();
        ArrayList arrayList = new ArrayList(listQ.size());
        arrayList.addAll(listQ);
        return Collections.unmodifiableList(arrayList);
    }

    @Override // 
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public AbstractC1099bV clone() {
        AbstractC1099bV abstractC1099bVO = o(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC1099bVO);
        while (!linkedList.isEmpty()) {
            AbstractC1099bV abstractC1099bV = (AbstractC1099bV) linkedList.remove();
            int iK = abstractC1099bV.k();
            for (int i = 0; i < iK; i++) {
                List listQ = abstractC1099bV.q();
                AbstractC1099bV abstractC1099bVO2 = ((AbstractC1099bV) listQ.get(i)).o(abstractC1099bV);
                listQ.set(i, abstractC1099bVO2);
                linkedList.add(abstractC1099bVO2);
            }
        }
        return abstractC1099bVO;
    }

    public AbstractC1099bV o(AbstractC1099bV abstractC1099bV) {
        try {
            AbstractC1099bV abstractC1099bV2 = (AbstractC1099bV) super.clone();
            abstractC1099bV2.l = abstractC1099bV;
            abstractC1099bV2.m = abstractC1099bV == null ? 0 : this.m;
            if (abstractC1099bV == null && !(this instanceof C0660On)) {
                AbstractC1099bV abstractC1099bVH = H();
                C0660On c0660On = abstractC1099bVH instanceof C0660On ? (C0660On) abstractC1099bVH : null;
                if (c0660On != null) {
                    C0660On c0660On2 = new C0660On(c0660On.f1103o.n, c0660On.h());
                    F6 f6 = c0660On.r;
                    if (f6 != null) {
                        c0660On2.r = f6.clone();
                    }
                    c0660On2.u = c0660On.u.clone();
                    abstractC1099bV2.l = c0660On2;
                    c0660On2.q().add(abstractC1099bV2);
                }
            }
            return abstractC1099bV2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public abstract AbstractC1099bV p();

    public abstract List q();

    public boolean r(String str) {
        Sr0.w(str);
        if (!s()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (g().p(strSubstring) != -1 && !b(strSubstring).isEmpty()) {
                return true;
            }
        }
        return g().p(str) != -1;
    }

    public abstract boolean s();

    public String toString() {
        return y();
    }

    public final boolean u(String str) {
        return x().equals(str);
    }

    public final AbstractC1099bV v() {
        AbstractC1099bV abstractC1099bV = this.l;
        if (abstractC1099bV == null) {
            return null;
        }
        List listQ = abstractC1099bV.q();
        int i = this.m + 1;
        if (listQ.size() > i) {
            return (AbstractC1099bV) listQ.get(i);
        }
        return null;
    }

    public abstract String w();

    public String x() {
        return w();
    }

    public String y() {
        StringBuilder sbB = AbstractC1021ah0.b();
        AbstractC1099bV abstractC1099bVH = H();
        C0660On c0660On = abstractC1099bVH instanceof C0660On ? (C0660On) abstractC1099bVH : null;
        if (c0660On == null) {
            c0660On = new C0660On("");
        }
        AbstractC1376eG.H(new C2994uv(sbB, c0660On.u), this);
        return AbstractC1021ah0.h(sbB);
    }

    public abstract void z(Appendable appendable, int i, C0634Nn c0634Nn);
}
