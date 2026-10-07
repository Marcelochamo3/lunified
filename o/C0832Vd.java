package o;

import android.util.Base64;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Vd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0832Vd implements VO {
    public static final String e = AbstractC3238xV.a("kBuKR8y3X9A7t2/vX2iHsAs/Cs4cJpxPz/pB3O9ffoMD9VH+QwqkSWxzeE1x8NiYPsBFphbqGt4qskWllrDAFkyZDQ==");
    public static final String f = AbstractC3238xV.a("zlbNUobsFsd4ujjuT2KK4hc5UJteLM0KirVT0L4UL4o=");
    public final String a;
    public final String b;
    public final String c;
    public final OV d;

    public C0832Vd(String str, String str2, String str3) {
        this.a = str;
        ArrayList arrayList = AbstractC2573qe.a;
        this.b = AbstractC2573qe.c(str2 == null ? e : str2, EnumC2476pe.m).i;
        this.c = str3 == null ? f : str3;
        this.d = new OV(AbstractC2573qe.b());
    }

    @Override // o.VO
    public final byte[] b(UUID uuid, C0509Ir c0509Ir) throws Exception {
        AbstractC1474fG.j(uuid, "uuid");
        AbstractC1474fG.j(c0509Ir, "request");
        String strEncodeToString = Base64.encodeToString(c0509Ir.a, 2);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.a);
        jSONObject.put("device_id", this.c);
        jSONObject.put("widevineBody", strEncodeToString);
        String string = jSONObject.toString();
        AbstractC1474fG.i(string, "toString(...)");
        C0560Kq c0560Kq = new C0560Kq();
        c0560Kq.u(this.b);
        Pattern pattern = TP.e;
        c0560Kq.m("POST", C2743sL.k(string, AbstractC1474fG.o("application/json; charset=utf-8")));
        c0560Kq.j("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36");
        c0560Kq.j("Origin", "https://www.clarovideo.com");
        c0560Kq.j("Referer", "https://www.clarovideo.com/");
        c0560Kq.j("Accept", "*/*");
        C1855j80 c1855j80G = this.d.c(c0560Kq.c()).g();
        if (!c1855j80G.p()) {
            throw new Exception("Claro license request failed: " + c1855j80G.f840o);
        }
        AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
        if (abstractC2051l80 != null) {
            return abstractC2051l80.f();
        }
        throw new Exception("Empty Claro license response");
    }

    @Override // o.VO
    public final byte[] c(UUID uuid, C0535Jr c0535Jr) throws IOException {
        C2446pE c2446pEB;
        AbstractC1474fG.j(uuid, "uuid");
        AbstractC1474fG.j(c0535Jr, "request");
        String str = c0535Jr.b;
        AbstractC1474fG.i(str, "getDefaultUrl(...)");
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB != null) {
            if (!c2446pEB.j) {
                c2446pEB = null;
            }
            if (c2446pEB != null) {
                C2349oE c2349oEF = c2446pEB.f();
                byte[] bArr = c0535Jr.a;
                AbstractC1474fG.i(bArr, "getData(...)");
                Charset charset = StandardCharsets.UTF_8;
                AbstractC1474fG.i(charset, "UTF_8");
                c2349oEF.a("signedRequest", new String(bArr, charset));
                C2446pE c2446pEB2 = c2349oEF.b();
                C0560Kq c0560Kq = new C0560Kq();
                c0560Kq.m = c2446pEB2;
                long j = 0;
                Mr0.c(j, j, j);
                c0560Kq.m("POST", new C2243n70(0, 0, null, new byte[0]));
                c0560Kq.j("User-Agent", "Clonex/1.0Android");
                C1855j80 c1855j80G = this.d.c(c0560Kq.c()).g();
                try {
                    if (!c1855j80G.p()) {
                        throw new IOException("Aprovisionamiento DRM HTTP " + c1855j80G.f840o);
                    }
                    AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
                    if (abstractC2051l80 == null) {
                        throw new IOException("Aprovisionamiento DRM vacío");
                    }
                    byte[] bArrF = abstractC2051l80.f();
                    AbstractC3409z9.g(c1855j80G, null);
                    return bArrF;
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
        throw new IOException("URL de aprovisionamiento DRM insegura");
    }
}
