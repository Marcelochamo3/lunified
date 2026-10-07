package o;

import j$.util.function.Function$CC;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetSocketAddress;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: renamed from: o.ps, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2504ps implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ C2504ps(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* JADX INFO: renamed from: andThen */
    public final /* synthetic */ Function mo4andThen(Function function) {
        int i = this.a;
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ((C3085vs.b) obj).a;
            case 1:
                return new C1369e90((AQ) obj);
            case 2:
                return C0629Ni.a.a(((Integer) obj).intValue());
            case 3:
                return C0629Ni.c.a(((Integer) obj).intValue());
            case 4:
                return C1877jT.a.a(((Integer) obj).intValue());
            case 5:
                return Collections.unmodifiableList((List) obj);
            case 6:
                return C3085vs.I((InetSocketAddress) obj);
            case 7:
                return ((C2848tT) obj).toString();
            case 8:
                return C1578gM.n((C2848tT) obj);
            case 9:
                return new Qd0((InetSocketAddress) obj);
            case 10:
                return Integer.valueOf(((C0388Ea) obj).r());
            case 11:
                return C2260nM.A((C0388Ea) obj);
            case 12:
                return C2260nM.b.o((C2848tT) obj);
            case 13:
                return ((Inet4Address) obj).getAddress();
            case 14:
                return ((Inet6Address) obj).getAddress();
            case 15:
                return (C2848tT) ((Map.Entry) obj).getKey();
            case 16:
                return C1531fs0.d0((Throwable) obj);
            default:
                return new C0388Ea(((Integer) obj).intValue());
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        int i = this.a;
        return Function$CC.$default$compose(this, function);
    }
}
