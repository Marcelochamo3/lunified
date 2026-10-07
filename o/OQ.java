package o;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class OQ {
    public static final ArrayDeque d;
    public int a;
    public int b;
    public Object c;

    static {
        char[] cArr = Kr0.a;
        d = new ArrayDeque(0);
    }

    public static OQ a(Object obj) {
        OQ oq;
        ArrayDeque arrayDeque = d;
        synchronized (arrayDeque) {
            oq = (OQ) arrayDeque.poll();
        }
        if (oq == null) {
            oq = new OQ();
        }
        oq.c = obj;
        oq.b = 0;
        oq.a = 0;
        return oq;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OQ)) {
            return false;
        }
        OQ oq = (OQ) obj;
        return this.b == oq.b && this.a == oq.a && this.c.equals(oq.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }
}
