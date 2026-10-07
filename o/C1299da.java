package o;

import java.io.File;

/* JADX INFO: renamed from: o.da, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1299da implements QQ {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ C1299da(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // o.QQ
    public final boolean a(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            case 2:
                return true;
            default:
                return true;
        }
    }

    @Override // o.QQ
    public final PQ b(Object obj, int i, int i2, FW fw) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new PQ(new AV(bArr), new RP(bArr, 1, (InterfaceC1201ca) this.b));
            case 1:
                return new PQ(new AV(obj), new C3067vj(0, obj.toString(), (C0519Jb) this.b));
            case 2:
                File file = (File) obj;
                return new PQ(new AV(file), new C3067vj(1, file, (InterfaceC0693Pu) this.b));
            default:
                C2151mA c2151mA = (C2151mA) obj;
                return new PQ(c2151mA, new QV((InterfaceC0595Ma) this.b, c2151mA));
        }
    }
}
