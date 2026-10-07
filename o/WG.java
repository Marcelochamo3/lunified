package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class WG extends Aq0 {
    public int l;
    public Object m;
    public final /* synthetic */ int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Iterator f591o;
    public final /* synthetic */ Object p;

    public WG() {
        this.l = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Object a() {
        Object next;
        Object next2;
        switch (this.n) {
            case 0:
                do {
                    Iterator it = this.f591o;
                    if (!it.hasNext()) {
                        this.l = 3;
                        return null;
                    }
                    next = it.next();
                } while (!((I20) this.p).apply(next));
                return next;
            default:
                do {
                    Iterator it2 = this.f591o;
                    if (!it2.hasNext()) {
                        this.l = 3;
                        return null;
                    }
                    next2 = it2.next();
                } while (!((Hc0) this.p).m.contains(next2));
                return next2;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.l;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iW = AbstractC1701hf0.w(i);
        if (iW == 0) {
            return true;
        }
        if (iW == 2) {
            return false;
        }
        this.l = 4;
        this.m = a();
        if (this.l == 3) {
            return false;
        }
        this.l = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.l = 2;
        Object obj = this.m;
        this.m = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WG(Iterator it, I20 i20) {
        this();
        this.n = 0;
        this.f591o = it;
        this.p = i20;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WG(Hc0 hc0) {
        this();
        this.n = 1;
        this.p = hc0;
        this.f591o = hc0.l.iterator();
    }
}
