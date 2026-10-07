package o;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebViewDatabase;
import com.skidush.clonex.utils.TamperGuard;
import java.lang.ref.WeakReference;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class L3 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ Context m;

    public /* synthetic */ L3(Context context, int i) {
        this.l = i;
        this.m = context;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        C2356oL c2356oL;
        Context context;
        Object objK;
        Object systemService = null;
        Context context2 = this.m;
        switch (this.l) {
            case 0:
                int i = Build.VERSION.SDK_INT;
                if (i >= 33) {
                    ComponentName componentName = new ComponentName(context2, "o.r5");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i >= 33) {
                            U5 u5 = R3.r;
                            u5.getClass();
                            O5 o5 = new O5(u5);
                            while (o5.hasNext()) {
                                R3 r3 = (R3) ((WeakReference) o5.next()).get();
                                if (r3 != null && (context = ((LayoutInflaterFactory2C1456f4) r3).v) != null) {
                                    systemService = context.getSystemService("locale");
                                    if (systemService != null) {
                                        c2356oL = new C2356oL(new C2646rL(N3.a(systemService)));
                                    } else {
                                        c2356oL = C2356oL.b;
                                    }
                                }
                            }
                            if (systemService != null) {
                                c2356oL = new C2356oL(new C2646rL(N3.a(systemService)));
                            } else {
                                c2356oL = C2356oL.b;
                            }
                        } else {
                            c2356oL = R3.n;
                            if (c2356oL == null) {
                                c2356oL = C2356oL.b;
                            }
                        }
                        if (c2356oL.a.isEmpty()) {
                            String strZ = AbstractC1468fA.z(context2);
                            Object systemService2 = context2.getSystemService("locale");
                            if (systemService2 != null) {
                                N3.b(systemService2, M3.a(strZ));
                            }
                        }
                        context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                R3.q = true;
                return;
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new L3(context2, 2));
                return;
            case 2:
                AbstractC3409z9.E(context2, new I5(1), AbstractC3409z9.d, false);
                return;
            case 3:
                AbstractC1474fG.j(context2, "$context");
                try {
                    CookieManager cookieManager = CookieManager.getInstance();
                    cookieManager.removeAllCookies(null);
                    cookieManager.flush();
                    WebStorage.getInstance().deleteAllData();
                    WebViewDatabase.getInstance(context2.getApplicationContext()).clearHttpAuthUsernamePassword();
                    objK = C2985uq0.a;
                    break;
                } catch (Throwable th) {
                    objK = Jp0.k(th);
                }
                C2536q80.a(objK);
                return;
            default:
                TamperGuard.a(context2);
                throw null;
        }
    }
}
