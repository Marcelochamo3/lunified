package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.leanback.widget.SearchEditText;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.exoplayer2.source.dash.DashMediaSource$Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory;
import com.skidush.clonex.R;
import java.lang.reflect.GenericDeclaration;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class Tl0 implements InterfaceC2604qt0 {
    public static final byte[] s = {0, 7, 8, 15};
    public static final byte[] t = {0, 119, -120, -1};
    public static final byte[] u = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    public final Object l;
    public final Object m;
    public final Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f542o;
    public Object p;
    public Object q;
    public Object r;

    public Tl0(ConstraintLayout constraintLayout, ImageView imageView, SearchEditText searchEditText, C2303no0 c2303no0, ImageView imageView2, LinearLayout linearLayout, VerticalGridView verticalGridView) {
        this.l = constraintLayout;
        this.m = imageView;
        this.n = searchEditText;
        this.f542o = c2303no0;
        this.p = imageView2;
        this.q = linearLayout;
        this.r = verticalGridView;
    }

    public static byte[] a(int i, int i2, C2084lc c2084lc) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) c2084lc.i(i2);
        }
        return bArr;
    }

    public static int[] c() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = e(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                int i2 = i & 1;
                int i3 = Yu0.b.k0;
                int i4 = i2 != 0 ? Yu0.b.k0 : 0;
                int i5 = (i & 2) != 0 ? Yu0.b.k0 : 0;
                if ((i & 4) == 0) {
                    i3 = 0;
                }
                iArr[i] = e(255, i4, i5, i3);
            }
        }
        return iArr;
    }

    public static int[] d() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = e(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i2 = i & Yu0.b.s0;
                if (i2 == 0) {
                    iArr[i] = e(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 8) {
                    iArr[i] = e(Yu0.b.k0, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i2 == 128) {
                    iArr[i] = e(255, ((i & 1) != 0 ? 43 : 0) + Yu0.b.k0 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + Yu0.b.k0 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + Yu0.b.k0 + ((i & 64) == 0 ? 0 : 85));
                } else if (i2 == 136) {
                    iArr[i] = e(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int e(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01a3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01a7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ea A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x020f  */
    /* JADX WARN: Code duplicated, block: B:119:0x021d A[LOOP:3: B:89:0x016c->B:119:0x021d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:141:0x0144 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:142:0x0218 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x013d  */
    /* JADX WARN: Code duplicated, block: B:76:0x014a A[LOOP:2: B:41:0x00aa->B:76:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:91:0x0172  */
    /* JADX WARN: Code duplicated, block: B:93:0x017b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0181  */
    /* JADX WARN: Code duplicated, block: B:96:0x0193  */
    /* JADX WARN: Code duplicated, block: B:98:0x0199  */
    /* JADX WARN: Code duplicated, block: B:99:0x019d  */
    public static void g(byte[] bArr, int[] iArr, int i, int i2, int i3, Paint paint, Canvas canvas) {
        byte[] bArr2;
        byte[] bArr3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        int i11;
        C2084lc c2084lc = new C2084lc(bArr.length, bArr);
        int i12 = i2;
        int i13 = i3;
        byte[] bArrA = null;
        byte[] bArrA2 = null;
        byte[] bArrA3 = null;
        while (c2084lc.b() != 0) {
            int i14 = 8;
            int i15 = c2084lc.i(8);
            if (i15 != 240) {
                int i16 = 3;
                int i17 = 4;
                switch (i15) {
                    case 16:
                        int i18 = 1;
                        if (i == 3) {
                            bArr3 = bArrA == null ? t : bArrA;
                        } else {
                            if (i == 2) {
                                bArr3 = bArrA3 == null ? s : bArrA3;
                            } else {
                                bArr2 = null;
                            }
                            i4 = i12;
                            z = false;
                            while (true) {
                                i5 = c2084lc.i(2);
                                if (i5 == 0) {
                                    if (c2084lc.h()) {
                                        z = z;
                                        i7 = c2084lc.i(3) + 3;
                                        i5 = c2084lc.i(2);
                                    } else if (c2084lc.h()) {
                                        i5 = 0;
                                    } else {
                                        i6 = c2084lc.i(2);
                                        if (i6 != 0) {
                                            i5 = 0;
                                            z = true;
                                        } else if (i6 != i18) {
                                            z = z;
                                            i5 = 0;
                                            i7 = 2;
                                        } else if (i6 != 2) {
                                            z = z;
                                            i7 = c2084lc.i(4) + 12;
                                            i5 = c2084lc.i(2);
                                        } else if (i6 != 3) {
                                            z = z;
                                            i5 = 0;
                                        } else {
                                            z = z;
                                            i7 = c2084lc.i(8) + 29;
                                            i5 = c2084lc.i(2);
                                        }
                                        i7 = 0;
                                    }
                                    if (i7 == 0 && paint != null) {
                                        if (bArr2 != 0) {
                                            i5 = bArr2[i5];
                                        }
                                        paint.setColor(iArr[i5]);
                                        canvas.drawRect(i4, i13, i4 + i7, i13 + 1, paint);
                                    }
                                    i4 += i7;
                                    if (z) {
                                        c2084lc.c();
                                    } else {
                                        z = z;
                                        i18 = 1;
                                    }
                                    break;
                                }
                                i7 = 1;
                                if (i7 == 0) {
                                }
                                i4 += i7;
                                if (z) {
                                    c2084lc.c();
                                } else {
                                    z = z;
                                    i18 = 1;
                                }
                            }
                        }
                        bArr2 = bArr3;
                        i4 = i12;
                        z = false;
                        while (true) {
                            i5 = c2084lc.i(2);
                            if (i5 == 0) {
                                if (c2084lc.h()) {
                                    z = z;
                                    i7 = c2084lc.i(3) + 3;
                                    i5 = c2084lc.i(2);
                                } else if (c2084lc.h()) {
                                    i5 = 0;
                                } else {
                                    i6 = c2084lc.i(2);
                                    if (i6 != 0) {
                                        i5 = 0;
                                        z = true;
                                    } else if (i6 != i18) {
                                        z = z;
                                        i5 = 0;
                                        i7 = 2;
                                    } else if (i6 != 2) {
                                        z = z;
                                        i7 = c2084lc.i(4) + 12;
                                        i5 = c2084lc.i(2);
                                    } else if (i6 != 3) {
                                        z = z;
                                        i5 = 0;
                                    } else {
                                        z = z;
                                        i7 = c2084lc.i(8) + 29;
                                        i5 = c2084lc.i(2);
                                    }
                                    i7 = 0;
                                }
                                if (i7 == 0) {
                                }
                                i4 += i7;
                                if (z) {
                                    c2084lc.c();
                                } else {
                                    z = z;
                                    i18 = 1;
                                }
                                break;
                            }
                            i7 = 1;
                            if (i7 == 0) {
                            }
                            i4 += i7;
                            if (z) {
                                c2084lc.c();
                            } else {
                                z = z;
                                i18 = 1;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr4 = i == 3 ? bArrA2 == null ? u : bArrA2 : null;
                        i4 = i12;
                        boolean z3 = false;
                        while (true) {
                            int i19 = c2084lc.i(i17);
                            if (i19 == 0) {
                                if (c2084lc.h()) {
                                    if (c2084lc.h()) {
                                        int i20 = c2084lc.i(2);
                                        if (i20 == 0) {
                                            i19 = 0;
                                        } else if (i20 == 1) {
                                            z3 = z3;
                                            i19 = 0;
                                            i8 = 2;
                                        } else if (i20 == 2) {
                                            i9 = c2084lc.i(i17) + 9;
                                            i10 = c2084lc.i(i17);
                                        } else if (i20 != i16) {
                                            z3 = z3;
                                            i19 = 0;
                                            i8 = 0;
                                        } else {
                                            i9 = c2084lc.i(i14) + 25;
                                            i10 = c2084lc.i(i17);
                                        }
                                    } else {
                                        i9 = c2084lc.i(2) + i17;
                                        i10 = c2084lc.i(i17);
                                    }
                                    z3 = z3;
                                    i8 = i9;
                                    i19 = i10;
                                } else {
                                    int i21 = c2084lc.i(i16);
                                    if (i21 != 0) {
                                        z3 = z3;
                                        i8 = i21 + 2;
                                        i19 = 0;
                                    } else {
                                        i19 = 0;
                                        z3 = true;
                                        i8 = 0;
                                    }
                                }
                                if (i8 == 0 && paint != null) {
                                    if (bArr4 != 0) {
                                        i19 = bArr4[i19];
                                    }
                                    paint.setColor(iArr[i19]);
                                    canvas.drawRect(i4, i13, i4 + i8, i13 + 1, paint);
                                }
                                i4 += i8;
                                if (z3) {
                                    c2084lc.c();
                                } else {
                                    z3 = z3;
                                    i17 = 4;
                                    i16 = 3;
                                    i14 = 8;
                                }
                                break;
                            }
                            i8 = 1;
                            if (i8 == 0) {
                            }
                            i4 += i8;
                            if (z3) {
                                c2084lc.c();
                            } else {
                                z3 = z3;
                                i17 = 4;
                                i16 = 3;
                                i14 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        int i22 = i12;
                        boolean z4 = false;
                        while (true) {
                            int i23 = c2084lc.i(8);
                            if (i23 != 0) {
                                z2 = z4;
                                i11 = 1;
                            } else if (c2084lc.h()) {
                                z2 = z4;
                                i11 = c2084lc.i(7);
                                i23 = c2084lc.i(8);
                            } else {
                                int i24 = c2084lc.i(7);
                                if (i24 != 0) {
                                    z2 = z4;
                                    i11 = i24;
                                    i23 = 0;
                                } else {
                                    i23 = 0;
                                    z2 = true;
                                    i11 = 0;
                                }
                            }
                            if (i11 != 0 && paint != null) {
                                paint.setColor(iArr[i23]);
                                canvas.drawRect(i22, i13, i22 + i11, i13 + 1, paint);
                            }
                            i22 += i11;
                            if (z2) {
                                i12 = i22;
                                continue;
                            } else {
                                z4 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (i15) {
                            case 32:
                                bArrA3 = a(4, 4, c2084lc);
                                break;
                            case 33:
                                bArrA = a(4, 8, c2084lc);
                                break;
                            case C3080vp0.H /* 34 */:
                                bArrA2 = a(16, 8, c2084lc);
                                break;
                            default:
                                continue;
                        }
                        break;
                }
                i12 = i4;
            } else {
                i13 += 2;
                i12 = i2;
            }
        }
    }

    public static C1426ep h(C2084lc c2084lc, int i) {
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int i8 = c2084lc.i(8);
        c2084lc.s(8);
        int i9 = 2;
        int i10 = i - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrC = c();
        int[] iArrD = d();
        while (i10 > 0) {
            int i11 = c2084lc.i(i7);
            int i12 = c2084lc.i(i7);
            if ((i12 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (i12 & 64) != 0 ? iArrC : iArrD;
            }
            if ((i12 & 1) != 0) {
                i5 = c2084lc.i(i7);
                i6 = c2084lc.i(i7);
                i2 = c2084lc.i(i7);
                i4 = c2084lc.i(i7);
                i3 = i10 - 6;
            } else {
                int i13 = c2084lc.i(6) << i9;
                int i14 = c2084lc.i(4) << 4;
                i2 = c2084lc.i(4) << 4;
                i3 = i10 - 4;
                i4 = c2084lc.i(i9) << 6;
                i5 = i13;
                i6 = i14;
            }
            if (i5 == 0) {
                i6 = 0;
                i2 = 0;
                i4 = 255;
            }
            double d = i5;
            double d2 = i6 - 128;
            double d3 = i2 - 128;
            iArr[i11] = e((byte) (255 - (i4 & 255)), Lr0.j((int) ((1.402d * d2) + d), 0, 255), Lr0.j((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), Lr0.j((int) ((d3 * 1.772d) + d), 0, 255));
            i10 = i3;
            i8 = i8;
            iArrD = iArrD;
            i7 = 8;
            i9 = 2;
        }
        return new C1426ep(i8, iArr2, iArrC, iArrD);
    }

    public static C1622gp i(C2084lc c2084lc) {
        byte[] bArr;
        int i = c2084lc.i(16);
        c2084lc.s(4);
        int i2 = c2084lc.i(2);
        boolean zH = c2084lc.h();
        c2084lc.s(1);
        byte[] bArr2 = Lr0.e;
        if (i2 != 1) {
            if (i2 == 0) {
                int i3 = c2084lc.i(16);
                int i4 = c2084lc.i(16);
                if (i3 > 0) {
                    bArr2 = new byte[i3];
                    c2084lc.k(i3, bArr2);
                }
                if (i4 > 0) {
                    bArr = new byte[i4];
                    c2084lc.k(i4, bArr);
                }
            }
            return new C1622gp(i, zH, bArr2, bArr);
        }
        c2084lc.s(c2084lc.i(8) * 16);
        bArr = bArr2;
        return new C1622gp(i, zH, bArr2, bArr);
    }

    @Override // o.InterfaceC2604qt0
    public View b() {
        return (ConstraintLayout) this.l;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    public Gh0 f(int i) {
        Gh0 c2296nl;
        Gh0 gh0;
        final int i2 = 0;
        final int i3 = 3;
        final int i4 = 2;
        final int i5 = 1;
        HashMap map = (HashMap) this.m;
        if (map.containsKey(Integer.valueOf(i))) {
            return (Gh0) map.get(Integer.valueOf(i));
        }
        final InterfaceC2486pj interfaceC2486pj = (InterfaceC2486pj) this.p;
        interfaceC2486pj.getClass();
        Gh0 gh1 = null;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        final Class clsAsSubclass = HlsMediaSource$Factory.class.asSubclass(BP.class);
                        gh0 = new Gh0() { // from class: o.ml
                            @Override // o.Gh0
                            public final Object get() {
                                switch (i4) {
                                    case 0:
                                        return C2393ol.d((Class) clsAsSubclass, interfaceC2486pj);
                                    case 1:
                                        return C2393ol.d((Class) clsAsSubclass, interfaceC2486pj);
                                    case 2:
                                        return C2393ol.d((Class) clsAsSubclass, interfaceC2486pj);
                                    default:
                                        return new G30(interfaceC2486pj, (InterfaceC0380Ds) ((Tl0) clsAsSubclass).l);
                                }
                            }
                        };
                    } else if (i == 3) {
                        c2296nl = new C2296nl(0, Class.forName("com.google.android.exoplayer2.source.rtsp.RtspMediaSource$Factory").asSubclass(BP.class));
                    } else if (i == 4) {
                        gh1 = new Gh0() { // from class: o.ml
                            @Override // o.Gh0
                            public final Object get() {
                                switch (i3) {
                                    case 0:
                                        return C2393ol.d((Class) this, interfaceC2486pj);
                                    case 1:
                                        return C2393ol.d((Class) this, interfaceC2486pj);
                                    case 2:
                                        return C2393ol.d((Class) this, interfaceC2486pj);
                                    default:
                                        return new G30(interfaceC2486pj, (InterfaceC0380Ds) ((Tl0) this).l);
                                }
                            }
                        };
                    }
                    map.put(Integer.valueOf(i), gh1);
                    if (gh1 != null) {
                        ((HashSet) this.n).add(Integer.valueOf(i));
                    }
                    return gh1;
                }
                final GenericDeclaration genericDeclarationAsSubclass = Class.forName("com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory").asSubclass(BP.class);
                gh0 = new Gh0() { // from class: o.ml
                    @Override // o.Gh0
                    public final Object get() {
                        switch (i5) {
                            case 0:
                                return C2393ol.d((Class) genericDeclarationAsSubclass, interfaceC2486pj);
                            case 1:
                                return C2393ol.d((Class) genericDeclarationAsSubclass, interfaceC2486pj);
                            case 2:
                                return C2393ol.d((Class) genericDeclarationAsSubclass, interfaceC2486pj);
                            default:
                                return new G30(interfaceC2486pj, (InterfaceC0380Ds) ((Tl0) genericDeclarationAsSubclass).l);
                        }
                    }
                };
                gh1 = gh0;
                map.put(Integer.valueOf(i), gh1);
                if (gh1 != null) {
                    ((HashSet) this.n).add(Integer.valueOf(i));
                }
                return gh1;
            }
            final Class clsAsSubclass2 = DashMediaSource$Factory.class.asSubclass(BP.class);
            c2296nl = new Gh0() { // from class: o.ml
                @Override // o.Gh0
                public final Object get() {
                    switch (i2) {
                        case 0:
                            return C2393ol.d((Class) clsAsSubclass2, interfaceC2486pj);
                        case 1:
                            return C2393ol.d((Class) clsAsSubclass2, interfaceC2486pj);
                        case 2:
                            return C2393ol.d((Class) clsAsSubclass2, interfaceC2486pj);
                        default:
                            return new G30(interfaceC2486pj, (InterfaceC0380Ds) ((Tl0) clsAsSubclass2).l);
                    }
                }
            };
            gh1 = c2296nl;
        } catch (ClassNotFoundException unused) {
        }
        map.put(Integer.valueOf(i), gh1);
        if (gh1 != null) {
            ((HashSet) this.n).add(Integer.valueOf(i));
        }
        return gh1;
    }

    public Tl0(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f542o = layoutParams;
        this.p = new Rect();
        this.q = new int[2];
        this.r = new int[2];
        this.l = context;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.m = viewInflate;
        this.n = (TextView) viewInflate.findViewById(R.id.message);
        layoutParams.setTitle(Tl0.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public Tl0(int i, int i2) {
        Paint paint = new Paint();
        this.l = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.m = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.n = new Canvas();
        this.f542o = new C1524fp(719, 575, 0, 719, 0, 575);
        this.p = new C1426ep(0, new int[]{0, -1, -16777216, -8421505}, c(), d());
        this.q = new C2012kp(i, i2);
    }

    public Tl0(C0580Lk c0580Lk) {
        this.l = c0580Lk;
        this.m = new HashMap();
        this.n = new HashSet();
        this.f542o = new HashMap();
    }

    public Tl0(ExecutorServiceC1956kA executorServiceC1956kA, ExecutorServiceC1956kA executorServiceC1956kA2, ExecutorServiceC1956kA executorServiceC1956kA3, ExecutorServiceC1956kA executorServiceC1956kA4, InterfaceC3081vq interfaceC3081vq, InterfaceC3275xq interfaceC3275xq) {
        this.r = AbstractC2506pt.H(150, new C2133m1(25, this));
        this.l = executorServiceC1956kA;
        this.m = executorServiceC1956kA2;
        this.n = executorServiceC1956kA3;
        this.f542o = executorServiceC1956kA4;
        this.p = interfaceC3081vq;
        this.q = interfaceC3275xq;
    }
}
