package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class Ri0 extends IOException {
    public Ri0() {
    }

    public Ri0(String str) {
        super(str);
    }

    public Ri0(String str, String str2) {
        super("'" + str + "': " + str2);
    }

    public Ri0(String str, String str2, Exception exc) {
        super("'" + str + "': " + str2, exc);
    }
}
