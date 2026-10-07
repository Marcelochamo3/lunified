package o;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class Ks0 extends MediaDataSource {
    public final /* synthetic */ ByteBuffer l;

    public Ks0(ByteBuffer byteBuffer) {
        this.l = byteBuffer;
    }

    public final long getSize() {
        return this.l.limit();
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.l.limit()) {
            return -1;
        }
        this.l.position((int) j);
        int iMin = Math.min(i2, this.l.remaining());
        this.l.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
