package o;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;

/* JADX INFO: renamed from: o.pN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2455pN {
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f969o;

    public AbstractC2455pN() {
        if (C2743sL.m == null) {
            C2743sL.m = new C2743sL(20);
        }
    }

    public int a(int i) {
        if (i < this.n) {
            return ((ByteBuffer) this.f969o).getShort(this.m + i);
        }
        return 0;
    }

    public void b() {
        if (((C2552qN) this.f969o).s != this.n) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public Object e(View view) {
        if (Build.VERSION.SDK_INT >= this.m) {
            return c(view);
        }
        Object tag = view.getTag(this.l);
        if (((Class) this.f969o).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public void f() {
        while (true) {
            int i = this.l;
            C2552qN c2552qN = (C2552qN) this.f969o;
            if (i >= c2552qN.q || c2552qN.n[i] >= 0) {
                return;
            } else {
                this.l = i + 1;
            }
        }
    }

    public void g(View view, Object obj) {
        C3003v0 c3003v0;
        if (Build.VERSION.SDK_INT >= this.m) {
            d(view, obj);
            return;
        }
        if (h(e(view), obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = It0.c(view);
            if (accessibilityDelegateC == null) {
                c3003v0 = null;
            } else {
                c3003v0 = accessibilityDelegateC instanceof C2906u0 ? ((C2906u0) accessibilityDelegateC).a : new C3003v0(accessibilityDelegateC);
            }
            if (c3003v0 == null) {
                c3003v0 = new C3003v0();
            }
            It0.p(view, c3003v0);
            view.setTag(this.l, obj);
            It0.i(view, this.n);
        }
    }

    public abstract boolean h(Object obj, Object obj2);

    public boolean hasNext() {
        return this.l < ((C2552qN) this.f969o).q;
    }

    public void remove() {
        b();
        if (this.m == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
        C2552qN c2552qN = (C2552qN) this.f969o;
        c2552qN.c();
        c2552qN.k(this.m);
        this.m = -1;
        this.n = c2552qN.s;
    }
}
