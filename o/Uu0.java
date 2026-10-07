package o;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Uu0 extends AbstractC3473zs {
    public static final I60 c = new I60("(?:window\\.)?\\s*location(?:\\.href)?\\s*=\\s*['\\\"]([^'\\\"]+)['\\\"]", J60.IGNORE_CASE);
    public final OV b;

    public Uu0() {
        C2112lq c2112lq = new C2112lq(6);
        NV nvL = AbstractC1370eA.l();
        nvL.j = c2112lq;
        nvL.h = true;
        nvL.i = true;
        this.b = new OV(nvL);
    }

    public static final void f(Uu0 uu0, String str) throws IOException {
        uu0.getClass();
        Uri uri = Uri.parse(str);
        AbstractC1474fG.i(uri, "parse(...)");
        if (!AbstractC1370eA.z(uri)) {
            throw new IOException("URL VOE insegura o inválida");
        }
    }

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return AbstractC1376eG.J(AbstractC1910jn.b, new Tu0(this, str, null), interfaceC0473Hh);
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "https://voe.sx/";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "VOE";
    }

    public final C1101bX g(C1951k70 c1951k70, long j) {
        C1855j80 c1855j80G = this.b.c(c1951k70).g();
        try {
            if (!c1855j80G.p()) {
                throw new IOException("VOE respondió HTTP " + c1855j80G.f840o);
            }
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            if (abstractC2051l80 == null) {
                throw new IOException("VOE devolvió una respuesta vacía");
            }
            if (abstractC2051l80.i() > j) {
                throw new IOException("La respuesta VOE excede el límite");
            }
            byte[] bArrF = abstractC2051l80.f();
            if (bArrF.length > j) {
                throw new IOException("La respuesta VOE excede el límite");
            }
            C1101bX c1101bX = new C1101bX(c1855j80G.l.a.i, new String(bArrF, AbstractC1305dd.a));
            AbstractC3409z9.g(c1855j80G, null);
            return c1101bX;
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
