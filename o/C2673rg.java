package o;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: o.rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2673rg {
    public boolean a = true;
    public boolean b;
    public Object c;
    public Serializable d;

    public C2770sg a() {
        return new C2770sg(this.a, this.b, (String[]) this.c, (String[]) this.d);
    }

    public void b(String... strArr) {
        AbstractC1474fG.j(strArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        this.c = (String[]) strArr.clone();
    }

    public void c(C0676Pd... c0676PdArr) {
        AbstractC1474fG.j(c0676PdArr, "cipherSuites");
        if (!this.a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(c0676PdArr.length);
        for (C0676Pd c0676Pd : c0676PdArr) {
            arrayList.add(c0676Pd.a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        b((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void d() {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        this.b = true;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... strArr) {
        AbstractC1474fG.j(strArr, "tlsVersions");
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        if (!(!(strArr.length == 0))) {
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        this.d = (String[]) strArr.clone();
    }

    public void f(Xj0... xj0Arr) {
        if (!this.a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        ArrayList arrayList = new ArrayList(xj0Arr.length);
        for (Xj0 xj0 : xj0Arr) {
            arrayList.add(xj0.l);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }
}
