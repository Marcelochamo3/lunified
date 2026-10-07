package o;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: renamed from: o.dE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1277dE extends C2679rj {
    public final int n;

    public C1277dE(int i) {
        super(a(i, 1));
        this.n = 1;
    }

    public static int a(int i, int i2) {
        if (i == 2000 && i2 == 1) {
            return 2001;
        }
        return i;
    }

    public static C1277dE b(int i, IOException iOException) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            i2 = (message == null || !U9.I(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i2 == 2007 ? new C1179cE(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new C1277dE(i2, i, iOException);
    }

    public C1277dE(String str, int i) {
        super(str, a(i, 1));
        this.n = 1;
    }

    public C1277dE(int i, int i2, IOException iOException) {
        super(a(i, i2), iOException);
        this.n = i2;
    }

    public C1277dE(int i, IOException iOException, String str) {
        super(a(i, 1), str, iOException);
        this.n = 1;
    }
}
