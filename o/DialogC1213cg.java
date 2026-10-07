package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: o.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC1213cg extends Dialog implements InterfaceC1283dK, InterfaceC1588gW, K90 {
    public C1478fK l;
    public final C1797ie0 m;
    public final C1490fW n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC1213cg(Context context, int i) {
        super(context, i);
        AbstractC1474fG.j(context, "context");
        this.m = new C1797ie0(this);
        this.n = new C1490fW(new Jj0(8, this));
    }

    public static void b(DialogC1213cg dialogC1213cg) {
        AbstractC1474fG.j(dialogC1213cg, "this$0");
        super.onBackPressed();
    }

    @Override // o.K90
    public final K3 a() {
        return (K3) this.m.f832o;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1474fG.j(view, "view");
        d();
        super.addContentView(view, layoutParams);
    }

    public final C1478fK c() {
        C1478fK c1478fK = this.l;
        if (c1478fK != null) {
            return c1478fK;
        }
        C1478fK c1478fK2 = new C1478fK(this);
        this.l = c1478fK2;
        return c1478fK2;
    }

    public final void d() {
        Window window = getWindow();
        AbstractC1474fG.g(window);
        View decorView = window.getDecorView();
        AbstractC1474fG.i(decorView, "window!!.decorView");
        zy0.C(decorView, this);
        Window window2 = getWindow();
        AbstractC1474fG.g(window2);
        View decorView2 = window2.getDecorView();
        AbstractC1474fG.i(decorView2, "window!!.decorView");
        UK.Q(decorView2, this);
        Window window3 = getWindow();
        AbstractC1474fG.g(window3);
        View decorView3 = window3.getDecorView();
        AbstractC1474fG.i(decorView3, "window!!.decorView");
        AbstractC3021v9.B(decorView3, this);
    }

    @Override // o.InterfaceC1283dK
    public final C1478fK f() {
        return c();
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.n.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC1474fG.i(onBackInvokedDispatcher, "onBackInvokedDispatcher");
            C1490fW c1490fW = this.n;
            c1490fW.getClass();
            c1490fW.e = onBackInvokedDispatcher;
            c1490fW.c(c1490fW.g);
        }
        this.m.h(bundle);
        c().d(SJ.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        AbstractC1474fG.i(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.m.i(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        c().d(SJ.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        c().d(SJ.ON_DESTROY);
        this.l = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        d();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC1474fG.j(view, "view");
        d();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1474fG.j(view, "view");
        d();
        super.setContentView(view, layoutParams);
    }
}
