package o;

import android.os.SystemClock;
import java.io.IOException;
import java.security.cert.CertPathValidatorException;
import java.security.cert.CertificateException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: o.Wb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0856Wb {
    public static final C0856Wb a = new C0856Wb();
    public static volatile long b;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0073, code lost:
    
        if (r1.l < 500) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0078, code lost:
    
        if ((r13 instanceof java.io.IOException) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007b, code lost:
    
        r0 = r13.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
    
        if (r0 == r13) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
    
        if (r0 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        if (a(r0) != true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        r13 = r13.getSuppressed();
        o.AbstractC1474fG.i(r13, "getSuppressed(...)");
        r0 = r13.length;
        r1 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0099, code lost:
    
        if (r1 >= r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        if (a(r13[r1]) == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a5, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x004b, code lost:
    
        if (r1.l < 500) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.lang.Throwable r13) {
        /*
            r0 = 4
            r1 = 3
            r2 = 2
            r3 = 5
            r4 = 0
            boolean r5 = r13 instanceof o.C1668hE
            r6 = 451(0x1c3, float:6.32E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 429(0x1ad, float:6.01E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 408(0x198, float:5.72E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = 407(0x197, float:5.7E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 403(0x193, float:5.65E-43)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 500(0x1f4, float:7.0E-43)
            r12 = 1
            if (r5 == 0) goto L4e
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            r3[r4] = r10
            r3[r12] = r9
            r3[r2] = r8
            r3[r1] = r7
            r3[r0] = r6
            java.util.Set r0 = o.Lc0.T(r3)
            r1 = r13
            o.hE r1 = (o.C1668hE) r1
            int r2 = r1.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L7a
            int r0 = r1.l
            if (r0 < r11) goto L7b
            goto L7a
        L4e:
            boolean r5 = r13 instanceof o.C0778Tb
            if (r5 == 0) goto L76
            java.lang.Integer[] r3 = new java.lang.Integer[r3]
            r3[r4] = r10
            r3[r12] = r9
            r3[r2] = r8
            r3[r1] = r7
            r3[r0] = r6
            java.util.Set r0 = o.Lc0.T(r3)
            r1 = r13
            o.Tb r1 = (o.C0778Tb) r1
            int r2 = r1.l
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L7a
            int r0 = r1.l
            if (r0 < r11) goto L7b
            goto L7a
        L76:
            boolean r0 = r13 instanceof java.io.IOException
            if (r0 == 0) goto L7b
        L7a:
            return r12
        L7b:
            java.lang.Throwable r0 = r13.getCause()
            if (r0 == 0) goto L8e
            if (r0 == r13) goto L84
            goto L85
        L84:
            r0 = 0
        L85:
            if (r0 == 0) goto L8e
            boolean r0 = a(r0)
            if (r0 != r12) goto L8e
            goto La3
        L8e:
            java.lang.Throwable[] r13 = r13.getSuppressed()
            java.lang.String r0 = "getSuppressed(...)"
            o.AbstractC1474fG.i(r13, r0)
            int r0 = r13.length
            r1 = 0
        L99:
            if (r1 >= r0) goto La7
            r2 = r13[r1]
            boolean r2 = a(r2)
            if (r2 == 0) goto La5
        La3:
            r4 = 1
            goto La7
        La5:
            int r1 = r1 + r12
            goto L99
        La7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0856Wb.a(java.lang.Throwable):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0073  */
    /* JADX WARN: Code duplicated, block: B:37:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f A[LOOP:1: B:36:0x007e->B:40:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x008d A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:35:0x0073, please report this as an issue */
    public static boolean b(int i, Throwable th) {
        Throwable[] suppressed;
        int i2;
        if (i >= 16) {
            return false;
        }
        if ((th instanceof SSLPeerUnverifiedException) || (th instanceof CertificateException) || (th instanceof CertPathValidatorException)) {
            return true;
        }
        if (th instanceof SSLException) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            String lowerCase = message.toLowerCase(Locale.ROOT);
            AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
            List listK = AbstractC0937Ze.K("certificate", "cert path", "trust anchor", "pinning failure", "hostname", "not trusted");
            if (!listK.isEmpty()) {
                Iterator it = listK.iterator();
                while (it.hasNext()) {
                    if (AbstractC1119bh0.W(lowerCase, (CharSequence) it.next(), false)) {
                        return true;
                    }
                }
            }
        }
        Throwable cause = th.getCause();
        if (cause == null) {
            suppressed = th.getSuppressed();
            AbstractC1474fG.i(suppressed, "getSuppressed(...)");
            for (Throwable th2 : suppressed) {
                AbstractC1474fG.g(th2);
                if (b(i + 1, th2)) {
                }
            }
            return false;
        }
        if (cause == th) {
            cause = null;
        }
        if (cause == null || !b(i + 1, cause)) {
            suppressed = th.getSuppressed();
            AbstractC1474fG.i(suppressed, "getSuppressed(...)");
            while (i2 < r0) {
                AbstractC1474fG.g(th2);
                if (b(i + 1, th2)) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean e(Exception exc) {
        if (b(0, exc)) {
            return false;
        }
        return a(exc);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x00da  */
    /* JADX WARN: Code duplicated, block: B:61:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    /* JADX WARN: Code duplicated, block: B:78:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0126 A[PHI: r5
  0x0126: PHI (r5v16 java.lang.Object) = (r5v14 java.lang.Object), (r5v1 java.lang.Object) binds: [B:77:0x0123, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0127  */
    /* JADX WARN: Code duplicated, block: B:83:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object c(String str, boolean z, InterfaceC0412Ey interfaceC0412Ey, InterfaceC0412Ey interfaceC0412Ey2, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C0804Ub c0804Ub;
        Exception exc;
        C0856Wb c0856Wb;
        InterfaceC0412Ey interfaceC0412Ey3;
        C0856Wb c0856Wb2;
        Exception exc2;
        C0856Wb c0856Wb3;
        C0856Wb c0856Wb4;
        boolean z2 = z;
        InterfaceC0412Ey interfaceC0412Ey4 = interfaceC0412Ey;
        InterfaceC0412Ey interfaceC0412Ey5 = interfaceC0412Ey2;
        if (interfaceC0473Hh instanceof C0804Ub) {
            c0804Ub = (C0804Ub) interfaceC0473Hh;
            int i = c0804Ub.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0804Ub.r = i - Integer.MIN_VALUE;
            } else {
                c0804Ub = new C0804Ub(this, interfaceC0473Hh);
            }
        } else {
            c0804Ub = new C0804Ub(this, interfaceC0473Hh);
        }
        Object objB = c0804Ub.p;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0804Ub.r;
        if (i2 == 0) {
            Jp0.O(objB);
            C3084vr0 c3084vr0 = C3084vr0.a;
            if (C3084vr0.s()) {
                c0804Ub.r = 1;
                objB = interfaceC0412Ey4.b(c0804Ub);
                return objB == enumC1706hi ? enumC1706hi : objB;
            }
            if (z2 && SystemClock.elapsedRealtime() < b) {
                try {
                    IOException iOException = new IOException("Ruta directa temporalmente degradada");
                    c0804Ub.l = this;
                    c0804Ub.m = str;
                    c0804Ub.n = interfaceC0412Ey4;
                    c0804Ub.r = 2;
                    objB = d(iOException, true, interfaceC0412Ey5, c0804Ub);
                    return objB == enumC1706hi ? enumC1706hi : objB;
                } catch (Exception e) {
                    exc2 = e;
                    c0856Wb3 = this;
                    c0856Wb3.getClass();
                    if (e(exc2)) {
                        throw exc2;
                    }
                    c0804Ub.l = c0856Wb3;
                    c0804Ub.m = exc2;
                    c0804Ub.n = null;
                    c0804Ub.r = 3;
                    objB = interfaceC0412Ey4.b(c0804Ub);
                    if (objB == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c0856Wb4 = c0856Wb3;
                    b = 0L;
                    return objB;
                }
            }
            try {
                c0804Ub.l = this;
                c0804Ub.m = str;
                c0804Ub.n = interfaceC0412Ey5;
                c0804Ub.f555o = z2;
                c0804Ub.r = 4;
                objB = interfaceC0412Ey4.b(c0804Ub);
                if (objB == enumC1706hi) {
                    return enumC1706hi;
                }
                interfaceC0412Ey3 = interfaceC0412Ey5;
                c0856Wb2 = this;
                if (z2) {
                    b = 0L;
                }
                return objB;
            } catch (Exception e2) {
                exc = e2;
                c0856Wb = this;
                c0856Wb.getClass();
                if (e(exc)) {
                    throw exc;
                }
                if (z2) {
                    e(exc);
                }
                c0804Ub.l = null;
                c0804Ub.m = null;
                c0804Ub.n = null;
                c0804Ub.r = 5;
                objB = c0856Wb.d(exc, z2, interfaceC0412Ey5, c0804Ub);
                if (objB == enumC1706hi) {
                    return enumC1706hi;
                }
                return objB;
            }
        }
        if (i2 == 1) {
            Jp0.O(objB);
        }
        if (i2 == 2) {
            InterfaceC0412Ey interfaceC0412Ey6 = c0804Ub.n;
            C0856Wb c0856Wb5 = c0804Ub.l;
            try {
                Jp0.O(objB);
            } catch (Exception e3) {
                c0856Wb3 = c0856Wb5;
                interfaceC0412Ey4 = interfaceC0412Ey6;
                exc2 = e3;
                c0856Wb3.getClass();
                if (e(exc2)) {
                    throw exc2;
                }
                try {
                    c0804Ub.l = c0856Wb3;
                    c0804Ub.m = exc2;
                    c0804Ub.n = null;
                    c0804Ub.r = 3;
                    objB = interfaceC0412Ey4.b(c0804Ub);
                    if (objB == enumC1706hi) {
                        return enumC1706hi;
                    }
                    c0856Wb4 = c0856Wb3;
                    b = 0L;
                    return objB;
                } catch (Exception e4) {
                    e = e4;
                    c0856Wb4 = c0856Wb3;
                    c0856Wb4.getClass();
                    e(e);
                    AbstractC3409z9.a(e, exc2);
                    throw e;
                }
            }
        }
        if (i2 == 3) {
            exc2 = (Exception) c0804Ub.m;
            c0856Wb4 = c0804Ub.l;
            try {
                Jp0.O(objB);
                b = 0L;
                return objB;
            } catch (Exception e5) {
                e = e5;
                c0856Wb4.getClass();
                e(e);
                AbstractC3409z9.a(e, exc2);
                throw e;
            }
        }
        if (i2 != 4) {
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(objB);
            return objB;
        }
        z2 = c0804Ub.f555o;
        interfaceC0412Ey3 = c0804Ub.n;
        c0856Wb2 = c0804Ub.l;
        try {
            Jp0.O(objB);
            if (z2) {
                b = 0L;
            }
            return objB;
        } catch (Exception e6) {
            InterfaceC0412Ey interfaceC0412Ey7 = interfaceC0412Ey3;
            exc = e6;
            c0856Wb = c0856Wb2;
            interfaceC0412Ey5 = interfaceC0412Ey7;
            c0856Wb.getClass();
            if (e(exc)) {
                throw exc;
            }
            if (z2) {
                e(exc);
            }
            c0804Ub.l = null;
            c0804Ub.m = null;
            c0804Ub.n = null;
            c0804Ub.r = 5;
            objB = c0856Wb.d(exc, z2, interfaceC0412Ey5, c0804Ub);
            if (objB == enumC1706hi) {
                return enumC1706hi;
            }
            return objB;
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00e8 A[Catch: Exception -> 0x00eb, TRY_LEAVE, TryCatch #3 {Exception -> 0x00eb, blocks: (B:42:0x00dc, B:44:0x00e8), top: B:84:0x00dc }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x0114  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x0149 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:65:0x014a  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e A[Catch: Exception -> 0x0042, TRY_ENTER, TryCatch #4 {Exception -> 0x0042, blocks: (B:16:0x003d, B:67:0x014e, B:69:0x0159), top: B:86:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0159 A[Catch: Exception -> 0x0042, TRY_LEAVE, TryCatch #4 {Exception -> 0x0042, blocks: (B:16:0x003d, B:67:0x014e, B:69:0x0159), top: B:86:0x003d }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0162  */
    /* JADX WARN: Code duplicated, block: B:76:0x0163  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x013a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final Object d(Exception exc, boolean z, InterfaceC0412Ey interfaceC0412Ey, InterfaceC0473Hh interfaceC0473Hh) throws Exception {
        C0830Vb c0830Vb;
        boolean z2;
        C0856Wb c0856Wb;
        InterfaceC0412Ey interfaceC0412Ey2;
        Exception exc2;
        InterfaceC0412Ey interfaceC0412Ey3;
        long j;
        Exception exc3;
        Object objR;
        InterfaceC0412Ey interfaceC0412Ey4;
        Exception exc4;
        long jElapsedRealtime;
        Exception exc5;
        boolean z3;
        long jElapsedRealtime2;
        if (interfaceC0473Hh instanceof C0830Vb) {
            c0830Vb = (C0830Vb) interfaceC0473Hh;
            int i = c0830Vb.s;
            if ((i & Integer.MIN_VALUE) != 0) {
                c0830Vb.s = i - Integer.MIN_VALUE;
            } else {
                c0830Vb = new C0830Vb(this, interfaceC0473Hh);
            }
        } else {
            c0830Vb = new C0830Vb(this, interfaceC0473Hh);
        }
        Object objH = c0830Vb.q;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c0830Vb.s;
        if (i2 == 0) {
            Jp0.O(objH);
            C3084vr0 c3084vr0 = C3084vr0.a;
            c0830Vb.l = this;
            c0830Vb.m = exc;
            c0830Vb.n = interfaceC0412Ey;
            z2 = z;
            c0830Vb.f574o = z2;
            c0830Vb.s = 1;
            objH = c3084vr0.h(false, c0830Vb);
            if (objH == enumC1706hi) {
                return enumC1706hi;
            }
            c0856Wb = this;
            interfaceC0412Ey2 = interfaceC0412Ey;
            exc2 = exc;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        boolean z4 = c0830Vb.f574o;
                        Exception exc6 = c0830Vb.m;
                        InterfaceC0412Ey interfaceC0412Ey5 = (InterfaceC0412Ey) c0830Vb.l;
                        Jp0.O(objH);
                        z2 = z4;
                        exc4 = exc6;
                        interfaceC0412Ey4 = interfaceC0412Ey5;
                        boolean zBooleanValue = ((Boolean) objH).booleanValue();
                        C3084vr0 c3084vr1 = C3084vr0.a;
                        c0830Vb.l = interfaceC0412Ey4;
                        c0830Vb.m = exc4;
                        c0830Vb.f574o = z2;
                        c0830Vb.s = 4;
                        objH = c3084vr1.h(zBooleanValue, c0830Vb);
                        if (objH == enumC1706hi) {
                            return enumC1706hi;
                        }
                        if (!((Boolean) objH).booleanValue()) {
                            throw exc4;
                        }
                        c0830Vb.l = exc4;
                        c0830Vb.m = null;
                        c0830Vb.f574o = z2;
                        c0830Vb.s = 5;
                        objH = interfaceC0412Ey4.b(c0830Vb);
                        if (objH == enumC1706hi) {
                            return enumC1706hi;
                        }
                        exc5 = exc4;
                        z3 = z2;
                        if (z3) {
                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + 600000;
                            if (jElapsedRealtime2 > b) {
                                b = jElapsedRealtime2;
                            }
                        }
                        return objH;
                    }
                    if (i2 != 4) {
                        if (i2 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z3 = c0830Vb.f574o;
                        exc5 = (Exception) c0830Vb.l;
                        try {
                            Jp0.O(objH);
                            if (z3) {
                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + 600000;
                                if (jElapsedRealtime2 > b) {
                                    b = jElapsedRealtime2;
                                }
                            }
                            return objH;
                        } catch (Exception e) {
                            e = e;
                            AbstractC3409z9.a(e, exc5);
                            throw e;
                        }
                    }
                    boolean z5 = c0830Vb.f574o;
                    Exception exc7 = c0830Vb.m;
                    interfaceC0412Ey4 = (InterfaceC0412Ey) c0830Vb.l;
                    Jp0.O(objH);
                    z2 = z5;
                    exc4 = exc7;
                    if (!((Boolean) objH).booleanValue()) {
                        throw exc4;
                    }
                    try {
                        c0830Vb.l = exc4;
                        c0830Vb.m = null;
                        c0830Vb.f574o = z2;
                        c0830Vb.s = 5;
                        objH = interfaceC0412Ey4.b(c0830Vb);
                        if (objH == enumC1706hi) {
                            return enumC1706hi;
                        }
                        exc5 = exc4;
                        z3 = z2;
                        if (z3) {
                            jElapsedRealtime2 = SystemClock.elapsedRealtime() + 600000;
                            if (jElapsedRealtime2 > b) {
                                b = jElapsedRealtime2;
                            }
                        }
                        return objH;
                    } catch (Exception e2) {
                        e = e2;
                        exc5 = exc4;
                        AbstractC3409z9.a(e, exc5);
                        throw e;
                    }
                }
                j = c0830Vb.p;
                boolean z6 = c0830Vb.f574o;
                interfaceC0412Ey3 = c0830Vb.n;
                Exception exc8 = c0830Vb.m;
                c0856Wb = (C0856Wb) c0830Vb.l;
                try {
                    Jp0.O(objH);
                    exc3 = exc8;
                    z2 = z6;
                    if (z2) {
                        try {
                            jElapsedRealtime = SystemClock.elapsedRealtime() + 600000;
                            if (jElapsedRealtime > b) {
                                b = jElapsedRealtime;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            AbstractC3409z9.a(e, exc3);
                            c0856Wb.getClass();
                            if (!e(e)) {
                                throw e;
                            }
                            C3084vr0 c3084vr2 = C3084vr0.a;
                            c0830Vb.l = interfaceC0412Ey3;
                            c0830Vb.m = e;
                            c0830Vb.n = null;
                            c0830Vb.f574o = z2;
                            c0830Vb.s = 3;
                            objR = c3084vr2.r(j, c0830Vb);
                            if (objR == enumC1706hi) {
                                return enumC1706hi;
                            }
                            interfaceC0412Ey4 = interfaceC0412Ey3;
                            exc4 = e;
                            objH = objR;
                            boolean zBooleanValue2 = ((Boolean) objH).booleanValue();
                            C3084vr0 c3084vr3 = C3084vr0.a;
                            c0830Vb.l = interfaceC0412Ey4;
                            c0830Vb.m = exc4;
                            c0830Vb.f574o = z2;
                            c0830Vb.s = 4;
                            objH = c3084vr3.h(zBooleanValue2, c0830Vb);
                            if (objH == enumC1706hi) {
                                return enumC1706hi;
                            }
                            if (!((Boolean) objH).booleanValue()) {
                                throw exc4;
                            }
                            c0830Vb.l = exc4;
                            c0830Vb.m = null;
                            c0830Vb.f574o = z2;
                            c0830Vb.s = 5;
                            objH = interfaceC0412Ey4.b(c0830Vb);
                            if (objH == enumC1706hi) {
                                return enumC1706hi;
                            }
                            exc5 = exc4;
                            z3 = z2;
                            if (z3) {
                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + 600000;
                                if (jElapsedRealtime2 > b) {
                                    b = jElapsedRealtime2;
                                }
                            }
                            return objH;
                        }
                    }
                    return objH;
                } catch (Exception e4) {
                    e = e4;
                    exc3 = exc8;
                    z2 = z6;
                    AbstractC3409z9.a(e, exc3);
                    c0856Wb.getClass();
                    if (!e(e)) {
                        throw e;
                    }
                    C3084vr0 c3084vr4 = C3084vr0.a;
                    c0830Vb.l = interfaceC0412Ey3;
                    c0830Vb.m = e;
                    c0830Vb.n = null;
                    c0830Vb.f574o = z2;
                    c0830Vb.s = 3;
                    objR = c3084vr4.r(j, c0830Vb);
                    if (objR == enumC1706hi) {
                        return enumC1706hi;
                    }
                    interfaceC0412Ey4 = interfaceC0412Ey3;
                    exc4 = e;
                    objH = objR;
                    boolean zBooleanValue3 = ((Boolean) objH).booleanValue();
                    C3084vr0 c3084vr5 = C3084vr0.a;
                    c0830Vb.l = interfaceC0412Ey4;
                    c0830Vb.m = exc4;
                    c0830Vb.f574o = z2;
                    c0830Vb.s = 4;
                    objH = c3084vr5.h(zBooleanValue3, c0830Vb);
                    if (objH == enumC1706hi) {
                        return enumC1706hi;
                    }
                    if (!((Boolean) objH).booleanValue()) {
                        throw exc4;
                    }
                    c0830Vb.l = exc4;
                    c0830Vb.m = null;
                    c0830Vb.f574o = z2;
                    c0830Vb.s = 5;
                    objH = interfaceC0412Ey4.b(c0830Vb);
                    if (objH == enumC1706hi) {
                        return enumC1706hi;
                    }
                    exc5 = exc4;
                    z3 = z2;
                    if (z3) {
                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + 600000;
                        if (jElapsedRealtime2 > b) {
                            b = jElapsedRealtime2;
                        }
                    }
                    return objH;
                }
            }
            boolean z7 = c0830Vb.f574o;
            interfaceC0412Ey2 = c0830Vb.n;
            exc2 = c0830Vb.m;
            C0856Wb c0856Wb2 = (C0856Wb) c0830Vb.l;
            Jp0.O(objH);
            c0856Wb = c0856Wb2;
            z2 = z7;
        }
        if (!((Boolean) objH).booleanValue()) {
            throw exc2;
        }
        long j2 = C3084vr0.v.get();
        try {
            c0830Vb.l = c0856Wb;
            c0830Vb.m = exc2;
            c0830Vb.n = interfaceC0412Ey2;
            c0830Vb.f574o = z2;
            c0830Vb.p = j2;
            c0830Vb.s = 2;
            objH = interfaceC0412Ey2.b(c0830Vb);
            if (objH == enumC1706hi) {
                return enumC1706hi;
            }
            Exception exc9 = exc2;
            interfaceC0412Ey3 = interfaceC0412Ey2;
            j = j2;
            exc3 = exc9;
            if (z2) {
                jElapsedRealtime = SystemClock.elapsedRealtime() + 600000;
                if (jElapsedRealtime > b) {
                    b = jElapsedRealtime;
                }
            }
            return objH;
        } catch (Exception e5) {
            e = e5;
            Exception exc10 = exc2;
            interfaceC0412Ey3 = interfaceC0412Ey2;
            j = j2;
            exc3 = exc10;
            AbstractC3409z9.a(e, exc3);
            c0856Wb.getClass();
            if (!e(e)) {
                throw e;
            }
            C3084vr0 c3084vr6 = C3084vr0.a;
            c0830Vb.l = interfaceC0412Ey3;
            c0830Vb.m = e;
            c0830Vb.n = null;
            c0830Vb.f574o = z2;
            c0830Vb.s = 3;
            objR = c3084vr6.r(j, c0830Vb);
            if (objR == enumC1706hi) {
                return enumC1706hi;
            }
            interfaceC0412Ey4 = interfaceC0412Ey3;
            exc4 = e;
            objH = objR;
            boolean zBooleanValue4 = ((Boolean) objH).booleanValue();
            C3084vr0 c3084vr7 = C3084vr0.a;
            c0830Vb.l = interfaceC0412Ey4;
            c0830Vb.m = exc4;
            c0830Vb.f574o = z2;
            c0830Vb.s = 4;
            objH = c3084vr7.h(zBooleanValue4, c0830Vb);
            if (objH == enumC1706hi) {
                return enumC1706hi;
            }
            if (!((Boolean) objH).booleanValue()) {
                throw exc4;
            }
            c0830Vb.l = exc4;
            c0830Vb.m = null;
            c0830Vb.f574o = z2;
            c0830Vb.s = 5;
            objH = interfaceC0412Ey4.b(c0830Vb);
            if (objH == enumC1706hi) {
                return enumC1706hi;
            }
            exc5 = exc4;
            z3 = z2;
            if (z3) {
                jElapsedRealtime2 = SystemClock.elapsedRealtime() + 600000;
                if (jElapsedRealtime2 > b) {
                    b = jElapsedRealtime2;
                }
            }
            return objH;
        }
    }
}
