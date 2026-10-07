package o;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: renamed from: o.tj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2873tj {
    public Uri a;
    public long b;
    public int c;
    public byte[] d;
    public Map e;
    public long f;
    public long g;
    public String h;
    public int i;
    public Object j;

    public final C2970uj a() {
        AbstractC0397Ej.h(this.a, "The uri must be set.");
        return new C2970uj(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b(int i) {
        this.i = i;
    }

    public final void c() {
        this.e = R60.r;
    }

    public final void d(String str) {
        this.h = str;
    }
}
