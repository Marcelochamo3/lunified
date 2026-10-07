package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2679rj extends IOException {
    public static final /* synthetic */ int m = 0;
    public final int l;

    public C2679rj(int i) {
        this.l = i;
    }

    public C2679rj(int i, Throwable th) {
        super(th);
        this.l = i;
    }

    public C2679rj(String str, int i) {
        super(str);
        this.l = i;
    }

    public C2679rj(int i, String str, Throwable th) {
        super(str, th);
        this.l = i;
    }
}
