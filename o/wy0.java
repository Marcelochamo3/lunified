package o;

import j$.lang.Iterable$EL;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes.dex */
public class wy0 implements Serializable {
    public static final int r = 1;
    public static final int s = 2;
    private static final long serialVersionUID = -9220510891189510942L;
    private Map<C2848tT, Object> l;
    private C2848tT m;
    private Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private X40 f1107o;
    private C1467f90 p;
    private boolean q;

    public class a implements Iterator<X40> {
        private final Iterator<Map.Entry<C2848tT, Object>> l;
        private X40[] m;
        private int n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f1108o;

        public a(boolean z) {
            synchronized (wy0.this) {
                this.l = wy0.this.l.entrySet().iterator();
            }
            this.f1108o = z;
            X40[] x40ArrL = wy0.this.l(wy0.this.n);
            this.m = new X40[x40ArrL.length];
            int i = 2;
            for (int i2 = 0; i2 < x40ArrL.length; i2++) {
                int type = x40ArrL[i2].getType();
                if (type == 6) {
                    this.m[0] = x40ArrL[i2];
                } else if (type == 2) {
                    this.m[1] = x40ArrL[i2];
                } else {
                    this.m[i] = x40ArrL[i2];
                    i++;
                }
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public X40 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            X40[] x40Arr = this.m;
            if (x40Arr == null) {
                this.f1108o = false;
                wy0 wy0Var = wy0.this;
                return wy0Var.C(wy0Var.n, 6);
            }
            int i = this.n;
            int i2 = i + 1;
            this.n = i2;
            X40 x40 = x40Arr[i];
            if (i2 == x40Arr.length) {
                this.m = null;
                while (this.l.hasNext()) {
                    Map.Entry<C2848tT, Object> next = this.l.next();
                    if (!next.getKey().equals(wy0.this.m)) {
                        X40[] x40ArrL = wy0.this.l(next.getValue());
                        if (x40ArrL.length != 0) {
                            this.m = x40ArrL;
                            this.n = 0;
                            break;
                        }
                    }
                }
            }
            return x40;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.m != null || this.f1108o;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public wy0(C2848tT c2848tT, String str) throws IOException {
        this.l = new TreeMap();
        if (c2848tT == null) {
            throw new IllegalArgumentException("no zone name specified");
        }
        FN fn = new FN(str, c2848tT);
        try {
            this.m = c2848tT;
            while (true) {
                H50 h50K = fn.K();
                if (h50K == null) {
                    fn.close();
                    G();
                    return;
                }
                A(h50K);
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fn.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private void A(H50 h50) throws IOException {
        int iY = h50.y();
        C2848tT c2848tTV = h50.v();
        if (iY != 6 || c2848tTV.equals(this.m)) {
            if (c2848tTV.y(this.m)) {
                k(h50);
            }
        } else {
            throw new IOException("SOA owner " + c2848tTV + " does not match zone origin " + this.m);
        }
    }

    private void B(final StringBuffer stringBuffer, Object obj) {
        for (X40 x40 : l(obj)) {
            final int i = 0;
            Iterable$EL.forEach(x40.q(), new Consumer() { // from class: o.vy0
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    switch (i) {
                        case 0:
                            wy0.x(stringBuffer, (H50) obj2);
                            break;
                        default:
                            wy0.y(stringBuffer, (W40) obj2);
                            break;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    int i2 = i;
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final int i2 = 1;
            Iterable$EL.forEach(x40.s(), new Consumer() { // from class: o.vy0
                @Override // java.util.function.Consumer
                public final void accept(Object obj2) {
                    switch (i2) {
                        case 0:
                            wy0.x(stringBuffer, (H50) obj2);
                            break;
                        default:
                            wy0.y(stringBuffer, (W40) obj2);
                            break;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    int i3 = i2;
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized X40 C(Object obj, int i) {
        try {
            if (i == 255) {
                throw new IllegalArgumentException("oneRRset(ANY)");
            }
            if (obj instanceof List) {
                for (X40 x40 : (List) obj) {
                    if (x40.getType() == i) {
                        return x40;
                    }
                }
            } else {
                X40 x41 = (X40) obj;
                if (x41.getType() == i) {
                    return x41;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    private synchronized void D(C2848tT c2848tT, int i) {
        Object obj = this.l.get(c2848tT);
        if (obj == null) {
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (((X40) list.get(i2)).getType() == i) {
                    list.remove(i2);
                    if (list.size() == 0) {
                        this.l.remove(c2848tT);
                    }
                    return;
                }
            }
        } else if (((X40) obj).getType() == i) {
            this.l.remove(c2848tT);
        }
    }

    private void G() throws IOException {
        Object objM = m(this.m);
        this.n = objM;
        if (objM == null) {
            throw new IOException(this.m + ": no data specified");
        }
        X40 x40C = C(objM, 6);
        if (x40C == null || x40C.t() != 1) {
            throw new IOException(this.m + ": exactly 1 SOA must be specified");
        }
        this.p = (C1467f90) x40C.q().get(0);
        X40 x40C2 = C(this.n, 2);
        this.f1107o = x40C2;
        if (x40C2 != null) {
            return;
        }
        throw new IOException(this.m + ": no NS set specified");
    }

    private synchronized void i(C2848tT c2848tT, X40 x40) {
        try {
            if (!this.q && c2848tT.r()) {
                this.q = true;
            }
            Object obj = this.l.get(c2848tT);
            if (obj == null) {
                this.l.put(c2848tT, x40);
                return;
            }
            int type = x40.getType();
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    if (((X40) list.get(i)).getType() == type) {
                        list.set(i, x40);
                        return;
                    }
                }
                list.add(x40);
            } else {
                X40 x41 = (X40) obj;
                if (x41.getType() == type) {
                    this.l.put(c2848tT, x40);
                } else {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(x41);
                    linkedList.add(x40);
                    this.l.put(c2848tT, linkedList);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized X40[] l(Object obj) {
        if (obj instanceof List) {
            return (X40[]) ((List) obj).toArray(new X40[0]);
        }
        return new X40[]{(X40) obj};
    }

    private synchronized Object m(C2848tT c2848tT) {
        return this.l.get(c2848tT);
    }

    private X40 n(X40 x40, C2848tT c2848tT) {
        X40 x41 = new X40();
        Iterator<H50> it = x40.q().iterator();
        while (it.hasNext()) {
            x41.d(it.next().T(c2848tT));
        }
        Iterator<W40> it2 = x40.s().iterator();
        while (it2.hasNext()) {
            x41.d(it2.next().T(c2848tT));
        }
        return x41;
    }

    private synchronized X40 p(C2848tT c2848tT, int i) {
        Object objM = m(c2848tT);
        if (objM == null) {
            return null;
        }
        return C(objM, i);
    }

    private void r(yy0 yy0Var) throws IOException {
        synchronized (this) {
            this.l = new TreeMap();
        }
        this.m = yy0Var.j();
        yy0Var.z();
        if (!yy0Var.m()) {
            throw new IllegalArgumentException("zones can only be created from AXFRs");
        }
        Iterator<H50> it = yy0Var.g().iterator();
        while (it.hasNext()) {
            A(it.next());
        }
        G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void x(StringBuffer stringBuffer, H50 h50) {
        stringBuffer.append(h50);
        stringBuffer.append('\n');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void y(StringBuffer stringBuffer, W40 w40) {
        stringBuffer.append(w40);
        stringBuffer.append('\n');
    }

    private synchronized Gc0 z(C2848tT c2848tT, int i) {
        C2848tT c2848tT2;
        X40 x40C;
        if (!c2848tT.y(this.m)) {
            return Gc0.m(1);
        }
        int iS = c2848tT.s();
        int iS2 = this.m.s();
        int i2 = iS2;
        while (true) {
            int i3 = 0;
            if (i2 > iS) {
                if (this.q) {
                    int i4 = 0;
                    while (i4 < iS - iS2) {
                        i4++;
                        Object objM = m(c2848tT.F(i4));
                        if (objM != null) {
                            if (i == 255) {
                                Gc0 gc0 = new Gc0(6);
                                X40[] x40ArrL = l(objM);
                                int length = x40ArrL.length;
                                while (i3 < length) {
                                    gc0.a(n(x40ArrL[i3], c2848tT));
                                    i3++;
                                }
                                return gc0;
                            }
                            X40 x40C2 = C(objM, i);
                            if (x40C2 != null) {
                                return new Gc0(6, n(x40C2, c2848tT));
                            }
                        }
                    }
                }
                return Gc0.m(1);
            }
            boolean z = i2 == iS2;
            boolean z2 = i2 == iS;
            if (z) {
                c2848tT2 = this.m;
            } else {
                c2848tT2 = z2 ? c2848tT : new C2848tT(c2848tT, iS - i2);
            }
            Object objM2 = m(c2848tT2);
            if (objM2 != null) {
                if (!z && (x40C = C(objM2, 2)) != null) {
                    return new Gc0(3, x40C);
                }
                if (z2 && i == 255) {
                    Gc0 gc1 = new Gc0(6);
                    X40[] x40ArrL2 = l(objM2);
                    int length2 = x40ArrL2.length;
                    while (i3 < length2) {
                        gc1.a(x40ArrL2[i3]);
                        i3++;
                    }
                    return gc1;
                }
                if (z2) {
                    X40 x40C3 = C(objM2, i);
                    if (x40C3 != null) {
                        return new Gc0(6, x40C3);
                    }
                    X40 x40C4 = C(objM2, 5);
                    if (x40C4 != null) {
                        return new Gc0(4, x40C4);
                    }
                } else {
                    X40 x40C5 = C(objM2, 39);
                    if (x40C5 != null) {
                        return new Gc0(5, x40C5);
                    }
                }
                if (z2) {
                    return Gc0.m(2);
                }
            }
            i2++;
        }
    }

    public void E(H50 h50) {
        C2848tT c2848tTV = h50.v();
        int iW = h50.w();
        synchronized (this) {
            try {
                X40 x40P = p(c2848tTV, iW);
                if (x40P == null) {
                    return;
                }
                if (x40P.t() == 1 && x40P.m().equals(h50)) {
                    D(c2848tTV, iW);
                } else {
                    x40P.l(h50);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public synchronized String F() {
        StringBuffer stringBuffer;
        try {
            stringBuffer = new StringBuffer();
            B(stringBuffer, this.n);
            for (Map.Entry<C2848tT, Object> entry : this.l.entrySet()) {
                if (!this.m.equals(entry.getKey())) {
                    B(stringBuffer, entry.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return stringBuffer.toString();
    }

    public Iterator<X40> c() {
        return new a(true);
    }

    public void j(X40 x40) {
        i(x40.o(), x40);
    }

    public <T extends H50> void k(T t) {
        C2848tT c2848tTV = t.v();
        int iW = t.w();
        synchronized (this) {
            try {
                X40 x40P = p(c2848tTV, iW);
                if (x40P == null) {
                    i(c2848tTV, new X40(t));
                } else {
                    x40P.d(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public X40 o(C2848tT c2848tT, int i) {
        Object objM = m(c2848tT);
        if (objM == null) {
            return null;
        }
        return C(objM, i);
    }

    public Gc0 q(C2848tT c2848tT, int i) {
        return z(c2848tT, i);
    }

    public int s() {
        return 1;
    }

    public X40 t() {
        return this.f1107o;
    }

    public String toString() {
        return F();
    }

    public C2848tT u() {
        return this.m;
    }

    public C1467f90 v() {
        return this.p;
    }

    public Iterator<X40> w() {
        return new a(false);
    }

    public wy0(C2848tT c2848tT, H50[] h50Arr) throws IOException {
        this.l = new TreeMap();
        if (c2848tT != null) {
            this.m = c2848tT;
            for (H50 h50 : h50Arr) {
                A(h50);
            }
            G();
            return;
        }
        throw new IllegalArgumentException("no zone name specified");
    }

    public wy0(yy0 yy0Var) throws IOException {
        r(yy0Var);
    }

    public wy0(C2848tT c2848tT, int i, String str) throws IOException {
        yy0 yy0VarR = yy0.r(c2848tT, str, null);
        yy0VarR.C(i);
        r(yy0VarR);
    }
}
