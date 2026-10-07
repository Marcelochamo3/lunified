package o;

import com.skidush.clonex.models.Video$Type;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class U10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ Video$Type n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z10 f548o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U10(Video$Type video$Type, Z10 z10, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = video$Type;
        this.f548o = z10;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((U10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new U10(this.n, this.f548o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0025, B:51:0x00ec, B:52:0x00ee, B:11:0x002a, B:45:0x00d2, B:40:0x00a4, B:42:0x00a8, B:46:0x00d5, B:48:0x00d9, B:55:0x0112, B:56:0x0117), top: B:61:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00d5 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0025, B:51:0x00ec, B:52:0x00ee, B:11:0x002a, B:45:0x00d2, B:40:0x00a4, B:42:0x00a8, B:46:0x00d5, B:48:0x00d9, B:55:0x0112, B:56:0x0117), top: B:61:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0025, B:51:0x00ec, B:52:0x00ee, B:11:0x002a, B:45:0x00d2, B:40:0x00a4, B:42:0x00a8, B:46:0x00d5, B:48:0x00d9, B:55:0x0112, B:56:0x0117), top: B:61:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0111 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x0112 A[Catch: Exception -> 0x0022, TryCatch #0 {Exception -> 0x0022, blocks: (B:7:0x001d, B:10:0x0025, B:51:0x00ec, B:52:0x00ee, B:11:0x002a, B:45:0x00d2, B:40:0x00a4, B:42:0x00a8, B:46:0x00d5, B:48:0x00d9, B:55:0x0112, B:56:0x0117), top: B:61:0x000d }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0129 A[RETURN] */
    @Override // o.R7
    public final Object r(Object obj) {
        List list;
        I9 i9;
        M10 m10;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        Video$Type video$Type = this.n;
        Z10 z10 = this.f548o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    if (video$Type instanceof Is0) {
                        String str = ((Is0) video$Type).l;
                        if (AbstractC1899jh0.U(str, "tv-", false) || AbstractC1899jh0.U(str, "claroar-", false) || AbstractC1899jh0.U(str, "claroandina-", false) || AbstractC1899jh0.U(str, "tigo-", false) || AbstractC1899jh0.U(str, "claro-", false) || AbstractC1899jh0.U(str, "fctvevent-", false) || AbstractC1899jh0.U(str, "ppv-", false) || AbstractC1899jh0.U(str, "ak47-", false)) {
                            I9 i10 = z10.e;
                            M10 m11 = new M10(C1233cq.l);
                            this.m = 1;
                            return i10.e(m11, this) == enumC1706hi ? enumC1706hi : c2985uq0;
                        }
                    }
                    I9 i11 = z10.e;
                    I10 i12 = I10.a;
                    this.m = 2;
                    if (i11.e(i12, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    if (video$Type instanceof Hs0) {
                        Rh0 rh0 = AW.a;
                        String str2 = ((Hs0) video$Type).p.m;
                        Integer num = new Integer(((Hs0) video$Type).q.l);
                        Integer num2 = new Integer(((Hs0) video$Type).m);
                        this.m = 3;
                        obj = AW.b(str2, num, num2, this, 17);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list = (List) obj;
                        List listR0 = AbstractC0911Ye.r0(list, new C0419Ff(0, new InterfaceC0412Ey[]{C1182cH.P, C1182cH.Q}));
                        i9 = z10.e;
                        m10 = new M10(listR0);
                        this.m = 5;
                        if (i9.e(m10, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return c2985uq0;
                    }
                    if (video$Type instanceof Is0) {
                        throw new C0730Rf();
                    }
                    Rh0 rh1 = AW.a;
                    String str3 = ((Is0) video$Type).m;
                    this.m = 4;
                    obj = AW.b(str3, null, null, this, 29);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    List listR1 = AbstractC0911Ye.r0(list, new C0419Ff(0, new InterfaceC0412Ey[]{C1182cH.P, C1182cH.Q}));
                    i9 = z10.e;
                    m10 = new M10(listR1);
                    this.m = 5;
                    if (i9.e(m10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 1:
                    Jp0.O(obj);
                case 2:
                    Jp0.O(obj);
                    if (video$Type instanceof Hs0) {
                        Rh0 rh2 = AW.a;
                        String str4 = ((Hs0) video$Type).p.m;
                        Integer num3 = new Integer(((Hs0) video$Type).q.l);
                        Integer num4 = new Integer(((Hs0) video$Type).m);
                        this.m = 3;
                        obj = AW.b(str4, num3, num4, this, 17);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        list = (List) obj;
                        List listR2 = AbstractC0911Ye.r0(list, new C0419Ff(0, new InterfaceC0412Ey[]{C1182cH.P, C1182cH.Q}));
                        i9 = z10.e;
                        m10 = new M10(listR2);
                        this.m = 5;
                        if (i9.e(m10, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return c2985uq0;
                    }
                    if (video$Type instanceof Is0) {
                        throw new C0730Rf();
                    }
                    Rh0 rh3 = AW.a;
                    String str5 = ((Is0) video$Type).m;
                    this.m = 4;
                    obj = AW.b(str5, null, null, this, 29);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    List listR3 = AbstractC0911Ye.r0(list, new C0419Ff(0, new InterfaceC0412Ey[]{C1182cH.P, C1182cH.Q}));
                    i9 = z10.e;
                    m10 = new M10(listR3);
                    this.m = 5;
                    if (i9.e(m10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    Jp0.O(obj);
                    list = (List) obj;
                    List listR4 = AbstractC0911Ye.r0(list, new C0419Ff(0, new InterfaceC0412Ey[]{C1182cH.P, C1182cH.Q}));
                    i9 = z10.e;
                    m10 = new M10(listR4);
                    this.m = 5;
                    if (i9.e(m10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 4:
                    Jp0.O(obj);
                    list = (List) obj;
                    List listR5 = AbstractC0911Ye.r0(list, new C0419Ff(0, new InterfaceC0412Ey[]{C1182cH.P, C1182cH.Q}));
                    i9 = z10.e;
                    m10 = new M10(listR5);
                    this.m = 5;
                    if (i9.e(m10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 5:
                    Jp0.O(obj);
                    return c2985uq0;
                case 6:
                    Jp0.O(obj);
                    return c2985uq0;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            I9 i13 = z10.e;
            F10 f10 = new F10(e);
            this.m = 6;
            if (i13.e(f10, this) == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
