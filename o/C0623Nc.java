package o;

/* JADX INFO: renamed from: o.Nc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0623Nc implements InterfaceC1734hw {
    public final /* synthetic */ IF l;
    public final /* synthetic */ InterfaceC1608gi m;
    public final /* synthetic */ C0675Pc n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1734hw f415o;

    public C0623Nc(IF r1, InterfaceC1608gi interfaceC1608gi, C0675Pc c0675Pc, InterfaceC1734hw interfaceC1734hw) {
        this.l = r1;
        this.m = interfaceC1608gi;
        this.n = c0675Pc;
        this.f415o = interfaceC1734hw;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // o.InterfaceC1734hw
    public final Object l(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C0597Mc c0597Mc;
        C0623Nc c0623Nc;
        if (interfaceC0473Hh instanceof C0597Mc) {
            c0597Mc = (C0597Mc) interfaceC0473Hh;
            int i = c0597Mc.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0597Mc.p = i - Integer.MIN_VALUE;
            } else {
                c0597Mc = new C0597Mc(this, interfaceC0473Hh);
            }
        } else {
            c0597Mc = new C0597Mc(this, interfaceC0473Hh);
        }
        Object obj2 = c0597Mc.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0597Mc.p;
        if (i2 == 0) {
            Jp0.O(obj2);
            AH ah = (AH) this.l.m;
            if (ah != null) {
                ah.f(new C1696hd("Child of the scoped flow was cancelled"));
                c0597Mc.l = this;
                c0597Mc.m = obj;
                c0597Mc.getClass();
                c0597Mc.p = 1;
                if (((JH) ah).W(c0597Mc) == enumC1706hi) {
                    return enumC1706hi;
                }
            }
            c0623Nc = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = c0597Mc.m;
            c0623Nc = c0597Mc.l;
            Jp0.O(obj2);
        }
        c0623Nc.l.m = AbstractC1376eG.w(c0623Nc.m, null, 4, new C0572Lc(c0623Nc.n, c0623Nc.f415o, obj, null), 1);
        return C2985uq0.a;
    }
}
