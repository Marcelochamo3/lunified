package o;

import android.os.Bundle;

/* JADX INFO: renamed from: o.kU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1976kU {
    public static final C1390eU b;
    public static final C1390eU c;
    public static final C1293dU d;
    public static final C1293dU e;
    public static final C1390eU f;
    public static final C1293dU g;
    public static final C1293dU h;
    public static final C1390eU i;
    public static final C1293dU j;
    public static final C1293dU k;
    public static final C1390eU l;
    public static final C1293dU m;
    public static final C1293dU n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1390eU f867o;
    public static final C1293dU p;
    public static final C1293dU q;
    public final boolean a;

    static {
        boolean z = false;
        b = new C1390eU(2, z);
        c = new C1390eU(4, z);
        boolean z2 = true;
        d = new C1293dU(4, z2);
        e = new C1293dU(5, z2);
        f = new C1390eU(3, z);
        g = new C1293dU(6, z2);
        h = new C1293dU(7, z2);
        i = new C1390eU(1, z);
        j = new C1293dU(2, z2);
        k = new C1293dU(3, z2);
        l = new C1390eU(0, z);
        m = new C1293dU(0, z2);
        n = new C1293dU(1, z2);
        f867o = new C1390eU(5, z2);
        p = new C1293dU(8, z2);
        q = new C1293dU(9, z2);
    }

    public AbstractC1976kU(boolean z) {
        this.a = z;
    }

    public abstract Object a(String str, Bundle bundle);

    public abstract String b();

    public Object c(Object obj, String str) {
        return h(str);
    }

    /* JADX INFO: renamed from: d */
    public abstract Object h(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public boolean g(Object obj, Object obj2) {
        return AbstractC1474fG.b(obj, obj2);
    }

    public final String toString() {
        return b();
    }
}
