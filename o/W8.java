package o;

import com.skidush.clonex.utils.BlindajeCrypto;

/* JADX INFO: loaded from: classes.dex */
public final class W8 {
    public static final String a = AbstractC3238xV.a("1wyfWd7hFYxjtW7zWi6LukkoFdscKI0=");
    public static final YS b = AbstractC1923jt0.a();

    public static String a(String str, String str2, String str3) {
        AbstractC1474fG.j(str, "iv");
        AbstractC1474fG.j(str2, "tag");
        AbstractC1474fG.j(str3, "data");
        BlindajeCrypto blindajeCrypto = BlindajeCrypto.a;
        if (blindajeCrypto.c()) {
            return blindajeCrypto.d(str, str2, str3);
        }
        throw new IllegalStateException("Contenido protegido no inicializado".toString());
    }

    public static Object b(InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        Object objJ = AbstractC1376eG.J(AbstractC1910jn.b, new U8(false, null), interfaceC0473Hh);
        return objJ == EnumC1706hi.l ? objJ : C2985uq0.a;
    }
}
