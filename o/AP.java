package o;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import java.io.BufferedReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class AP {
    public static final J2 a = new J2(10, "RESUME_TOKEN", false);
    public static final Object b = new Object();
    public static final C2743sL c = new C2743sL(13);

    public static void A(String str, Throwable th) {
        a(str, th);
        z();
    }

    public static String a(String str, Throwable th) {
        String strReplace;
        synchronized (b) {
            try {
                if (th != null) {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    }
                } else {
                    strReplace = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbS = AbstractC1674hK.s(str, "\n  ");
        sbS.append(strReplace.replace("\n", "\n  "));
        sbS.append('\n');
        return sbS.toString();
    }

    public static void c() {
        synchronized (b) {
        }
    }

    public static void f() {
        synchronized (b) {
        }
    }

    public static void g(String str, Throwable th) {
        a(str, th);
        f();
    }

    public static InvocationHandler h() {
        ClassLoader classLoader;
        if (Build.VERSION.SDK_INT >= 28) {
            classLoader = WebView.getWebViewClassLoader();
        } else {
            try {
                Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                declaredMethod.setAccessible(true);
                classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null);
    }

    public static SimpleDateFormat i(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC1674hK.n(i, "Unknown DateFormat style: "));
            }
            str = "M/d/yy";
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i2 != 3) {
                throw new IllegalArgumentException(AbstractC1674hK.n(i2, "Unknown DateFormat style: "));
            }
            str2 = "h:mm a";
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static void j() {
        synchronized (b) {
        }
    }

    public static final boolean k(int i) {
        return i == 1 || i == 2;
    }

    public static String l(C2446pE c2446pE) {
        AbstractC1474fG.j(c2446pE, "url");
        C2468pa c2468pa = C2468pa.f972o;
        return C2691rp.t(c2446pE.i).c("MD5").e();
    }

    public static CJ m(IJ ij, InterfaceC0360Cy interfaceC0360Cy) {
        int iOrdinal = ij.ordinal();
        if (iOrdinal == 0) {
            return new Rh0(interfaceC0360Cy);
        }
        O9 o9 = O9.F;
        if (iOrdinal == 1) {
            C3216x90 c3216x90 = new C3216x90();
            c3216x90.l = interfaceC0360Cy;
            c3216x90.m = o9;
            return c3216x90;
        }
        if (iOrdinal != 2) {
            throw new C0730Rf();
        }
        Kq0 kq0 = new Kq0();
        kq0.l = interfaceC0360Cy;
        kq0.m = o9;
        return kq0;
    }

    public static int n(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(AbstractC1674hK.m(i3, i, "PROTOCOL_ERROR padding ", " > remaining length "));
    }

    public static String o(String str) {
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static String p(String str) {
        return o(str).trim();
    }

    public static FQ s(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i = byteBufferDuplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j - ((long) byteBufferDuplicate.position()))));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j2 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = byteBufferDuplicate.getInt();
                long j3 = ((long) byteBufferDuplicate.getInt()) & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    byteBufferDuplicate.position((int) (j3 + j));
                    FQ fq = new FQ();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    fq.f969o = byteBufferDuplicate;
                    fq.l = iPosition;
                    int i6 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    fq.m = i6;
                    fq.n = ((ByteBuffer) fq.f969o).getShort(i6);
                    return fq;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static int t(C3111w50 c3111w50) throws IOException {
        try {
            long jF = c3111w50.f();
            String strI = c3111w50.I(Long.MAX_VALUE);
            if (jF >= 0 && jF <= C1707hi0.a && strI.length() <= 0) {
                return (int) jF;
            }
            throw new IOException("expected an int but was \"" + jF + strI + '\"');
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public static final ArrayList u(BufferedReader bufferedReader) {
        ArrayList arrayList = new ArrayList();
        try {
            Rb0 y5 = new Y5(2, bufferedReader);
            if (!(y5 instanceof C0368Dg)) {
                y5 = new C0368Dg(y5);
            }
            for (String str : (C0368Dg) y5) {
                AbstractC1474fG.j(str, "it");
                arrayList.add(str);
            }
            AbstractC3409z9.g(bufferedReader, null);
            return arrayList;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3409z9.g(bufferedReader, th);
                throw th2;
            }
        }
    }

    public static final Object v(Object obj) {
        return obj instanceof C0678Pf ? Jp0.k(((C0678Pf) obj).a) : obj;
    }

    public static final void w(AbstractC1716hn abstractC1716hn, InterfaceC0473Hh interfaceC0473Hh, boolean z) {
        Object objN = abstractC1716hn.n();
        Throwable thF = abstractC1716hn.f(objN);
        Object objK = thF != null ? Jp0.k(thF) : abstractC1716hn.i(objN);
        if (!z) {
            interfaceC0473Hh.j(objK);
            return;
        }
        AbstractC1474fG.h(interfaceC0473Hh, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C1520fn c1520fn = (C1520fn) interfaceC0473Hh;
        InterfaceC0473Hh interfaceC0473Hh2 = c1520fn.p;
        InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh2.g();
        Object objI = Ou0.I(interfaceC1022aiG, c1520fn.r);
        C2791sq0 c2791sq0K = objI != Ou0.f ? AbstractC1923jt0.K(interfaceC0473Hh2, interfaceC1022aiG, objI) : null;
        try {
            interfaceC0473Hh2.j(objK);
        } finally {
            if (c2791sq0K == null || c2791sq0K.l0()) {
                Ou0.y(interfaceC1022aiG, objI);
            }
        }
    }

    public static final Object x(R90 r90, R90 r91, InterfaceC0775Sy interfaceC0775Sy) throws Throwable {
        Object c0678Pf;
        Object objY;
        try {
            Jp0.d(2, interfaceC0775Sy);
            c0678Pf = interfaceC0775Sy.i(r91, r90);
        } catch (Throwable th) {
            c0678Pf = new C0678Pf(th, false);
        }
        EnumC1706hi enumC1706hi = EnumC1706hi.l;
        if (c0678Pf == enumC1706hi || (objY = r90.Y(c0678Pf)) == AbstractC1376eG.c) {
            return enumC1706hi;
        }
        if (objY instanceof C0678Pf) {
            throw ((C0678Pf) objY).a;
        }
        return AbstractC1376eG.I(objY);
    }

    public static Set y(C2152mB c2152mB) {
        int size = c2152mB.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if (AbstractC1899jh0.N("Vary", c2152mB.d(i), true)) {
                String strH = c2152mB.h(i);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    AbstractC1474fG.i(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = AbstractC1119bh0.s0(strH, new char[]{','}, 0, 6).iterator();
                while (it.hasNext()) {
                    treeSet.add(AbstractC1119bh0.E0((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? C1722hq.l : treeSet;
    }

    public static void z() {
        synchronized (b) {
        }
    }

    public void b(int i) {
        new Handler(Looper.getMainLooper()).post(new R6(i, 1, this));
    }

    public CQ d(DQ dq) {
        ByteBuffer byteBuffer = dq.f439o;
        byteBuffer.getClass();
        AbstractC0397Ej.c(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (dq.j(Integer.MIN_VALUE)) {
            return null;
        }
        return e(dq, byteBuffer);
    }

    public abstract CQ e(DQ dq, ByteBuffer byteBuffer);

    public abstract void q(int i);

    public abstract void r(Typeface typeface);
}
