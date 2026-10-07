package o;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class HN extends J {
    public final /* synthetic */ int m = 1;
    public final Object n;

    public HN(List list) {
        this.n = list;
    }

    @Override // o.Vp0
    public final int a() {
        switch (this.m) {
            case 0:
                return ((JN) this.n).a.groupCount() + 1;
            default:
                return ((List) this.n).size();
        }
    }

    @Override // o.Vp0, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(Object obj) {
        switch (this.m) {
            case 0:
                if (obj instanceof String) {
                    return super.contains((String) obj);
                }
                return false;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.m) {
            case 0:
                String strGroup = ((JN) this.n).a.group(i);
                return strGroup == null ? "" : strGroup;
            default:
                ZF zf = new ZF(0, AbstractC0937Ze.J(this), 1);
                if (i >= 0 && i <= zf.m) {
                    return ((List) this.n).get(AbstractC0937Ze.J(this) - i);
                }
                StringBuilder sbR = AbstractC1674hK.r("Element index ", i, " must be in range [");
                sbR.append(new ZF(0, AbstractC0937Ze.J(this), 1));
                sbR.append("].");
                throw new IndexOutOfBoundsException(sbR.toString());
        }
    }

    @Override // o.J, java.util.List
    public /* bridge */ int indexOf(Object obj) {
        switch (this.m) {
            case 0:
                if (obj instanceof String) {
                    return super.indexOf((String) obj);
                }
                return -1;
            default:
                return super.indexOf(obj);
        }
    }

    @Override // o.J, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        switch (this.m) {
            case 1:
                return new C3311y80(this, 0);
            default:
                return super.iterator();
        }
    }

    @Override // o.J, java.util.List
    public /* bridge */ int lastIndexOf(Object obj) {
        switch (this.m) {
            case 0:
                if (obj instanceof String) {
                    return super.lastIndexOf((String) obj);
                }
                return -1;
            default:
                return super.lastIndexOf(obj);
        }
    }

    @Override // o.J, java.util.List
    public ListIterator listIterator() {
        switch (this.m) {
            case 1:
                return new C3311y80(this, 0);
            default:
                return super.listIterator();
        }
    }

    public HN(JN jn) {
        this.n = jn;
    }

    @Override // o.J, java.util.List
    public ListIterator listIterator(int i) {
        switch (this.m) {
            case 1:
                return new C3311y80(this, i);
            default:
                return super.listIterator(i);
        }
    }
}
