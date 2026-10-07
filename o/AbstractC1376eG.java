package o;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.View;
import android.widget.TextView;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.URI;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: o.eG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1376eG {
    public static final J2 b;
    public static final J2 c;
    public static final J2 d;
    public static final J2 e;
    public static final J2 f;
    public static final J2 a = new J2(10, "NO_DECISION", false);
    public static final C0922Yp g = new C0922Yp(false);
    public static final C0922Yp h = new C0922Yp(true);
    public static final int[] i = {R.attr.state_pressed};
    public static final int[] j = {R.attr.state_focused};
    public static final int[] k = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] l = {R.attr.state_selected};
    public static final int[] m = {R.attr.state_enabled, R.attr.state_pressed};

    static {
        int i2 = 10;
        boolean z = false;
        b = new J2(i2, "COMPLETING_ALREADY", z);
        c = new J2(i2, "COMPLETING_WAITING_CHILDREN", z);
        d = new J2(i2, "COMPLETING_RETRY", z);
        e = new J2(i2, "TOO_LATE_TO_CANCEL", z);
        f = new J2(i2, "SEALED", z);
    }

    public static final Object B(C1478fK c1478fK, TJ tj, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) {
        Object objN;
        if (tj == TJ.m) {
            throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
        }
        TJ tj2 = c1478fK.d;
        TJ tj3 = TJ.l;
        C2985uq0 c2985uq0 = C2985uq0.a;
        return (tj2 != tj3 && (objN = zy0.n(new C1268d70(c1478fK, tj, interfaceC0775Sy, null), interfaceC0473Hh)) == EnumC1706hi.l) ? objN : c2985uq0;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void C(C1931jx0 c1931jx0) throws Throwable {
        InterfaceC1022ai interfaceC1022ai;
        Thread threadCurrentThread = Thread.currentThread();
        C2691rp c2691rp = C2691rp.p;
        AbstractC1918jr abstractC1918jrA = AbstractC1415ej0.a();
        Boolean bool = Boolean.FALSE;
        C2478pf c2478pf = C2478pf.q;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = ((Boolean) abstractC1918jrA.l(bool, c2478pf)).booleanValue();
        if (zBooleanValue || zBooleanValue2) {
            C1038aq c1038aq = C1038aq.l;
            InterfaceC1022ai interfaceC1022ai2 = (InterfaceC1022ai) (zBooleanValue2 ? abstractC1918jrA.l(c1038aq, C2478pf.p) : abstractC1918jrA);
            c1038aq.Q(interfaceC1022ai2);
            interfaceC1022ai = interfaceC1022ai2;
        } else {
            interfaceC1022ai = abstractC1918jrA;
        }
        C3362yl c3362yl = AbstractC1910jn.a;
        InterfaceC1022ai interfaceC1022aiQ = interfaceC1022ai;
        if (interfaceC1022ai != c3362yl && interfaceC1022ai.q(c2691rp) == null) {
            interfaceC1022aiQ = interfaceC1022ai;
            interfaceC1022aiQ = interfaceC1022ai.Q(c3362yl);
        }
        interfaceC1022aiQ = interfaceC1022ai;
        Y8 y8 = new Y8(interfaceC1022aiQ, threadCurrentThread, abstractC1918jrA);
        y8.k0(1, y8, c1931jx0);
        AbstractC1918jr abstractC1918jr = y8.p;
        if (abstractC1918jr != null) {
            int i2 = AbstractC1918jr.q;
            abstractC1918jr.c0(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jE0 = abstractC1918jr != null ? abstractC1918jr.e0() : Long.MAX_VALUE;
                if (y8.U()) {
                    if (abstractC1918jr != null) {
                        int i3 = AbstractC1918jr.q;
                        abstractC1918jr.Z(false);
                    }
                    Object objI = I(y8.O());
                    C0678Pf c0678Pf = objI instanceof C0678Pf ? (C0678Pf) objI : null;
                    if (c0678Pf != null) {
                        throw c0678Pf.a;
                    }
                    return;
                }
                LockSupport.parkNanos(y8, jE0);
            } catch (Throwable th) {
                if (abstractC1918jr != null) {
                    int i4 = AbstractC1918jr.q;
                    abstractC1918jr.Z(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        y8.z(interruptedException);
        throw interruptedException;
    }

    public static ColorStateList D(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(m, 0));
        }
        return colorStateList;
    }

    public static boolean E(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final void F(Throwable th, InterfaceC0473Hh interfaceC0473Hh) {
        MI mi;
        if (interfaceC0473Hh instanceof MI) {
            mi = (MI) interfaceC0473Hh;
            int i2 = mi.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mi.m = i2 - Integer.MIN_VALUE;
            } else {
                mi = new MI(interfaceC0473Hh);
            }
        } else {
            mi = new MI(interfaceC0473Hh);
        }
        Object obj = mi.l;
        int i3 = mi.m;
        if (i3 != 0) {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Jp0.O(obj);
            throw new C0730Rf();
        }
        Jp0.O(obj);
        mi.getClass();
        mi.m = 1;
        AbstractC1910jn.a.W(mi.g(), new RunnableC1938k1(mi, th, 8, false));
    }

    public static final String G(String str) {
        AbstractC1474fG.j(str, "<this>");
        int i2 = 0;
        int i3 = -1;
        if (!AbstractC1119bh0.W(str, ":", false)) {
            try {
                String ascii = IDN.toASCII(str);
                AbstractC1474fG.i(ascii, "toASCII(host)");
                Locale locale = Locale.US;
                AbstractC1474fG.i(locale, "US");
                String lowerCase = ascii.toLowerCase(locale);
                AbstractC1474fG.i(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt = lowerCase.charAt(i4);
                    if (AbstractC1474fG.k(cCharAt, 31) <= 0 || AbstractC1474fG.k(cCharAt, Yu0.b.k0) >= 0 || AbstractC1119bh0.d0(" #%/:?@[\\]", cCharAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress inetAddressP = (AbstractC1899jh0.U(str, "[", false) && AbstractC1899jh0.L(str, "]", false)) ? p(1, str, str.length() - 1) : p(0, str, str.length());
        if (inetAddressP == null) {
            return null;
        }
        byte[] address = inetAddressP.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return inetAddressP.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i3 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        E9 e9 = new E9();
        while (i2 < address.length) {
            if (i2 == i3) {
                e9.f0(58);
                i2 += i6;
                if (i2 == 16) {
                    e9.f0(58);
                }
            } else {
                if (i2 > 0) {
                    e9.f0(58);
                }
                byte b2 = address[i2];
                byte[] bArr = Mr0.a;
                e9.h0(((b2 & 255) << 8) | (address[i2 + 1] & 255));
                i2 += 2;
            }
        }
        return e9.Z();
    }

    public static void H(InterfaceC1391eV interfaceC1391eV, AbstractC1099bV abstractC1099bV) {
        Sr0.w(abstractC1099bV);
        AbstractC1099bV abstractC1099bVJ = abstractC1099bV;
        int i2 = 0;
        while (abstractC1099bVJ != null) {
            AbstractC1099bV abstractC1099bV2 = abstractC1099bVJ.l;
            int iK = abstractC1099bV2 != null ? abstractC1099bV2.k() : 0;
            AbstractC1099bV abstractC1099bVV = abstractC1099bVJ.v();
            interfaceC1391eV.n(abstractC1099bVJ, i2);
            if (abstractC1099bV2 != null && abstractC1099bVJ.l == null) {
                if (iK == abstractC1099bV2.k()) {
                    abstractC1099bVJ = abstractC1099bV2.j(abstractC1099bVJ.m);
                } else if (abstractC1099bVV == null) {
                    i2--;
                    abstractC1099bVJ = abstractC1099bV2;
                } else {
                    abstractC1099bVJ = abstractC1099bVV;
                }
            }
            if (abstractC1099bVJ.k() > 0) {
                abstractC1099bVJ = abstractC1099bVJ.j(0);
                i2++;
            } else {
                while (abstractC1099bVJ.v() == null && i2 > 0) {
                    interfaceC1391eV.m(abstractC1099bVJ, i2);
                    abstractC1099bVJ = abstractC1099bVJ.l;
                    i2--;
                }
                interfaceC1391eV.m(abstractC1099bVJ, i2);
                if (abstractC1099bVJ == abstractC1099bV) {
                    return;
                } else {
                    abstractC1099bVJ = abstractC1099bVJ.v();
                }
            }
        }
    }

    public static final Object I(Object obj) {
        InterfaceC3028vF interfaceC3028vF;
        C3125wF c3125wF = obj instanceof C3125wF ? (C3125wF) obj : null;
        return (c3125wF == null || (interfaceC3028vF = c3125wF.a) == null) ? obj : interfaceC3028vF;
    }

    public static final Object J(AbstractC1217ci abstractC1217ci, InterfaceC0775Sy interfaceC0775Sy, InterfaceC0473Hh interfaceC0473Hh) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        InterfaceC1022ai interfaceC1022aiG = interfaceC0473Hh.g();
        Boolean bool = Boolean.FALSE;
        abstractC1217ci.getClass();
        InterfaceC1022ai interfaceC1022aiQ = !bool.booleanValue() ? interfaceC1022aiG.Q(abstractC1217ci) : AbstractC1923jt0.l(interfaceC1022aiG, abstractC1217ci, false);
        AbstractC3409z9.l(interfaceC1022aiQ);
        if (interfaceC1022aiQ == interfaceC1022aiG) {
            R90 r90 = new R90(interfaceC0473Hh, interfaceC1022aiQ);
            return AP.x(r90, r90, interfaceC0775Sy);
        }
        C2691rp c2691rp = C2691rp.p;
        if (AbstractC1474fG.b(interfaceC1022aiQ.q(c2691rp), interfaceC1022aiG.q(c2691rp))) {
            C2791sq0 c2791sq0 = new C2791sq0(interfaceC0473Hh, interfaceC1022aiQ);
            InterfaceC1022ai interfaceC1022ai = c2791sq0.n;
            Object objI = Ou0.I(interfaceC1022ai, null);
            try {
                return AP.x(c2791sq0, c2791sq0, interfaceC0775Sy);
            } finally {
                Ou0.y(interfaceC1022ai, objI);
            }
        }
        C1618gn c1618gn = new C1618gn(interfaceC0473Hh, interfaceC1022aiQ);
        Nr0.F(interfaceC0775Sy, c1618gn, c1618gn);
        do {
            atomicIntegerFieldUpdater = C1618gn.p;
            int i2 = atomicIntegerFieldUpdater.get(c1618gn);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                Object objI2 = I(c1618gn.O());
                if (objI2 instanceof C0678Pf) {
                    throw ((C0678Pf) objI2).a;
                }
                return objI2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c1618gn, 0, 1));
        return EnumC1706hi.l;
    }

    public static final void a(TextView textView, int i2, boolean z) {
        float f2 = textView.getResources().getDisplayMetrics().density;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_focused}, k(f2, -1, Integer.valueOf(i2), 3.0f));
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, k(f2, AbstractC1894jf.b(i2, 0.16f, -16777216), null, 0.0f));
        stateListDrawable.addState(new int[0], k(f2, i2, null, 0.0f));
        textView.setBackground(stateListDrawable);
        textView.setTextColor(new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[0]}, new int[]{Color.rgb(16, 16, 16), AbstractC1894jf.c(i2) > 0.42d ? Color.rgb(16, 16, 16) : -1}));
        l(textView, z);
    }

    public static final void b(AbstractC3066vi0 abstractC3066vi0, C3357yi0 c3357yi0, String str) {
        C3454zi0.h.getClass();
        C3454zi0.j.fine(c3357yi0.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + abstractC3066vi0.a);
    }

    public static C1420em c(InterfaceC1608gi interfaceC1608gi, ExecutorC0891Xk executorC0891Xk, int i2, InterfaceC0775Sy interfaceC0775Sy, int i3) {
        InterfaceC1022ai interfaceC1022ai = executorC0891Xk;
        if ((i3 & 1) != 0) {
            interfaceC1022ai = C1038aq.l;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        InterfaceC1022ai interfaceC1022aiT = AbstractC1923jt0.t(interfaceC1608gi, interfaceC1022ai);
        C1420em dj = i2 == 2 ? new DJ(interfaceC1022aiT, interfaceC0775Sy) : new C1420em(interfaceC1022aiT, true);
        dj.k0(i2, dj, interfaceC0775Sy);
        return dj;
    }

    public static final Object d(InterfaceC0621Na interfaceC0621Na, InterfaceC0473Hh interfaceC0473Hh) {
        C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
        c1692hb.y();
        int i2 = 0;
        c1692hb.A(new KI(interfaceC0621Na, i2));
        interfaceC0621Na.f(new LI(c1692hb, i2));
        return c1692hb.x();
    }

    public static final void e(View view) {
        AbstractC1474fG.j(view, "<this>");
        Tt0 tt0 = new Tt0(view, null);
        Sb0 sb0 = new Sb0();
        sb0.f516o = Ou0.e(sb0, sb0, tt0);
        while (sb0.hasNext()) {
            View view2 = (View) sb0.next();
            C1843j20 c1843j20 = (C1843j20) view2.getTag(com.skidush.clonex.R.id.pooling_container_listener_holder_tag);
            if (c1843j20 == null) {
                c1843j20 = new C1843j20();
                view2.setTag(com.skidush.clonex.R.id.pooling_container_listener_holder_tag, c1843j20);
            }
            ArrayList arrayList = c1843j20.a;
            int iJ = AbstractC0937Ze.J(arrayList);
            if (-1 < iJ) {
                AbstractC1674hK.w(arrayList.get(iJ));
                throw null;
            }
        }
    }

    public static void i(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int j(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final GradientDrawable k(float f2, int i2, Integer num, float f3) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i2);
        gradientDrawable.setCornerRadius(14.0f * f2);
        if (num != null && f3 > 0.0f) {
            gradientDrawable.setStroke((int) (f3 * f2), num.intValue());
        }
        return gradientDrawable;
    }

    public static final void l(View view, boolean z) {
        if (z) {
            view.setStateListAnimator(null);
            view.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1946k5(1));
        }
    }

    public static boolean m(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zN = n(file, inputStreamOpenRawResource);
                i(inputStreamOpenRawResource);
                return zN;
            } catch (Throwable th) {
                th = th;
                i(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean n(File file, InputStream inputStream) throws Throwable {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            i(fileOutputStream2);
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                            return true;
                        }
                        fileOutputStream2.write(bArr, 0, i2);
                    }
                } catch (IOException e2) {
                    e = e2;
                    fileOutputStream = fileOutputStream2;
                    e.getMessage();
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e3) {
            e = e3;
        }
    }

    public static Context o(Context context) {
        AbstractC1474fG.j(context, "context");
        if (context instanceof Activity) {
            return context;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            return i2 >= 26 ? new ContextThemeWrapper(context.createConfigurationContext(context.getResources().getConfiguration()), com.skidush.clonex.R.style.AppTheme_Mobile) : new ContextThemeWrapper(context, com.skidush.clonex.R.style.AppTheme_Mobile);
        }
        Object systemService = context.getSystemService("display");
        DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
        if (displayManager == null) {
            throw new IllegalStateException("DisplayManager no disponible".toString());
        }
        Display[] displays = displayManager.getDisplays();
        AbstractC1474fG.i(displays, "getDisplays(...)");
        Display display = displays.length != 0 ? displays[0] : null;
        if (display == null) {
            throw new IllegalStateException("No hay una pantalla disponible para WebView".toString());
        }
        Context contextCreateWindowContext = context.createDisplayContext(display).createWindowContext(2, null);
        AbstractC1474fG.i(contextCreateWindowContext, "createWindowContext(...)");
        return new ContextThemeWrapper(contextCreateWindowContext, com.skidush.clonex.R.style.AppTheme_Mobile);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e A[LOOP:2: B:25:0x004c->B:50:0x008e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af A[LOOP:1: B:56:0x00a3->B:59:0x00af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x00b5 A[EDGE_INSN: B:81:0x00b5->B:60:0x00b5 BREAK  A[LOOP:1: B:56:0x00a3->B:59:0x00af], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x00a0 A[SYNTHETIC] */
    public static final InetAddress p(int i2, String str, int i3) {
        int i4;
        int i5;
        char cCharAt;
        int i6;
        int i7;
        int iR;
        int i8 = 16;
        byte[] bArr = new byte[16];
        boolean z = false;
        int i9 = 0;
        int i10 = -1;
        int i11 = -1;
        int i12 = i2;
        while (i12 < i3) {
            if (i9 == i8) {
                return null;
            }
            int i13 = i12 + 2;
            if (i13 <= i3 && AbstractC1899jh0.T(i12, str, "::", z)) {
                if (i10 != -1) {
                    return null;
                }
                i9 += 2;
                i10 = i9;
                if (i13 == i3) {
                    break;
                }
                i11 = i13;
                i12 = i11;
                i6 = 0;
                while (i12 < i3) {
                    iR = Mr0.r(str.charAt(i12));
                    if (iR != -1) {
                        break;
                        break;
                    }
                    i6 = (i6 << 4) + iR;
                    i12++;
                }
                i7 = i12 - i11;
                if (i7 != 0) {
                }
                return null;
            }
            if (i9 != 0) {
                if (!AbstractC1899jh0.T(i12, str, ":", z)) {
                    if (AbstractC1899jh0.T(i12, str, ".", z)) {
                        int i14 = i9 - 2;
                        int i15 = i14;
                        while (i11 < i3) {
                            if (i15 != i8) {
                                if (i15 == i14) {
                                    i4 = i11;
                                    i5 = 0;
                                    while (i4 < i3) {
                                        cCharAt = str.charAt(i4);
                                        if (AbstractC1474fG.k(cCharAt, 48) < 0 || AbstractC1474fG.k(cCharAt, 57) > 0) {
                                            break;
                                        }
                                        if ((i5 != 0 || i11 == i4) && (i5 = ((i5 * 10) + cCharAt) - 48) <= 255) {
                                            i4++;
                                        }
                                    }
                                    if (i4 - i11 == 0) {
                                        bArr[i15] = (byte) i5;
                                        i15++;
                                        i11 = i4;
                                        i8 = 16;
                                    }
                                } else if (str.charAt(i11) == '.') {
                                    i11++;
                                    i4 = i11;
                                    i5 = 0;
                                    while (i4 < i3) {
                                        cCharAt = str.charAt(i4);
                                        if (AbstractC1474fG.k(cCharAt, 48) < 0) {
                                            break;
                                        }
                                        break;
                                        break;
                                    }
                                    if (i4 - i11 == 0) {
                                        bArr[i15] = (byte) i5;
                                        i15++;
                                        i11 = i4;
                                        i8 = 16;
                                    }
                                }
                            }
                        }
                        if (i15 == i9 + 2) {
                            i9 += 2;
                            break;
                        }
                    }
                    return null;
                }
                i12++;
            }
            i11 = i12;
            i12 = i11;
            i6 = 0;
            while (i12 < i3) {
                iR = Mr0.r(str.charAt(i12));
                if (iR != -1) {
                    break;
                }
                i6 = (i6 << 4) + iR;
                i12++;
            }
            i7 = i12 - i11;
            if (i7 != 0 || i7 > 4) {
                return null;
            }
            int i16 = i9 + 1;
            bArr[i9] = (byte) ((i6 >>> 8) & 255);
            i9 += 2;
            bArr[i16] = (byte) (i6 & 255);
            i8 = 16;
            z = false;
        }
        if (i9 != 16) {
            if (i10 == -1) {
                return null;
            }
            int i17 = i9 - i10;
            System.arraycopy(bArr, i10, bArr, 16 - i17, i17);
            Arrays.fill(bArr, i10, (16 - i9) + i10, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final Object q(long j2, InterfaceC0473Hh interfaceC0473Hh) {
        C2985uq0 c2985uq0 = C2985uq0.a;
        if (j2 <= 0) {
            return c2985uq0;
        }
        C1692hb c1692hb = new C1692hb(1, Ou0.p(interfaceC0473Hh));
        c1692hb.y();
        if (j2 < Long.MAX_VALUE) {
            t(c1692hb.p).t(j2, c1692hb);
        }
        Object objX = c1692hb.x();
        return objX == EnumC1706hi.l ? objX : c2985uq0;
    }

    public static final String r(long j2) {
        String strQ;
        if (j2 <= -999500000) {
            strQ = AbstractC1674hK.q(new StringBuilder(), (j2 - ((long) 500000000)) / ((long) 1000000000), " s ");
        } else if (j2 <= -999500) {
            strQ = AbstractC1674hK.q(new StringBuilder(), (j2 - ((long) 500000)) / ((long) 1000000), " ms");
        } else if (j2 <= 0) {
            strQ = AbstractC1674hK.q(new StringBuilder(), (j2 - ((long) 500)) / ((long) 1000), " µs");
        } else if (j2 < 999500) {
            strQ = AbstractC1674hK.q(new StringBuilder(), (j2 + ((long) 500)) / ((long) 1000), " µs");
        } else {
            strQ = j2 < 999500000 ? AbstractC1674hK.q(new StringBuilder(), (j2 + ((long) 500000)) / ((long) 1000000), " ms") : AbstractC1674hK.q(new StringBuilder(), (j2 + ((long) 500000000)) / ((long) 1000000000), " s ");
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{strQ}, 1));
    }

    public static int s(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return AbstractC1894jf.f(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static final InterfaceC1714hm t(InterfaceC1022ai interfaceC1022ai) {
        InterfaceC0914Yh interfaceC0914YhQ = interfaceC1022ai.q(C2691rp.p);
        InterfaceC1714hm interfaceC1714hm = interfaceC0914YhQ instanceof InterfaceC1714hm ? (InterfaceC1714hm) interfaceC0914YhQ : null;
        return interfaceC1714hm == null ? AbstractC0528Jk.a : interfaceC1714hm;
    }

    public static File u(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            try {
                if (file.createNewFile()) {
                    return file;
                }
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public static boolean v(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static C1703hg0 w(InterfaceC1608gi interfaceC1608gi, AbstractC1217ci abstractC1217ci, int i2, InterfaceC0775Sy interfaceC0775Sy, int i3) {
        InterfaceC1022ai interfaceC1022ai = abstractC1217ci;
        if ((i3 & 1) != 0) {
            interfaceC1022ai = C1038aq.l;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        InterfaceC1022ai interfaceC1022aiT = AbstractC1923jt0.t(interfaceC1608gi, interfaceC1022ai);
        C1703hg0 hj = i2 == 2 ? new HJ(interfaceC1022aiT, interfaceC0775Sy) : new C1703hg0(interfaceC1022aiT, true);
        hj.k0(i2, hj, interfaceC0775Sy);
        return hj;
    }

    public static String x(String str) {
        Object objK;
        String strI;
        AbstractC1474fG.j(str, "url");
        if (AbstractC1899jh0.O(str) || str.length() > 8192) {
            return null;
        }
        try {
            objK = new URI(str);
        } catch (Throwable th) {
            objK = Jp0.k(th);
        }
        if (objK instanceof C2439p80) {
            objK = null;
        }
        URI uri = (URI) objK;
        if (uri == null) {
            return null;
        }
        String host = uri.getHost();
        if (host != null) {
            Locale locale = Locale.US;
            strI = AbstractC1701hf0.i(locale, "US", host, locale, "toLowerCase(...)");
        } else {
            strI = null;
        }
        if (strI == null) {
            strI = "";
        }
        if (!AbstractC1474fG.b(uri.getScheme(), "https") || uri.getUserInfo() != null || uri.getPort() != -1) {
            return null;
        }
        if (!AbstractC1474fG.b(strI, "nunchee.tv") && !AbstractC1899jh0.L(strI, ".nunchee.tv", false)) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String strY0 = AbstractC1119bh0.y0(path, '.', "");
        Locale locale2 = Locale.US;
        String strI2 = AbstractC1701hf0.i(locale2, "US", strY0, locale2, "toLowerCase(...)");
        if (AbstractC1474fG.b(strI2, "m3u8")) {
            return "hls";
        }
        if (AbstractC1474fG.b(strI2, "mpd")) {
            return "dash";
        }
        return null;
    }

    public static MappedByteBuffer y(Context context, Uri uri) {
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    parcelFileDescriptorOpenFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return map;
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public abstract void A(C1936k0 c1936k0, Thread thread);

    public abstract boolean f(AbstractFutureC2034l0 abstractFutureC2034l0, C1644h0 c1644h0);

    public abstract boolean g(AbstractFutureC2034l0 abstractFutureC2034l0, Object obj, Object obj2);

    public abstract boolean h(AbstractFutureC2034l0 abstractFutureC2034l0, C1936k0 c1936k0, C1936k0 c1936k1);

    public abstract void z(C1936k0 c1936k0, C1936k0 c1936k1);
}
