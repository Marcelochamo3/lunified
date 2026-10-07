package o;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class G80 implements Oh0, Nh0 {
    public static final TreeMap t = new TreeMap();
    public final int l;
    public volatile String m;
    public final long[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final double[] f273o;
    public final String[] p;
    public final byte[][] q;
    public final int[] r;
    public int s;

    public G80(int i) {
        this.l = i;
        int i2 = i + 1;
        this.r = new int[i2];
        this.n = new long[i2];
        this.f273o = new double[i2];
        this.p = new String[i2];
        this.q = new byte[i2][];
    }

    public static final G80 a(int i, String str) {
        AbstractC1474fG.j(str, "query");
        TreeMap treeMap = t;
        synchronized (treeMap) {
            Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                G80 g80 = new G80(i);
                g80.m = str;
                g80.s = i;
                return g80;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            G80 g81 = (G80) entryCeilingEntry.getValue();
            g81.getClass();
            g81.m = str;
            g81.s = i;
            return g81;
        }
    }

    @Override // o.Nh0
    public final void B(int i, double d) {
        this.r[i] = 3;
        this.f273o[i] = d;
    }

    @Override // o.Nh0
    public final void J(int i, long j) {
        this.r[i] = 2;
        this.n[i] = j;
    }

    @Override // o.Nh0
    public final void L(int i, byte[] bArr) {
        this.r[i] = 5;
        this.q[i] = bArr;
    }

    @Override // o.Oh0
    public final String f() {
        String str = this.m;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // o.Oh0
    public final void i(Nh0 nh0) {
        int i = this.s;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.r[i2];
            if (i3 == 1) {
                nh0.z(i2);
            } else if (i3 == 2) {
                nh0.J(i2, this.n[i2]);
            } else if (i3 == 3) {
                nh0.B(i2, this.f273o[i2]);
            } else if (i3 == 4) {
                String str = this.p[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                nh0.o(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.q[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                nh0.L(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void l() {
        TreeMap treeMap = t;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.l), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                AbstractC1474fG.i(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // o.Nh0
    public final void o(int i, String str) {
        AbstractC1474fG.j(str, "value");
        this.r[i] = 4;
        this.p[i] = str;
    }

    @Override // o.Nh0
    public final void z(int i) {
        this.r[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
