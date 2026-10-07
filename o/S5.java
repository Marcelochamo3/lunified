package o;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes.dex */
public class S5 extends Nd0 implements Map, j$.util.Map {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C3350yf f505o;
    public P5 p;
    public R5 q;

    public S5(S5 s5) {
        super(0);
        if (s5 != null) {
            g(s5);
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return j$.util.Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return j$.util.Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // o.Nd0, java.util.Map
    public final boolean containsKey(Object obj) {
        return super.containsKey(obj);
    }

    @Override // o.Nd0, java.util.Map
    public final boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        C3350yf c3350yf = this.f505o;
        if (c3350yf != null) {
            return c3350yf;
        }
        C3350yf c3350yf2 = new C3350yf(2, this);
        this.f505o = c3350yf2;
        return c3350yf2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        j$.util.Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // o.Nd0, java.util.Map
    public final Object get(Object obj) {
        return super.get(obj);
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        P5 p5 = this.p;
        if (p5 != null) {
            return p5;
        }
        P5 p6 = new P5(this);
        this.p = p6;
        return p6;
    }

    public final boolean l(Collection collection) {
        int i = this.n;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.n;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return j$.util.Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.n);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // o.Nd0, java.util.Map
    public final Object remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        j$.util.Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final Collection values() {
        R5 r5 = this.q;
        if (r5 != null) {
            return r5;
        }
        R5 r6 = new R5(this);
        this.q = r6;
        return r6;
    }
}
