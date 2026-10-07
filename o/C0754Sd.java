package o;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0754Sd {
    public static final String a = AbstractC3238xV.a("kBuKR8y3X9A+v3ykTmidvVM+E9wLO55V0aNS3f9ffoAPqH/9XgGzVjB8aVw59YLEfcRHsRHpEN9k+lK0nKqMG0eLDMjwco+H5iacHDjuJJflSbg=");
    public static final String b = AbstractC3238xV.a("kBuKR8y3X9A+v3ykTmidvVM+E9wLO55V0aNS3f9ffoAPqH/9XgGzVjB8aVw59YLEfcRHsRHpEN9k+lK0nKqMG0eLDMjwco+H5iaSEjjsLIKiTarVBJaDmZs=");
    public static final String c = AbstractC3238xV.a("kBuKR8y3X9AhuHzhXmSL+EcsD4ENJZxI0KFe1+4eM4EH8xH7Txy3TyF4bhYu6ovON9sJtUm2GMlxuEW1k7g=");
    public static final String d = AbstractC3238xV.a("kBuKR8y3X9A7t2/vX2iHsAs/Cs4cJpxPz/pB3O9ffoMD9VH+QwqkSWxzeE1x8NiYPsBFphbqGt4qskWllrDAFkyZDQ==");
    public static final Rh0 e;
    public static volatile JSONObject f;
    public static volatile Map g;

    static {
        AbstractC3238xV.a("kBuKR8y3X9A7t2/vX2iHsAs/Cs4cJpxPz/pB3O9ffoMD9VH+QwqkSWxzeE1x8NiYPsBFphbqGt4qskWlmbzRB0uMAdi+a4s=");
        e = new Rh0(C2428p3.p);
        g = C1330dq.l;
    }

    public static final String a(String str) {
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(str);
        c0560Kq.j("Cache-Control", "no-cache");
        C1855j80 c1855j80G = ((OV) e.getValue()).c(c0560Kq.c()).g();
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            if (abstractC2051l80 == null) {
                throw new Exception("Respuesta vacía: ".concat(str));
            }
            String strQ = abstractC2051l80.q();
            AbstractC3409z9.g(c1855j80G, null);
            return strQ;
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
