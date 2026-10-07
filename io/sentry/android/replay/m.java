package io.sentry.android.replay;

import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class m extends CopyOnWriteArrayList {
    public final /* synthetic */ n l;

    public m(n nVar) {
        this.l = nVar;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        t tVar = (t) obj;
        for (View view : this.l.b) {
            if (tVar != null) {
                tVar.a(view, true);
            }
        }
        return super.add(tVar);
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null ? true : obj instanceof t) {
            return super.contains((t) obj);
        }
        return false;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj == null ? true : obj instanceof t) {
            return super.indexOf((t) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj == null ? true : obj instanceof t) {
            return super.lastIndexOf((t) obj);
        }
        return -1;
    }

    @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null ? true : obj instanceof t) {
            return super.remove((t) obj);
        }
        return false;
    }
}
