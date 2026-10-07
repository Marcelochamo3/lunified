package o;

/* JADX INFO: renamed from: o.bF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1083bF {
    public final Object a;
    public final Object b;
    public final Object c;

    public C1083bF(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.a;
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(obj);
        String strValueOf4 = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(strValueOf4.length() + strValueOf3.length() + strValueOf2.length() + strValueOf.length() + 39);
        sb.append("Multiple entries with same key: ");
        sb.append(strValueOf);
        sb.append("=");
        sb.append(strValueOf2);
        sb.append(" and ");
        sb.append(strValueOf3);
        sb.append("=");
        sb.append(strValueOf4);
        return new IllegalArgumentException(sb.toString());
    }
}
