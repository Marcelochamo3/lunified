package io.sentry.android.replay;

import java.util.Locale;
import java.util.NoSuchElementException;
import o.AbstractC1119bh0;
import o.AbstractC1474fG;
import o.AbstractC3226xJ;
import o.InterfaceC0412Ey;
import o.JN;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC3226xJ implements InterfaceC0412Ey {
    public static final b m = new b(1);

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        JN jn = (JN) obj;
        AbstractC1474fG.j(jn, "it");
        String strC = jn.c();
        if (strC.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        String strValueOf = String.valueOf(strC.charAt(AbstractC1119bh0.a0(strC)));
        AbstractC1474fG.h(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        AbstractC1474fG.i(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
