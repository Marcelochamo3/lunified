package o;

import android.graphics.Typeface;

/* JADX INFO: renamed from: o.eb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1398eb extends AbstractC1474fG {
    public final Typeface m;
    public final C2133m1 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f756o;

    public C1398eb(C2133m1 c2133m1, Typeface typeface) {
        this.m = typeface;
        this.n = c2133m1;
    }

    @Override // o.AbstractC1474fG
    public final void L(int i) {
        if (this.f756o) {
            return;
        }
        C0859We c0859We = (C0859We) this.n.m;
        if (c0859We.j(this.m)) {
            c0859We.h(false);
        }
    }

    @Override // o.AbstractC1474fG
    public final void M(Typeface typeface, boolean z) {
        if (this.f756o) {
            return;
        }
        C0859We c0859We = (C0859We) this.n.m;
        if (c0859We.j(typeface)) {
            c0859We.h(false);
        }
    }
}
