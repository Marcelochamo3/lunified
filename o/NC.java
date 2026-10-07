package o;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class NC extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ RC n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Q30 f410o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NC(RC rc, Q30 q30, long j, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = rc;
        this.f410o = q30;
        this.p = j;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((NC) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new NC(this.n, this.f410o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0069 A[Catch: Exception -> 0x0027, CancellationException -> 0x0029, TryCatch #3 {CancellationException -> 0x0029, Exception -> 0x0027, blocks: (B:12:0x0022, B:17:0x002c, B:30:0x0061, B:32:0x0069, B:34:0x0075, B:36:0x0078, B:39:0x008b, B:40:0x0092, B:18:0x0030, B:27:0x0056, B:24:0x004b), top: B:78:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0075 A[Catch: Exception -> 0x0027, CancellationException -> 0x0029, TryCatch #3 {CancellationException -> 0x0029, Exception -> 0x0027, blocks: (B:12:0x0022, B:17:0x002c, B:30:0x0061, B:32:0x0069, B:34:0x0075, B:36:0x0078, B:39:0x008b, B:40:0x0092, B:18:0x0030, B:27:0x0056, B:24:0x004b), top: B:78:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0078 A[Catch: Exception -> 0x0027, CancellationException -> 0x0029, TryCatch #3 {CancellationException -> 0x0029, Exception -> 0x0027, blocks: (B:12:0x0022, B:17:0x002c, B:30:0x0061, B:32:0x0069, B:34:0x0075, B:36:0x0078, B:39:0x008b, B:40:0x0092, B:18:0x0030, B:27:0x0056, B:24:0x004b), top: B:78:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x008a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x008b A[Catch: Exception -> 0x0027, CancellationException -> 0x0029, TryCatch #3 {CancellationException -> 0x0029, Exception -> 0x0027, blocks: (B:12:0x0022, B:17:0x002c, B:30:0x0061, B:32:0x0069, B:34:0x0075, B:36:0x0078, B:39:0x008b, B:40:0x0092, B:18:0x0030, B:27:0x0056, B:24:0x004b), top: B:78:0x0009 }] */
    @Override // o.R7
    public final Object r(Object obj) {
        String str;
        List list;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.m;
        try {
            if (i != 0) {
                if (i == 1) {
                    Jp0.O(obj);
                } else if (i == 2) {
                    Jp0.O(obj);
                    Q30 q30 = this.f410o;
                    this.m = 3;
                    obj = q30.g(this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    list = (List) obj;
                    if (list.isEmpty()) {
                        throw new IllegalStateException("El proveedor no devolvió contenido");
                    }
                    if (!RC.e(this.n, this.p, this.f410o)) {
                        return C2985uq0.a;
                    }
                    C2771sg0 c2771sg0 = this.n.j;
                    LC lc = new LC(list);
                    this.m = 4;
                    c2771sg0.l(lc, this);
                    if (C2985uq0.a == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else if (i == 3) {
                    Jp0.O(obj);
                    list = (List) obj;
                    if (list.isEmpty()) {
                        throw new IllegalStateException("El proveedor no devolvió contenido");
                    }
                    if (!RC.e(this.n, this.p, this.f410o)) {
                        return C2985uq0.a;
                    }
                    C2771sg0 c2771sg1 = this.n.j;
                    LC lc2 = new LC(list);
                    this.m = 4;
                    c2771sg1.l(lc2, this);
                    if (C2985uq0.a == enumC1706hi) {
                        return enumC1706hi;
                    }
                } else {
                    if (i != 4 && i != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Jp0.O(obj);
                }
                return C2985uq0.a;
            }
            Jp0.O(obj);
            C2771sg0 c2771sg2 = this.n.j;
            KC kc = KC.a;
            this.m = 1;
            c2771sg2.l(kc, this);
            if (C2985uq0.a == enumC1706hi) {
                return enumC1706hi;
            }
            O9 o9 = O9.x;
            this.m = 2;
            if (o9.D(this) == enumC1706hi) {
                return enumC1706hi;
            }
            Q30 q31 = this.f410o;
            this.m = 3;
            obj = q31.g(this);
            if (obj == enumC1706hi) {
                return enumC1706hi;
            }
            list = (List) obj;
            if (list.isEmpty()) {
                throw new IllegalStateException("El proveedor no devolvió contenido");
            }
            if (!RC.e(this.n, this.p, this.f410o)) {
                return C2985uq0.a;
            }
            C2771sg0 c2771sg3 = this.n.j;
            LC lc3 = new LC(list);
            this.m = 4;
            c2771sg3.l(lc3, this);
            if (C2985uq0.a == enumC1706hi) {
                return enumC1706hi;
            }
            return C2985uq0.a;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            RC rc = this.n;
            long j = this.p;
            Q30 q32 = this.f410o;
            synchronized (rc) {
                if (j == rc.i && rc.g == q32 && rc.h() == q32) {
                    rc.g = null;
                    if (rc.e == q32) {
                        rc.e = null;
                    }
                    C2771sg0 c2771sg4 = this.n.j;
                    if (e2 instanceof UnknownHostException) {
                        str = "No se pudo conectar. Verifica tu conexión e intenta nuevamente.";
                    } else {
                        str = e2 instanceof SocketTimeoutException ? "El servidor tardó demasiado en responder. Intenta nuevamente." : "No se pudo cargar el contenido. Intenta nuevamente.";
                    }
                    JC jc = new JC(new Exception(str));
                    this.m = 5;
                    c2771sg4.l(jc, this);
                    if (C2985uq0.a == enumC1706hi) {
                        return enumC1706hi;
                    }
                }
            }
        }
    }
}
