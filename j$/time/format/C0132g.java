package j$.time.format;

import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: renamed from: j$.time.format.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C0132g extends j {
    private final boolean g;

    C0132g(j$.time.temporal.a aVar, int i, int i2, boolean z) {
        this(aVar, i, i2, z, 0);
        Objects.requireNonNull(aVar, "field");
        if (!aVar.p().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    C0132g(j$.time.temporal.p pVar, int i, int i2, boolean z, int i3) {
        super(pVar, i, i2, F.NOT_NEGATIVE, i3);
        this.g = z;
    }

    @Override // j$.time.format.j
    final boolean c(w wVar) {
        return wVar.l() && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.j
    final j e() {
        if (this.e == -1) {
            return this;
        }
        return new C0132g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.j
    final j f(int i) {
        return new C0132g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0131f
    public final boolean p(y yVar, StringBuilder sb) {
        j$.time.temporal.p pVar = this.a;
        Long lE = yVar.e(pVar);
        if (lE == null) {
            return false;
        }
        C cB = yVar.b();
        long jLongValue = lE.longValue();
        j$.time.temporal.r rVarP = pVar.p();
        rVarP.b(jLongValue, pVar);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(rVarP.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(rVarP.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            cB.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            cB.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            cB.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.j, j$.time.format.InterfaceC0131f
    public final int r(w wVar, CharSequence charSequence, int i) {
        int i2 = (wVar.l() || c(wVar)) ? this.b : 0;
        int i3 = (wVar.l() || c(wVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i == length) {
            return i2 > 0 ? ~i : i;
        }
        if (this.g) {
            char cCharAt = charSequence.charAt(i);
            wVar.g().getClass();
            if (cCharAt != '.') {
                return i2 > 0 ? ~i : i;
            }
            i++;
        }
        int i4 = i;
        int i5 = i2 + i4;
        if (i5 > length) {
            return ~i4;
        }
        int iMin = Math.min(i3 + i4, length);
        int i6 = i4;
        int i7 = 0;
        while (i6 < iMin) {
            int i8 = i6 + 1;
            int iA = wVar.g().a(charSequence.charAt(i6));
            if (iA < 0) {
                if (i8 >= i5) {
                    break;
                }
                return ~i4;
            }
            i7 = (i7 * 10) + iA;
            i6 = i8;
        }
        BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i6 - i4);
        j$.time.temporal.r rVarP = this.a.p();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(rVarP.e());
        return wVar.o(this.a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(rVarP.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i6);
    }

    @Override // j$.time.format.j
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
