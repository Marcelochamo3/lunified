package o;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: o.v90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3022v90 implements Iterable {
    public C2731s90 l;
    public C2731s90 m;
    public final WeakHashMap n = new WeakHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1071o = 0;

    public C2731s90 a(Object obj) {
        C2731s90 c2731s90 = this.l;
        while (c2731s90 != null && !c2731s90.l.equals(obj)) {
            c2731s90 = c2731s90.n;
        }
        return c2731s90;
    }

    public Object d(Object obj) {
        C2731s90 c2731s90A = a(obj);
        if (c2731s90A == null) {
            return null;
        }
        this.f1071o--;
        WeakHashMap weakHashMap = this.n;
        if (!weakHashMap.isEmpty()) {
            Iterator it = weakHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((AbstractC2925u90) it.next()).a(c2731s90A);
            }
        }
        C2731s90 c2731s90 = c2731s90A.f1020o;
        if (c2731s90 != null) {
            c2731s90.n = c2731s90A.n;
        } else {
            this.l = c2731s90A.n;
        }
        C2731s90 c2731s91 = c2731s90A.n;
        if (c2731s91 != null) {
            c2731s91.f1020o = c2731s90;
        } else {
            this.m = c2731s90;
        }
        c2731s90A.n = null;
        c2731s90A.f1020o = null;
        return c2731s90A.m;
    }

    public final boolean equals(Object obj) {
        C2634r90 c2634r90;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3022v90)) {
            return false;
        }
        C3022v90 c3022v90 = (C3022v90) obj;
        if (this.f1071o != c3022v90.f1071o) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c3022v90.iterator();
        while (true) {
            c2634r90 = (C2634r90) it;
            if (!c2634r90.hasNext()) {
                break;
            }
            C2634r90 c2634r91 = (C2634r90) it2;
            if (!c2634r91.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c2634r90.next();
            Object next = c2634r91.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (c2634r90.hasNext() || ((C2634r90) it2).hasNext()) ? false : true;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (true) {
            C2634r90 c2634r90 = (C2634r90) it;
            if (!c2634r90.hasNext()) {
                return iHashCode;
            }
            iHashCode += ((Map.Entry) c2634r90.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        C2634r90 c2634r90 = new C2634r90(this.l, this.m, 0);
        this.n.put(c2634r90, Boolean.FALSE);
        return c2634r90;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            C2634r90 c2634r90 = (C2634r90) it;
            if (!c2634r90.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) c2634r90.next()).toString());
            if (c2634r90.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
