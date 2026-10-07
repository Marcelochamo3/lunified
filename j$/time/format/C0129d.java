package j$.time.format;

/* JADX INFO: renamed from: j$.time.format.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0129d implements InterfaceC0131f {
    private final char a;

    C0129d(char c) {
        this.a = c;
    }

    @Override // j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        sb.append(this.a);
        return true;
    }

    @Override // j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c = this.a;
        return (cCharAt == c || (!wVar.k() && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
