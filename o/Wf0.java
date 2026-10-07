package o;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class Wf0 {
    public static final Pattern a = Pattern.compile("\\{([^}]*)\\}");
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;

    static {
        int i = Lr0.a;
        Locale locale = Locale.US;
        b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        d = Pattern.compile("\\\\an(\\d+)");
    }

    public static PointF a(String str) {
        String strGroup;
        String strGroup2;
        Matcher matcher = b.matcher(str);
        Matcher matcher2 = c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AP.j();
            }
            strGroup2 = matcher.group(1);
            strGroup = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            String strGroup3 = matcher2.group(1);
            strGroup = matcher2.group(2);
            strGroup2 = strGroup3;
        }
        strGroup2.getClass();
        float f = Float.parseFloat(strGroup2.trim());
        strGroup.getClass();
        return new PointF(f, Float.parseFloat(strGroup.trim()));
    }
}
