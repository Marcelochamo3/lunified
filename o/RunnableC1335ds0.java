package o;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.ds0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1335ds0 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ Object n;

    public /* synthetic */ RunnableC1335ds0(int i, Object obj, boolean z) {
        this.l = i;
        this.n = obj;
        this.m = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object systemService;
        Pw0 pw0;
        boolean z = this.m;
        Object obj = this.n;
        switch (this.l) {
            case 0:
                C1531fs0.T((C1369e90) obj, z);
                break;
            case 1:
                C1364e7 c1364e7 = (C1364e7) obj;
                c1364e7.getClass();
                int i = Lr0.a;
                C1042as c1042as = c1364e7.c.l;
                if (c1042as.c0 != z) {
                    c1042as.c0 = z;
                    c1042as.l.e(23, new C0742Rr(1, z));
                    break;
                }
                break;
            default:
                View view = (View) obj;
                if (z) {
                    WeakHashMap weakHashMap = It0.a;
                    if (Build.VERSION.SDK_INT >= 30) {
                        pw0 = Dt0.c(view);
                    } else {
                        Context context = view.getContext();
                        while (true) {
                            if (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    Window window = ((Activity) context).getWindow();
                                    if (window != null) {
                                        pw0 = new Pw0(window, view);
                                    }
                                } else {
                                    context = ((ContextWrapper) context).getBaseContext();
                                }
                            }
                            pw0 = null;
                        }
                    }
                    if (pw0 != null) {
                        pw0.a.C(8);
                    }
                }
                Context context2 = view.getContext();
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    systemService = AbstractC3451zh.b(context2, InputMethodManager.class);
                } else {
                    String strC = i2 >= 23 ? AbstractC3451zh.c(context2, InputMethodManager.class) : (String) AbstractC0369Dh.a.get(InputMethodManager.class);
                    systemService = strC != null ? context2.getSystemService(strC) : null;
                }
                ((InputMethodManager) systemService).showSoftInput(view, 1);
                break;
        }
    }

    public /* synthetic */ RunnableC1335ds0(EditText editText) {
        this.l = 2;
        this.n = editText;
        this.m = false;
    }
}
