package o;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: o.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1155c0 extends AbstractList implements List, InterfaceC1964kI {
    public abstract int a();

    public abstract Object d(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return d(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
