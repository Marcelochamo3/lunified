package o;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: o.Lu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0589Lu extends S7 {
    public RandomAccessFile p;
    public Uri q;
    public long r;
    public boolean s;

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws C0564Ku {
        if (i2 == 0) {
            return 0;
        }
        long j = this.r;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.p;
            int i3 = Lr0.a;
            int i4 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i4 > 0) {
                this.r -= (long) i4;
                b(i4);
            }
            return i4;
        } catch (IOException e) {
            throw new C0564Ku(2000, e);
        }
    }

    @Override // o.InterfaceC2583qj
    public final void close() {
        this.q = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.p;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.p = null;
                if (this.s) {
                    this.s = false;
                    c();
                }
            } catch (IOException e) {
                throw new C0564Ku(2000, e);
            }
        } catch (Throwable th) {
            this.p = null;
            if (this.s) {
                this.s = false;
                c();
            }
            throw th;
        }
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws C0564Ku {
        Uri uri = c2970uj.a;
        long j = c2970uj.f;
        this.q = uri;
        e();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.p = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = c2970uj.g;
                if (length == -1) {
                    length = this.p.length() - j;
                }
                this.r = length;
                if (length < 0) {
                    throw new C0564Ku(2008, null, null);
                }
                this.s = true;
                f(c2970uj);
                return this.r;
            } catch (IOException e) {
                throw new C0564Ku(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C0564Ku((Lr0.a < 21 || !AbstractC0538Ju.b(e2.getCause())) ? 2005 : 2006, e2);
            }
            throw new C0564Ku(1004, "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + uri.getPath() + ",query=" + uri.getQuery() + ",fragment=" + uri.getFragment(), e2);
        } catch (SecurityException e3) {
            throw new C0564Ku(2006, e3);
        } catch (RuntimeException e4) {
            throw new C0564Ku(2000, e4);
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.q;
    }
}
