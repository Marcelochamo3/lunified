package o;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class LH {
    public final String a;

    static {
        AbstractC0937Ze.K(99, Integer.valueOf(Yu0.b.c0), 109, 46, 103, Integer.valueOf(Yu0.b.c0), Integer.valueOf(Yu0.b.c0), 103, Integer.valueOf(C3080vp0.v0), 101, 46, 97, 110, 100, 114, Integer.valueOf(Yu0.b.c0), 105, 100, 46, 103, 109, Integer.valueOf(Yu0.b.e0), 46, 97, 100, Integer.valueOf(Yu0.b.e0), 46, 77, Integer.valueOf(Yu0.b.c0), 98, 105, Integer.valueOf(C3080vp0.v0), 101, 65, 100, Integer.valueOf(Yu0.b.e0));
        AbstractC0937Ze.K(99, Integer.valueOf(Yu0.b.c0), 109, 46, 102, 97, 99, 101, 98, Integer.valueOf(Yu0.b.c0), Integer.valueOf(Yu0.b.c0), 107, 46, 97, 100, Integer.valueOf(Yu0.b.e0), 46, 65, 100);
    }

    public LH(String str) {
        this.a = str;
    }

    public final String a() {
        List listA;
        int i;
        int i2;
        try {
            Matcher matcher = Pattern.compile("\\}\\s*\\('(.*)',\\s*(.*?),\\s*(\\d+),\\s*'(.*?)'\\.split\\('\\|'\\)", 32).matcher(this.a);
            if (matcher.find() && matcher.groupCount() == 4) {
                String strGroup = matcher.group(1);
                AbstractC1474fG.i(strGroup, "group(...)");
                String strR = AbstractC1899jh0.R(strGroup, "\\'", "'", false);
                String strGroup2 = matcher.group(2);
                String strGroup3 = matcher.group(3);
                String strGroup4 = matcher.group(4);
                AbstractC1474fG.i(strGroup4, "group(...)");
                Pattern patternCompile = Pattern.compile("\\|");
                AbstractC1474fG.i(patternCompile, "compile(...)");
                AbstractC1119bh0.p0(0);
                Matcher matcher2 = patternCompile.matcher(strGroup4);
                if (matcher2.find()) {
                    ArrayList arrayList = new ArrayList(10);
                    int iEnd = 0;
                    do {
                        arrayList.add(strGroup4.subSequence(iEnd, matcher2.start()).toString());
                        iEnd = matcher2.end();
                    } while (matcher2.find());
                    arrayList.add(strGroup4.subSequence(iEnd, strGroup4.length()).toString());
                    listA = arrayList;
                } else {
                    listA = AbstractC2506pt.A(strGroup4.toString());
                }
                String[] strArr = (String[]) listA.toArray(new String[0]);
                try {
                    AbstractC1474fG.g(strGroup2);
                    i = Integer.parseInt(strGroup2);
                } catch (Exception unused) {
                    i = 36;
                }
                try {
                    AbstractC1474fG.g(strGroup3);
                    i2 = Integer.parseInt(strGroup3);
                } catch (Exception unused2) {
                    i2 = 0;
                }
                if (strArr.length != i2) {
                    throw new Exception("Unknown p.a.c.k.e.r. encoding");
                }
                C2613qy c2613qy = new C2613qy(i, 6);
                Matcher matcher3 = Pattern.compile("\\b\\w+\\b").matcher(strR);
                StringBuilder sb = new StringBuilder(strR);
                int length = 0;
                while (matcher3.find()) {
                    String strGroup5 = matcher3.group(0);
                    AbstractC1474fG.g(strGroup5);
                    int iK = c2613qy.K(strGroup5);
                    String str = (iK >= strArr.length || iK < 0) ? null : strArr[iK];
                    if (str != null && str.length() > 0) {
                        sb.replace(matcher3.start() + length, matcher3.end() + length, str);
                        length += str.length() - strGroup5.length();
                    }
                }
                return sb.toString();
            }
        } catch (Exception unused3) {
        }
        return null;
    }
}
