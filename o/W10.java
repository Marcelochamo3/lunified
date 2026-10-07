package o;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class W10 extends Ph0 implements InterfaceC0775Sy {
    public Q30 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ List f586o;
    public final /* synthetic */ Z10 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W10(List list, Z10 z10, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f586o = list;
        this.p = z10;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((W10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new W10(this.f586o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:26:0x006c A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:29:0x007d A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0094 A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a9 A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c1 A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5 A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dd A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0108 A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x010f A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0129 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x012a A[Catch: Exception -> 0x0023, CancellationException -> 0x0026, TryCatch #2 {CancellationException -> 0x0026, Exception -> 0x0023, blocks: (B:7:0x001e, B:12:0x0029, B:55:0x00ef, B:56:0x00f8, B:58:0x0108, B:60:0x010f, B:61:0x0117, B:64:0x012a, B:65:0x0131, B:13:0x002e, B:51:0x00d1, B:14:0x0033, B:45:0x00b5, B:17:0x003a, B:40:0x00a5, B:42:0x00a9, B:46:0x00c1, B:48:0x00c5, B:52:0x00dd, B:23:0x005e, B:25:0x0068, B:37:0x0097, B:26:0x006c, B:27:0x0077, B:29:0x007d, B:33:0x0090, B:35:0x0094), top: B:98:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x008f A[SYNTHETIC] */
    @Override // o.R7
    public final Object r(Object obj) {
        Object next;
        Q30 q30;
        String strB;
        Iterator it;
        Object next2;
        Q30 q31;
        Q30 q32;
        O9 o9;
        C1816io0 c1816io0;
        C0954Zv c0954Zv;
        C1101bX c1101bX;
        Js0 js0;
        Ds0 ds0;
        Map map;
        I9 i9;
        N10 n10;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i = this.n;
        Cr0 cr0 = Cr0.m;
        Z10 z10 = this.p;
        List list = this.f586o;
        try {
            switch (i) {
                case 0:
                    Jp0.O(obj);
                    list.size();
                    I9 i10 = z10.e;
                    J10 j10 = new J10((Ds0) AbstractC0911Ye.b0(list));
                    this.n = 1;
                    if (i10.e(j10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    strB = cr0.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q32 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next2 = it.next();
                            } else {
                                next2 = null;
                            }
                            q31 = (Q30) next2;
                            if (q31 == null) {
                                q31 = C1816io0.b;
                            }
                            q32 = q31;
                        } while (!AbstractC1474fG.b(((Q30) next2).getName(), strB));
                        q31 = (Q30) next2;
                        if (q31 == null) {
                            q31 = C1816io0.b;
                        }
                        q32 = q31;
                    }
                    o9 = O9.x;
                    this.m = q32;
                    this.n = 2;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1816io0 = C1816io0.b;
                    if (q32 == c1816io0) {
                        this.m = null;
                        this.n = 3;
                        obj = c1816io0.A(list, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C2495pn0 c2495pn0 = (C2495pn0) obj;
                        c1101bX = new C1101bX(c2495pn0.a, c2495pn0.b);
                        js0 = (Js0) c1101bX.l;
                        ds0 = (Ds0) c1101bX.m;
                        if (js0.l.length() != 0) {
                            throw new Exception("No source found");
                        }
                        Z10.e(z10, js0);
                        map = ds0.f223o;
                        if (map != null) {
                        }
                        i9 = z10.e;
                        n10 = new N10(js0, ds0, z10.g);
                        this.n = 6;
                        if (i9.e(n10, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return C2985uq0.a;
                    }
                    c0954Zv = C0954Zv.b;
                    if (q32 == c0954Zv) {
                        this.m = null;
                        this.n = 4;
                        obj = c0954Zv.w(list, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C0331Bv c0331Bv = (C0331Bv) obj;
                        c1101bX = new C1101bX(c0331Bv.a, c0331Bv.b);
                        js0 = (Js0) c1101bX.l;
                        ds0 = (Ds0) c1101bX.m;
                        if (js0.l.length() != 0) {
                            throw new Exception("No source found");
                        }
                        Z10.e(z10, js0);
                        map = ds0.f223o;
                        if (map != null) {
                        }
                        i9 = z10.e;
                        n10 = new N10(js0, ds0, z10.g);
                        this.n = 6;
                        if (i9.e(n10, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return C2985uq0.a;
                    }
                    Ds0 ds1 = (Ds0) AbstractC0911Ye.b0(list);
                    this.m = null;
                    this.n = 5;
                    obj = q32.n(ds1, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1101bX = new C1101bX(obj, AbstractC0911Ye.b0(list));
                    js0 = (Js0) c1101bX.l;
                    ds0 = (Ds0) c1101bX.m;
                    if (js0.l.length() != 0) {
                        throw new Exception("No source found");
                    }
                    Z10.e(z10, js0);
                    map = ds0.f223o;
                    if (map != null) {
                    }
                    i9 = z10.e;
                    n10 = new N10(js0, ds0, z10.g);
                    this.n = 6;
                    if (i9.e(n10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 1:
                    Jp0.O(obj);
                    strB = cr0.b();
                    if (AbstractC1474fG.b(strB, "PPV.TO")) {
                        q32 = QW.b;
                    } else {
                        Q30.a.getClass();
                        it = P30.b.iterator();
                        do {
                            if (it.hasNext()) {
                                next2 = it.next();
                            } else {
                                next2 = null;
                            }
                            q31 = (Q30) next2;
                            if (q31 == null) {
                                q31 = C1816io0.b;
                            }
                            q32 = q31;
                        } while (!AbstractC1474fG.b(((Q30) next2).getName(), strB));
                        q31 = (Q30) next2;
                        if (q31 == null) {
                            q31 = C1816io0.b;
                        }
                        q32 = q31;
                    }
                    o9 = O9.x;
                    this.m = q32;
                    this.n = 2;
                    if (o9.D(this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1816io0 = C1816io0.b;
                    if (q32 == c1816io0) {
                        this.m = null;
                        this.n = 3;
                        obj = c1816io0.A(list, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C2495pn0 c2495pn1 = (C2495pn0) obj;
                        c1101bX = new C1101bX(c2495pn1.a, c2495pn1.b);
                        js0 = (Js0) c1101bX.l;
                        ds0 = (Ds0) c1101bX.m;
                        if (js0.l.length() != 0) {
                            throw new Exception("No source found");
                        }
                        Z10.e(z10, js0);
                        map = ds0.f223o;
                        if (map != null) {
                        }
                        i9 = z10.e;
                        n10 = new N10(js0, ds0, z10.g);
                        this.n = 6;
                        if (i9.e(n10, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return C2985uq0.a;
                    }
                    c0954Zv = C0954Zv.b;
                    if (q32 == c0954Zv) {
                        this.m = null;
                        this.n = 4;
                        obj = c0954Zv.w(list, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C0331Bv c0331Bv2 = (C0331Bv) obj;
                        c1101bX = new C1101bX(c0331Bv2.a, c0331Bv2.b);
                        js0 = (Js0) c1101bX.l;
                        ds0 = (Ds0) c1101bX.m;
                        if (js0.l.length() != 0) {
                            throw new Exception("No source found");
                        }
                        Z10.e(z10, js0);
                        map = ds0.f223o;
                        if (map != null) {
                        }
                        i9 = z10.e;
                        n10 = new N10(js0, ds0, z10.g);
                        this.n = 6;
                        if (i9.e(n10, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return C2985uq0.a;
                    }
                    Ds0 ds2 = (Ds0) AbstractC0911Ye.b0(list);
                    this.m = null;
                    this.n = 5;
                    obj = q32.n(ds2, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1101bX = new C1101bX(obj, AbstractC0911Ye.b0(list));
                    js0 = (Js0) c1101bX.l;
                    ds0 = (Ds0) c1101bX.m;
                    if (js0.l.length() != 0) {
                        throw new Exception("No source found");
                    }
                    Z10.e(z10, js0);
                    map = ds0.f223o;
                    if (map != null) {
                    }
                    i9 = z10.e;
                    n10 = new N10(js0, ds0, z10.g);
                    this.n = 6;
                    if (i9.e(n10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 2:
                    q32 = this.m;
                    Jp0.O(obj);
                    c1816io0 = C1816io0.b;
                    if (q32 == c1816io0) {
                        this.m = null;
                        this.n = 3;
                        obj = c1816io0.A(list, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C2495pn0 c2495pn2 = (C2495pn0) obj;
                        c1101bX = new C1101bX(c2495pn2.a, c2495pn2.b);
                        js0 = (Js0) c1101bX.l;
                        ds0 = (Ds0) c1101bX.m;
                        if (js0.l.length() != 0) {
                            throw new Exception("No source found");
                        }
                        Z10.e(z10, js0);
                        map = ds0.f223o;
                        if (map != null) {
                        }
                        i9 = z10.e;
                        n10 = new N10(js0, ds0, z10.g);
                        this.n = 6;
                        if (i9.e(n10, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return C2985uq0.a;
                    }
                    c0954Zv = C0954Zv.b;
                    if (q32 == c0954Zv) {
                        this.m = null;
                        this.n = 4;
                        obj = c0954Zv.w(list, this);
                        if (obj == enumC1706hi) {
                            return enumC1706hi;
                        }
                        C0331Bv c0331Bv3 = (C0331Bv) obj;
                        c1101bX = new C1101bX(c0331Bv3.a, c0331Bv3.b);
                        js0 = (Js0) c1101bX.l;
                        ds0 = (Ds0) c1101bX.m;
                        if (js0.l.length() != 0) {
                            throw new Exception("No source found");
                        }
                        Z10.e(z10, js0);
                        map = ds0.f223o;
                        if (map != null) {
                        }
                        i9 = z10.e;
                        n10 = new N10(js0, ds0, z10.g);
                        this.n = 6;
                        if (i9.e(n10, this) == enumC1706hi) {
                            return enumC1706hi;
                        }
                        return C2985uq0.a;
                    }
                    Ds0 ds3 = (Ds0) AbstractC0911Ye.b0(list);
                    this.m = null;
                    this.n = 5;
                    obj = q32.n(ds3, this);
                    if (obj == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c1101bX = new C1101bX(obj, AbstractC0911Ye.b0(list));
                    js0 = (Js0) c1101bX.l;
                    ds0 = (Ds0) c1101bX.m;
                    if (js0.l.length() != 0) {
                        throw new Exception("No source found");
                    }
                    Z10.e(z10, js0);
                    map = ds0.f223o;
                    if (map != null) {
                    }
                    i9 = z10.e;
                    n10 = new N10(js0, ds0, z10.g);
                    this.n = 6;
                    if (i9.e(n10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 3:
                    Jp0.O(obj);
                    C2495pn0 c2495pn3 = (C2495pn0) obj;
                    c1101bX = new C1101bX(c2495pn3.a, c2495pn3.b);
                    js0 = (Js0) c1101bX.l;
                    ds0 = (Ds0) c1101bX.m;
                    if (js0.l.length() != 0) {
                        throw new Exception("No source found");
                    }
                    Z10.e(z10, js0);
                    map = ds0.f223o;
                    if (map != null) {
                    }
                    i9 = z10.e;
                    n10 = new N10(js0, ds0, z10.g);
                    this.n = 6;
                    if (i9.e(n10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 4:
                    Jp0.O(obj);
                    C0331Bv c0331Bv4 = (C0331Bv) obj;
                    c1101bX = new C1101bX(c0331Bv4.a, c0331Bv4.b);
                    js0 = (Js0) c1101bX.l;
                    ds0 = (Ds0) c1101bX.m;
                    if (js0.l.length() != 0) {
                        throw new Exception("No source found");
                    }
                    Z10.e(z10, js0);
                    map = ds0.f223o;
                    if (map != null) {
                    }
                    i9 = z10.e;
                    n10 = new N10(js0, ds0, z10.g);
                    this.n = 6;
                    if (i9.e(n10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 5:
                    Jp0.O(obj);
                    c1101bX = new C1101bX(obj, AbstractC0911Ye.b0(list));
                    js0 = (Js0) c1101bX.l;
                    ds0 = (Ds0) c1101bX.m;
                    if (js0.l.length() != 0) {
                        throw new Exception("No source found");
                    }
                    Z10.e(z10, js0);
                    map = ds0.f223o;
                    if (map != null) {
                    }
                    i9 = z10.e;
                    n10 = new N10(js0, ds0, z10.g);
                    this.n = 6;
                    if (i9.e(n10, this) == enumC1706hi) {
                        return enumC1706hi;
                    }
                    return C2985uq0.a;
                case 6:
                    Jp0.O(obj);
                    return C2985uq0.a;
                case 7:
                case 8:
                    Jp0.O(obj);
                    return C2985uq0.a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Z10.f(z10, "parallel_extraction", e2);
            AbstractC1899jh0.U(z10.c, "xuper-", true);
            String strB2 = cr0.b();
            if (AbstractC1474fG.b(strB2, "PPV.TO")) {
                q30 = QW.b;
            } else {
                Q30.a.getClass();
                Iterator it2 = P30.b.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!AbstractC1474fG.b(((Q30) next).getName(), strB2));
                Q30 q33 = (Q30) next;
                q30 = q33 == null ? C1816io0.b : q33;
            }
            C1816io0 c1816io1 = C1816io0.b;
            I9 i11 = z10.e;
            if (q30 == c1816io1 || q30 == C0954Zv.b) {
                Ds0 ds4 = (Ds0) AbstractC0911Ye.i0(list);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    linkedHashSet.add(((Ds0) it3.next()).l);
                }
                G10 g10 = new G10(e2, ds4, linkedHashSet);
                this.m = null;
                this.n = 7;
                if (i11.e(g10, this) == enumC1706hi) {
                    return enumC1706hi;
                }
            } else {
                G10 g11 = new G10(e2, (Ds0) AbstractC0911Ye.b0(list));
                this.m = null;
                this.n = 8;
                if (i11.e(g11, this) == enumC1706hi) {
                    return enumC1706hi;
                }
            }
        }
    }
}
