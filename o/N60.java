package o;

import j$.util.Objects;
import java.util.AbstractMap;

/* JADX INFO: loaded from: classes.dex */
public final class N60 extends AbstractC0985aF {
    public final /* synthetic */ O60 n;

    public N60(O60 o60) {
        this.n = o60;
    }

    @Override // java.util.List
    public final Object get(int i) {
        O60 o60 = this.n;
        AbstractC1459f50.h(i, o60.r);
        int i2 = i * 2;
        int i3 = o60.q;
        Object[] objArr = o60.p;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // o.UE
    public final boolean h() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.n.r;
    }
}
