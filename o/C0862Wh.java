package o;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: o.Wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0862Wh implements Iterable {
    public final Object l = new Object();
    public final HashMap m = new HashMap();
    public Set n = Collections.emptySet();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f601o = Collections.emptyList();

    public final int a(Object obj) {
        int iIntValue;
        synchronized (this.l) {
            try {
                iIntValue = this.m.containsKey(obj) ? ((Integer) this.m.get(obj)).intValue() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iIntValue;
    }

    public final void d(Object obj) {
        synchronized (this.l) {
            try {
                Integer num = (Integer) this.m.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f601o);
                arrayList.remove(obj);
                this.f601o = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.m.remove(obj);
                    HashSet hashSet = new HashSet(this.n);
                    hashSet.remove(obj);
                    this.n = Collections.unmodifiableSet(hashSet);
                } else {
                    this.m.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        synchronized (this.l) {
            it = this.f601o.iterator();
        }
        return it;
    }
}
