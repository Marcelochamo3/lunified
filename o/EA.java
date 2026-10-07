package o;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class EA implements InterfaceC0602Mh {
    public static final TP n;
    public final BA l;
    public final AbstractC3177wp0 m;

    static {
        Pattern pattern = TP.e;
        n = AbstractC1474fG.o("application/json; charset=UTF-8");
    }

    public EA(BA ba, AbstractC3177wp0 abstractC3177wp0) {
        this.l = ba;
        this.m = abstractC3177wp0;
    }

    @Override // o.InterfaceC0602Mh
    public final Object l(Object obj) throws IOException {
        E9 e9 = new E9();
        C1183cI c1183cIG = this.l.g(new OutputStreamWriter(new D9(e9), StandardCharsets.UTF_8));
        this.m.b(c1183cIG, obj);
        c1183cIG.close();
        C2468pa c2468paN = e9.n(e9.m);
        AbstractC1474fG.j(c2468paN, "content");
        return new C2146m70(n, c2468paN);
    }
}
