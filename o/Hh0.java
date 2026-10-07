package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class Hh0 extends ActionMode {
    public final Context a;
    public final AbstractC2908u1 b;

    public Hh0(Context context, AbstractC2908u1 abstractC2908u1) {
        this.a = context;
        this.b = abstractC2908u1;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC2942uQ(this.a, this.b.c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.l;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.m;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.k(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.l = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.n(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.j(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.l(i);
    }
}
