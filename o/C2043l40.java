package o;

import android.app.Application;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o.l40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2043l40 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C2140m40 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f888o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2043l40(C2140m40 c2140m40, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c2140m40;
        this.f888o = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2043l40) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C2043l40(this.n, this.f888o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0067 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:10:0x0022, B:11:0x0027, B:12:0x002b, B:21:0x005d, B:23:0x0067, B:25:0x006b, B:28:0x0080, B:32:0x008c, B:34:0x0090, B:38:0x00b1, B:39:0x00c5, B:41:0x00cb, B:43:0x00d4, B:45:0x00de, B:46:0x00e2, B:47:0x00fa, B:49:0x0100, B:50:0x011b, B:18:0x0042), top: B:57:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:25:0x006b A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:10:0x0022, B:11:0x0027, B:12:0x002b, B:21:0x005d, B:23:0x0067, B:25:0x006b, B:28:0x0080, B:32:0x008c, B:34:0x0090, B:38:0x00b1, B:39:0x00c5, B:41:0x00cb, B:43:0x00d4, B:45:0x00de, B:46:0x00e2, B:47:0x00fa, B:49:0x0100, B:50:0x011b, B:18:0x0042), top: B:57:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:27:0x007e  */
    /* JADX WARN: Code duplicated, block: B:30:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:10:0x0022, B:11:0x0027, B:12:0x002b, B:21:0x005d, B:23:0x0067, B:25:0x006b, B:28:0x0080, B:32:0x008c, B:34:0x0090, B:38:0x00b1, B:39:0x00c5, B:41:0x00cb, B:43:0x00d4, B:45:0x00de, B:46:0x00e2, B:47:0x00fa, B:49:0x0100, B:50:0x011b, B:18:0x0042), top: B:57:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:10:0x0022, B:11:0x0027, B:12:0x002b, B:21:0x005d, B:23:0x0067, B:25:0x006b, B:28:0x0080, B:32:0x008c, B:34:0x0090, B:38:0x00b1, B:39:0x00c5, B:41:0x00cb, B:43:0x00d4, B:45:0x00de, B:46:0x00e2, B:47:0x00fa, B:49:0x0100, B:50:0x011b, B:18:0x0042), top: B:57:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00af A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:10:0x0022, B:11:0x0027, B:12:0x002b, B:21:0x005d, B:23:0x0067, B:25:0x006b, B:28:0x0080, B:32:0x008c, B:34:0x0090, B:38:0x00b1, B:39:0x00c5, B:41:0x00cb, B:43:0x00d4, B:45:0x00de, B:46:0x00e2, B:47:0x00fa, B:49:0x0100, B:50:0x011b, B:18:0x0042), top: B:57:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00d4 A[Catch: Exception -> 0x001f, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:10:0x0022, B:11:0x0027, B:12:0x002b, B:21:0x005d, B:23:0x0067, B:25:0x006b, B:28:0x0080, B:32:0x008c, B:34:0x0090, B:38:0x00b1, B:39:0x00c5, B:41:0x00cb, B:43:0x00d4, B:45:0x00de, B:46:0x00e2, B:47:0x00fa, B:49:0x0100, B:50:0x011b, B:18:0x0042), top: B:57:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0100 A[Catch: Exception -> 0x001f, LOOP:1: B:47:0x00fa->B:49:0x0100, LOOP_END, TryCatch #0 {Exception -> 0x001f, blocks: (B:7:0x001a, B:10:0x0022, B:11:0x0027, B:12:0x002b, B:21:0x005d, B:23:0x0067, B:25:0x006b, B:28:0x0080, B:32:0x008c, B:34:0x0090, B:38:0x00b1, B:39:0x00c5, B:41:0x00cb, B:43:0x00d4, B:45:0x00de, B:46:0x00e2, B:47:0x00fa, B:49:0x0100, B:50:0x011b, B:18:0x0042), top: B:57:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x013b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x00de A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) throws Throwable {
        AbstractC3151wc0 abstractC3151wc0;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str2;
        int i = 3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        C2140m40 c2140m40 = this.n;
        try {
            switch (i2) {
                case 0:
                    Jp0.O(obj);
                    C2771sg0 c2771sg0 = c2140m40.c;
                    C1653h40 c1653h40 = C1653h40.a;
                    this.m = 1;
                    c2771sg0.l(c1653h40, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    Ec0 ec0 = Ec0.a;
                    Application application = c2140m40.b;
                    AbstractC1474fG.h(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                    this.m = 2;
                    obj = AbstractC1376eG.J(AbstractC1910jn.b, new Cc0(application, true, null), this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    abstractC3151wc0 = (AbstractC3151wc0) obj;
                    if (!AbstractC1474fG.b(abstractC3151wc0, C2860tc0.a)) {
                        if (abstractC3151wc0 instanceof C3054vc0) {
                            C2771sg0 c2771sg1 = c2140m40.c;
                            str2 = ((C3054vc0) abstractC3151wc0).a;
                            AbstractC1474fG.j(str2, "message");
                            if (AbstractC1899jh0.O(str2)) {
                                str2 = "Tu cuenta ya no esta activa. Se cerro la sesion.";
                            }
                            C1751i40 c1751i40 = new C1751i40(str2);
                            this.m = 3;
                            c2771sg1.l(c1751i40, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                        if (abstractC3151wc0 instanceof C2957uc0) {
                            Throwable th = ((C2957uc0) abstractC3151wc0).b;
                            Ec0 ec1 = Ec0.a;
                            Ec0.b();
                            C2771sg0 c2771sg2 = c2140m40.c;
                            C1555g40 c1555g40 = new C1555g40(new IllegalStateException("No se pudo validar la sesión. Verifica tu conexión e intenta nuevamente."));
                            this.m = 4;
                            c2771sg2.l(c1555g40, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                    }
                    Q30.a.getClass();
                    ArrayList arrayListA = P30.a();
                    str = this.f888o;
                    arrayList = new ArrayList();
                    for (Object obj2 : arrayListA) {
                        Q30 q30 = (Q30) obj2;
                        if (str != null || AbstractC1474fG.b(q30.m(), str)) {
                            arrayList.add(obj2);
                        }
                    }
                    List<Q30> listR0 = AbstractC0911Ye.r0(arrayList, new C1749i30(i));
                    arrayList2 = new ArrayList(AbstractC1016af.O(listR0, 10));
                    for (Q30 q31 : listR0) {
                        arrayList2.add(new R30(q31.getName(), q31.f(), q31.m(), q31));
                    }
                    C2771sg0 c2771sg3 = c2140m40.c;
                    C1847j40 c1847j40 = new C1847j40(arrayList2);
                    this.m = 5;
                    c2771sg3.l(c1847j40, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 1:
                    Jp0.O(obj);
                    Ec0 ec2 = Ec0.a;
                    Application application2 = c2140m40.b;
                    AbstractC1474fG.h(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
                    this.m = 2;
                    obj = AbstractC1376eG.J(AbstractC1910jn.b, new Cc0(application2, true, null), this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    abstractC3151wc0 = (AbstractC3151wc0) obj;
                    if (!AbstractC1474fG.b(abstractC3151wc0, C2860tc0.a)) {
                        if (abstractC3151wc0 instanceof C3054vc0) {
                            C2771sg0 c2771sg4 = c2140m40.c;
                            str2 = ((C3054vc0) abstractC3151wc0).a;
                            AbstractC1474fG.j(str2, "message");
                            if (AbstractC1899jh0.O(str2)) {
                                str2 = "Tu cuenta ya no esta activa. Se cerro la sesion.";
                            }
                            C1751i40 c1751i41 = new C1751i40(str2);
                            this.m = 3;
                            c2771sg4.l(c1751i41, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                        if (abstractC3151wc0 instanceof C2957uc0) {
                            Throwable th2 = ((C2957uc0) abstractC3151wc0).b;
                            Ec0 ec3 = Ec0.a;
                            Ec0.b();
                            C2771sg0 c2771sg5 = c2140m40.c;
                            C1555g40 c1555g41 = new C1555g40(new IllegalStateException("No se pudo validar la sesión. Verifica tu conexión e intenta nuevamente."));
                            this.m = 4;
                            c2771sg5.l(c1555g41, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                    }
                    Q30.a.getClass();
                    ArrayList arrayListA2 = P30.a();
                    str = this.f888o;
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        Q30 q32 = (Q30) obj2;
                        if (str != null) {
                        }
                        arrayList.add(obj2);
                    }
                    List<Q30> listR1 = AbstractC0911Ye.r0(arrayList, new C1749i30(i));
                    arrayList2 = new ArrayList(AbstractC1016af.O(listR1, 10));
                    while (r10.hasNext()) {
                        arrayList2.add(new R30(q31.getName(), q31.f(), q31.m(), q31));
                    }
                    C2771sg0 c2771sg6 = c2140m40.c;
                    C1847j40 c1847j41 = new C1847j40(arrayList2);
                    this.m = 5;
                    c2771sg6.l(c1847j41, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 2:
                    Jp0.O(obj);
                    abstractC3151wc0 = (AbstractC3151wc0) obj;
                    if (!AbstractC1474fG.b(abstractC3151wc0, C2860tc0.a)) {
                        if (abstractC3151wc0 instanceof C3054vc0) {
                            C2771sg0 c2771sg7 = c2140m40.c;
                            str2 = ((C3054vc0) abstractC3151wc0).a;
                            AbstractC1474fG.j(str2, "message");
                            if (AbstractC1899jh0.O(str2)) {
                                str2 = "Tu cuenta ya no esta activa. Se cerro la sesion.";
                            }
                            C1751i40 c1751i42 = new C1751i40(str2);
                            this.m = 3;
                            c2771sg7.l(c1751i42, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                        if (abstractC3151wc0 instanceof C2957uc0) {
                            Throwable th3 = ((C2957uc0) abstractC3151wc0).b;
                            Ec0 ec4 = Ec0.a;
                            Ec0.b();
                            C2771sg0 c2771sg8 = c2140m40.c;
                            C1555g40 c1555g42 = new C1555g40(new IllegalStateException("No se pudo validar la sesión. Verifica tu conexión e intenta nuevamente."));
                            this.m = 4;
                            c2771sg8.l(c1555g42, this);
                            if (c2985uq0 == enumC1706hi) {
                                return enumC1706hi;
                            }
                            return c2985uq0;
                        }
                    }
                    Q30.a.getClass();
                    ArrayList arrayListA3 = P30.a();
                    str = this.f888o;
                    arrayList = new ArrayList();
                    while (r10.hasNext()) {
                        Q30 q33 = (Q30) obj2;
                        if (str != null) {
                        }
                        arrayList.add(obj2);
                    }
                    List<Q30> listR2 = AbstractC0911Ye.r0(arrayList, new C1749i30(i));
                    arrayList2 = new ArrayList(AbstractC1016af.O(listR2, 10));
                    while (r10.hasNext()) {
                        arrayList2.add(new R30(q31.getName(), q31.f(), q31.m(), q31));
                    }
                    C2771sg0 c2771sg9 = c2140m40.c;
                    C1847j40 c1847j42 = new C1847j40(arrayList2);
                    this.m = 5;
                    c2771sg9.l(c1847j42, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return c2985uq0;
                case 3:
                    Jp0.O(obj);
                    return c2985uq0;
                case 4:
                    Jp0.O(obj);
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
            C2771sg0 c2771sg10 = c2140m40.c;
            C1555g40 c1555g43 = new C1555g40(e);
            this.m = 6;
            c2771sg10.l(c1555g43, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
