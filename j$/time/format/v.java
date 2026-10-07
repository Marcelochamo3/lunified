package j$.time.format;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import o.C3080vp0;
import o.Yu0;

/* JADX INFO: loaded from: classes2.dex */
public final class v {
    private static final C0126a h = new C0126a();
    private static final HashMap i;
    private v a;
    private final v b;
    private final ArrayList c;
    private final boolean d;
    private int e;
    private char f;
    private int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.p pVar = j$.time.temporal.i.a;
        map.put('Q', pVar);
        map.put('q', pVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.k.a);
    }

    public v() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    private v(v vVar) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = vVar;
        this.d = true;
    }

    private int d(InterfaceC0131f interfaceC0131f) {
        Objects.requireNonNull(interfaceC0131f, "pp");
        v vVar = this.a;
        int i2 = vVar.e;
        if (i2 > 0) {
            if (interfaceC0131f != null) {
                interfaceC0131f = new l(interfaceC0131f, i2, vVar.f);
            }
            vVar.e = 0;
            vVar.f = (char) 0;
        }
        vVar.c.add(interfaceC0131f);
        v vVar2 = this.a;
        vVar2.g = -1;
        return vVar2.c.size() - 1;
    }

    private void m(j jVar) {
        j jVarE;
        v vVar = this.a;
        int i2 = vVar.g;
        if (i2 < 0) {
            vVar.g = d(jVar);
            return;
        }
        j jVar2 = (j) vVar.c.get(i2);
        int i3 = jVar.b;
        int i4 = jVar.c;
        if (i3 == i4 && jVar.d == F.NOT_NEGATIVE) {
            jVarE = jVar2.f(i4);
            d(jVar.e());
            this.a.g = i2;
        } else {
            jVarE = jVar2.e();
            this.a.g = d(jVar);
        }
        this.a.c.set(i2, jVarE);
    }

    private DateTimeFormatter z(Locale locale, E e, j$.time.chrono.u uVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            r();
        }
        return new DateTimeFormatter(new C0130e(this.c, false), locale, C.a, e, null, uVar, null);
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d(dateTimeFormatter.f());
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            d(new C0132g(aVar, i2, i3, z));
        } else {
            m(new C0132g(aVar, i2, i3, z));
        }
    }

    public final void c() {
        d(new C0133h());
    }

    public final void e(char c) {
        d(new C0129d(c));
    }

    public final void f(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        d(str.length() == 1 ? new C0129d(str.charAt(0)) : new i(str, 1));
    }

    public final void g(G g) {
        Objects.requireNonNull(g, "style");
        if (g != G.FULL && g != G.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        d(new i(g, 0));
    }

    public final void h(String str, String str2) {
        d(new k(str, str2));
    }

    public final void i() {
        d(k.e);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0175  */
    /* JADX WARN: Code duplicated, block: B:112:0x019c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x019f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:137:0x0203  */
    /* JADX WARN: Code duplicated, block: B:139:0x0207  */
    /* JADX WARN: Code duplicated, block: B:140:0x0214  */
    /* JADX WARN: Code duplicated, block: B:143:0x021a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x021e  */
    /* JADX WARN: Code duplicated, block: B:255:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:257:0x0408  */
    /* JADX WARN: Code duplicated, block: B:258:0x040c  */
    /* JADX WARN: Code duplicated, block: B:290:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:303:0x0417 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x0135  */
    /* JADX WARN: Code duplicated, block: B:93:0x013d  */
    public final void j(String str) {
        String strSubstring;
        int i2;
        s sVar;
        String str2;
        String str3;
        G g;
        InterfaceC0131f uVar;
        F f;
        boolean z;
        j sVar2;
        G g2;
        int i3;
        int i4;
        Objects.requireNonNull(str, "pattern");
        int i5 = 0;
        while (i5 < str.length()) {
            char cCharAt = str.charAt(i5);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i6 = i5 + 1;
                while (i6 < str.length() && str.charAt(i6) == cCharAt) {
                    i6++;
                }
                int i7 = i6 - i5;
                if (cCharAt == 'p') {
                    if (i6 >= str.length() || (((cCharAt = str.charAt(i6)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i3 = i6;
                        i4 = i7;
                        i7 = 0;
                    } else {
                        i3 = i6 + 1;
                        while (i3 < str.length() && str.charAt(i3) == cCharAt) {
                            i3++;
                        }
                        i4 = i3 - i6;
                    }
                    if (i7 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i7 < 1) {
                        throw new IllegalArgumentException("The pad width must be at least one but was " + i7);
                    }
                    v vVar = this.a;
                    vVar.e = i7;
                    vVar.f = ' ';
                    vVar.g = -1;
                    i7 = i4;
                    i2 = i3;
                } else {
                    i2 = i6;
                }
                j$.time.temporal.p pVar = (j$.time.temporal.p) i.get(Character.valueOf(cCharAt));
                if (pVar != null) {
                    if (cCharAt == 'A') {
                        f = F.NOT_NEGATIVE;
                        p(pVar, i7, 19, f);
                    } else if (cCharAt == 'Q') {
                        z = false;
                        if (i7 == 1 && i7 != 2) {
                            if (i7 != 3) {
                                if (i7 != 4) {
                                    if (i7 != 5) {
                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                    }
                                    g2 = z ? G.NARROW_STANDALONE : G.NARROW;
                                } else if (z) {
                                    g2 = G.FULL_STANDALONE;
                                } else {
                                    g2 = G.FULL;
                                }
                            } else if (z) {
                                g2 = G.SHORT_STANDALONE;
                            }
                            l(pVar, g2);
                        } else if (cCharAt == 'e') {
                            sVar2 = new s(cCharAt, i7, i7, i7, 0);
                            m(sVar2);
                        } else if (cCharAt != 'E') {
                            if (i7 == 1) {
                                n(pVar);
                            } else {
                                o(pVar, 2);
                            }
                        }
                        g2 = G.SHORT;
                        l(pVar, g2);
                    } else if (cCharAt != 'S') {
                        if (cCharAt != 'a') {
                            if (cCharAt != 'k') {
                                if (cCharAt != 'q') {
                                    if (cCharAt == 's') {
                                        if (i7 == 1) {
                                            n(pVar);
                                        } else {
                                            if (i7 == 2) {
                                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                            }
                                            o(pVar, i7);
                                        }
                                    } else if (cCharAt == 'u' || cCharAt == 'y') {
                                        if (i7 == 2) {
                                            j$.time.i iVar = p.i;
                                            Objects.requireNonNull(pVar, "field");
                                            Objects.requireNonNull(iVar, "baseDate");
                                            m(new p(pVar, iVar));
                                        } else {
                                            if (i7 < 4) {
                                                f = F.NORMAL;
                                            } else {
                                                f = F.EXCEEDS_PAD;
                                            }
                                            p(pVar, i7, 19, f);
                                        }
                                    } else if (cCharAt == 'g') {
                                        f = F.NORMAL;
                                        p(pVar, i7, 19, f);
                                    } else if (cCharAt != 'h' && cCharAt != 'm') {
                                        if (cCharAt != 'n') {
                                            switch (cCharAt) {
                                                case Yu0.b.G /* 68 */:
                                                    if (i7 == 1) {
                                                        n(pVar);
                                                    } else {
                                                        if (i7 != 2 && i7 != 3) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                        }
                                                        p(pVar, i7, 3, F.NOT_NEGATIVE);
                                                    }
                                                    break;
                                                case 'E':
                                                    z = false;
                                                    if (i7 == 1) {
                                                        if (cCharAt == 'e') {
                                                            sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                                            m(sVar2);
                                                            break;
                                                        } else if (cCharAt != 'E') {
                                                            if (i7 == 1) {
                                                                o(pVar, 2);
                                                            } else {
                                                                n(pVar);
                                                            }
                                                            break;
                                                        }
                                                    } else if (cCharAt == 'e') {
                                                        sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                                        m(sVar2);
                                                        break;
                                                    } else if (cCharAt != 'E') {
                                                        if (i7 == 1) {
                                                            o(pVar, 2);
                                                        } else {
                                                            n(pVar);
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                case 'F':
                                                    if (i7 != 1) {
                                                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                    }
                                                    n(pVar);
                                                    break;
                                                case 'G':
                                                    if (i7 != 1 && i7 != 2 && i7 != 3) {
                                                        if (i7 == 4) {
                                                            g2 = G.FULL;
                                                        } else if (i7 != 5) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                        }
                                                    }
                                                    l(pVar, g2);
                                                    break;
                                                case Yu0.b.J /* 72 */:
                                                    if (i7 == 1) {
                                                        n(pVar);
                                                    } else {
                                                        if (i7 == 2) {
                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                        }
                                                        o(pVar, i7);
                                                    }
                                                    break;
                                                default:
                                                    switch (cCharAt) {
                                                        case 'K':
                                                            if (i7 == 1) {
                                                                n(pVar);
                                                            } else {
                                                                if (i7 == 2) {
                                                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                                }
                                                                o(pVar, i7);
                                                            }
                                                            break;
                                                        case Yu0.a.N /* 76 */:
                                                            break;
                                                        case 'M':
                                                            z = false;
                                                            if (i7 == 1) {
                                                                if (cCharAt == 'e') {
                                                                    sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                                                    m(sVar2);
                                                                    break;
                                                                } else if (cCharAt != 'E') {
                                                                    if (i7 == 1) {
                                                                        o(pVar, 2);
                                                                    } else {
                                                                        n(pVar);
                                                                    }
                                                                    break;
                                                                }
                                                            } else if (cCharAt == 'e') {
                                                                sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                                                m(sVar2);
                                                                break;
                                                            } else if (cCharAt != 'E') {
                                                                if (i7 == 1) {
                                                                    o(pVar, 2);
                                                                } else {
                                                                    n(pVar);
                                                                }
                                                                break;
                                                            }
                                                            break;
                                                        case Yu0.a.O /* 78 */:
                                                            break;
                                                        default:
                                                            switch (cCharAt) {
                                                                case 'c':
                                                                    if (i7 == 1) {
                                                                        sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                                                    } else if (i7 == 2) {
                                                                        throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                                    }
                                                                    m(sVar2);
                                                                    break;
                                                                case C3080vp0.n0 /* 100 */:
                                                                    if (i7 == 1) {
                                                                        n(pVar);
                                                                    } else {
                                                                        if (i7 == 2) {
                                                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                                                        }
                                                                        o(pVar, i7);
                                                                    }
                                                                    break;
                                                                case 'e':
                                                                    z = false;
                                                                    if (i7 == 1) {
                                                                        if (cCharAt == 'e') {
                                                                            sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                                                            m(sVar2);
                                                                            break;
                                                                        } else if (cCharAt != 'E') {
                                                                            if (i7 == 1) {
                                                                                o(pVar, 2);
                                                                            } else {
                                                                                n(pVar);
                                                                            }
                                                                            break;
                                                                        }
                                                                    } else if (cCharAt == 'e') {
                                                                        sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                                                        m(sVar2);
                                                                        break;
                                                                    } else if (cCharAt != 'E') {
                                                                        if (i7 == 1) {
                                                                            o(pVar, 2);
                                                                        } else {
                                                                            n(pVar);
                                                                        }
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    if (i7 != 1) {
                                                                        o(pVar, i7);
                                                                    } else {
                                                                        n(pVar);
                                                                    }
                                                                    break;
                                                            }
                                                            break;
                                                    }
                                                    break;
                                            }
                                        }
                                        f = F.NOT_NEGATIVE;
                                        p(pVar, i7, 19, f);
                                    } else if (i7 == 1) {
                                        n(pVar);
                                    } else {
                                        if (i7 == 2) {
                                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                        }
                                        o(pVar, i7);
                                    }
                                }
                                z = true;
                                if (i7 == 1) {
                                    if (cCharAt == 'e') {
                                        sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                        m(sVar2);
                                    } else if (cCharAt != 'E') {
                                        if (i7 == 1) {
                                            n(pVar);
                                        } else {
                                            o(pVar, 2);
                                        }
                                    }
                                } else if (cCharAt == 'e') {
                                    sVar2 = new s(cCharAt, i7, i7, i7, 0);
                                    m(sVar2);
                                } else if (cCharAt != 'E') {
                                    if (i7 == 1) {
                                        n(pVar);
                                    } else {
                                        o(pVar, 2);
                                    }
                                }
                            } else if (i7 == 1) {
                                n(pVar);
                            } else {
                                if (i7 == 2) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                o(pVar, i7);
                            }
                        } else if (i7 != 1) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        g2 = G.SHORT;
                        l(pVar, g2);
                    } else {
                        b(j$.time.temporal.a.NANO_OF_SECOND, i7, i7, false);
                    }
                } else if (cCharAt == 'z') {
                    if (i7 > 4) {
                        throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                    }
                    d(i7 == 4 ? new u(G.FULL, false) : new u(G.SHORT, false));
                } else if (cCharAt == 'V') {
                    if (i7 != 2) {
                        throw new IllegalArgumentException("Pattern letter count must be 2: " + cCharAt);
                    }
                    d(new t(j$.time.temporal.l.l(), "ZoneId()"));
                } else if (cCharAt == 'v') {
                    if (i7 == 1) {
                        uVar = new u(G.SHORT, true);
                    } else {
                        if (i7 != 4) {
                            throw new IllegalArgumentException("Wrong number of  pattern letters: " + cCharAt);
                        }
                        uVar = new u(G.FULL, true);
                    }
                    d(uVar);
                } else {
                    String str4 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i7 < 4) {
                            str2 = "+HHMM";
                            h(str2, str4);
                        } else {
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                                }
                                str3 = "+HH:MM:ss";
                                h(str3, "Z");
                            }
                            g = G.FULL;
                            g(g);
                        }
                    } else if (cCharAt == 'O') {
                        if (i7 == 1) {
                            g = G.SHORT;
                        } else {
                            if (i7 != 4) {
                                throw new IllegalArgumentException("Pattern letter count must be 1 or 4: " + cCharAt);
                            }
                            g = G.FULL;
                        }
                        g(g);
                    } else if (cCharAt == 'X') {
                        if (i7 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        str3 = k.d[i7 + (i7 == 1 ? 0 : 1)];
                        h(str3, "Z");
                    } else if (cCharAt != 'x') {
                        if (cCharAt == 'W') {
                            if (i7 > 1) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            sVar = new s(cCharAt, i7, i7, i7, 0);
                        } else if (cCharAt == 'w') {
                            if (i7 > 2) {
                                throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                            }
                            sVar = new s(cCharAt, i7, i7, 2, 0);
                        } else {
                            if (cCharAt != 'Y') {
                                throw new IllegalArgumentException("Unknown pattern letter: " + cCharAt);
                            }
                            sVar = i7 == 2 ? new s(cCharAt, i7, i7, 2, 0) : new s(cCharAt, i7, i7, 19, 0);
                        }
                        m(sVar);
                    } else {
                        if (i7 > 5) {
                            throw new IllegalArgumentException("Too many pattern letters: " + cCharAt);
                        }
                        if (i7 == 1) {
                            str4 = "+00";
                        } else if (i7 % 2 != 0) {
                            str4 = "+00:00";
                        }
                        str2 = k.d[i7 + (i7 == 1 ? 0 : 1)];
                        h(str2, str4);
                    }
                }
                i5 = (-1) + i2;
            } else if (cCharAt == '\'') {
                int i8 = i5 + 1;
                int i9 = i8;
                while (i9 < str.length()) {
                    if (str.charAt(i9) == '\'') {
                        int i10 = i9 + 1;
                        if (i10 < str.length() && str.charAt(i10) == '\'') {
                            i9 = i10;
                        } else {
                            if (i9 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i8, i9);
                            if (strSubstring.isEmpty()) {
                                e('\'');
                            } else {
                                f(strSubstring.replace("''", "'"));
                            }
                            i5 = i9;
                        }
                    }
                    i9++;
                }
                if (i9 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i8, i9);
                if (strSubstring.isEmpty()) {
                    e('\'');
                } else {
                    f(strSubstring.replace("''", "'"));
                }
                i5 = i9;
            } else if (cCharAt == '[') {
                s();
            } else if (cCharAt == ']') {
                if (this.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                r();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                e(cCharAt);
            }
            i5++;
        }
    }

    public final void k(j$.time.temporal.a aVar, HashMap map) {
        Objects.requireNonNull(aVar, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        G g = G.FULL;
        d(new r(aVar, g, new C0127b(new A(Collections.singletonMap(g, linkedHashMap)))));
    }

    public final void l(j$.time.temporal.p pVar, G g) {
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(g, "textStyle");
        d(new r(pVar, g, B.d()));
    }

    public final void n(j$.time.temporal.p pVar) {
        Objects.requireNonNull(pVar, "field");
        m(new j(pVar, 1, 19, F.NORMAL));
    }

    public final void o(j$.time.temporal.p pVar, int i2) {
        Objects.requireNonNull(pVar, "field");
        if (i2 >= 1 && i2 <= 19) {
            m(new j(pVar, i2, i2, F.NOT_NEGATIVE));
        } else {
            throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
        }
    }

    public final void p(j$.time.temporal.p pVar, int i2, int i3, F f) {
        if (i2 == i3 && f == F.NOT_NEGATIVE) {
            o(pVar, i3);
            return;
        }
        Objects.requireNonNull(pVar, "field");
        Objects.requireNonNull(f, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            m(new j(pVar, i2, i3, f));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void q() {
        d(new t(h, "ZoneRegionId()"));
    }

    public final void r() {
        v vVar = this.a;
        if (vVar.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (vVar.c.size() <= 0) {
            this.a = this.a.b;
            return;
        }
        v vVar2 = this.a;
        C0130e c0130e = new C0130e(vVar2.c, vVar2.d);
        this.a = this.a.b;
        d(c0130e);
    }

    public final void s() {
        v vVar = this.a;
        vVar.g = -1;
        this.a = new v(vVar);
    }

    public final void t() {
        d(q.INSENSITIVE);
    }

    public final void u() {
        d(q.SENSITIVE);
    }

    public final void v() {
        d(q.LENIENT);
    }

    public final void w() {
        d(q.STRICT);
    }

    final DateTimeFormatter x(E e, j$.time.chrono.u uVar) {
        return z(Locale.getDefault(), e, uVar);
    }

    public final DateTimeFormatter y(Locale locale) {
        return z(locale, E.SMART, null);
    }
}
