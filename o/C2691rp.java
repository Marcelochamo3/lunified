package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import com.skidush.clonex.utils.BlindajeCrypto;
import java.io.File;
import java.io.IOException;
import java.net.Proxy;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2691rp implements InterfaceC0602Mh, InterfaceC0940Zh, JO, Z70, InterfaceC2555qQ, UJ, InterfaceC2339o7, I8, InterfaceC3284xu0, InterfaceC1201ca, InterfaceC1916jq {
    public static volatile OV t;
    public final /* synthetic */ int l;
    public static final C2691rp m = new C2691rp(1);
    public static final C2691rp n = new C2691rp(2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2691rp f1012o = new C2691rp(3);
    public static final /* synthetic */ C2691rp p = new C2691rp(4);
    public static final C2691rp q = new C2691rp(5);
    public static final C2691rp r = new C2691rp(6);
    public static final C2691rp s = new C2691rp(7);
    public static final C2691rp u = new C2691rp(8);
    public static final /* synthetic */ C2691rp v = new C2691rp(9);
    public static final C2691rp w = new C2691rp(10);
    public static final C2691rp x = new C2691rp(11);
    public static final C2691rp y = new C2691rp(12);
    public static final C2691rp z = new C2691rp(13);
    public static final C2691rp A = new C2691rp(14);
    public static final C2691rp B = new C2691rp(15);
    public static final C2691rp C = new C2691rp(16);
    public static final C2691rp D = new C2691rp(17);
    public static final C2691rp E = new C2691rp(18);
    public static final C2691rp F = new C2691rp(19);

    public /* synthetic */ C2691rp(int i) {
        this.l = i;
    }

    public static final String k(C1951k70 c1951k70, String str) {
        C2691rp c2691rp = s;
        OV ov = t;
        if (ov == null) {
            synchronized (c2691rp) {
                ov = t;
                if (ov == null) {
                    C3084vr0 c3084vr0 = C3084vr0.a;
                    NV nv = new NV();
                    nv.g(Proxy.NO_PROXY);
                    nv.h(InterfaceC2339o7.a);
                    nv.c.add(Sr0.a);
                    nv.d.add(Sr0.b);
                    X9 x9 = AbstractC1370eA.m;
                    AbstractC1406ef.S(nv.c, X10.q);
                    AbstractC1406ef.S(nv.d, X10.r);
                    nv.c.add(x9);
                    nv.d.add(x9);
                    C1041ar0 c1041ar0 = C3084vr0.u;
                    if (c1041ar0 != null) {
                        if (!BlindajeCrypto.a.j(c1041ar0.f, c1041ar0.h, "US")) {
                            c1041ar0 = null;
                        }
                        if (c1041ar0 != null) {
                            nv.g(c1041ar0.a());
                            nv.h(new Wq0(c1041ar0, 1));
                        }
                    }
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    nv.e(10L, timeUnit);
                    nv.i(18L, timeUnit);
                    nv.c(24L, timeUnit);
                    nv.h = false;
                    nv.i = false;
                    nv.c.add(new C2480pg(4));
                    OV ov2 = new OV(nv);
                    t = ov2;
                    ov = ov2;
                }
            }
        }
        C1855j80 c1855j80G = ov.c(c1951k70).g();
        try {
            AbstractC2051l80 abstractC2051l80 = c1855j80G.r;
            String strQ = abstractC2051l80 != null ? abstractC2051l80.q() : null;
            if (strQ == null) {
                strQ = "";
            }
            if (c1855j80G.p()) {
                if (!AbstractC1899jh0.O(strQ)) {
                    AbstractC3409z9.g(c1855j80G, null);
                    return strQ;
                }
                throw new IOException("El servicio respondió sin contenido (" + str + ")");
            }
            int i = c1855j80G.f840o;
            throw new C0459Gt(i, "No se pudo cargar el contenido (" + str + ", HTTP " + i + ")");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(c1855j80G, th);
                throw th2;
            }
        }
    }

    public static C2691rp p(Context context, int i) {
        Jp0.f("Cannot create a CalendarItemStyle with a styleResId of 0", i != 0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, H40.f294o);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList colorStateListL = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 4);
        ColorStateList colorStateListL2 = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 9);
        ColorStateList colorStateListL3 = AbstractC3021v9.l(context, typedArrayObtainStyledAttributes, 7);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        C1891jd0 c1891jd0A = C1891jd0.a(context, typedArrayObtainStyledAttributes.getResourceId(5, 0), typedArrayObtainStyledAttributes.getResourceId(6, 0), new C2421p(0)).a();
        typedArrayObtainStyledAttributes.recycle();
        return new C2691rp(colorStateListL, colorStateListL2, colorStateListL3, dimensionPixelSize, c1891jd0A, rect);
    }

    /* JADX WARN: Code duplicated, block: B:68:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    public static C2468pa r(String str) {
        int i;
        char cCharAt;
        AbstractC1474fG.j(str, "<this>");
        byte[] bArr = AbstractC1252d.a;
        int length = str.length();
        while (length > 0 && ((cCharAt = str.charAt(length - 1)) == '=' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == ' ' || cCharAt == '\t')) {
            length--;
        }
        int i2 = (int) ((((long) length) * 6) / 8);
        byte[] bArrCopyOf = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= length) {
                int i7 = i4 % 4;
                if (i7 != 1) {
                    if (i7 == 2) {
                        bArrCopyOf[i6] = (byte) ((i5 << 12) >> 16);
                        i6 = 1 + i6;
                    } else if (i7 == 3) {
                        int i8 = i5 << 6;
                        int i9 = 1 + i6;
                        bArrCopyOf[i6] = (byte) (i8 >> 16);
                        i6 += 2;
                        bArrCopyOf[i9] = (byte) (i8 >> 8);
                    }
                    if (i6 != i2) {
                        bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                        AbstractC1474fG.i(bArrCopyOf, "copyOf(this, newSize)");
                    }
                }
                if (bArrCopyOf != null) {
                    return new C2468pa(bArrCopyOf);
                }
                return null;
            }
            char cCharAt2 = str.charAt(i3);
            if ('A' <= cCharAt2 && cCharAt2 < '[') {
                i = cCharAt2 - 'A';
            } else if ('a' <= cCharAt2 && cCharAt2 < '{') {
                i = cCharAt2 - 'G';
            } else if ('0' <= cCharAt2 && cCharAt2 < ':') {
                i = cCharAt2 + 4;
            } else if (cCharAt2 == '+' || cCharAt2 == '-') {
                i = 62;
            } else {
                if (cCharAt2 != '/' && cCharAt2 != '_') {
                    if (cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != ' ' && cCharAt2 != '\t') {
                        break;
                    }
                } else {
                    i = 63;
                }
                i3++;
            }
            int i10 = i | (i5 << 6);
            i4++;
            if (i4 % 4 == 0) {
                bArrCopyOf[i6] = (byte) (i10 >> 16);
                int i11 = i6 + 2;
                bArrCopyOf[i6 + 1] = (byte) (i10 >> 8);
                i6 += 3;
                bArrCopyOf[i11] = (byte) i10;
            }
            i5 = i10;
            i3++;
        }
        bArrCopyOf = null;
        if (bArrCopyOf != null) {
            return new C2468pa(bArrCopyOf);
        }
        return null;
    }

    public static C2468pa s(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: ".concat(str).toString());
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC3021v9.a(str.charAt(i2 + 1)) + (AbstractC3021v9.a(str.charAt(i2)) << 4));
        }
        return new C2468pa(bArr);
    }

    public static C2468pa t(String str) {
        AbstractC1474fG.j(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC1305dd.a);
        AbstractC1474fG.i(bytes, "this as java.lang.String).getBytes(charset)");
        C2468pa c2468pa = new C2468pa(bytes);
        c2468pa.n = str;
        return c2468pa;
    }

    public static int v(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    public static C2468pa y(byte[] bArr) {
        C2468pa c2468pa = C2468pa.f972o;
        int length = bArr.length;
        AbstractC2506pt.j(bArr.length, 0, length);
        return new C2468pa(X5.M(bArr, 0, length));
    }

    public static long z(File file) {
        Object objK;
        long length;
        try {
            if (file.isFile()) {
                length = file.length();
            } else {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    long jZ = 0;
                    for (File file2 : fileArrListFiles) {
                        jZ += z(file2);
                    }
                    length = jZ;
                } else {
                    length = 0;
                }
            }
            objK = Long.valueOf(length);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = 0L;
        }
        return ((Number) objK).longValue();
    }

    @Override // o.InterfaceC1916jq
    public boolean K(Object obj, File file, FW fw) throws Throwable {
        try {
            AbstractC2274na.d((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }

    @Override // o.InterfaceC1201ca
    public Class b() {
        return ByteBuffer.class;
    }

    @Override // o.UJ
    public void c(InterfaceC1088bK interfaceC1088bK) {
        interfaceC1088bK.j();
    }

    @Override // o.JO
    public List d(String str, boolean z2, boolean z3) {
        AbstractC1474fG.j(str, "mimeType");
        List listE = OO.e(str, z2, z3);
        AbstractC1474fG.i(listE, "getDecoderInfos(...)");
        if (Build.VERSION.SDK_INT <= 22) {
            AbstractC0911Ye.h0(listE, null, null, null, C1182cH.q, 31);
        }
        return listE;
    }

    @Override // o.InterfaceC2339o7
    public C1951k70 e(K80 k80, C1855j80 c1855j80) {
        AbstractC1474fG.j(c1855j80, "response");
        return null;
    }

    @Override // o.InterfaceC3284xu0
    public Kw0 h(View view, Kw0 kw0, YK yk) {
        yk.d = kw0.a() + yk.d;
        WeakHashMap weakHashMap = It0.a;
        boolean z2 = view.getLayoutDirection() == 1;
        int iB = kw0.b();
        int iC = kw0.c();
        int i = yk.a + (z2 ? iC : iB);
        yk.a = i;
        int i2 = yk.c;
        if (!z2) {
            iB = iC;
        }
        int i3 = i2 + iB;
        yk.c = i3;
        view.setPaddingRelative(i, yk.b, i3, yk.d);
        return kw0;
    }

    @Override // o.InterfaceC1201ca
    public Object i(byte[] bArr) {
        return ByteBuffer.wrap(bArr);
    }

    @Override // o.InterfaceC0602Mh
    public Object l(Object obj) throws IOException {
        switch (this.l) {
            case 2:
                return (AbstractC2340o70) obj;
            case 3:
                ((AbstractC2051l80) obj).close();
                return C2985uq0.a;
            case 13:
                return Boolean.valueOf(((AbstractC2051l80) obj).q());
            case 14:
                String strQ = ((AbstractC2051l80) obj).q();
                if (strQ.length() == 1) {
                    return Character.valueOf(strQ.charAt(0));
                }
                throw new IOException("Expected body of length 1 for Character conversion but was " + strQ.length());
            case 15:
                return Float.valueOf(((AbstractC2051l80) obj).q());
            case 16:
                return Long.valueOf(((AbstractC2051l80) obj).q());
            default:
                return ((AbstractC2051l80) obj).q();
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    public int m(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            C2149m9 c2149m9 = Gi0.a;
            if (directionality == 0) {
                i2 = 1;
            } else if (directionality != 1 && directionality != 2) {
                switch (directionality) {
                    case 14:
                    case 15:
                        i2 = 1;
                        break;
                    case 16:
                    case 17:
                        i2 = 0;
                        break;
                    default:
                        i2 = 2;
                        break;
                }
            } else {
                i2 = 0;
            }
        }
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(Context context, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        C3397z3 c3397z3;
        Context applicationContext;
        long j;
        if (interfaceC0473Hh instanceof C3397z3) {
            c3397z3 = (C3397z3) interfaceC0473Hh;
            int i = c3397z3.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3397z3.p = i - Integer.MIN_VALUE;
            } else {
                c3397z3 = new C3397z3(this, interfaceC0473Hh);
            }
        } else {
            c3397z3 = new C3397z3(this, interfaceC0473Hh);
        }
        Object objJ = c3397z3.n;
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        int i2 = c3397z3.p;
        if (i2 != 0) {
            if (i2 == 1) {
                applicationContext = c3397z3.l;
                Jp0.O(objJ);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c3397z3.m;
                Jp0.O(objJ);
            }
            return new Long(j);
        }
        Jp0.O(objJ);
        applicationContext = context.getApplicationContext();
        ExecutorC0891Xk executorC0891Xk = AbstractC1910jn.b;
        B3 b3 = new B3(applicationContext, null);
        c3397z3.l = applicationContext;
        c3397z3.p = 1;
        objJ = AbstractC1376eG.J(executorC0891Xk, b3, c3397z3);
        if (objJ == enumC1706hi) {
            return enumC1706hi;
        }
        long jLongValue = ((Number) objJ).longValue();
        C3362yl c3362yl = AbstractC1910jn.a;
        EM em = FM.a;
        A3 a3 = new A3(applicationContext, null);
        c3397z3.l = null;
        c3397z3.m = jLongValue;
        c3397z3.p = 2;
        if (AbstractC1376eG.J(em, a3, c3397z3) == enumC1706hi) {
            return enumC1706hi;
        }
        j = jLongValue;
        return new Long(j);
    }

    public synchronized void o() {
        C2133m1 c2133m1;
        try {
            OV ov = t;
            if (ov != null && (c2133m1 = ov.m) != null) {
                c2133m1.Q();
            }
            t = null;
            C3084vr0 c3084vr0 = C3084vr0.a;
            C3084vr0.u = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public InterfaceC1920js[] q(C1823is[] c1823isArr, N7 n7) {
        InterfaceC1920js c0964a2;
        M60 m60V = C0964a2.v(c1823isArr);
        InterfaceC1920js[] interfaceC1920jsArr = new InterfaceC1920js[c1823isArr.length];
        for (int i = 0; i < c1823isArr.length; i++) {
            C1823is c1823is = c1823isArr[i];
            if (c1823is != null) {
                int[] iArr = c1823is.b;
                if (iArr.length != 0) {
                    if (iArr.length == 1) {
                        int i2 = iArr[0];
                        int i3 = c1823is.c;
                        c0964a2 = new C2510pv(c1823is.a, new int[]{i2});
                    } else {
                        long j = 25000;
                        c0964a2 = new C0964a2(c1823is.a, iArr, c1823is.c, n7, 10000, j, j, 1279, 719, 0.7f, 0.75f, (AbstractC0985aF) m60V.get(i), Sh0.a);
                    }
                    interfaceC1920jsArr[i] = c0964a2;
                }
            }
        }
        return interfaceC1920jsArr;
    }

    @Override // o.InterfaceC2555qQ
    public boolean u(ZP zp) {
        return false;
    }

    public void w(Throwable th) {
        Log.isLoggable("GlideExecutor", 6);
    }

    public C2691rp(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1891jd0 c1891jd0, Rect rect) {
        this.l = 29;
        Jp0.g(rect.left);
        Jp0.g(rect.top);
        Jp0.g(rect.right);
        Jp0.g(rect.bottom);
    }

    @Override // o.I8
    public long f(long j) {
        return j;
    }

    @Override // o.UJ
    public void j(InterfaceC1088bK interfaceC1088bK) {
    }

    @Override // o.InterfaceC2555qQ
    public void a(ZP zp, boolean z2) {
    }

    @Override // o.Z70
    public M70 g(M70 m70, FW fw) {
        return m70;
    }
}
