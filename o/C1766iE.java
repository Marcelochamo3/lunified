package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.iE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1766iE extends IOException {
    private static final long serialVersionUID = 1;

    public C1766iE(int i, IOException iOException, String str) {
        super(str + ", status code: " + i, iOException);
    }
}
