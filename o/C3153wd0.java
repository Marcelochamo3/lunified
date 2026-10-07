package o;

import java.util.Arrays;

/* JADX INFO: renamed from: o.wd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3153wd0 extends AbstractC2131m0 implements InterfaceC1538fw, InterfaceC1734hw {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1095o;
    public final int p;
    public final int q;
    public Object[] r;
    public long s;
    public long t;
    public int u;
    public int v;

    public C3153wd0(int i, int i2, int i3) {
        this.f1095o = i;
        this.p = i2;
        this.q = i3;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x00a1, B:43:0x00a2, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x0094 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:15:0x0031, B:32:0x0079, B:34:0x0081, B:38:0x0094, B:41:0x009b, B:42:0x00a1, B:43:0x00a2, B:22:0x004b), top: B:52:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.hw] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r5v1, types: [o.m0] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [o.wd0] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v0, types: [o.hw] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [o.n0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [o.xd0] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [o.xd0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00b0 -> B:16:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:56:0x0092
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void h(o.C3153wd0 r8, o.InterfaceC1734hw r9, o.InterfaceC0473Hh r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof o.C3056vd0
            if (r0 == 0) goto L13
            r0 = r10
            o.vd0 r0 = (o.C3056vd0) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            o.vd0 r0 = new o.vd0
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.p
            o.hi r1 = o.EnumC1706hi.l
            int r2 = r0.r
            r3 = 3
            r4 = 2
            if (r2 == 0) goto L5e
            r8 = 1
            if (r2 == r8) goto L4f
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            o.AH r8 = r0.f1077o
            o.xd0 r9 = r0.n
            o.hw r2 = r0.m
            o.wd0 r5 = r0.l
            o.Jp0.O(r10)     // Catch: java.lang.Throwable -> L38
        L34:
            r10 = r2
            r2 = r8
            r8 = r5
            goto L76
        L38:
            r8 = move-exception
            goto Lb6
        L3b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L43:
            o.AH r8 = r0.f1077o
            o.xd0 r9 = r0.n
            o.hw r2 = r0.m
            o.wd0 r5 = r0.l
            o.Jp0.O(r10)     // Catch: java.lang.Throwable -> L38
            goto L79
        L4f:
            o.xd0 r9 = r0.n
            o.hw r8 = r0.m
            o.wd0 r2 = r0.l
            o.Jp0.O(r10)     // Catch: java.lang.Throwable -> L5b
            r10 = r8
            r8 = r2
            goto L6a
        L5b:
            r8 = move-exception
            r5 = r2
            goto Lb6
        L5e:
            o.Jp0.O(r10)
            o.n0 r10 = r8.b()
            o.xd0 r10 = (o.C3250xd0) r10
            r7 = r10
            r10 = r9
            r9 = r7
        L6a:
            o.ai r2 = r0.g()     // Catch: java.lang.Throwable -> Lb3
            o.rp r5 = o.C2691rp.v     // Catch: java.lang.Throwable -> Lb3
            o.Yh r2 = r2.q(r5)     // Catch: java.lang.Throwable -> Lb3
            o.AH r2 = (o.AH) r2     // Catch: java.lang.Throwable -> Lb3
        L76:
            r5 = r8
            r8 = r2
            r2 = r10
        L79:
            java.lang.Object r10 = r5.r(r9)     // Catch: java.lang.Throwable -> L38
            o.J2 r6 = o.AbstractC3045vW.d     // Catch: java.lang.Throwable -> L38
            if (r10 != r6) goto L92
            r0.l = r5     // Catch: java.lang.Throwable -> L38
            r0.m = r2     // Catch: java.lang.Throwable -> L38
            r0.n = r9     // Catch: java.lang.Throwable -> L38
            r0.f1077o = r8     // Catch: java.lang.Throwable -> L38
            r0.r = r4     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r5.f(r9, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L79
            return
        L92:
            if (r8 == 0) goto La2
            boolean r6 = r8.a()     // Catch: java.lang.Throwable -> L38
            if (r6 == 0) goto L9b
            goto La2
        L9b:
            o.JH r8 = (o.JH) r8     // Catch: java.lang.Throwable -> L38
            java.util.concurrent.CancellationException r8 = r8.H()     // Catch: java.lang.Throwable -> L38
            throw r8     // Catch: java.lang.Throwable -> L38
        La2:
            r0.l = r5     // Catch: java.lang.Throwable -> L38
            r0.m = r2     // Catch: java.lang.Throwable -> L38
            r0.n = r9     // Catch: java.lang.Throwable -> L38
            r0.f1077o = r8     // Catch: java.lang.Throwable -> L38
            r0.r = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object r10 = r2.l(r10, r0)     // Catch: java.lang.Throwable -> L38
            if (r10 != r1) goto L34
            return
        Lb3:
            r10 = move-exception
            r5 = r8
            r8 = r10
        Lb6:
            r5.e(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3153wd0.h(o.wd0, o.hw, o.Hh):void");
    }

    @Override // o.InterfaceC1538fw
    public final Object a(InterfaceC1734hw interfaceC1734hw, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        h(this, interfaceC1734hw, interfaceC0473Hh);
        return EnumC1706hi.l;
    }

    @Override // o.AbstractC2131m0
    public final AbstractC2228n0 c() {
        C3250xd0 c3250xd0 = new C3250xd0();
        c3250xd0.a = -1L;
        return c3250xd0;
    }

    @Override // o.AbstractC2131m0
    public final AbstractC2228n0[] d() {
        return new C3250xd0[2];
    }

    public final Object f(C3250xd0 c3250xd0, C3056vd0 c3056vd0) {
        C1692hb c1692hb = new C1692hb(1, Ou0.p(c3056vd0));
        c1692hb.y();
        synchronized (this) {
            if (q(c3250xd0) < 0) {
                c3250xd0.b = c1692hb;
            } else {
                c1692hb.j(C2985uq0.a);
            }
        }
        Object objX = c1692hb.x();
        return objX == EnumC1706hi.l ? objX : C2985uq0.a;
    }

    public final void g() {
        if (this.p != 0 || this.v > 1) {
            Object[] objArr = this.r;
            AbstractC1474fG.g(objArr);
            while (this.v > 0) {
                long jM = m();
                int i = this.u;
                int i2 = this.v;
                if (objArr[(objArr.length - 1) & ((int) ((jM + ((long) (i + i2))) - 1))] != AbstractC3045vW.d) {
                    return;
                }
                this.v = i2 - 1;
                AbstractC3045vW.d(objArr, m() + ((long) (this.u + this.v)), null);
            }
        }
    }

    public final void i() {
        AbstractC2228n0[] abstractC2228n0Arr;
        Object[] objArr = this.r;
        AbstractC1474fG.g(objArr);
        AbstractC3045vW.d(objArr, m(), null);
        this.u--;
        long jM = m() + 1;
        if (this.s < jM) {
            this.s = jM;
        }
        if (this.t < jM) {
            if (this.m != 0 && (abstractC2228n0Arr = this.l) != null) {
                for (AbstractC2228n0 abstractC2228n0 : abstractC2228n0Arr) {
                    if (abstractC2228n0 != null) {
                        C3250xd0 c3250xd0 = (C3250xd0) abstractC2228n0;
                        long j = c3250xd0.a;
                        if (j >= 0 && j < jM) {
                            c3250xd0.a = jM;
                        }
                    }
                }
            }
            this.t = jM;
        }
    }

    public final void j(Object obj) {
        int i = this.u + this.v;
        Object[] objArrN = this.r;
        if (objArrN == null) {
            objArrN = n(null, 0, 2);
        } else if (i >= objArrN.length) {
            objArrN = n(objArrN, i, objArrN.length * 2);
        }
        AbstractC3045vW.d(objArrN, m() + ((long) i), obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [o.Hh[]] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r6v2 */
    public final InterfaceC0473Hh[] k(InterfaceC0473Hh[] interfaceC0473HhArr) {
        AbstractC2228n0[] abstractC2228n0Arr;
        C3250xd0 c3250xd0;
        C1692hb c1692hb;
        int length = interfaceC0473HhArr.length;
        if (this.m != 0 && (abstractC2228n0Arr = this.l) != null) {
            int length2 = abstractC2228n0Arr.length;
            int i = 0;
            while (i < length2) {
                AbstractC2228n0 abstractC2228n0 = abstractC2228n0Arr[i];
                if (abstractC2228n0 == null || (c1692hb = (c3250xd0 = (C3250xd0) abstractC2228n0).b) == null || q(c3250xd0) < 0) {
                    interfaceC0473HhArr = interfaceC0473HhArr;
                } else {
                    if (length >= interfaceC0473HhArr.length) {
                        interfaceC0473HhArr = interfaceC0473HhArr;
                        interfaceC0473HhArr = interfaceC0473HhArr;
                        Object[] objArrCopyOf = Arrays.copyOf((Object[]) interfaceC0473HhArr, Math.max(2, interfaceC0473HhArr.length * 2));
                        AbstractC1474fG.i(objArrCopyOf, "copyOf(this, newSize)");
                        interfaceC0473HhArr = objArrCopyOf;
                    }
                    interfaceC0473HhArr = interfaceC0473HhArr;
                    interfaceC0473HhArr = interfaceC0473HhArr;
                    ((InterfaceC0473Hh[]) interfaceC0473HhArr)[length] = c1692hb;
                    c3250xd0.b = null;
                    length++;
                }
                i++;
                interfaceC0473HhArr = interfaceC0473HhArr;
            }
            interfaceC0473HhArr = interfaceC0473HhArr;
        }
        return (InterfaceC0473Hh[]) interfaceC0473HhArr;
    }

    @Override // o.InterfaceC1734hw
    public final Object l(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        InterfaceC0473Hh[] interfaceC0473HhArrK;
        C2959ud0 c2959ud0;
        if (o(obj)) {
            return C2985uq0.a;
        }
        C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
        c1692hb.y();
        InterfaceC0473Hh[] interfaceC0473HhArrK2 = U9.b;
        synchronized (this) {
            try {
                if (p(obj)) {
                    c1692hb.j(C2985uq0.a);
                    interfaceC0473HhArrK = k(interfaceC0473HhArrK2);
                    c2959ud0 = null;
                } else {
                    C2959ud0 c2959ud1 = new C2959ud0(this, ((long) (this.u + this.v)) + m(), obj, c1692hb);
                    j(c2959ud1);
                    this.v++;
                    if (this.p == 0) {
                        interfaceC0473HhArrK2 = k(interfaceC0473HhArrK2);
                    }
                    interfaceC0473HhArrK = interfaceC0473HhArrK2;
                    c2959ud0 = c2959ud1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2959ud0 != null) {
            c1692hb.A(new C1203cb(1, c2959ud0));
        }
        for (InterfaceC0473Hh interfaceC0473Hh2 : interfaceC0473HhArrK) {
            if (interfaceC0473Hh2 != null) {
                interfaceC0473Hh2.j(C2985uq0.a);
            }
        }
        Object objX = c1692hb.x();
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        if (objX != enumC1706hi) {
            objX = C2985uq0.a;
        }
        return objX == enumC1706hi ? objX : C2985uq0.a;
    }

    public final long m() {
        return Math.min(this.t, this.s);
    }

    public final Object[] n(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            throw new IllegalStateException("Buffer size overflow".toString());
        }
        Object[] objArr2 = new Object[i2];
        this.r = objArr2;
        if (objArr == null) {
            return objArr2;
        }
        long jM = m();
        for (int i3 = 0; i3 < i; i3++) {
            long j = ((long) i3) + jM;
            AbstractC3045vW.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
        }
        return objArr2;
    }

    public final boolean o(Object obj) {
        int i;
        boolean z;
        InterfaceC0473Hh[] interfaceC0473HhArrK = U9.b;
        synchronized (this) {
            if (p(obj)) {
                interfaceC0473HhArrK = k(interfaceC0473HhArrK);
                z = true;
            } else {
                z = false;
            }
        }
        for (InterfaceC0473Hh interfaceC0473Hh : interfaceC0473HhArrK) {
            if (interfaceC0473Hh != null) {
                interfaceC0473Hh.j(C2985uq0.a);
            }
        }
        return z;
    }

    public final boolean p(Object obj) {
        int i = this.m;
        int i2 = this.f1095o;
        if (i == 0) {
            if (i2 != 0) {
                j(obj);
                int i3 = this.u + 1;
                this.u = i3;
                if (i3 > i2) {
                    i();
                }
                this.t = m() + ((long) this.u);
            }
            return true;
        }
        int i4 = this.u;
        int i5 = this.p;
        if (i4 >= i5 && this.t <= this.s) {
            int iW = AbstractC1701hf0.w(this.q);
            if (iW == 0) {
                return false;
            }
            if (iW == 2) {
                return true;
            }
        }
        j(obj);
        int i6 = this.u + 1;
        this.u = i6;
        if (i6 > i5) {
            i();
        }
        long jM = m() + ((long) this.u);
        long j = this.s;
        if (((int) (jM - j)) > i2) {
            s(j + 1, this.t, m() + ((long) this.u), m() + ((long) this.u) + ((long) this.v));
        }
        return true;
    }

    public final long q(C3250xd0 c3250xd0) {
        long j = c3250xd0.a;
        if (j < m() + ((long) this.u)) {
            return j;
        }
        if (this.p <= 0 && j <= m() && this.v != 0) {
            return j;
        }
        return -1L;
    }

    public final Object r(C3250xd0 c3250xd0) {
        Object obj;
        InterfaceC0473Hh[] interfaceC0473HhArrT = U9.b;
        synchronized (this) {
            try {
                long jQ = q(c3250xd0);
                if (jQ < 0) {
                    obj = AbstractC3045vW.d;
                } else {
                    long j = c3250xd0.a;
                    Object[] objArr = this.r;
                    AbstractC1474fG.g(objArr);
                    Object obj2 = objArr[((int) jQ) & (objArr.length - 1)];
                    if (obj2 instanceof C2959ud0) {
                        obj2 = ((C2959ud0) obj2).n;
                    }
                    c3250xd0.a = jQ + 1;
                    Object obj3 = obj2;
                    interfaceC0473HhArrT = t(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC0473Hh interfaceC0473Hh : interfaceC0473HhArrT) {
            if (interfaceC0473Hh != null) {
                interfaceC0473Hh.j(C2985uq0.a);
            }
        }
        return obj;
    }

    public final void s(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long jM = m(); jM < jMin; jM++) {
            Object[] objArr = this.r;
            AbstractC1474fG.g(objArr);
            AbstractC3045vW.d(objArr, jM, null);
        }
        this.s = j;
        this.t = j2;
        this.u = (int) (j3 - jMin);
        this.v = (int) (j4 - j3);
    }

    public final InterfaceC0473Hh[] t(long j) {
        long j2;
        long j3;
        InterfaceC0473Hh[] interfaceC0473HhArr;
        long j4;
        AbstractC2228n0[] abstractC2228n0Arr;
        long j5 = this.t;
        InterfaceC0473Hh[] interfaceC0473HhArr2 = U9.b;
        if (j > j5) {
            return interfaceC0473HhArr2;
        }
        long jM = m();
        long j6 = ((long) this.u) + jM;
        int i = this.p;
        if (i == 0 && this.v > 0) {
            j6++;
        }
        if (this.m != 0 && (abstractC2228n0Arr = this.l) != null) {
            for (AbstractC2228n0 abstractC2228n0 : abstractC2228n0Arr) {
                if (abstractC2228n0 != null) {
                    long j7 = ((C3250xd0) abstractC2228n0).a;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.t) {
            return interfaceC0473HhArr2;
        }
        long jM2 = m() + ((long) this.u);
        int iMin = this.m > 0 ? Math.min(this.v, i - ((int) (jM2 - j6))) : this.v;
        long j8 = ((long) this.v) + jM2;
        J2 j9 = AbstractC3045vW.d;
        if (iMin > 0) {
            InterfaceC0473Hh[] interfaceC0473HhArr3 = new InterfaceC0473Hh[iMin];
            Object[] objArr = this.r;
            AbstractC1474fG.g(objArr);
            long j10 = jM2;
            int i2 = 0;
            while (true) {
                if (jM2 >= j8) {
                    j2 = j6;
                    j3 = j8;
                    break;
                }
                j2 = j6;
                Object obj = objArr[((int) jM2) & (objArr.length - 1)];
                if (obj != j9) {
                    AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    C2959ud0 c2959ud0 = (C2959ud0) obj;
                    int i3 = i2 + 1;
                    j3 = j8;
                    interfaceC0473HhArr3[i2] = c2959ud0.f1057o;
                    AbstractC3045vW.d(objArr, jM2, j9);
                    AbstractC3045vW.d(objArr, j10, c2959ud0.n);
                    j4 = 1;
                    j10++;
                    if (i3 >= iMin) {
                        break;
                    }
                    i2 = i3;
                } else {
                    j3 = j8;
                    j4 = 1;
                }
                jM2 += j4;
                j6 = j2;
                j8 = j3;
            }
            interfaceC0473HhArr = interfaceC0473HhArr3;
            jM2 = j10;
        } else {
            j2 = j6;
            j3 = j8;
            interfaceC0473HhArr = interfaceC0473HhArr2;
        }
        int i4 = (int) (jM2 - jM);
        long j11 = this.m == 0 ? jM2 : j2;
        long jMax = Math.max(this.s, jM2 - ((long) Math.min(this.f1095o, i4)));
        if (i == 0 && jMax < j3) {
            Object[] objArr2 = this.r;
            AbstractC1474fG.g(objArr2);
            if (AbstractC1474fG.b(objArr2[((int) jMax) & (objArr2.length - 1)], j9)) {
                jM2++;
                jMax++;
            }
        }
        s(jMax, j11, jM2, j3);
        g();
        return (interfaceC0473HhArr.length == 0) ^ true ? k(interfaceC0473HhArr) : interfaceC0473HhArr;
    }
}
