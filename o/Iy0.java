package o;

import java.io.PrintStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class Iy0 {
    public static void a(String[] strArr) {
        if (strArr.length < 2) {
            b();
        }
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (strArr.length - i > 2) {
            String str = strArr[0];
            str.getClass();
            switch (str) {
                case "-a":
                    z = true;
                    break;
                case "-i":
                    z2 = true;
                    break;
                case "-t":
                    z3 = true;
                    break;
            }
            i++;
        }
        C2848tT c2848tTN = C2848tT.n(strArr[i], C2848tT.v);
        String str2 = strArr[i + 1];
        System.currentTimeMillis();
        wy0 wy0Var = new wy0(c2848tTN, str2);
        System.currentTimeMillis();
        if (z) {
            Iterator<X40> itC = wy0Var.c();
            while (itC.hasNext()) {
                PrintStream printStream = System.out;
                itC.next();
                printStream.getClass();
            }
        } else if (z2) {
            Iterator<X40> itW = wy0Var.w();
            while (itW.hasNext()) {
                PrintStream printStream2 = System.out;
                itW.next();
                printStream2.getClass();
            }
        } else {
            System.out.getClass();
        }
        if (z3) {
            System.out.getClass();
        }
    }

    private static void b() {
        System.out.getClass();
        System.exit(1);
    }
}
