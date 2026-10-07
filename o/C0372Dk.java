package o;

import android.os.Handler;

/* JADX INFO: renamed from: o.Dk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0372Dk implements InterfaceC0402Eo {
    public final C0350Co l;
    public InterfaceC3465zo m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C0398Ek f220o;

    public C0372Dk(C0398Ek c0398Ek, C0350Co c0350Co) {
        this.f220o = c0398Ek;
        this.l = c0350Co;
    }

    @Override // o.InterfaceC0402Eo
    public final void a() {
        Handler handler = this.f220o.E;
        handler.getClass();
        Lr0.O(handler, new Jj0(10, this));
    }
}
