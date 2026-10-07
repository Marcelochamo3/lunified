package o;

import android.content.res.AssetManager;

/* JADX INFO: renamed from: o.f6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1460f6 implements RQ {
    public final /* synthetic */ int a;
    public final AssetManager b;

    public /* synthetic */ C1460f6(AssetManager assetManager, int i) {
        this.a = i;
        this.b = assetManager;
    }

    @Override // o.RQ
    public final QQ a(C1583gR c1583gR) {
        switch (this.a) {
            case 0:
                break;
        }
        return new C1558g6(this.b, 0, this);
    }

    public final InterfaceC1610gj b(AssetManager assetManager, String str) {
        switch (this.a) {
            case 0:
                return new C0641Nu(assetManager, str, 0);
            default:
                return new C0641Nu(assetManager, str, 1);
        }
    }
}
