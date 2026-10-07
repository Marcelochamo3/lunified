package o;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ty0 extends AbstractC3473zs {
    public static final List c = AbstractC0937Ze.K(new I60("(?i)file\\s*:\\s*['\\\"](https?://[^'\\\"]+\\.(?:m3u8|mp4)(?:\\?[^'\\\"]*)?)['\\\"]"), new I60("(?i)src\\s*:\\s*['\\\"](https?://[^'\\\"]+\\.(?:m3u8|mp4)(?:\\?[^'\\\"]*)?)['\\\"]"));
    public final List b = AbstractC0937Ze.K("https://yourupload.com", "https://www.yucache.net", "https://yucache.net");

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        sy0 sy0Var;
        String str2;
        Object next;
        int i = 1;
        if (interfaceC0473Hh instanceof sy0) {
            sy0Var = (sy0) interfaceC0473Hh;
            int i2 = sy0Var.f1036o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sy0Var.f1036o = i2 - Integer.MIN_VALUE;
            } else {
                sy0Var = new sy0(this, interfaceC0473Hh);
            }
        } else {
            sy0Var = new sy0(this, interfaceC0473Hh);
        }
        Object obj = sy0Var.m;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i3 = sy0Var.f1036o;
        if (i3 == 0) {
            Jp0.O(obj);
            URL url = new URL(str);
            String strE = AbstractC1701hf0.e(url.getProtocol(), "://", url.getHost());
            String str3 = strE + "/";
            AbstractC1474fG.j(str3, "baseUrl");
            C1583gR c1583gRK = AbstractC1370eA.k();
            c1583gRK.f(str3);
            c1583gRK.m = new OV(AbstractC1370eA.h());
            ((ArrayList) c1583gRK.f793o).add(new P9(i));
            Object objB = c1583gRK.m().b(ry0.class);
            AbstractC1474fG.i(objB, "create(...)");
            String strD = AbstractC1701hf0.d(strE, "/");
            sy0Var.l = strE;
            sy0Var.f1036o = 1;
            Object objA = ((ry0) objB).a(str, strD, "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36", sy0Var);
            if (objA == enumC1706hi) {
                return enumC1706hi;
            }
            obj = objA;
            str2 = strE;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = sy0Var.l;
            Jp0.O(obj);
        }
        C3370yp c3370ypW = ((C0660On) obj).W("script");
        AbstractC1474fG.i(c3370ypW, "select(...)");
        C1634gv c1634gv = new C1634gv(Vb0.N(AbstractC0911Ye.U(c), new C5(AbstractC0911Ye.h0(c3370ypW, "\n", null, null, Iu0.v, 30), 10)));
        do {
            if (!c1634gv.hasNext()) {
                next = null;
                break;
            }
            next = c1634gv.next();
        } while (!AbstractC1899jh0.U((String) next, "http", false));
        String str4 = (String) next;
        if (str4 == null) {
            throw new Exception("YourUpload no devolvió una fuente de video");
        }
        String strR = AbstractC1899jh0.R(str4, "\\/", "/", false);
        return new Js0(strR, AbstractC3327yN.z(new C1101bX("Referer", AbstractC1701hf0.d(str2, "/")), new C1101bX("Origin", str2), new C1101bX("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36")), AbstractC1119bh0.W(strR, ".m3u8", true) ? "hls" : "mp4", (String) null, (String) null, (byte[]) null, (String) null, AbstractC1701hf0.d(str2, "/"), (String) null, (List) null, false, 3960);
    }

    @Override // o.AbstractC3473zs
    public final List b() {
        return this.b;
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "https://www.yourupload.com";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "YourUpload";
    }
}
