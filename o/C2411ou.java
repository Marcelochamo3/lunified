package o;

/* JADX INFO: renamed from: o.ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2411ou {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public C2411ou(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }

    public final byte[] a() {
        byte[] bArr = this.d;
        return bArr == null ? new byte[0] : bArr;
    }

    public final String b() {
        byte[] bArr = this.d;
        if (bArr == null) {
            bArr = new byte[0];
        }
        return new String(bArr, AbstractC1305dd.a);
    }
}
