package o;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public final class Tt0 extends AbstractC2342o80 implements InterfaceC0775Sy {
    public int m;
    public /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ View f544o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tt0(View view, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.f544o = view;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Tt0) o((Sb0) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        Tt0 tt0 = new Tt0(this.f544o, interfaceC0473Hh);
        tt0.n = obj;
        return tt0;
    }

    @Override // o.R7
    public final Object r(Object obj) {
        Object obj2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        View view = this.f544o;
        if (i == 0) {
            Jp0.O(obj);
            Sb0 sb0 = (Sb0) this.n;
            this.n = sb0;
            this.m = 1;
            sb0.c(view, this);
            return enumC1706hi;
        }
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (i == 1) {
            Sb0 sb1 = (Sb0) this.n;
            Jp0.O(obj);
            if (view instanceof ViewGroup) {
                this.n = null;
                this.m = 2;
                sb1.getClass();
                C2977um0 c2977um0 = new C2977um0(new G(3, (ViewGroup) view));
                if (c2977um0.m.hasNext()) {
                    sb1.n = c2977um0;
                    sb1.l = 2;
                    sb1.f516o = this;
                    obj2 = enumC1706hi;
                } else {
                    obj2 = c2985uq0;
                }
                if (obj2 != enumC1706hi) {
                    obj2 = c2985uq0;
                }
                if (obj2 == enumC1706hi) {
                    return enumC1706hi;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
        }
        return c2985uq0;
    }
}
