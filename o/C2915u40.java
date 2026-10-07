package o;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: o.u40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2915u40 implements RQ {
    public final Context a;
    public final Class b;

    public C2915u40(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // o.RQ
    public final QQ a(C1583gR c1583gR) {
        Class cls = this.b;
        return new C3109w40(this.a, c1583gR.k(File.class, cls), c1583gR.k(Uri.class, cls), cls);
    }
}
