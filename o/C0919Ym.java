package o;

import io.sentry.C0032c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: renamed from: o.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0919Ym {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public C0032c g;
    public int h;
    public long i;
    public final /* synthetic */ C1227cn j;

    public C0919Ym(C1227cn c1227cn, String str) {
        AbstractC1474fG.j(str, "key");
        this.j = c1227cn;
        this.a = str;
        c1227cn.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(new File(this.j.m, sb.toString()));
            sb.append(".tmp");
            this.d.add(new File(this.j.m, sb.toString()));
            sb.setLength(length);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [o.l6] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    public final C1032an a() {
        byte[] bArr = Mr0.a;
        if (!this.e) {
            return null;
        }
        C1227cn c1227cn = this.j;
        if (!c1227cn.w && (this.g != null || this.f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        long[] jArr = (long[]) this.b.clone();
        for (int i = 0; i < 2; i++) {
            try {
                O9 o9 = c1227cn.l;
                File file = (File) this.c.get(i);
                o9.getClass();
                AbstractC1474fG.j(file, "file");
                Logger logger = SV.a;
                ?? c2046l6 = new C2046l6(new FileInputStream(file), 1, Hj0.d);
                if (!c1227cn.w) {
                    this.h++;
                    c2046l6 = new C0893Xm(c2046l6, c1227cn, this);
                }
                arrayList.add(c2046l6);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Mr0.d((InterfaceC2091lf0) it.next());
                }
                try {
                    c1227cn.X(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }
        return new C1032an(this.j, this.a, this.i, arrayList, jArr);
    }
}
