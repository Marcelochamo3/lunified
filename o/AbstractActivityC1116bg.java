package o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.skidush.clonex.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: o.bg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC1116bg extends AbstractActivityC1018ag implements InterfaceC1047au0, InterfaceC1665hB, K90, InterfaceC1588gW, Q1, InterfaceC1978kW, InterfaceC2657rW, InterfaceC2270nW, InterfaceC2367oW, InterfaceC1094bQ {
    public final CopyOnWriteArrayList A;
    public boolean B;
    public boolean C;
    public final C3257xh m = new C3257xh();
    public final RN n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C1478fK f702o;
    public final C1797ie0 p;
    public Zt0 q;
    public L90 r;
    public C1490fW s;
    public final ExecutorC0938Zf t;
    public final C1797ie0 u;
    public final C0834Vf v;
    public final CopyOnWriteArrayList w;
    public final CopyOnWriteArrayList x;
    public final CopyOnWriteArrayList y;
    public final CopyOnWriteArrayList z;

    /* JADX WARN: Type inference failed for: r5v0, types: [o.Sf] */
    public AbstractActivityC1116bg() {
        final AbstractActivityC1540fx abstractActivityC1540fx = (AbstractActivityC1540fx) this;
        this.n = new RN(new Jj0(6, abstractActivityC1540fx));
        C1478fK c1478fK = new C1478fK(this);
        this.f702o = c1478fK;
        C1797ie0 c1797ie0 = new C1797ie0((K90) this);
        this.p = c1797ie0;
        this.s = null;
        ExecutorC0938Zf executorC0938Zf = new ExecutorC0938Zf(abstractActivityC1540fx);
        this.t = executorC0938Zf;
        this.u = new C1797ie0(executorC0938Zf, new InterfaceC0360Cy() { // from class: o.Sf
            @Override // o.InterfaceC0360Cy
            public final Object c() {
                abstractActivityC1540fx.reportFullyDrawn();
                return null;
            }
        });
        new AtomicInteger();
        this.v = new C0834Vf(abstractActivityC1540fx);
        this.w = new CopyOnWriteArrayList();
        this.x = new CopyOnWriteArrayList();
        this.y = new CopyOnWriteArrayList();
        this.z = new CopyOnWriteArrayList();
        this.A = new CopyOnWriteArrayList();
        this.B = false;
        this.C = false;
        int i = Build.VERSION.SDK_INT;
        c1478fK.a(new C0860Wf(abstractActivityC1540fx, 0));
        c1478fK.a(new C0860Wf(abstractActivityC1540fx, 1));
        c1478fK.a(new C0860Wf(abstractActivityC1540fx, 2));
        c1797ie0.g();
        AbstractC1474fG.n(this);
        if (i <= 23) {
            I50 i50 = new I50();
            i50.m = this;
            c1478fK.a(i50);
        }
        ((K3) c1797ie0.f832o).f("android:support:activity-result", new C0782Tf(0, abstractActivityC1540fx));
        j(new C0808Uf(abstractActivityC1540fx, 0));
    }

    @Override // o.K90
    public final K3 a() {
        return (K3) this.p.f832o;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        this.t.a(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // o.InterfaceC1665hB
    public final Yt0 c() {
        if (this.r == null) {
            this.r = new L90(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.r;
    }

    @Override // o.InterfaceC1665hB
    public final SS d() {
        SS ss = new SS(0);
        Application application = getApplication();
        LinkedHashMap linkedHashMap = ss.a;
        if (application != null) {
            linkedHashMap.put(Xt0.e, getApplication());
        }
        linkedHashMap.put(AbstractC1474fG.f, this);
        linkedHashMap.put(AbstractC1474fG.g, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            linkedHashMap.put(AbstractC1474fG.h, getIntent().getExtras());
        }
        return ss;
    }

    @Override // o.InterfaceC1047au0
    public final Zt0 e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.q == null) {
            C0912Yf c0912Yf = (C0912Yf) getLastNonConfigurationInstance();
            if (c0912Yf != null) {
                this.q = c0912Yf.a;
            }
            if (this.q == null) {
                this.q = new Zt0();
            }
        }
        return this.q;
    }

    @Override // o.InterfaceC1283dK
    public final C1478fK f() {
        return this.f702o;
    }

    public final void h(C2514px c2514px) {
        RN rn = this.n;
        ((CopyOnWriteArrayList) rn.n).add(c2514px);
        ((Runnable) rn.m).run();
    }

    public final void i(InterfaceC0835Vg interfaceC0835Vg) {
        this.w.add(interfaceC0835Vg);
    }

    public final void j(InterfaceC2076lW interfaceC2076lW) {
        C3257xh c3257xh = this.m;
        c3257xh.getClass();
        if (((Context) c3257xh.m) != null) {
            interfaceC2076lW.a();
        }
        ((CopyOnWriteArraySet) c3257xh.l).add(interfaceC2076lW);
    }

    public final void k(C2320nx c2320nx) {
        this.z.add(c2320nx);
    }

    public final void l(C2320nx c2320nx) {
        this.A.add(c2320nx);
    }

    public final void m(C2320nx c2320nx) {
        this.x.add(c2320nx);
    }

    public final C1490fW n() {
        if (this.s == null) {
            this.s = new C1490fW(new RunnableC3102w1(4, this));
            this.f702o.a(new C0860Wf(this, 3));
        }
        return this.s;
    }

    public final void o() {
        zy0.C(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC1474fG.j(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        AbstractC3021v9.B(getWindow().getDecorView(), this);
        UK.Q(getWindow().getDecorView(), this);
        View decorView2 = getWindow().getDecorView();
        AbstractC1474fG.j(decorView2, "<this>");
        decorView2.setTag(R.id.report_drawn, this);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.v.a(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        n().b();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((InterfaceC0835Vg) it.next()).accept(configuration);
        }
    }

    @Override // o.AbstractActivityC1018ag, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.p.h(bundle);
        C3257xh c3257xh = this.m;
        c3257xh.getClass();
        c3257xh.m = this;
        Iterator it = ((CopyOnWriteArraySet) c3257xh.l).iterator();
        while (it.hasNext()) {
            ((InterfaceC2076lW) it.next()).a();
        }
        super.onCreate(bundle);
        int i = FragmentC1561g70.m;
        AbstractC1474fG.C(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onCreatePanelMenu(i, menu);
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.n.n).iterator();
        while (it.hasNext()) {
            ((C2514px) it.next()).a.k();
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i != 0) {
            return false;
        }
        Iterator it = ((CopyOnWriteArrayList) this.n.n).iterator();
        while (it.hasNext()) {
            if (((C2514px) it.next()).a.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        if (this.B) {
            return;
        }
        Iterator it = this.z.iterator();
        while (it.hasNext()) {
            ((InterfaceC0835Vg) it.next()).accept(new KS(z));
        }
    }

    @Override // android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((InterfaceC0835Vg) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        Iterator it = ((CopyOnWriteArrayList) this.n.n).iterator();
        while (it.hasNext()) {
            ((C2514px) it.next()).a.q();
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        if (this.C) {
            return;
        }
        Iterator it = this.A.iterator();
        while (it.hasNext()) {
            ((InterfaceC0835Vg) it.next()).accept(new PY(z));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return true;
        }
        super.onPreparePanel(i, view, menu);
        Iterator it = ((CopyOnWriteArrayList) this.n.n).iterator();
        while (it.hasNext()) {
            ((C2514px) it.next()).a.t();
        }
        return true;
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.v.a(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0912Yf c0912Yf;
        Zt0 zt0 = this.q;
        if (zt0 == null && (c0912Yf = (C0912Yf) getLastNonConfigurationInstance()) != null) {
            zt0 = c0912Yf.a;
        }
        if (zt0 == null) {
            return null;
        }
        C0912Yf c0912Yf2 = new C0912Yf();
        c0912Yf2.a = zt0;
        return c0912Yf2;
    }

    @Override // o.AbstractActivityC1018ag, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        C1478fK c1478fK = this.f702o;
        if (c1478fK instanceof C1478fK) {
            c1478fK.g(TJ.n);
        }
        super.onSaveInstanceState(bundle);
        this.p.i(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            ((InterfaceC0835Vg) it.next()).accept(Integer.valueOf(i));
        }
    }

    public final void p(C2514px c2514px) {
        RN rn = this.n;
        ((CopyOnWriteArrayList) rn.n).remove(c2514px);
        AbstractC1674hK.w(((HashMap) rn.f488o).remove(c2514px));
        ((Runnable) rn.m).run();
    }

    public final void q(C2320nx c2320nx) {
        this.w.remove(c2320nx);
    }

    public final void r(C2320nx c2320nx) {
        this.z.remove(c2320nx);
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (Ou0.r()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.u.d();
        } finally {
            Trace.endSection();
        }
    }

    public final void s(C2320nx c2320nx) {
        this.A.remove(c2320nx);
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        o();
        this.t.a(getWindow().getDecorView());
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    public final void t(C2320nx c2320nx) {
        this.x.remove(c2320nx);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z, Configuration configuration) {
        this.B = true;
        try {
            super.onMultiWindowModeChanged(z, configuration);
            this.B = false;
            for (InterfaceC0835Vg interfaceC0835Vg : this.z) {
                AbstractC1474fG.j(configuration, "newConfig");
                interfaceC0835Vg.accept(new KS(z));
            }
        } catch (Throwable th) {
            this.B = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        this.C = true;
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            this.C = false;
            for (InterfaceC0835Vg interfaceC0835Vg : this.A) {
                AbstractC1474fG.j(configuration, "newConfig");
                interfaceC0835Vg.accept(new PY(z));
            }
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        o();
        this.t.a(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        this.t.a(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }
}
