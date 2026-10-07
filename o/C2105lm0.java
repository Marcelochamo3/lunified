package o;

/* JADX INFO: renamed from: o.lm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2105lm0 implements T9 {
    public static final C2105lm0 m;
    public final AbstractC0985aF l;

    static {
        XE xe = AbstractC0985aF.m;
        m = new C2105lm0(M60.p);
        int i = Lr0.a;
        Integer.toString(0, 36);
    }

    public C2105lm0(AbstractC0985aF abstractC0985aF) {
        this.l = AbstractC0985aF.l(abstractC0985aF);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            AbstractC0985aF abstractC0985aF = this.l;
            if (i2 >= abstractC0985aF.size()) {
                return false;
            }
            C2007km0 c2007km0 = (C2007km0) abstractC0985aF.get(i2);
            if (c2007km0.b() && c2007km0.a() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2105lm0.class != obj.getClass()) {
            return false;
        }
        return this.l.equals(((C2105lm0) obj).l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }
}
