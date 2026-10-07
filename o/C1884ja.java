package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: o.ja, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1884ja implements Q70 {
    public static final O9 f = new O9(28);
    public static final C1788ia g = new C1788ia(0);
    public final Context a;
    public final List b;
    public final C1788ia c;
    public final O9 d;
    public final C2994uv e;

    public C1884ja(Context context, ArrayList arrayList, Q8 q8, C1813in c1813in) {
        O9 o9 = f;
        this.a = context.getApplicationContext();
        this.b = arrayList;
        this.d = o9;
        this.e = new C2994uv(q8, 4, c1813in);
        this.c = g;
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) {
        C0906Xz c0906Xz;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        C1788ia c1788ia = this.c;
        synchronized (c1788ia) {
            try {
                C0906Xz c0906Xz2 = (C0906Xz) c1788ia.a.poll();
                if (c0906Xz2 == null) {
                    c0906Xz2 = new C0906Xz();
                }
                c0906Xz = c0906Xz2;
                c0906Xz.b = null;
                Arrays.fill(c0906Xz.a, (byte) 0);
                c0906Xz.c = new C0880Wz();
                c0906Xz.d = 0;
                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                c0906Xz.b = byteBufferAsReadOnlyBuffer;
                byteBufferAsReadOnlyBuffer.position(0);
                c0906Xz.b.order(ByteOrder.LITTLE_ENDIAN);
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return c(byteBuffer, i, i2, c0906Xz, fw);
        } finally {
            this.c.c(c0906Xz);
        }
    }

    @Override // o.Q70
    public final boolean b(Object obj, FW fw) {
        return !((Boolean) fw.c(AbstractC0932Yz.b)).booleanValue() && Jp0.w(this.b, (ByteBuffer) obj) == ImageHeaderParser$ImageType.GIF;
    }

    public final C0698Pz c(ByteBuffer byteBuffer, int i, int i2, C0906Xz c0906Xz, FW fw) {
        int i3 = AL.a;
        SystemClock.elapsedRealtimeNanos();
        try {
            C0880Wz c0880WzB = c0906Xz.b();
            if (c0880WzB.c > 0 && c0880WzB.b == 0) {
                Bitmap.Config config = fw.c(AbstractC0932Yz.a) == EnumC0423Fj.m ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                int iMin = Math.min(c0880WzB.g / i2, c0880WzB.f / i);
                int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
                Log.isLoggable("BufferGifDecoder", 2);
                O9 o9 = this.d;
                C2994uv c2994uv = this.e;
                o9.getClass();
                C1897jg0 c1897jg0 = new C1897jg0(c2994uv, c0880WzB, byteBuffer, iMax);
                c1897jg0.c(config);
                c1897jg0.k = (c1897jg0.k + 1) % c1897jg0.l.c;
                Bitmap bitmapB = c1897jg0.b();
                if (bitmapB == null) {
                    return null;
                }
                return new C0698Pz(new C0672Oz(new Y2(1, new C0854Vz(com.bumptech.glide.a.a(this.a), c1897jg0, i, i2, C3373yq0.b, bitmapB))), 0);
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                SystemClock.elapsedRealtimeNanos();
            }
        }
    }
}
