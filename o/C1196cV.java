package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.cV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1196cV implements Iterator {
    public AbstractC1099bV l;
    public AbstractC1099bV m;
    public AbstractC1099bV n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public AbstractC1099bV f715o;
    public AbstractC1099bV p;
    public final Class q;

    public C1196cV(AbstractC1099bV abstractC1099bV, Class cls) {
        Sr0.w(abstractC1099bV);
        this.q = cls;
        if (cls.isInstance(abstractC1099bV)) {
            this.m = abstractC1099bV;
        }
        this.n = abstractC1099bV;
        this.f715o = abstractC1099bV;
        this.l = abstractC1099bV;
        this.p = abstractC1099bV.B();
    }

    public final void a() {
        AbstractC1099bV abstractC1099bV;
        if (this.m != null) {
            return;
        }
        if (this.p != null && this.n.l == null) {
            this.n = this.f715o;
        }
        AbstractC1099bV abstractC1099bVB = this.n;
        do {
            abstractC1099bV = null;
            if (abstractC1099bVB.k() > 0) {
                abstractC1099bVB = abstractC1099bVB.j(0);
            } else if (this.l.equals(abstractC1099bVB)) {
                abstractC1099bVB = null;
            } else if (abstractC1099bVB.v() != null) {
                abstractC1099bVB = abstractC1099bVB.v();
            } else {
                do {
                    abstractC1099bVB = abstractC1099bVB.B();
                    if (abstractC1099bVB == null || this.l.equals(abstractC1099bVB)) {
                    }
                    this.m = abstractC1099bV;
                } while (abstractC1099bVB.v() == null);
                abstractC1099bVB = abstractC1099bVB.v();
            }
            if (abstractC1099bVB == null) {
            }
            this.m = abstractC1099bV;
        } while (!this.q.isInstance(abstractC1099bVB));
        abstractC1099bV = abstractC1099bVB;
        this.m = abstractC1099bV;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        a();
        return this.m != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        a();
        AbstractC1099bV abstractC1099bV = this.m;
        if (abstractC1099bV == null) {
            throw new NoSuchElementException();
        }
        this.f715o = this.n;
        this.n = abstractC1099bV;
        this.p = abstractC1099bV.B();
        this.m = null;
        return abstractC1099bV;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.n.E();
    }
}
