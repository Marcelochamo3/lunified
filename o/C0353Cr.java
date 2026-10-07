package o;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o.Cr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0353Cr extends C3374yr {
    public C0353Cr(byte[] bArr) {
        super(bArr);
        this.l.mark(Integer.MAX_VALUE);
    }

    public final void f(long j) throws IOException {
        int i = this.n;
        if (i > j) {
            this.n = 0;
            this.l.reset();
        } else {
            j -= (long) i;
        }
        a((int) j);
    }

    public C0353Cr(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.l.mark(Integer.MAX_VALUE);
            return;
        }
        throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
    }
}
