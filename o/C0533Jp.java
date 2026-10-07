package o;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.Jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0533Jp implements InterfaceC0429Fp, InterfaceC2054lA {
    public final Context l;

    public C0533Jp(Context context, int i) {
        switch (i) {
            case 1:
                this.l = context;
                break;
            default:
                this.l = context.getApplicationContext();
                break;
        }
    }

    @Override // o.InterfaceC0429Fp
    public void a(Pu0 pu0) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1896jg("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC1169c7(this, pu0, threadPoolExecutor, 5));
    }

    @Override // o.InterfaceC2054lA
    public Object get() {
        return (ConnectivityManager) this.l.getSystemService("connectivity");
    }
}
