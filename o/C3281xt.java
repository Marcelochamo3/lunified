package o;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: o.xt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3281xt extends Ph0 implements InterfaceC0775Sy {
    public Jb0 m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1125o;
    public final /* synthetic */ Jb0 p;
    public final /* synthetic */ C3184wt q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3281xt(Jb0 jb0, C3184wt c3184wt, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.p = jb0;
        this.q = c3184wt;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3281xt) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3281xt(this.p, this.q, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        C3184wt c3184wt;
        Mb0 mb0;
        Jb0 jb0;
        Jb0 jb1;
        Throwable th;
        int i;
        C3087vt c3087vt;
        int size;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = this.f1125o;
        try {
            if (i2 == 0) {
                Jp0.O(obj);
                Jb0 jb2 = this.p;
                this.m = jb2;
                c3184wt = this.q;
                this.n = c3184wt;
                this.f1125o = 1;
                mb0 = (Mb0) jb2;
                if (mb0.a(this) == enumC1706hi) {
                    jb0 = mb0;
                    return enumC1706hi;
                }
            } else {
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c3087vt = (C3087vt) this.n;
                    jb1 = this.m;
                    try {
                        Jp0.O(obj);
                        jb1 = jb1;
                        C1101bX c1101bX = new C1101bX(c3087vt, obj);
                        ((Mb0) jb1).c();
                        return c1101bX;
                    } catch (Throwable th2) {
                        th = th2;
                        ((Mb0) jb1).c();
                        throw th;
                    }
                }
                c3184wt = (C3184wt) this.n;
                Jb0 jb3 = this.m;
                Jp0.O(obj);
                jb0 = jb3;
            }
            jb0 = mb0;
            I60 i60 = C0329Bt.c;
            String str = c3184wt.a;
            if (!i60.d(str) || 1 > (i = c3184wt.b) || i >= 1001) {
                throw new IllegalArgumentException("Solicitud de playlist inválida".toString());
            }
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, "https://watch.fanatiz.com/api/generic/playlists");
            C2349oE c2349oEF = c2349oE.b().f();
            c2349oEF.a("id", str);
            c2349oEF.a("page", String.valueOf(i));
            for (Map.Entry entry : c3184wt.c.entrySet()) {
                String str2 = (String) entry.getKey();
                List<String> list = (List) entry.getValue();
                if (!C0329Bt.d.contains(str2) || 1 > (size = list.size()) || size >= 21) {
                    throw new IllegalArgumentException("Parámetro de playlist inválido".toString());
                }
                for (String str3 : list) {
                    if (!(!AbstractC1899jh0.O(str3)) || str3.length() > 256 || AbstractC1119bh0.X(str3, '\r') || AbstractC1119bh0.X(str3, '\n')) {
                        throw new IllegalArgumentException("Valor de playlist inválido".toString());
                    }
                    c2349oEF.a(str2, str3);
                }
            }
            C2446pE c2446pEB = c2349oEF.b();
            C3087vt c3087vt2 = new C3087vt(str, i);
            C0560Kq c0560Kq = new C0560Kq();
            c0560Kq.m = c2446pEB;
            c0560Kq.d();
            C1951k70 c1951k70C = c0560Kq.c();
            this.m = jb0;
            this.n = c3087vt2;
            this.f1125o = 2;
            Object objJ = AbstractC1376eG.J(AbstractC1910jn.b, new C0485Ht(c1951k70C, "playlist", null), this);
            if (objJ == enumC1706hi) {
                return enumC1706hi;
            }
            c3087vt = c3087vt2;
            jb1 = jb0;
            obj = objJ;
            C1101bX c1101bX2 = new C1101bX(c3087vt, obj);
            ((Mb0) jb1).c();
            return c1101bX2;
        } catch (Throwable th3) {
            jb1 = jb0;
            th = th3;
            ((Mb0) jb1).c();
            throw th;
        }
    }
}
