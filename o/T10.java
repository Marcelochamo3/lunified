package o;

import com.skidush.clonex.models.Video$Type;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class T10 extends Ph0 implements InterfaceC0775Sy {
    public Q30 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Z10 f525o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Video$Type q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T10(Z10 z10, String str, Video$Type video$Type, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f525o = z10;
        this.p = str;
        this.q = video$Type;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((T10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new T10(this.f525o, this.p, this.q, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0062 A[Catch: Exception -> 0x0021, CancellationException -> 0x0024, TryCatch #2 {CancellationException -> 0x0024, Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0027, B:53:0x00c3, B:55:0x00ce, B:58:0x00df, B:59:0x00e6, B:15:0x002e, B:50:0x00b5, B:18:0x0035, B:47:0x00a9, B:21:0x003c, B:44:0x009d, B:27:0x0054, B:29:0x0062, B:41:0x0091, B:30:0x0066, B:31:0x0071, B:33:0x0077, B:37:0x008a, B:39:0x008e), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0066 A[Catch: Exception -> 0x0021, CancellationException -> 0x0024, TryCatch #2 {CancellationException -> 0x0024, Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0027, B:53:0x00c3, B:55:0x00ce, B:58:0x00df, B:59:0x00e6, B:15:0x002e, B:50:0x00b5, B:18:0x0035, B:47:0x00a9, B:21:0x003c, B:44:0x009d, B:27:0x0054, B:29:0x0062, B:41:0x0091, B:30:0x0066, B:31:0x0071, B:33:0x0077, B:37:0x008a, B:39:0x008e), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: Exception -> 0x0021, CancellationException -> 0x0024, TryCatch #2 {CancellationException -> 0x0024, Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0027, B:53:0x00c3, B:55:0x00ce, B:58:0x00df, B:59:0x00e6, B:15:0x002e, B:50:0x00b5, B:18:0x0035, B:47:0x00a9, B:21:0x003c, B:44:0x009d, B:27:0x0054, B:29:0x0062, B:41:0x0091, B:30:0x0066, B:31:0x0071, B:33:0x0077, B:37:0x008a, B:39:0x008e), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:39:0x008e A[Catch: Exception -> 0x0021, CancellationException -> 0x0024, TryCatch #2 {CancellationException -> 0x0024, Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0027, B:53:0x00c3, B:55:0x00ce, B:58:0x00df, B:59:0x00e6, B:15:0x002e, B:50:0x00b5, B:18:0x0035, B:47:0x00a9, B:21:0x003c, B:44:0x009d, B:27:0x0054, B:29:0x0062, B:41:0x0091, B:30:0x0066, B:31:0x0071, B:33:0x0077, B:37:0x008a, B:39:0x008e), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:43:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce A[Catch: Exception -> 0x0021, CancellationException -> 0x0024, TryCatch #2 {CancellationException -> 0x0024, Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0027, B:53:0x00c3, B:55:0x00ce, B:58:0x00df, B:59:0x00e6, B:15:0x002e, B:50:0x00b5, B:18:0x0035, B:47:0x00a9, B:21:0x003c, B:44:0x009d, B:27:0x0054, B:29:0x0062, B:41:0x0091, B:30:0x0066, B:31:0x0071, B:33:0x0077, B:37:0x008a, B:39:0x008e), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00de A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x00df A[Catch: Exception -> 0x0021, CancellationException -> 0x0024, TryCatch #2 {CancellationException -> 0x0024, Exception -> 0x0021, blocks: (B:7:0x001c, B:12:0x0027, B:53:0x00c3, B:55:0x00ce, B:58:0x00df, B:59:0x00e6, B:15:0x002e, B:50:0x00b5, B:18:0x0035, B:47:0x00a9, B:21:0x003c, B:44:0x009d, B:27:0x0054, B:29:0x0062, B:41:0x0091, B:30:0x0066, B:31:0x0071, B:33:0x0077, B:37:0x008a, B:39:0x008e), top: B:66:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0089 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        List list;
        I9 i9;
        L10 l10;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        O9 o9 = O9.x;
        String str = this.p;
        Z10 z10 = this.f525o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    I9 i10 = z10.e;
                    H10 h10 = H10.a;
                    this.n = 1;
                    if (i10.e(h10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    strB = Cr0.m.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q31 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            q30 = (Q30) next;
                            if (q30 == null) {
                                q30 = C1816io0.b;
                            }
                            q31 = q30;
                        } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                        q30 = (Q30) next;
                        if (q30 == null) {
                            q30 = C1816io0.b;
                        }
                        q31 = q30;
                    }
                    this.m = q31;
                    this.n = 2;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    this.m = q31;
                    this.n = 3;
                    if (q31.o(str, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    this.m = q31;
                    this.n = 4;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    Video$Type video$Type = this.q;
                    this.m = null;
                    this.n = 5;
                    obj = q31.e(video$Type, str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    list.size();
                    if (!list.isEmpty()) {
                        throw new Exception("No servers found");
                    }
                    i9 = z10.e;
                    l10 = new L10(list);
                    this.n = 6;
                    if (i9.e(l10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 1:
                    Jp0.O(obj);
                    strB = Cr0.m.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q31 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next = it.next();
                            } else {
                                next = null;
                            }
                            q30 = (Q30) next;
                            if (q30 == null) {
                                q30 = C1816io0.b;
                            }
                            q31 = q30;
                        } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                        q30 = (Q30) next;
                        if (q30 == null) {
                            q30 = C1816io0.b;
                        }
                        q31 = q30;
                    }
                    this.m = q31;
                    this.n = 2;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    this.m = q31;
                    this.n = 3;
                    if (q31.o(str, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    this.m = q31;
                    this.n = 4;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    Video$Type video$Type2 = this.q;
                    this.m = null;
                    this.n = 5;
                    obj = q31.e(video$Type2, str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    list.size();
                    if (!list.isEmpty()) {
                        throw new Exception("No servers found");
                    }
                    i9 = z10.e;
                    l10 = new L10(list);
                    this.n = 6;
                    if (i9.e(l10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 2:
                    q31 = this.m;
                    Jp0.O(obj);
                    this.m = q31;
                    this.n = 3;
                    if (q31.o(str, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    this.m = q31;
                    this.n = 4;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    Video$Type video$Type3 = this.q;
                    this.m = null;
                    this.n = 5;
                    obj = q31.e(video$Type3, str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    list.size();
                    if (!list.isEmpty()) {
                        throw new Exception("No servers found");
                    }
                    i9 = z10.e;
                    l10 = new L10(list);
                    this.n = 6;
                    if (i9.e(l10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 3:
                    q31 = this.m;
                    Jp0.O(obj);
                    this.m = q31;
                    this.n = 4;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    Video$Type video$Type4 = this.q;
                    this.m = null;
                    this.n = 5;
                    obj = q31.e(video$Type4, str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    list.size();
                    if (!list.isEmpty()) {
                        throw new Exception("No servers found");
                    }
                    i9 = z10.e;
                    l10 = new L10(list);
                    this.n = 6;
                    if (i9.e(l10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 4:
                    q31 = this.m;
                    Jp0.O(obj);
                    Video$Type video$Type5 = this.q;
                    this.m = null;
                    this.n = 5;
                    obj = q31.e(video$Type5, str, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    list.size();
                    if (!list.isEmpty()) {
                        throw new Exception("No servers found");
                    }
                    i9 = z10.e;
                    l10 = new L10(list);
                    this.n = 6;
                    if (i9.e(l10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 5:
                    Jp0.O(obj);
                    list = (List) obj;
                    list.size();
                    if (!list.isEmpty()) {
                        throw new Exception("No servers found");
                    }
                    i9 = z10.e;
                    l10 = new L10(list);
                    this.n = 6;
                    if (i9.e(l10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 6:
                    Jp0.O(obj);
                    return C2985uq0.a;
                case 7:
                    Jp0.O(obj);
                    return C2985uq0.a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Z10.f(z10, "servers", e2);
            AbstractC1899jh0.U(z10.c, "xuper-", true);
            E10 e10 = new E10(e2);
            this.m = null;
            this.n = 7;
            if (z10.e.e(e10, this) == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
