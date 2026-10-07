package o;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ChoreographerFrameCallbackC0966a3 implements Choreographer.FrameCallback {
    public final /* synthetic */ Na0 l;

    public ChoreographerFrameCallbackC0966a3(Na0 na0) {
        this.l = na0;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:29:0x0111  */
    /* JADX WARN: Code duplicated, block: B:31:0x011b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0137  */
    /* JADX WARN: Code duplicated, block: B:38:0x014c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0152  */
    /* JADX WARN: Code duplicated, block: B:42:0x0166  */
    /* JADX WARN: Code duplicated, block: B:44:0x0189  */
    /* JADX WARN: Code duplicated, block: B:47:0x0193  */
    /* JADX WARN: Code duplicated, block: B:48:0x019a  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:55:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ae A[EDGE_INSN: B:77:0x01ae->B:51:0x01ae BREAK  A[LOOP:1: B:36:0x0144->B:50:0x01a6], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x002c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01c2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19, types: [o.Im0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        ArrayList arrayList;
        long j2;
        long j3;
        float f;
        Lf0 lf0;
        boolean z;
        ThreadLocal threadLocal;
        C1064b3 c1064b3;
        ArrayList arrayList2;
        int iIndexOf;
        int i;
        ?? r6;
        ArrayList arrayList3;
        long j4;
        int i2;
        int size;
        long j5;
        int i3;
        float f2;
        Am0 am0;
        C1306dd0 c1306dd0;
        Cm0 cm0;
        Cm0 cm1;
        Runnable runnable;
        C2133m1 c2133m1 = (C2133m1) this.l.m;
        c2133m1.getClass();
        long jUptimeMillis = SystemClock.uptimeMillis();
        C1064b3 c1064b4 = (C1064b3) c2133m1.m;
        c1064b4.getClass();
        long jUptimeMillis2 = SystemClock.uptimeMillis();
        boolean z2 = false;
        int i4 = 0;
        while (true) {
            arrayList = c1064b4.b;
            if (i4 >= arrayList.size()) {
                break;
            }
            Kf0 kf0 = (Kf0) arrayList.get(i4);
            if (kf0 == null) {
                j4 = jUptimeMillis;
                i2 = i4;
            } else {
                Nd0 nd0 = c1064b4.a;
                Long l = (Long) nd0.get(kf0);
                if (l == null) {
                    j2 = kf0.h;
                    if (j2 == 0) {
                        kf0.h = jUptimeMillis;
                        kf0.b(kf0.b);
                    } else {
                        j3 = jUptimeMillis - j2;
                        kf0.h = jUptimeMillis;
                        if (kf0.m != Float.MAX_VALUE) {
                            Lf0 lf1 = kf0.l;
                            double d = lf1.i;
                            long j6 = j3 / 2;
                            C2207mp c2207mpA = lf1.a(kf0.b, kf0.a, j6);
                            Lf0 lf2 = kf0.l;
                            lf2.i = kf0.m;
                            kf0.m = Float.MAX_VALUE;
                            C2207mp c2207mpA2 = lf2.a(c2207mpA.a, c2207mpA.b, j6);
                            kf0.b = c2207mpA2.a;
                            kf0.a = c2207mpA2.b;
                        } else {
                            C2207mp c2207mpA3 = kf0.l.a(kf0.b, kf0.a, j3);
                            kf0.b = c2207mpA3.a;
                            kf0.a = c2207mpA3.b;
                        }
                        float fMax = Math.max(kf0.b, kf0.g);
                        kf0.b = fMax;
                        float fMin = Math.min(fMax, kf0.f);
                        kf0.b = fMin;
                        f = kf0.a;
                        lf0 = kf0.l;
                        lf0.getClass();
                        if (Math.abs(f) < lf0.e) {
                            z = false;
                        } else {
                            z = false;
                        }
                        float fMin2 = Math.min(kf0.b, kf0.f);
                        kf0.b = fMin2;
                        float fMax2 = Math.max(fMin2, kf0.g);
                        kf0.b = fMax2;
                        kf0.b(fMax2);
                        if (z) {
                            kf0.e = z2;
                            threadLocal = C1064b3.f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C1064b3());
                            }
                            c1064b3 = (C1064b3) threadLocal.get();
                            c1064b3.a.remove(kf0);
                            arrayList2 = c1064b3.b;
                            iIndexOf = arrayList2.indexOf(kf0);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                c1064b3.e = true;
                            }
                            kf0.h = 0L;
                            kf0.c = z2;
                            i = 0;
                            r6 = z2;
                            while (true) {
                                arrayList3 = kf0.j;
                                if (i < arrayList3.size()) {
                                    break;
                                    break;
                                }
                                if (arrayList3.get(i) != null) {
                                    C3462zm0 c3462zm0 = (C3462zm0) arrayList3.get(i);
                                    f2 = kf0.b;
                                    am0 = c3462zm0.a;
                                    c1306dd0 = C1306dd0.n;
                                    cm0 = am0.g;
                                    if (f2 < 1.0f) {
                                        long j7 = cm0.H;
                                        Cm0 cm0S = ((Im0) cm0).S(r6);
                                        cm1 = cm0S.D;
                                        cm0S.D = null;
                                        i3 = i4;
                                        j5 = jUptimeMillis;
                                        cm0.I(-1L, am0.a);
                                        cm0.I(j7, -1L);
                                        am0.a = j7;
                                        runnable = am0.f;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                        cm0.F.clear();
                                        if (cm1 != null) {
                                            cm1.B(cm1, c1306dd0, true);
                                        }
                                    } else {
                                        j5 = jUptimeMillis;
                                        i3 = i4;
                                        cm0.B(cm0, c1306dd0, false);
                                    }
                                } else {
                                    j5 = jUptimeMillis;
                                    i3 = i4;
                                }
                                i++;
                                i4 = i3;
                                jUptimeMillis = j5;
                                r6 = 0;
                            }
                            j4 = jUptimeMillis;
                            i2 = i4;
                            for (size = arrayList3.size() - 1; size >= 0; size--) {
                                if (arrayList3.get(size) == null) {
                                    arrayList3.remove(size);
                                }
                            }
                        }
                    }
                    j4 = jUptimeMillis;
                    i2 = i4;
                } else if (l.longValue() < jUptimeMillis2) {
                    nd0.remove(kf0);
                    j2 = kf0.h;
                    if (j2 == 0) {
                        kf0.h = jUptimeMillis;
                        kf0.b(kf0.b);
                    } else {
                        j3 = jUptimeMillis - j2;
                        kf0.h = jUptimeMillis;
                        if (kf0.m != Float.MAX_VALUE) {
                            Lf0 lf3 = kf0.l;
                            double d2 = lf3.i;
                            long j8 = j3 / 2;
                            C2207mp c2207mpA4 = lf3.a(kf0.b, kf0.a, j8);
                            Lf0 lf4 = kf0.l;
                            lf4.i = kf0.m;
                            kf0.m = Float.MAX_VALUE;
                            C2207mp c2207mpA5 = lf4.a(c2207mpA4.a, c2207mpA4.b, j8);
                            kf0.b = c2207mpA5.a;
                            kf0.a = c2207mpA5.b;
                        } else {
                            C2207mp c2207mpA6 = kf0.l.a(kf0.b, kf0.a, j3);
                            kf0.b = c2207mpA6.a;
                            kf0.a = c2207mpA6.b;
                        }
                        float fMax3 = Math.max(kf0.b, kf0.g);
                        kf0.b = fMax3;
                        float fMin3 = Math.min(fMax3, kf0.f);
                        kf0.b = fMin3;
                        f = kf0.a;
                        lf0 = kf0.l;
                        lf0.getClass();
                        if (Math.abs(f) < lf0.e || Math.abs(fMin3 - ((float) lf0.i)) >= lf0.d) {
                            z = false;
                        } else {
                            kf0.b = (float) kf0.l.i;
                            kf0.a = 0.0f;
                            z = true;
                        }
                        float fMin4 = Math.min(kf0.b, kf0.f);
                        kf0.b = fMin4;
                        float fMax4 = Math.max(fMin4, kf0.g);
                        kf0.b = fMax4;
                        kf0.b(fMax4);
                        if (z) {
                            kf0.e = z2;
                            threadLocal = C1064b3.f;
                            if (threadLocal.get() == null) {
                                threadLocal.set(new C1064b3());
                            }
                            c1064b3 = (C1064b3) threadLocal.get();
                            c1064b3.a.remove(kf0);
                            arrayList2 = c1064b3.b;
                            iIndexOf = arrayList2.indexOf(kf0);
                            if (iIndexOf >= 0) {
                                arrayList2.set(iIndexOf, null);
                                c1064b3.e = true;
                            }
                            kf0.h = 0L;
                            kf0.c = z2;
                            i = 0;
                            r6 = z2;
                            while (true) {
                                arrayList3 = kf0.j;
                                if (i < arrayList3.size()) {
                                    break;
                                }
                                if (arrayList3.get(i) != null) {
                                    C3462zm0 c3462zm1 = (C3462zm0) arrayList3.get(i);
                                    f2 = kf0.b;
                                    am0 = c3462zm1.a;
                                    c1306dd0 = C1306dd0.n;
                                    cm0 = am0.g;
                                    if (f2 < 1.0f) {
                                        long j9 = cm0.H;
                                        Cm0 cm0S2 = ((Im0) cm0).S(r6);
                                        cm1 = cm0S2.D;
                                        cm0S2.D = null;
                                        i3 = i4;
                                        j5 = jUptimeMillis;
                                        cm0.I(-1L, am0.a);
                                        cm0.I(j9, -1L);
                                        am0.a = j9;
                                        runnable = am0.f;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                        cm0.F.clear();
                                        if (cm1 != null) {
                                            cm1.B(cm1, c1306dd0, true);
                                        }
                                    } else {
                                        j5 = jUptimeMillis;
                                        i3 = i4;
                                        cm0.B(cm0, c1306dd0, false);
                                    }
                                } else {
                                    j5 = jUptimeMillis;
                                    i3 = i4;
                                }
                                i++;
                                i4 = i3;
                                jUptimeMillis = j5;
                                r6 = 0;
                            }
                            j4 = jUptimeMillis;
                            i2 = i4;
                            while (size >= 0) {
                                if (arrayList3.get(size) == null) {
                                    arrayList3.remove(size);
                                }
                            }
                        }
                    }
                    j4 = jUptimeMillis;
                    i2 = i4;
                } else {
                    j4 = jUptimeMillis;
                    i2 = i4;
                }
            }
            i4 = i2 + 1;
            jUptimeMillis = j4;
            z2 = false;
        }
        if (c1064b4.e) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                if (arrayList.get(size2) == null) {
                    arrayList.remove(size2);
                }
            }
            c1064b4.e = false;
        }
        if (arrayList.size() > 0) {
            if (c1064b4.d == null) {
                c1064b4.d = new Na0(c1064b4.c);
            }
            Na0 na0 = c1064b4.d;
            ((Choreographer) na0.n).postFrameCallback((ChoreographerFrameCallbackC0966a3) na0.f414o);
        }
    }
}
