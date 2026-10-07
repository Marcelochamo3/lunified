package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.Ht, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0485Ht extends Ph0 implements InterfaceC0775Sy {
    public C0459Gt m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C1951k70 f313o;
    public final /* synthetic */ String p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0485Ht(C1951k70 c1951k70, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f313o = c1951k70;
        this.p = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C0485Ht) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C0485Ht(this.f313o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws IOException {
        C0459Gt c0459Gt;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        C2691rp c2691rp = C2691rp.s;
        String str = this.p;
        C1951k70 c1951k70 = this.f313o;
        if (i != 0) {
            if (i == 1) {
                Jp0.O(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0459Gt = this.m;
                Jp0.O(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                return C2691rp.k(c1951k70, str);
            }
            throw c0459Gt;
        }
        Jp0.O(obj);
        C3084vr0 c3084vr0 = C3084vr0.a;
        this.n = 1;
        obj = c3084vr0.j(false, this);
        if (obj == enumC1706hi) {
            return enumC1706hi;
        }
        if (!((Boolean) obj).booleanValue()) {
            throw new IOException("No se pudo activar la salida de Estados Unidos");
        }
        try {
            return C2691rp.k(c1951k70, str);
        } catch (C0459Gt e) {
            if (e.l != 407) {
                throw e;
            }
            c2691rp.o();
            C3084vr0 c3084vr1 = C3084vr0.a;
            this.m = e;
            this.n = 2;
            Object objJ = c3084vr1.j(true, this);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
            c0459Gt = e;
            obj = objJ;
        }
    }
}
