package o;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1592ga implements Q70 {
    public final /* synthetic */ int a;
    public final O8 b;

    public C1592ga(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new O8();
                break;
            default:
                this.b = new O8();
                break;
        }
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) {
        switch (this.a) {
            case 0:
                return this.b.c(ImageDecoder.createSource((ByteBuffer) obj), i, i2, fw);
            default:
                return this.b.c(ImageDecoder.createSource(AbstractC2274na.b((InputStream) obj)), i, i2, fw);
        }
    }

    @Override // o.Q70
    public final /* bridge */ /* synthetic */ boolean b(Object obj, FW fw) {
        switch (this.a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
