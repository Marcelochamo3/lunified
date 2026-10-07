package o;

import android.util.Base64;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.Tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0786Tj {
    public static final I60 a = new I60("<script\\s+type=\"application/json\">(.*?)</script>", J60.DOT_MATCHES_ALL);

    public static TH a(String str) {
        int i;
        try {
            ArrayList arrayList = new ArrayList(str.length());
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                int i3 = 65;
                if ('A' > cCharAt || cCharAt >= '[') {
                    i3 = 97;
                    if ('a' <= cCharAt && cCharAt < '{') {
                        i = (cCharAt - 'T') % 26;
                    }
                    arrayList.add(Character.valueOf(cCharAt));
                } else {
                    i = (cCharAt - '4') % 26;
                }
                cCharAt = (char) (i + i3);
                arrayList.add(Character.valueOf(cCharAt));
            }
            byte[] bArrDecode = Base64.decode(AbstractC1899jh0.R(b(AbstractC0911Ye.h0(arrayList, "", null, null, null, 62)), "_", "", false), 2);
            AbstractC1474fG.i(bArrDecode, "decode(...)");
            String str2 = new String(bArrDecode, AbstractC1305dd.a);
            ArrayList arrayList2 = new ArrayList(str2.length());
            for (int i4 = 0; i4 < str2.length(); i4++) {
                arrayList2.add(Character.valueOf((char) (str2.charAt(i4) - 3)));
            }
            byte[] bArrDecode2 = Base64.decode(AbstractC1119bh0.q0(AbstractC0911Ye.h0(arrayList2, "", null, null, null, 62)).toString(), 2);
            AbstractC1474fG.i(bArrDecode2, "decode(...)");
            return U9.v(new String(bArrDecode2, AbstractC1305dd.a)).f();
        } catch (Exception e) {
            e.getMessage();
            System.out.getClass();
            return new TH();
        }
    }

    public static String b(String str) {
        for (String str2 : AbstractC0937Ze.K("@$", "^^", "~@", "%?", "*~", "!!", "#&")) {
            AbstractC1474fG.j(str2, "literal");
            String strQuote = Pattern.quote(str2);
            AbstractC1474fG.i(strQuote, "quote(...)");
            Pattern patternCompile = Pattern.compile(strQuote);
            AbstractC1474fG.i(patternCompile, "compile(...)");
            str = patternCompile.matcher(str).replaceAll("_");
            AbstractC1474fG.i(str, "replaceAll(...)");
        }
        return str;
    }
}
