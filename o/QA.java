package o;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes.dex */
public final class QA {
    public final InterfaceC1324dm0 a;
    public final boolean b;
    public final boolean c;
    public final C2084lc f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();
    public PA m = new PA();
    public PA n = new PA();
    public boolean k = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f469o = false;

    public QA(InterfaceC1324dm0 interfaceC1324dm0, boolean z, boolean z2) {
        this.a = interfaceC1324dm0;
        this.b = z;
        this.c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f = new C2084lc(bArr, 0, 0);
        PA pa = this.n;
        pa.b = false;
        pa.a = false;
    }
}
