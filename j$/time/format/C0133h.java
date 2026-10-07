package j$.time.format;

import j$.time.ZoneOffset;
import j$.time.chrono.AbstractC0121i;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;

/* JADX INFO: renamed from: j$.time.format.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0133h implements InterfaceC0131f {
    @Override // j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        Long lE = yVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        TemporalAccessor temporalAccessorD = yVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = temporalAccessorD.g(aVar) ? Long.valueOf(yVar.d().x(aVar)) : null;
        int i = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iU = aVar.U(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j = jLongValue - 253402300800L;
            long jK = j$.com.android.tools.r8.a.k(j, 315569520000L) + 1;
            j$.time.k kVarE0 = j$.time.k.e0(j$.com.android.tools.r8.a.j(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jK > 0) {
                sb.append('+');
                sb.append(jK);
            }
            sb.append(kVarE0);
            if (kVarE0.X() == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = jLongValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            j$.time.k kVarE1 = j$.time.k.e0(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(kVarE1);
            if (kVarE1.X() == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (kVarE1.Y() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (iU > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (iU <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = iU / i2;
                sb.append((char) (i3 + 48));
                iU -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        int i2;
        int i3;
        v vVar = new v();
        vVar.a(DateTimeFormatter.h);
        vVar.e('T');
        j$.time.temporal.a aVar = j$.time.temporal.a.HOUR_OF_DAY;
        vVar.o(aVar, 2);
        vVar.e(':');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MINUTE_OF_HOUR;
        vVar.o(aVar2, 2);
        vVar.e(':');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.SECOND_OF_MINUTE;
        vVar.o(aVar3, 2);
        j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
        int i4 = 0;
        vVar.b(aVar4, 0, 9, true);
        vVar.e('Z');
        C0130e c0130eF = vVar.y(Locale.getDefault()).f();
        w wVarD = wVar.d();
        int iR = c0130eF.r(wVarD, charSequence, i);
        if (iR < 0) {
            return iR;
        }
        long jLongValue = wVarD.j(j$.time.temporal.a.YEAR).longValue();
        int iIntValue = wVarD.j(j$.time.temporal.a.MONTH_OF_YEAR).intValue();
        int iIntValue2 = wVarD.j(j$.time.temporal.a.DAY_OF_MONTH).intValue();
        int iIntValue3 = wVarD.j(aVar).intValue();
        int iIntValue4 = wVarD.j(aVar2).intValue();
        Long lJ = wVarD.j(aVar3);
        Long lJ2 = wVarD.j(aVar4);
        int iIntValue5 = lJ != null ? lJ.intValue() : 0;
        int iIntValue6 = lJ2 != null ? lJ2.intValue() : 0;
        if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
            i3 = iIntValue5;
            i4 = 1;
            i2 = 0;
        } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
            wVar.p();
            i2 = iIntValue3;
            i3 = 59;
        } else {
            i2 = iIntValue3;
            i3 = iIntValue5;
        }
        try {
            return wVar.o(aVar4, iIntValue6, i, wVar.o(j$.time.temporal.a.INSTANT_SECONDS, j$.com.android.tools.r8.a.l(jLongValue / 10000, 315569520000L) + AbstractC0121i.n(j$.time.k.c0(((int) jLongValue) % 10000, iIntValue, iIntValue2, i2, iIntValue4, i3).g0(i4), ZoneOffset.UTC), i, iR));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
