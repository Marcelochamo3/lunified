package o;

import j$.util.Objects;
import java.io.PrintStream;
import java.net.InetAddress;

/* JADX INFO: loaded from: classes.dex */
public class Dy0 {
    static C2848tT a = null;
    static int b = 1;
    static int c = 1;

    public static void a(AQ aq, long j) {
        PrintStream printStream = System.out;
        printStream.getClass();
        printStream.getClass();
        printStream.getClass();
    }

    public static void b(String[] strArr) throws Rw0 {
        boolean z;
        String strSubstring;
        int i;
        int i2;
        String strSubstring2;
        String strSubstring3;
        String strSubstring4;
        String strSubstring5;
        if (strArr.length < 1) {
            c();
        }
        Qd0 qd0 = null;
        boolean z2 = false;
        try {
            if (strArr[0].startsWith("@")) {
                strSubstring = strArr[0].substring(1);
                i = 1;
            } else {
                strSubstring = null;
                i = 0;
            }
            qd0 = strSubstring != null ? new Qd0(strSubstring) : new Qd0();
            int i3 = i + 1;
            String str = strArr[i];
            if (str.equals("-x")) {
                i2 = i + 2;
                a = C3020v80.a(strArr[i3]);
                b = 12;
                c = 1;
            } else {
                a = C2848tT.n(str, C2848tT.v);
                int iF = C3080vp0.f(strArr[i3]);
                b = iF;
                if (iF < 0) {
                    b = 1;
                } else {
                    i3 = i + 2;
                }
                int iC = C0344Ci.c(strArr[i3]);
                c = iC;
                if (iC < 0) {
                    c = 1;
                    i2 = i3;
                } else {
                    i2 = i3 + 1;
                }
            }
            z = false;
            while (strArr[i2].startsWith("-") && strArr[i2].length() > 1) {
                try {
                    char cCharAt = strArr[i2].charAt(1);
                    if (cCharAt == 'b') {
                        if (strArr[i2].length() > 2) {
                            strSubstring2 = strArr[i2].substring(2);
                        } else {
                            i2++;
                            strSubstring2 = strArr[i2];
                        }
                        try {
                            qd0.J(InetAddress.getByName(strSubstring2));
                        } catch (Exception unused) {
                            System.out.getClass();
                            return;
                        }
                    } else if (cCharAt == 'i') {
                        qd0.i(true);
                    } else if (cCharAt == 'k') {
                        if (strArr[i2].length() > 2) {
                            strSubstring3 = strArr[i2].substring(2);
                        } else {
                            i2++;
                            strSubstring3 = strArr[i2];
                        }
                        String[] strArrSplit = strSubstring3.split("[:/]", 3);
                        int length = strArrSplit.length;
                        if (length == 2) {
                            qd0.c(new C1511fi0(C1511fi0.i, strArrSplit[0], strArrSplit[1]));
                        } else {
                            if (length != 3) {
                                throw new IllegalArgumentException("Invalid TSIG key specification");
                            }
                            qd0.c(new C1511fi0(strArrSplit[0], strArrSplit[1], strArrSplit[2]));
                        }
                    } else if (cCharAt == 't') {
                        qd0.o(true);
                    } else if (cCharAt == 'd') {
                        G70.g(qd0, 0, 0, 32768, new AbstractC2304np[0]);
                    } else {
                        if (cCharAt == 'e') {
                            if (strArr[i2].length() > 2) {
                                strSubstring4 = strArr[i2].substring(2);
                            } else {
                                i2++;
                                strSubstring4 = strArr[i2];
                            }
                            int i4 = Integer.parseInt(strSubstring4);
                            if (i4 >= 0 && i4 <= 1) {
                                G70.f(qd0, i4);
                            }
                            System.out.getClass();
                            return;
                        }
                        if (cCharAt == 'p') {
                            if (strArr[i2].length() > 2) {
                                strSubstring5 = strArr[i2].substring(2);
                            } else {
                                i2++;
                                strSubstring5 = strArr[i2];
                            }
                            int i5 = Integer.parseInt(strSubstring5);
                            if (i5 >= 0 && i5 <= 65535) {
                                qd0.g(i5);
                            }
                            System.out.getClass();
                            return;
                        }
                        if (cCharAt != 'q') {
                            PrintStream printStream = System.out;
                            printStream.getClass();
                            String str2 = strArr[i2];
                            printStream.getClass();
                        } else {
                            z = true;
                        }
                    }
                    i2++;
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    z2 = z;
                    if (a == null) {
                        c();
                    }
                    z = z2;
                }
            }
        } catch (ArrayIndexOutOfBoundsException unused3) {
        }
        if (qd0 == null) {
            qd0 = new Qd0();
        }
        AQ aqW = AQ.w(H50.z(a, b, c));
        if (z) {
            System.out.getClass();
        }
        if (b != 252) {
            a(G70.b(qd0, aqW), System.currentTimeMillis() - System.currentTimeMillis());
            return;
        }
        PrintStream printStream2 = System.out;
        Objects.toString(a);
        printStream2.getClass();
        yy0 yy0VarS = yy0.s(a, qd0.s(), qd0.x());
        yy0VarS.F(qd0.j());
        try {
            yy0VarS.A(new a());
        } catch (xy0 e) {
            throw new Rw0(e.getMessage());
        }
    }

    public static void c() {
        PrintStream printStream = System.out;
        printStream.getClass();
        printStream.getClass();
        System.exit(0);
    }

    public static class a implements yy0.d {
        @Override // o.yy0.d
        public void e(H50 h50) {
            System.out.getClass();
        }

        @Override // o.yy0.d
        public void a() {
        }

        @Override // o.yy0.d
        public void b() {
        }

        @Override // o.yy0.d
        public void c(H50 h50) {
        }

        @Override // o.yy0.d
        public void d(H50 h50) {
        }
    }
}
