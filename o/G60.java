package o;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class G60 implements Serializable {
    private static final long serialVersionUID = 0;
    public final String l;
    public final int m;

    public G60(String str, int i) {
        this.l = str;
        this.m = i;
    }

    private final Object readResolve() {
        Pattern patternCompile = Pattern.compile(this.l, this.m);
        AbstractC1474fG.i(patternCompile, "compile(...)");
        return new I60(patternCompile);
    }
}
