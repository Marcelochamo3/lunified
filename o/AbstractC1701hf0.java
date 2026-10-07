package o;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.hf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1701hf0 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String B(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String C(int i) {
        if (i == 1) {
            return "SOURCE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "NONE";
        }
        return "TRANSFORMED";
    }

    public static /* synthetic */ String D(int i) {
        switch (i) {
            case 1:
                return "NO_ERROR";
            case 2:
                return "PROTOCOL_ERROR";
            case 3:
                return "INTERNAL_ERROR";
            case 4:
                return "FLOW_CONTROL_ERROR";
            case 5:
                return "SETTINGS_TIMEOUT";
            case 6:
                return "STREAM_CLOSED";
            case 7:
                return "FRAME_SIZE_ERROR";
            case 8:
                return "REFUSED_STREAM";
            case 9:
                return "CANCEL";
            case 10:
                return "COMPRESSION_ERROR";
            case 11:
                return "CONNECT_ERROR";
            case 12:
                return "ENHANCE_YOUR_CALM";
            case 13:
                return "INADEQUATE_SECURITY";
            case 14:
                return "HTTP_1_1_REQUIRED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String E(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ int[] F(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ void a(int i, String str) {
        if (i == 0) {
            throw new NullPointerException(str);
        }
    }

    public static /* synthetic */ long b(int i) {
        if (i == 1) {
            return 0L;
        }
        if (i == 2) {
            return 1L;
        }
        if (i == 3) {
            return 2L;
        }
        if (i == 4) {
            return 3L;
        }
        if (i == 5) {
            return 4L;
        }
        throw null;
    }

    public static Object c(int i, ArrayList arrayList) {
        return arrayList.get(arrayList.size() - i);
    }

    public static String d(String str, String str2) {
        return str + str2;
    }

    public static String e(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String f(String str, AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx, String str2) {
        return str + abstractComponentCallbacksC1247cx + str2;
    }

    public static String g(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String h(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String i(Locale locale, String str, String str2, Locale locale2, String str3) {
        AbstractC1474fG.i(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        AbstractC1474fG.i(lowerCase, str3);
        return lowerCase;
    }

    public static String j(JSONObject jSONObject, String str, String str2) {
        String strOptString = jSONObject.optString(str);
        AbstractC1474fG.i(strOptString, str2);
        return AbstractC1119bh0.E0(strOptString).toString();
    }

    public static StringBuilder k(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static Matcher m(String str, String str2, String str3, String str4) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC1474fG.i(patternCompile, str2);
        Matcher matcher = patternCompile.matcher(str3);
        AbstractC1474fG.i(matcher, str4);
        return matcher;
    }

    public static CJ n(C3182ws c3182ws, IJ ij) {
        return AP.m(ij, new C3279xs(c3182ws, 0));
    }

    public static NV o() {
        NV nv = new NV();
        C3084vr0.c(nv);
        return nv;
    }

    public static /* synthetic */ void p(int i) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        AbstractC1474fG.P(nullPointerException, AbstractC1474fG.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ void q(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = AbstractC1474fG.class.getName();
            int i2 = 0;
            while (!stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            while (stackTrace[i2].getClassName().equals(name)) {
                i2++;
            }
            StackTraceElement stackTraceElement = stackTrace[i2];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + ", parameter " + str);
            AbstractC1474fG.P(nullPointerException, AbstractC1474fG.class.getName());
            throw nullPointerException;
        }
    }

    public static void r(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static /* synthetic */ void s(InterfaceC0914Yh interfaceC0914Yh) {
        if (interfaceC0914Yh != null) {
            throw new ClassCastException();
        }
    }

    public static String t(String str, String str2) {
        return str + str2;
    }

    public static String u(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ String v(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int w(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String x(int i) {
        if (i == 1) {
            return "SUSPEND";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DROP_LATEST";
        }
        return "DROP_OLDEST";
    }

    public static /* synthetic */ String y(int i) {
        if (i == 1) {
            return "LOCAL";
        }
        if (i == 2) {
            return "REMOTE";
        }
        if (i == 3) {
            return "DATA_DISK_CACHE";
        }
        if (i != 4) {
            return i != 5 ? "null" : "MEMORY_CACHE";
        }
        return "RESOURCE_DISK_CACHE";
    }

    public static /* synthetic */ String z(int i) {
        if (i == 1) {
            return "INITIALIZE";
        }
        if (i != 2) {
            return i != 3 ? "null" : "DECODE_DATA";
        }
        return "SWITCH_TO_SOURCE_SERVICE";
    }
}
