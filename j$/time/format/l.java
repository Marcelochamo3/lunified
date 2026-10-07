package j$.time.format;

import j$.time.C0111b;

/* JADX INFO: loaded from: classes2.dex */
final class l implements InterfaceC0131f {
    private final InterfaceC0131f a;
    private final int b;
    private final char c;

    l(InterfaceC0131f interfaceC0131f, int i, char c) {
        this.a = interfaceC0131f;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.p(yVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new C0111b("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    @Override // j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        boolean zL = wVar.l();
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        }
        if (i == charSequence.length()) {
            return ~i;
        }
        int length = this.b + i;
        if (length > charSequence.length()) {
            if (zL) {
                return ~i;
            }
            length = charSequence.length();
        }
        int i2 = i;
        while (i2 < length && wVar.b(charSequence.charAt(i2), this.c)) {
            i2++;
        }
        int iR = this.a.r(wVar, charSequence.subSequence(0, length), i2);
        return (iR == length || !zL) ? iR : ~(i + i2);
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }
}
