package o;

/* JADX INFO: renamed from: o.gG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1572gG extends AbstractC2245n80 {
    public int l;
    public final /* synthetic */ InterfaceC0775Sy m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1572gG(Object obj, InterfaceC0473Hh interfaceC0473Hh, InterfaceC0775Sy interfaceC0775Sy) {
        super(interfaceC0473Hh);
        this.m = interfaceC0775Sy;
        this.n = obj;
        AbstractC1474fG.h(interfaceC0473Hh, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @Override // o.R7
    public final Object r(Object obj) {
        int i = this.l;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
            this.l = 2;
            Jp0.O(obj);
            return obj;
        }
        this.l = 1;
        Jp0.O(obj);
        InterfaceC0775Sy interfaceC0775Sy = this.m;
        AbstractC1474fG.h(interfaceC0775Sy, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        Jp0.d(2, interfaceC0775Sy);
        return interfaceC0775Sy.i(this.n, this);
    }
}
