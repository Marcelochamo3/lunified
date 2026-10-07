package io.sentry.android.replay;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import o.AbstractC1474fG;
import o.C3176wp;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ArrayList {
    public final /* synthetic */ int l = 0;
    public final Object m;

    public l(C3176wp c3176wp, int i) {
        super(i);
        this.m = c3176wp;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        switch (this.l) {
            case 0:
                View view = (View) obj;
                AbstractC1474fG.j(view, "element");
                Iterator it = ((n) this.m).a.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).a(view, true);
                }
                return super.add(view);
            default:
                d();
                return super.add(obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        switch (this.l) {
            case 0:
                AbstractC1474fG.j(collection, "elements");
                for (t tVar : ((n) this.m).a) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        tVar.a((View) it.next(), true);
                    }
                }
                break;
            default:
                d();
                break;
        }
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        switch (this.l) {
            case 1:
                d();
                super.clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.l) {
            case 0:
                if (obj instanceof View) {
                    return super.contains((View) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    public void d() {
        ((C3176wp) this.m).p = null;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.l) {
            case 0:
                if (obj instanceof View) {
                    return super.indexOf((View) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.l) {
            case 0:
                if (obj instanceof View) {
                    return super.lastIndexOf((View) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        switch (this.l) {
            case 0:
                Object objRemove = super.remove(i);
                AbstractC1474fG.i(objRemove, "super.removeAt(index)");
                View view = (View) objRemove;
                Iterator it = ((n) this.m).a.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).a(view, false);
                }
                return view;
            default:
                d();
                return super.remove(i);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        switch (this.l) {
            case 1:
                d();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    public void removeRange(int i, int i2) {
        switch (this.l) {
            case 1:
                d();
                super.removeRange(i, i2);
                break;
            default:
                super.removeRange(i, i2);
                break;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        switch (this.l) {
            case 1:
                d();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        switch (this.l) {
            case 1:
                d();
                break;
        }
        return super.set(i, obj);
    }

    public l(n nVar) {
        this.m = nVar;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        switch (this.l) {
            case 0:
                if (obj instanceof View) {
                    return super.remove((View) obj);
                }
                return false;
            default:
                d();
                return super.remove(obj);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        switch (this.l) {
            case 1:
                d();
                super.add(i, obj);
                break;
            default:
                super.add(i, obj);
                break;
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        switch (this.l) {
            case 1:
                d();
                break;
        }
        return super.addAll(i, collection);
    }
}
