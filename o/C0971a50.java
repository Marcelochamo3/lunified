package o;

/* JADX INFO: renamed from: o.a50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0971a50 extends C1292dT {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0971a50(int i) {
        super(1, false);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    @Override // o.C1292dT, o.AbstractC3473zs
    public Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        Z40 z40;
        switch (this.c) {
            case 0:
                if (interfaceC0473Hh instanceof Z40) {
                    z40 = (Z40) interfaceC0473Hh;
                    int i = z40.f651o;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        z40.f651o = i - Integer.MIN_VALUE;
                    } else {
                        z40 = new Z40(this, interfaceC0473Hh);
                    }
                } else {
                    z40 = new Z40(this, interfaceC0473Hh);
                }
                Object objA = z40.m;
                EnumC1706hi enumC1706hi = EnumC1706hi.l;
                int i2 = z40.f651o;
                if (i2 == 0) {
                    Jp0.O(objA);
                    InterfaceC1557g50.a.getClass();
                    InterfaceC1557g50 interfaceC1557g50A = C1069b50.a("https://megacloud.tv");
                    String strB0 = AbstractC1119bh0.B0(AbstractC1119bh0.z0(str, "/"), "?");
                    z40.l = this;
                    z40.f651o = 1;
                    objA = interfaceC1557g50A.a("https://megacloud.tv/embed-2/ajax/e-1/getSources", strB0, "https://megacloud.tv", z40);
                    if (objA == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1674hK.w(z40.l);
                        Jp0.O(objA);
                        C1101bX c1101bX = (C1101bX) objA;
                        throw null;
                    }
                    Jp0.O(objA);
                }
                AbstractC1674hK.w(objA);
                throw new C0730Rf();
            default:
                return super.a(str, interfaceC0473Hh);
        }
    }

    @Override // o.C1292dT, o.AbstractC3473zs
    public final String c() {
        switch (this.c) {
            case 0:
                return "https://megacloud.tv";
            default:
                return "https://dokicloud.one";
        }
    }

    @Override // o.C1292dT, o.AbstractC3473zs
    public final String d() {
        switch (this.c) {
            case 0:
                return "Megacloud";
            default:
                return "Dokicloud";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0971a50(boolean z) {
        super(1, z);
        this.c = 1;
    }
}
