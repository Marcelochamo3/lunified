package o;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: o.Er, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0405Er implements PE {
    @Override // o.PE
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // o.PE
    public final int b(ByteBuffer byteBuffer, C1813in c1813in) {
        AtomicReference atomicReference = AbstractC2274na.a;
        return c(new C2177ma(byteBuffer), c1813in);
    }

    @Override // o.PE
    public final int c(InputStream inputStream, C1813in c1813in) throws Throwable {
        C0379Dr c0379Dr = new C0379Dr(inputStream);
        C3471zr c3471zrC = c0379Dr.c("Orientation");
        int iE = 1;
        if (c3471zrC != null) {
            try {
                iE = c3471zrC.e(c0379Dr.f);
            } catch (NumberFormatException unused) {
            }
        }
        if (iE == 0) {
            return -1;
        }
        return iE;
    }

    @Override // o.PE
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
}
