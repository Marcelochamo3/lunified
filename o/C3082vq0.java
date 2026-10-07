package o;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: renamed from: o.vq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3082vq0 implements RQ {
    public static final C3082vq0 b = new C3082vq0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C3082vq0(int i) {
        this.a = i;
    }

    @Override // o.RQ
    public final QQ a(C1583gR c1583gR) {
        switch (this.a) {
            case 0:
                return C3179wq0.b;
            case 1:
                return new C1299da(0, new C2691rp(26));
            case 2:
                return new C1299da(0, new O9(27));
            case 3:
                return new C3179wq0(1);
            case 4:
                return new Xg0(c1583gR.k(Uri.class, AssetFileDescriptor.class), 0);
            case 5:
                return new Xg0(c1583gR.k(Uri.class, ParcelFileDescriptor.class), 0);
            case 6:
                return new Xg0(c1583gR.k(Uri.class, InputStream.class), 0);
            case 7:
                return new Xg0(c1583gR.k(C2151mA.class, InputStream.class), 1);
            default:
                return new Ar0(c1583gR.k(C2151mA.class, InputStream.class));
        }
    }
}
