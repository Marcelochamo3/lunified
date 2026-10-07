package j$.time.format;

import j$.time.EnumC0125d;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
final class s extends j {
    private char g;
    private int h;

    s(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, F.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    private j g(Locale locale) {
        j$.time.temporal.p pVarI;
        TemporalUnit temporalUnit = j$.time.temporal.t.h;
        Objects.requireNonNull(locale, "locale");
        Calendar calendar = Calendar.getInstance(new Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.t tVarG = j$.time.temporal.t.g(EnumC0125d.SUNDAY.V(calendar.getFirstDayOfWeek() - 1), calendar.getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            pVarI = tVarG.i();
        } else {
            if (c == 'Y') {
                j$.time.temporal.p pVarH = tVarG.h();
                int i = this.h;
                if (i == 2) {
                    return new p(pVarH, p.i, this.e);
                }
                return new j(pVarH, i, 19, i < 4 ? F.NORMAL : F.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                pVarI = tVarG.d();
            } else {
                if (c != 'w') {
                    throw new IllegalStateException("unreachable");
                }
                pVarI = tVarG.j();
            }
        }
        return new j(pVarI, this.b, this.c, F.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.j
    final j e() {
        if (this.e == -1) {
            return this;
        }
        return new s(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.j
    final j f(int i) {
        return new s(this.g, this.h, this.b, this.c, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        return g(yVar.c()).p(yVar, sb);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        return g(wVar.i()).r(wVar, charSequence, i);
    }

    @Override // j$.time.format.j
    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c == 'Y') {
            if (i == 1) {
                str2 = "WeekBasedYear";
            } else if (i == 2) {
                str2 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
            } else {
                sb.append("WeekBasedYear,");
                sb.append(i);
                sb.append(",19,");
                sb.append(i < 4 ? F.NORMAL : F.EXCEEDS_PAD);
            }
            sb.append(str2);
        } else {
            if (c == 'W') {
                str = "WeekOfMonth";
            } else if (c == 'c' || c == 'e') {
                str = "DayOfWeek";
            } else {
                if (c == 'w') {
                    str = "WeekOfWeekBasedYear";
                }
                sb.append(",");
                sb.append(i);
            }
            sb.append(str);
            sb.append(",");
            sb.append(i);
        }
        sb.append(")");
        return sb.toString();
    }
}
