package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class w {
    private DateTimeFormatter a;
    private boolean b = true;
    private boolean c = true;
    private final ArrayList d;
    private ArrayList e;

    w(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.a = dateTimeFormatter;
        arrayList.add(new D());
    }

    static boolean c(char c, char c2) {
        return c == c2 || Character.toUpperCase(c) == Character.toUpperCase(c2) || Character.toLowerCase(c) == Character.toLowerCase(c2);
    }

    private D e() {
        ArrayList arrayList = this.d;
        return (D) arrayList.get(arrayList.size() - 1);
    }

    final void a(o oVar) {
        if (this.e == null) {
            this.e = new ArrayList();
        }
        this.e.add(oVar);
    }

    final boolean b(char c, char c2) {
        if (this.b) {
            return c == c2;
        }
        return c(c, c2);
    }

    final w d() {
        w wVar = new w(this.a);
        wVar.b = this.b;
        wVar.c = this.c;
        return wVar;
    }

    final void f(boolean z) {
        ArrayList arrayList = this.d;
        arrayList.remove(z ? arrayList.size() - 2 : arrayList.size() - 1);
    }

    final C g() {
        return this.a.b();
    }

    final j$.time.chrono.n h() {
        j$.time.chrono.n nVar = e().c;
        if (nVar != null) {
            return nVar;
        }
        j$.time.chrono.n nVarA = this.a.a();
        return nVarA == null ? j$.time.chrono.u.d : nVarA;
    }

    final Locale i() {
        return this.a.c();
    }

    final Long j(j$.time.temporal.a aVar) {
        return (Long) e().a.get(aVar);
    }

    final boolean k() {
        return this.b;
    }

    final boolean l() {
        return this.c;
    }

    final void m(boolean z) {
        this.b = z;
    }

    final void n(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        e().b = zoneId;
    }

    final int o(j$.time.temporal.p pVar, long j, int i, int i2) {
        Objects.requireNonNull(pVar, "field");
        Long l = (Long) e().a.put(pVar, Long.valueOf(j));
        return (l == null || l.longValue() == j) ? i2 : ~i;
    }

    final void p() {
        e().d = true;
    }

    final void q(boolean z) {
        this.c = z;
    }

    final void r() {
        ArrayList arrayList = this.d;
        D dE = e();
        dE.getClass();
        D d = new D();
        d.a.putAll(dE.a);
        d.b = dE.b;
        d.c = dE.c;
        d.d = dE.d;
        arrayList.add(d);
    }

    final boolean s(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3) {
        if (i + i3 > charSequence.length() || i2 + i3 > charSequence2.length()) {
            return false;
        }
        if (this.b) {
            for (int i4 = 0; i4 < i3; i4++) {
                if (charSequence.charAt(i + i4) != charSequence2.charAt(i2 + i4)) {
                    return false;
                }
            }
            return true;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            char cCharAt = charSequence.charAt(i + i5);
            char cCharAt2 = charSequence2.charAt(i2 + i5);
            if (cCharAt != cCharAt2 && Character.toUpperCase(cCharAt) != Character.toUpperCase(cCharAt2) && Character.toLowerCase(cCharAt) != Character.toLowerCase(cCharAt2)) {
                return false;
            }
        }
        return true;
    }

    final TemporalAccessor t(E e, Set set) {
        D dE = e();
        dE.c = h();
        ZoneId zoneIdD = dE.b;
        if (zoneIdD == null) {
            zoneIdD = this.a.d();
        }
        dE.b = zoneIdD;
        dE.i(e, set);
        return dE;
    }

    public final String toString() {
        return e().toString();
    }
}
