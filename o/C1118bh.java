package o;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: o.bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1118bh extends S7 {
    public final ContentResolver p;
    public Uri q;
    public AssetFileDescriptor r;
    public FileInputStream s;
    public long t;
    public boolean u;

    public C1118bh(Context context) {
        super(false);
        this.p = context.getContentResolver();
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws C1020ah {
        if (i2 == 0) {
            return 0;
        }
        long j = this.t;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C1020ah(2000, e);
            }
        }
        FileInputStream fileInputStream = this.s;
        int i3 = Lr0.a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.t;
        if (j2 != -1) {
            this.t = j2 - ((long) i4);
        }
        b(i4);
        return i4;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // o.InterfaceC2583qj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.q = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.s     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.s = r0
            android.content.res.AssetFileDescriptor r3 = r5.r     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.r = r0
            boolean r0 = r5.u
            if (r0 == 0) goto L2b
            r5.u = r2
            r5.c()
        L2b:
            return
        L2c:
            o.ah r4 = new o.ah     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.r = r0
            boolean r0 = r5.u
            if (r0 == 0) goto L3d
            r5.u = r2
            r5.c()
        L3d:
            throw r1
        L3e:
            o.ah r4 = new o.ah     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.s = r0
            android.content.res.AssetFileDescriptor r4 = r5.r     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.r = r0
            boolean r0 = r5.u
            if (r0 == 0) goto L5d
            r5.u = r2
            r5.c()
        L5d:
            throw r3
        L5e:
            o.ah r4 = new o.ah     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.r = r0
            boolean r0 = r5.u
            if (r0 == 0) goto L6f
            r5.u = r2
            r5.c()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1118bh.close():void");
    }

    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws C1020ah {
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            Uri uriNormalizeScheme = c2970uj.a.normalizeScheme();
            this.q = uriNormalizeScheme;
            e();
            boolean zEquals = "content".equals(uriNormalizeScheme.getScheme());
            ContentResolver contentResolver = this.p;
            if (zEquals) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
            }
            this.r = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new C1020ah(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
            }
            long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
            this.s = fileInputStream;
            long j = c2970uj.f;
            if (length != -1 && j > length) {
                throw new C1020ah(2008, null);
            }
            long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
            long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
            if (jSkip != j) {
                throw new C1020ah(2008, null);
            }
            if (length == -1) {
                FileChannel channel = fileInputStream.getChannel();
                long size = channel.size();
                if (size == 0) {
                    this.t = -1L;
                } else {
                    long jPosition = size - channel.position();
                    this.t = jPosition;
                    if (jPosition < 0) {
                        throw new C1020ah(2008, null);
                    }
                }
            } else {
                long j2 = length - jSkip;
                this.t = j2;
                if (j2 < 0) {
                    throw new C1020ah(2008, null);
                }
            }
            long j3 = c2970uj.g;
            if (j3 != -1) {
                long j4 = this.t;
                this.t = j4 == -1 ? j3 : Math.min(j4, j3);
            }
            this.u = true;
            f(c2970uj);
            return j3 != -1 ? j3 : this.t;
        } catch (C1020ah e) {
            throw e;
        } catch (IOException e2) {
            throw new C1020ah(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.q;
    }
}
