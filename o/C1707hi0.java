package o;

/* JADX INFO: renamed from: o.hi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1707hi0 {
    public static final long a = 2147483647L;

    private C1707hi0() {
    }

    public static void a(long j) {
        if (j < 0 || j > a) {
            throw new C1962kG(j);
        }
    }

    public static String b(long j) {
        a(j);
        StringBuilder sb = new StringBuilder();
        long j2 = j % 60;
        long j3 = j / 60;
        long j4 = j3 % 60;
        long j5 = j3 / 60;
        long j6 = j5 % 24;
        long j7 = j5 / 24;
        long j8 = j7 % 7;
        long j9 = j7 / 7;
        if (j9 > 0) {
            sb.append(j9);
            sb.append("W");
        }
        if (j8 > 0) {
            sb.append(j8);
            sb.append("D");
        }
        if (j6 > 0) {
            sb.append(j6);
            sb.append("H");
        }
        if (j4 > 0) {
            sb.append(j4);
            sb.append("M");
        }
        if (j2 > 0 || (j9 == 0 && j8 == 0 && j6 == 0 && j4 == 0)) {
            sb.append(j2);
            sb.append("S");
        }
        return sb.toString();
    }

    public static long c(String str, boolean z) {
        if (str != null && str.length() != 0) {
            if (Character.isDigit(str.charAt(0))) {
                long j = 0;
                long j2 = 0;
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt = str.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        long numericValue = (10 * j2) + ((long) Character.getNumericValue(cCharAt));
                        if (numericValue < j2) {
                            throw new NumberFormatException();
                        }
                        j2 = numericValue;
                    } else {
                        char upperCase = Character.toUpperCase(cCharAt);
                        if (upperCase == 'D') {
                            j2 *= 24;
                            j2 *= 60;
                            j2 *= 60;
                        } else {
                            if (upperCase == 'H') {
                                j2 *= 60;
                            } else if (upperCase != 'M') {
                                if (upperCase != 'S') {
                                    if (upperCase != 'W') {
                                        throw new NumberFormatException();
                                    }
                                    j2 *= 7;
                                    j2 *= 24;
                                    j2 *= 60;
                                }
                            }
                            j2 *= 60;
                        }
                        j += j2;
                        if (j > 4294967295L) {
                            throw new NumberFormatException();
                        }
                        j2 = 0;
                    }
                }
                if (j == 0) {
                    j = j2;
                }
                if (j <= 4294967295L) {
                    return (j <= a || !z) ? j : a;
                }
                throw new NumberFormatException();
            }
        }
        throw new NumberFormatException();
    }

    public static long d(String str) {
        return c(str, true);
    }
}
