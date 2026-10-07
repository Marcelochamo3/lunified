package o;

/* JADX INFO: renamed from: o.is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1823is {
    public final Zl0 a;
    public final int[] b;
    public final int c;

    public C1823is(int i, Zl0 zl0, int[] iArr) {
        if (iArr.length == 0) {
            AP.g("Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.a = zl0;
        this.b = iArr;
        this.c = i;
    }
}
