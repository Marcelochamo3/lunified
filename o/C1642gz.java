package o;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: o.gz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1642gz {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = Lr0.a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.a = i2;
            this.b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(CQ cq) {
        int i = 0;
        while (true) {
            BQ[] bqArr = cq.l;
            if (i >= bqArr.length) {
                return;
            }
            BQ bq = bqArr[i];
            if (bq instanceof C3156wf) {
                C3156wf c3156wf = (C3156wf) bq;
                if ("iTunSMPB".equals(c3156wf.n) && a(c3156wf.f1096o)) {
                    return;
                }
            } else if (bq instanceof C1279dG) {
                C1279dG c1279dG = (C1279dG) bq;
                if ("com.apple.iTunes".equals(c1279dG.m) && "iTunSMPB".equals(c1279dG.n) && a(c1279dG.f735o)) {
                    return;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
