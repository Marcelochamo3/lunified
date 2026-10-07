package o;

import android.content.Context;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import io.sentry.C0032c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: o.bm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1128bm extends AbstractC3133wN implements X60 {
    public static final HW j;
    public static final HW k;
    public final Object c;
    public final Context d;
    public final C2691rp e;
    public final boolean f;
    public C0814Ul g;
    public final C0032c h;
    public I6 i;

    static {
        Comparator c2147m8 = new C2147m8(5);
        j = c2147m8 instanceof HW ? (HW) c2147m8 : new C0315Bf(c2147m8);
        Comparator c2147m9 = new C2147m8(6);
        k = c2147m9 instanceof HW ? (HW) c2147m9 : new C0315Bf(c2147m9);
    }

    public C1128bm(Context context) {
        C2691rp c2691rp = new C2691rp(21);
        int i = C0814Ul.b0;
        C0814Ul c0814UlE = new C0788Tl(context).e();
        this.c = new Object();
        this.d = context != null ? context.getApplicationContext() : null;
        this.e = c2691rp;
        this.g = c0814UlE;
        this.i = I6.r;
        boolean z = context != null && Lr0.J(context);
        this.f = z;
        if (!z && context != null && Lr0.a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.h = audioManager != null ? new C0032c(audioManager.getSpatializer()) : null;
        }
        if (this.g.U && context == null) {
            AP.z();
        }
    }

    public static int d(int i, int i2) {
        if (i == 0 || i != i2) {
            return Integer.bitCount(i & i2);
        }
        return Integer.MAX_VALUE;
    }

    public static int e(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
            case "video/dolby-vision":
                return 5;
            case "video/av01":
                return 4;
            case "video/hevc":
                return 3;
            case "video/avc":
                return 1;
            case "video/x-vnd.on2.vp9":
                return 2;
            default:
                return 0;
        }
    }

    public static void f(C1031am0 c1031am0, C0814Ul c0814Ul, HashMap map) {
        for (int i = 0; i < c1031am0.l; i++) {
            C1519fm0 c1519fm0 = (C1519fm0) c0814Ul.J.get(c1031am0.a(i));
            if (c1519fm0 != null) {
                Zl0 zl0 = c1519fm0.l;
                C1519fm0 c1519fm1 = (C1519fm0) map.get(Integer.valueOf(zl0.n));
                if (c1519fm1 == null || (c1519fm1.m.isEmpty() && !c1519fm0.m.isEmpty())) {
                    map.put(Integer.valueOf(zl0.n), c1519fm0);
                }
            }
        }
    }

    public static int g(C0643Nw c0643Nw, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(c0643Nw.n)) {
            return 4;
        }
        String strK = k(str);
        String strK2 = k(c0643Nw.n);
        if (strK2 == null || strK == null) {
            return (z && strK2 == null) ? 1 : 0;
        }
        if (strK2.startsWith(strK) || strK.startsWith(strK2)) {
            return 3;
        }
        int i = Lr0.a;
        return strK2.split("-", 2)[0].equals(strK.split("-", 2)[0]) ? 2 : 0;
    }

    public static boolean i(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static String k(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static Pair m(int i, C3036vN c3036vN, int[][][] iArr, InterfaceC0918Yl interfaceC0918Yl, Comparator comparator) {
        RandomAccess randomAccessQ;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c3036vN.a; i2++) {
            if (i == c3036vN.b[i2]) {
                C1031am0 c1031am0 = c3036vN.c[i2];
                for (int i3 = 0; i3 < c1031am0.l; i3++) {
                    Zl0 zl0A = c1031am0.a(i3);
                    M60 m60E = interfaceC0918Yl.e(i2, zl0A, iArr[i2][i3]);
                    int i4 = zl0A.l;
                    boolean[] zArr = new boolean[i4];
                    for (int i5 = 0; i5 < i4; i5++) {
                        AbstractC0944Zl abstractC0944Zl = (AbstractC0944Zl) m60E.get(i5);
                        int iA = abstractC0944Zl.a();
                        if (!zArr[i5] && iA != 0) {
                            if (iA == 1) {
                                randomAccessQ = AbstractC0985aF.q(abstractC0944Zl);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(abstractC0944Zl);
                                for (int i6 = i5 + 1; i6 < i4; i6++) {
                                    AbstractC0944Zl abstractC0944Zl2 = (AbstractC0944Zl) m60E.get(i6);
                                    if (abstractC0944Zl2.a() == 2 && abstractC0944Zl.b(abstractC0944Zl2)) {
                                        arrayList2.add(abstractC0944Zl2);
                                        zArr[i6] = true;
                                    }
                                }
                                randomAccessQ = arrayList2;
                            }
                            arrayList.add(randomAccessQ);
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            iArr2[i7] = ((AbstractC0944Zl) list.get(i7)).n;
        }
        AbstractC0944Zl abstractC0944Zl3 = (AbstractC0944Zl) list.get(0);
        return Pair.create(new C1823is(0, abstractC0944Zl3.m, iArr2), Integer.valueOf(abstractC0944Zl3.l));
    }

    @Override // o.AbstractC3133wN
    public final void a() {
        C0032c c0032c;
        C0866Wl c0866Wl;
        synchronized (this.c) {
            try {
                if (Lr0.a >= 32 && (c0032c = this.h) != null && (c0866Wl = (C0866Wl) c0032c.e) != null && ((Handler) c0032c.d) != null) {
                    ((Spatializer) c0032c.c).removeOnSpatializerStateChangedListener(c0866Wl);
                    ((Handler) c0032c.d).removeCallbacksAndMessages(null);
                    c0032c.d = null;
                    c0032c.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a = null;
        this.b = null;
    }

    @Override // o.AbstractC3133wN
    public final void b(I6 i6) {
        boolean z;
        synchronized (this.c) {
            z = !this.i.equals(i6);
            this.i = i6;
        }
        if (z) {
            j();
        }
    }

    @Override // o.AbstractC3133wN
    public final void c(C1715hm0 c1715hm0) {
        if (c1715hm0 instanceof C0814Ul) {
            n((C0814Ul) c1715hm0);
        }
        C0788Tl c0788Tl = new C0788Tl(h());
        c0788Tl.b(c1715hm0);
        n(new C0814Ul(c0788Tl));
    }

    public final C0814Ul h() {
        C0814Ul c0814Ul;
        synchronized (this.c) {
            c0814Ul = this.g;
        }
        return c0814Ul;
    }

    public final void j() {
        boolean z;
        C1628gs c1628gs;
        C0032c c0032c;
        synchronized (this.c) {
            try {
                z = this.g.U && !this.f && Lr0.a >= 32 && (c0032c = this.h) != null && c0032c.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z || (c1628gs = this.a) == null) {
            return;
        }
        c1628gs.s.d(10);
    }

    public final void l() {
        boolean z;
        C1628gs c1628gs;
        synchronized (this.c) {
            z = this.g.Y;
        }
        if (!z || (c1628gs = this.a) == null) {
            return;
        }
        c1628gs.s.d(26);
    }

    public final void n(C0814Ul c0814Ul) {
        boolean z;
        c0814Ul.getClass();
        synchronized (this.c) {
            z = !this.g.equals(c0814Ul);
            this.g = c0814Ul;
        }
        if (z) {
            if (c0814Ul.U && this.d == null) {
                AP.z();
            }
            C1628gs c1628gs = this.a;
            if (c1628gs != null) {
                c1628gs.s.d(10);
            }
        }
    }
}
