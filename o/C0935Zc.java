package o;

/* JADX INFO: renamed from: o.Zc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0935Zc extends AbstractC0909Yc {
    public final char l;

    public C0935Zc(char c) {
        this.l = c;
    }

    @Override // o.AbstractC0909Yc
    public final boolean b(char c) {
        return c == this.l;
    }

    public final String toString() {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c = this.l;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        String strCopyValueOf = String.copyValueOf(cArr);
        StringBuilder sb = new StringBuilder(String.valueOf(strCopyValueOf).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(strCopyValueOf);
        sb.append("')");
        return sb.toString();
    }
}
