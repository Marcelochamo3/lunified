package o;

/* JADX INFO: renamed from: o.Xa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0881Xa extends AbstractC0520Jc {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0775Sy f617o;

    public C0881Xa(C2026kw c2026kw) {
        super(C1038aq.l, -2, 1);
        this.f617o = c2026kw;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.AbstractC0520Jc
    public final Object c(InterfaceC2622r30 interfaceC2622r30, InterfaceC0473Hh interfaceC0473Hh) {
        C0855Wa c0855Wa;
        if (interfaceC0473Hh instanceof C0855Wa) {
            c0855Wa = (C0855Wa) interfaceC0473Hh;
            int i = c0855Wa.f596o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0855Wa.f596o = i - Integer.MIN_VALUE;
            } else {
                c0855Wa = new C0855Wa(this, interfaceC0473Hh);
            }
        } else {
            c0855Wa = new C0855Wa(this, interfaceC0473Hh);
        }
        Object obj = c0855Wa.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0855Wa.f596o;
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (i2 == 0) {
            Jp0.O(obj);
            c0855Wa.l = interfaceC2622r30;
            c0855Wa.f596o = 1;
            Object objI = this.f617o.i(interfaceC2622r30, c0855Wa);
            if (objI != enumC1706hi) {
                objI = c2985uq0;
            }
            if (objI == enumC1706hi) {
                return enumC1706hi;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2622r30 = c0855Wa.l;
            Jp0.O(obj);
        }
        if (((C2526q30) interfaceC2622r30).f986o.r()) {
            return c2985uq0;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override // o.AbstractC0520Jc
    public final String toString() {
        return "block[" + this.f617o + "] -> " + super.toString();
    }
}
