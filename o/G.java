package o;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public class G implements Iterator, InterfaceC1770iI {
    public final /* synthetic */ int l;
    public int m;
    public final Object n;

    public /* synthetic */ G(int i, Object obj) {
        this.l = i;
        this.n = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.l) {
            case 0:
                return this.m < ((J) this.n).a();
            case 1:
                return this.m < ((Object[]) this.n).length;
            case 2:
                return this.m < ((C2866tf0) this.n).h();
            default:
                return this.m < ((ViewGroup) this.n).getChildCount();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.l) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i = this.m;
                this.m = i + 1;
                return ((J) this.n).get(i);
            case 1:
                try {
                    Object[] objArr = (Object[]) this.n;
                    int i2 = this.m;
                    this.m = i2 + 1;
                    return objArr[i2];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.m--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 2:
                int i3 = this.m;
                this.m = i3 + 1;
                return ((C2866tf0) this.n).j(i3);
            default:
                int i4 = this.m;
                this.m = i4 + 1;
                View childAt = ((ViewGroup) this.n).getChildAt(i4);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.l) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                int i = this.m - 1;
                this.m = i;
                ((ViewGroup) this.n).removeViewAt(i);
                return;
        }
    }

    public G(Object[] objArr) {
        this.l = 1;
        AbstractC1474fG.j(objArr, "array");
        this.n = objArr;
    }
}
