package o;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.tK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2839tK implements Iterator, InterfaceC1770iI {
    public String l;
    public boolean m;
    public final /* synthetic */ Y5 n;

    public C2839tK(Y5 y5) {
        this.n = y5;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.l == null && !this.m) {
            String line = ((BufferedReader) this.n.b).readLine();
            this.l = line;
            if (line == null) {
                this.m = true;
            }
        }
        return this.l != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.l;
        this.l = null;
        AbstractC1474fG.g(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
