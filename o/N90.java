package o;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class N90 implements InterfaceC0602Mh {
    public static final N90 l = new N90();
    public static final TP m;

    static {
        Pattern pattern = TP.e;
        m = AbstractC1474fG.o("text/plain; charset=UTF-8");
    }

    @Override // o.InterfaceC0602Mh
    public final Object l(Object obj) {
        return C2743sL.k(String.valueOf(obj), m);
    }
}
