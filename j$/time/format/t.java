package j$.time.format;

import j$.time.C0111b;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalQuery;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
class t implements InterfaceC0131f {
    private static volatile AbstractMap.SimpleImmutableEntry c;
    private static volatile AbstractMap.SimpleImmutableEntry d;
    private final TemporalQuery a;
    private final String b;

    t(TemporalQuery temporalQuery, String str) {
        this.a = temporalQuery;
        this.b = str;
    }

    private static int b(w wVar, CharSequence charSequence, int i, int i2, k kVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length() || charSequence.charAt(i2) == '0' || wVar.b(charSequence.charAt(i2), 'Z')) {
            wVar.n(ZoneId.of(upperCase));
            return i2;
        }
        w wVarD = wVar.d();
        int iR = kVar.r(wVarD, charSequence, i2);
        try {
            if (iR >= 0) {
                wVar.n(ZoneId.X(upperCase, ZoneOffset.f0((int) wVarD.j(j$.time.temporal.a.OFFSET_SECONDS).longValue())));
                return iR;
            }
            if (kVar == k.e) {
                return ~i;
            }
            wVar.n(ZoneId.of(upperCase));
            return i2;
        } catch (C0111b unused) {
            return ~i;
        }
    }

    protected n a(w wVar) {
        Set setA = j$.time.zone.j.a();
        int size = setA.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = wVar.k() ? c : d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = wVar.k() ? c : d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), n.g(setA, wVar));
                        if (wVar.k()) {
                            c = simpleImmutableEntry;
                        } else {
                            d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (n) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.InterfaceC0131f
    public boolean p(y yVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) yVar.f(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.o());
        return true;
    }

    @Override // j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            return b(wVar, charSequence, i, i, k.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char cCharAt2 = charSequence.charAt(i + 1);
            if (wVar.b(cCharAt, 'U') && wVar.b(cCharAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !wVar.b(charSequence.charAt(i3), 'C')) ? b(wVar, charSequence, i, i3, k.f) : b(wVar, charSequence, i, i4, k.f);
            }
            if (wVar.b(cCharAt, 'G') && length >= (i2 = i + 3) && wVar.b(cCharAt2, 'M') && wVar.b(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !wVar.b(charSequence.charAt(i2), '0')) {
                    return b(wVar, charSequence, i, i2, k.f);
                }
                wVar.n(ZoneId.of("GMT0"));
                return i5;
            }
        }
        n nVarA = a(wVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String strD = nVarA.d(charSequence, parsePosition);
        if (strD != null) {
            wVar.n(ZoneId.of(strD));
            return parsePosition.getIndex();
        }
        if (!wVar.b(cCharAt, 'Z')) {
            return ~i;
        }
        wVar.n(ZoneOffset.UTC);
        return i + 1;
    }

    public final String toString() {
        return this.b;
    }
}
