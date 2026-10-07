package o;

import java.io.File;

/* JADX INFO: renamed from: o.wq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3179wq0 implements QQ {
    public static final C3179wq0 b = new C3179wq0(0);
    public final /* synthetic */ int a;

    public /* synthetic */ C3179wq0(int i) {
        this.a = i;
    }

    @Override // o.QQ
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        switch (this.a) {
            case 0:
                return new PQ(new AV(obj), new C1690ha(1, obj));
            case 1:
                File file = (File) obj;
                return new PQ(new AV(file), new C1690ha(0, file));
            default:
                return null;
        }
    }
}
