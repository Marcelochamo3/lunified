package o;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class XG extends Aq0 {
    public boolean l;
    public final /* synthetic */ Object m;

    public XG(Object obj) {
        this.m = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.l;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.l) {
            throw new NoSuchElementException();
        }
        this.l = true;
        return this.m;
    }
}
