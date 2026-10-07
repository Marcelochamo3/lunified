package o;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public class Hy0 {
    public static void a(String[] strArr) {
        int iF = 1;
        int i = 0;
        if (strArr.length > 2 && strArr[0].equals("-t")) {
            iF = C3080vp0.f(strArr[1]);
            if (iF < 0) {
                throw new IllegalArgumentException("invalid type");
            }
            i = 2;
        }
        while (i < strArr.length) {
            C1578gM c1578gM = new C1578gM(strArr[i], iF);
            c1578gM.u();
            b(strArr[i], c1578gM);
            i++;
        }
    }

    public static void b(String str, C1578gM c1578gM) {
        PrintStream printStream = System.out;
        printStream.getClass();
        if (c1578gM.m() != 0) {
            c1578gM.k();
            printStream.getClass();
        }
        printStream.getClass();
        C2848tT[] c2848tTArrE = c1578gM.e();
        if (c2848tTArrE.length > 0) {
            printStream.getClass();
            for (int i = 0; i < c2848tTArrE.length; i++) {
                PrintStream printStream2 = System.out;
                C2848tT c2848tT = c2848tTArrE[i];
                printStream2.getClass();
                if (i < c2848tTArrE.length - 1) {
                    printStream2.getClass();
                }
            }
            System.out.getClass();
        }
        if (c1578gM.m() == 0) {
            for (H50 h50 : c1578gM.f()) {
                System.out.getClass();
            }
        }
    }
}
