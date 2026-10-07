package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.sx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2805sx0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f1035o;
    public final /* synthetic */ String p;
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2805sx0(int i, String str, String str2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f1035o = str;
        this.p = str2;
        this.q = i;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2805sx0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C2805sx0 c2805sx0 = new C2805sx0(this.q, this.f1035o, this.p, interfaceC0473Hh);
        c2805sx0.n = obj;
        return c2805sx0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        if (i == 0) {
            Jp0.O(obj);
            InterfaceC1608gi interfaceC1608gi = (InterfaceC1608gi) this.n;
            List<String> listK = AbstractC0937Ze.K("movies", "series");
            ArrayList arrayList = new ArrayList(AbstractC1016af.O(listK, 10));
            for (String str : listK) {
                arrayList.add(AbstractC1376eG.c(interfaceC1608gi, AbstractC1910jn.b, 0, new C2708rx0(str, this.f1035o, this.p, this.q, null), 2));
            }
            this.m = 1;
            obj = AbstractC1370eA.b(arrayList, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return AbstractC1016af.P((Iterable) obj);
    }
}
