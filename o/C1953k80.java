package o;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: o.k80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1953k80 extends Reader {
    public final N9 l;
    public final Charset m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public InputStreamReader f863o;

    public C1953k80(N9 n9, Charset charset) {
        AbstractC1474fG.j(n9, "source");
        AbstractC1474fG.j(charset, "charset");
        this.l = n9;
        this.m = charset;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        C2985uq0 c2985uq0;
        this.n = true;
        InputStreamReader inputStreamReader = this.f863o;
        if (inputStreamReader != null) {
            inputStreamReader.close();
            c2985uq0 = C2985uq0.a;
        } else {
            c2985uq0 = null;
        }
        if (c2985uq0 == null) {
            this.l.close();
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i, int i2) throws IOException {
        AbstractC1474fG.j(cArr, "cbuf");
        if (this.n) {
            throw new IOException("Stream closed");
        }
        InputStreamReader inputStreamReader = this.f863o;
        if (inputStreamReader == null) {
            N9 n9 = this.l;
            inputStreamReader = new InputStreamReader(n9.V(), Mr0.s(n9, this.m));
            this.f863o = inputStreamReader;
        }
        return inputStreamReader.read(cArr, i, i2);
    }
}
