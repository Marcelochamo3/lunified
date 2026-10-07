package o;

import java.util.List;
import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes.dex */
public final class JN {
    public final Matcher a;
    public final CharSequence b;
    public final IN c;
    public HN d;

    public JN(Matcher matcher, CharSequence charSequence) {
        AbstractC1474fG.j(charSequence, "input");
        this.a = matcher;
        this.b = charSequence;
        this.c = new IN(this);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new HN(this);
        }
        HN hn = this.d;
        AbstractC1474fG.g(hn);
        return hn;
    }

    public final ZF b() {
        Matcher matcher = this.a;
        return U9.L(matcher.start(), matcher.end());
    }

    public final String c() {
        String strGroup = this.a.group();
        AbstractC1474fG.i(strGroup, "group(...)");
        return strGroup;
    }

    public final JN d() {
        Matcher matcher = this.a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        AbstractC1474fG.i(matcher2, "matcher(...)");
        return AbstractC1370eA.a(matcher2, iEnd, charSequence);
    }
}
