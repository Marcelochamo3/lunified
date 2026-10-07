package o;

/* JADX INFO: loaded from: classes.dex */
public final class CP extends C3135wP {
    public CP(Object obj, long j, int i) {
        super(obj, -1, -1, j, i);
    }

    public final CP b(Object obj) {
        return new CP(this.a.equals(obj) ? this : new C3135wP(obj, this.b, this.c, this.d, this.e));
    }
}
