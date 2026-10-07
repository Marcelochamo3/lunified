package o;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.fm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1519fm0 implements T9 {
    public static final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f782o;
    public final Zl0 l;
    public final AbstractC0985aF m;

    static {
        int i = Lr0.a;
        n = Integer.toString(0, 36);
        f782o = Integer.toString(1, 36);
    }

    public C1519fm0(Zl0 zl0, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= zl0.l)) {
            throw new IndexOutOfBoundsException();
        }
        this.l = zl0;
        this.m = AbstractC0985aF.l(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1519fm0.class != obj.getClass()) {
            return false;
        }
        C1519fm0 c1519fm0 = (C1519fm0) obj;
        return this.l.equals(c1519fm0.l) && this.m.equals(c1519fm0.m);
    }

    public final int hashCode() {
        return (this.m.hashCode() * 31) + this.l.hashCode();
    }
}
