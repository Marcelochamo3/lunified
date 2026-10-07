package o;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes.dex */
public class L0 implements InterfaceC2195mj {
    public static L0 m;
    public final Object l;

    public /* synthetic */ L0(Object obj) {
        this.l = obj;
    }

    public static L0 d(int i, int i2, int i3) {
        return new L0(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }

    public N0 b(int i) {
        return null;
    }

    public N0 c(int i) {
        return null;
    }

    public void e() {
        synchronized (this.l) {
        }
    }

    @Override // o.InterfaceC2195mj
    public Object f() {
        return this.l;
    }

    public boolean g(int i, int i2, Bundle bundle) {
        return false;
    }

    public L0(int i) {
        switch (i) {
            case 4:
                this.l = new Object();
                new Handler(Looper.getMainLooper(), new C0828Uz(1, this));
                break;
            default:
                if (Build.VERSION.SDK_INT < 26) {
                    this.l = new O0(this);
                } else {
                    this.l = new P0(this);
                }
                break;
        }
    }

    @Override // o.InterfaceC2195mj
    public void a() {
    }
}
