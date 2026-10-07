package o;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.k70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1951k70 {
    public final C2446pE a;
    public final String b;
    public final C2152mB c;
    public final AbstractC2340o70 d;
    public final Map e;
    public C0414Fa f;

    public C1951k70(C2446pE c2446pE, String str, C2152mB c2152mB, AbstractC2340o70 abstractC2340o70, Map map) {
        AbstractC1474fG.j(str, "method");
        this.a = c2446pE;
        this.b = str;
        this.c = c2152mB;
        this.d = abstractC2340o70;
        this.e = map;
    }

    public final C0560Kq a() {
        C0560Kq c0560Kq = new C0560Kq(false);
        c0560Kq.q = new LinkedHashMap();
        c0560Kq.m = this.a;
        c0560Kq.n = this.b;
        c0560Kq.p = this.d;
        Map map = this.e;
        c0560Kq.q = map.isEmpty() ? new LinkedHashMap() : AbstractC3327yN.D(map);
        c0560Kq.f370o = this.c.f();
        return c0560Kq;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.a);
        C2152mB c2152mB = this.c;
        if (c2152mB.size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (Object obj : c2152mB) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0937Ze.N();
                    throw null;
                }
                C1101bX c1101bX = (C1101bX) obj;
                String str = (String) c1101bX.l;
                String str2 = (String) c1101bX.m;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
            sb.append(']');
        }
        Map map = this.e;
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        String string = sb.toString();
        AbstractC1474fG.i(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
