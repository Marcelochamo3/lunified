package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class TT {
    public static final /* synthetic */ int v = 0;
    public final String l;
    public WT m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f534o;
    public final ArrayList p;
    public final C2866tf0 q;
    public final LinkedHashMap r;
    public int s;
    public String t;
    public Rh0 u;

    static {
        new LinkedHashMap();
    }

    public TT(DU du) {
        AbstractC1474fG.j(du, "navigator");
        LinkedHashMap linkedHashMap = EU.b;
        this.l = AbstractC2506pt.t(du.getClass());
        this.p = new ArrayList();
        this.q = new C2866tf0(0);
        this.r = new LinkedHashMap();
    }

    public final Bundle a(Bundle bundle) {
        Object obj;
        LinkedHashMap linkedHashMap = this.r;
        if (bundle == null && linkedHashMap.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            CT ct = (CT) entry.getValue();
            ct.getClass();
            AbstractC1474fG.j(str, "name");
            if (ct.c && (obj = ct.d) != null) {
                ct.a.e(bundle2, str, obj);
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                String str2 = (String) entry2.getKey();
                CT ct2 = (CT) entry2.getValue();
                ct2.getClass();
                AbstractC1474fG.j(str2, "name");
                boolean z = ct2.b;
                AbstractC1976kU abstractC1976kU = ct2.a;
                if (z || !bundle2.containsKey(str2) || bundle2.get(str2) != null) {
                    try {
                        abstractC1976kU.a(str2, bundle2);
                    } catch (ClassCastException unused) {
                    }
                }
                StringBuilder sbL = AbstractC1701hf0.l("Wrong argument type for '", str2, "' in argument bundle. ");
                sbL.append(abstractC1976kU.b());
                sbL.append(" expected.");
                throw new IllegalArgumentException(sbL.toString().toString());
            }
        }
        return bundle2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:14:0x002a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int[] d(TT tt) {
        M5 m5 = new M5();
        TT tt2 = this;
        while (true) {
            WT wt = tt2.m;
            if ((tt != null ? tt.m : null) != null) {
                WT wt2 = tt.m;
                AbstractC1474fG.g(wt2);
                if (wt2.k(tt2.s, wt2, false) != tt2) {
                    if (wt != null || wt.x != tt2.s) {
                        m5.e(tt2);
                    }
                    if (!AbstractC1474fG.b(wt, tt) || wt == null) {
                        break;
                    }
                    tt2 = wt;
                } else {
                    m5.e(tt2);
                    break;
                }
            } else {
                if (wt != null) {
                    m5.e(tt2);
                } else {
                    m5.e(tt2);
                }
                if (!AbstractC1474fG.b(wt, tt)) {
                    break;
                }
                tt2 = wt;
            }
        }
        List listX0 = AbstractC0911Ye.x0(m5);
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(listX0, 10));
        Iterator it = listX0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((TT) it.next()).s));
        }
        return AbstractC0911Ye.w0(arrayList);
    }

    public final C3430zT e(int i) {
        C2866tf0 c2866tf0 = this.q;
        C3430zT c3430zT = c2866tf0.h() == 0 ? null : (C3430zT) c2866tf0.d(i);
        if (c3430zT != null) {
            return c3430zT;
        }
        WT wt = this.m;
        if (wt != null) {
            return wt.e(i);
        }
        return null;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof TT)) {
            return false;
        }
        TT tt = (TT) obj;
        boolean zB = AbstractC1474fG.b(this.p, tt.p);
        C2866tf0 c2866tf0 = this.q;
        int iH = c2866tf0.h();
        C2866tf0 c2866tf1 = tt.q;
        if (iH != c2866tf1.h()) {
            z = false;
            break;
        }
        Iterator it = ((C0368Dg) Vb0.G(new C2963uf0(c2866tf0))).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            int iIntValue = ((Number) it.next()).intValue();
            if (!AbstractC1474fG.b(c2866tf0.d(iIntValue), c2866tf1.d(iIntValue))) {
                z = false;
                break;
            }
        }
        LinkedHashMap linkedHashMap = this.r;
        int size = linkedHashMap.size();
        LinkedHashMap linkedHashMap2 = tt.r;
        if (size != linkedHashMap2.size()) {
            z2 = false;
            break;
        }
        Iterator it2 = ((Iterable) AbstractC0911Ye.U(linkedHashMap.entrySet()).b).iterator();
        while (true) {
            if (!it2.hasNext()) {
                z2 = true;
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            if (!linkedHashMap2.containsKey(entry.getKey()) || !AbstractC1474fG.b(linkedHashMap2.get(entry.getKey()), entry.getValue())) {
                z2 = false;
                break;
            }
        }
        return this.s == tt.s && AbstractC1474fG.b(this.t, tt.t) && zB && z && z2;
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0196  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f0  */
    public RT f(RN rn) {
        int i;
        RT rt;
        int i2;
        List listA;
        int i3;
        List listS0;
        List listA2;
        int i4;
        this = this;
        rn = rn;
        ArrayList<PT> arrayList = this.p;
        Bundle bundle = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        RT rt2 = null;
        for (PT pt : arrayList) {
            LinkedHashMap linkedHashMap = this.r;
            Uri uri = (Uri) rn.m;
            Bundle bundleD = uri != null ? pt.d(uri, linkedHashMap) : bundle;
            int iB = pt.b(uri);
            String str = (String) rn.n;
            boolean z = str != null && AbstractC1474fG.b(str, pt.b);
            String str2 = (String) rn.f488o;
            if (str2 != null) {
                String str3 = pt.c;
                if (str3 != null) {
                    Pattern pattern = (Pattern) pt.f455o.getValue();
                    AbstractC1474fG.g(pattern);
                    if (pattern.matcher(str2).matches()) {
                        Pattern patternCompile = Pattern.compile("/");
                        AbstractC1474fG.i(patternCompile, "compile(...)");
                        AbstractC1119bh0.p0(0);
                        Matcher matcher = patternCompile.matcher(str3);
                        if (matcher.find()) {
                            ArrayList arrayList2 = new ArrayList(10);
                            int iEnd = 0;
                            do {
                                arrayList2.add(str3.subSequence(iEnd, matcher.start()).toString());
                                iEnd = matcher.end();
                            } while (matcher.find());
                            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
                            listA = arrayList2;
                        } else {
                            listA = AbstractC2506pt.A(str3.toString());
                        }
                        boolean zIsEmpty = listA.isEmpty();
                        List listS1 = C1233cq.l;
                        if (zIsEmpty) {
                            i3 = 1;
                            listS0 = listS1;
                            break;
                        }
                        ListIterator listIterator = listA.listIterator(listA.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                i3 = 1;
                                listS0 = listS1;
                                break;
                            }
                            if (((String) listIterator.previous()).length() != 0) {
                                i3 = 1;
                                listS0 = AbstractC0911Ye.s0(listIterator.nextIndex() + 1, listA);
                                break;
                            }
                        }
                        String str4 = (String) listS0.get(0);
                        String str5 = (String) listS0.get(i3);
                        Pattern patternCompile2 = Pattern.compile("/");
                        AbstractC1474fG.i(patternCompile2, "compile(...)");
                        AbstractC1119bh0.p0(0);
                        Matcher matcher2 = patternCompile2.matcher(str2);
                        if (matcher2.find()) {
                            ArrayList arrayList3 = new ArrayList(10);
                            int iEnd2 = 0;
                            do {
                                arrayList3.add(str2.subSequence(iEnd2, matcher2.start()).toString());
                                iEnd2 = matcher2.end();
                            } while (matcher2.find());
                            arrayList3.add(str2.subSequence(iEnd2, str2.length()).toString());
                            listA2 = arrayList3;
                        } else {
                            listA2 = AbstractC2506pt.A(str2.toString());
                        }
                        if (listA2.isEmpty()) {
                            i4 = 1;
                            break;
                        }
                        ListIterator listIterator2 = listA2.listIterator(listA2.size());
                        while (true) {
                            if (!listIterator2.hasPrevious()) {
                                i4 = 1;
                                break;
                            }
                            if (((String) listIterator2.previous()).length() != 0) {
                                i4 = 1;
                                listS1 = AbstractC0911Ye.s0(listIterator2.nextIndex() + 1, listA2);
                                break;
                            }
                        }
                        String str6 = (String) listS1.get(0);
                        String str7 = (String) listS1.get(i4);
                        i2 = AbstractC1474fG.b(str4, str6) ? 2 : 0;
                        if (AbstractC1474fG.b(str5, str7)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                } else {
                    i2 = -1;
                }
                i = i2;
            } else {
                i = -1;
            }
            if (bundleD != null) {
                rt = new RT(this, bundleD, pt.p, iB, z, i);
                if (rt2 != null || rt.compareTo(rt2) > 0) {
                    bundle = null;
                    rt2 = rt;
                } else {
                    bundle = null;
                }
            } else {
                if (z || i > -1) {
                    AbstractC1474fG.j(linkedHashMap, "arguments");
                    Bundle bundle2 = new Bundle();
                    if (uri != null) {
                        Pattern pattern2 = (Pattern) pt.f.getValue();
                        Matcher matcher3 = pattern2 != null ? pattern2.matcher(uri.toString()) : null;
                        if (matcher3 != null && matcher3.matches()) {
                            pt.e(matcher3, bundle2, linkedHashMap);
                            if (((Boolean) pt.g.getValue()).booleanValue()) {
                                pt.f(uri, bundle2, linkedHashMap);
                            }
                        }
                    }
                    if (Nr0.u(linkedHashMap, new OT(1, bundle2)).isEmpty()) {
                        rt = new RT(this, bundleD, pt.p, iB, z, i);
                        if (rt2 != null) {
                        }
                        bundle = null;
                        rt2 = rt;
                    }
                }
                bundle = null;
            }
        }
        return rt2;
    }

    public final RT g(String str) {
        PT pt;
        AbstractC1474fG.j(str, "route");
        Rh0 rh0 = this.u;
        if (rh0 == null || (pt = (PT) rh0.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse("android-app://androidx.navigation/".concat(str));
        AbstractC1474fG.f(uri, "Uri.parse(this)");
        Bundle bundleD = pt.d(uri, this.r);
        if (bundleD == null) {
            return null;
        }
        return new RT(this, bundleD, pt.p, pt.b(uri), false, -1);
    }

    public void h(Context context, AttributeSet attributeSet) {
        AbstractC1474fG.j(context, "context");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attributeSet, S40.e);
        AbstractC1474fG.i(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        String string = typedArrayObtainAttributes.getString(2);
        if (string == null) {
            this.s = 0;
            this.n = null;
        } else {
            if (!(!AbstractC1899jh0.O(string))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            String strConcat = "android-app://androidx.navigation/".concat(string);
            AbstractC1474fG.j(strConcat, "uriPattern");
            ArrayList arrayListU = Nr0.u(this.r, new ST(new PT(strConcat, null, null), 1));
            if (!arrayListU.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + string + "\" for destination " + this + ". Following required arguments are missing: " + arrayListU).toString());
            }
            this.u = new Rh0(new io.sentry.android.replay.f(12, strConcat));
            this.s = strConcat.hashCode();
            this.n = null;
        }
        this.t = string;
        if (typedArrayObtainAttributes.hasValue(1)) {
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            this.s = resourceId;
            this.n = null;
            this.n = AbstractC1923jt0.m(context, resourceId);
        }
        this.f534o = typedArrayObtainAttributes.getText(0);
        typedArrayObtainAttributes.recycle();
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i = this.s * 31;
        String str = this.t;
        int iHashCode = i + (str != null ? str.hashCode() : 0);
        for (PT pt : this.p) {
            int i2 = iHashCode * 31;
            String str2 = pt.a;
            int iHashCode2 = (i2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = pt.b;
            int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = pt.c;
            iHashCode = iHashCode3 + (str4 != null ? str4.hashCode() : 0);
        }
        C2866tf0 c2866tf0 = this.q;
        AbstractC1474fG.j(c2866tf0, "<this>");
        int i3 = 0;
        while (true) {
            if (!(i3 < c2866tf0.h())) {
                break;
            }
            int i4 = i3 + 1;
            C3430zT c3430zT = (C3430zT) c2866tf0.j(i3);
            int i5 = ((iHashCode * 31) + c3430zT.a) * 31;
            C1098bU c1098bU = c3430zT.b;
            iHashCode = i5 + (c1098bU != null ? c1098bU.hashCode() : 0);
            Bundle bundle = c3430zT.c;
            if (bundle != null && (setKeySet = bundle.keySet()) != null) {
                for (String str5 : setKeySet) {
                    int i6 = iHashCode * 31;
                    Bundle bundle2 = c3430zT.c;
                    AbstractC1474fG.g(bundle2);
                    Object obj = bundle2.get(str5);
                    iHashCode = i6 + (obj != null ? obj.hashCode() : 0);
                }
            }
            i3 = i4;
        }
        LinkedHashMap linkedHashMap = this.r;
        for (String str6 : linkedHashMap.keySet()) {
            int i7 = AbstractC1674hK.i(iHashCode * 31, str6, 31);
            Object obj2 = linkedHashMap.get(str6);
            iHashCode = i7 + (obj2 != null ? obj2.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.n;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.s));
        } else {
            sb.append(str);
        }
        sb.append(")");
        String str2 = this.t;
        if (str2 != null && !AbstractC1899jh0.O(str2)) {
            sb.append(" route=");
            sb.append(this.t);
        }
        if (this.f534o != null) {
            sb.append(" label=");
            sb.append(this.f534o);
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "sb.toString()");
        return string;
    }
}
