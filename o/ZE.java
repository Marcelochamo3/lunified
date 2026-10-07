package o;

import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class ZE extends AbstractC0985aF {
    public final transient int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final transient int f653o;
    public final /* synthetic */ AbstractC0985aF p;

    public ZE(AbstractC0985aF abstractC0985aF, int i, int i2) {
        this.p = abstractC0985aF;
        this.n = i;
        this.f653o = i2;
    }

    @Override // o.UE
    public final Object[] e() {
        return this.p.e();
    }

    @Override // o.UE
    public final int f() {
        return this.p.g() + this.n + this.f653o;
    }

    @Override // o.UE
    public final int g() {
        return this.p.g() + this.n;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC1459f50.h(i, this.f653o);
        return this.p.get(i + this.n);
    }

    @Override // o.UE
    public final boolean h() {
        return true;
    }

    @Override // o.AbstractC0985aF, o.UE, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // o.AbstractC0985aF, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // o.AbstractC0985aF, java.util.List
    /* JADX INFO: renamed from: r */
    public final AbstractC0985aF subList(int i, int i2) {
        AbstractC1459f50.j(i, i2, this.f653o);
        int i3 = this.n;
        return this.p.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f653o;
    }

    @Override // o.AbstractC0985aF, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }
}
