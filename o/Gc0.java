package o;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Gc0 {
    static final int c = 0;
    static final int d = 1;
    static final int e = 2;
    static final int f = 3;
    static final int g = 4;
    static final int h = 5;
    static final int i = 6;
    private static final Gc0 j = new Gc0(0);
    private static final Gc0 k = new Gc0(1);
    private static final Gc0 l = new Gc0(2);
    private int a;
    private List<X40> b;

    private Gc0() {
    }

    public static Gc0 m(int i2) {
        switch (i2) {
            case 0:
                return j;
            case 1:
                return k;
            case 2:
                return l;
            case 3:
            case 4:
            case 5:
            case 6:
                Gc0 gc0 = new Gc0();
                gc0.a = i2;
                gc0.b = null;
                return gc0;
            default:
                throw new IllegalArgumentException("invalid type");
        }
    }

    public void a(X40 x40) {
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(x40);
    }

    public List<X40> b() {
        if (this.a != 6) {
            return null;
        }
        return this.b;
    }

    public C3243xa c() {
        return (C3243xa) this.b.get(0).m();
    }

    public C0448Gi d() {
        return (C0448Gi) this.b.get(0).m();
    }

    public X40 e() {
        List<X40> list = this.b;
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    public boolean f() {
        return this.a == 4;
    }

    public boolean g() {
        return this.a == 5;
    }

    public boolean h() {
        return this.a == 3;
    }

    public boolean i() {
        return this.a == 1;
    }

    public boolean j() {
        return this.a == 2;
    }

    public boolean k() {
        return this.a == 6;
    }

    public boolean l() {
        return this.a == 0;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "unknown";
            case 1:
                return "NXDOMAIN";
            case 2:
                return "NXRRSET";
            case 3:
                return "delegation: " + this.b.get(0);
            case 4:
                return "CNAME: " + this.b.get(0);
            case 5:
                return "DNAME: " + this.b.get(0);
            case 6:
                return "successful";
            default:
                throw new IllegalStateException();
        }
    }

    public Gc0(int i2, X40 x40) {
        if (i2 < 0 || i2 > 6) {
            throw new IllegalArgumentException("invalid type");
        }
        this.a = i2;
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        arrayList.add(x40);
    }

    public Gc0(int i2) {
        if (i2 >= 0 && i2 <= 6) {
            this.a = i2;
            this.b = null;
            return;
        }
        throw new IllegalArgumentException("invalid type");
    }
}
