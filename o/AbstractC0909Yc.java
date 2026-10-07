package o;

/* JADX INFO: renamed from: o.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0909Yc implements I20 {
    public int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        AbstractC1459f50.i(i, length);
        while (i < length) {
            if (b(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @Override // o.I20
    public final boolean apply(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c);
}
