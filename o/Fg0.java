package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class Fg0 {
    public InterfaceC1324dm0 b;
    public InterfaceC0354Cs c;
    public IV d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public long k;
    public boolean l;
    public boolean m;
    public final GV a = new GV();
    public C2994uv j = new C2994uv(28, false);

    public void a(long j) {
        this.g = j;
    }

    public abstract long b(C2562qX c2562qX);

    public abstract boolean c(C2562qX c2562qX, long j, C2994uv c2994uv);

    public void d(boolean z) {
        if (z) {
            this.j = new C2994uv(28, false);
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }
}
