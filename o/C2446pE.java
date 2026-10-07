package o;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.pE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2446pE {
    public static final char[] k = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final List f;
    public final List g;
    public final String h;
    public final String i;
    public final boolean j;

    public C2446pE(String str, String str2, String str3, String str4, int i, ArrayList arrayList, ArrayList arrayList2, String str5, String str6) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = str5;
        this.i = str6;
        this.j = AbstractC1474fG.b(str, "https");
    }

    public final String a() {
        if (this.c.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(AbstractC1119bh0.d0(str, ':', length, false, 4) + 1, AbstractC1119bh0.d0(str, '@', 0, false, 6));
        AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String b() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iD0 = AbstractC1119bh0.d0(str, '/', length, false, 4);
        String strSubstring = str.substring(iD0, Mr0.f(iD0, str.length(), str, "?#"));
        AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final ArrayList c() {
        int length = this.a.length() + 3;
        String str = this.i;
        int iD0 = AbstractC1119bh0.d0(str, '/', length, false, 4);
        int iF = Mr0.f(iD0, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (iD0 < iF) {
            int i = iD0 + 1;
            int iG = Mr0.g(str, '/', i, iF);
            String strSubstring = str.substring(i, iG);
            AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            arrayList.add(strSubstring);
            iD0 = iG;
        }
        return arrayList;
    }

    public final String d() {
        if (this.g == null) {
            return null;
        }
        String str = this.i;
        int iD0 = AbstractC1119bh0.d0(str, '?', 0, false, 6) + 1;
        String strSubstring = str.substring(iD0, Mr0.g(str, '#', iD0, str.length()));
        AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final String e() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.i;
        String strSubstring = str.substring(length, Mr0.f(length, str.length(), str, ":@"));
        AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2446pE) && AbstractC1474fG.b(((C2446pE) obj).i, this.i);
    }

    public final C2349oE f() {
        int i;
        C2349oE c2349oE = new C2349oE();
        String str = this.a;
        c2349oE.d = str;
        c2349oE.e = e();
        c2349oE.f = a();
        c2349oE.g = this.d;
        AbstractC1474fG.j(str, "scheme");
        if (AbstractC1474fG.b(str, "http")) {
            i = 80;
        } else {
            i = AbstractC1474fG.b(str, "https") ? 443 : -1;
        }
        int i2 = this.e;
        c2349oE.b = i2 != i ? i2 : -1;
        ArrayList arrayList = c2349oE.c;
        arrayList.clear();
        arrayList.addAll(c());
        String strD = d();
        String strSubstring = null;
        c2349oE.i = strD != null ? C0622Nb.I(C0622Nb.l(strD, 0, 0, " \"'<>#", true, false, true, false, null, 211)) : null;
        if (this.h != null) {
            String str2 = this.i;
            strSubstring = str2.substring(AbstractC1119bh0.d0(str2, '#', 0, false, 6) + 1);
            AbstractC1474fG.i(strSubstring, "this as java.lang.String).substring(startIndex)");
        }
        c2349oE.h = strSubstring;
        return c2349oE;
    }

    public final C2349oE g(String str) {
        AbstractC1474fG.j(str, "link");
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(this, str);
            return c2349oE;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String h() {
        List list = this.g;
        if (list == null) {
            return null;
        }
        XF xfH = U9.H(U9.L(0, list.size()), 2);
        int i = xfH.l;
        int i2 = xfH.m;
        int i3 = xfH.n;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!AbstractC1474fG.b("url", list.get(i))) {
                if (i != i2) {
                    i += i3;
                }
            }
            return (String) list.get(i + 1);
        }
        return null;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    public final String i() {
        C2349oE c2349oEG = g("/...");
        AbstractC1474fG.g(c2349oEG);
        c2349oEG.e = C0622Nb.l("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, C3080vp0.z0);
        c2349oEG.f = C0622Nb.l("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, C3080vp0.z0);
        return c2349oEG.b().i;
    }

    public final C2446pE j(String str) {
        AbstractC1474fG.j(str, "link");
        C2349oE c2349oEG = g(str);
        if (c2349oEG != null) {
            return c2349oEG.b();
        }
        return null;
    }

    public final URI k() {
        String strReplaceAll;
        C2349oE c2349oEF = f();
        String str = (String) c2349oEF.g;
        if (str != null) {
            Pattern patternCompile = Pattern.compile("[\"<>^`{|}]");
            AbstractC1474fG.i(patternCompile, "compile(...)");
            strReplaceAll = patternCompile.matcher(str).replaceAll("");
            AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        } else {
            strReplaceAll = null;
        }
        c2349oEF.g = strReplaceAll;
        ArrayList arrayList = c2349oEF.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.set(i, C0622Nb.l((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, null, 227));
        }
        ArrayList arrayList2 = (ArrayList) c2349oEF.i;
        if (arrayList2 != null) {
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                String str2 = (String) arrayList2.get(i2);
                arrayList2.set(i2, str2 != null ? C0622Nb.l(str2, 0, 0, "\\^`{|}", true, true, true, false, null, 195) : null);
            }
        }
        String str3 = (String) c2349oEF.h;
        c2349oEF.h = str3 != null ? C0622Nb.l(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163) : null;
        String string = c2349oEF.toString();
        try {
            return new URI(string);
        } catch (URISyntaxException e) {
            try {
                Pattern patternCompile2 = Pattern.compile("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]");
                AbstractC1474fG.i(patternCompile2, "compile(...)");
                String strReplaceAll2 = patternCompile2.matcher(string).replaceAll("");
                AbstractC1474fG.i(strReplaceAll2, "replaceAll(...)");
                URI uriCreate = URI.create(strReplaceAll2);
                AbstractC1474fG.i(uriCreate, "{\n      // Unlikely edge…Unexpected!\n      }\n    }");
                return uriCreate;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String toString() {
        return this.i;
    }
}
