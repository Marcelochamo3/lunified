package o;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class NT extends AbstractC3226xJ implements InterfaceC0360Cy {
    public final /* synthetic */ int m;
    public final /* synthetic */ PT n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NT(PT pt, int i) {
        super(0);
        this.m = i;
        this.n = pt;
    }

    @Override // o.InterfaceC0360Cy
    public final Object c() {
        List list;
        switch (this.m) {
            case 0:
                C1101bX c1101bX = (C1101bX) this.n.j.getValue();
                return (c1101bX == null || (list = (List) c1101bX.l) == null) ? new ArrayList() : list;
            case 1:
                String str = this.n.a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                AbstractC1474fG.g(fragment);
                PT.a(fragment, arrayList, sb);
                String string = sb.toString();
                AbstractC1474fG.i(string, "fragRegex.toString()");
                return new C1101bX(arrayList, string);
            case 2:
                String str2 = (String) this.n.l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                C1101bX c1101bX2 = (C1101bX) this.n.j.getValue();
                if (c1101bX2 != null) {
                    return (String) c1101bX2.m;
                }
                return null;
            case 4:
                String str3 = this.n.a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                String str4 = this.n.n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = this.n.e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                PT pt = this.n;
                pt.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) pt.g.getValue()).booleanValue()) {
                    String str6 = pt.a;
                    Uri uri = Uri.parse(str6);
                    for (String str7 : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(str7);
                        int i = 1;
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + str7 + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String str8 = (String) AbstractC0911Ye.d0(queryParameters);
                        if (str8 == null) {
                            pt.i = true;
                            str8 = str7;
                        }
                        Matcher matcher = PT.r.matcher(str8);
                        MT mt = new MT();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(i);
                            AbstractC1474fG.h(strGroup, "null cannot be cast to non-null type kotlin.String");
                            mt.b.add(strGroup);
                            AbstractC1474fG.i(str8, "queryParam");
                            String strSubstring = str8.substring(iEnd, matcher.start());
                            AbstractC1474fG.i(strSubstring, "substring(...)");
                            sb2.append(Pattern.quote(strSubstring));
                            sb2.append("(.+?)?");
                            iEnd = matcher.end();
                            i = 1;
                        }
                        if (iEnd < str8.length()) {
                            String strSubstring2 = str8.substring(iEnd);
                            AbstractC1474fG.i(strSubstring2, "substring(...)");
                            sb2.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb2.toString();
                        AbstractC1474fG.i(string2, "argRegex.toString()");
                        mt.a = AbstractC1899jh0.R(string2, io.sentry.I1.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false);
                        AbstractC1474fG.i(str7, "paramName");
                        linkedHashMap.put(str7, mt);
                    }
                }
                return linkedHashMap;
        }
    }
}
