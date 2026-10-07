package o;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: o.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3393z1 implements Runnable {
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f1143o;

    public /* synthetic */ RunnableC3393z1(Object obj, Object obj2, int i, int i2) {
        this.l = i2;
        this.n = obj;
        this.f1143o = obj2;
        this.m = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        J1 j1;
        switch (this.l) {
            case 0:
                String[] strArr = (String[]) this.n;
                int[] iArr = new int[strArr.length];
                Activity activity = (Activity) this.f1143o;
                PackageManager packageManager = activity.getPackageManager();
                String packageName = activity.getPackageName();
                int length = strArr.length;
                for (int i = 0; i < length; i++) {
                    iArr[i] = packageManager.checkPermission(strArr[i], packageName);
                }
                ((B1) activity).onRequestPermissionsResult(this.m, strArr, iArr);
                break;
            case 1:
                ((TextView) this.n).setTypeface((Typeface) this.f1143o, this.m);
                break;
            case 2:
                ((BottomSheetBehavior) this.f1143o).K((View) this.n, this.m, false);
                break;
            case 3:
                Object obj = ((L0) this.n).l;
                C0834Vf c0834Vf = (C0834Vf) this.f1143o;
                String str = (String) c0834Vf.a.get(Integer.valueOf(this.m));
                if (str != null) {
                    O1 o1 = (O1) c0834Vf.e.get(str);
                    if (o1 == null || (j1 = o1.a) == null) {
                        c0834Vf.g.remove(str);
                        c0834Vf.f.put(str, obj);
                    } else if (c0834Vf.d.remove(str)) {
                        j1.c(obj);
                    }
                    break;
                }
                break;
            default:
                ((C0834Vf) this.f1143o).a(this.m, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.n));
                break;
        }
    }

    public /* synthetic */ RunnableC3393z1(C0834Vf c0834Vf, int i, Object obj, int i2) {
        this.l = i2;
        this.f1143o = c0834Vf;
        this.m = i;
        this.n = obj;
    }

    public RunnableC3393z1(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.l = 2;
        this.f1143o = bottomSheetBehavior;
        this.n = view;
        this.m = i;
    }
}
