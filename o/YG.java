package o;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class YG implements Iterator {
    public static final YG l;
    public static final /* synthetic */ YG[] m;

    static {
        YG yg = new YG("INSTANCE", 0);
        l = yg;
        m = new YG[]{yg};
    }

    public static YG valueOf(String str) {
        return (YG) Enum.valueOf(YG.class, str);
    }

    public static YG[] values() {
        return (YG[]) m.clone();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
