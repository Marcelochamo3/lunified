package o;

/* JADX INFO: loaded from: classes.dex */
public final class Nl0 extends AbstractC2799su0 {
    public final /* synthetic */ int a;
    public boolean b;
    public int c;
    public final /* synthetic */ Object d;

    public Nl0(Ol0 ol0, int i) {
        this.a = 0;
        this.d = ol0;
        this.c = i;
        this.b = false;
    }

    @Override // o.InterfaceC2702ru0
    public final void a() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((Ol0) this.d).a.setVisibility(this.c);
                }
                break;
            default:
                int i = this.c + 1;
                this.c = i;
                C2606qu0 c2606qu0 = (C2606qu0) this.d;
                if (i == c2606qu0.a.size()) {
                    InterfaceC2702ru0 interfaceC2702ru0 = c2606qu0.d;
                    if (interfaceC2702ru0 != null) {
                        interfaceC2702ru0.a();
                    }
                    this.c = 0;
                    this.b = false;
                    c2606qu0.e = false;
                }
                break;
        }
    }

    @Override // o.AbstractC2799su0, o.InterfaceC2702ru0
    public void b() {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
        }
    }

    @Override // o.AbstractC2799su0, o.InterfaceC2702ru0
    public final void c() {
        switch (this.a) {
            case 0:
                ((Ol0) this.d).a.setVisibility(0);
                break;
            default:
                if (!this.b) {
                    this.b = true;
                    InterfaceC2702ru0 interfaceC2702ru0 = ((C2606qu0) this.d).d;
                    if (interfaceC2702ru0 != null) {
                        interfaceC2702ru0.c();
                    }
                    break;
                }
                break;
        }
    }

    public Nl0(C2606qu0 c2606qu0) {
        this.a = 1;
        this.d = c2606qu0;
        this.b = false;
        this.c = 0;
    }
}
