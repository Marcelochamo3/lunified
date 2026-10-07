package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.skidush.clonex.R;

/* JADX INFO: renamed from: o.Cm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0348Cm extends AbstractComponentCallbacksC1247cx implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler l0;
    public boolean u0;
    public Dialog w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;
    public final RunnableC3102w1 m0 = new RunnableC3102w1(5, this);
    public final DialogInterfaceOnCancelListenerC3364ym n0 = new DialogInterfaceOnCancelListenerC3364ym(this);
    public final DialogInterfaceOnDismissListenerC3461zm o0 = new DialogInterfaceOnDismissListenerC3461zm(this);
    public int p0 = 0;
    public int q0 = 0;
    public boolean r0 = true;
    public boolean s0 = true;
    public int t0 = -1;
    public final C0296Am v0 = new C0296Am(this);
    public boolean A0 = false;

    @Override // o.AbstractComponentCallbacksC1247cx
    public void B() {
        this.Q = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = true;
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!this.y0) {
                onDismiss(this.w0);
            }
            this.w0 = null;
            this.A0 = false;
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void C() {
        this.Q = true;
        if (!this.z0 && !this.y0) {
            this.y0 = true;
        }
        C0296Am c0296Am = this.v0;
        TS ts = this.d0;
        ts.getClass();
        TS.a("removeObserver");
        XK xk = (XK) ts.b.d(c0296Am);
        if (xk == null) {
            return;
        }
        xk.c();
        xk.b(false);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final LayoutInflater D(Bundle bundle) {
        LayoutInflater layoutInflaterD = super.D(bundle);
        boolean z = this.s0;
        if (!z || this.u0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            return layoutInflaterD;
        }
        if (z && !this.A0) {
            try {
                this.u0 = true;
                Dialog dialogX = X();
                this.w0 = dialogX;
                if (this.s0) {
                    int i = this.p0;
                    if (i == 1 || i == 2) {
                        dialogX.requestWindowFeature(1);
                    } else if (i == 3) {
                        Window window = dialogX.getWindow();
                        if (window != null) {
                            window.addFlags(24);
                        }
                        dialogX.requestWindowFeature(1);
                    }
                    Context contextJ = j();
                    if (contextJ instanceof Activity) {
                        this.w0.setOwnerActivity((Activity) contextJ);
                    }
                    this.w0.setCancelable(this.r0);
                    this.w0.setOnCancelListener(this.n0);
                    this.w0.setOnDismissListener(this.o0);
                    this.A0 = true;
                } else {
                    this.w0 = null;
                }
                this.u0 = false;
            } catch (Throwable th) {
                this.u0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            toString();
        }
        Dialog dialog = this.w0;
        return dialog != null ? layoutInflaterD.cloneInContext(dialog.getContext()) : layoutInflaterD;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public void H(Bundle bundle) {
        Dialog dialog = this.w0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.p0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.q0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.r0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.s0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.t0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public void I() {
        this.Q = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            this.x0 = false;
            dialog.show();
            View decorView = this.w0.getWindow().getDecorView();
            zy0.C(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC3021v9.B(decorView, this);
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public void J() {
        this.Q = true;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void L(Bundle bundle) {
        Bundle bundle2;
        this.Q = true;
        if (this.w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w0.onRestoreInstanceState(bundle2);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.M(layoutInflater, viewGroup, bundle);
        if (this.S != null || this.w0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.w0.onRestoreInstanceState(bundle2);
    }

    public final void W(boolean z, boolean z2) {
        if (this.y0) {
            return;
        }
        this.y0 = true;
        this.z0 = false;
        Dialog dialog = this.w0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.w0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.l0.getLooper()) {
                    onDismiss(this.w0);
                } else {
                    this.l0.post(this.m0);
                }
            }
        }
        this.x0 = true;
        if (this.t0 >= 0) {
            C3289xx c3289xxL = l();
            int i = this.t0;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC1674hK.n(i, "Bad id: "));
            }
            c3289xxL.x(new C2998ux(c3289xxL, null, i), z);
            this.t0 = -1;
            return;
        }
        F7 f7 = new F7(l());
        f7.p = true;
        C3289xx c3289xx = this.F;
        if (c3289xx != null && c3289xx != f7.r) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        f7.b(new C0774Sx(3, this));
        if (z) {
            f7.e(true);
        } else {
            f7.e(false);
        }
    }

    public Dialog X() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new DialogC1213cg(Q(), this.q0);
    }

    public final Dialog Y() {
        Dialog dialog = this.w0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public final void Z(C3289xx c3289xx, String str) {
        this.y0 = false;
        this.z0 = true;
        c3289xx.getClass();
        F7 f7 = new F7(c3289xx);
        f7.p = true;
        f7.f(0, this, str, 1);
        f7.e(false);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final zy0 b() {
        return new C0322Bm(this, new C0929Yw(this));
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.x0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        W(true, true);
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void x() {
        this.Q = true;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public final void y(Context context) {
        Object obj;
        super.y(context);
        C0296Am c0296Am = this.v0;
        TS ts = this.d0;
        ts.getClass();
        TS.a("observeForever");
        VK vk = new VK(ts, c0296Am);
        C3022v90 c3022v90 = ts.b;
        C2731s90 c2731s90A = c3022v90.a(c0296Am);
        if (c2731s90A != null) {
            obj = c2731s90A.m;
        } else {
            C2731s90 c2731s90 = new C2731s90(c0296Am, vk);
            c3022v90.f1071o++;
            C2731s90 c2731s91 = c3022v90.m;
            if (c2731s91 == null) {
                c3022v90.l = c2731s90;
                c3022v90.m = c2731s90;
            } else {
                c2731s91.n = c2731s90;
                c2731s90.f1020o = c2731s91;
                c3022v90.m = c2731s90;
            }
            obj = null;
        }
        XK xk = (XK) obj;
        if (xk instanceof WK) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (xk == null) {
            vk.b(true);
        }
        if (this.z0) {
            return;
        }
        this.y0 = false;
    }

    @Override // o.AbstractComponentCallbacksC1247cx
    public void z(Bundle bundle) {
        super.z(bundle);
        this.l0 = new Handler();
        this.s0 = this.K == 0;
        if (bundle != null) {
            this.p0 = bundle.getInt("android:style", 0);
            this.q0 = bundle.getInt("android:theme", 0);
            this.r0 = bundle.getBoolean("android:cancelable", true);
            this.s0 = bundle.getBoolean("android:showsDialog", this.s0);
            this.t0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}
