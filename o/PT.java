package o;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class PT {
    public static final Pattern q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final Pattern r = Pattern.compile("\\{(.+?)\\}");
    public final String a;
    public final String b;
    public final String c;
    public final ArrayList d;
    public final String e;
    public final Rh0 f;
    public final Rh0 g;
    public final CJ h;
    public boolean i;
    public final CJ j;
    public final CJ k;
    public final CJ l;
    public final Rh0 m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rh0 f455o;
    public final boolean p;

    public PT(String str, String str2, String str3) {
        List listA;
        List listS0;
        this.a = str;
        this.b = str2;
        this.c = str3;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.f = new Rh0(new NT(this, 6));
        this.g = new Rh0(new NT(this, 4));
        IJ ij = IJ.n;
        this.h = AP.m(ij, new NT(this, 7));
        this.j = AP.m(ij, new NT(this, 1));
        this.k = AP.m(ij, new NT(this, 0));
        this.l = AP.m(ij, new NT(this, 3));
        this.m = new Rh0(new NT(this, 2));
        this.f455o = new Rh0(new NT(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String strSubstring = str.substring(0, matcher.start());
            AbstractC1474fG.i(strSubstring, "substring(...)");
            a(strSubstring, arrayList, sb);
            this.p = (AbstractC1119bh0.W(sb, io.sentry.I1.DEFAULT_PROPAGATION_TARGETS, false) || AbstractC1119bh0.W(sb, "([^/]+?)", false)) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            String string = sb.toString();
            AbstractC1474fG.i(string, "uriRegex.toString()");
            this.e = AbstractC1899jh0.R(string, io.sentry.I1.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false);
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(AbstractC1701hf0.u("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        Pattern patternCompile = Pattern.compile("/");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        AbstractC1119bh0.p0(0);
        Matcher matcher2 = patternCompile.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(str3.subSequence(iEnd, matcher2.start()).toString());
                iEnd = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
            listA = arrayList2;
        } else {
            listA = AbstractC2506pt.A(str3.toString());
        }
        if (listA.isEmpty()) {
            listS0 = C1233cq.l;
        } else {
            ListIterator listIterator = listA.listIterator(listA.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listS0 = AbstractC0911Ye.s0(listIterator.nextIndex() + 1, listA);
                }
            }
            listS0 = C1233cq.l;
        }
        this.n = AbstractC1899jh0.R("^(" + ((String) listS0.get(0)) + "|[*]+)/(" + ((String) listS0.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]", false);
    }

    public static void a(String str, List list, StringBuilder sb) {
        Matcher matcher = r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            AbstractC1474fG.h(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                AbstractC1474fG.i(strSubstring, "substring(...)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            AbstractC1474fG.i(strSubstring2, "substring(...)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public static void g(Bundle bundle, String str, String str2, CT ct) {
        if (ct == null) {
            bundle.putString(str, str2);
            return;
        }
        AbstractC1976kU abstractC1976kU = ct.a;
        abstractC1976kU.getClass();
        AbstractC1474fG.j(str, "key");
        abstractC1976kU.e(bundle, str, abstractC1976kU.h(str2));
    }

    public final int b(Uri uri) {
        String str;
        if (uri == null || (str = this.a) == null) {
            return 0;
        }
        List<String> pathSegments = uri.getPathSegments();
        List<String> pathSegments2 = Uri.parse(str).getPathSegments();
        AbstractC1474fG.i(pathSegments, "requestedPathSegments");
        AbstractC1474fG.i(pathSegments2, "uriPathSegments");
        Set setA0 = AbstractC0911Ye.A0(pathSegments);
        setA0.retainAll(pathSegments2);
        return setA0.size();
    }

    public final ArrayList c() {
        ArrayList arrayList = this.d;
        Collection collectionValues = ((Map) this.h.getValue()).values();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            AbstractC1406ef.Q(arrayList2, ((MT) it.next()).b);
        }
        return AbstractC0911Ye.m0(AbstractC0911Ye.m0(arrayList, arrayList2), (List) this.k.getValue());
    }

    public final Bundle d(Uri uri, LinkedHashMap linkedHashMap) {
        AbstractC1474fG.j(linkedHashMap, "arguments");
        Pattern pattern = (Pattern) this.f.getValue();
        Matcher matcher = pattern != null ? pattern.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (!e(matcher, bundle, linkedHashMap)) {
            return null;
        }
        if (((Boolean) this.g.getValue()).booleanValue() && !f(uri, bundle, linkedHashMap)) {
            return null;
        }
        String fragment = uri.getFragment();
        Pattern pattern2 = (Pattern) this.m.getValue();
        Matcher matcher2 = pattern2 != null ? pattern2.matcher(String.valueOf(fragment)) : null;
        if (matcher2 != null && matcher2.matches()) {
            List list = (List) this.k.getValue();
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0937Ze.N();
                    throw null;
                }
                String str = (String) obj;
                String strDecode = Uri.decode(matcher2.group(i2));
                CT ct = (CT) linkedHashMap.get(str);
                try {
                    AbstractC1474fG.i(strDecode, "value");
                    g(bundle, str, strDecode, ct);
                    arrayList.add(C2985uq0.a);
                    i = i2;
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        if (!Nr0.u(linkedHashMap, new OT(0, bundle)).isEmpty()) {
            return null;
        }
        return bundle;
    }

    public final boolean e(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0937Ze.N();
                throw null;
            }
            String str = (String) obj;
            String strDecode = Uri.decode(matcher.group(i2));
            CT ct = (CT) linkedHashMap.get(str);
            try {
                AbstractC1474fG.i(strDecode, "value");
                g(bundle, str, strDecode, ct);
                arrayList2.add(C2985uq0.a);
                i = i2;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof PT)) {
            return false;
        }
        PT pt = (PT) obj;
        return AbstractC1474fG.b(this.a, pt.a) && AbstractC1474fG.b(this.b, pt.b) && AbstractC1474fG.b(this.c, pt.c);
    }

    public final boolean f(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        Object objValueOf;
        boolean z;
        String query;
        for (Map.Entry entry : ((Map) this.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            MT mt = (MT) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (this.i && (query = uri.getQuery()) != null && !AbstractC1474fG.b(query, uri.toString())) {
                queryParameters = AbstractC2506pt.A(query);
            }
            AbstractC1474fG.i(queryParameters, "inputParams");
            C2985uq0 c2985uq0 = C2985uq0.a;
            Bundle bundleC = AbstractC1474fG.c(new C1101bX[0]);
            for (String str2 : mt.b) {
                CT ct = (CT) linkedHashMap.get(str2);
                AbstractC1976kU abstractC1976kU = ct != null ? ct.a : null;
                if ((abstractC1976kU instanceof C1293dU) && !ct.c) {
                    abstractC1976kU.e(bundleC, str2, ((C1293dU) abstractC1976kU).h());
                }
            }
            for (String str3 : queryParameters) {
                String str4 = mt.a;
                Matcher matcher = str4 != null ? Pattern.compile(str4, 32).matcher(str3) : null;
                if (matcher == null || !matcher.matches()) {
                    return false;
                }
                ArrayList arrayList = mt.b;
                ArrayList arrayList2 = new ArrayList(AbstractC1016af.O(arrayList, 10));
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i < 0) {
                        AbstractC0937Ze.N();
                        throw null;
                    }
                    String str5 = (String) obj;
                    String strGroup = matcher.group(i2);
                    if (strGroup == null) {
                        strGroup = "";
                    }
                    CT ct2 = (CT) linkedHashMap.get(str5);
                    try {
                        if (bundleC.containsKey(str5)) {
                            if (bundleC.containsKey(str5)) {
                                if (ct2 != null) {
                                    AbstractC1976kU abstractC1976kU2 = ct2.a;
                                    Object objA = abstractC1976kU2.a(str5, bundleC);
                                    if (!bundleC.containsKey(str5)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    abstractC1976kU2.e(bundleC, str5, abstractC1976kU2.c(objA, strGroup));
                                    objValueOf = c2985uq0;
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            objValueOf = Boolean.valueOf(z);
                        } else {
                            g(bundleC, str5, strGroup, ct2);
                            objValueOf = c2985uq0;
                        }
                    } catch (IllegalArgumentException unused) {
                    }
                    arrayList2.add(objValueOf);
                    i = i2;
                }
            }
            bundle.putAll(bundleC);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
