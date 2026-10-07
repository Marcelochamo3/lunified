package o;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Q2 implements Q70 {
    public final /* synthetic */ int a;
    public final C2720s4 b;

    public /* synthetic */ Q2(C2720s4 c2720s4, int i) {
        this.a = i;
        this.b = c2720s4;
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) {
        switch (this.a) {
            case 0:
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource((ByteBuffer) obj);
                this.b.getClass();
                return C2720s4.W(sourceCreateSource, i, i2, fw);
            default:
                ImageDecoder.Source sourceCreateSource2 = ImageDecoder.createSource(AbstractC2274na.b((InputStream) obj));
                this.b.getClass();
                return C2720s4.W(sourceCreateSource2, i, i2, fw);
        }
    }

    @Override // o.Q70
    public final boolean b(Object obj, FW fw) throws IOException {
        switch (this.a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeW = Jp0.w((List) this.b.m, (ByteBuffer) obj);
                return imageHeaderParser$ImageTypeW == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeW == ImageHeaderParser$ImageType.ANIMATED_AVIF);
            default:
                C2720s4 c2720s4 = this.b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeV = Jp0.v((List) c2720s4.m, (InputStream) obj, (C1813in) c2720s4.n);
                return imageHeaderParser$ImageTypeV == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeV == ImageHeaderParser$ImageType.ANIMATED_AVIF);
        }
    }
}
