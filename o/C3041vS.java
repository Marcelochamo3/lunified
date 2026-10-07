package o;

import java.util.List;

/* JADX INFO: renamed from: o.vS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3041vS extends AbstractC3473zs {
    public static final List c = AbstractC0937Ze.K(new I60("(?is)window\\.location(?:\\.href)?\\.replace\\(\\s*['\\\"]([^'\\\"]+)['\\\"]\\s*\\)"), new I60("(?is)window\\.location(?:\\.href)?\\s*=\\s*['\\\"]([^'\\\"]+)['\\\"]"), new I60("(?is)location\\.replace\\(\\s*['\\\"]([^'\\\"]+)['\\\"]\\s*\\)"), new I60("(?is)location\\.href\\s*=\\s*['\\\"]([^'\\\"]+)['\\\"]"), new I60("(?is)<meta[^>]+http-equiv=['\\\"]refresh['\\\"][^>]+content=['\\\"][^'\\\"]*url=([^'\\\">]+)['\\\"]"));
    public static final List d = AbstractC0937Ze.K(new I60("(?i)(?:file|src)\\s*[:=]\\s*['\\\"](https?://[^'\\\"]+\\.(?:m3u8|mp4)(?:\\?[^'\\\"]*)?)['\\\"]"), new I60("(?i)sources?\\s*[:=]\\s*\\[\\s*['\\\"](https?://[^'\\\"]+\\.(?:m3u8|mp4)(?:\\?[^'\\\"]*)?)['\\\"]"), new I60("(?i)['\\\"](https?://[^'\\\"]+\\.(?:m3u8|mp4)(?:\\?[^'\\\"]*)?)['\\\"]"));
    public final List b = AbstractC2506pt.A("https://www.mp4upload.com");

    /* JADX WARN: Code duplicated, block: B:17:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:19:0x00c7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:29:0x011e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0155  */
    /* JADX WARN: Code duplicated, block: B:32:0x0176  */
    /* JADX WARN: Code duplicated, block: B:34:0x017f  */
    /* JADX WARN: Code duplicated, block: B:36:0x018e  */
    /* JADX WARN: Code duplicated, block: B:43:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:57:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00c8 -> B:21:0x00cd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static java.lang.Object f(o.C3041vS r38, java.lang.String r39, o.InterfaceC0473Hh r40) {
        /*
            Method dump skipped, instruction units count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3041vS.f(o.vS, java.lang.String, o.Hh):java.lang.Object");
    }

    public static String g(String str) {
        Object next;
        C1634gv c1634gv = new C1634gv(Vb0.N(AbstractC0911Ye.U(c), new C5(i(str), 3)));
        while (c1634gv.hasNext()) {
            next = c1634gv.next();
            if (!AbstractC1899jh0.O((String) next)) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }

    public static String h(String str) {
        Object next;
        C1634gv c1634gv = new C1634gv(Vb0.N(AbstractC0911Ye.U(d), new C5(i(str), 4)));
        while (c1634gv.hasNext()) {
            next = c1634gv.next();
            if (AbstractC1899jh0.U((String) next, "http", false)) {
                return (String) next;
            }
        }
        next = null;
        return (String) next;
    }

    public static String i(String str) {
        return AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(str, "\\/", "/", false), "\\u0026", "&", false), "&amp;", "&", false);
    }

    @Override // o.AbstractC3473zs
    public final Object a(String str, InterfaceC0473Hh interfaceC0473Hh) {
        return f(this, str, interfaceC0473Hh);
    }

    @Override // o.AbstractC3473zs
    public final List b() {
        return this.b;
    }

    @Override // o.AbstractC3473zs
    public final String c() {
        return "https://mp4upload.com";
    }

    @Override // o.AbstractC3473zs
    public final String d() {
        return "Mp4Upload";
    }
}
