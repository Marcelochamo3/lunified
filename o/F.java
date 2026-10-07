package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class F implements Iterator, InterfaceC1770iI {
    public EnumC2481pg0 l = EnumC2481pg0.m;
    public Object m;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        EnumC2481pg0 enumC2481pg0 = this.l;
        EnumC2481pg0 enumC2481pg1 = EnumC2481pg0.f977o;
        if (enumC2481pg0 == enumC2481pg1) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        int iOrdinal = enumC2481pg0.ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal != 2) {
            this.l = enumC2481pg1;
            a();
            if (this.l == EnumC2481pg0.l) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.l = EnumC2481pg0.m;
        return this.m;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
