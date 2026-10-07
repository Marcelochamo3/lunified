package o;

import java.util.AbstractSet;
import java.util.Set;

/* JADX INFO: renamed from: o.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1253d0 extends AbstractSet implements Set, InterfaceC1866jI {
    public abstract int a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return a();
    }
}
