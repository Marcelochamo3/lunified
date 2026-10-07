package o;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class Ga0 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ La0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f281o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga0(La0 la0, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = la0;
        this.f281o = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((Ga0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new Ga0(this.n, this.f281o, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[Catch: Exception -> 0x002d, CancellationException -> 0x0030, TryCatch #2 {CancellationException -> 0x0030, Exception -> 0x002d, blocks: (B:12:0x0028, B:17:0x0033, B:44:0x009f, B:18:0x0037, B:27:0x0059, B:29:0x0067, B:41:0x0096, B:30:0x006a, B:31:0x0075, B:33:0x007b, B:37:0x008e, B:39:0x0092, B:24:0x004e), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: Exception -> 0x002d, CancellationException -> 0x0030, TryCatch #2 {CancellationException -> 0x0030, Exception -> 0x002d, blocks: (B:12:0x0028, B:17:0x0033, B:44:0x009f, B:18:0x0037, B:27:0x0059, B:29:0x0067, B:41:0x0096, B:30:0x006a, B:31:0x0075, B:33:0x007b, B:37:0x008e, B:39:0x0092, B:24:0x004e), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:33:0x007b A[Catch: Exception -> 0x002d, CancellationException -> 0x0030, TryCatch #2 {CancellationException -> 0x0030, Exception -> 0x002d, blocks: (B:12:0x0028, B:17:0x0033, B:44:0x009f, B:18:0x0037, B:27:0x0059, B:29:0x0067, B:41:0x0096, B:30:0x006a, B:31:0x0075, B:33:0x007b, B:37:0x008e, B:39:0x0092, B:24:0x004e), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0092 A[Catch: Exception -> 0x002d, CancellationException -> 0x0030, TryCatch #2 {CancellationException -> 0x0030, Exception -> 0x002d, blocks: (B:12:0x0028, B:17:0x0033, B:44:0x009f, B:18:0x0037, B:27:0x0059, B:29:0x0067, B:41:0x0096, B:30:0x006a, B:31:0x0075, B:33:0x007b, B:37:0x008e, B:39:0x0092, B:24:0x004e), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x008d A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        String strB;
        Iterator it;
        Object next;
        Q30 q30;
        Q30 q31;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        C2985uq0 c2985uq0 = C2985uq0.a;
        String str = this.f281o;
        La0 la0 = this.n;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else if (i == 2) {
                    Jp0.O(obj);
                    strB = Cr0.m.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q31 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                        q30 = (Q30) next;
                        if (q30 == null) {
                            q31 = C1816io0.b;
                        } else {
                            q31 = q30;
                        }
                    }
                    this.m = 3;
                    obj = q31.a(str, 1, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    List list = (List) obj;
                    la0.getClass();
                    AbstractC1474fG.j(str, "<set-?>");
                    la0.d = str;
                    la0.e = 1;
                    C2771sg0 c2771sg0 = la0.b;
                    Da0 da0 = new Da0(list, true ^ list.isEmpty());
                    this.m = 4;
                    c2771sg0.l(da0, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else if (i == 3) {
                    Jp0.O(obj);
                    List list2 = (List) obj;
                    la0.getClass();
                    AbstractC1474fG.j(str, "<set-?>");
                    la0.d = str;
                    la0.e = 1;
                    C2771sg0 c2771sg1 = la0.b;
                    Da0 da1 = new Da0(list2, true ^ list2.isEmpty());
                    this.m = 4;
                    c2771sg1.l(da1, this);
                    if (c2985uq0 == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return c2985uq0;
            }
            Jp0.O(obj);
            C2771sg0 c2771sg2 = la0.b;
            Aa0 aa0 = Aa0.a;
            this.m = 1;
            c2771sg2.l(aa0, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            O9 o9 = O9.x;
            this.m = 2;
            if (o9.D(this) == enumC1706hi) {
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
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!AbstractC1474fG.b(((Q30) next).getName(), strB));
                q30 = (Q30) next;
                if (q30 == null) {
                    q31 = C1816io0.b;
                } else {
                    q31 = q30;
                }
            }
            this.m = 3;
            obj = q31.a(str, 1, this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            List list3 = (List) obj;
            la0.getClass();
            AbstractC1474fG.j(str, "<set-?>");
            la0.d = str;
            la0.e = 1;
            C2771sg0 c2771sg3 = la0.b;
            Da0 da2 = new Da0(list3, true ^ list3.isEmpty());
            this.m = 4;
            c2771sg3.l(da2, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
            return c2985uq0;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            C2771sg0 c2771sg4 = la0.b;
            C3341ya0 c3341ya0 = new C3341ya0(e2);
            this.m = 5;
            c2771sg4.l(c3341ya0, this);
            if (c2985uq0 == enumC1706hi) {
                return enumC1706hi;
            }
        }
    }
}
