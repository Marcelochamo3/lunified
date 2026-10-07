package o;

import j$.util.Objects;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: o.Af, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0289Af extends AbstractMap implements Serializable {
    public static final Object u = new Object();
    public transient Object l;
    public transient int[] m;
    public transient Object[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient Object[] f175o;
    public transient int p;
    public transient int q;
    public transient C3350yf r;
    public transient C3350yf s;
    public transient C0960a0 t;

    public static C0289Af a(int i) {
        C0289Af c0289Af = new C0289Af();
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        c0289Af.p = Pu0.h(i, 1);
        return c0289Af;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int i = objectInputStream.readInt();
        if (i < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(i);
            throw new InvalidObjectException(sb.toString());
        }
        if (i < 0) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        this.p = Pu0.h(i, 1);
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Map mapB = b();
        Iterator it = mapB != null ? mapB.entrySet().iterator() : new C3253xf(this, 1);
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public final Map b() {
        Object obj = this.l;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.p & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.p += 32;
        Map mapB = b();
        if (mapB != null) {
            this.p = Pu0.h(size(), 3);
            mapB.clear();
            this.l = null;
            this.q = 0;
            return;
        }
        Arrays.fill(i(), 0, this.q, (Object) null);
        Arrays.fill(j(), 0, this.q, (Object) null);
        Object obj = this.l;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.q, 0);
        this.q = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i = 0; i < this.q; i++) {
            if (AbstractC1459f50.p(obj, j()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iQ = AbstractC1370eA.Q(obj);
        int iC = c();
        Object obj2 = this.l;
        Objects.requireNonNull(obj2);
        int iD = AbstractC1468fA.D(iQ & iC, obj2);
        if (iD == 0) {
            return -1;
        }
        int i = ~iC;
        int i2 = iQ & i;
        do {
            int i3 = iD - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && AbstractC1459f50.p(obj, i()[i3])) {
                return i3;
            }
            iD = i4 & iC;
        } while (iD != 0);
        return -1;
    }

    public final void e(int i, int i2) {
        Object obj = this.l;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrI[i] = null;
            objArrJ[i] = null;
            iArrH[i] = 0;
            return;
        }
        Object obj2 = objArrI[i3];
        objArrI[i] = obj2;
        objArrJ[i] = objArrJ[i3];
        objArrI[i3] = null;
        objArrJ[i3] = null;
        iArrH[i] = iArrH[i3];
        iArrH[i3] = 0;
        int iQ = AbstractC1370eA.Q(obj2) & i2;
        int iD = AbstractC1468fA.D(iQ, obj);
        if (iD == size) {
            AbstractC1468fA.E(iQ, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iD - 1;
            int i5 = iArrH[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrH[i4] = AbstractC1468fA.u(i5, i + 1, i2);
                return;
            }
            iD = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C3350yf c3350yf = this.s;
        if (c3350yf != null) {
            return c3350yf;
        }
        C3350yf c3350yf2 = new C3350yf(0, this);
        this.s = c3350yf2;
        return c3350yf2;
    }

    public final boolean f() {
        return this.l == null;
    }

    public final Object g(Object obj) {
        boolean zF = f();
        Object obj2 = u;
        if (zF) {
            return obj2;
        }
        int iC = c();
        Object obj3 = this.l;
        Objects.requireNonNull(obj3);
        int iA = AbstractC1468fA.A(obj, null, iC, obj3, h(), i(), null);
        if (iA == -1) {
            return obj2;
        }
        Object obj4 = j()[iA];
        e(iA, iC);
        this.q--;
        this.p += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.m;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.n;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.f175o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object objK = AbstractC1468fA.k(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            AbstractC1468fA.E(i3 & i5, i4 + 1, objK);
        }
        Object obj = this.l;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int iD = AbstractC1468fA.D(i6, obj);
            while (iD != 0) {
                int i7 = iD - 1;
                int i8 = iArrH[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iD2 = AbstractC1468fA.D(i10, objK);
                AbstractC1468fA.E(i10, iD, objK);
                iArrH[i7] = AbstractC1468fA.u(i9, iD2, i5);
                iD = i8 & i;
            }
        }
        this.l = objK;
        this.p = AbstractC1468fA.u(this.p, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C3350yf c3350yf = this.r;
        if (c3350yf != null) {
            return c3350yf;
        }
        C3350yf c3350yf2 = new C3350yf(1, this);
        this.r = c3350yf2;
        return c3350yf2;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106 A[LOOP:1: B:42:0x00ef->B:45:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea A[EDGE_INSN: B:66:0x00ea->B:40:0x00ea BREAK  A[LOOP:1: B:42:0x00ef->B:45:0x0106], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0104 -> B:40:0x00ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // java.util.AbstractMap, java.util.Map
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0289Af.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == u) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.q;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C0960a0 c0960a0 = this.t;
        if (c0960a0 != null) {
            return c0960a0;
        }
        C0960a0 c0960a1 = new C0960a0(1, this);
        this.t = c0960a1;
        return c0960a1;
    }
}
