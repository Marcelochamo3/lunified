package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.fo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1523fo0 extends Ph0 implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1608gi f784o;
    public final /* synthetic */ IF p;
    public final /* synthetic */ String q;
    public final /* synthetic */ byte[] r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1523fo0(InterfaceC1608gi interfaceC1608gi, IF r2, String str, byte[] bArr, String str2, InterfaceC0473Hh interfaceC0473Hh, int i) {
        super(1, interfaceC0473Hh);
        this.m = i;
        this.f784o = interfaceC1608gi;
        this.p = r2;
        this.q = str;
        this.r = bArr;
        this.s = str2;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                byte[] bArr = this.r;
                String str = this.s;
                return new C1523fo0(this.f784o, this.p, this.q, bArr, str, (InterfaceC0473Hh) obj, 0).r(C2985uq0.a);
            default:
                byte[] bArr2 = this.r;
                String str2 = this.s;
                return new C1523fo0(this.f784o, this.p, this.q, bArr2, str2, (InterfaceC0473Hh) obj, 1).r(C2985uq0.a);
        }
    }

    @Override // o.R7
    public final Object r(Object obj) throws IOException {
        Object objW;
        char c;
        Object objW2;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        switch (this.m) {
            case 0:
                int i = this.n;
                if (i == 0) {
                    Jp0.O(obj);
                    C1791ib0 c1791ib0 = C1791ib0.a;
                    OV ovD = C1791ib0.d(false);
                    this.n = 1;
                    objW = C1621go0.w(this.p, this.q, this.r, this.s, ovD, this);
                    if (objW == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                    objW = obj;
                }
                Wg0 wg0 = (Wg0) objW;
                boolean zContains = Lc0.T(new Integer(403), new Integer(407), new Integer(408), new Integer(451)).contains(new Integer(wg0.a));
                int i2 = wg0.a;
                if (zContains || i2 >= 500) {
                    throw new IOException(AbstractC1674hK.p("API de catálogo bloqueada (HTTP ", i2, ")"));
                }
                return wg0;
            default:
                int i3 = this.n;
                if (i3 == 0) {
                    Jp0.O(obj);
                    OV ovC = C1791ib0.a.c();
                    this.n = 1;
                    c = 1;
                    objW2 = C1621go0.w(this.p, this.q, this.r, this.s, ovC, this);
                    if (objW2 == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                    objW2 = obj;
                    c = 1;
                }
                Wg0 wg1 = (Wg0) objW2;
                Integer num = new Integer(403);
                Integer num2 = new Integer(407);
                Integer num3 = new Integer(408);
                Integer num4 = new Integer(451);
                Integer[] numArr = new Integer[4];
                numArr[0] = num;
                numArr[c] = num2;
                numArr[2] = num3;
                numArr[3] = num4;
                boolean zContains2 = Lc0.T(numArr).contains(new Integer(wg1.a));
                int i4 = wg1.a;
                if (zContains2 || i4 >= 500) {
                    throw new IOException(AbstractC1674hK.p("Túnel de catálogo bloqueado (HTTP ", i4, ")"));
                }
                return wg1;
        }
    }
}
