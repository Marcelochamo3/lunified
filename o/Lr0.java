package o;

import android.app.UiModeManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public abstract class Lr0 {
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final byte[] e;
    public static final Pattern f;
    public static final Pattern g;
    public static final Pattern h;
    public static HashMap i;
    public static final String[] j;
    public static final String[] k;
    public static final int[] l;
    public static final int[] m;

    static {
        int i2 = Build.VERSION.SDK_INT;
        a = i2;
        String str = Build.DEVICE;
        b = str;
        String str2 = Build.MANUFACTURER;
        c = str2;
        String str3 = Build.MODEL;
        d = str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(i2);
        e = new byte[0];
        f = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        g = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        Pattern.compile("%([A-Fa-f0-9]{2})");
        h = Pattern.compile("(?:.*\\.)?isml?(?:/(manifest(.*))?)?", 2);
        j = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "arb", "ar-arb", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
        k = new String[]{"i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
        l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
        m = new int[]{0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, Yu0.b.g0, 126, Yu0.b.h0, C3080vp0.v0, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, C3080vp0.z0, 242, Yu0.b.A0, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, Yu0.b.w0, Yu0.b.v0, Yu0.b.m0, Yu0.b.p0, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, Yu0.b.s0, Yu0.b.l0, Yu0.b.q0, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, Yu0.b.c0, 104, 97, 102, Yu0.b.e0, 116, Yu0.b.j0, 122, Yu0.b.t0, Yu0.b.y0, Yu0.b.r0, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, C3080vp0.x0, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, Yu0.b.f0, 114, Yu0.b.i0, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, Yu0.b.d0, 120, Yu0.b.k0, C3080vp0.t0, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, Yu0.b.u0, Yu0.b.x0, Yu0.b.o0, Yu0.b.n0, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, C3080vp0.y0, 253, 244, Yu0.b.z0};
    }

    public static String A(StringBuilder sb, Formatter formatter, long j2) {
        long j3 = j2 == -9223372036854775807L ? 0L : j2;
        String str = j3 < 0 ? "-" : "";
        long jAbs = (Math.abs(j3) + 500) / 1000;
        long j4 = jAbs % 60;
        long j5 = (jAbs / 60) % 60;
        long j6 = jAbs / 3600;
        sb.setLength(0);
        return j6 > 0 ? formatter.format("%s%d:%02d:%02d", str, Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)).toString() : formatter.format("%s%02d:%02d", str, Long.valueOf(j5), Long.valueOf(j4)).toString();
    }

    public static String[] B() {
        String[] strArrSplit;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i2 = a;
        if (i2 >= 24) {
            strArrSplit = configuration.getLocales().toLanguageTags().split(",", -1);
        } else {
            Locale locale = configuration.locale;
            strArrSplit = new String[]{i2 >= 21 ? locale.toLanguageTag() : locale.toString()};
        }
        for (int i3 = 0; i3 < strArrSplit.length; i3++) {
            strArrSplit[i3] = L(strArrSplit[i3]);
        }
        return strArrSplit;
    }

    public static String C(String str) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class).invoke(cls, str);
        } catch (Exception e2) {
            AP.g("Failed to read system property ".concat(str), e2);
            return null;
        }
    }

    public static String D(int i2) {
        switch (i2) {
            case -2:
                return "none";
            case -1:
                return "unknown";
            case 0:
                return "default";
            case 1:
                return "audio";
            case 2:
                return "video";
            case 3:
                return "text";
            case 4:
                return "image";
            case 5:
                return "metadata";
            case 6:
                return "camera motion";
            default:
                return i2 >= 10000 ? AbstractC1674hK.p("custom (", i2, ")") : "?";
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036  */
    public static boolean E(InterfaceC2370oZ interfaceC2370oZ) {
        boolean z;
        AbstractC1074b8 abstractC1074b8;
        C1042as c1042as = (C1042as) interfaceC2370oZ;
        int iJ = c1042as.J();
        if (iJ != 1 || !((AbstractC1074b8) interfaceC2370oZ).b(2)) {
            if (iJ == 4) {
                AbstractC1074b8 abstractC1074b9 = (AbstractC1074b8) interfaceC2370oZ;
                if (abstractC1074b9.b(4)) {
                    abstractC1074b9.m();
                }
                abstractC1074b8 = (AbstractC1074b8) interfaceC2370oZ;
                if (!abstractC1074b8.b(1)) {
                    return z;
                }
                abstractC1074b8.j();
                return true;
            }
            z = false;
            abstractC1074b8 = (AbstractC1074b8) interfaceC2370oZ;
            if (!abstractC1074b8.b(1)) {
                return z;
            }
            abstractC1074b8.j();
            return true;
        }
        c1042as.Q();
        z = true;
        abstractC1074b8 = (AbstractC1074b8) interfaceC2370oZ;
        if (!abstractC1074b8.b(1)) {
            return z;
        }
        abstractC1074b8.j();
        return true;
    }

    public static int F(Uri uri, String str) {
        int i2;
        if (str != null) {
            switch (str) {
                case "application/x-mpegURL":
                    return 2;
                case "application/vnd.ms-sstr+xml":
                    return 1;
                case "application/dash+xml":
                    return 0;
                case "application/x-rtsp":
                    return 3;
                default:
                    return 4;
            }
        }
        String scheme = uri.getScheme();
        if (scheme != null && U9.n("rtsp", scheme)) {
            return 3;
        }
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return 4;
        }
        int iLastIndexOf = lastPathSegment.lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String strI = U9.I(lastPathSegment.substring(iLastIndexOf + 1));
            strI.getClass();
            switch (strI.hashCode()) {
                case 104579:
                    if (strI.equals("ism")) {
                    }
                    break;
                case 108321:
                    if (strI.equals("mpd")) {
                    }
                    break;
                case 3242057:
                    if (strI.equals("isml")) {
                    }
                    break;
                case 3299913:
                    if (strI.equals("m3u8")) {
                    }
                    break;
            }
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Switch insn not found in header
                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                */
            /*
                Method dump skipped, instruction units count: 284
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.Lr0.F(android.net.Uri, java.lang.String):int");
        }

        public static boolean G(C2562qX c2562qX, C2562qX c2562qX2, Inflater inflater) {
            if (c2562qX.a() <= 0) {
                return false;
            }
            if (c2562qX2.a.length < c2562qX.a()) {
                c2562qX2.b(c2562qX.a() * 2);
            }
            if (inflater == null) {
                inflater = new Inflater();
            }
            inflater.setInput(c2562qX.a, c2562qX.b, c2562qX.a());
            int iInflate = 0;
            while (true) {
                try {
                    byte[] bArr = c2562qX2.a;
                    iInflate += inflater.inflate(bArr, iInflate, bArr.length - iInflate);
                    if (inflater.finished()) {
                        c2562qX2.E(iInflate);
                        inflater.reset();
                        return true;
                    }
                    if (!inflater.needsDictionary() && !inflater.needsInput()) {
                        byte[] bArr2 = c2562qX2.a;
                        if (iInflate == bArr2.length) {
                            c2562qX2.b(bArr2.length * 2);
                        }
                    }
                    inflater.reset();
                    return false;
                } catch (DataFormatException unused) {
                    inflater.reset();
                    return false;
                } catch (Throwable th) {
                    inflater.reset();
                    throw th;
                }
            }
        }

        public static boolean H(int i2) {
            return i2 == 3 || i2 == 2 || i2 == 268435456 || i2 == 536870912 || i2 == 805306368 || i2 == 4;
        }

        public static boolean I(int i2) {
            return i2 == 10 || i2 == 13;
        }

        public static boolean J(Context context) {
            UiModeManager uiModeManager = (UiModeManager) context.getApplicationContext().getSystemService("uimode");
            return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
        }

        public static long K(long j2) {
            return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 * 1000;
        }

        public static String L(String str) {
            if (str == null) {
                return null;
            }
            String strReplace = str.replace('_', '-');
            if (!strReplace.isEmpty() && !strReplace.equals("und")) {
                str = strReplace;
            }
            String strI = U9.I(str);
            int i2 = 0;
            String str2 = strI.split("-", 2)[0];
            if (i == null) {
                String[] iSOLanguages = Locale.getISOLanguages();
                int length = iSOLanguages.length;
                String[] strArr = j;
                HashMap map = new HashMap(length + strArr.length);
                for (String str3 : iSOLanguages) {
                    try {
                        String iSO3Language = new Locale(str3).getISO3Language();
                        if (!TextUtils.isEmpty(iSO3Language)) {
                            map.put(iSO3Language, str3);
                        }
                    } catch (MissingResourceException unused) {
                    }
                }
                for (int i3 = 0; i3 < strArr.length; i3 += 2) {
                    map.put(strArr[i3], strArr[i3 + 1]);
                }
                i = map;
            }
            String str4 = (String) i.get(str2);
            if (str4 != null) {
                StringBuilder sbK = AbstractC1701hf0.k(str4);
                sbK.append(strI.substring(str2.length()));
                strI = sbK.toString();
                str2 = str4;
            }
            if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
                return strI;
            }
            while (true) {
                String[] strArr2 = k;
                if (i2 >= strArr2.length) {
                    return strI;
                }
                if (strI.startsWith(strArr2[i2])) {
                    return strArr2[i2 + 1] + strI.substring(strArr2[i2].length());
                }
                i2 += 2;
            }
        }

        public static Object[] M(int i2, Object[] objArr) {
            AbstractC0397Ej.c(i2 <= objArr.length);
            return Arrays.copyOf(objArr, i2);
        }

        public static long N(String str) throws C2949uX {
            Matcher matcher = f.matcher(str);
            if (!matcher.matches()) {
                throw C2949uX.a("Invalid date/time format: " + str, null);
            }
            int i2 = 0;
            if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
                i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                if ("-".equals(matcher.group(11))) {
                    i2 *= -1;
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
            gregorianCalendar.clear();
            gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
            if (!TextUtils.isEmpty(matcher.group(8))) {
                gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
            }
            long timeInMillis = gregorianCalendar.getTimeInMillis();
            return i2 != 0 ? timeInMillis - (((long) i2) * 60000) : timeInMillis;
        }

        public static void O(Handler handler, Runnable runnable) {
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }

        public static void P(ArrayList arrayList, int i2, int i3) {
            if (i2 < 0 || i3 > arrayList.size() || i2 > i3) {
                throw new IllegalArgumentException();
            }
            if (i2 != i3) {
                arrayList.subList(i2, i3).clear();
            }
        }

        public static long Q(int i2, long j2) {
            return (j2 * 1000000) / ((long) i2);
        }

        public static long R(long j2, long j3, long j4) {
            if (j4 >= j3 && j4 % j3 == 0) {
                return j2 / (j4 / j3);
            }
            if (j4 < j3 && j3 % j4 == 0) {
                return (j3 / j4) * j2;
            }
            return (long) (j2 * (j3 / j4));
        }

        public static void S(long[] jArr, long j2) {
            int i2 = 0;
            if (j2 >= 1000000 && j2 % 1000000 == 0) {
                long j3 = j2 / 1000000;
                while (i2 < jArr.length) {
                    jArr[i2] = jArr[i2] / j3;
                    i2++;
                }
                return;
            }
            if (j2 >= 1000000 || 1000000 % j2 != 0) {
                double d2 = 1000000 / j2;
                while (i2 < jArr.length) {
                    jArr[i2] = (long) (jArr[i2] * d2);
                    i2++;
                }
                return;
            }
            long j4 = 1000000 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] * j4;
                i2++;
            }
        }

        public static boolean T(InterfaceC2370oZ interfaceC2370oZ) {
            if (interfaceC2370oZ == null) {
                return true;
            }
            C1042as c1042as = (C1042as) interfaceC2370oZ;
            return !c1042as.I() || c1042as.J() == 1 || c1042as.J() == 4;
        }

        public static String[] U(String str) {
            return str.split("/", -1);
        }

        public static String[] V(String str) {
            return TextUtils.isEmpty(str) ? new String[0] : str.trim().split("(\\s*,\\s*)", -1);
        }

        public static byte[] W(InputStream inputStream) throws IOException {
            byte[] bArr = new byte[C1672hI.a.f];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            }
        }

        public static long X(long j2) {
            return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
        }

        public static boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        public static int b(long[] jArr, long j2, boolean z) {
            int i2;
            int iBinarySearch = Arrays.binarySearch(jArr, j2);
            if (iBinarySearch < 0) {
                return ~iBinarySearch;
            }
            while (true) {
                i2 = iBinarySearch + 1;
                if (i2 >= jArr.length || jArr[i2] != j2) {
                    break;
                }
                iBinarySearch = i2;
            }
            return z ? iBinarySearch : i2;
        }

        public static int c(List list, Long l2, boolean z) {
            int i2;
            int iBinarySearch = Collections.binarySearch(list, l2);
            if (iBinarySearch < 0) {
                i2 = -(iBinarySearch + 2);
            } else {
                while (true) {
                    int i3 = iBinarySearch - 1;
                    if (i3 < 0 || ((Comparable) list.get(i3)).compareTo(l2) != 0) {
                        break;
                    }
                    iBinarySearch = i3;
                }
                i2 = iBinarySearch;
            }
            return z ? Math.max(0, i2) : i2;
        }

        public static int d(C2295nk0 c2295nk0, long j2) {
            int i2 = c2295nk0.m - 1;
            int i3 = 0;
            while (i3 <= i2) {
                int i4 = (i3 + i2) >>> 1;
                if (c2295nk0.n(i4) < j2) {
                    i3 = i4 + 1;
                } else {
                    i2 = i4 - 1;
                }
            }
            int i5 = i2 + 1;
            if (i5 < c2295nk0.m && c2295nk0.n(i5) == j2) {
                return i5;
            }
            if (i2 == -1) {
                return 0;
            }
            return i2;
        }

        public static int e(int[] iArr, int i2, boolean z, boolean z2) {
            int i3;
            int i4;
            int iBinarySearch = Arrays.binarySearch(iArr, i2);
            if (iBinarySearch < 0) {
                i4 = -(iBinarySearch + 2);
            } else {
                while (true) {
                    i3 = iBinarySearch - 1;
                    if (i3 < 0 || iArr[i3] != i2) {
                        break;
                    }
                    iBinarySearch = i3;
                }
                i4 = z ? iBinarySearch : i3;
            }
            return z2 ? Math.max(0, i4) : i4;
        }

        public static int f(long[] jArr, long j2, boolean z) {
            int i2;
            int iBinarySearch = Arrays.binarySearch(jArr, j2);
            if (iBinarySearch < 0) {
                i2 = -(iBinarySearch + 2);
            } else {
                while (true) {
                    int i3 = iBinarySearch - 1;
                    if (i3 < 0 || jArr[i3] != j2) {
                        break;
                    }
                    iBinarySearch = i3;
                }
                i2 = iBinarySearch;
            }
            return z ? Math.max(0, i2) : i2;
        }

        public static int g(int i2, int i3) {
            return ((i2 + i3) - 1) / i3;
        }

        public static void h(Closeable closeable) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }

        public static float i(float f2, float f3, float f4) {
            return Math.max(f3, Math.min(f2, f4));
        }

        public static int j(int i2, int i3, int i4) {
            return Math.max(i3, Math.min(i2, i4));
        }

        public static long k(long j2, long j3, long j4) {
            return Math.max(j3, Math.min(j2, j4));
        }

        public static boolean l(Object[] objArr, Object obj) {
            for (Object obj2 : objArr) {
                if (a(obj2, obj)) {
                    return true;
                }
            }
            return false;
        }

        public static int m(int i2, int i3, int i4, byte[] bArr) {
            while (i2 < i3) {
                i4 = l[((i4 >>> 24) ^ (bArr[i2] & 255)) & 255] ^ (i4 << 8);
                i2++;
            }
            return i4;
        }

        public static Handler n(Handler.Callback callback) {
            Looper looperMyLooper = Looper.myLooper();
            AbstractC0397Ej.g(looperMyLooper);
            return new Handler(looperMyLooper, callback);
        }

        public static String o(byte[] bArr) {
            return new String(bArr, AbstractC1402ed.c);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:12:0x0015 A[RETURN] */
        public static int p(int i2) {
            switch (i2) {
                case 1:
                    return 4;
                case 2:
                    return 12;
                case 3:
                    return 28;
                case 4:
                    return 204;
                case 5:
                    return 220;
                case 6:
                    return 252;
                case 7:
                    return 1276;
                case 8:
                    return 6396;
                case 9:
                case 11:
                default:
                    return 0;
                case 10:
                    if (a >= 32) {
                        return 737532;
                    }
                    return 6396;
                case 12:
                    return 743676;
            }
        }

        public static int q(int i2, String str) {
            int i3 = 0;
            for (String str2 : V(str)) {
                if (i2 == IQ.i(IQ.e(str2))) {
                    i3++;
                }
            }
            return i3;
        }

        public static String r(int i2, String str) {
            String[] strArrV = V(str);
            if (strArrV.length == 0) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            for (String str2 : strArrV) {
                if (i2 == IQ.i(IQ.e(str2))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        }

        public static Drawable s(Context context, Resources resources, int i2) {
            return a >= 21 ? Hr0.a(context, resources, i2) : resources.getDrawable(i2);
        }

        public static int t(int i2) {
            if (i2 == 2 || i2 == 4) {
                return 6005;
            }
            if (i2 == 10) {
                return 6004;
            }
            if (i2 == 7) {
                return 6005;
            }
            if (i2 == 8) {
                return 6003;
            }
            switch (i2) {
                case 15:
                    return 6003;
                case 16:
                case 18:
                    return 6005;
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                    return 6004;
                default:
                    switch (i2) {
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                            return 6002;
                        default:
                            return 6006;
                    }
            }
        }

        public static int u(String str) {
            String[] strArrSplit;
            int length;
            if (str == null || (length = (strArrSplit = str.split("_", -1)).length) < 2) {
                return 0;
            }
            String str2 = strArrSplit[length - 1];
            boolean z = length >= 3 && "neg".equals(strArrSplit[length - 2]);
            try {
                str2.getClass();
                int i2 = Integer.parseInt(str2);
                return z ? -i2 : i2;
            } catch (NumberFormatException unused) {
                return 0;
            }
        }

        public static long v(long j2, float f2) {
            return f2 == 1.0f ? j2 : Math.round(j2 * ((double) f2));
        }

        public static long w(long j2) {
            return j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + SystemClock.elapsedRealtime();
        }

        public static int x(int i2) {
            if (i2 == 8) {
                return 3;
            }
            if (i2 == 16) {
                return 2;
            }
            if (i2 != 24) {
                return i2 != 32 ? 0 : 805306368;
            }
            return 536870912;
        }

        public static int y(int i2, int i3) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return i3;
                }
                if (i2 != 4) {
                    if (i2 != 268435456) {
                        if (i2 == 536870912) {
                            return i3 * 3;
                        }
                        if (i2 != 805306368) {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                return i3 * 4;
            }
            return i3 * 2;
        }

        public static long z(long j2, float f2) {
            return f2 == 1.0f ? j2 : Math.round(j2 / ((double) f2));
        }
    }
