package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* JADX INFO: renamed from: o.kE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1960kE {
    static {
        C2468pa c2468pa = C2468pa.f972o;
        C2691rp.t("\"\\");
        C2691rp.t("\t ,=");
    }

    public static final boolean a(C1855j80 c1855j80) {
        if (AbstractC1474fG.b(c1855j80.l.b, "HEAD")) {
            return false;
        }
        int i = c1855j80.f840o;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && Mr0.k(c1855j80) == -1 && !AbstractC1899jh0.N("chunked", c1855j80.f("Transfer-Encoding", null), true)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0065 A[EDGE_INSN: B:15:0x0065->B:105:0x01e1 BREAK  A[LOOP:1: B:20:0x008e->B:67:0x0159]] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v4, types: [boolean, int] */
    public static final void b(InterfaceC0654Oh interfaceC0654Oh, C2446pE c2446pE, C2152mB c2152mB) {
        List listUnmodifiableList;
        C0628Nh c0628Nh;
        String str;
        boolean z = true;
        AbstractC1474fG.j(interfaceC0654Oh, "<this>");
        AbstractC1474fG.j(c2446pE, "url");
        AbstractC1474fG.j(c2152mB, "headers");
        if (interfaceC0654Oh == InterfaceC0654Oh.d) {
            return;
        }
        Pattern pattern = C0628Nh.j;
        List listI = c2152mB.i("Set-Cookie");
        int size = listI.size();
        int i = 0;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < size; i2++) {
            String str2 = (String) listI.get(i2);
            AbstractC1474fG.j(str2, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = Mr0.a;
            char c = ';';
            int iG = Mr0.g(str2, ';', i, str2.length());
            char c2 = '=';
            int iG2 = Mr0.g(str2, '=', i, iG);
            if (iG2 != iG) {
                String strZ = Mr0.z(i, str2, iG2);
                if (strZ.length() == 0 || Mr0.m(strZ) != -1) {
                    c0628Nh = null;
                    i = 0;
                    break;
                }
                String strZ2 = Mr0.z(iG2 + (z ? 1 : 0), str2, iG);
                if (Mr0.m(strZ2) != -1) {
                    c0628Nh = null;
                    i = 0;
                    break;
                }
                int i3 = iG + (z ? 1 : 0);
                int length = str2.length();
                long j = 253402300799999L;
                long jB = 253402300799999L;
                String str3 = null;
                long j2 = -1;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = true;
                String str4 = null;
                ?? r3 = z;
                while (true) {
                    if (i3 >= length) {
                        if (j2 == Long.MIN_VALUE) {
                            j = Long.MIN_VALUE;
                        } else if (j2 != -1) {
                            long j3 = jCurrentTimeMillis + (j2 <= 9223372036854775L ? j2 * ((long) 1000) : Long.MAX_VALUE);
                            if (j3 >= jCurrentTimeMillis && j3 <= 253402300799999L) {
                                j = j3;
                            }
                        } else {
                            j = jB;
                        }
                        String str5 = c2446pE.d;
                        if (str3 == null) {
                            str3 = str5;
                        } else if (!Jp0.n(str5, str3)) {
                            c0628Nh = null;
                            i = 0;
                            break;
                        }
                        if (str5.length() != str3.length() && PublicSuffixDatabase.g.a(str3) == null) {
                            c0628Nh = null;
                            i = 0;
                            break;
                        }
                        String strSubstring = "/";
                        String str6 = str4;
                        i = 0;
                        if (str6 == null || !AbstractC1899jh0.U(str6, "/", false)) {
                            String strB = c2446pE.b();
                            int iG0 = AbstractC1119bh0.g0(strB, '/', 0, 6);
                            if (iG0 != 0) {
                                strSubstring = strB.substring(0, iG0);
                                AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                            str = strSubstring;
                        } else {
                            str = str6;
                        }
                        c0628Nh = new C0628Nh(strZ, strZ2, j, str3, str, z2, z3, z4, z5);
                        break;
                    }
                    int iG3 = Mr0.g(str2, c, i3, length);
                    int iG4 = Mr0.g(str2, c2, i3, iG3);
                    String strZ3 = Mr0.z(i3, str2, iG4);
                    String strZ4 = iG4 < iG3 ? Mr0.z(iG4 + r3, str2, iG3) : "";
                    if (AbstractC1899jh0.N(strZ3, "expires", r3)) {
                        try {
                            jB = Jp0.B(strZ4.length(), strZ4);
                            z4 = true;
                        } catch (NumberFormatException | IllegalArgumentException unused) {
                        }
                    } else if (AbstractC1899jh0.N(strZ3, "max-age", r3)) {
                        try {
                            long j4 = Long.parseLong(strZ4);
                            j2 = j4 > 0 ? j4 : Long.MIN_VALUE;
                        } catch (NumberFormatException e) {
                            Pattern patternCompile = Pattern.compile("-?\\d+");
                            AbstractC1474fG.i(patternCompile, "compile(...)");
                            if (!patternCompile.matcher(strZ4).matches()) {
                                throw e;
                            }
                            j2 = AbstractC1899jh0.U(strZ4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                        }
                        z4 = true;
                    } else if (AbstractC1899jh0.N(strZ3, "domain", true)) {
                        if (!(!AbstractC1899jh0.L(strZ4, ".", false))) {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                        String strG = AbstractC1376eG.G(AbstractC1119bh0.l0(strZ4, "."));
                        if (strG == null) {
                            throw new IllegalArgumentException();
                        }
                        str3 = strG;
                        z5 = false;
                    } else if (AbstractC1899jh0.N(strZ3, "path", true)) {
                        str4 = strZ4;
                    } else if (AbstractC1899jh0.N(strZ3, "secure", true)) {
                        z2 = true;
                    } else if (AbstractC1899jh0.N(strZ3, "httponly", true)) {
                        z3 = true;
                    }
                    i3 = iG3 + 1;
                    r3 = 1;
                    c = ';';
                    c2 = '=';
                }
            } else {
                c0628Nh = null;
            }
            if (c0628Nh != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0628Nh);
            }
            z = true;
        }
        if (arrayList != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
            AbstractC1474fG.i(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        } else {
            listUnmodifiableList = C1233cq.l;
        }
        if (listUnmodifiableList.isEmpty()) {
            return;
        }
        interfaceC0654Oh.c(c2446pE, listUnmodifiableList);
    }
}
