package o;

import java.util.ArrayList;

/* JADX INFO: renamed from: o.iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1836iz {
    public long a;
    public long b;
    public long c;
    public final String d;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final C2848tT i;
    private long j;

    public C1836iz(long j, long j2, long j3, String str, int i, int i2, long j4, String str2, C2848tT c2848tT) {
        if (j < 0 || j2 < 0 || j > j2 || j3 <= 0) {
            throw new IllegalArgumentException("invalid range specification");
        }
        if (!d(i)) {
            throw new IllegalArgumentException("unsupported type");
        }
        C0344Ci.a(i2);
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = j4;
        this.h = str2;
        this.i = c2848tT;
        this.j = j;
    }

    private String c(String str, long j) throws Ri0 {
        int i;
        boolean z;
        long j2;
        long j3;
        String hexString;
        boolean z2;
        byte b;
        byte[] bytes = str.getBytes();
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        boolean z3 = false;
        while (i2 < bytes.length) {
            char c = (char) (bytes[i2] & 255);
            if (z3) {
                sb.append(c);
                i = 1;
                z3 = false;
            } else if (c != '\\') {
                if (c == '$') {
                    int i3 = i2 + 1;
                    if (i3 >= bytes.length || (b = bytes[i3]) != 36) {
                        long j4 = 10;
                        if (i3 >= bytes.length || bytes[i3] != 123) {
                            z = false;
                            j2 = 0;
                            j3 = 0;
                        } else {
                            int i4 = i2 + 2;
                            if (i4 >= bytes.length || bytes[i4] != 45) {
                                z2 = false;
                            } else {
                                i3 = i4;
                                z2 = true;
                            }
                            j3 = 0;
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= bytes.length) {
                                    break;
                                }
                                c = (char) (bytes[i5] & 255);
                                if (c == ',' || c == '}') {
                                    i3 = i5;
                                    break;
                                }
                                if (c < '0' || c > '9') {
                                    throw new Ri0("invalid offset");
                                }
                                c = (char) (c - '0');
                                j3 = (j3 * 10) + ((long) c);
                                i3 = i5;
                            }
                            if (z2) {
                                j3 = -j3;
                            }
                            long j5 = 0;
                            if (c == ',') {
                                while (true) {
                                    int i6 = i3 + 1;
                                    if (i6 >= bytes.length) {
                                        break;
                                    }
                                    c = (char) (bytes[i6] & 255);
                                    if (c == ',' || c == '}') {
                                        i3 = i6;
                                        break;
                                    }
                                    if (c < '0' || c > '9') {
                                        throw new Ri0("invalid width");
                                    }
                                    c = (char) (c - '0');
                                    j5 = (j5 * 10) + ((long) c);
                                    i3 = i6;
                                }
                            }
                            if (c != ',') {
                                z = false;
                            } else {
                                i3++;
                                if (i3 == bytes.length) {
                                    throw new Ri0("invalid base");
                                }
                                char c2 = (char) (bytes[i3] & 255);
                                if (c2 == 'o') {
                                    z = false;
                                    j4 = 8;
                                } else {
                                    if (c2 == 'x') {
                                        z = false;
                                    } else if (c2 == 'X') {
                                        z = true;
                                    } else {
                                        if (c2 != 'd') {
                                            throw new Ri0("invalid base");
                                        }
                                        z = false;
                                    }
                                    j4 = 16;
                                }
                            }
                            int i7 = i3 + 1;
                            if (i7 == bytes.length || bytes[i7] != 125) {
                                throw new Ri0("invalid modifiers");
                            }
                            i2 = i7;
                            j2 = j5;
                        }
                        long j6 = j + j3;
                        if (j6 < 0) {
                            throw new Ri0("invalid offset expansion");
                        }
                        if (j4 == 8) {
                            hexString = Long.toOctalString(j6);
                        } else {
                            hexString = j4 == 16 ? Long.toHexString(j6) : Long.toString(j6);
                        }
                        if (z) {
                            hexString = hexString.toUpperCase();
                        }
                        if (j2 != 0 && j2 > hexString.length()) {
                            int length = ((int) j2) - hexString.length();
                            while (true) {
                                int i8 = length - 1;
                                if (length <= 0) {
                                    break;
                                }
                                sb.append('0');
                                length = i8;
                            }
                        }
                        sb.append(hexString);
                    } else {
                        sb.append((char) (b & 255));
                        i2 = i3;
                    }
                } else {
                    sb.append(c);
                }
                i = 1;
            } else {
                if (i2 + 1 == bytes.length) {
                    throw new Ri0("invalid escape character");
                }
                i = 1;
                z3 = true;
            }
            i2 += i;
        }
        return sb.toString();
    }

    public static boolean d(int i) {
        C3080vp0.a(i);
        return i == 12 || i == 5 || i == 39 || i == 1 || i == 28 || i == 2;
    }

    public H50[] a() throws Ri0 {
        ArrayList arrayList = new ArrayList();
        long j = this.a;
        while (j < this.b) {
            arrayList.add(H50.n(C2848tT.n(c(this.d, this.j), this.i), this.e, this.f, this.g, c(this.h, this.j), this.i));
            j += this.c;
        }
        return (H50[]) arrayList.toArray(new H50[0]);
    }

    public H50 b() throws Ri0 {
        long j = this.j;
        if (j > this.b) {
            return null;
        }
        C2848tT c2848tTN = C2848tT.n(c(this.d, j), this.i);
        String strC = c(this.h, this.j);
        this.j += this.c;
        return H50.n(c2848tTN, this.e, this.f, this.g, strC, this.i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("$GENERATE ");
        sb.append(this.a);
        sb.append("-");
        sb.append(this.b);
        if (this.c > 1) {
            sb.append("/");
            sb.append(this.c);
        }
        sb.append(" ");
        sb.append(this.d);
        sb.append(" ");
        sb.append(this.g);
        sb.append(" ");
        if (this.f != 1 || !EW.a("noPrintIN")) {
            sb.append(C0344Ci.b(this.f));
            sb.append(" ");
        }
        sb.append(C3080vp0.e(this.e));
        sb.append(" ");
        return AbstractC1701hf0.h(sb, this.h, " ");
    }
}
