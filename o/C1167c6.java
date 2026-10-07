package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: o.c6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1167c6 extends S7 {
    public final AssetManager p;
    public Uri q;
    public InputStream r;
    public long s;
    public boolean t;

    public C1167c6(Context context) {
        super(false);
        this.p = context.getAssets();
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws C1070b6 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.s;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C1070b6(2000, e);
            }
        }
        InputStream inputStream = this.r;
        int i3 = Lr0.a;
        int i4 = inputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.s;
        if (j2 != -1) {
            this.s = j2 - ((long) i4);
        }
        b(i4);
        return i4;
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        this.q = null;
        try {
            try {
                InputStream inputStream = this.r;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.r = null;
                if (this.t) {
                    this.t = false;
                    c();
                }
            } catch (IOException e) {
                throw new C1070b6(2000, e);
            }
        } catch (Throwable th) {
            this.r = null;
            if (this.t) {
                this.t = false;
                c();
            }
            throw th;
        }
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws C1070b6 {
        try {
            Uri uri = c2970uj.a;
            long j = c2970uj.f;
            this.q = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e();
            InputStream inputStreamOpen = this.p.open(path, 1);
            this.r = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new C1070b6(2008, null);
            }
            long j2 = c2970uj.g;
            if (j2 != -1) {
                this.s = j2;
            } else {
                long jAvailable = this.r.available();
                this.s = jAvailable;
                if (jAvailable == C1707hi0.a) {
                    this.s = -1L;
                }
            }
            this.t = true;
            f(c2970uj);
            return this.s;
        } catch (C1070b6 e) {
            throw e;
        } catch (IOException e2) {
            throw new C1070b6(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.q;
    }
}
