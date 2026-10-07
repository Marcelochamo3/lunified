package o;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class D6 implements Map.Entry, Cloneable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String[] f210o = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};
    public static final Pattern p = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");
    public static final Pattern q = Pattern.compile("[^-a-zA-Z0-9_:.]");
    public static final Pattern r = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    public static final Pattern s = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");
    public final String l;
    public String m;
    public F6 n;

    public D6(String str, String str2, F6 f6) {
        Sr0.w(str);
        String strTrim = str.trim();
        Sr0.u(strTrim);
        this.l = strTrim;
        this.m = str2;
        this.n = f6;
    }

    public static String b(int i, String str) {
        if (i == 2) {
            Pattern pattern = p;
            if (!pattern.matcher(str).matches()) {
                String strReplaceAll = q.matcher(str).replaceAll("");
                if (pattern.matcher(strReplaceAll).matches()) {
                    return strReplaceAll;
                }
                return null;
            }
        }
        if (i == 1) {
            Pattern pattern2 = r;
            if (!pattern2.matcher(str).matches()) {
                String strReplaceAll2 = s.matcher(str).replaceAll("");
                if (pattern2.matcher(strReplaceAll2).matches()) {
                    return strReplaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    public static void c(String str, String str2, Appendable appendable, C0634Nn c0634Nn) throws IOException {
        appendable.append(str);
        if (c0634Nn.s == 1) {
            if (str2 == null) {
                return;
            }
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(f210o, AP.o(str)) >= 0) {
                return;
            }
        }
        appendable.append("=\"");
        if (str2 == null) {
            str2 = "";
        }
        AbstractC0300Aq.b(appendable, str2, c0634Nn, true, false, false, false);
        appendable.append('\"');
    }

    public final Object clone() {
        try {
            return (D6) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D6.class != obj.getClass()) {
            return false;
        }
        D6 d6 = (D6) obj;
        String str = d6.l;
        String str2 = this.l;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        String str3 = this.m;
        String str4 = d6.m;
        if (str3 != null) {
            return str3.equals(str4);
        }
        return str4 == null;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        String str = this.m;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        String str = this.l;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.m;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        String str;
        int iO;
        String str2 = (String) obj;
        String strK = this.m;
        F6 f6 = this.n;
        if (f6 != null && (iO = f6.o((str = this.l))) != -1) {
            strK = this.n.k(str);
            this.n.n[iO] = str2;
        }
        this.m = str2;
        return strK == null ? "" : strK;
    }

    public final String toString() {
        StringBuilder sbB = AbstractC1021ah0.b();
        try {
            C0634Nn c0634Nn = new C0660On("").u;
            String str = this.m;
            String strB = b(c0634Nn.s, this.l);
            if (strB != null) {
                c(strB, str, sbB, c0634Nn);
            }
            return AbstractC1021ah0.h(sbB);
        } catch (IOException e) {
            throw new C0730Rf(e);
        }
    }
}
