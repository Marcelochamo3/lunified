package o;

import android.util.Log;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: o.in, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1813in {
    public int a;
    public int b;
    public Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public C1813in() {
        this.a = 64;
        this.b = 5;
        this.d = new ArrayDeque();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
    }

    public synchronized void a() {
        c(0);
    }

    public void b(int i, Class cls) {
        NavigableMap navigableMapJ = j(cls);
        Integer num = (Integer) navigableMapJ.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapJ.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapJ.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public void c(int i) {
        while (this.b > i) {
            Object objJ0 = ((C2994uv) this.c).j0();
            AbstractC3045vW.j(objJ0);
            C1006aa c1006aaH = h(objJ0.getClass());
            this.b -= c1006aaH.b() * c1006aaH.a(objJ0);
            b(c1006aaH.a(objJ0), objJ0.getClass());
            if (Log.isLoggable(c1006aaH.c(), 2)) {
                c1006aaH.a(objJ0);
            }
        }
    }

    public synchronized ExecutorService d() {
        ThreadPoolExecutor threadPoolExecutor;
        try {
            if (((ThreadPoolExecutor) this.c) == null) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                SynchronousQueue synchronousQueue = new SynchronousQueue();
                String str = Mr0.g + " Dispatcher";
                AbstractC1474fG.j(str, "name");
                this.c = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new Fr0(str, false));
            }
            threadPoolExecutor = (ThreadPoolExecutor) this.c;
            AbstractC1474fG.g(threadPoolExecutor);
        } catch (Throwable th) {
            throw th;
        }
        return threadPoolExecutor;
    }

    public void e(ArrayDeque arrayDeque, Object obj) {
        synchronized (this) {
            if (!arrayDeque.remove(obj)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        k();
    }

    public void f(RunnableC3208x50 runnableC3208x50) {
        AbstractC1474fG.j(runnableC3208x50, "call");
        runnableC3208x50.m.decrementAndGet();
        e((ArrayDeque) this.e, runnableC3208x50);
    }

    public synchronized Object g(int i, Class cls) {
        C2454pM c2454pM;
        int i2;
        try {
            Integer num = (Integer) j(cls).ceilingKey(Integer.valueOf(i));
            if (num == null || ((i2 = this.b) != 0 && this.a / i2 < 2 && num.intValue() > i * 8)) {
                C2551qM c2551qM = (C2551qM) this.d;
                InterfaceC1747i20 interfaceC1747i20R = (InterfaceC1747i20) ((ArrayDeque) c2551qM.a).poll();
                if (interfaceC1747i20R == null) {
                    interfaceC1747i20R = c2551qM.r();
                }
                c2454pM = (C2454pM) interfaceC1747i20R;
                c2454pM.b = i;
                c2454pM.c = cls;
            } else {
                C2551qM c2551qM2 = (C2551qM) this.d;
                int iIntValue = num.intValue();
                InterfaceC1747i20 interfaceC1747i20R2 = (InterfaceC1747i20) ((ArrayDeque) c2551qM2.a).poll();
                if (interfaceC1747i20R2 == null) {
                    interfaceC1747i20R2 = c2551qM2.r();
                }
                c2454pM = (C2454pM) interfaceC1747i20R2;
                c2454pM.b = iIntValue;
                c2454pM.c = cls;
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(c2454pM, cls);
    }

    public C1006aa h(Class cls) {
        HashMap map = (HashMap) this.f;
        C1006aa c1006aa = (C1006aa) map.get(cls);
        if (c1006aa == null) {
            if (cls.equals(int[].class)) {
                c1006aa = new C1006aa(1);
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                c1006aa = new C1006aa(0);
            }
            map.put(cls, c1006aa);
        }
        return c1006aa;
    }

    public Object i(C2454pM c2454pM, Class cls) {
        C1006aa c1006aaH = h(cls);
        Object objV = ((C2994uv) this.c).V(c2454pM);
        if (objV != null) {
            this.b -= c1006aaH.b() * c1006aaH.a(objV);
            b(c1006aaH.a(objV), cls);
        }
        if (objV != null) {
            return objV;
        }
        Log.isLoggable(c1006aaH.c(), 2);
        return c1006aaH.d(c2454pM.b);
    }

    public NavigableMap j(Class cls) {
        HashMap map = (HashMap) this.e;
        NavigableMap navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    public void k() {
        byte[] bArr = Mr0.a;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator it = ((ArrayDeque) this.d).iterator();
                AbstractC1474fG.i(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    RunnableC3208x50 runnableC3208x50 = (RunnableC3208x50) it.next();
                    if (((ArrayDeque) this.e).size() >= this.a) {
                        break;
                    }
                    if (runnableC3208x50.m.get() < this.b) {
                        it.remove();
                        runnableC3208x50.m.incrementAndGet();
                        arrayList.add(runnableC3208x50);
                        ((ArrayDeque) this.e).add(runnableC3208x50);
                    }
                }
                m();
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RunnableC3208x50 runnableC3208x51 = (RunnableC3208x50) arrayList.get(i);
            ExecutorService executorServiceD = d();
            runnableC3208x51.getClass();
            A50 a50 = runnableC3208x51.n;
            C1813in c1813in = a50.l.l;
            byte[] bArr2 = Mr0.a;
            try {
                try {
                    ((ThreadPoolExecutor) executorServiceD).execute(runnableC3208x51);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    a50.m(interruptedIOException);
                    runnableC3208x51.l.E(a50, interruptedIOException);
                    a50.l.l.f(runnableC3208x51);
                }
            } catch (Throwable th2) {
                a50.l.l.f(runnableC3208x51);
                throw th2;
            }
        }
    }

    public synchronized void l(Object obj) {
        Class<?> cls = obj.getClass();
        C1006aa c1006aaH = h(cls);
        int iA = c1006aaH.a(obj);
        int iB = c1006aaH.b() * iA;
        if (iB <= this.a / 2) {
            C2551qM c2551qM = (C2551qM) this.d;
            InterfaceC1747i20 interfaceC1747i20R = (InterfaceC1747i20) ((ArrayDeque) c2551qM.a).poll();
            if (interfaceC1747i20R == null) {
                interfaceC1747i20R = c2551qM.r();
            }
            C2454pM c2454pM = (C2454pM) interfaceC1747i20R;
            c2454pM.b = iA;
            c2454pM.c = cls;
            ((C2994uv) this.c).i0(c2454pM, obj);
            NavigableMap navigableMapJ = j(cls);
            Integer num = (Integer) navigableMapJ.get(Integer.valueOf(c2454pM.b));
            Integer numValueOf = Integer.valueOf(c2454pM.b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapJ.put(numValueOf, Integer.valueOf(iIntValue));
            this.b += iB;
            c(this.a);
        }
    }

    public synchronized int m() {
        return ((ArrayDeque) this.e).size() + ((ArrayDeque) this.f).size();
    }

    public void n(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "max < 1: ").toString());
        }
        synchronized (this) {
            this.a = i;
        }
        k();
    }

    public void o(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "max < 1: ").toString());
        }
        synchronized (this) {
            this.b = i;
        }
        k();
    }

    public synchronized void p(int i) {
        try {
            if (i >= 40) {
                a();
            } else if (i >= 20 || i == 15) {
                c(this.a / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1813in(int i) {
        this.c = new C2994uv(6);
        this.d = new C2551qM(0);
        this.e = new HashMap();
        this.f = new HashMap();
        this.a = i;
    }
}
