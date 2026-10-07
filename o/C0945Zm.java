package o;

import io.sentry.C0032c;
import java.io.File;

/* JADX INFO: renamed from: o.Zm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0945Zm {
    public final String a;
    public final long[] b;
    public final File[] c;
    public final File[] d;
    public boolean e;
    public C0032c f;
    public final /* synthetic */ C1325dn g;

    public C0945Zm(C1325dn c1325dn, String str) {
        this.g = c1325dn;
        this.a = str;
        int i = c1325dn.r;
        this.b = new long[i];
        this.c = new File[i];
        this.d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < c1325dn.r; i2++) {
            sb.append(i2);
            File[] fileArr = this.c;
            String string = sb.toString();
            File file = c1325dn.l;
            fileArr[i2] = new File(file, string);
            sb.append(".tmp");
            this.d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
