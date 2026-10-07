package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import android.util.Xml;
import android.view.ViewGroup;
import android.widget.EditText;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.zip.ZipException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class Ou0 {
    public static final C3213x8 a = new C3213x8();
    public static final byte[] b = {0, 0, 0, 1};
    public static final float[] c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object d = new Object();
    public static int[] e = new int[10];
    public static final J2 f = new J2(10, "NO_THREAD_ELEMENTS", false);
    public static long g = 0;
    public static Method h = null;
    public static boolean i = true;

    public static void A(XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public static void B(int i2, C0731Rg c0731Rg, K30 k30, boolean z) {
        float f2 = c0731Rg.d0;
        C0394Eg c0394Eg = c0731Rg.I;
        int iD = c0394Eg.f.d();
        C0394Eg c0394Eg2 = c0731Rg.K;
        int iD2 = c0394Eg2.f.d();
        int iE = c0394Eg.e() + iD;
        int iE2 = iD2 - c0394Eg2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = c0731Rg.q();
        int i3 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i3 = (iD - iD2) - iQ;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3)) + iD;
        int i5 = i4 + iQ;
        if (iD > iD2) {
            i5 = i4 - iQ;
        }
        c0731Rg.J(i4, i5);
        o(i2 + 1, c0731Rg, k30, z);
    }

    public static void C(int i2, C0731Rg c0731Rg, K30 k30, C0731Rg c0731Rg2, boolean z) {
        float f2 = c0731Rg2.d0;
        C0394Eg c0394Eg = c0731Rg2.I;
        int iE = c0394Eg.e() + c0394Eg.f.d();
        C0394Eg c0394Eg2 = c0731Rg2.K;
        int iD = c0394Eg2.f.d() - c0394Eg2.e();
        if (iD >= iE) {
            int iQ = c0731Rg2.q();
            if (c0731Rg2.g0 != 8) {
                int i3 = c0731Rg2.r;
                if (i3 == 2) {
                    iQ = (int) (c0731Rg2.d0 * 0.5f * (c0731Rg instanceof C0757Sg ? c0731Rg.q() : c0731Rg.T.q()));
                } else if (i3 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(c0731Rg2.u, iQ);
                int i4 = c0731Rg2.v;
                if (i4 > 0) {
                    iQ = Math.min(i4, iQ);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iQ)) + 0.5f));
            c0731Rg2.J(i5, iQ + i5);
            o(i2 + 1, c0731Rg2, k30, z);
        }
    }

    public static void D(int i2, C0731Rg c0731Rg, K30 k30) {
        float f2 = c0731Rg.e0;
        C0394Eg c0394Eg = c0731Rg.J;
        int iD = c0394Eg.f.d();
        C0394Eg c0394Eg2 = c0731Rg.L;
        int iD2 = c0394Eg2.f.d();
        int iE = c0394Eg.e() + iD;
        int iE2 = iD2 - c0394Eg2.e();
        if (iD == iD2) {
            f2 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = c0731Rg.k();
        int i3 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i3 = (iD - iD2) - iK;
        }
        int i4 = (int) (i3 > 0 ? (f2 * i3) + 0.5f : f2 * i3);
        int i5 = iD + i4;
        int i6 = i5 + iK;
        if (iD > iD2) {
            i5 = iD - i4;
            i6 = i5 - iK;
        }
        c0731Rg.K(i5, i6);
        J(i2 + 1, c0731Rg, k30);
    }

    public static void E(int i2, C0731Rg c0731Rg, K30 k30, C0731Rg c0731Rg2) {
        float f2 = c0731Rg2.e0;
        C0394Eg c0394Eg = c0731Rg2.J;
        int iE = c0394Eg.e() + c0394Eg.f.d();
        C0394Eg c0394Eg2 = c0731Rg2.L;
        int iD = c0394Eg2.f.d() - c0394Eg2.e();
        if (iD >= iE) {
            int iK = c0731Rg2.k();
            if (c0731Rg2.g0 != 8) {
                int i3 = c0731Rg2.s;
                if (i3 == 2) {
                    iK = (int) (f2 * 0.5f * (c0731Rg instanceof C0757Sg ? c0731Rg.k() : c0731Rg.T.k()));
                } else if (i3 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(c0731Rg2.x, iK);
                int i4 = c0731Rg2.y;
                if (i4 > 0) {
                    iK = Math.min(i4, iK);
                }
            }
            int i5 = iE + ((int) ((f2 * ((iD - iE) - iK)) + 0.5f));
            c0731Rg2.K(i5, iK + i5);
            J(i2 + 1, c0731Rg2, k30);
        }
    }

    public static void F(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            Pt0.b(viewGroup, z);
        } else if (i) {
            try {
                Pt0.b(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                i = false;
            }
        }
    }

    public static final Object G(InterfaceC1022ai interfaceC1022ai) {
        Object objL = interfaceC1022ai.l(0, C2478pf.s);
        AbstractC1474fG.g(objL);
        return objL;
    }

    public static int H(int i2, byte[] bArr) {
        int i3;
        synchronized (d) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = e;
                    if (iArr.length <= i5) {
                        e = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    e[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = e[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static final Object I(InterfaceC1022ai interfaceC1022ai, Object obj) {
        if (obj == null) {
            obj = G(interfaceC1022ai);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return interfaceC1022ai.l(new C1611gj0(((Number) obj).intValue(), interfaceC1022ai), C2478pf.u);
        }
        AbstractC1674hK.w(obj);
        throw null;
    }

    public static void J(int i2, C0731Rg c0731Rg, K30 k30) {
        C0394Eg c0394Eg;
        C0394Eg c0394Eg2;
        C0394Eg c0394Eg3;
        C0394Eg c0394Eg4;
        C0394Eg c0394Eg5;
        if (c0731Rg.n) {
            return;
        }
        if (!(c0731Rg instanceof C0757Sg) && c0731Rg.z() && b(c0731Rg)) {
            C0757Sg.V(c0731Rg, k30, new C3213x8());
        }
        C0394Eg c0394EgI = c0731Rg.i(3);
        C0394Eg c0394EgI2 = c0731Rg.i(5);
        int iD = c0394EgI.d();
        int iD2 = c0394EgI2.d();
        HashSet<C0394Eg> hashSet = c0394EgI.a;
        if (hashSet != null && c0394EgI.c) {
            for (C0394Eg c0394Eg6 : hashSet) {
                C0731Rg c0731Rg2 = c0394Eg6.d;
                int i3 = i2 + 1;
                boolean zB = b(c0731Rg2);
                if (c0731Rg2.z() && zB) {
                    C0757Sg.V(c0731Rg2, k30, new C3213x8());
                }
                C0394Eg c0394Eg7 = c0731Rg2.J;
                C0394Eg c0394Eg8 = c0731Rg2.L;
                boolean z = (c0394Eg6 == c0394Eg7 && (c0394Eg5 = c0394Eg8.f) != null && c0394Eg5.c) || (c0394Eg6 == c0394Eg8 && (c0394Eg4 = c0394Eg7.f) != null && c0394Eg4.c);
                int i4 = c0731Rg2.p0[1];
                if (i4 != 3 || zB) {
                    if (!c0731Rg2.z()) {
                        if (c0394Eg6 == c0394Eg7 && c0394Eg8.f == null) {
                            int iE = c0394Eg7.e() + iD;
                            c0731Rg2.K(iE, c0731Rg2.k() + iE);
                            J(i3, c0731Rg2, k30);
                        } else if (c0394Eg6 == c0394Eg8 && c0394Eg7.f == null) {
                            int iE2 = iD - c0394Eg8.e();
                            c0731Rg2.K(iE2 - c0731Rg2.k(), iE2);
                            J(i3, c0731Rg2, k30);
                        } else if (z && !c0731Rg2.y()) {
                            D(i3, c0731Rg2, k30);
                        }
                    }
                } else if (i4 == 3 && c0731Rg2.y >= 0 && c0731Rg2.x >= 0 && (c0731Rg2.g0 == 8 || (c0731Rg2.s == 0 && c0731Rg2.W == 0.0f))) {
                    if (!c0731Rg2.y() && !c0731Rg2.F && z && !c0731Rg2.y()) {
                        E(i3, c0731Rg, k30, c0731Rg2);
                    }
                }
            }
        }
        if (c0731Rg instanceof HA) {
            return;
        }
        HashSet<C0394Eg> hashSet2 = c0394EgI2.a;
        if (hashSet2 != null && c0394EgI2.c) {
            for (C0394Eg c0394Eg9 : hashSet2) {
                C0731Rg c0731Rg3 = c0394Eg9.d;
                int i5 = i2 + 1;
                boolean zB2 = b(c0731Rg3);
                if (c0731Rg3.z() && zB2) {
                    C0757Sg.V(c0731Rg3, k30, new C3213x8());
                }
                C0394Eg c0394Eg10 = c0731Rg3.J;
                C0394Eg c0394Eg11 = c0731Rg3.L;
                boolean z2 = (c0394Eg9 == c0394Eg10 && (c0394Eg3 = c0394Eg11.f) != null && c0394Eg3.c) || (c0394Eg9 == c0394Eg11 && (c0394Eg2 = c0394Eg10.f) != null && c0394Eg2.c);
                int i6 = c0731Rg3.p0[1];
                if (i6 != 3 || zB2) {
                    if (!c0731Rg3.z()) {
                        if (c0394Eg9 == c0394Eg10 && c0394Eg11.f == null) {
                            int iE3 = c0394Eg10.e() + iD2;
                            c0731Rg3.K(iE3, c0731Rg3.k() + iE3);
                            J(i5, c0731Rg3, k30);
                        } else if (c0394Eg9 == c0394Eg11 && c0394Eg10.f == null) {
                            int iE4 = iD2 - c0394Eg11.e();
                            c0731Rg3.K(iE4 - c0731Rg3.k(), iE4);
                            J(i5, c0731Rg3, k30);
                        } else if (z2 && !c0731Rg3.y()) {
                            D(i5, c0731Rg3, k30);
                        }
                    }
                } else if (i6 == 3 && c0731Rg3.y >= 0 && c0731Rg3.x >= 0) {
                    if (c0731Rg3.g0 != 8) {
                        if (c0731Rg3.s == 0) {
                            if (c0731Rg3.W == 0.0f) {
                            }
                        }
                    }
                    if (!c0731Rg3.y() && !c0731Rg3.F && z2 && !c0731Rg3.y()) {
                        E(i5, c0731Rg, k30, c0731Rg3);
                    }
                }
            }
        }
        C0394Eg c0394EgI3 = c0731Rg.i(6);
        if (c0394EgI3.a != null && c0394EgI3.c) {
            int iD3 = c0394EgI3.d();
            for (C0394Eg c0394Eg12 : c0394EgI3.a) {
                C0731Rg c0731Rg4 = c0394Eg12.d;
                int i7 = i2 + 1;
                boolean zB3 = b(c0731Rg4);
                if (c0731Rg4.z() && zB3) {
                    C0757Sg.V(c0731Rg4, k30, new C3213x8());
                }
                if (c0731Rg4.p0[1] != 3 || zB3) {
                    if (!c0731Rg4.z() && c0394Eg12 == (c0394Eg = c0731Rg4.M)) {
                        int iE5 = c0394Eg12.e() + iD3;
                        if (c0731Rg4.E) {
                            int i8 = iE5 - c0731Rg4.a0;
                            int i9 = c0731Rg4.V + i8;
                            c0731Rg4.Z = i8;
                            c0731Rg4.J.l(i8);
                            c0731Rg4.L.l(i9);
                            c0394Eg.l(iE5);
                            c0731Rg4.l = true;
                        }
                        J(i7, c0731Rg4, k30);
                    }
                }
            }
        }
        c0731Rg.n = true;
    }

    public static ArrayList a(byte[] bArr) {
        long j = (((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static boolean b(C0731Rg c0731Rg) {
        int[] iArr = c0731Rg.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        C0731Rg c0731Rg2 = c0731Rg.T;
        C0757Sg c0757Sg = c0731Rg2 != null ? (C0757Sg) c0731Rg2 : null;
        if (c0757Sg != null) {
            int i4 = c0757Sg.p0[0];
        }
        if (c0757Sg != null) {
            int i5 = c0757Sg.p0[1];
        }
        boolean z = i2 == 1 || c0731Rg.A() || i2 == 2 || (i2 == 3 && c0731Rg.r == 0 && c0731Rg.W == 0.0f && c0731Rg.t(0)) || (i2 == 3 && c0731Rg.r == 1 && c0731Rg.u(0, c0731Rg.q()));
        boolean z2 = i3 == 1 || c0731Rg.B() || i3 == 2 || (i3 == 3 && c0731Rg.s == 0 && c0731Rg.W == 0.0f && c0731Rg.t(1)) || (i3 == 3 && c0731Rg.s == 1 && c0731Rg.u(1, c0731Rg.k()));
        if (c0731Rg.W <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    public static int c(int i2) {
        if (i2 < 3) {
            U9.d(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static void d(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static InterfaceC0473Hh e(Object obj, InterfaceC0473Hh interfaceC0473Hh, InterfaceC0775Sy interfaceC0775Sy) {
        AbstractC1474fG.j(interfaceC0775Sy, "<this>");
        AbstractC1474fG.j(interfaceC0473Hh, "completion");
        if (interfaceC0775Sy instanceof R7) {
            return ((R7) interfaceC0775Sy).o(obj, interfaceC0473Hh);
        }
        InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh.g();
        return interfaceC1022aiG == C1038aq.l ? new C1572gG(obj, interfaceC0473Hh, interfaceC0775Sy) : new C1670hG(interfaceC0473Hh, interfaceC1022aiG, interfaceC0775Sy, obj);
    }

    public static E90 f(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new E90();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                AbstractC1474fG.i(str, "key");
                map.put(str, bundle2.get(str));
            }
            return new E90(map);
        }
        ClassLoader classLoader = E90.class.getClassLoader();
        AbstractC1474fG.g(classLoader);
        bundle.setClassLoader(classLoader);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state".toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = parcelableArrayList.get(i2);
            AbstractC1474fG.h(obj, "null cannot be cast to non-null type kotlin.String");
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i2));
        }
        return new E90(linkedHashMap);
    }

    public static boolean g(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static uy0 h(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                uy0 uy0Var = new uy0();
                uy0Var.b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                uy0Var.a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return uy0Var;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    public static int i(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        AbstractC0397Ej.f(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            d(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            d(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            d(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    d(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        zArr[0] = i4 <= 2 ? !(i4 != 2 ? !(zArr[1] && bArr[i5] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i5] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i5] == 1;
        zArr[1] = i4 <= 1 ? zArr[2] && bArr[i5] == 0 : bArr[i3 + (-2)] == 0 && bArr[i5] == 0;
        zArr[2] = bArr[i5] == 0;
        return i3;
    }

    public static TT j(WT wt) {
        AbstractC1474fG.j(wt, "<this>");
        Iterator it = Vb0.K(wt, C1182cH.A).iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return (TT) next;
    }

    public static O30 k(String str) throws IOException {
        if (AbstractC1474fG.b(str, "http/1.0")) {
            return O30.HTTP_1_0;
        }
        if (AbstractC1474fG.b(str, "http/1.1")) {
            return O30.HTTP_1_1;
        }
        if (AbstractC1474fG.b(str, "h2_prior_knowledge")) {
            return O30.H2_PRIOR_KNOWLEDGE;
        }
        if (AbstractC1474fG.b(str, "h2")) {
            return O30.HTTP_2;
        }
        if (AbstractC1474fG.b(str, "spdy/3.1")) {
            return O30.SPDY_3;
        }
        if (AbstractC1474fG.b(str, "quic")) {
            return O30.QUIC;
        }
        throw new IOException("Unexpected protocol: ".concat(str));
    }

    public static Drawable l(Context context, int i2) {
        return Y70.d().f(context, i2);
    }

    public static long m(byte b2, byte b3) {
        int i2;
        int i3;
        int i4 = b2 & 255;
        int i5 = b2 & 3;
        if (i5 != 0) {
            i2 = 2;
            if (i5 != 1 && i5 != 2) {
                i2 = b3 & 63;
            }
        } else {
            i2 = 1;
        }
        int i6 = i4 >> 3;
        int i7 = i6 & 3;
        if (i6 >= 16) {
            i3 = 2500 << i7;
        } else if (i6 >= 12) {
            i3 = 10000 << (i6 & 1);
        } else {
            i3 = i7 == 3 ? 60000 : 10000 << i7;
        }
        return ((long) i2) * ((long) i3);
    }

    public static final void n(InterfaceC1022ai interfaceC1022ai, Throwable th) {
        Throwable runtimeException;
        Iterator it = AbstractC1315di.a.iterator();
        while (it.hasNext()) {
            try {
                ((C2) ((CoroutineExceptionHandler) it.next())).W(interfaceC1022ai, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC3409z9.a(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            AbstractC3409z9.a(th, new C3170wm(interfaceC1022ai));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static void o(int i2, C0731Rg c0731Rg, K30 k30, boolean z) {
        C0394Eg c0394Eg;
        C0394Eg c0394Eg2;
        C0394Eg c0394Eg3;
        C0394Eg c0394Eg4;
        if (c0731Rg.m) {
            return;
        }
        if (!(c0731Rg instanceof C0757Sg) && c0731Rg.z() && b(c0731Rg)) {
            C0757Sg.V(c0731Rg, k30, new C3213x8());
        }
        C0394Eg c0394EgI = c0731Rg.i(2);
        C0394Eg c0394EgI2 = c0731Rg.i(4);
        int iD = c0394EgI.d();
        int iD2 = c0394EgI2.d();
        HashSet<C0394Eg> hashSet = c0394EgI.a;
        char c2 = 0;
        if (hashSet != null && c0394EgI.c) {
            for (C0394Eg c0394Eg5 : hashSet) {
                C0731Rg c0731Rg2 = c0394Eg5.d;
                int i3 = i2 + 1;
                boolean zB = b(c0731Rg2);
                if (c0731Rg2.z() && zB) {
                    C0757Sg.V(c0731Rg2, k30, new C3213x8());
                }
                C0394Eg c0394Eg6 = c0731Rg2.I;
                C0394Eg c0394Eg7 = c0731Rg2.K;
                boolean z2 = (c0394Eg5 == c0394Eg6 && (c0394Eg4 = c0394Eg7.f) != null && c0394Eg4.c) || (c0394Eg5 == c0394Eg7 && (c0394Eg3 = c0394Eg6.f) != null && c0394Eg3.c);
                int i4 = c0731Rg2.p0[c2];
                if (i4 != 3 || zB) {
                    if (!c0731Rg2.z()) {
                        if (c0394Eg5 == c0394Eg6 && c0394Eg7.f == null) {
                            int iE = c0394Eg6.e() + iD;
                            c0731Rg2.J(iE, c0731Rg2.q() + iE);
                            o(i3, c0731Rg2, k30, z);
                        } else if (c0394Eg5 == c0394Eg7 && c0394Eg6.f == null) {
                            int iE2 = iD - c0394Eg7.e();
                            c0731Rg2.J(iE2 - c0731Rg2.q(), iE2);
                            o(i3, c0731Rg2, k30, z);
                        } else if (z2 && !c0731Rg2.x()) {
                            B(i3, c0731Rg2, k30, z);
                        }
                    }
                } else if (i4 == 3 && c0731Rg2.v >= 0 && c0731Rg2.u >= 0 && ((c0731Rg2.g0 == 8 || (c0731Rg2.r == 0 && c0731Rg2.W == 0.0f)) && !c0731Rg2.x() && !c0731Rg2.F && z2 && !c0731Rg2.x())) {
                    C(i3, c0731Rg, k30, c0731Rg2, z);
                }
                c2 = 0;
            }
        }
        if (c0731Rg instanceof HA) {
            return;
        }
        HashSet<C0394Eg> hashSet2 = c0394EgI2.a;
        if (hashSet2 != null && c0394EgI2.c) {
            for (C0394Eg c0394Eg8 : hashSet2) {
                C0731Rg c0731Rg3 = c0394Eg8.d;
                int i5 = i2 + 1;
                boolean zB2 = b(c0731Rg3);
                if (c0731Rg3.z() && zB2) {
                    C0757Sg.V(c0731Rg3, k30, new C3213x8());
                }
                C0394Eg c0394Eg9 = c0731Rg3.I;
                C0394Eg c0394Eg10 = c0731Rg3.K;
                boolean z3 = (c0394Eg8 == c0394Eg9 && (c0394Eg2 = c0394Eg10.f) != null && c0394Eg2.c) || (c0394Eg8 == c0394Eg10 && (c0394Eg = c0394Eg9.f) != null && c0394Eg.c);
                int i6 = c0731Rg3.p0[0];
                if (i6 != 3 || zB2) {
                    if (!c0731Rg3.z()) {
                        if (c0394Eg8 == c0394Eg9 && c0394Eg10.f == null) {
                            int iE3 = c0394Eg9.e() + iD2;
                            c0731Rg3.J(iE3, c0731Rg3.q() + iE3);
                            o(i5, c0731Rg3, k30, z);
                        } else if (c0394Eg8 == c0394Eg10 && c0394Eg9.f == null) {
                            int iE4 = iD2 - c0394Eg10.e();
                            c0731Rg3.J(iE4 - c0731Rg3.q(), iE4);
                            o(i5, c0731Rg3, k30, z);
                        } else if (z3 && !c0731Rg3.x()) {
                            B(i5, c0731Rg3, k30, z);
                        }
                    }
                } else if (i6 == 3 && c0731Rg3.v >= 0 && c0731Rg3.u >= 0) {
                    if (c0731Rg3.g0 != 8) {
                        if (c0731Rg3.r == 0) {
                            if (c0731Rg3.W == 0.0f) {
                            }
                        }
                    }
                    if (!c0731Rg3.x() && !c0731Rg3.F && z3 && !c0731Rg3.x()) {
                        C(i5, c0731Rg, k30, c0731Rg3, z);
                    }
                }
            }
        }
        c0731Rg.m = true;
    }

    public static InterfaceC0473Hh p(InterfaceC0473Hh interfaceC0473Hh) {
        AbstractC1474fG.j(interfaceC0473Hh, "<this>");
        AbstractC0499Ih abstractC0499Ih = interfaceC0473Hh instanceof AbstractC0499Ih ? (AbstractC0499Ih) interfaceC0473Hh : null;
        return abstractC0499Ih != null ? abstractC0499Ih.v() : interfaceC0473Hh;
    }

    public static boolean q(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static boolean r() {
        try {
            if (h == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (h == null) {
                g = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                h = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) h.invoke(null, Long.valueOf(g))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static InterfaceC0384Dw s(XmlResourceParser xmlResourceParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        xmlResourceParser.require(2, null, "font-family");
        if (xmlResourceParser.getName().equals("font-family")) {
            TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), O40.b);
            String string = typedArrayObtainAttributes.getString(0);
            String string2 = typedArrayObtainAttributes.getString(4);
            String string3 = typedArrayObtainAttributes.getString(5);
            int resourceId = typedArrayObtainAttributes.getResourceId(1, 0);
            int integer = typedArrayObtainAttributes.getInteger(2, 1);
            int integer2 = typedArrayObtainAttributes.getInteger(3, 500);
            String string4 = typedArrayObtainAttributes.getString(6);
            typedArrayObtainAttributes.recycle();
            if (string != null && string2 != null && string3 != null) {
                while (xmlResourceParser.next() != 3) {
                    A(xmlResourceParser);
                }
                return new C0462Gw(new C0560Kq(string, string2, string3, x(resources, resourceId)), integer, integer2, string4);
            }
            ArrayList arrayList = new ArrayList();
            while (xmlResourceParser.next() != 3) {
                if (xmlResourceParser.getEventType() == 2) {
                    if (xmlResourceParser.getName().equals("font")) {
                        TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), O40.c);
                        int i2 = typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(8) ? 8 : 1, 400);
                        boolean z = 1 == typedArrayObtainAttributes2.getInt(typedArrayObtainAttributes2.hasValue(6) ? 6 : 2, 0);
                        int i3 = typedArrayObtainAttributes2.hasValue(9) ? 9 : 3;
                        String string5 = typedArrayObtainAttributes2.getString(typedArrayObtainAttributes2.hasValue(7) ? 7 : 4);
                        int i4 = typedArrayObtainAttributes2.getInt(i3, 0);
                        int i5 = typedArrayObtainAttributes2.hasValue(5) ? 5 : 0;
                        int resourceId2 = typedArrayObtainAttributes2.getResourceId(i5, 0);
                        String string6 = typedArrayObtainAttributes2.getString(i5);
                        typedArrayObtainAttributes2.recycle();
                        while (xmlResourceParser.next() != 3) {
                            A(xmlResourceParser);
                        }
                        arrayList.add(new C0436Fw(i2, i4, resourceId2, string6, string5, z));
                    } else {
                        A(xmlResourceParser);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                return new C0410Ew((C0436Fw[]) arrayList.toArray(new C0436Fw[0]));
            }
        } else {
            A(xmlResourceParser);
        }
        return null;
    }

    public static C2613qy t(String str) throws ProtocolException {
        int i2;
        String strSubstring;
        AbstractC1474fG.j(str, "statusLine");
        boolean zU = AbstractC1899jh0.U(str, "HTTP/1.", false);
        O30 o30 = O30.HTTP_1_0;
        if (zU) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt != 0) {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                o30 = O30.HTTP_1_1;
            }
        } else {
            if (!AbstractC1899jh0.U(str, "ICY ", false)) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            String strSubstring2 = str.substring(i2, i3);
            AbstractC1474fG.i(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
            int i4 = Integer.parseInt(strSubstring2);
            if (str.length() <= i3) {
                strSubstring = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                strSubstring = str.substring(i2 + 4);
                AbstractC1474fG.i(strSubstring, "this as java.lang.String).substring(startIndex)");
            }
            return new C2613qy(o30, i4, strSubstring, 12);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    /* JADX WARN: Code duplicated, block: B:173:0x0322  */
    /* JADX WARN: Code duplicated, block: B:176:0x0331  */
    public static C2558qT u(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        float f2;
        int i6;
        int iC;
        C2084lc c2084lc = new C2084lc(bArr, i2 + 2, i3);
        int i7 = 4;
        c2084lc.s(4);
        int i8 = c2084lc.i(3);
        c2084lc.r();
        int i9 = c2084lc.i(2);
        boolean zH = c2084lc.h();
        int i10 = c2084lc.i(5);
        int i11 = 0;
        for (int i12 = 0; i12 < 32; i12++) {
            if (c2084lc.h()) {
                i11 |= 1 << i12;
            }
        }
        int i13 = 6;
        int[] iArr = new int[6];
        for (int i14 = 0; i14 < 6; i14++) {
            iArr[i14] = c2084lc.i(8);
        }
        int i15 = c2084lc.i(8);
        int i16 = 0;
        for (int i17 = 0; i17 < i8; i17++) {
            if (c2084lc.h()) {
                i16 += 89;
            }
            if (c2084lc.h()) {
                i16 += 8;
            }
        }
        c2084lc.s(i16);
        if (i8 > 0) {
            c2084lc.s((8 - i8) * 2);
        }
        c2084lc.l();
        int iL = c2084lc.l();
        if (iL == 3) {
            c2084lc.r();
        }
        int iL2 = c2084lc.l();
        int iL3 = c2084lc.l();
        if (c2084lc.h()) {
            int iL4 = c2084lc.l();
            int iL5 = c2084lc.l();
            int iL6 = c2084lc.l();
            int iL7 = c2084lc.l();
            iL2 -= (iL4 + iL5) * ((iL == 1 || iL == 2) ? 2 : 1);
            iL3 -= (iL6 + iL7) * (iL == 1 ? 2 : 1);
        }
        int i18 = iL3;
        int i19 = iL2;
        c2084lc.l();
        c2084lc.l();
        int iL8 = c2084lc.l();
        for (int i20 = c2084lc.h() ? 0 : i8; i20 <= i8; i20++) {
            c2084lc.l();
            c2084lc.l();
            c2084lc.l();
        }
        c2084lc.l();
        c2084lc.l();
        c2084lc.l();
        c2084lc.l();
        c2084lc.l();
        c2084lc.l();
        if (c2084lc.h() && c2084lc.h()) {
            int i21 = 0;
            while (i21 < i7) {
                int i22 = 0;
                while (i22 < i13) {
                    if (c2084lc.h()) {
                        int iMin = Math.min(64, 1 << ((i21 << 1) + 4));
                        if (i21 > 1) {
                            c2084lc.m();
                        }
                        for (int i23 = 0; i23 < iMin; i23++) {
                            c2084lc.m();
                        }
                    } else {
                        c2084lc.l();
                    }
                    i22 += i21 == 3 ? 3 : 1;
                    i13 = 6;
                }
                i21++;
                i7 = 4;
                i13 = 6;
            }
        }
        c2084lc.s(2);
        if (c2084lc.h()) {
            c2084lc.s(8);
            c2084lc.l();
            c2084lc.l();
            c2084lc.r();
        }
        int iL9 = c2084lc.l();
        int i24 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int iB = -1;
        int i25 = -1;
        int i26 = -1;
        while (i24 < iL9) {
            if (i24 == 0 || !c2084lc.h()) {
                int iL10 = c2084lc.l();
                int iL11 = c2084lc.l();
                int[] iArr3 = new int[iL10];
                int i27 = 0;
                while (i27 < iL10) {
                    iArr3[i27] = (i27 > 0 ? iArr3[i27 - 1] : 0) - (c2084lc.l() + 1);
                    c2084lc.r();
                    i27++;
                }
                int[] iArr4 = new int[iL11];
                int i28 = 0;
                while (i28 < iL11) {
                    iArr4[i28] = c2084lc.l() + 1 + (i28 > 0 ? iArr4[i28 - 1] : 0);
                    c2084lc.r();
                    i28++;
                }
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
                i26 = iL10;
                i25 = iL11;
            } else {
                int i29 = i26 + i25;
                int iL12 = (1 - ((c2084lc.h() ? 1 : 0) * 2)) * (c2084lc.l() + 1);
                int i30 = i29 + 1;
                boolean[] zArr = new boolean[i30];
                for (int i31 = 0; i31 <= i29; i31++) {
                    if (c2084lc.h()) {
                        zArr[i31] = true;
                    } else {
                        zArr[i31] = c2084lc.h();
                    }
                }
                int[] iArr5 = new int[i30];
                int[] iArr6 = new int[i30];
                int i32 = 0;
                for (int i33 = i25 - 1; i33 >= 0; i33--) {
                    int i34 = iArrCopyOf[i33] + iL12;
                    if (i34 < 0 && zArr[i26 + i33]) {
                        iArr5[i32] = i34;
                        i32++;
                    }
                }
                if (iL12 < 0 && zArr[i29]) {
                    iArr5[i32] = iL12;
                    i32++;
                }
                int i35 = i32;
                for (int i36 = 0; i36 < i26; i36++) {
                    int i37 = iArr2[i36] + iL12;
                    if (i37 < 0 && zArr[i36]) {
                        iArr5[i35] = i37;
                        i35++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i35);
                int i38 = 0;
                for (int i39 = i26 - 1; i39 >= 0; i39--) {
                    int i40 = iArr2[i39] + iL12;
                    if (i40 > 0 && zArr[i39]) {
                        iArr6[i38] = i40;
                        i38++;
                    }
                }
                if (iL12 > 0 && zArr[i29]) {
                    iArr6[i38] = iL12;
                    i38++;
                }
                int i41 = i38;
                for (int i42 = 0; i42 < i25; i42++) {
                    int i43 = iArrCopyOf[i42] + iL12;
                    if (i43 > 0 && zArr[i26 + i42]) {
                        iArr6[i41] = i43;
                        i41++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i41);
                i26 = i35;
                i25 = i41;
                iArr2 = iArrCopyOf2;
            }
            i24++;
            iL9 = iL9;
            i15 = i15;
            iArr = iArr;
            i11 = i11;
            i10 = i10;
        }
        int i44 = i10;
        int i45 = i11;
        int[] iArr7 = iArr;
        int i46 = i15;
        if (c2084lc.h()) {
            int iL13 = c2084lc.l();
            for (int i47 = 0; i47 < iL13; i47++) {
                c2084lc.s(iL8 + 5);
            }
        }
        c2084lc.s(2);
        float f3 = 1.0f;
        if (c2084lc.h()) {
            if (c2084lc.h()) {
                int i48 = c2084lc.i(8);
                if (i48 == 255) {
                    int i49 = c2084lc.i(16);
                    int i50 = c2084lc.i(16);
                    if (i49 != 0 && i50 != 0) {
                        f3 = i49 / i50;
                    }
                } else if (i48 < 17) {
                    f3 = c[i48];
                } else {
                    AP.z();
                }
            }
            if (c2084lc.h()) {
                c2084lc.r();
            }
            if (c2084lc.h()) {
                c2084lc.s(3);
                i5 = c2084lc.h() ? 1 : 2;
                if (c2084lc.h()) {
                    int i51 = c2084lc.i(8);
                    int i52 = c2084lc.i(8);
                    c2084lc.s(8);
                    iB = C1602gf.b(i51);
                    iC = C1602gf.c(i52);
                }
                if (c2084lc.h()) {
                    c2084lc.l();
                    c2084lc.l();
                }
                c2084lc.r();
                if (c2084lc.h()) {
                    i18 *= 2;
                }
                f2 = f3;
                i4 = i18;
                i6 = iB;
                iB = iC;
            } else {
                i5 = -1;
            }
            iC = -1;
            if (c2084lc.h()) {
                c2084lc.l();
                c2084lc.l();
            }
            c2084lc.r();
            if (c2084lc.h()) {
                i18 *= 2;
            }
            f2 = f3;
            i4 = i18;
            i6 = iB;
            iB = iC;
        } else {
            i4 = i18;
            i5 = -1;
            f2 = 1.0f;
            i6 = -1;
        }
        return new C2558qT(i9, zH, i44, i45, iArr7, i46, i19, i4, f2, i6, i5, iB);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x018f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0196  */
    /* JADX WARN: Code duplicated, block: B:106:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:110:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:66:0x0104  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x011a  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0121  */
    /* JADX WARN: Code duplicated, block: B:74:0x0126  */
    /* JADX WARN: Code duplicated, block: B:75:0x0128  */
    /* JADX WARN: Code duplicated, block: B:79:0x013c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0146  */
    /* JADX WARN: Code duplicated, block: B:84:0x014c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0156  */
    /* JADX WARN: Code duplicated, block: B:90:0x0169  */
    /* JADX WARN: Code duplicated, block: B:92:0x016d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0172  */
    /* JADX WARN: Code duplicated, block: B:96:0x017b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0184  */
    public static C2751sT v(byte[] bArr, int i2, int i3) {
        int iL;
        boolean zH;
        int iL2;
        boolean z;
        boolean zH2;
        int i4;
        int i5;
        int i6;
        int i7;
        float f2;
        float f3;
        int i8;
        int i9;
        int iC;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        C2084lc c2084lc = new C2084lc(bArr, i2 + 1, i3);
        int i17 = c2084lc.i(8);
        int i18 = c2084lc.i(8);
        int i19 = c2084lc.i(8);
        int iL3 = c2084lc.l();
        if (i17 == 100 || i17 == 110 || i17 == 122 || i17 == 244 || i17 == 44 || i17 == 83 || i17 == 86 || i17 == 118 || i17 == 128 || i17 == 138) {
            iL = c2084lc.l();
            zH = iL == 3 ? c2084lc.h() : false;
            c2084lc.l();
            c2084lc.l();
            c2084lc.r();
            if (c2084lc.h()) {
                int i20 = iL != 3 ? 8 : 12;
                int i21 = 0;
                while (i21 < i20) {
                    if (c2084lc.h()) {
                        int i22 = i21 < 6 ? 16 : 64;
                        int iM = 8;
                        int i23 = 8;
                        for (int i24 = 0; i24 < i22; i24++) {
                            if (iM != 0) {
                                iM = ((c2084lc.m() + i23) + 256) % 256;
                            }
                            if (iM != 0) {
                                i23 = iM;
                            }
                        }
                    }
                    i21++;
                }
            }
        } else {
            iL = 1;
            zH = false;
        }
        int iL4 = c2084lc.l() + 4;
        int iL5 = c2084lc.l();
        if (iL5 != 0) {
            if (iL5 == 1) {
                boolean zH3 = c2084lc.h();
                c2084lc.m();
                c2084lc.m();
                long jL = c2084lc.l();
                for (int i25 = 0; i25 < jL; i25++) {
                    c2084lc.l();
                }
                z = zH3;
                iL2 = 0;
            } else {
                iL2 = 0;
            }
            c2084lc.l();
            c2084lc.r();
            int iL6 = c2084lc.l() + 1;
            int iL7 = c2084lc.l() + 1;
            zH2 = c2084lc.h();
            i4 = 2 - (zH2 ? 1 : 0);
            int i26 = iL7 * i4;
            if (!zH2) {
                c2084lc.r();
            }
            c2084lc.r();
            i5 = iL6 * 16;
            i6 = i26 * 16;
            if (c2084lc.h()) {
                int iL8 = c2084lc.l();
                int iL9 = c2084lc.l();
                int iL10 = c2084lc.l();
                int iL11 = c2084lc.l();
                if (iL == 0) {
                    i15 = i4;
                    i16 = 1;
                    i7 = 1;
                } else {
                    if (iL == 3) {
                        i7 = 1;
                        i13 = 1;
                    } else {
                        i7 = 1;
                        i13 = 2;
                    }
                    if (iL == i7) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    i15 = i4 * i14;
                    i16 = i13;
                }
                i5 -= (iL8 + iL9) * i16;
                i6 -= (iL10 + iL11) * i15;
            } else {
                i7 = 1;
            }
            int i27 = i6;
            f2 = 1.0f;
            if (c2084lc.h()) {
                if (c2084lc.h()) {
                    i10 = c2084lc.i(8);
                    if (i10 == 255) {
                        i11 = c2084lc.i(16);
                        i12 = c2084lc.i(16);
                        if (i11 != 0 && i12 != 0) {
                            f2 = i11 / i12;
                        }
                    } else if (i10 < 17) {
                        f2 = c[i10];
                    } else {
                        AP.z();
                    }
                }
                if (c2084lc.h()) {
                    c2084lc.r();
                }
                if (c2084lc.h()) {
                    c2084lc.s(3);
                    if (!c2084lc.h()) {
                        i7 = 2;
                    }
                    if (c2084lc.h()) {
                        int i28 = c2084lc.i(8);
                        int i29 = c2084lc.i(8);
                        c2084lc.s(8);
                        int iB = C1602gf.b(i28);
                        iC = C1602gf.c(i29);
                        i9 = i7;
                        f3 = f2;
                        i8 = iB;
                    } else {
                        i9 = i7;
                        f3 = f2;
                        i8 = -1;
                        iC = -1;
                    }
                } else {
                    f3 = f2;
                }
                return new C2751sT(i17, i18, i19, iL3, i5, i27, f3, zH, zH2, iL4, iL5, iL2, z, i8, i9, iC);
            }
            f3 = 1.0f;
            i8 = -1;
            i9 = -1;
            iC = -1;
            return new C2751sT(i17, i18, i19, iL3, i5, i27, f3, zH, zH2, iL4, iL5, iL2, z, i8, i9, iC);
        }
        iL2 = c2084lc.l() + 4;
        z = false;
        c2084lc.l();
        c2084lc.r();
        int iL12 = c2084lc.l() + 1;
        int iL13 = c2084lc.l() + 1;
        zH2 = c2084lc.h();
        i4 = 2 - (zH2 ? 1 : 0);
        int i210 = iL13 * i4;
        if (!zH2) {
            c2084lc.r();
        }
        c2084lc.r();
        i5 = iL12 * 16;
        i6 = i210 * 16;
        if (c2084lc.h()) {
            int iL14 = c2084lc.l();
            int iL15 = c2084lc.l();
            int iL16 = c2084lc.l();
            int iL17 = c2084lc.l();
            if (iL == 0) {
                i15 = i4;
                i16 = 1;
                i7 = 1;
            } else {
                if (iL == 3) {
                    i7 = 1;
                    i13 = 1;
                } else {
                    i7 = 1;
                    i13 = 2;
                }
                if (iL == i7) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                i15 = i4 * i14;
                i16 = i13;
            }
            i5 -= (iL14 + iL15) * i16;
            i6 -= (iL16 + iL17) * i15;
        } else {
            i7 = 1;
        }
        int i211 = i6;
        f2 = 1.0f;
        if (c2084lc.h()) {
            if (c2084lc.h()) {
                i10 = c2084lc.i(8);
                if (i10 == 255) {
                    i11 = c2084lc.i(16);
                    i12 = c2084lc.i(16);
                    if (i11 != 0) {
                        f2 = i11 / i12;
                    }
                } else if (i10 < 17) {
                    f2 = c[i10];
                } else {
                    AP.z();
                }
            }
            if (c2084lc.h()) {
                c2084lc.r();
            }
            if (c2084lc.h()) {
                c2084lc.s(3);
                if (!c2084lc.h()) {
                    i7 = 2;
                }
                if (c2084lc.h()) {
                    int i212 = c2084lc.i(8);
                    int i213 = c2084lc.i(8);
                    c2084lc.s(8);
                    int iB2 = C1602gf.b(i212);
                    iC = C1602gf.c(i213);
                    i9 = i7;
                    f3 = f2;
                    i8 = iB2;
                } else {
                    i9 = i7;
                    f3 = f2;
                    i8 = -1;
                    iC = -1;
                }
            } else {
                f3 = f2;
            }
            return new C2751sT(i17, i18, i19, iL3, i5, i211, f3, zH, zH2, iL4, iL5, iL2, z, i8, i9, iC);
        }
        f3 = 1.0f;
        i8 = -1;
        i9 = -1;
        iC = -1;
        return new C2751sT(i17, i18, i19, iL3, i5, i211, f3, zH, zH2, iL4, iL5, iL2, z, i8, i9, iC);
    }

    public static String w(X509Certificate x509Certificate) {
        AbstractC1474fG.j(x509Certificate, "certificate");
        return "sha256/" + z(x509Certificate).a();
    }

    public static List x(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.emptyList();
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (AbstractC0358Cw.a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i3 = 0; i3 < typedArrayObtainTypedArray.length(); i3++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    public static final void y(InterfaceC1022ai interfaceC1022ai, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof C1611gj0)) {
            Object objL = interfaceC1022ai.l(null, C2478pf.t);
            AbstractC1474fG.h(objL, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC1674hK.w(objL);
            throw null;
        }
        C1611gj0 c1611gj0 = (C1611gj0) obj;
        InterfaceC1318dj0[] interfaceC1318dj0Arr = c1611gj0.b;
        int length = interfaceC1318dj0Arr.length - 1;
        if (length < 0) {
            return;
        }
        InterfaceC1318dj0 interfaceC1318dj0 = interfaceC1318dj0Arr[length];
        AbstractC1474fG.g(null);
        Object obj2 = c1611gj0.a[length];
        throw null;
    }

    public static C2468pa z(X509Certificate x509Certificate) {
        AbstractC1474fG.j(x509Certificate, "<this>");
        C2468pa c2468pa = C2468pa.f972o;
        byte[] encoded = x509Certificate.getPublicKey().getEncoded();
        AbstractC1474fG.i(encoded, "publicKey.encoded");
        return C2691rp.y(encoded).c("SHA-256");
    }
}
