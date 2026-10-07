package o;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: renamed from: o.wr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3181wr0 implements RQ {
    public final /* synthetic */ int a;
    public final ContentResolver b;

    public /* synthetic */ C3181wr0(ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = contentResolver;
    }

    @Override // o.RQ
    public final QQ a(C1583gR c1583gR) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return new C3278xr0(this);
    }

    public final InterfaceC1610gj b(Uri uri) {
        switch (this.a) {
            case 0:
                return new C1265d6(this.b, uri, 0);
            case 1:
                return new C1265d6(this.b, uri, 1);
            default:
                return new Dg0(1, uri, this.b);
        }
    }
}
