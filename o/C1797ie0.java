package o;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Trace;
import io.sentry.C0032c;
import j$.util.Objects;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.ILoggerFactory;

/* JADX INFO: renamed from: o.ie0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1797ie0 implements InterfaceC2054lA, ILoggerFactory {
    public static volatile C1797ie0 p;
    public final /* synthetic */ int l;
    public boolean m;
    public Object n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Object f832o;

    public C1797ie0(K90 k90) {
        this.l = 7;
        this.n = k90;
        this.f832o = new K3();
    }

    public static String a(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Class name: ".concat(cls.getName());
        }
        return null;
    }

    public static C1797ie0 f(Context context) {
        if (p == null) {
            synchronized (C1797ie0.class) {
                try {
                    if (p == null) {
                        p = new C1797ie0(context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return p;
    }

    @Override // org.slf4j.ILoggerFactory
    public synchronized CL b(String str) {
        C2773sh0 c2773sh0;
        c2773sh0 = (C2773sh0) ((HashMap) this.n).get(str);
        if (c2773sh0 == null) {
            c2773sh0 = new C2773sh0(str, (LinkedBlockingQueue) this.f832o, this.m);
            ((HashMap) this.n).put(str, c2773sh0);
        }
        return c2773sh0;
    }

    public boolean c(InterfaceC2049l70 interfaceC2049l70) {
        boolean z = true;
        if (interfaceC2049l70 == null) {
            return true;
        }
        boolean zRemove = ((Set) this.n).remove(interfaceC2049l70);
        if (!((HashSet) this.f832o).remove(interfaceC2049l70) && !zRemove) {
            z = false;
        }
        if (z) {
            interfaceC2049l70.clear();
        }
        return z;
    }

    public void d() {
        synchronized (this.n) {
            try {
                this.m = true;
                Iterator it = ((ArrayList) this.f832o).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0360Cy) it.next()).c();
                }
                ((ArrayList) this.f832o).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    public InterfaceC3432zV e(Kp0 kp0) {
        C0549Kf c0549Kf;
        String str;
        InterfaceC3432zV j2;
        int i = 5;
        int i2 = 4;
        int i3 = 1;
        boolean z = false;
        int i4 = 3;
        int i5 = 2;
        Type type = kp0.b;
        Map map = (Map) this.n;
        AbstractC1674hK.w(map.get(type));
        Class cls = kp0.a;
        AbstractC1674hK.w(map.get(cls));
        InterfaceC3432zV c0622Nb = null;
        if (EnumSet.class.isAssignableFrom(cls)) {
            c0549Kf = new C0549Kf(i5, type);
        } else {
            c0549Kf = cls == EnumMap.class ? new C0549Kf(i4, type) : null;
        }
        if (c0549Kf != null) {
            return c0549Kf;
        }
        AbstractC0397Ej.q((List) this.f832o);
        if (Modifier.isAbstract(cls.getModifiers())) {
            j2 = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                AbstractC2506pt abstractC2506pt = A60.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e) {
                    str = "Failed making constructor '" + A60.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e.getMessage();
                }
                j2 = str != null ? new J2(i4, str, z) : new C2133m1(13, declaredConstructor);
            } catch (NoSuchMethodException unused) {
                j2 = null;
            }
        }
        if (j2 != null) {
            return j2;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                c0622Nb = new C0622Nb(i3);
            } else if (Set.class.isAssignableFrom(cls)) {
                c0622Nb = new C0519Jb(i5);
            } else {
                c0622Nb = Queue.class.isAssignableFrom(cls) ? new C0622Nb(i5) : new C0519Jb(i4);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                c0622Nb = new C0622Nb(i4);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                c0622Nb = new C0519Jb(i2);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                c0622Nb = new C0622Nb(i2);
            } else if (type instanceof ParameterizedType) {
                Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                Objects.requireNonNull(type2);
                Type typeC = UK.c(type2);
                Class clsV = UK.v(typeC);
                typeC.hashCode();
                if (String.class.isAssignableFrom(clsV)) {
                    c0622Nb = new C0622Nb(i);
                } else {
                    c0622Nb = new C0519Jb(i);
                }
            } else {
                c0622Nb = new C0622Nb(i);
            }
        }
        if (c0622Nb != null) {
            return c0622Nb;
        }
        String strA = a(cls);
        if (strA != null) {
            return new J2(i5, strA, z);
        }
        if (this.m) {
            return new C2133m1(12, cls);
        }
        return new J2(i3, "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.", z);
    }

    public void g() {
        K90 k90 = (K90) this.n;
        C1478fK c1478fKF = k90.f();
        if (c1478fKF.d != TJ.m) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        c1478fKF.a(new I50(k90));
        K3 k3 = (K3) this.f832o;
        k3.getClass();
        if (!(!k3.c)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        c1478fKF.a(new C0385Dx(2, k3));
        k3.c = true;
        this.m = true;
    }

    @Override // o.InterfaceC2054lA
    public Object get() {
        if (this.m) {
            throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
        }
        Trace.beginSection("Glide registry");
        this.m = true;
        try {
            return AbstractC1468fA.f((com.bumptech.glide.a) this.n, (List) this.f832o);
        } finally {
            this.m = false;
            Trace.endSection();
        }
    }

    public void h(Bundle bundle) {
        if (!this.m) {
            g();
        }
        C1478fK c1478fKF = ((K90) this.n).f();
        if (!(!(c1478fKF.d.compareTo(TJ.f532o) >= 0))) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + c1478fKF.d).toString());
        }
        K3 k3 = (K3) this.f832o;
        if (!k3.c) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!k3.d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        k3.a = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        k3.d = true;
    }

    public void i(Bundle bundle) {
        AbstractC1474fG.j(bundle, "outBundle");
        K3 k3 = (K3) this.f832o;
        k3.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) k3.a;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C3022v90 c3022v90 = (C3022v90) k3.f;
        c3022v90.getClass();
        C2828t90 c2828t90 = new C2828t90(c3022v90);
        c3022v90.n.put(c2828t90, Boolean.FALSE);
        while (c2828t90.hasNext()) {
            Map.Entry entry = (Map.Entry) c2828t90.next();
            bundle2.putBundle((String) entry.getKey(), ((J90) entry.getValue()).a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    public void j() {
        for (InterfaceC2049l70 interfaceC2049l70 : Kr0.e((Set) this.n)) {
            if (!interfaceC2049l70.k() && !interfaceC2049l70.d()) {
                interfaceC2049l70.clear();
                if (this.m) {
                    ((HashSet) this.f832o).add(interfaceC2049l70);
                } else {
                    interfaceC2049l70.i();
                }
            }
        }
    }

    public void k() {
        if (this.m) {
            ((Context) this.n).unregisterReceiver((J6) this.f832o);
            this.m = false;
        }
    }

    public String toString() {
        switch (this.l) {
            case 2:
                return ((Map) this.n).toString();
            case 6:
                return super.toString() + "{numRequests=" + ((Set) this.n).size() + ", isPaused=" + this.m + "}";
            default:
                return super.toString();
        }
    }

    public C1797ie0(Context context, Handler handler, SurfaceHolderCallbackC0898Xr surfaceHolderCallbackC0898Xr) {
        this.l = 1;
        this.n = context.getApplicationContext();
        this.f832o = new J6(this, handler, surfaceHolderCallbackC0898Xr);
    }

    public C1797ie0(int i) {
        this.l = i;
        switch (i) {
            case 6:
                this.n = Collections.newSetFromMap(new WeakHashMap());
                this.f832o = new HashSet();
                break;
            case 8:
                this.m = false;
                this.n = new HashMap();
                this.f832o = new LinkedBlockingQueue();
                break;
        }
    }

    public C1797ie0(ExecutorC0938Zf executorC0938Zf, C0756Sf c0756Sf) {
        this.l = 3;
        this.n = new Object();
        this.f832o = new ArrayList();
    }

    public C1797ie0(Map map, boolean z, List list) {
        this.l = 2;
        this.n = map;
        this.m = z;
        this.f832o = list;
    }

    public C1797ie0(Context context) {
        Object c1699he0;
        this.l = 0;
        this.f832o = new HashSet();
        C3257xh c3257xh = new C3257xh(new C0533Jp(context, 1));
        C1308de0 c1308de0 = new C1308de0(this);
        if (Build.VERSION.SDK_INT >= 24) {
            c1699he0 = new C0032c(c3257xh, c1308de0);
        } else {
            c1699he0 = new C1699he0(context, c3257xh, c1308de0);
        }
        this.n = c1699he0;
    }

    public C1797ie0(com.bumptech.glide.a aVar, ArrayList arrayList, Pu0 pu0) {
        this.l = 5;
        this.n = aVar;
        this.f832o = arrayList;
    }
}
