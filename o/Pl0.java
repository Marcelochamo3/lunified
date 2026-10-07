package o;

import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public class Pl0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public static void a(String[] strArr) throws Rw0 {
        if (strArr == null || strArr.length == 0) {
            PrintStream printStream = System.out;
            printStream.getClass();
            printStream.getClass();
            printStream.getClass();
            printStream.getClass();
            printStream.getClass();
            printStream.getClass();
            printStream.getClass();
            printStream.getClass();
            System.exit(1);
            return;
        }
        String str = strArr[0];
        String[] strArr2 = new String[strArr.length - 1];
        System.arraycopy(strArr, 1, strArr2, 0, strArr.length - 1);
        str.getClass();
        switch (str) {
            case "jnamed":
                Gy0.D(strArr2);
                break;
            case "lookup":
                Hy0.a(strArr2);
                break;
            case "update":
                Jy0.k(strArr2);
                break;
            case "primary":
                Iy0.a(strArr2);
                break;
            case "dig":
                Dy0.b(strArr2);
                break;
            case "xfrin":
                Ky0.a(strArr2);
                break;
            default:
                System.out.getClass();
                break;
        }
    }
}
