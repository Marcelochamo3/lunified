package o;

import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class Ip0 implements Serializable {
    private static final long serialVersionUID = -125354057735389003L;
    private final TreeSet<Integer> l;

    private Ip0() {
        this.l = new TreeSet<>();
    }

    private static void c(C0578Li c0578Li, TreeSet<Integer> treeSet, int i) {
        int iIntValue = ((treeSet.last().intValue() & 255) / 8) + 1;
        int[] iArr = new int[iIntValue];
        c0578Li.o(i);
        c0578Li.o(iIntValue);
        Iterator<Integer> it = treeSet.iterator();
        while (it.hasNext()) {
            int iIntValue2 = it.next().intValue();
            int i2 = (iIntValue2 & 255) / 8;
            iArr[i2] = (1 << (7 - (iIntValue2 % 8))) | iArr[i2];
        }
        for (int i3 = 0; i3 < iIntValue; i3++) {
            c0578Li.o(iArr[i3]);
        }
    }

    public boolean a(int i) {
        return this.l.contains(Integer.valueOf(i));
    }

    public boolean b() {
        return this.l.isEmpty();
    }

    public int[] d() {
        int[] iArr = new int[this.l.size()];
        Iterator<Integer> it = this.l.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        return iArr;
    }

    public void e(C0578Li c0578Li) {
        if (this.l.size() == 0) {
            return;
        }
        TreeSet treeSet = new TreeSet();
        int i = -1;
        for (Integer num : this.l) {
            int iIntValue = num.intValue() >> 8;
            if (iIntValue != i) {
                if (treeSet.size() > 0) {
                    c(c0578Li, treeSet, i);
                    treeSet.clear();
                }
                i = iIntValue;
            }
            treeSet.add(num);
        }
        c(c0578Li, treeSet, i);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<Integer> it = this.l.iterator();
        while (it.hasNext()) {
            sb.append(C3080vp0.e(it.next().intValue()));
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    public Ip0(int[] iArr) {
        this();
        for (int i : iArr) {
            C3080vp0.a(i);
            this.l.add(Integer.valueOf(i));
        }
    }

    public Ip0(C0474Hi c0474Hi) throws Rw0 {
        this();
        while (c0474Hi.k() > 0) {
            if (c0474Hi.k() >= 2) {
                int iJ = c0474Hi.j();
                if (iJ >= -1) {
                    int iJ2 = c0474Hi.j();
                    if (iJ2 > c0474Hi.k()) {
                        throw new Rw0("invalid bitmap");
                    }
                    for (int i = 0; i < iJ2; i++) {
                        int iJ3 = c0474Hi.j();
                        if (iJ3 != 0) {
                            for (int i2 = 0; i2 < 8; i2++) {
                                if (((1 << (7 - i2)) & iJ3) != 0) {
                                    this.l.add(Integer.valueOf((i * 8) + (iJ * 256) + i2));
                                }
                            }
                        }
                    }
                } else {
                    throw new Rw0("invalid ordering");
                }
            } else {
                throw new Rw0("invalid bitmap descriptor");
            }
        }
    }

    public Ip0(Fl0 fl0) throws Ri0 {
        this();
        while (true) {
            Fl0.b bVarI = fl0.i();
            if (!bVarI.b()) {
                fl0.n0();
                return;
            }
            int iF = C3080vp0.f(bVarI.d());
            if (iF >= 0) {
                this.l.add(Integer.valueOf(iF));
            } else {
                throw fl0.f("Invalid type: " + bVarI.d());
            }
        }
    }
}
