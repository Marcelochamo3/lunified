package o;

import com.skidush.clonex.utils.BlindajeCrypto;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class An0 extends Ph0 implements InterfaceC0775Sy {
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public An0(String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.m = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((An0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new An0(this.m, interfaceC0473Hh);
    }

    @Override // o.R7
    public final Object r(Object obj) throws IOException {
        String string;
        Jp0.O(obj);
        BlindajeCrypto blindajeCrypto = BlindajeCrypto.a;
        String str = this.m;
        if (!blindajeCrypto.g(str)) {
            throw new IOException("URL de canal Flow inválida");
        }
        X8 x8F = blindajeCrypto.f();
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(x8F.a);
        c0560Kq.d();
        for (Map.Entry entry : x8F.b.entrySet()) {
            c0560Kq.j((String) entry.getKey(), (String) entry.getValue());
        }
        C1855j80 c1855j80G = ((OV) C1816io0.t.getValue()).c(c0560Kq.c()).g();
        try {
            if (!c1855j80G.l()) {
                throw new IOException("Flow bootstrap HTTP " + c1855j80G.f840o + "; se esperaba un redirect");
            }
            String strF = c1855j80G.f("Location", null);
            if (strF != null && (string = AbstractC1119bh0.E0(strF).toString()) != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    AbstractC3409z9.g(c1855j80G, null);
                    try {
                        return BlindajeCrypto.a.k(str, string);
                    } catch (IllegalArgumentException e) {
                        throw new IOException("Flow devolvió un Location inválido", e);
                    }
                }
            }
            throw new IOException("Flow bootstrap no devolvió el header Location");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }
}
