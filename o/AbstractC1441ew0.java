package o;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.ew0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1441ew0 {
    public static final Pattern a = Pattern.compile("^NOTE([ \t].*)?$");

    public static boolean a(C2562qX c2562qX) {
        c2562qX.getClass();
        String strH = c2562qX.h(AbstractC1402ed.c);
        return strH != null && strH.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = Lr0.a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (strArrSplit.length == 2) {
            j2 += Long.parseLong(strArrSplit[1]);
        }
        return j2 * 1000;
    }

    public static void d(C2562qX c2562qX) throws C2949uX {
        int i = c2562qX.b;
        if (a(c2562qX)) {
            return;
        }
        c2562qX.F(i);
        throw C2949uX.a("Expected WEBVTT. Got " + c2562qX.h(AbstractC1402ed.c), null);
    }
}
