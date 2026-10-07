package o;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: renamed from: o.kN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1969kN extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C2067lN n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Context f864o;
    public final /* synthetic */ File p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1969kN(C2067lN c2067lN, Context context, File file, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c2067lN;
        this.f864o = context;
        this.p = file;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1969kN) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1969kN(this.n, this.f864o, this.p, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C2067lN c2067lN = this.n;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return c2985uq0;
            }
            Jp0.O(obj);
            C2771sg0 c2771sg0 = c2067lN.b;
            C1383eN c1383eN = C1383eN.a;
            this.m = 1;
            c2771sg0.l(c1383eN, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            C2834tF c2834tF = C2834tF.a;
            Context context = this.f864o;
            Uri uriFromFile = Uri.fromFile(this.p);
            AbstractC1474fG.i(uriFromFile, "fromFile(...)");
            C2834tF.j(context, uriFromFile);
        } catch (Exception e) {
            C2771sg0 c2771sg1 = c2067lN.b;
            C1286dN c1286dN = new C1286dN(e);
            this.m = 2;
            c2771sg1.l(c1286dN, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
        return c2985uq0;
    }
}
