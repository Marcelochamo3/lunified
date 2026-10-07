package o;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.yw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC3384yw implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ C0560Kq d;
    public final /* synthetic */ int e;

    public /* synthetic */ CallableC3384yw(String str, Context context, C0560Kq c0560Kq, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.d = c0560Kq;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return AbstractC0332Bw.a(this.b, this.c, this.d, this.e);
            default:
                try {
                    return AbstractC0332Bw.a(this.b, this.c, this.d, this.e);
                } catch (Throwable unused) {
                    return new C0306Aw(-3);
                }
        }
    }
}
