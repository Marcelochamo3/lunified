package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Rw0 extends IOException {
    public Rw0() {
    }

    public Rw0(String str) {
        super(str);
    }

    public Rw0(String str, Throwable th) {
        super(str);
        initCause(th);
    }
}
