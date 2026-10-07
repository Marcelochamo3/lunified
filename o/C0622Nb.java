package o;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.skidush.clonex.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.Nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0622Nb implements InterfaceC3432zV, InterfaceC0654Oh, InterfaceC3046vX, InterfaceC2225my, InterfaceC0428Fo, InterfaceC0354Cs, InterfaceC0693Pu, Z70, O20 {
    public static C0622Nb m;
    public final /* synthetic */ int l;

    public /* synthetic */ C0622Nb(int i) {
        this.l = i;
    }

    public static String A(String str, int i, int i2, boolean z, int i3) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        AbstractC1474fG.j(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                E9 e9 = new E9();
                e9.k0(i, str, iCharCount);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iR = Mr0.r(str.charAt(iCharCount + 1));
                        int iR2 = Mr0.r(str.charAt(i4));
                        if (iR == -1 || iR2 == -1) {
                            e9.m0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            e9.f0((iR << 4) + iR2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        e9.f0(32);
                        iCharCount++;
                    } else {
                        e9.m0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return e9.Z();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i2);
        AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList I(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iD0 = AbstractC1119bh0.d0(str, '&', i, false, 4);
            if (iD0 == -1) {
                iD0 = str.length();
            }
            int iD1 = AbstractC1119bh0.d0(str, '=', i, false, 4);
            if (iD1 == -1 || iD1 > iD0) {
                String strSubstring = str.substring(i, iD0);
                AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iD1);
                AbstractC1474fG.i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iD1 + 1, iD0);
                AbstractC1474fG.i(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iD0 + 1;
        }
        return arrayList;
    }

    public static void J(List list, StringBuilder sb) {
        AbstractC1474fG.j(list, "<this>");
        XF xfH = U9.H(U9.L(0, list.size()), 2);
        int i = xfH.l;
        int i2 = xfH.m;
        int i3 = xfH.n;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public static String l(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 32) != 0 ? false : z3;
        boolean z8 = (i3 & 64) != 0 ? false : z4;
        int i5 = 128;
        Charset charset2 = (i3 & 128) != 0 ? null : charset;
        AbstractC1474fG.j(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i6 = 32;
            int i7 = Yu0.b.k0;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= i5 && !z8) || AbstractC1119bh0.X(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !y(iCharCount, str, length)))) || (iCodePointAt == 43 && z7)))) {
                E9 e9 = new E9();
                e9.k0(i4, str, iCharCount);
                E9 e10 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z7) {
                            e9.l0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i6 || iCodePointAt2 == i7 || ((iCodePointAt2 >= 128 && !z8) || AbstractC1119bh0.X(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !y(iCharCount, str, length)))))) {
                            if (e10 == null) {
                                e10 = new E9();
                            }
                            if (charset2 == null || AbstractC1474fG.b(charset2, StandardCharsets.UTF_8)) {
                                e10.m0(iCodePointAt2);
                            } else {
                                int iCharCount2 = Character.charCount(iCodePointAt2) + iCharCount;
                                if (iCharCount < 0) {
                                    throw new IllegalArgumentException(AbstractC1674hK.n(iCharCount, "beginIndex < 0: ").toString());
                                }
                                if (iCharCount2 < iCharCount) {
                                    throw new IllegalArgumentException(AbstractC1674hK.m(iCharCount2, iCharCount, "endIndex < beginIndex: ", " < ").toString());
                                }
                                if (iCharCount2 > str.length()) {
                                    StringBuilder sbR = AbstractC1674hK.r("endIndex > string.length: ", iCharCount2, " > ");
                                    sbR.append(str.length());
                                    throw new IllegalArgumentException(sbR.toString().toString());
                                }
                                if (AbstractC1474fG.b(charset2, AbstractC1305dd.a)) {
                                    e10.k0(iCharCount, str, iCharCount2);
                                } else {
                                    String strSubstring = str.substring(iCharCount, iCharCount2);
                                    AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                    byte[] bytes = strSubstring.getBytes(charset2);
                                    AbstractC1474fG.i(bytes, "this as java.lang.String).getBytes(charset)");
                                    e10.d0(bytes, 0, bytes.length);
                                }
                            }
                            while (!e10.D()) {
                                byte b = e10.readByte();
                                e9.f0(37);
                                char[] cArr = C2446pE.k;
                                e9.f0(cArr[((b & 255) >> 4) & 15]);
                                e9.f0(cArr[b & 15]);
                            }
                        } else {
                            e9.m0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i7 = Yu0.b.k0;
                    i6 = 32;
                }
                return e9.Z();
            }
            iCharCount += Character.charCount(iCodePointAt);
            i5 = 128;
        }
        String strSubstring2 = str.substring(i4, length);
        AbstractC1474fG.i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring2;
    }

    public static Object m(String str, Ds0 ds0, InterfaceC0473Hh interfaceC0473Hh, int i) throws Exception {
        String lowerCase;
        String str2;
        String str3;
        String str4;
        InterfaceC0473Hh interfaceC0473Hh2;
        String str5;
        String str6;
        String str7;
        Pattern pattern;
        int i2 = 3;
        int i3 = 1;
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        int i4 = AbstractC3473zs.a;
        Ds0 ds1 = (i & 2) != 0 ? null : ds0;
        Pattern patternCompile = Pattern.compile("^(https?://)?(www\\.)?");
        AbstractC1474fG.i(patternCompile, "compile(...)");
        String lowerCase2 = str.toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase2, "toLowerCase(...)");
        String strReplaceAll = patternCompile.matcher(lowerCase2).replaceAll("");
        AbstractC1474fG.i(strReplaceAll, "replaceAll(...)");
        System.out.getClass();
        Ds0 ds2 = ds1;
        String str8 = "compile(...)";
        String str9 = "toLowerCase(...)";
        String str10 = strReplaceAll;
        String str11 = "replaceAll(...)";
        String str12 = "";
        Pattern pattern2 = patternCompile;
        ArrayList<AbstractC3473zs> arrayListZ = AbstractC0911Ye.Z(AbstractC0937Ze.K(new C1292dT(i3, z), new C0971a50(b13 == true ? 1 : 0), new C0971a50((boolean) (b12 == true ? 1 : 0)), new C2850tV(0), new Uu0(), new C1292dT(i2, b11 == true ? 1 : 0), new C1292dT(5, b10 == true ? 1 : 0), new C2507pt0(), new C1292dT(6, b9 == true ? 1 : 0), new C1340dv(), new C1435et0(b8 == true ? 1 : 0, b7 == true ? 1 : 0), new C1435et0(1, b6 == true ? 1 : 0), new C1292dT(b5 == true ? 1 : 0, b4 == true ? 1 : 0), new VQ(0), new C1292dT(7, b3 == true ? 1 : 0), new Mg0(), new Ig0(), new C1292dT(4, b2 == true ? 1 : 0), new C1292dT(8, b == true ? 1 : 0), new C0920Yn(0), new VQ(1), new C1292dT(2, false), new C2850tV(1), new LB(0), new VQ(2), new C3380yu(), new C1292dT(11, false), new C3041vS(), new ty0(), new LB(3), new LB(1), new P80(), new LB(2), new C0920Yn(1), null, new C1641gy0(), new C0707Qi(), new C1292dT(9), new Hv0()));
        for (AbstractC3473zs abstractC3473zs : arrayListZ) {
            if (abstractC3473zs.c().length() > 0) {
                String strC = abstractC3473zs.c();
                AbstractC1474fG.j(strC, "input");
                pattern = pattern2;
                Matcher matcher = pattern.matcher(strC);
                str7 = str12;
                String strReplaceAll2 = matcher.replaceAll(str7);
                str6 = str11;
                AbstractC1474fG.i(strReplaceAll2, str6);
                str5 = str10;
                str4 = str;
                interfaceC0473Hh2 = interfaceC0473Hh;
                if (AbstractC1899jh0.U(str5, strReplaceAll2, false)) {
                    return abstractC3473zs.a(str4, interfaceC0473Hh2);
                }
            } else {
                str4 = str;
                interfaceC0473Hh2 = interfaceC0473Hh;
                str5 = str10;
                str6 = str11;
                str7 = str12;
                pattern = pattern2;
            }
            for (String str13 : abstractC3473zs.b()) {
                if (str13.length() > 0) {
                    String lowerCase3 = str13.toLowerCase(Locale.ROOT);
                    String str14 = str9;
                    AbstractC1474fG.i(lowerCase3, str14);
                    String strReplaceAll3 = pattern.matcher(lowerCase3).replaceAll(str7);
                    AbstractC1474fG.i(strReplaceAll3, str6);
                    if (AbstractC1899jh0.U(str5, strReplaceAll3, false)) {
                        return abstractC3473zs.a(str4, interfaceC0473Hh2);
                    }
                    str9 = str14;
                }
            }
            str12 = str7;
            pattern2 = pattern;
            str11 = str6;
            str10 = str5;
        }
        String str15 = str9;
        String str16 = str10;
        String str17 = str11;
        String str18 = str12;
        for (AbstractC3473zs abstractC3473zs2 : arrayListZ) {
            if (abstractC3473zs2.c().length() > 0) {
                String strC2 = abstractC3473zs2.c();
                Pattern patternCompile2 = Pattern.compile("^(https?://)?(www\\.)?(.*?)(\\.[a-z]+)");
                str3 = str8;
                AbstractC1474fG.i(patternCompile2, str3);
                AbstractC1474fG.j(strC2, "input");
                String strReplaceAll4 = patternCompile2.matcher(strC2).replaceAll("$3");
                AbstractC1474fG.i(strReplaceAll4, str17);
                if (AbstractC1899jh0.U(str16, strReplaceAll4, false)) {
                    return abstractC3473zs2.a(str, interfaceC0473Hh);
                }
            } else {
                str3 = str8;
            }
            for (String str19 : abstractC3473zs2.b()) {
                if (str19.length() > 0) {
                    Pattern patternCompile3 = Pattern.compile("^(https?://)?(www\\.)?(.*?)(\\.[a-z]+)");
                    AbstractC1474fG.i(patternCompile3, str3);
                    String strReplaceAll5 = patternCompile3.matcher(str19).replaceAll("$3");
                    AbstractC1474fG.i(strReplaceAll5, str17);
                    if (AbstractC1899jh0.U(str16, strReplaceAll5, false)) {
                        return abstractC3473zs2.a(str, interfaceC0473Hh);
                    }
                }
            }
            str8 = str3;
        }
        for (AbstractC3473zs abstractC3473zs3 : arrayListZ) {
            List listE = abstractC3473zs3.e();
            if (!(listE instanceof Collection) || !listE.isEmpty()) {
                Iterator it = listE.iterator();
                while (it.hasNext()) {
                    if (((I60) it.next()).a(str16)) {
                        return abstractC3473zs3.a(str, interfaceC0473Hh);
                    }
                }
            }
        }
        for (AbstractC3473zs abstractC3473zs4 : arrayListZ) {
            if (abstractC3473zs4.d().length() > 0) {
                String strD = abstractC3473zs4.d();
                Locale locale = Locale.ROOT;
                String lowerCase4 = strD.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase4, str15);
                if (AbstractC1474fG.b(lowerCase4, "webview")) {
                    continue;
                } else {
                    Ds0 ds3 = ds2;
                    if (ds2 == null || (str2 = ds3.m) == null) {
                        lowerCase = str18;
                    } else {
                        lowerCase = str2.toLowerCase(locale);
                        AbstractC1474fG.i(lowerCase, str15);
                    }
                    String lowerCase5 = abstractC3473zs4.d().toLowerCase(locale);
                    AbstractC1474fG.i(lowerCase5, str15);
                    if (AbstractC1119bh0.W(lowerCase, lowerCase5, false)) {
                        return abstractC3473zs4.a(str, interfaceC0473Hh);
                    }
                    ds2 = ds3;
                }
            }
        }
        Ds0 ds4 = ds2;
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListZ) {
            if (obj instanceof Hv0) {
                arrayList.add(obj);
            }
        }
        Hv0 hv0 = (Hv0) AbstractC0911Ye.d0(arrayList);
        if (hv0 != null) {
            Map map = ds4 != null ? ds4.f223o : null;
            if (map == null) {
                map = C1330dq.l;
            }
            return hv0.g(str, map, interfaceC0473Hh);
        }
        throw new Exception("🔥 CRITICAL: No extractors found for " + str + " (API " + Build.VERSION.SDK_INT + ")");
    }

    public static ZK n(YK yk, C2295nk0 c2295nk0) {
        int i;
        IOException iOException = (IOException) c2295nk0.n;
        if (!(iOException instanceof C1472fE) || ((i = ((C1472fE) iOException).f770o) != 403 && i != 404 && i != 410 && i != 416 && i != 500 && i != 503)) {
            return null;
        }
        if (yk.a(1)) {
            return new ZK(1, 300000L);
        }
        if (yk.a(2)) {
            return new ZK(2, 60000L);
        }
        return null;
    }

    public static C0622Nb q() {
        if (m == null) {
            m = new C0622Nb(29);
        }
        return m;
    }

    public static long w(C2295nk0 c2295nk0) {
        Throwable cause = (IOException) c2295nk0.n;
        if (!(cause instanceof C2949uX) && !(cause instanceof FileNotFoundException) && !(cause instanceof C1179cE) && !(cause instanceof C1675hL)) {
            int i = C2679rj.m;
            while (cause != null) {
                if (!(cause instanceof C2679rj) || ((C2679rj) cause).l != 2008) {
                    cause = cause.getCause();
                }
            }
            return Math.min((c2295nk0.m - 1) * 1000, 5000);
        }
        return -9223372036854775807L;
    }

    public static boolean y(int i, String str, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && Mr0.r(str.charAt(i + 1)) != -1 && Mr0.r(str.charAt(i3)) != -1;
    }

    @Override // o.InterfaceC0428Fo
    public InterfaceC3465zo B(C0350Co c0350Co, C0643Nw c0643Nw) {
        if (c0643Nw.z == null) {
            return null;
        }
        return new C0741Rq(new C3368yo(6001, new Lq0()));
    }

    public SparseIntArray[] C(Activity activity) {
        return null;
    }

    @Override // o.InterfaceC3046vX
    public Object D(Uri uri, C2776sj c2776sj) {
        return Long.valueOf(Lr0.N(new BufferedReader(new InputStreamReader(c2776sj)).readLine()));
    }

    public void E(Object obj) {
        switch (this.l) {
            case 19:
                break;
            default:
                ((List) obj).clear();
                break;
        }
    }

    public SparseIntArray[] F() {
        return null;
    }

    public SparseIntArray[] H() {
        return null;
    }

    @Override // o.InterfaceC3432zV
    public Object M() {
        switch (this.l) {
            case 1:
                return new TreeSet();
            case 2:
                return new ArrayDeque();
            case 3:
                return new ConcurrentSkipListMap();
            case 4:
                return new TreeMap();
            default:
                return new C3227xK(true);
        }
    }

    @Override // o.InterfaceC0428Fo
    public /* synthetic */ void a() {
    }

    @Override // o.InterfaceC0693Pu
    public Class b() {
        return InputStream.class;
    }

    @Override // o.InterfaceC0654Oh
    public void c(C2446pE c2446pE, List list) {
        AbstractC1474fG.j(c2446pE, "url");
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @Override // o.Z70
    public M70 g(M70 m70, FW fw) {
        byte[] bArrArray;
        ByteBuffer byteBufferAsReadOnlyBuffer = ((C0854Vz) ((C0672Oz) m70.get()).l.b).a.d.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC2274na.a;
        C1727hs0 c1727hs0 = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C1727hs0(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
        if (c1727hs0 == null || c1727hs0.a != 0) {
            ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
            byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
            byteBufferAsReadOnlyBuffer2.get(bArr);
            bArrArray = bArr;
        } else {
            if (c1727hs0.b == c1727hs0.c.length) {
                bArrArray = byteBufferAsReadOnlyBuffer.array();
            } else {
                ByteBuffer byteBufferAsReadOnlyBuffer3 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                byte[] bArr2 = new byte[byteBufferAsReadOnlyBuffer3.limit()];
                byteBufferAsReadOnlyBuffer3.get(bArr2);
                bArrArray = bArr2;
            }
        }
        return new P2(bArrArray);
    }

    @Override // o.InterfaceC0654Oh
    public List h(C2446pE c2446pE) {
        AbstractC1474fG.j(c2446pE, "url");
        return C1233cq.l;
    }

    @Override // o.InterfaceC0428Fo
    public /* synthetic */ InterfaceC0402Eo k(C0350Co c0350Co, C0643Nw c0643Nw) {
        return InterfaceC0402Eo.e;
    }

    @Override // o.InterfaceC0428Fo
    public int o(C0643Nw c0643Nw) {
        return c0643Nw.z != null ? 1 : 0;
    }

    @Override // o.O20
    public CharSequence p(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        return TextUtils.isEmpty(listPreference.B()) ? listPreference.l.getString(R.string.not_set) : listPreference.B();
    }

    @Override // o.InterfaceC0428Fo
    public /* synthetic */ void r() {
    }

    @Override // o.InterfaceC0354Cs
    public InterfaceC1324dm0 s(int i, int i2) {
        return new C0921Yo();
    }

    @Override // o.InterfaceC0693Pu
    public Object t(File file) {
        return new FileInputStream(file);
    }

    public SparseIntArray[] u() {
        return null;
    }

    public int v(int i) {
        return i == 7 ? 6 : 3;
    }

    public Signature[] x(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // o.InterfaceC0693Pu
    public void z(Object obj) throws IOException {
        ((InputStream) obj).close();
    }

    public /* synthetic */ C0622Nb(boolean z) {
        this.l = 10;
    }

    public C0622Nb(AbstractC2837tI abstractC2837tI, AbstractC2837tI abstractC2837tI2) {
        this.l = 0;
        abstractC2837tI.getClass();
        abstractC2837tI2.getClass();
        if (0.0f > 0.0f) {
            throw new IllegalArgumentException();
        }
    }

    @Override // o.InterfaceC0354Cs
    public void f() {
    }

    private final void G(Object obj) {
    }

    @Override // o.InterfaceC2225my
    public void e(Activity activity) {
    }

    @Override // o.InterfaceC0354Cs
    public void i(InterfaceC2664rb0 interfaceC2664rb0) {
    }

    public void j(Activity activity) {
    }

    @Override // o.InterfaceC0428Fo
    public void d(Looper looper, C3436zZ c3436zZ) {
    }
}
