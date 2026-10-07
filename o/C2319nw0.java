package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.nw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2319nw0 extends AbstractC2908u1 implements XP {
    public final Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ZP f946o;
    public InterfaceC2811t1 p;
    public WeakReference q;
    public final /* synthetic */ C2416ow0 r;

    public C2319nw0(C2416ow0 c2416ow0, Context context, C2720s4 c2720s4) {
        this.r = c2416ow0;
        this.n = context;
        this.p = c2720s4;
        ZP zp = new ZP(context);
        zp.l = 1;
        this.f946o = zp;
        zp.e = this;
    }

    @Override // o.XP
    public final void N(ZP zp) {
        if (this.p == null) {
            return;
        }
        g();
        C2424p1 c2424p1 = this.r.i.f6o;
        if (c2424p1 != null) {
            c2424p1.o();
        }
    }

    @Override // o.AbstractC2908u1
    public final void a() {
        C2416ow0 c2416ow0 = this.r;
        if (c2416ow0.l != this) {
            return;
        }
        if (c2416ow0.s) {
            c2416ow0.m = this;
            c2416ow0.n = this.p;
        } else {
            this.p.h(this);
        }
        this.p = null;
        c2416ow0.B(false);
        ActionBarContextView actionBarContextView = c2416ow0.i;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        c2416ow0.f.setHideOnContentScrollEnabled(c2416ow0.x);
        c2416ow0.l = null;
    }

    @Override // o.AbstractC2908u1
    public final View b() {
        WeakReference weakReference = this.q;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // o.AbstractC2908u1
    public final ZP c() {
        return this.f946o;
    }

    @Override // o.AbstractC2908u1
    public final MenuInflater d() {
        return new Kh0(this.n);
    }

    @Override // o.AbstractC2908u1
    public final CharSequence e() {
        return this.r.i.getSubtitle();
    }

    @Override // o.AbstractC2908u1
    public final CharSequence f() {
        return this.r.i.getTitle();
    }

    @Override // o.AbstractC2908u1
    public final void g() {
        if (this.r.l != this) {
            return;
        }
        ZP zp = this.f946o;
        zp.w();
        try {
            this.p.e(this, zp);
        } finally {
            zp.v();
        }
    }

    @Override // o.AbstractC2908u1
    public final boolean h() {
        return this.r.i.D;
    }

    @Override // o.AbstractC2908u1
    public final void i(View view) {
        this.r.i.setCustomView(view);
        this.q = new WeakReference(view);
    }

    @Override // o.AbstractC2908u1
    public final void j(int i) {
        k(this.r.d.getResources().getString(i));
    }

    @Override // o.AbstractC2908u1
    public final void k(CharSequence charSequence) {
        this.r.i.setSubtitle(charSequence);
    }

    @Override // o.AbstractC2908u1
    public final void l(int i) {
        m(this.r.d.getResources().getString(i));
    }

    @Override // o.AbstractC2908u1
    public final void m(CharSequence charSequence) {
        this.r.i.setTitle(charSequence);
    }

    @Override // o.AbstractC2908u1
    public final void n(boolean z) {
        this.m = z;
        this.r.i.setTitleOptional(z);
    }

    @Override // o.XP
    public final boolean w(ZP zp, MenuItem menuItem) {
        InterfaceC2811t1 interfaceC2811t1 = this.p;
        if (interfaceC2811t1 != null) {
            return interfaceC2811t1.p(this, menuItem);
        }
        return false;
    }
}
