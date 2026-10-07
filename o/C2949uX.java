package o;

import java.io.IOException;

/* JADX INFO: renamed from: o.uX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2949uX extends IOException {
    public final boolean l;
    public final int m;

    public C2949uX(String str, Exception exc, boolean z, int i) {
        super(str, exc);
        this.l = z;
        this.m = i;
    }

    public static C2949uX a(String str, Exception exc) {
        return new C2949uX(str, exc, true, 1);
    }

    public static C2949uX b(String str, Exception exc) {
        return new C2949uX(str, exc, true, 4);
    }

    public static C2949uX c(String str) {
        return new C2949uX(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append("{contentIsMalformed=");
        sb.append(this.l);
        sb.append(", dataType=");
        return AbstractC1701hf0.g(sb, this.m, "}");
    }
}
