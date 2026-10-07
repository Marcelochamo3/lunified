package o;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.fragment.NavHostFragment;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public abstract class Pu0 {
    public static final J2 a;
    public static final J2 b;
    public static final J2 c;
    public static final J2 d;
    public static final C1749i30 e = new C1749i30(8);

    static {
        int i = 10;
        boolean z = false;
        a = new J2(i, "UNDEFINED", z);
        b = new J2(i, "REUSABLE_CLAIMED", z);
        int i2 = 10;
        boolean z2 = false;
        c = new J2(i2, "NULL", z2);
        d = new J2(i2, "UNINITIALIZED", z2);
    }

    /* JADX WARN: Code duplicated, block: B:185:0x0285  */
    /* JADX WARN: Code duplicated, block: B:202:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:204:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:206:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:208:0x0303  */
    /* JADX WARN: Code duplicated, block: B:299:0x04ce  */
    /* JADX WARN: Code duplicated, block: B:408:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:409:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:412:0x06c5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:416:0x06ce  */
    /* JADX WARN: Code duplicated, block: B:417:0x06d1  */
    /* JADX WARN: Code duplicated, block: B:419:0x06d5  */
    /* JADX WARN: Code duplicated, block: B:421:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:424:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:426:0x06e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:436:0x0704 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:72:0x010b  */
    public static void b(C0757Sg c0757Sg, C2742sK c2742sK, ArrayList arrayList, int i) {
        int i2;
        C3247xc[] c3247xcArr;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        C0394Eg[] c0394EgArr;
        int i5;
        C3247xc[] c3247xcArr2;
        C0731Rg c0731Rg;
        int i6;
        int i7;
        int i8;
        int i9;
        C0731Rg c0731Rg2;
        C1798if0 c1798if0;
        C1798if0 c1798if1;
        C0394Eg c0394Eg;
        C0394Eg c0394Eg2;
        C1798if0 c1798if2;
        C0731Rg c0731Rg3;
        C0394Eg[] c0394EgArr2;
        C0731Rg c0731Rg4;
        int i10;
        C0394Eg c0394Eg3;
        C0394Eg c0394Eg4;
        C1798if0 c1798if3;
        C0394Eg c0394Eg5;
        C1798if0 c1798if4;
        int size;
        C0394Eg c0394Eg6;
        C0731Rg c0731Rg5;
        int i11;
        C0731Rg c0731Rg6;
        C0757Sg c0757Sg2 = c0757Sg;
        int i12 = 2;
        if (i == 0) {
            i2 = c0757Sg2.z0;
            c3247xcArr = c0757Sg2.C0;
            i3 = 0;
        } else {
            i2 = c0757Sg2.A0;
            c3247xcArr = c0757Sg2.B0;
            i3 = 2;
        }
        int i13 = 0;
        while (i13 < i2) {
            C3247xc c3247xc = c3247xcArr[i13];
            boolean z4 = c3247xc.q;
            C0731Rg c0731Rg7 = c3247xc.a;
            int i14 = 3;
            int i15 = 1;
            int i16 = 8;
            if (z4) {
                i4 = i13;
            } else {
                int i17 = c3247xc.l;
                int i18 = i17 * 2;
                C0731Rg c0731Rg8 = c0731Rg7;
                C0731Rg c0731Rg9 = c0731Rg8;
                boolean z5 = false;
                while (!z5) {
                    c3247xc.i += i15;
                    c0731Rg8.m0[i17] = null;
                    c0731Rg8.l0[i17] = null;
                    int i19 = c0731Rg8.g0;
                    C0394Eg[] c0394EgArr3 = c0731Rg8.Q;
                    if (i19 != i16) {
                        c0731Rg8.j(i17);
                        c0394EgArr3[i18].e();
                        int i20 = i18 + 1;
                        c0394EgArr3[i20].e();
                        c0394EgArr3[i18].e();
                        c0394EgArr3[i20].e();
                        if (c3247xc.b == null) {
                            c3247xc.b = c0731Rg8;
                        }
                        c3247xc.d = c0731Rg8;
                        int i21 = c0731Rg8.p0[i17];
                        if (i21 == i14) {
                            int i22 = c0731Rg8.t[i17];
                            if (i22 == 0 || i22 == i14 || i22 == i12) {
                                c3247xc.j++;
                                float f = c0731Rg8.k0[i17];
                                if (f > 0.0f) {
                                    c3247xc.k += f;
                                }
                                if (c0731Rg8.g0 != 8 && i21 == 3 && (i22 == 0 || i22 == 3)) {
                                    if (f < 0.0f) {
                                        c3247xc.n = true;
                                    } else {
                                        c3247xc.f1118o = true;
                                    }
                                    if (c3247xc.h == null) {
                                        c3247xc.h = new ArrayList();
                                    }
                                    c3247xc.h.add(c0731Rg8);
                                }
                                if (c3247xc.f == null) {
                                    c3247xc.f = c0731Rg8;
                                }
                                C0731Rg c0731Rg10 = c3247xc.g;
                                if (c0731Rg10 != null) {
                                    c0731Rg10.l0[i17] = c0731Rg8;
                                }
                                c3247xc.g = c0731Rg8;
                            }
                            if (i17 == 0) {
                                if (c0731Rg8.r == 0 && c0731Rg8.u == 0) {
                                    int i23 = c0731Rg8.v;
                                }
                            } else if (c0731Rg8.s == 0 && c0731Rg8.x == 0) {
                                int i24 = c0731Rg8.y;
                            }
                        } else {
                            i13 = i13;
                        }
                    } else {
                        i13 = i13;
                    }
                    C0731Rg c0731Rg11 = c0731Rg9;
                    if (c0731Rg11 != c0731Rg8) {
                        c0731Rg11.m0[i17] = c0731Rg8;
                    }
                    C0394Eg c0394Eg7 = c0394EgArr3[i18 + 1].f;
                    if (c0394Eg7 != null) {
                        c0731Rg6 = c0394Eg7.d;
                        C0394Eg c0394Eg8 = c0731Rg6.Q[i18].f;
                        if (c0394Eg8 == null || c0394Eg8.d != c0731Rg8) {
                            c0731Rg6 = null;
                        }
                    } else {
                        c0731Rg6 = null;
                    }
                    if (c0731Rg6 == null) {
                        c0731Rg6 = c0731Rg8;
                        z5 = true;
                    }
                    c0731Rg9 = c0731Rg8;
                    i13 = i13;
                    i15 = 1;
                    i16 = 8;
                    i12 = 2;
                    c0731Rg8 = c0731Rg6;
                    i14 = 3;
                }
                i4 = i13;
                C0731Rg c0731Rg12 = c3247xc.b;
                if (c0731Rg12 != null) {
                    c0731Rg12.Q[i18].e();
                }
                C0731Rg c0731Rg13 = c3247xc.d;
                if (c0731Rg13 != null) {
                    c0731Rg13.Q[i18 + 1].e();
                }
                c3247xc.c = c0731Rg8;
                if (i17 == 0 && c3247xc.m) {
                    c3247xc.e = c0731Rg8;
                } else {
                    c3247xc.e = c0731Rg7;
                }
                c3247xc.p = c3247xc.f1118o && c3247xc.n;
            }
            c3247xc.q = true;
            if (arrayList == 0 || arrayList.contains(c0731Rg7)) {
                C0731Rg c0731Rg14 = c3247xc.c;
                C0731Rg c0731Rg15 = c3247xc.b;
                C0731Rg c0731Rg16 = c3247xc.d;
                C0731Rg c0731Rg17 = c3247xc.e;
                float f2 = c3247xc.k;
                boolean z6 = c0757Sg2.p0[i] == 2;
                if (i == 0) {
                    int i25 = c0731Rg17.i0;
                    boolean z7 = i25 == 0;
                    z3 = i25 == 1;
                    z = i25 == 2;
                    z2 = z7;
                } else {
                    int i26 = c0731Rg17.j0;
                    boolean z8 = i26 == 0;
                    boolean z9 = i26 == 1;
                    z = i26 == 2;
                    z2 = z8;
                    z3 = z9;
                }
                boolean z10 = false;
                while (true) {
                    c0394EgArr = c0757Sg2.Q;
                    if (z10) {
                        break;
                    }
                    C0394Eg c0394Eg9 = c0731Rg7.Q[i3];
                    int i27 = z ? 1 : 4;
                    int iE = c0394Eg9.e();
                    boolean z11 = z10;
                    int[] iArr = c0731Rg7.p0;
                    int i28 = i2;
                    C3247xc[] c3247xcArr3 = c3247xcArr;
                    boolean z12 = iArr[i] == 3 && c0731Rg7.t[i] == 0;
                    C0394Eg c0394Eg10 = c0394Eg9.f;
                    if (c0394Eg10 != null && c0731Rg7 != c0731Rg7) {
                        iE = c0394Eg10.e() + iE;
                    }
                    int i29 = iE;
                    if (z && c0731Rg7 != c0731Rg7 && c0731Rg7 != c0731Rg15) {
                        i27 = 8;
                    }
                    C0394Eg c0394Eg11 = c0394Eg9.f;
                    if (c0394Eg11 != null) {
                        if (c0731Rg7 == c0731Rg15) {
                            c2742sK.f(c0394Eg9.i, c0394Eg11.i, i29, 6);
                        } else {
                            c2742sK.f(c0394Eg9.i, c0394Eg11.i, i29, 8);
                        }
                        if (z12 && !z) {
                            i27 = 5;
                        }
                        c2742sK.e(c0394Eg9.i, c0394Eg9.f.i, i29, (c0731Rg7 == c0731Rg15 && z && c0731Rg7.S[i]) ? 5 : i27);
                    } else {
                        c3247xc = c3247xc;
                        c0731Rg7 = c0731Rg7;
                    }
                    C0394Eg[] c0394EgArr4 = c0731Rg7.Q;
                    if (z6) {
                        if (c0731Rg7.g0 == 8 || iArr[i] != 3) {
                            i11 = 0;
                        } else {
                            i11 = 0;
                            c2742sK.f(c0394EgArr4[i3 + 1].i, c0394EgArr4[i3].i, 0, 5);
                        }
                        c2742sK.f(c0394EgArr4[i3].i, c0394EgArr[i3].i, i11, 8);
                    }
                    C0394Eg c0394Eg12 = c0394EgArr4[i3 + 1].f;
                    if (c0394Eg12 != null) {
                        c0731Rg5 = c0394Eg12.d;
                        C0394Eg c0394Eg13 = c0731Rg5.Q[i3].f;
                        if (c0394Eg13 == null || c0394Eg13.d != c0731Rg7) {
                            c0731Rg5 = null;
                        }
                    } else {
                        c0731Rg5 = null;
                    }
                    if (c0731Rg5 != null) {
                        c0731Rg7 = c0731Rg5;
                        z10 = z11;
                    } else {
                        z10 = true;
                    }
                    c0731Rg17 = c0731Rg17;
                    i2 = i28;
                    c3247xcArr = c3247xcArr3;
                    c0731Rg7 = c0731Rg7;
                    c3247xc = c3247xc;
                }
                C3247xc c3247xc2 = c3247xc;
                C0731Rg c0731Rg18 = c0731Rg17;
                C0731Rg c0731Rg19 = c0731Rg7;
                i5 = i2;
                c3247xcArr2 = c3247xcArr;
                if (c0731Rg16 != null) {
                    int i30 = i3 + 1;
                    if (c0731Rg14.Q[i30].f != null) {
                        C0394Eg c0394Eg14 = c0731Rg16.Q[i30];
                        if (c0731Rg16.p0[i] == 3 && c0731Rg16.t[i] == 0 && !z) {
                            C0394Eg c0394Eg15 = c0394Eg14.f;
                            if (c0394Eg15.d == c0757Sg2) {
                                c2742sK.e(c0394Eg14.i, c0394Eg15.i, -c0394Eg14.e(), 5);
                            } else if (z) {
                                c0394Eg6 = c0394Eg14.f;
                                if (c0394Eg6.d == c0757Sg2) {
                                    c2742sK.e(c0394Eg14.i, c0394Eg6.i, -c0394Eg14.e(), 4);
                                }
                            }
                        } else if (z) {
                            c0394Eg6 = c0394Eg14.f;
                            if (c0394Eg6.d == c0757Sg2) {
                                c2742sK.e(c0394Eg14.i, c0394Eg6.i, -c0394Eg14.e(), 4);
                            }
                        }
                        c2742sK.g(c0394Eg14.i, c0731Rg14.Q[i30].f.i, -c0394Eg14.e(), 6);
                    }
                }
                if (z6) {
                    int i31 = i3 + 1;
                    C1798if0 c1798if5 = c0394EgArr[i31].i;
                    C0394Eg c0394Eg16 = c0731Rg14.Q[i31];
                    c2742sK.f(c1798if5, c0394Eg16.i, c0394Eg16.e(), 8);
                }
                C3247xc c3247xc3 = c3247xc2;
                ArrayList arrayList2 = c3247xc3.h;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f3 = (!c3247xc3.n || c3247xc3.p) ? f2 : c3247xc3.j;
                    C0731Rg c0731Rg20 = null;
                    float f4 = 0.0f;
                    int i32 = 0;
                    while (i32 < size) {
                        C0731Rg c0731Rg21 = (C0731Rg) arrayList2.get(i32);
                        float f5 = c0731Rg21.k0[i];
                        C0394Eg[] c0394EgArr5 = c0731Rg21.Q;
                        if (f5 < 0.0f) {
                            if (c3247xc3.p) {
                                c2742sK.e(c0394EgArr5[i3 + 1].i, c0394EgArr5[i3].i, 0, 4);
                            } else {
                                f5 = 1.0f;
                            }
                            c3247xc3 = c3247xc3;
                            arrayList2 = arrayList2;
                            size = size;
                            i32++;
                            c3247xc3 = c3247xc3;
                            size = size;
                            arrayList2 = arrayList2;
                        }
                        if (f5 == 0.0f) {
                            c2742sK.e(c0394EgArr5[i3 + 1].i, c0394EgArr5[i3].i, 0, 8);
                            c3247xc3 = c3247xc3;
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (c0731Rg20 != null) {
                                C0394Eg[] c0394EgArr6 = c0731Rg20.Q;
                                C1798if0 c1798if6 = c0394EgArr6[i3].i;
                                int i33 = i3 + 1;
                                C1798if0 c1798if7 = c0394EgArr6[i33].i;
                                C1798if0 c1798if8 = c0394EgArr5[i3].i;
                                C1798if0 c1798if9 = c0394EgArr5[i33].i;
                                T5 t5L = c2742sK.l();
                                t5L.b = 0.0f;
                                if (f3 == 0.0f || f4 == f5) {
                                    t5L.d.j(c1798if6, 1.0f);
                                    t5L.d.j(c1798if7, -1.0f);
                                    t5L.d.j(c1798if9, 1.0f);
                                    t5L.d.j(c1798if8, -1.0f);
                                } else if (f4 == 0.0f) {
                                    t5L.d.j(c1798if6, 1.0f);
                                    t5L.d.j(c1798if7, -1.0f);
                                } else if (f5 == 0.0f) {
                                    t5L.d.j(c1798if8, 1.0f);
                                    t5L.d.j(c1798if9, -1.0f);
                                } else {
                                    float f6 = (f4 / f3) / (f5 / f3);
                                    t5L.d.j(c1798if6, 1.0f);
                                    t5L.d.j(c1798if7, -1.0f);
                                    t5L.d.j(c1798if9, f6);
                                    t5L.d.j(c1798if8, -f6);
                                }
                                c2742sK.c(t5L);
                            }
                            f4 = f5;
                            c0731Rg20 = c0731Rg21;
                        }
                        i32++;
                        c3247xc3 = c3247xc3;
                        size = size;
                        arrayList2 = arrayList2;
                    }
                }
                C3247xc c3247xc4 = c3247xc3;
                if (c0731Rg15 == null || !(c0731Rg15 == c0731Rg16 || z)) {
                    c0731Rg = c0731Rg16;
                    i6 = i4;
                    if (!z2 || c0731Rg15 == null) {
                        int i34 = 8;
                        if (z3 && c0731Rg15 != null) {
                            int i35 = c3247xc4.j;
                            boolean z13 = i35 > 0 && c3247xc4.i == i35;
                            C0731Rg c0731Rg22 = c0731Rg15;
                            C0731Rg c0731Rg23 = c0731Rg22;
                            while (c0731Rg23 != null) {
                                C0731Rg c0731Rg24 = c0731Rg23.m0[i];
                                while (c0731Rg24 != null && c0731Rg24.g0 == i34) {
                                    c0731Rg24 = c0731Rg24.m0[i];
                                }
                                if (c0731Rg23 == c0731Rg15 || c0731Rg23 == c0731Rg || c0731Rg24 == null) {
                                    c0731Rg22 = c0731Rg22;
                                    i6 = i6;
                                    i9 = 8;
                                } else {
                                    C0731Rg c0731Rg25 = c0731Rg24 == c0731Rg ? null : c0731Rg24;
                                    C0394Eg[] c0394EgArr7 = c0731Rg23.Q;
                                    C0394Eg c0394Eg17 = c0394EgArr7[i3];
                                    C1798if0 c1798if10 = c0394Eg17.i;
                                    int i36 = i3 + 1;
                                    C1798if0 c1798if11 = c0731Rg22.Q[i36].i;
                                    int iE2 = c0394Eg17.e();
                                    int iE3 = c0394EgArr7[i36].e();
                                    if (c0731Rg25 != null) {
                                        c0394Eg = c0731Rg25.Q[i3];
                                        c1798if0 = c0394Eg.i;
                                        c0731Rg2 = c0731Rg25;
                                        C0394Eg c0394Eg18 = c0394Eg.f;
                                        c1798if1 = c0394Eg18 != null ? c0394Eg18.i : null;
                                    } else {
                                        c0731Rg2 = c0731Rg25;
                                        C0394Eg c0394Eg19 = c0731Rg.Q[i3];
                                        c1798if0 = c0394Eg19 != null ? c0394Eg19.i : null;
                                        c1798if1 = c0394EgArr7[i36].i;
                                        c0394Eg = c0394Eg19;
                                    }
                                    int iE4 = c0394Eg != null ? c0394Eg.e() + iE3 : iE3;
                                    int iE5 = c0731Rg22.Q[i36].e() + iE2;
                                    int i37 = z13 ? 8 : 4;
                                    if (c1798if10 == null || c1798if11 == null || c1798if0 == null || c1798if1 == null) {
                                        i9 = 8;
                                    } else {
                                        i9 = 8;
                                        c2742sK.b(c1798if10, c1798if11, iE5, 0.5f, c1798if0, c1798if1, iE4, i37);
                                    }
                                    c0731Rg24 = c0731Rg2;
                                }
                                c0731Rg22 = c0731Rg23.g0 != i9 ? c0731Rg23 : c0731Rg22;
                                c0731Rg23 = c0731Rg24;
                                i6 = i6;
                                i34 = 8;
                            }
                            i7 = i6;
                            C0394Eg c0394Eg20 = c0731Rg15.Q[i3];
                            C0394Eg c0394Eg21 = c0731Rg19.Q[i3].f;
                            int i38 = i3 + 1;
                            C0394Eg c0394Eg22 = c0731Rg.Q[i38];
                            C0394Eg c0394Eg23 = c0731Rg14.Q[i38].f;
                            if (c0394Eg21 == null) {
                                i8 = 5;
                            } else {
                                if (c0731Rg15 != c0731Rg) {
                                    c2742sK.e(c0394Eg20.i, c0394Eg21.i, c0394Eg20.e(), 5);
                                } else if (c0394Eg23 != null) {
                                    i8 = 5;
                                    c2742sK.b(c0394Eg20.i, c0394Eg21.i, c0394Eg20.e(), 0.5f, c0394Eg22.i, c0394Eg23.i, c0394Eg22.e(), 5);
                                }
                                i8 = 5;
                            }
                            if (c0394Eg23 != null && c0731Rg15 != c0731Rg) {
                                c2742sK.e(c0394Eg22.i, c0394Eg23.i, -c0394Eg22.e(), i8);
                            }
                        }
                        if ((z2 || z3) && c0731Rg15 != null && c0731Rg15 != c0731Rg) {
                            c0394EgArr2 = c0731Rg15.Q;
                            C0394Eg c0394Eg24 = c0394EgArr2[i3];
                            if (c0731Rg == null) {
                                c0731Rg4 = c0731Rg15;
                            } else {
                                c0731Rg4 = c0731Rg;
                            }
                            i10 = i3 + 1;
                            C0394Eg[] c0394EgArr8 = c0731Rg4.Q;
                            c0394Eg3 = c0394EgArr8[i10];
                            c0394Eg4 = c0394Eg24.f;
                            if (c0394Eg4 != null) {
                                c1798if3 = c0394Eg4.i;
                            } else {
                                c1798if3 = null;
                            }
                            c0394Eg5 = c0394Eg3.f;
                            if (c0394Eg5 != null) {
                                c1798if4 = c0394Eg5.i;
                            } else {
                                c1798if4 = null;
                            }
                            if (c0731Rg14 != c0731Rg4) {
                                C0394Eg c0394Eg25 = c0731Rg14.Q[i10].f;
                                c1798if4 = c0394Eg25 != null ? c0394Eg25.i : null;
                            }
                            if (c0731Rg15 == c0731Rg4) {
                                c0394Eg3 = c0394EgArr2[i10];
                            }
                            if (c1798if3 == null && c1798if4 != null) {
                                c2742sK.b(c0394Eg24.i, c1798if3, c0394Eg24.e(), 0.5f, c1798if4, c0394Eg3.i, c0394EgArr8[i10].e(), 5);
                            }
                        }
                    } else {
                        int i39 = c3247xc4.j;
                        boolean z14 = i39 > 0 && c3247xc4.i == i39;
                        C0731Rg c0731Rg26 = c0731Rg15;
                        C0731Rg c0731Rg27 = c0731Rg26;
                        while (c0731Rg27 != null) {
                            C0731Rg c0731Rg28 = c0731Rg27.m0[i];
                            while (c0731Rg28 != null && c0731Rg28.g0 == 8) {
                                c0731Rg28 = c0731Rg28.m0[i];
                            }
                            if (c0731Rg28 != null || c0731Rg27 == c0731Rg) {
                                C0394Eg[] c0394EgArr9 = c0731Rg27.Q;
                                C0394Eg c0394Eg26 = c0394EgArr9[i3];
                                C1798if0 c1798if12 = c0394Eg26.i;
                                C0394Eg c0394Eg27 = c0394Eg26.f;
                                C1798if0 c1798if13 = c0394Eg27 != null ? c0394Eg27.i : null;
                                if (c0731Rg26 != c0731Rg27) {
                                    c1798if13 = c0731Rg26.Q[i3 + 1].i;
                                } else if (c0731Rg27 == c0731Rg15) {
                                    C0394Eg c0394Eg28 = c0731Rg19.Q[i3].f;
                                    c1798if13 = c0394Eg28 != null ? c0394Eg28.i : null;
                                }
                                int iE6 = c0394Eg26.e();
                                int i40 = i3 + 1;
                                int iE7 = c0394EgArr9[i40].e();
                                if (c0731Rg28 != null) {
                                    c0394Eg2 = c0731Rg28.Q[i3];
                                    c1798if2 = c0394Eg2.i;
                                } else {
                                    c0394Eg2 = c0731Rg14.Q[i40].f;
                                    c1798if2 = c0394Eg2 != null ? c0394Eg2.i : null;
                                }
                                C1798if0 c1798if14 = c0394EgArr9[i40].i;
                                if (c0394Eg2 != null) {
                                    iE7 = c0394Eg2.e() + iE7;
                                }
                                int iE8 = c0731Rg26.Q[i40].e() + iE6;
                                if (c1798if12 == null || c1798if13 == null || c1798if2 == null || c1798if14 == null) {
                                    c0731Rg3 = c0731Rg28;
                                } else {
                                    if (c0731Rg27 == c0731Rg15) {
                                        iE8 = c0731Rg15.Q[i3].e();
                                    }
                                    if (c0731Rg27 == c0731Rg) {
                                        iE7 = c0731Rg.Q[i40].e();
                                    }
                                    int i41 = iE7;
                                    c0731Rg3 = c0731Rg28;
                                    c2742sK.b(c1798if12, c1798if13, iE8, 0.5f, c1798if2, c1798if14, i41, z14 ? 8 : 5);
                                }
                            } else {
                                c0731Rg3 = c0731Rg28;
                            }
                            c0731Rg26 = c0731Rg27.g0 != 8 ? c0731Rg27 : c0731Rg26;
                            c0731Rg27 = c0731Rg3;
                        }
                    }
                } else {
                    C0394Eg c0394Eg29 = c0731Rg19.Q[i3];
                    int i42 = i3 + 1;
                    C0394Eg c0394Eg30 = c0731Rg14.Q[i42];
                    C0394Eg c0394Eg31 = c0394Eg29.f;
                    C1798if0 c1798if15 = c0394Eg31 != null ? c0394Eg31.i : null;
                    C0394Eg c0394Eg32 = c0394Eg30.f;
                    C1798if0 c1798if16 = c0394Eg32 != null ? c0394Eg32.i : null;
                    C0394Eg c0394Eg33 = c0731Rg15.Q[i3];
                    if (c0731Rg16 != null) {
                        c0394Eg30 = c0731Rg16.Q[i42];
                    }
                    if (c1798if15 == null || c1798if16 == null) {
                        c0731Rg = c0731Rg16;
                        i6 = i4;
                    } else {
                        c0731Rg = c0731Rg16;
                        i6 = i4;
                        c2742sK.b(c0394Eg33.i, c1798if15, c0394Eg33.e(), i == 0 ? c0731Rg18.d0 : c0731Rg18.e0, c1798if16, c0394Eg30.i, c0394Eg30.e(), 7);
                    }
                }
                i7 = i6;
                if (z2) {
                    c0394EgArr2 = c0731Rg15.Q;
                    C0394Eg c0394Eg210 = c0394EgArr2[i3];
                    if (c0731Rg == null) {
                        c0731Rg4 = c0731Rg15;
                    } else {
                        c0731Rg4 = c0731Rg;
                    }
                    i10 = i3 + 1;
                    C0394Eg[] c0394EgArr10 = c0731Rg4.Q;
                    c0394Eg3 = c0394EgArr10[i10];
                    c0394Eg4 = c0394Eg210.f;
                    if (c0394Eg4 != null) {
                        c1798if3 = c0394Eg4.i;
                    } else {
                        c1798if3 = null;
                    }
                    c0394Eg5 = c0394Eg3.f;
                    if (c0394Eg5 != null) {
                        c1798if4 = c0394Eg5.i;
                    } else {
                        c1798if4 = null;
                    }
                    if (c0731Rg14 != c0731Rg4) {
                        C0394Eg c0394Eg211 = c0731Rg14.Q[i10].f;
                        c1798if4 = c0394Eg211 != null ? c0394Eg211.i : null;
                    }
                    if (c0731Rg15 == c0731Rg4) {
                        c0394Eg3 = c0394EgArr2[i10];
                    }
                    if (c1798if3 == null) {
                    }
                } else {
                    c0394EgArr2 = c0731Rg15.Q;
                    C0394Eg c0394Eg212 = c0394EgArr2[i3];
                    if (c0731Rg == null) {
                        c0731Rg4 = c0731Rg15;
                    } else {
                        c0731Rg4 = c0731Rg;
                    }
                    i10 = i3 + 1;
                    C0394Eg[] c0394EgArr11 = c0731Rg4.Q;
                    c0394Eg3 = c0394EgArr11[i10];
                    c0394Eg4 = c0394Eg212.f;
                    if (c0394Eg4 != null) {
                        c1798if3 = c0394Eg4.i;
                    } else {
                        c1798if3 = null;
                    }
                    c0394Eg5 = c0394Eg3.f;
                    if (c0394Eg5 != null) {
                        c1798if4 = c0394Eg5.i;
                    } else {
                        c1798if4 = null;
                    }
                    if (c0731Rg14 != c0731Rg4) {
                        C0394Eg c0394Eg213 = c0731Rg14.Q[i10].f;
                        c1798if4 = c0394Eg213 != null ? c0394Eg213.i : null;
                    }
                    if (c0731Rg15 == c0731Rg4) {
                        c0394Eg3 = c0394EgArr2[i10];
                    }
                    if (c1798if3 == null) {
                    }
                }
            } else {
                i5 = i2;
                c3247xcArr2 = c3247xcArr;
                i7 = i4;
            }
            i13 = i7 + 1;
            i12 = 2;
            c0757Sg2 = c0757Sg;
            i2 = i5;
            c3247xcArr = c3247xcArr2;
        }
    }

    public static void c(String str) {
        if (Lr0.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static int d(long j) {
        int i = (int) j;
        AbstractC1459f50.g(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int e(C1755i60 c1755i60, AbstractC0351Cp abstractC0351Cp, View view, View view2, X50 x50, boolean z) {
        if (x50.x() == 0 || c1755i60.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(X50.N(view) - X50.N(view2)) + 1;
        }
        return Math.min(abstractC0351Cp.l(), abstractC0351Cp.b(view2) - abstractC0351Cp.e(view));
    }

    public static int f(C1755i60 c1755i60, AbstractC0351Cp abstractC0351Cp, View view, View view2, X50 x50, boolean z, boolean z2) {
        if (x50.x() == 0 || c1755i60.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (c1755i60.b() - Math.max(X50.N(view), X50.N(view2))) - 1) : Math.max(0, Math.min(X50.N(view), X50.N(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(abstractC0351Cp.b(view2) - abstractC0351Cp.e(view)) / (Math.abs(X50.N(view) - X50.N(view2)) + 1))) + (abstractC0351Cp.k() - abstractC0351Cp.e(view)));
        }
        return iMax;
    }

    public static int g(C1755i60 c1755i60, AbstractC0351Cp abstractC0351Cp, View view, View view2, X50 x50, boolean z) {
        if (x50.x() == 0 || c1755i60.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return c1755i60.b();
        }
        return (int) (((abstractC0351Cp.b(view2) - abstractC0351Cp.e(view)) / (Math.abs(X50.N(view) - X50.N(view2)) + 1)) * c1755i60.b());
    }

    public static int h(int i, int i2) {
        if (i2 <= 1073741823) {
            return Math.min(Math.max(i, i2), 1073741823);
        }
        throw new IllegalArgumentException(UK.J("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i2), 1073741823));
    }

    public static void i() {
        if (Lr0.a >= 18) {
            Trace.endSection();
        }
    }

    public static YT j(AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx) {
        Dialog dialog;
        Window window;
        AbstractC1474fG.j(abstractComponentCallbacksC1247cx, "fragment");
        for (AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx2 = abstractComponentCallbacksC1247cx; abstractComponentCallbacksC1247cx2 != null; abstractComponentCallbacksC1247cx2 = abstractComponentCallbacksC1247cx2.I) {
            if (abstractComponentCallbacksC1247cx2 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC1247cx2).W();
            }
            AbstractComponentCallbacksC1247cx abstractComponentCallbacksC1247cx3 = abstractComponentCallbacksC1247cx2.l().y;
            if (abstractComponentCallbacksC1247cx3 instanceof NavHostFragment) {
                return ((NavHostFragment) abstractComponentCallbacksC1247cx3).W();
            }
        }
        View view = abstractComponentCallbacksC1247cx.S;
        if (view != null) {
            return U9.o(view);
        }
        View decorView = null;
        DialogInterfaceOnCancelListenerC0348Cm dialogInterfaceOnCancelListenerC0348Cm = abstractComponentCallbacksC1247cx instanceof DialogInterfaceOnCancelListenerC0348Cm ? (DialogInterfaceOnCancelListenerC0348Cm) abstractComponentCallbacksC1247cx : null;
        if (dialogInterfaceOnCancelListenerC0348Cm != null && (dialog = dialogInterfaceOnCancelListenerC0348Cm.w0) != null && (window = dialog.getWindow()) != null) {
            decorView = window.getDecorView();
        }
        if (decorView != null) {
            return U9.o(decorView);
        }
        throw new IllegalStateException(AbstractC1701hf0.f("Fragment ", abstractComponentCallbacksC1247cx, " does not have a NavController set"));
    }

    public static final String k(InterfaceC1476fI interfaceC1476fI) {
        String str;
        Class cls = ((C2766se) interfaceC1476fI).a;
        AbstractC1474fG.j(cls, "jClass");
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        boolean zIsArray = cls.isArray();
        HashMap map = C2766se.c;
        if (!zIsArray) {
            String str2 = (String) map.get(cls.getName());
            return str2 == null ? cls.getCanonicalName() : str2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (str = (String) map.get(componentType.getName())) != null) {
            strConcat = str.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public static ArrayList l(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static final void m(InterfaceC1022ai interfaceC1022ai, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) interfaceC1022ai.q(O9.q);
            if (coroutineExceptionHandler != null) {
                ((C2) coroutineExceptionHandler).W(interfaceC1022ai, th);
            } else {
                Ou0.n(interfaceC1022ai, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC3409z9.a(runtimeException, th);
                th = runtimeException;
            }
            Ou0.n(interfaceC1022ai, th);
        }
    }

    public static int n(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static QH q(WH wh) {
        boolean z;
        try {
            try {
                wh.j0();
                z = false;
                try {
                    return (QH) Hp0.z.a(wh);
                } catch (EOFException e2) {
                    e = e2;
                    if (z) {
                        return SH.l;
                    }
                    throw new XH(e);
                }
            } catch (C2164mN e3) {
                throw new XH(e3);
            } catch (IOException e4) {
                throw new RH(e4);
            } catch (NumberFormatException e5) {
                throw new XH(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z = true;
        }
    }

    public static final void r(InterfaceC0473Hh interfaceC0473Hh, Object obj, InterfaceC0412Ey interfaceC0412Ey) {
        Object c0678Pf;
        if (!(interfaceC0473Hh instanceof C1520fn)) {
            interfaceC0473Hh.j(obj);
            return;
        }
        C1520fn c1520fn = (C1520fn) interfaceC0473Hh;
        Throwable thA = C2536q80.a(obj);
        if (thA == null) {
            c0678Pf = interfaceC0412Ey != null ? new C0704Qf(obj, interfaceC0412Ey) : obj;
        } else {
            c0678Pf = new C0678Pf(thA, false);
        }
        InterfaceC0473Hh interfaceC0473Hh2 = c1520fn.p;
        interfaceC0473Hh2.g();
        AbstractC1217ci abstractC1217ci = c1520fn.f783o;
        if (abstractC1217ci.Y()) {
            c1520fn.q = c0678Pf;
            c1520fn.n = 1;
            abstractC1217ci.W(interfaceC0473Hh2.g(), c1520fn);
            return;
        }
        AbstractC1918jr abstractC1918jrA = AbstractC1415ej0.a();
        if (abstractC1918jrA.d0()) {
            c1520fn.q = c0678Pf;
            c1520fn.n = 1;
            abstractC1918jrA.a0(c1520fn);
            return;
        }
        abstractC1918jrA.c0(true);
        try {
            AH ah = (AH) interfaceC0473Hh2.g().q(C2691rp.v);
            if (ah == null || ah.a()) {
                Object obj2 = c1520fn.r;
                InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh2.g();
                Object objI = Ou0.I(interfaceC1022aiG, obj2);
                C2791sq0 c2791sq0K = objI != Ou0.f ? AbstractC1923jt0.K(interfaceC0473Hh2, interfaceC1022aiG, objI) : null;
                try {
                    interfaceC0473Hh2.j(obj);
                    if (c2791sq0K == null || c2791sq0K.l0()) {
                        Ou0.y(interfaceC1022aiG, objI);
                    }
                } catch (Throwable th) {
                    if (c2791sq0K == null || c2791sq0K.l0()) {
                        Ou0.y(interfaceC1022aiG, objI);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationExceptionH = ((JH) ah).H();
                c1520fn.c(c0678Pf, cancellationExceptionH);
                c1520fn.j(Jp0.k(cancellationExceptionH));
            }
            while (abstractC1918jrA.f0()) {
            }
        } catch (Throwable th2) {
            try {
                c1520fn.l(th2, null);
            } finally {
                abstractC1918jrA.Z(true);
            }
        }
    }

    public static int s(long j) {
        if (j > C1707hi0.a) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0116 A[EDGE_INSN: B:43:0x0116->B:14:0x0034 BREAK  A[LOOP:0: B:37:0x00fb->B:52:0x012b]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0125 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:56:0x0130 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0131  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0116 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object t(java.lang.String r17, o.InterfaceC0775Sy r18, o.InterfaceC0473Hh r19) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Pu0.t(java.lang.String, o.Sy, o.Hh):java.lang.Object");
    }

    public static int u(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int[] v(Collection collection) {
        if (collection instanceof C1768iG) {
            C1768iG c1768iG = (C1768iG) collection;
            return Arrays.copyOfRange(c1768iG.l, c1768iG.m, c1768iG.n);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public abstract void a(C2534q70 c2534q70, Object obj);

    public abstract void o(Throwable th);

    public abstract void p(C1583gR c1583gR);
}
