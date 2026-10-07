package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: o.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0739Ro implements Iterator, InterfaceC1770iI {
    public final /* synthetic */ int l = 1;
    public final Iterator m;
    public int n;

    public C0739Ro(Iterator it) {
        AbstractC1474fG.j(it, "iterator");
        this.m = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.l) {
            case 0:
                break;
            case 1:
                return this.m.hasNext();
            default:
                return this.n > 0 && this.m.hasNext();
        }
        while (true) {
            int i = this.n;
            it = this.m;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.n--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.l) {
            case 0:
                break;
            case 1:
                int i = this.n;
                this.n = i + 1;
                if (i >= 0) {
                    return new C3416zF(i, this.m.next());
                }
                AbstractC0937Ze.N();
                throw null;
            default:
                int i2 = this.n;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                this.n = i2 - 1;
                return this.m.next();
        }
        while (true) {
            int i3 = this.n;
            it = this.m;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.n--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0739Ro(C0765So c0765So, byte b) {
        this.n = c0765So.c;
        this.m = c0765So.b.iterator();
    }

    public C0739Ro(C0765So c0765So) {
        this.m = c0765So.b.iterator();
        this.n = c0765So.c;
    }
}
