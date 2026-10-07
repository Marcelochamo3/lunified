package o;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class V70 implements RQ {
    public final /* synthetic */ int a;
    public final Resources b;

    public /* synthetic */ V70(Resources resources, int i) {
        this.a = i;
        this.b = resources;
    }

    @Override // o.RQ
    public final QQ a(C1583gR c1583gR) {
        switch (this.a) {
            case 0:
                return new C1558g6(this.b, c1583gR.k(Uri.class, AssetFileDescriptor.class));
            case 1:
                return new C1558g6(this.b, c1583gR.k(Uri.class, InputStream.class));
            default:
                return new C1558g6(this.b, C3179wq0.b);
        }
    }
}
