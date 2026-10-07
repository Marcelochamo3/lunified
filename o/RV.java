package o;

/* JADX INFO: loaded from: classes.dex */
public final class RV implements RQ {
    public static volatile OV c;
    public final /* synthetic */ int a;
    public final Object b;

    public RV(OV ov) {
        this.a = 0;
        this.b = ov;
    }

    @Override // o.RQ
    public final QQ a(C1583gR c1583gR) {
        switch (this.a) {
            case 0:
                return new C1299da(3, (InterfaceC0595Ma) this.b);
            case 1:
                return new C1299da(1, (C0519Jb) this.b);
            default:
                return new C1862jE((C0334By) this.b);
        }
    }

    public RV(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new C0334By(18);
                break;
            default:
                this.b = new C0519Jb(8);
                break;
        }
    }
}
