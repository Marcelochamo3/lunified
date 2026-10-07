package o;

import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class Lr extends AbstractC1200cZ {
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f387o;
    public final int p;
    public final C0643Nw q;
    public final int r;
    public final C3135wP s;
    public final boolean t;

    static {
        int i = Lr0.a;
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    public Lr(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    public final Lr b(CP cp) {
        String message = getMessage();
        int i = Lr0.a;
        return new Lr(message, getCause(), this.l, this.n, this.f387o, this.p, this.q, this.r, cp, this.m, this.t);
    }

    public Lr(String str, Throwable th, int i, int i2, String str2, int i3, C0643Nw c0643Nw, int i4, CP cp, long j, boolean z) {
        super(str, th, i, j);
        AbstractC0397Ej.c(!z || i2 == 1);
        AbstractC0397Ej.c(th != null || i2 == 3);
        this.n = i2;
        this.f387o = str2;
        this.p = i3;
        this.q = c0643Nw;
        this.r = i4;
        this.s = cp;
        this.t = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Lr(int i, Throwable th, int i2, String str, int i3, C0643Nw c0643Nw, int i4, boolean z) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(c0643Nw);
            sb.append(", format_supported=");
            int i5 = Lr0.a;
            if (i4 == 0) {
                str2 = "NO";
            } else if (i4 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else if (i4 == 4) {
                str2 = "YES";
            } else {
                throw new IllegalStateException();
            }
            sb.append(str2);
            string = sb.toString();
        } else if (i != 3) {
            string = "Unexpected runtime error";
        } else {
            string = "Remote error";
        }
        this(TextUtils.isEmpty(null) ? string : AbstractC1701hf0.d(string, ": null"), th, i2, i, str, i3, c0643Nw, i4, null, SystemClock.elapsedRealtime(), z);
    }
}
