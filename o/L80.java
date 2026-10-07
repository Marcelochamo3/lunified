package o;

import android.R;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ConcurrentModificationException;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class L80 implements InterfaceC1397ea0, InterfaceC1219cj, InterfaceC1284dL, InterfaceC1916jq, X0, Us0, Nv0 {
    public Object l;

    public /* synthetic */ L80(Object obj) {
        this.l = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // o.InterfaceC1916jq
    public boolean K(Object obj, File file, FW fw) throws Throwable {
        InputStream inputStream = (InputStream) obj;
        C1813in c1813in = (C1813in) this.l;
        byte[] bArr = (byte[]) c1813in.g(65536, byte[].class);
        boolean z = false;
        ?? r2 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int i = inputStream.read(bArr);
                        r2 = -1;
                        if (i == -1) {
                            break;
                        }
                        fileOutputStream2.write(bArr, 0, i);
                    } catch (IOException unused) {
                        fileOutputStream = fileOutputStream2;
                        Log.isLoggable("StreamEncoder", 3);
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        c1813in.l(bArr);
                        r2 = fileOutputStream;
                    } catch (Throwable th) {
                        th = th;
                        r2 = fileOutputStream2;
                        if (r2 != 0) {
                            try {
                                r2.close();
                            } catch (IOException unused3) {
                            }
                        }
                        c1813in.l(bArr);
                        throw th;
                    }
                }
                fileOutputStream2.close();
                try {
                    fileOutputStream2.close();
                } catch (IOException unused4) {
                }
                c1813in.l(bArr);
                z = true;
            } catch (IOException unused5) {
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // o.InterfaceC1219cj
    public long b(long j) {
        return 0L;
    }

    @Override // o.InterfaceC1219cj
    public long c(long j, long j2) {
        return 0L;
    }

    @Override // o.Nv0
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) AbstractC3409z9.d(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.l).createWebView(webView));
    }

    @Override // o.X0
    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.l;
        if (!swipeDismissBehavior.v(view)) {
            return false;
        }
        WeakHashMap weakHashMap = It0.a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.d;
        It0.j(view, (!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // o.Nv0
    public String[] e() {
        return ((WebViewProviderFactoryBoundaryInterface) this.l).getSupportedFeatures();
    }

    @Override // o.Us0
    public void f(C2278nc c2278nc) {
        c2278nc.h(((WindowManager) this.l).getDefaultDisplay());
    }

    @Override // o.Nv0
    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) AbstractC3409z9.d(ProxyControllerBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.l).getProxyController());
    }

    @Override // o.Nv0
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) AbstractC3409z9.d(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.l).getStatics());
    }

    public synchronized void i(K80 k80) {
        AbstractC1474fG.j(k80, "route");
        ((LinkedHashSet) this.l).remove(k80);
    }

    @Override // o.InterfaceC1219cj
    public long j(long j, long j2) {
        return 0L;
    }

    @Override // o.InterfaceC1284dL
    public ZK k(InterfaceC1479fL interfaceC1479fL, IOException iOException, int i) {
        C0915Yi c0915Yi = (C0915Yi) this.l;
        if (c0915Yi != null) {
            C1122bj c1122bj = c0915Yi.m;
            c1122bj.getClass();
            AP.g("Failed to resolve time offset.", iOException);
            c1122bj.u(true);
        }
        return Na0.t;
    }

    @Override // o.InterfaceC1284dL
    public void l(InterfaceC1479fL interfaceC1479fL, long j, long j2) {
        boolean z;
        C0915Yi c0915Yi = (C0915Yi) this.l;
        if (c0915Yi != null) {
            synchronized (Jp0.d) {
                z = Jp0.e;
            }
            if (z) {
                c0915Yi.b();
                return;
            }
            IOException iOException = new IOException(new ConcurrentModificationException());
            C1122bj c1122bj = c0915Yi.m;
            c1122bj.getClass();
            AP.g("Failed to resolve time offset.", iOException);
            c1122bj.u(true);
        }
    }

    @Override // o.InterfaceC1219cj
    public long m(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // o.InterfaceC1219cj
    public C2433p50 n(long j) {
        return (C2433p50) this.l;
    }

    public void o() {
        View view = (View) this.l;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    public void p() {
        View viewFindViewById;
        View view = (View) this.l;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new Jj0(27, viewFindViewById));
    }

    @Override // o.InterfaceC1219cj
    public boolean r() {
        return true;
    }

    @Override // o.InterfaceC1219cj
    public long u() {
        return 0L;
    }

    @Override // o.InterfaceC1219cj
    public long y(long j) {
        return 1L;
    }

    @Override // o.InterfaceC1219cj
    public long z(long j, long j2) {
        return 1L;
    }

    public L80(int i) {
        switch (i) {
            case 11:
                this.l = new SparseArray();
                break;
            default:
                this.l = new LinkedHashSet();
                break;
        }
    }

    public L80(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            Je0 je0 = new Je0(view);
            je0.m = view;
            this.l = je0;
            return;
        }
        this.l = new L80((Object) view);
    }

    @Override // o.Us0
    public void a() {
    }

    @Override // o.InterfaceC1219cj
    public long g(long j, long j2) {
        return j2;
    }

    @Override // o.InterfaceC1284dL
    public void h(InterfaceC1479fL interfaceC1479fL, long j, long j2, boolean z) {
    }
}
