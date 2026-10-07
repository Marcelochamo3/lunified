package o;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public abstract class IQ {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean a(String str, String str2) {
        C2650rP c2650rPG;
        int iA;
        if (str == null) {
            return false;
        }
        switch (str) {
            case "audio/eac3-joc":
            case "audio/mpeg-L1":
            case "audio/mpeg-L2":
            case "audio/ac3":
            case "audio/raw":
            case "audio/eac3":
            case "audio/flac":
            case "audio/mpeg":
            case "audio/g711-alaw":
            case "audio/g711-mlaw":
                return true;
            case "audio/mp4a-latm":
                return (str2 == null || (c2650rPG = g(str2)) == null || (iA = c2650rPG.a()) == 0 || iA == 16) ? false : true;
            default:
                return false;
        }
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Lr0.V(str)) {
            String strE = e(str2);
            if (strE != null && k(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static String c(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] strArrV = Lr0.V(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : strArrV) {
            if (str2.equals(e(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int d(String str, String str2) {
        C2650rP c2650rPG;
        byte b2 = -1;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    b2 = 0;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    b2 = 1;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    b2 = 2;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    b2 = 3;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    b2 = 4;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    b2 = 5;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    b2 = 6;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    b2 = 7;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    b2 = 8;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    b2 = 9;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    b2 = 10;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    b2 = C3285xv.h;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (c2650rPG = g(str2)) == null) {
                    return 0;
                }
                return c2650rPG.a();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        C2650rP c2650rPG;
        String strF = null;
        if (str == null) {
            return null;
        }
        String strI = U9.I(str.trim());
        if (strI.startsWith("avc1") || strI.startsWith("avc3")) {
            return "video/avc";
        }
        if (strI.startsWith("hev1") || strI.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (strI.startsWith("dvav") || strI.startsWith("dva1") || strI.startsWith("dvhe") || strI.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (strI.startsWith("av01")) {
            return "video/av01";
        }
        if (strI.startsWith("vp9") || strI.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (strI.startsWith("vp8") || strI.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (strI.startsWith("mp4a")) {
            if (strI.startsWith("mp4a.") && (c2650rPG = g(strI)) != null) {
                strF = f(c2650rPG.a);
            }
            return strF == null ? "audio/mp4a-latm" : strF;
        }
        if (strI.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (strI.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (strI.startsWith("ac-3") || strI.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (strI.startsWith("ec-3") || strI.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (strI.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (strI.startsWith("ac-4") || strI.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (strI.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (strI.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (strI.startsWith("dtsh") || strI.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (strI.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (strI.startsWith("opus")) {
            return "audio/opus";
        }
        if (strI.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (strI.startsWith("flac")) {
            return "audio/flac";
        }
        if (strI.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (strI.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (strI.contains("cea708")) {
            return "application/cea-708";
        }
        if (strI.contains("eia608") || strI.contains("cea608")) {
            return "application/cea-608";
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return null;
        }
        AbstractC1674hK.w(arrayList.get(0));
        throw null;
    }

    public static String f(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case Yu0.b.S /* 97 */:
            case Yu0.b.T /* 98 */:
            case 99:
            case C3080vp0.n0 /* 100 */:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case C3080vp0.t0 /* 106 */:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static C2650rP g(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        String strGroup2 = matcher.group(2);
        try {
            return new C2650rP(Integer.parseInt(strGroup, 16), strGroup2 != null ? Integer.parseInt(strGroup2) : 0);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String h(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, iIndexOf);
    }

    public static int i(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (k(str)) {
            return 1;
        }
        if (m(str)) {
            return 2;
        }
        if (l(str)) {
            return 3;
        }
        if ("image".equals(h(str))) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        AbstractC1674hK.w(arrayList.get(0));
        throw null;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : Lr0.V(str)) {
            String strE = e(str2);
            if (strE != null && m(strE)) {
                return strE;
            }
        }
        return null;
    }

    public static boolean k(String str) {
        return "audio".equals(h(str));
    }

    public static boolean l(String str) {
        return "text".equals(h(str)) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean m(String str) {
        return "video".equals(h(str));
    }
}
