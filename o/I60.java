package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class I60 implements Serializable {
    public final Pattern l;

    public I60(Pattern pattern) {
        this.l = pattern;
    }

    public static C0927Yu c(I60 i60, CharSequence charSequence) {
        i60.getClass();
        AbstractC1474fG.j(charSequence, "input");
        if (charSequence.length() >= 0) {
            return new C0927Yu(new C0352Cq(i60, charSequence, 0), 1, H60.t);
        }
        StringBuilder sbR = AbstractC1674hK.r("Start index out of bounds: ", 0, ", input length: ");
        sbR.append(charSequence.length());
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    private final Object writeReplace() {
        Pattern pattern = this.l;
        String strPattern = pattern.pattern();
        AbstractC1474fG.i(strPattern, "pattern(...)");
        return new G60(strPattern, pattern.flags());
    }

    public final boolean a(String str) {
        AbstractC1474fG.j(str, "input");
        return this.l.matcher(str).find();
    }

    public final JN b(CharSequence charSequence, int i) {
        AbstractC1474fG.j(charSequence, "input");
        Matcher matcher = this.l.matcher(charSequence);
        AbstractC1474fG.i(matcher, "matcher(...)");
        return AbstractC1370eA.a(matcher, i, charSequence);
    }

    public final boolean d(CharSequence charSequence) {
        AbstractC1474fG.j(charSequence, "input");
        return this.l.matcher(charSequence).matches();
    }

    public final String e(String str, InterfaceC0412Ey interfaceC0412Ey) {
        int i = 0;
        JN jnB = b(str, 0);
        if (jnB == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, jnB.b().l);
            sb.append((CharSequence) interfaceC0412Ey.b(jnB));
            i = jnB.b().m + 1;
            jnB = jnB.d();
            if (i >= length) {
                break;
            }
        } while (jnB != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        String string = sb.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public final String toString() {
        String string = this.l.toString();
        AbstractC1474fG.i(string, "toString(...)");
        return string;
    }

    public I60(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC1474fG.i(patternCompile, "compile(...)");
        this.l = patternCompile;
    }

    public I60(String str, J60 j60) {
        Pattern patternCompile = Pattern.compile(str, C3325yL.p(j60.l));
        AbstractC1474fG.i(patternCompile, "compile(...)");
        this.l = patternCompile;
    }

    public I60(String str, Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((J60) it.next()).l;
        }
        Pattern patternCompile = Pattern.compile(str, C3325yL.p(i));
        AbstractC1474fG.i(patternCompile, "compile(...)");
        this.l = patternCompile;
    }
}
