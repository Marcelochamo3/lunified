package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class O5 implements Iterator, InterfaceC1770iI {
    public int l;
    public int m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f425o;
    public final /* synthetic */ Object p;

    public O5(int i) {
        this.l = i;
    }

    public final Object a(int i) {
        switch (this.f425o) {
            case 0:
                return ((S5) this.p).f(i);
            case 1:
                return ((S5) this.p).j(i);
            default:
                return ((U5) this.p).m[i];
        }
    }

    public final void b(int i) {
        switch (this.f425o) {
            case 0:
                ((S5) this.p).h(i);
                break;
            case 1:
                ((S5) this.p).h(i);
                break;
            default:
                ((U5) this.p).a(i);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.m < this.l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.m);
        this.m++;
        this.n = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.n) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i = this.m - 1;
        this.m = i;
        b(i);
        this.l--;
        this.n = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O5(U5 u5) {
        this(u5.n);
        this.f425o = 2;
        this.p = u5;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public O5(S5 s5, int i) {
        this(s5.n);
        this.f425o = i;
        switch (i) {
            case 1:
                this.p = s5;
                this(s5.n);
                break;
            default:
                this.p = s5;
                break;
        }
    }
}
