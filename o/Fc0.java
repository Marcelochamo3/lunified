package o;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class Fc0 extends AbstractC1253d0 implements Serializable {
    public static final Fc0 m;
    public final C2552qN l;

    static {
        C2552qN c2552qN = C2552qN.y;
        m = new Fc0(C2552qN.y);
    }

    public Fc0(C2552qN c2552qN) {
        AbstractC1474fG.j(c2552qN, "backing");
        this.l = c2552qN;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.l.x) {
            return new C1499fc0(1, this);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // o.AbstractC1253d0
    public final int a() {
        return this.l.t;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.l.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        this.l.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.l.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.l.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.l.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        C2552qN c2552qN = this.l;
        c2552qN.getClass();
        return new C2261nN(c2552qN, 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C2552qN c2552qN = this.l;
        c2552qN.c();
        int iG = c2552qN.g(obj);
        if (iG < 0) {
            iG = -1;
        } else {
            c2552qN.k(iG);
        }
        return iG >= 0;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        this.l.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        AbstractC1474fG.j(collection, "elements");
        this.l.c();
        return super.retainAll(collection);
    }

    public Fc0() {
        this(new C2552qN());
    }
}
