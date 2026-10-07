package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.ii0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC1804ii0 extends H50 {
    protected List<byte[]> r;

    public AbstractC1804ii0() {
    }

    @Override // o.H50
    public void E(Fl0 fl0, C2848tT c2848tT) throws Ri0 {
        this.r = new ArrayList(2);
        while (true) {
            Fl0.b bVarI = fl0.i();
            if (!bVarI.b()) {
                fl0.n0();
                return;
            } else {
                try {
                    this.r.add(H50.b(bVarI.d()));
                } catch (Ri0 e) {
                    throw fl0.f(e.getMessage());
                }
            }
        }
    }

    @Override // o.H50
    public void H(C0474Hi c0474Hi) {
        this.r = new ArrayList(2);
        while (c0474Hi.k() > 0) {
            this.r.add(c0474Hi.g());
        }
    }

    @Override // o.H50
    public String I() {
        if (this.r.isEmpty()) {
            return "\"\"";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<byte[]> it = this.r.iterator();
        while (it.hasNext()) {
            sb.append(H50.c(it.next(), true));
            if (it.hasNext()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    @Override // o.H50
    public void J(C0578Li c0578Li, C1799ig c1799ig, boolean z) {
        Iterator<byte[]> it = this.r.iterator();
        while (it.hasNext()) {
            c0578Li.k(it.next());
        }
    }

    public List<String> U() {
        ArrayList arrayList = new ArrayList(this.r.size());
        Iterator<byte[]> it = this.r.iterator();
        while (it.hasNext()) {
            arrayList.add(H50.c(it.next(), false));
        }
        return arrayList;
    }

    public List<byte[]> V() {
        return this.r;
    }

    public AbstractC1804ii0(C2848tT c2848tT, int i, int i2, long j) {
        super(c2848tT, i, i2, j);
    }

    public AbstractC1804ii0(C2848tT c2848tT, int i, int i2, long j, List<String> list) {
        super(c2848tT, i, i2, j);
        if (list != null) {
            this.r = new ArrayList(list.size());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                try {
                    this.r.add(H50.b(it.next()));
                } catch (Ri0 e) {
                    throw new IllegalArgumentException(e.getMessage());
                }
            }
            return;
        }
        throw new IllegalArgumentException("strings must not be null");
    }

    public AbstractC1804ii0(C2848tT c2848tT, int i, int i2, long j, String str) {
        this(c2848tT, i, i2, j, (List<String>) Collections.singletonList(str));
    }
}
