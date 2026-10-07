package o;

import j$.lang.Iterable$EL;
import j$.util.Collection$EL;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.Mn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0608Mn extends AbstractC2304np {
    private final List<Integer> b;

    private C0608Mn(int i) {
        super(i);
        if (i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException("Invalid option code, must be one of DAU, DHU, N3U");
        }
        this.b = new ArrayList();
    }

    @Override // o.AbstractC2304np
    public void e(C0474Hi c0474Hi) {
        this.b.clear();
        while (c0474Hi.k() > 0) {
            this.b.add(Integer.valueOf(c0474Hi.j()));
        }
    }

    @Override // o.AbstractC2304np
    public String f() {
        C2504ps c2504ps;
        int iC = c();
        if (iC == 5) {
            c2504ps = new C2504ps(2);
        } else if (iC == 6) {
            c2504ps = new C2504ps(3);
        } else {
            if (iC != 7) {
                throw new IllegalStateException("Unknown option code");
            }
            c2504ps = new C2504ps(4);
        }
        return AbstractC1701hf0.h(new StringBuilder("["), (String) Collection$EL.stream(this.b).map(c2504ps).collect(Collectors.joining(", ")), "]");
    }

    @Override // o.AbstractC2304np
    public void g(C0578Li c0578Li) {
        List<Integer> list = this.b;
        c0578Li.getClass();
        Iterable$EL.forEach(list, new WU(2, c0578Li));
    }

    public List<Integer> j() {
        return Collections.unmodifiableList(this.b);
    }

    public C0608Mn(int i, List<Integer> list) {
        this(i);
        this.b.addAll(list);
    }

    public C0608Mn(int i, int... iArr) {
        this(i);
        if (iArr != null) {
            for (int i2 : iArr) {
                this.b.add(Integer.valueOf(i2));
            }
        }
    }
}
