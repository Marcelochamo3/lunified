package o;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.fa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1494fa implements Q70 {
    public final /* synthetic */ int a;
    public final C2010ko b;

    public /* synthetic */ C1494fa(C2010ko c2010ko, int i) {
        this.a = i;
        this.b = c2010ko;
    }

    @Override // o.Q70
    public final M70 a(Object obj, int i, int i2, FW fw) {
        switch (this.a) {
            case 0:
                C2010ko c2010ko = this.b;
                return c2010ko.a(new Na0((ByteBuffer) obj, c2010ko.d, c2010ko.c, 25), i, i2, fw, C2010ko.k);
            default:
                C2010ko c2010ko2 = this.b;
                return c2010ko2.a(new Na0((ParcelFileDescriptor) obj, c2010ko2.d, c2010ko2.c), i, i2, fw, C2010ko.k);
        }
    }

    @Override // o.Q70
    public final boolean b(Object obj, FW fw) {
        switch (this.a) {
            case 0:
                this.b.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) {
                    this.b.getClass();
                    if (!"robolectric".equals(Build.FINGERPRINT)) {
                        return true;
                    }
                }
                return false;
        }
    }
}
