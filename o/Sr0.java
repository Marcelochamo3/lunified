package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public abstract class Sr0 {
    public static final X9 a = new X9(1);
    public static final X9 b = new X9(2);
    public static final String[] c = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] d = {44100, 48000, 32000};
    public static final int[] e = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] f = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] g = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] h = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] i = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public static final J2 j;
    public static final J2 k;

    static {
        boolean z = false;
        int i2 = 10;
        j = new J2(i2, "NONE", z);
        k = new J2(i2, "PENDING", z);
    }

    public static final Object A(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static void a(SpannableStringBuilder spannableStringBuilder, Object obj, int i2, int i3) {
        for (Object obj2 : spannableStringBuilder.getSpans(i2, i3, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i2 && spannableStringBuilder.getSpanEnd(obj2) == i3 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i2, i3, 33);
    }

    public static final C0730Rf b(InterfaceC0412Ey interfaceC0412Ey, Object obj, C0730Rf c0730Rf) {
        try {
            interfaceC0412Ey.b(obj);
        } catch (Throwable th) {
            if (c0730Rf == null || c0730Rf.getCause() == th) {
                return new C0730Rf("Exception in undelivered element handler for " + obj, th);
            }
            AbstractC3409z9.a(c0730Rf, th);
        }
        return c0730Rf;
    }

    public static void c(long j2, C2562qX c2562qX, InterfaceC1324dm0[] interfaceC1324dm0Arr) {
        int i2;
        int iU;
        while (true) {
            if (c2562qX.a() <= 1) {
                return;
            }
            int i3 = 0;
            while (true) {
                if (c2562qX.a() == 0) {
                    i2 = -1;
                    break;
                }
                int iU2 = c2562qX.u();
                i3 += iU2;
                if (iU2 != 255) {
                    i2 = i3;
                    break;
                }
            }
            int i4 = 0;
            do {
                if (c2562qX.a() == 0) {
                    i4 = -1;
                    break;
                } else {
                    iU = c2562qX.u();
                    i4 += iU;
                }
            } while (iU == 255);
            int i5 = c2562qX.b + i4;
            if (i4 == -1 || i4 > c2562qX.a()) {
                AP.z();
                i5 = c2562qX.c;
            } else if (i2 == 4 && i4 >= 8) {
                int iU3 = c2562qX.u();
                int iZ = c2562qX.z();
                int iG = iZ == 49 ? c2562qX.g() : 0;
                int iU4 = c2562qX.u();
                if (iZ == 47) {
                    c2562qX.G(1);
                }
                boolean z = iU3 == 181 && (iZ == 49 || iZ == 47) && iU4 == 3;
                if (iZ == 49) {
                    z &= iG == 1195456820;
                }
                if (z) {
                    d(j2, c2562qX, interfaceC1324dm0Arr);
                }
            }
            c2562qX.F(i5);
        }
    }

    public static void d(long j2, C2562qX c2562qX, InterfaceC1324dm0[] interfaceC1324dm0Arr) {
        int iU = c2562qX.u();
        if ((iU & 64) != 0) {
            c2562qX.G(1);
            int i2 = (iU & 31) * 3;
            int i3 = c2562qX.b;
            for (InterfaceC1324dm0 interfaceC1324dm0 : interfaceC1324dm0Arr) {
                c2562qX.F(i3);
                interfaceC1324dm0.e(i2, c2562qX);
                if (j2 != -9223372036854775807L) {
                    interfaceC1324dm0.d(j2, 1, i2, 0, null);
                }
            }
        }
    }

    public static final long e(long j2, EnumC1231cp enumC1231cp, EnumC1231cp enumC1231cp2) {
        AbstractC1474fG.j(enumC1231cp, "sourceUnit");
        AbstractC1474fG.j(enumC1231cp2, "targetUnit");
        return enumC1231cp2.l.convert(j2, enumC1231cp.l);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:24:0x0052, B:28:0x0067, B:30:0x006f, B:20:0x0047, B:23:0x004e), top: B:47:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0081 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object f(o.InterfaceC1734hw r7, o.G50 r8, boolean r9, o.InterfaceC0473Hh r10) {
        /*
            boolean r0 = r10 instanceof o.C2124lw
            if (r0 == 0) goto L13
            r0 = r10
            o.lw r0 = (o.C2124lw) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            o.lw r0 = new o.lw
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.p
            o.hi r1 = o.EnumC1706hi.l
            int r2 = r0.q
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4b
            if (r2 == r5) goto L3f
            if (r2 != r4) goto L37
            boolean r9 = r0.f904o
            o.F9 r7 = r0.n
            o.G50 r8 = r0.m
            o.hw r2 = r0.l
            o.Jp0.O(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r2
            goto L52
        L35:
            r7 = move-exception
            goto L8c
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            boolean r9 = r0.f904o
            o.F9 r7 = r0.n
            o.G50 r8 = r0.m
            o.hw r2 = r0.l
            o.Jp0.O(r10)     // Catch: java.lang.Throwable -> L35
            goto L67
        L4b:
            o.Jp0.O(r10)
            o.F9 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L52:
            r0.l = r7     // Catch: java.lang.Throwable -> L35
            r0.m = r8     // Catch: java.lang.Throwable -> L35
            r0.n = r10     // Catch: java.lang.Throwable -> L35
            r0.f904o = r9     // Catch: java.lang.Throwable -> L35
            r0.q = r5     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L63
            return r1
        L63:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L67:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L84
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.l = r2     // Catch: java.lang.Throwable -> L35
            r0.m = r8     // Catch: java.lang.Throwable -> L35
            r0.n = r7     // Catch: java.lang.Throwable -> L35
            r0.f904o = r9     // Catch: java.lang.Throwable -> L35
            r0.q = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r2.l(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L32
            return r1
        L84:
            if (r9 == 0) goto L89
            r8.f(r3)
        L89:
            o.uq0 r7 = o.C2985uq0.a
            return r7
        L8c:
            throw r7     // Catch: java.lang.Throwable -> L8d
        L8d:
            r10 = move-exception
            if (r9 == 0) goto La6
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L97
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L97:
            if (r3 != 0) goto La3
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        La3:
            r8.f(r3)
        La6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o.Sr0.f(o.hw, o.G50, boolean, o.Hh):java.lang.Object");
    }

    public static View g(View view, int i2) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View viewFindViewById = viewGroup.getChildAt(i3).findViewById(i2);
            if (viewFindViewById != null) {
                return viewFindViewById;
            }
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Xj0 h(String str) {
        AbstractC1474fG.j(str, "javaName");
        int iHashCode = str.hashCode();
        if (iHashCode != 79201641) {
            if (iHashCode != 79923350) {
                switch (iHashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return Xj0.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return Xj0.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return Xj0.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return Xj0.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return Xj0.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static final int i(InterfaceC2159mI interfaceC2159mI) {
        int iHashCode = interfaceC2159mI.b().a().hashCode();
        int iC = interfaceC2159mI.b().c();
        for (int i2 = 0; i2 < iC; i2++) {
            iHashCode = (iHashCode * 31) + interfaceC2159mI.b().d(i2).hashCode();
        }
        return iHashCode;
    }

    public static InterfaceC0914Yh j(InterfaceC0914Yh interfaceC0914Yh, InterfaceC0940Zh interfaceC0940Zh) {
        AbstractC1474fG.j(interfaceC0940Zh, "key");
        if (AbstractC1474fG.b(interfaceC0914Yh.getKey(), interfaceC0940Zh)) {
            return interfaceC0914Yh;
        }
        return null;
    }

    public static String k(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            if (xmlPullParser.getAttributeName(i2).equals(str)) {
                return xmlPullParser.getAttributeValue(i2);
            }
        }
        return null;
    }

    public static int l(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = d[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 == 3) {
            return ((((i3 == 3 ? e[i5 - 1] : f[i5 - 1]) * 12) / i8) + i9) * 4;
        }
        if (i3 == 3) {
            i7 = i4 == 2 ? g[i5 - 1] : h[i5 - 1];
        } else {
            i7 = i[i5 - 1];
        }
        if (i3 == 3) {
            return ((i7 * 144) / i8) + i9;
        }
        return (((i4 == 1 ? 72 : 144) * i7) / i8) + i9;
    }

    public static LT m(Zt0 zt0) {
        C3483zx c3483zx = LT.c;
        C2290ni c2290ni = C2290ni.b;
        AbstractC1474fG.j(c2290ni, "defaultCreationExtras");
        RN rn = new RN(zt0, c3483zx, c2290ni);
        C2766se c2766seA = AbstractC2822t60.a(LT.class);
        String strK = Pu0.k(c2766seA);
        if (strK != null) {
            return (LT) rn.x(c2766seA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strK));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    public static final int n(int i2, int i3, int i4) {
        if (i4 > 0) {
            if (i2 >= i3) {
                return i3;
            }
            int i5 = i3 % i4;
            if (i5 < 0) {
                i5 += i4;
            }
            int i6 = i2 % i4;
            if (i6 < 0) {
                i6 += i4;
            }
            int i7 = (i5 - i6) % i4;
            if (i7 < 0) {
                i7 += i4;
            }
            return i3 - i7;
        }
        if (i4 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i2 <= i3) {
            return i3;
        }
        int i8 = -i4;
        int i9 = i2 % i8;
        if (i9 < 0) {
            i9 += i8;
        }
        int i10 = i3 % i8;
        if (i10 < 0) {
            i10 += i8;
        }
        int i11 = (i9 - i10) % i8;
        if (i11 < 0) {
            i11 += i8;
        }
        return i3 + i11;
    }

    public static int o(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static boolean p(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean q(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean r(XmlPullParser xmlPullParser, String str) {
        return q(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static void s(boolean z) {
        if (!z) {
            throw new C1629gs0("Must be true");
        }
    }

    public static InterfaceC1022ai t(InterfaceC0914Yh interfaceC0914Yh, InterfaceC0940Zh interfaceC0940Zh) {
        AbstractC1474fG.j(interfaceC0940Zh, "key");
        return AbstractC1474fG.b(interfaceC0914Yh.getKey(), interfaceC0940Zh) ? C1038aq.l : interfaceC0914Yh;
    }

    public static void u(String str) {
        if (str == null || str.length() == 0) {
            throw new C1629gs0("String must not be empty");
        }
    }

    public static void v(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new C1629gs0(str2);
        }
    }

    public static void w(Object obj) {
        if (obj == null) {
            throw new C1629gs0("Object must not be null");
        }
    }

    public static int x(int i2) {
        int i3;
        int i4;
        if (!((i2 & (-2097152)) == -2097152) || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i5 = (i2 >>> 12) & 15;
        int i6 = (i2 >>> 10) & 3;
        if (i5 == 0 || i5 == 15 || i6 == 3) {
            return -1;
        }
        if (i4 == 1) {
            return i3 == 3 ? 1152 : 576;
        }
        if (i4 == 2) {
            return 1152;
        }
        if (i4 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    public static void y(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Animator animator = (Animator) arrayList.get(i2);
            jMax = Math.max(jMax, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 0);
        valueAnimatorOfInt.setDuration(jMax);
        arrayList.add(0, valueAnimatorOfInt);
        animatorSet.playTogether(arrayList);
    }

    public static InterfaceC1022ai z(InterfaceC0914Yh interfaceC0914Yh, InterfaceC1022ai interfaceC1022ai) {
        AbstractC1474fG.j(interfaceC1022ai, "context");
        return interfaceC1022ai == C1038aq.l ? interfaceC0914Yh : (InterfaceC1022ai) interfaceC1022ai.l(interfaceC0914Yh, C2478pf.f976o);
    }
}
