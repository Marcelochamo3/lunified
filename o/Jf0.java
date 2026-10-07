package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class Jf0 implements Iterator {
    public String m;
    public final CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AbstractC0909Yc f347o;
    public int r;
    public final /* synthetic */ L80 s;
    public int l = 2;
    public int q = 0;
    public final boolean p = false;

    public Jf0(L80 l80, C2613qy c2613qy, CharSequence charSequence) {
        this.s = l80;
        this.f347o = (AbstractC0909Yc) c2613qy.n;
        this.r = c2613qy.m;
        this.n = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String string;
        AbstractC0909Yc abstractC0909Yc;
        int i = this.l;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iW = AbstractC1701hf0.w(i);
        if (iW == 0) {
            return true;
        }
        if (iW == 2) {
            return false;
        }
        this.l = 4;
        int i2 = this.q;
        while (true) {
            int i3 = this.q;
            if (i3 == -1) {
                this.l = 3;
                string = null;
                break;
            }
            AbstractC0909Yc abstractC0909Yc2 = (AbstractC0909Yc) this.s.l;
            CharSequence charSequence = this.n;
            int iA = abstractC0909Yc2.a(charSequence, i3);
            if (iA == -1) {
                iA = charSequence.length();
                this.q = -1;
            } else {
                this.q = iA + 1;
            }
            int i4 = this.q;
            if (i4 == i2) {
                int i5 = i4 + 1;
                this.q = i5;
                if (i5 > charSequence.length()) {
                    this.q = -1;
                }
            } else {
                while (true) {
                    abstractC0909Yc = this.f347o;
                    if (i2 >= iA || !abstractC0909Yc.b(charSequence.charAt(i2))) {
                        break;
                    }
                    i2++;
                }
                while (iA > i2 && abstractC0909Yc.b(charSequence.charAt(iA - 1))) {
                    iA--;
                }
                if (!this.p || i2 != iA) {
                    int i6 = this.r;
                    if (i6 == 1) {
                        iA = charSequence.length();
                        this.q = -1;
                        while (iA > i2 && abstractC0909Yc.b(charSequence.charAt(iA - 1))) {
                            iA--;
                        }
                    } else {
                        this.r = i6 - 1;
                    }
                    string = charSequence.subSequence(i2, iA).toString();
                    break;
                }
                i2 = this.q;
            }
        }
        this.m = string;
        if (this.l == 3) {
            return false;
        }
        this.l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.l = 2;
        String str = this.m;
        this.m = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
