package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.hA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1664hA implements Appendable {
    public final Appendable l;
    public boolean m = true;

    public C1664hA(Appendable appendable) {
        this.l = appendable;
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) throws IOException {
        boolean z = this.m;
        Appendable appendable = this.l;
        if (z) {
            this.m = false;
            appendable.append("  ");
        }
        this.m = c == '\n';
        appendable.append(c);
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        append(charSequence, 0, charSequence.length());
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        if (charSequence == null) {
            charSequence = "";
        }
        boolean z = this.m;
        Appendable appendable = this.l;
        boolean z2 = false;
        if (z) {
            this.m = false;
            appendable.append("  ");
        }
        if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == '\n') {
            z2 = true;
        }
        this.m = z2;
        appendable.append(charSequence, i, i2);
        return this;
    }
}
