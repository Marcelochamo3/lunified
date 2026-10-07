package o;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.skidush.clonex.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: o.pt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2506pt {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, C1672hI.a.g};
    public static final C0622Nb b = new C0622Nb(19);
    public static final C0334By c = new C0334By(29, false);
    public static boolean d = false;
    public static Method e = null;
    public static boolean f = false;
    public static Field g;
    public static Constructor h;
    public static Method i;
    public static Method j;
    public static Constructor k;
    public static Method l;

    public static List A(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC1474fG.i(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Su0 B(String str, String str2) {
        C2446pE c2446pEB;
        C3176wp c3176wpX;
        AbstractC1474fG.j(str, "html");
        AbstractC1474fG.j(str2, "currentUrl");
        try {
            C2349oE c2349oE = new C2349oE();
            c2349oE.g(null, str2);
            c2446pEB = c2349oE.b();
        } catch (IllegalArgumentException unused) {
            c2446pEB = null;
        }
        if (c2446pEB == null || (c3176wpX = RN.z(str, str2).X("altcha-widget[challenge]")) == null) {
            return null;
        }
        AbstractC1332dr abstractC1332drK = A40.k("form");
        Sr0.w(abstractC1332drK);
        AbstractC1099bV abstractC1099bV = c3176wpX;
        while (true) {
            AbstractC1099bV abstractC1099bV2 = abstractC1099bV.l;
            if (abstractC1099bV2 == null) {
                break;
            }
            abstractC1099bV = abstractC1099bV2;
        }
        C3176wp c3176wp = (C3176wp) abstractC1099bV;
        C3176wp c3176wp2 = c3176wpX;
        while (!abstractC1332drK.b(c3176wp, c3176wp2)) {
            c3176wp2 = (C3176wp) c3176wp2.l;
            if (c3176wp2 == null) {
                c3176wp2 = null;
                break;
            }
        }
        if (c3176wp2 == null) {
            return null;
        }
        String strD = c3176wpX.d("challenge");
        AbstractC1474fG.i(strD, "attr(...)");
        C2446pE c2446pEF = F(c2446pEB, strD);
        if (c2446pEF == null) {
            return null;
        }
        String strD2 = c3176wp2.d("action");
        AbstractC1474fG.i(strD2, "attr(...)");
        C2446pE c2446pEF2 = F(c2446pEB, strD2);
        if (c2446pEF2 == null) {
            return null;
        }
        C3176wp c3176wpX2 = c3176wp2.X("input[name=_token]");
        String strD3 = c3176wpX2 != null ? c3176wpX2.d("value") : null;
        if (strD3 == null) {
            strD3 = "";
        }
        C3176wp c3176wpX3 = c3176wp2.X("input[name=access]");
        String strD4 = c3176wpX3 != null ? c3176wpX3.d("value") : null;
        String str3 = strD4 != null ? strD4 : "";
        if (AbstractC1899jh0.O(strD3) || AbstractC1899jh0.O(str3)) {
            return null;
        }
        return new Su0(c2446pEF, c2446pEF2, strD3, str3);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0087  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    public static C2712s0 C(C2084lc c2084lc) {
        int i2;
        int i3;
        int i4 = c2084lc.i(16);
        int i5 = c2084lc.i(16);
        if (i5 == 65535) {
            i5 = c2084lc.i(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i6 = i5 + i2;
        if (i4 == 44097) {
            i6 += 2;
        }
        if (c2084lc.i(2) == 3) {
            do {
                c2084lc.i(2);
            } while (c2084lc.h());
        }
        int i7 = c2084lc.i(10);
        if (c2084lc.h() && c2084lc.i(3) > 0) {
            c2084lc.s(2);
        }
        int i8 = c2084lc.h() ? 48000 : 44100;
        int i9 = c2084lc.i(4);
        int[] iArr = a;
        if (i8 == 44100 && i9 == 13) {
            i3 = iArr[i9];
        } else if (i8 != 48000 || i9 >= 14) {
            i3 = 0;
        } else {
            int i10 = iArr[i9];
            int i11 = i7 % 5;
            if (i11 == 1) {
                if (i9 != 3 || i9 == 8) {
                    i3 = i10 + 1;
                } else {
                    i3 = i10;
                }
            } else if (i11 != 2) {
                if (i11 == 3) {
                    if (i9 != 3) {
                    }
                    i3 = i10 + 1;
                } else if (i11 == 4 && (i9 == 3 || i9 == 8 || i9 == 11)) {
                    i3 = i10 + 1;
                } else {
                    i3 = i10;
                }
            } else if (i9 == 8 || i9 == 11) {
                i3 = i10 + 1;
            } else {
                i3 = i10;
            }
        }
        return new C2712s0(i8, i6, i3);
    }

    public static void D() throws ClassNotFoundException {
        if (h == null || i == null || j == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            h = cls.getConstructor(null);
            i = cls.getMethod("setRotationDegrees", Float.TYPE);
            j = cls.getMethod("build", null);
        }
        if (k == null || l == null) {
            Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
            k = cls2.getConstructor(null);
            l = cls2.getMethod("build", null);
        }
    }

    public static boolean E(C2446pE c2446pE, C2446pE c2446pE2) {
        return c2446pE != null && c2446pE2 != null && AbstractC1899jh0.N(c2446pE.a, c2446pE2.a, true) && AbstractC1899jh0.N(c2446pE.d, c2446pE2.d, true) && c2446pE.e == c2446pE2.e;
    }

    public static C2446pE F(C2446pE c2446pE, String str) {
        C2446pE c2446pEJ = c2446pE.j(AbstractC1119bh0.E0(str).toString());
        if (c2446pEJ == null) {
            return null;
        }
        if (AbstractC1474fG.b(c2446pEJ.a, "https") && AbstractC1899jh0.N(c2446pEJ.d, c2446pE.d, true) && c2446pEJ.e == c2446pE.e && c2446pEJ.b.length() == 0 && c2446pEJ.c.length() == 0) {
            return c2446pEJ;
        }
        return null;
    }

    public static final String G(QH qh) {
        String strH;
        qh.getClass();
        if (!(qh instanceof VH) || !(qh.g().l instanceof String)) {
            qh = null;
        }
        if (qh == null || (strH = qh.h()) == null || !(!AbstractC1899jh0.O(strH))) {
            return null;
        }
        return strH;
    }

    public static Na0 H(int i2, InterfaceC0406Es interfaceC0406Es) {
        return new Na0(new C2136m20(i2), interfaceC0406Es, b);
    }

    public static final OH a(TH th, String str) {
        QH qhI = th.i(str);
        if (qhI == null) {
            return null;
        }
        if (!(qhI instanceof OH)) {
            qhI = null;
        }
        if (qhI != null) {
            return qhI.e();
        }
        return null;
    }

    public static final Integer b(TH th, String str) {
        QH qhI = th.i(str);
        if (qhI == null) {
            return null;
        }
        if (!(qhI instanceof VH) || !(qhI.g().l instanceof Number)) {
            qhI = null;
        }
        if (qhI != null) {
            return Integer.valueOf(qhI.d());
        }
        return null;
    }

    public static final TH c(TH th, String str) {
        QH qhI = th.i(str);
        if (qhI != null) {
            return f(qhI);
        }
        return null;
    }

    public static final String d(TH th, String str) {
        QH qhI = th.i(str);
        if (qhI != null) {
            return G(qhI);
        }
        return null;
    }

    public static final boolean e(int i2, int i3, int i4, byte[] bArr, byte[] bArr2) {
        AbstractC1474fG.j(bArr, "a");
        AbstractC1474fG.j(bArr2, "b");
        for (int i5 = 0; i5 < i4; i5++) {
            if (bArr[i5 + i2] != bArr2[i5 + i3]) {
                return false;
            }
        }
        return true;
    }

    public static final TH f(QH qh) {
        qh.getClass();
        if (!(qh instanceof TH)) {
            qh = null;
        }
        if (qh != null) {
            return qh.f();
        }
        return null;
    }

    public static C2143m6 g() throws InterruptedException {
        C2143m6 c2143m6 = C2143m6.l;
        AbstractC1474fG.g(c2143m6);
        C2143m6 c2143m7 = c2143m6.f;
        if (c2143m7 == null) {
            long jNanoTime = System.nanoTime();
            C2143m6.i.await(C2143m6.j, TimeUnit.MILLISECONDS);
            C2143m6 c2143m8 = C2143m6.l;
            AbstractC1474fG.g(c2143m8);
            if (c2143m8.f != null || System.nanoTime() - jNanoTime < C2143m6.k) {
                return null;
            }
            return C2143m6.l;
        }
        long jNanoTime2 = c2143m7.g - System.nanoTime();
        if (jNanoTime2 > 0) {
            C2143m6.i.await(jNanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        C2143m6 c2143m9 = C2143m6.l;
        AbstractC1474fG.g(c2143m9);
        c2143m9.f = c2143m7.f;
        c2143m7.f = null;
        return c2143m7;
    }

    public static C3421zK h(C3421zK c3421zK) {
        if (c3421zK.p != null) {
            throw new IllegalStateException();
        }
        c3421zK.i();
        c3421zK.f1151o = true;
        return c3421zK.n > 0 ? c3421zK : C3421zK.r;
    }

    public static void i(String str, boolean z) throws C2949uX {
        if (!z) {
            throw C2949uX.a(str, null);
        }
    }

    public static final void j(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }

    public static void k(InterfaceC2583qj interfaceC2583qj) {
        if (interfaceC2583qj != null) {
            try {
                interfaceC2583qj.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean l(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        WeakHashMap weakHashMap = It0.a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = Ht0.d;
        Ht0 ht0 = (Ht0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (ht0 == null) {
            ht0 = new Ht0();
            ht0.a = null;
            ht0.b = null;
            ht0.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, ht0);
        }
        WeakReference weakReference2 = ht0.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        ht0.c = new WeakReference(keyEvent);
        if (ht0.b == null) {
            ht0.b = new SparseArray();
        }
        SparseArray sparseArray = ht0.b;
        if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
            weakReference = null;
        } else {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        AbstractC1674hK.w(arrayList.get(size));
        throw null;
    }

    public static boolean m(InterfaceC2740sI interfaceC2740sI, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (interfaceC2740sI == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return interfaceC2740sI.b(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!d) {
                        try {
                            e = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        d = true;
                    }
                    Method method = e;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null) {
                                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (It0.b(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && It0.b(view, keyEvent)) || interfaceC2740sI.b(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f = true;
        }
        Field field = g;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (It0.b(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }

    public static boolean n(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                return set.size() == set2.size() && set.containsAll(set2);
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static Ic0 o(Set set, I20 i20) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof Ic0)) {
                set.getClass();
                return new Ic0(set, i20);
            }
            Ic0 ic0 = (Ic0) set;
            I20 i21 = ic0.m;
            i21.getClass();
            return new Ic0((Set) ic0.l, new J20(Arrays.asList(i21, i20)));
        }
        Set set2 = (SortedSet) set;
        if (!(set2 instanceof Ic0)) {
            set2.getClass();
            return new Jc0(set2, i20);
        }
        Ic0 ic1 = (Ic0) set2;
        I20 i22 = ic1.m;
        i22.getClass();
        return new Jc0((SortedSet) ic1.l, new J20(Arrays.asList(i22, i20)));
    }

    public static C1469fB p(SSLSession sSLSession) throws IOException {
        List listL;
        List listL2 = C1233cq.l;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        if (AbstractC1474fG.b(cipherSuite, "TLS_NULL_WITH_NULL_NULL") ? true : AbstractC1474fG.b(cipherSuite, "SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C0676Pd c0676PdD = C0676Pd.b.D(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null".toString());
        }
        if (AbstractC1474fG.b("NONE", protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        Xj0 xj0H = Sr0.h(protocol);
        try {
            Certificate[] peerCertificates = sSLSession.getPeerCertificates();
            listL = peerCertificates != null ? Mr0.l(Arrays.copyOf(peerCertificates, peerCertificates.length)) : listL2;
        } catch (SSLPeerUnverifiedException unused) {
        }
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        if (localCertificates != null) {
            listL2 = Mr0.l(Arrays.copyOf(localCertificates, localCertificates.length));
        }
        return new C1469fB(xj0H, c0676PdD, listL2, new C1371eB(1, listL));
    }

    public static void q(int i2, C2562qX c2562qX) {
        c2562qX.C(7);
        byte[] bArr = c2562qX.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i2 >> 16) & 255);
        bArr[5] = (byte) ((i2 >> 8) & 255);
        bArr[6] = (byte) (i2 & 255);
    }

    public static String t(Class cls) {
        LinkedHashMap linkedHashMap = EU.b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            CU cu = (CU) cls.getAnnotation(CU.class);
            strValue = cu != null ? cu.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        AbstractC1474fG.g(strValue);
        return strValue;
    }

    public static int v(Set set) {
        Iterator it = set.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i2 = ~(~(i2 + (next != null ? next.hashCode() : 0)));
        }
        return i2;
    }

    public static LinkedHashMap w(C2446pE c2446pE, C2446pE c2446pE2, LinkedHashMap linkedHashMap) {
        boolean zE = E(c2446pE, c2446pE2);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            if (zE || !z(str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap2;
    }

    public static Hc0 x(AbstractC1571gF abstractC1571gF, AbstractC1571gF abstractC1571gF2) {
        if (abstractC1571gF == null) {
            throw new NullPointerException("set1");
        }
        if (abstractC1571gF2 != null) {
            return new Hc0(abstractC1571gF, abstractC1571gF2);
        }
        throw new NullPointerException("set2");
    }

    public static boolean z(String str) {
        AbstractC1474fG.j(str, "name");
        String lowerCase = AbstractC1119bh0.E0(str).toString().toLowerCase(Locale.ROOT);
        AbstractC1474fG.i(lowerCase, "toLowerCase(...)");
        return AbstractC1474fG.b(lowerCase, "authorization") || AbstractC1474fG.b(lowerCase, "proxy-authorization") || AbstractC1474fG.b(lowerCase, "cookie") || AbstractC1474fG.b(lowerCase, "set-cookie") || AbstractC1474fG.b(lowerCase, "token") || AbstractC1474fG.b(lowerCase, "jwt") || AbstractC1474fG.b(lowerCase, "api-key") || AbstractC1474fG.b(lowerCase, "apikey") || AbstractC1474fG.b(lowerCase, "x-api-key") || AbstractC1474fG.b(lowerCase, "x-auth-token") || AbstractC1474fG.b(lowerCase, "x-access-token") || AbstractC1119bh0.W(lowerCase, "authorization", false) || AbstractC1119bh0.W(lowerCase, "credential", false) || AbstractC1119bh0.W(lowerCase, "signature", false) || AbstractC1119bh0.W(lowerCase, "api-key", false) || AbstractC1119bh0.W(lowerCase, "apikey", false) || AbstractC1119bh0.W(lowerCase, "session", false) || AbstractC1119bh0.W(lowerCase, "secret", false) || AbstractC1119bh0.W(lowerCase, "token", false);
    }

    public abstract Method r(Class cls, Field field);

    public abstract Constructor s(Class cls);

    public abstract String[] u(Class cls);

    public abstract boolean y(Class cls);
}
