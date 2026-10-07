package o;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: renamed from: o.s50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2723s50 extends S7 {
    public final Resources p;
    public final String q;
    public Uri r;
    public AssetFileDescriptor s;
    public FileInputStream t;
    public long u;
    public boolean v;

    public C2723s50(Context context) {
        super(false);
        this.p = context.getResources();
        this.q = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // o.InterfaceC2000kj
    public final int D(byte[] bArr, int i, int i2) throws C2626r50 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.u;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C2626r50(2000, null, e);
            }
        }
        FileInputStream fileInputStream = this.t;
        int i3 = Lr0.a;
        int i4 = fileInputStream.read(bArr, i, i2);
        if (i4 == -1) {
            if (this.u == -1) {
                return -1;
            }
            throw new C2626r50(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j2 = this.u;
        if (j2 != -1) {
            this.u = j2 - ((long) i4);
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
            r5.r = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.t     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
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
            r5.t = r0
            android.content.res.AssetFileDescriptor r3 = r5.s     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
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
            r5.s = r0
            boolean r0 = r5.v
            if (r0 == 0) goto L2b
            r5.v = r2
            r5.c()
        L2b:
            return
        L2c:
            o.r50 r4 = new o.r50     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.s = r0
            boolean r0 = r5.v
            if (r0 == 0) goto L3d
            r5.v = r2
            r5.c()
        L3d:
            throw r1
        L3e:
            o.r50 r4 = new o.r50     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.t = r0
            android.content.res.AssetFileDescriptor r4 = r5.s     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
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
            r5.s = r0
            boolean r0 = r5.v
            if (r0 == 0) goto L5d
            r5.v = r2
            r5.c()
        L5d:
            throw r3
        L5e:
            o.r50 r4 = new o.r50     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r0, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.s = r0
            boolean r0 = r5.v
            if (r0 == 0) goto L6f
            r5.v = r2
            r5.c()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2723s50.close():void");
    }

    /* JADX WARN: Code duplicated, block: B:84:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // o.InterfaceC2583qj
    public final long v(C2970uj c2970uj) throws C2626r50 {
        int identifier;
        Uri uriNormalizeScheme = c2970uj.a.normalizeScheme();
        this.r = uriNormalizeScheme;
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Resources resources = this.p;
        if (zEquals) {
            try {
                String lastPathSegment = uriNormalizeScheme.getLastPathSegment();
                lastPathSegment.getClass();
                identifier = Integer.parseInt(lastPathSegment);
            } catch (NumberFormatException unused) {
                throw new C2626r50(1004, "Resource identifier must be an integer.", null);
            }
        } else {
            if (TextUtils.equals("android.resource", uriNormalizeScheme.getScheme()) && uriNormalizeScheme.getPathSegments().size() == 1) {
                String lastPathSegment2 = uriNormalizeScheme.getLastPathSegment();
                lastPathSegment2.getClass();
                if (lastPathSegment2.matches("\\d+")) {
                    String lastPathSegment3 = uriNormalizeScheme.getLastPathSegment();
                    lastPathSegment3.getClass();
                    identifier = Integer.parseInt(lastPathSegment3);
                }
            }
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new C2626r50(1004, "Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String host = uriNormalizeScheme.getHost();
            identifier = resources.getIdentifier(AbstractC1701hf0.h(new StringBuilder(), TextUtils.isEmpty(host) ? "" : AbstractC1701hf0.d(host, ":"), path), "raw", this.q);
            if (identifier == 0) {
                throw new C2626r50(2005, "Resource not found.", null);
            }
        }
        e();
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(identifier);
            this.s = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new C2626r50(2000, "Resource is compressed: " + uriNormalizeScheme, null);
            }
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileInputStream fileInputStream = new FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
            this.t = fileInputStream;
            long j = c2970uj.f;
            try {
                if (length != -1 && j > length) {
                    throw new C2626r50(2008, null, null);
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(startOffset + j) - startOffset;
                if (jSkip != j) {
                    throw new C2626r50(2008, null, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStream.getChannel();
                    if (channel.size() == 0) {
                        this.u = -1L;
                    } else {
                        long size = channel.size() - channel.position();
                        this.u = size;
                        if (size < 0) {
                            throw new C2626r50(2008, null, null);
                        }
                    }
                } else {
                    long j2 = length - jSkip;
                    this.u = j2;
                    if (j2 < 0) {
                        throw new C2679rj(2008);
                    }
                }
                long j3 = c2970uj.g;
                if (j3 != -1) {
                    long j4 = this.u;
                    this.u = j4 == -1 ? j3 : Math.min(j4, j3);
                }
                this.v = true;
                f(c2970uj);
                return j3 != -1 ? j3 : this.u;
            } catch (C2626r50 e) {
                throw e;
            } catch (IOException e2) {
                throw new C2626r50(2000, null, e2);
            }
        } catch (Resources.NotFoundException e3) {
            throw new C2626r50(2005, null, e3);
        }
    }

    @Override // o.InterfaceC2583qj
    public final Uri w() {
        return this.r;
    }
}
