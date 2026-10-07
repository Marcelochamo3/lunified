package o;

/* JADX INFO: renamed from: o.mr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2211mr {
    public final C2016kr[] a;
    public final long[] b;
    public final String c;
    public final String d;

    public C2211mr(String str, String str2, long[] jArr, C2016kr[] c2016krArr) {
        this.c = str;
        this.d = str2;
        this.b = jArr;
        this.a = c2016krArr;
    }

    public final String a() {
        return this.c + "/" + this.d;
    }
}
