package o;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Ib0 {
    public final /* synthetic */ int a;
    public final List b;
    public final InterfaceC1324dm0[] c;

    public Ib0(int i, List list) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = list;
                this.c = new InterfaceC1324dm0[list.size()];
                break;
            default:
                this.b = list;
                this.c = new InterfaceC1324dm0[list.size()];
                break;
        }
    }

    public void a(long j, C2562qX c2562qX) {
        if (c2562qX.a() < 9) {
            return;
        }
        int iG = c2562qX.g();
        int iG2 = c2562qX.g();
        int iU = c2562qX.u();
        if (iG == 434 && iG2 == 1195456820 && iU == 3) {
            Sr0.d(j, c2562qX, this.c);
        }
    }

    public final void b(InterfaceC0354Cs interfaceC0354Cs, Ym0 ym0) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    InterfaceC1324dm0[] interfaceC1324dm0Arr = this.c;
                    if (i < interfaceC1324dm0Arr.length) {
                        ym0.a();
                        ym0.b();
                        InterfaceC1324dm0 interfaceC1324dm0S = interfaceC0354Cs.s(ym0.d, 3);
                        C0643Nw c0643Nw = (C0643Nw) this.b.get(i);
                        String str = c0643Nw.w;
                        AbstractC0397Ej.b("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
                        String str2 = c0643Nw.l;
                        if (str2 == null) {
                            ym0.b();
                            str2 = ym0.e;
                        }
                        C0617Mw c0617Mw = new C0617Mw();
                        c0617Mw.a = str2;
                        c0617Mw.k = str;
                        c0617Mw.d = c0643Nw.f421o;
                        c0617Mw.c = c0643Nw.n;
                        c0617Mw.C = c0643Nw.O;
                        c0617Mw.m = c0643Nw.y;
                        interfaceC1324dm0S.a(new C0643Nw(c0617Mw));
                        interfaceC1324dm0Arr[i] = interfaceC1324dm0S;
                        i++;
                    }
                    break;
                }
                break;
            default:
                int i2 = 0;
                while (true) {
                    InterfaceC1324dm0[] interfaceC1324dm0Arr2 = this.c;
                    if (i2 < interfaceC1324dm0Arr2.length) {
                        ym0.a();
                        ym0.b();
                        InterfaceC1324dm0 interfaceC1324dm0S2 = interfaceC0354Cs.s(ym0.d, 3);
                        C0643Nw c0643Nw2 = (C0643Nw) this.b.get(i2);
                        String str3 = c0643Nw2.w;
                        AbstractC0397Ej.b("Invalid closed caption MIME type provided: " + str3, "application/cea-608".equals(str3) || "application/cea-708".equals(str3));
                        C0617Mw c0617Mw2 = new C0617Mw();
                        ym0.b();
                        c0617Mw2.a = ym0.e;
                        c0617Mw2.k = str3;
                        c0617Mw2.d = c0643Nw2.f421o;
                        c0617Mw2.c = c0643Nw2.n;
                        c0617Mw2.C = c0643Nw2.O;
                        c0617Mw2.m = c0643Nw2.y;
                        interfaceC1324dm0S2.a(new C0643Nw(c0617Mw2));
                        interfaceC1324dm0Arr2[i2] = interfaceC1324dm0S2;
                        i2++;
                    }
                    break;
                }
                break;
        }
    }
}
