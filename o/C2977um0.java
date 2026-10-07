package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: o.um0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2977um0 implements Iterator, InterfaceC1770iI {
    public final /* synthetic */ int l;
    public Iterator m;
    public final Object n;

    public C2977um0(G g) {
        this.l = 1;
        this.n = new ArrayList();
        this.m = g;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.l) {
            case 0:
                break;
        }
        return this.m.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.l) {
            case 0:
                return ((C3074vm0) this.n).b.b(this.m.next());
            default:
                Object next = this.m.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                G g = viewGroup != null ? new G(3, viewGroup) : null;
                ArrayList arrayList = (ArrayList) this.n;
                if (g == null || !g.hasNext()) {
                    while (!this.m.hasNext() && (!arrayList.isEmpty())) {
                        this.m = (Iterator) AbstractC0911Ye.i0(arrayList);
                        AbstractC1406ef.T(arrayList);
                    }
                } else {
                    arrayList.add(this.m);
                    this.m = g;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C2977um0(C3074vm0 c3074vm0) {
        this.l = 0;
        this.n = c3074vm0;
        this.m = c3074vm0.a.iterator();
    }
}
