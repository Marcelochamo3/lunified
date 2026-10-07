package o;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: o.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1305dd {
    public static final Charset a;
    public static final Charset b;
    public static volatile Charset c;
    public static volatile Charset d;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        AbstractC1474fG.i(charsetForName, "forName(...)");
        a = charsetForName;
        AbstractC1474fG.i(Charset.forName("UTF-16"), "forName(...)");
        AbstractC1474fG.i(Charset.forName("UTF-16BE"), "forName(...)");
        AbstractC1474fG.i(Charset.forName("UTF-16LE"), "forName(...)");
        Charset charsetForName2 = Charset.forName("US-ASCII");
        AbstractC1474fG.i(charsetForName2, "forName(...)");
        b = charsetForName2;
        AbstractC1474fG.i(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
