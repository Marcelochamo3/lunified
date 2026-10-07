package o;

import java.io.PrintStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Ky0 {
    public static void a(String[] strArr) {
        String str;
        String str2 = null;
        int i = -1;
        C1511fi0 c1511fi0 = null;
        int i2 = 0;
        boolean z = false;
        int i3 = 53;
        while (i2 < strArr.length) {
            if (strArr[i2].equals("-i")) {
                i2++;
                i = Integer.parseInt(strArr[i2]);
                if (i < 0) {
                    b("invalid serial number");
                }
            } else if (strArr[i2].equals("-k")) {
                i2++;
                String str3 = strArr[i2];
                int iIndexOf = str3.indexOf(47);
                if (iIndexOf < 0) {
                    b("invalid key");
                }
                c1511fi0 = new C1511fi0(C1511fi0.i, str3.substring(0, iIndexOf), str3.substring(iIndexOf + 1));
            } else if (strArr[i2].equals("-s")) {
                i2++;
                str2 = strArr[i2];
            } else if (strArr[i2].equals("-p")) {
                i2++;
                int i4 = Integer.parseInt(strArr[i2]);
                if (i4 < 0 || i4 > 65535) {
                    b("invalid port");
                }
                i3 = i4;
            } else if (strArr[i2].equals("-f")) {
                z = true;
            } else if (!strArr[i2].startsWith("-")) {
                break;
            } else {
                b("invalid option");
            }
            i2++;
        }
        if (i2 >= strArr.length) {
            b("no zone name specified");
        }
        C2848tT c2848tTM = C2848tT.m(strArr[i2]);
        if (str2 == null) {
            C1578gM c1578gM = new C1578gM(c2848tTM, 2);
            H50[] h50ArrU = c1578gM.u();
            if (h50ArrU == null) {
                PrintStream printStream = System.out;
                c1578gM.k();
                printStream.getClass();
                System.exit(1);
            }
            String strF = h50ArrU[0].F();
            System.out.getClass();
            str = strF;
        } else {
            str = str2;
        }
        yy0 yy0VarT = i >= 0 ? yy0.t(c2848tTM, i, z, str, i3, c1511fi0) : yy0.q(c2848tTM, str, i3, c1511fi0);
        yy0VarT.z();
        if (yy0VarT.m()) {
            if (i >= 0) {
                System.out.getClass();
            } else {
                System.out.getClass();
            }
            for (H50 h50 : yy0VarT.g()) {
                System.out.getClass();
            }
            return;
        }
        if (!yy0VarT.o()) {
            if (yy0VarT.n()) {
                System.out.getClass();
                return;
            }
            return;
        }
        System.out.getClass();
        for (yy0.c cVar : yy0VarT.i()) {
            PrintStream printStream2 = System.out;
            long j = cVar.a;
            printStream2.getClass();
            printStream2.getClass();
            Iterator<H50> it = cVar.d.iterator();
            while (it.hasNext()) {
                PrintStream printStream3 = System.out;
                it.next();
                printStream3.getClass();
            }
            System.out.getClass();
            Iterator<H50> it2 = cVar.c.iterator();
            while (it2.hasNext()) {
                PrintStream printStream4 = System.out;
                it2.next();
                printStream4.getClass();
            }
        }
    }

    private static void b(String str) {
        PrintStream printStream = System.out;
        printStream.getClass();
        printStream.getClass();
        System.exit(1);
    }
}
