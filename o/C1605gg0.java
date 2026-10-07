package o;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: o.gg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1605gg0 extends AbstractC2908u1 implements XP {
    public Context n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActionBarContextView f797o;
    public InterfaceC2811t1 p;
    public WeakReference q;
    public boolean r;
    public ZP s;

    @Override // o.XP
    public final void N(ZP zp) {
        g();
        C2424p1 c2424p1 = this.f797o.f6o;
        if (c2424p1 != null) {
            c2424p1.o();
        }
    }

    @Override // o.AbstractC2908u1
    public final void a() {
        if (this.r) {
            return;
        }
        this.r = true;
        this.p.h(this);
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
        return this.s;
    }

    @Override // o.AbstractC2908u1
    public final MenuInflater d() {
        return new Kh0(this.f797o.getContext());
    }

    @Override // o.AbstractC2908u1
    public final CharSequence e() {
        return this.f797o.getSubtitle();
    }

    @Override // o.AbstractC2908u1
    public final CharSequence f() {
        return this.f797o.getTitle();
    }

    @Override // o.AbstractC2908u1
    public final void g() {
        this.p.e(this, this.s);
    }

    @Override // o.AbstractC2908u1
    public final boolean h() {
        return this.f797o.D;
    }

    @Override // o.AbstractC2908u1
    public final void i(View view) {
        this.f797o.setCustomView(view);
        this.q = view != null ? new WeakReference(view) : null;
    }

    @Override // o.AbstractC2908u1
    public final void j(int i) {
        k(this.n.getString(i));
    }

    @Override // o.AbstractC2908u1
    public final void k(CharSequence charSequence) {
        this.f797o.setSubtitle(charSequence);
    }

    @Override // o.AbstractC2908u1
    public final void l(int i) {
        m(this.n.getString(i));
    }

    @Override // o.AbstractC2908u1
    public final void m(CharSequence charSequence) {
        this.f797o.setTitle(charSequence);
    }

    @Override // o.AbstractC2908u1
    public final void n(boolean z) {
        this.m = z;
        this.f797o.setTitleOptional(z);
    }

    @Override // o.XP
    public final boolean w(ZP zp, MenuItem menuItem) {
        return this.p.p(this, menuItem);
    }
}
