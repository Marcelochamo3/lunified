package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1934jz implements Iterator, InterfaceC1770iI {
    public final /* synthetic */ int l;
    public int m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Rb0 f861o;

    public C1934jz(C2580qh0 c2580qh0) {
        this.l = 1;
        this.f861o = c2580qh0;
        this.n = c2580qh0.a.iterator();
    }

    public void a() {
        Object objB;
        int i = this.m;
        C0927Yu c0927Yu = (C0927Yu) this.f861o;
        if (i == -2) {
            objB = ((InterfaceC0360Cy) c0927Yu.b).c();
        } else {
            InterfaceC0412Ey interfaceC0412Ey = (InterfaceC0412Ey) c0927Yu.c;
            Object obj = this.n;
            AbstractC1474fG.g(obj);
            objB = interfaceC0412Ey.b(obj);
        }
        this.n = objB;
        this.m = objB == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C2580qh0 c2580qh0;
        Iterator it;
        switch (this.l) {
            case 0:
                if (this.m < 0) {
                    a();
                }
                return this.m == 1;
        }
        while (true) {
            int i = this.m;
            c2580qh0 = (C2580qh0) this.f861o;
            int i2 = c2580qh0.b;
            it = (Iterator) this.n;
            if (i < i2 && it.hasNext()) {
                it.next();
                this.m++;
            }
        }
        return this.m < c2580qh0.c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2580qh0 c2580qh0;
        Iterator it;
        switch (this.l) {
            case 0:
                if (this.m < 0) {
                    a();
                }
                if (this.m == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.n;
                AbstractC1474fG.h(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.m = -1;
                return obj;
        }
        while (true) {
            int i = this.m;
            c2580qh0 = (C2580qh0) this.f861o;
            int i2 = c2580qh0.b;
            it = (Iterator) this.n;
            if (i < i2 && it.hasNext()) {
                it.next();
                this.m++;
            }
        }
        int i3 = this.m;
        if (i3 >= c2580qh0.c) {
            throw new NoSuchElementException();
        }
        this.m = i3 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C1934jz(C0927Yu c0927Yu) {
        this.l = 0;
        this.f861o = c0927Yu;
        this.m = -2;
    }
}
