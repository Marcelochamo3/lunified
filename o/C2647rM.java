package o;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: o.rM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2647rM implements Q8 {
    public static final Bitmap.Config q = Bitmap.Config.ARGB_8888;
    public final InterfaceC3035vM l;
    public final Set m;
    public final C2743sL n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f1001o;
    public long p;

    public C2647rM(long j) {
        C2477pe0 c2477pe0 = new C2477pe0();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.f1001o = j;
        this.l = c2477pe0;
        this.m = setUnmodifiableSet;
        this.n = new C2743sL(1);
    }

    @Override // o.Q8
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = q;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = ((C2477pe0) this.l).b(i, i2, config != null ? config : q);
            if (bitmapB != null) {
                long j = this.p;
                ((C2477pe0) this.l).getClass();
                this.p = j - ((long) Kr0.c(bitmapB));
                this.n.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                ((C2477pe0) this.l).getClass();
                C2477pe0.c(Kr0.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((C2477pe0) this.l).getClass();
                C2477pe0.c(Kr0.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.l);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    @Override // o.Q8
    public final Bitmap c(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = q;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // o.Q8
    public final synchronized void d(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                ((C2477pe0) this.l).getClass();
                if (Kr0.c(bitmap) <= this.f1001o && this.m.contains(bitmap.getConfig())) {
                    ((C2477pe0) this.l).getClass();
                    int iC = Kr0.c(bitmap);
                    ((C2477pe0) this.l).e(bitmap);
                    this.n.getClass();
                    this.p += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((C2477pe0) this.l).getClass();
                        C2477pe0.c(Kr0.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.l);
                    }
                    e(this.f1001o);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((C2477pe0) this.l).getClass();
                C2477pe0.c(Kr0.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.m.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(long j) {
        while (this.p > j) {
            C2477pe0 c2477pe0 = (C2477pe0) this.l;
            Bitmap bitmap = (Bitmap) c2477pe0.b.j0();
            if (bitmap != null) {
                c2477pe0.a(Integer.valueOf(Kr0.c(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.l);
                }
                this.p = 0L;
                return;
            }
            this.n.getClass();
            long j2 = this.p;
            ((C2477pe0) this.l).getClass();
            this.p = j2 - ((long) Kr0.c(bitmap));
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((C2477pe0) this.l).getClass();
                C2477pe0.c(Kr0.c(bitmap), bitmap.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.l);
            }
            bitmap.recycle();
        }
    }

    @Override // o.Q8
    public final void f(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            g();
        } else if (i >= 20 || i == 15) {
            e(this.f1001o / 2);
        }
    }

    @Override // o.Q8
    public final void g() {
        Log.isLoggable("LruBitmapPool", 3);
        e(0L);
    }
}
