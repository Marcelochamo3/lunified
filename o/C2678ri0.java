package o;

import j$.util.function.Consumer$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: renamed from: o.ri0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2678ri0 implements Cloneable {
    public static final HashMap v = new HashMap();
    public String l;
    public final String m;
    public String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f1008o = true;
    public boolean p = true;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public boolean u = false;

    static {
        HashMap map = new HashMap();
        map.put("http://www.w3.org/1998/Math/MathML", new String[]{"math", "mi", "mo", "msup", "mn", "mtext"});
        map.put("http://www.w3.org/2000/svg", new String[]{"svg", "text"});
        final int i = 0;
        b(new String[]{"html", "head", "body", "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", "section", "nav", "aside", "hgroup", "header", "footer", "p", "h1", "h2", "h3", "h4", "h5", "h6", "ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "ins", "del", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "video", "audio", "canvas", "details", "menu", "plaintext", "template", "article", "main", "svg", "math", "center", "template", "dir", "applet", "marquee", "listing"}, new Consumer() { // from class: o.pi0
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                C2678ri0 c2678ri0 = (C2678ri0) obj;
                switch (i) {
                    case 0:
                        c2678ri0.f1008o = true;
                        c2678ri0.p = true;
                        break;
                    case 1:
                        c2678ri0.f1008o = false;
                        c2678ri0.p = false;
                        break;
                    case 2:
                        c2678ri0.q = true;
                        break;
                    case 3:
                        c2678ri0.p = false;
                        break;
                    case 4:
                        c2678ri0.s = true;
                        break;
                    case 5:
                        c2678ri0.t = true;
                        break;
                    default:
                        c2678ri0.u = true;
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i2 = i;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final int i2 = 1;
        b(new String[]{"object", "base", "font", "tt", "i", "b", "u", "big", "small", "em", "strong", "dfn", "code", "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img", "br", "wbr", "map", "q", "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "button", "optgroup", "option", "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", "source", "track", "summary", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track", "data", "bdi", "s", "strike", "nobr", "rb", "text", "mi", "mo", "msup", "mn", "mtext"}, new Consumer() { // from class: o.pi0
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                C2678ri0 c2678ri0 = (C2678ri0) obj;
                switch (i2) {
                    case 0:
                        c2678ri0.f1008o = true;
                        c2678ri0.p = true;
                        break;
                    case 1:
                        c2678ri0.f1008o = false;
                        c2678ri0.p = false;
                        break;
                    case 2:
                        c2678ri0.q = true;
                        break;
                    case 3:
                        c2678ri0.p = false;
                        break;
                    case 4:
                        c2678ri0.s = true;
                        break;
                    case 5:
                        c2678ri0.t = true;
                        break;
                    default:
                        c2678ri0.u = true;
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i3 = i2;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final int i3 = 2;
        b(new String[]{"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", "command", "device", "area", "basefont", "bgsound", "menuitem", "param", "source", "track"}, new Consumer() { // from class: o.pi0
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                C2678ri0 c2678ri0 = (C2678ri0) obj;
                switch (i3) {
                    case 0:
                        c2678ri0.f1008o = true;
                        c2678ri0.p = true;
                        break;
                    case 1:
                        c2678ri0.f1008o = false;
                        c2678ri0.p = false;
                        break;
                    case 2:
                        c2678ri0.q = true;
                        break;
                    case 3:
                        c2678ri0.p = false;
                        break;
                    case 4:
                        c2678ri0.s = true;
                        break;
                    case 5:
                        c2678ri0.t = true;
                        break;
                    default:
                        c2678ri0.u = true;
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i4 = i3;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final int i4 = 3;
        b(new String[]{"title", "a", "p", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style", "ins", "del", "s"}, new Consumer() { // from class: o.pi0
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                C2678ri0 c2678ri0 = (C2678ri0) obj;
                switch (i4) {
                    case 0:
                        c2678ri0.f1008o = true;
                        c2678ri0.p = true;
                        break;
                    case 1:
                        c2678ri0.f1008o = false;
                        c2678ri0.p = false;
                        break;
                    case 2:
                        c2678ri0.q = true;
                        break;
                    case 3:
                        c2678ri0.p = false;
                        break;
                    case 4:
                        c2678ri0.s = true;
                        break;
                    case 5:
                        c2678ri0.t = true;
                        break;
                    default:
                        c2678ri0.u = true;
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i5 = i4;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final int i5 = 4;
        b(new String[]{"pre", "plaintext", "title", "textarea"}, new Consumer() { // from class: o.pi0
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                C2678ri0 c2678ri0 = (C2678ri0) obj;
                switch (i5) {
                    case 0:
                        c2678ri0.f1008o = true;
                        c2678ri0.p = true;
                        break;
                    case 1:
                        c2678ri0.f1008o = false;
                        c2678ri0.p = false;
                        break;
                    case 2:
                        c2678ri0.q = true;
                        break;
                    case 3:
                        c2678ri0.p = false;
                        break;
                    case 4:
                        c2678ri0.s = true;
                        break;
                    case 5:
                        c2678ri0.t = true;
                        break;
                    default:
                        c2678ri0.u = true;
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i6 = i5;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final int i6 = 5;
        b(new String[]{"button", "fieldset", "input", "keygen", "object", "output", "select", "textarea"}, new Consumer() { // from class: o.pi0
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                C2678ri0 c2678ri0 = (C2678ri0) obj;
                switch (i6) {
                    case 0:
                        c2678ri0.f1008o = true;
                        c2678ri0.p = true;
                        break;
                    case 1:
                        c2678ri0.f1008o = false;
                        c2678ri0.p = false;
                        break;
                    case 2:
                        c2678ri0.q = true;
                        break;
                    case 3:
                        c2678ri0.p = false;
                        break;
                    case 4:
                        c2678ri0.s = true;
                        break;
                    case 5:
                        c2678ri0.t = true;
                        break;
                    default:
                        c2678ri0.u = true;
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i7 = i6;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final int i7 = 6;
        b(new String[]{"input", "keygen", "object", "select", "textarea"}, new Consumer() { // from class: o.pi0
            @Override // java.util.function.Consumer
            /* JADX INFO: renamed from: accept */
            public final void p(Object obj) {
                C2678ri0 c2678ri0 = (C2678ri0) obj;
                switch (i7) {
                    case 0:
                        c2678ri0.f1008o = true;
                        c2678ri0.p = true;
                        break;
                    case 1:
                        c2678ri0.f1008o = false;
                        c2678ri0.p = false;
                        break;
                    case 2:
                        c2678ri0.q = true;
                        break;
                    case 3:
                        c2678ri0.p = false;
                        break;
                    case 4:
                        c2678ri0.s = true;
                        break;
                    case 5:
                        c2678ri0.t = true;
                        break;
                    default:
                        c2678ri0.u = true;
                        break;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                int i8 = i7;
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        for (Map.Entry entry : map.entrySet()) {
            b((String[]) entry.getValue(), new WU(6, entry));
        }
    }

    public C2678ri0(String str, String str2) {
        this.l = str;
        this.m = AP.o(str);
        this.n = str2;
    }

    public static void b(String[] strArr, Consumer consumer) {
        for (String str : strArr) {
            HashMap map = v;
            C2678ri0 c2678ri0 = (C2678ri0) map.get(str);
            if (c2678ri0 == null) {
                c2678ri0 = new C2678ri0(str, "http://www.w3.org/1999/xhtml");
                map.put(c2678ri0.l, c2678ri0);
            }
            consumer.p(c2678ri0);
        }
    }

    public static C2678ri0 c(String str, String str2, C2852tX c2852tX) {
        Sr0.u(str);
        Sr0.w(str2);
        HashMap map = v;
        C2678ri0 c2678ri0 = (C2678ri0) map.get(str);
        if (c2678ri0 != null && c2678ri0.n.equals(str2)) {
            return c2678ri0;
        }
        String strB = c2852tX.b(str);
        Sr0.u(strB);
        String strO = AP.o(strB);
        C2678ri0 c2678ri1 = (C2678ri0) map.get(strO);
        if (c2678ri1 == null || !c2678ri1.n.equals(str2)) {
            C2678ri0 c2678ri2 = new C2678ri0(strB, str2);
            c2678ri2.f1008o = false;
            return c2678ri2;
        }
        if (c2852tX.a && !strB.equals(strO)) {
            try {
                c2678ri1 = (C2678ri0) super.clone();
                c2678ri1.l = strB;
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        return c2678ri1;
    }

    public final Object clone() {
        try {
            return (C2678ri0) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2678ri0)) {
            return false;
        }
        C2678ri0 c2678ri0 = (C2678ri0) obj;
        return this.l.equals(c2678ri0.l) && this.q == c2678ri0.q && this.p == c2678ri0.p && this.f1008o == c2678ri0.f1008o && this.s == c2678ri0.s && this.r == c2678ri0.r && this.t == c2678ri0.t && this.u == c2678ri0.u;
    }

    public final int hashCode() {
        return (((((((((((((this.l.hashCode() * 31) + (this.f1008o ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + (this.q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + (this.u ? 1 : 0);
    }

    public final String toString() {
        return this.l;
    }
}
