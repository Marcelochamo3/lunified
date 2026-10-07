package o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: o.ze0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3446ze0 extends AbstractC2342o80 implements InterfaceC0775Sy {
    public Object m;
    public Iterator n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1159o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ int r;
    public final /* synthetic */ int s;
    public final /* synthetic */ Iterator t;
    public final /* synthetic */ boolean u;
    public final /* synthetic */ boolean v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3446ze0(int i, int i2, Iterator it, boolean z, boolean z2, InterfaceC0473Hh interfaceC0473Hh) {
        super(interfaceC0473Hh);
        this.r = i;
        this.s = i2;
        this.t = it;
        this.u = z;
        this.v = z2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3446ze0) o((Sb0) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        C3446ze0 c3446ze0 = new C3446ze0(this.r, this.s, this.t, this.u, this.v, interfaceC0473Hh);
        c3446ze0.q = obj;
        return c3446ze0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0110  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:62:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x0140  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:83:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0121 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x011e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x0087 A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        int i;
        A80 a80;
        Sb0 sb0;
        Iterator it;
        ArrayList arrayList;
        Sb0 sb1;
        Iterator it2;
        int i2;
        Object next;
        A80 a81;
        Sb0 sb2;
        Object next2;
        int iA;
        int i3;
        Object[] objArr;
        Object arrayList2;
        int i4;
        Object[] array;
        Object arrayList3;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i5 = this.p;
        boolean z = this.v;
        boolean z2 = this.u;
        int i6 = this.s;
        int i7 = this.r;
        if (i5 == 0) {
            Jp0.O(obj);
            Sb0 sb3 = (Sb0) this.q;
            int i8 = i7 <= 1024 ? i7 : 1024;
            i = i6 - i7;
            Iterator it3 = this.t;
            if (i >= 0) {
                arrayList = new ArrayList(i8);
                sb1 = sb3;
                it2 = it3;
                i2 = 0;
                while (it2.hasNext()) {
                    next = it2.next();
                    if (i2 > 0) {
                        i2--;
                    } else {
                        arrayList.add(next);
                        if (arrayList.size() == i7) {
                            this.q = sb1;
                            this.m = arrayList;
                            this.n = it2;
                            this.f1159o = i;
                            this.p = 1;
                            sb1.c(arrayList, this);
                            return enumC1706hi;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.q = null;
                    this.m = null;
                    this.n = null;
                    this.p = 2;
                    sb1.c(arrayList, this);
                    return enumC1706hi;
                }
            } else {
                a80 = new A80(0, new Object[i8]);
                sb0 = sb3;
                it = it3;
                while (it.hasNext()) {
                    next2 = it.next();
                    iA = a80.a();
                    i3 = a80.n;
                    if (iA != i3) {
                        throw new IllegalStateException("ring buffer is full");
                    }
                    int i9 = a80.f166o;
                    int i10 = a80.p;
                    objArr = a80.m;
                    objArr[(i9 + i10) % i3] = next2;
                    a80.p = i10 + 1;
                    if (a80.a() != i3) {
                        if (a80.p < i7) {
                            if (z2) {
                                arrayList2 = a80;
                            } else {
                                arrayList2 = new ArrayList(a80);
                            }
                            this.q = sb0;
                            this.m = a80;
                            this.n = it;
                            this.p = 3;
                            sb0.c(arrayList2, this);
                            return enumC1706hi;
                        }
                        i4 = i3 + (i3 >> 1) + 1;
                        if (i4 > i7) {
                            i4 = i7;
                        }
                        if (a80.f166o == 0) {
                            array = Arrays.copyOf(objArr, i4);
                            AbstractC1474fG.i(array, "copyOf(...)");
                        } else {
                            array = a80.toArray(new Object[i4]);
                        }
                        a80 = new A80(a80.p, array);
                    }
                }
                if (z) {
                    a81 = a80;
                    sb2 = sb0;
                    if (a81.p > i6) {
                        if (z2) {
                            arrayList3 = a81;
                        } else {
                            arrayList3 = new ArrayList(a81);
                        }
                        this.q = sb2;
                        this.m = a81;
                        this.n = null;
                        this.p = 4;
                        sb2.c(arrayList3, this);
                        return enumC1706hi;
                    }
                    if (true ^ a81.isEmpty()) {
                        this.q = null;
                        this.m = null;
                        this.n = null;
                        this.p = 5;
                        sb2.c(a81, this);
                        return enumC1706hi;
                    }
                }
            }
        } else if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    it = this.n;
                    a80 = (A80) this.m;
                    sb0 = (Sb0) this.q;
                    Jp0.O(obj);
                    a80.d(i6);
                    while (it.hasNext()) {
                        next2 = it.next();
                        iA = a80.a();
                        i3 = a80.n;
                        if (iA != i3) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i11 = a80.f166o;
                        int i12 = a80.p;
                        objArr = a80.m;
                        objArr[(i11 + i12) % i3] = next2;
                        a80.p = i12 + 1;
                        if (a80.a() != i3) {
                            if (a80.p < i7) {
                                if (z2) {
                                    arrayList2 = a80;
                                } else {
                                    arrayList2 = new ArrayList(a80);
                                }
                                this.q = sb0;
                                this.m = a80;
                                this.n = it;
                                this.p = 3;
                                sb0.c(arrayList2, this);
                                return enumC1706hi;
                            }
                            i4 = i3 + (i3 >> 1) + 1;
                            if (i4 > i7) {
                                i4 = i7;
                            }
                            if (a80.f166o == 0) {
                                array = Arrays.copyOf(objArr, i4);
                                AbstractC1474fG.i(array, "copyOf(...)");
                            } else {
                                array = a80.toArray(new Object[i4]);
                            }
                            a80 = new A80(a80.p, array);
                        }
                    }
                    if (z) {
                        a81 = a80;
                        sb2 = sb0;
                    }
                } else if (i5 == 4) {
                    a81 = (A80) this.m;
                    sb2 = (Sb0) this.q;
                    Jp0.O(obj);
                    a81.d(i6);
                } else if (i5 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                if (a81.p > i6) {
                    if (z2) {
                        arrayList3 = a81;
                    } else {
                        arrayList3 = new ArrayList(a81);
                    }
                    this.q = sb2;
                    this.m = a81;
                    this.n = null;
                    this.p = 4;
                    sb2.c(arrayList3, this);
                    return enumC1706hi;
                }
                if (true ^ a81.isEmpty()) {
                    this.q = null;
                    this.m = null;
                    this.n = null;
                    this.p = 5;
                    sb2.c(a81, this);
                    return enumC1706hi;
                }
            }
            Jp0.O(obj);
        } else {
            i2 = this.f1159o;
            it2 = this.n;
            arrayList = (ArrayList) this.m;
            sb1 = (Sb0) this.q;
            Jp0.O(obj);
            if (z2) {
                arrayList.clear();
            } else {
                arrayList = new ArrayList(i7);
            }
            i = i2;
            while (it2.hasNext()) {
                next = it2.next();
                if (i2 > 0) {
                    i2--;
                } else {
                    arrayList.add(next);
                    if (arrayList.size() == i7) {
                        this.q = sb1;
                        this.m = arrayList;
                        this.n = it2;
                        this.f1159o = i;
                        this.p = 1;
                        sb1.c(arrayList, this);
                        return enumC1706hi;
                    }
                }
            }
            if ((!arrayList.isEmpty()) && (z || arrayList.size() == i7)) {
                this.q = null;
                this.m = null;
                this.n = null;
                this.p = 2;
                sb1.c(arrayList, this);
                return enumC1706hi;
            }
        }
        return C2985uq0.a;
    }
}
