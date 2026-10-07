package o;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: renamed from: o.w40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3109w40 implements QQ {
    public final Context a;
    public final QQ b;
    public final QQ c;
    public final Class d;

    public C3109w40(Context context, QQ qq, QQ qq2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = qq;
        this.c = qq2;
        this.d = cls;
    }

    @Override // o.QQ
    public final boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC1376eG.v((Uri) obj);
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        Uri uri = (Uri) obj;
        return new PQ(new AV(uri), new C3012v40(this.a, this.b, this.c, uri, i, i2, fw, this.d));
    }
}
