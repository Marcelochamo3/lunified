package o;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: renamed from: o.xr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3277xr extends MediaDataSource {
    public long l;
    public final /* synthetic */ C0353Cr m;

    public C3277xr(C0353Cr c0353Cr) {
        this.m = c0353Cr;
    }

    public final long getSize() {
        return -1L;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.l;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.m.l.available())) {
                    return -1;
                }
                this.m.f(j);
                this.l = j;
            }
            if (i2 > this.m.l.available()) {
                i2 = this.m.l.available();
            }
            int i3 = this.m.read(bArr, i, i2);
            if (i3 >= 0) {
                this.l += (long) i3;
                return i3;
            }
        } catch (IOException unused) {
        }
        this.l = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
