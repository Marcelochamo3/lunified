package o;

import j$.util.Objects;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: o.vK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3033vK extends AbstractSet {
    public final /* synthetic */ int l;
    public final /* synthetic */ C3227xK m;

    public /* synthetic */ C3033vK(C3227xK c3227xK, int i) {
        this.l = i;
        this.m = c3227xK;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.l) {
            case 0:
                this.m.clear();
                break;
            default:
                this.m.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        C3130wK c3130wKA;
        switch (this.l) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C3227xK c3227xK = this.m;
                c3227xK.getClass();
                Object key = entry.getKey();
                C3130wK c3130wK = null;
                if (key != null) {
                    try {
                        c3130wKA = c3227xK.a(key, false);
                    } catch (ClassCastException unused) {
                        c3130wKA = null;
                    }
                    break;
                } else {
                    c3130wKA = null;
                }
                if (c3130wKA != null && Objects.equals(c3130wKA.s, entry.getValue())) {
                    c3130wK = c3130wKA;
                }
                return c3130wK != null;
            default:
                return this.m.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.l) {
            case 0:
                return new C2936uK(this.m, 0);
            default:
                return new C2936uK(this.m, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        C3130wK c3130wKA;
        switch (this.l) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                C3227xK c3227xK = this.m;
                c3227xK.getClass();
                Object key = entry.getKey();
                C3130wK c3130wK = null;
                if (key != null) {
                    try {
                        c3130wKA = c3227xK.a(key, false);
                    } catch (ClassCastException unused) {
                        c3130wKA = null;
                    }
                    break;
                } else {
                    c3130wKA = null;
                }
                if (c3130wKA != null && Objects.equals(c3130wKA.s, entry.getValue())) {
                    c3130wK = c3130wKA;
                }
                if (c3130wK == null) {
                    return false;
                }
                c3227xK.c(c3130wK, true);
                return true;
            default:
                C3227xK c3227xK2 = this.m;
                c3227xK2.getClass();
                C3130wK c3130wKA2 = null;
                if (obj != null) {
                    try {
                        c3130wKA2 = c3227xK2.a(obj, false);
                        break;
                    } catch (ClassCastException unused2) {
                    }
                }
                if (c3130wKA2 != null) {
                    c3227xK2.c(c3130wKA2, true);
                }
                return c3130wKA2 != null;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.l) {
            case 0:
                break;
        }
        return this.m.f1115o;
    }
}
