package o;

/* JADX INFO: loaded from: classes.dex */
public final class Hm0 extends Dm0 {
    public final /* synthetic */ int a;
    public Cm0 b;

    public /* synthetic */ Hm0() {
        this.a = 1;
    }

    @Override // o.Dm0, o.Bm0
    public void a(Cm0 cm0) {
        switch (this.a) {
            case 0:
                Im0 im0 = (Im0) this.b;
                im0.O.remove(cm0);
                if (!im0.w()) {
                    im0.B(im0, C1306dd0.f739o, false);
                    im0.C = true;
                    im0.B(im0, C1306dd0.n, false);
                }
                break;
        }
    }

    @Override // o.Dm0, o.Bm0
    public void f(Cm0 cm0) {
        switch (this.a) {
            case 1:
                Im0 im0 = (Im0) this.b;
                int i = im0.Q - 1;
                im0.Q = i;
                if (i == 0) {
                    im0.R = false;
                    im0.q();
                }
                cm0.E(this);
                break;
            case 2:
                this.b.H();
                cm0.E(this);
                break;
        }
    }

    @Override // o.Dm0, o.Bm0
    public void g(Cm0 cm0) {
        switch (this.a) {
            case 1:
                Im0 im0 = (Im0) this.b;
                if (!im0.R) {
                    im0.P();
                    im0.R = true;
                }
                break;
        }
    }

    public /* synthetic */ Hm0(Cm0 cm0, int i) {
        this.a = i;
        this.b = cm0;
    }
}
