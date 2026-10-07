package j$.time.format;

import j$.time.C0111b;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
class j implements InterfaceC0131f {
    static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    final j$.time.temporal.p a;
    final int b;
    final int c;
    private final F d;
    final int e;

    j(j$.time.temporal.p pVar, int i, int i2, F f2) {
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = 0;
    }

    protected j(j$.time.temporal.p pVar, int i, int i2, F f2, int i3) {
        this.a = pVar;
        this.b = i;
        this.c = i2;
        this.d = f2;
        this.e = i3;
    }

    long b(y yVar, long j) {
        return j;
    }

    boolean c(w wVar) {
        int i = this.e;
        return i == -1 || (i > 0 && this.b == this.c && this.d == F.NOT_NEGATIVE);
    }

    int d(w wVar, long j, int i, int i2) {
        return wVar.o(this.a, j, i, i2);
    }

    j e() {
        if (this.e == -1) {
            return this;
        }
        return new j(this.a, this.b, this.c, this.d, -1);
    }

    j f(int i) {
        int i2 = this.e + i;
        return new j(this.a, this.b, this.c, this.d, i2);
    }

    @Override // j$.time.format.InterfaceC0131f
    public boolean p(y yVar, StringBuilder sb) {
        j$.time.temporal.p pVar = this.a;
        Long lE = yVar.e(pVar);
        if (lE == null) {
            return false;
        }
        long jB = b(yVar, lE.longValue());
        C cB = yVar.b();
        String string = jB == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jB));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new C0111b("Field " + pVar + " cannot be printed as the value " + jB + " exceeds the maximum print width of " + i);
        }
        cB.getClass();
        int i2 = this.b;
        F f2 = this.d;
        if (jB >= 0) {
            int i3 = AbstractC0128c.a[f2.ordinal()];
            if (i3 == 1 ? !(i2 >= 19 || jB < f[i2]) : i3 == 2) {
                sb.append('+');
            }
        } else {
            int i4 = AbstractC0128c.a[f2.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new C0111b("Field " + pVar + " cannot be printed as the value " + jB + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0154  */
    /* JADX WARN: Code duplicated, block: B:108:0x015c  */
    /* JADX WARN: Code duplicated, block: B:111:0x0171  */
    @Override // j$.time.format.InterfaceC0131f
    public int r(w wVar, CharSequence charSequence, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        BigInteger bigIntegerDivide;
        long j;
        long j2;
        int length = charSequence.length();
        if (i == length) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        wVar.g().getClass();
        int i4 = this.c;
        F f2 = this.d;
        int i5 = this.b;
        int i6 = 0;
        if (cCharAt == '+') {
            if (!f2.p(true, wVar.l(), i5 == i4)) {
                return ~i;
            }
            i2 = i + 1;
            z = false;
            z2 = true;
        } else {
            wVar.g().getClass();
            if (cCharAt == '-') {
                if (!f2.p(false, wVar.l(), i5 == i4)) {
                    return ~i;
                }
                i2 = i + 1;
                z = true;
            } else {
                if (f2 == F.ALWAYS && wVar.l()) {
                    return ~i;
                }
                i2 = i;
                z = false;
            }
            z2 = false;
        }
        int i7 = (wVar.l() || c(wVar)) ? i5 : 1;
        int i8 = i2 + i7;
        if (i8 > length) {
            return ~i2;
        }
        if (!wVar.l() && !c(wVar)) {
            i4 = 9;
        }
        int i9 = this.e;
        int iMax = Math.max(i9, 0) + i4;
        while (true) {
            BigInteger bigIntegerAdd = null;
            if (i6 >= 2) {
                i3 = i2;
                bigIntegerDivide = null;
                j = 0;
                break;
            }
            int iMin = Math.min(iMax + i2, length);
            int i10 = i2;
            long j3 = 0;
            while (i10 < iMin) {
                int i11 = i10 + 1;
                int iA = wVar.g().a(charSequence.charAt(i10));
                if (iA < 0) {
                    if (i10 >= i8) {
                        break;
                    }
                    return ~i2;
                }
                if (i11 - i2 > 18) {
                    if (bigIntegerAdd == null) {
                        bigIntegerAdd = BigInteger.valueOf(j3);
                    }
                    bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(iA));
                } else {
                    j3 = (j3 * 10) + ((long) iA);
                }
                iMin = iMin;
                i10 = i11;
            }
            if (i9 <= 0 || i6 != 0) {
                i3 = i10;
                bigIntegerDivide = bigIntegerAdd;
                j = j3;
                break;
            }
            iMax = Math.max(i7, (i10 - i2) - i9);
            i6++;
        }
        if (z) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && wVar.l()) {
                    return ~(i2 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && wVar.l()) {
                    return ~(i2 - 1);
                }
                j2 = -j;
            }
            if (bigIntegerDivide != null) {
                return d(wVar, j2, i2, i3);
            }
            if (bigIntegerDivide.bitLength() > 63) {
                bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
                i3--;
            }
            return d(wVar, bigIntegerDivide.longValue(), i2, i3);
        }
        if (f2 == F.EXCEEDS_PAD && wVar.l()) {
            int i12 = i3 - i2;
            if (z2) {
                if (i12 <= i5) {
                    return ~(i2 - 1);
                }
            } else if (i12 > i5) {
                return ~i2;
            }
        }
        j2 = j;
        if (bigIntegerDivide != null) {
            return d(wVar, j2, i2, i3);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i3--;
        }
        return d(wVar, bigIntegerDivide.longValue(), i2, i3);
    }

    public String toString() {
        int i = this.c;
        j$.time.temporal.p pVar = this.a;
        F f2 = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && f2 == F.NORMAL) {
            return "Value(" + pVar + ")";
        }
        if (i2 == i && f2 == F.NOT_NEGATIVE) {
            return "Value(" + pVar + "," + i2 + ")";
        }
        return "Value(" + pVar + "," + i2 + "," + i + "," + f2 + ")";
    }
}
