package o;

import androidx.appcompat.widget.ActionBarContextView;

/* JADX INFO: renamed from: o.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2033l implements InterfaceC2702ru0 {
    public boolean a = false;
    public int b;
    public final /* synthetic */ ActionBarContextView c;

    public C2033l(ActionBarContextView actionBarContextView) {
        this.c = actionBarContextView;
    }

    @Override // o.InterfaceC2702ru0
    public final void a() {
        if (this.a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.c;
        actionBarContextView.q = null;
        super/*android.view.ViewGroup*/.setVisibility(this.b);
    }

    @Override // o.InterfaceC2702ru0
    public final void b() {
        this.a = true;
    }

    @Override // o.InterfaceC2702ru0
    public final void c() {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.a = false;
    }
}
