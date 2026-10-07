package o;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class VF implements Iterator, InterfaceC1770iI {
    public abstract int a();

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
