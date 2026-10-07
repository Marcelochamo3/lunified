package o;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class O8 implements Q70 {
    public final /* synthetic */ int a;
    public final Q8 b;

    public O8() {
        this.a = 0;
        this.b = new O9(25);
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) {
        switch (this.a) {
            case 0:
                return c(AbstractC3294y0.f(obj), i, i2, fw);
            default:
                return R8.c(((C1897jg0) obj).b(), this.b);
        }
    }

    @Override // o.Q70
    public final /* bridge */ /* synthetic */ boolean b(Object obj, FW fw) {
        switch (this.a) {
            case 0:
                AbstractC3294y0.v(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public R8 c(ImageDecoder.Source source, int i, int i2, FW fw) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C2780sl(i, i2, fw));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new R8(bitmapDecodeBitmap, (O9) this.b);
    }

    public O8(Q8 q8) {
        this.a = 1;
        this.b = q8;
    }
}
