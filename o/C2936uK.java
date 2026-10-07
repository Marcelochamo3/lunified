package o;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.uK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2936uK implements Iterator {
    public C3130wK l;
    public C3130wK m = null;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C3227xK f1054o;
    public final /* synthetic */ int p;

    public C2936uK(C3227xK c3227xK, int i) {
        this.p = i;
        this.f1054o = c3227xK;
        this.l = c3227xK.q.f1091o;
        this.n = c3227xK.p;
    }

    public final Object a() {
        return b();
    }

    public final C3130wK b() {
        C3130wK c3130wK = this.l;
        C3227xK c3227xK = this.f1054o;
        if (c3130wK == c3227xK.q) {
            throw new NoSuchElementException();
        }
        if (c3227xK.p != this.n) {
            throw new ConcurrentModificationException();
        }
        this.l = c3130wK.f1091o;
        this.m = c3130wK;
        return c3130wK;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.l != this.f1054o.q;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.p) {
            case 1:
                return b().q;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        C3130wK c3130wK = this.m;
        if (c3130wK == null) {
            throw new IllegalStateException();
        }
        C3227xK c3227xK = this.f1054o;
        c3227xK.c(c3130wK, true);
        this.m = null;
        this.n = c3227xK.p;
    }
}
