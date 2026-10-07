package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class Wd0 implements InterfaceC2049l70, InterfaceC2574qe0, P70 {
    public static final boolean A = Log.isLoggable("GlideRequest", 2);
    public final C2965ug0 a;
    public final Object b;
    public final InterfaceC2727s70 c;
    public final Context d;
    public final C1566gA e;
    public final Object f;
    public final Class g;
    public final AbstractC2050l8 h;
    public final int i;
    public final int j;
    public final EnumC1651h30 k;
    public final InterfaceC2872ti0 l;
    public final List m;
    public final C2743sL n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Executor f598o;
    public M70 p;
    public Na0 q;
    public volatile C2597qq r;
    public Drawable s;
    public Drawable t;
    public Drawable u;
    public int v;
    public int w;
    public boolean x;
    public final RuntimeException y;
    public int z;

    public Wd0(Context context, C1566gA c1566gA, Object obj, Object obj2, Class cls, AbstractC2050l8 abstractC2050l8, int i, int i2, EnumC1651h30 enumC1651h30, InterfaceC2872ti0 interfaceC2872ti0, ArrayList arrayList, InterfaceC2727s70 interfaceC2727s70, C2597qq c2597qq, C2743sL c2743sL) {
        Q3 q3 = AbstractC0397Ej.g;
        if (A) {
            String.valueOf(hashCode());
        }
        this.a = new C2965ug0();
        this.b = obj;
        this.d = context;
        this.e = c1566gA;
        this.f = obj2;
        this.g = cls;
        this.h = abstractC2050l8;
        this.i = i;
        this.j = i2;
        this.k = enumC1651h30;
        this.l = interfaceC2872ti0;
        this.m = arrayList;
        this.c = interfaceC2727s70;
        this.r = c2597qq;
        this.n = c2743sL;
        this.f598o = q3;
        this.z = 1;
        if (this.y == null && ((Map) c1566gA.h.m).containsKey(AbstractC1468fA.class)) {
            this.y = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 4;
        }
        return z;
    }

    public final void b() {
        if (this.x) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
        this.a.a();
        this.l.f(this);
        Na0 na0 = this.q;
        if (na0 != null) {
            synchronized (((C2597qq) na0.f414o)) {
                ((C2984uq) na0.m).j((P70) na0.n);
            }
            this.q = null;
        }
    }

    public final Drawable c() {
        int i;
        if (this.t == null) {
            AbstractC2050l8 abstractC2050l8 = this.h;
            Drawable drawable = abstractC2050l8.r;
            this.t = drawable;
            if (drawable == null && (i = abstractC2050l8.s) > 0) {
                Resources.Theme theme = abstractC2050l8.F;
                Context context = this.d;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.t = AbstractC1459f50.x(context, context, i, theme);
            }
        }
        return this.t;
    }

    @Override // o.InterfaceC2049l70
    public final void clear() {
        synchronized (this.b) {
            try {
                if (this.x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                if (this.z == 6) {
                    return;
                }
                b();
                M70 m70 = this.p;
                if (m70 != null) {
                    this.p = null;
                } else {
                    m70 = null;
                }
                InterfaceC2727s70 interfaceC2727s70 = this.c;
                if (interfaceC2727s70 == null || interfaceC2727s70.h(this)) {
                    this.l.h(c());
                }
                this.z = 6;
                if (m70 != null) {
                    this.r.getClass();
                    C2597qq.f(m70);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 6;
        }
        return z;
    }

    public final void e(C1762iA c1762iA, int i) {
        int i2;
        int i3;
        this.a.a();
        synchronized (this.b) {
            try {
                c1762iA.getClass();
                int i4 = this.e.i;
                if (i4 <= i) {
                    Objects.toString(this.f);
                    if (i4 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        C1762iA.a(c1762iA, arrayList);
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            int i6 = i5 + 1;
                            i5 = i6;
                        }
                    }
                }
                Drawable drawableC = null;
                this.q = null;
                this.z = 5;
                InterfaceC2727s70 interfaceC2727s70 = this.c;
                if (interfaceC2727s70 != null) {
                    interfaceC2727s70.c(this);
                }
                this.x = true;
                try {
                    List list = this.m;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (it.hasNext()) {
                            AbstractC1674hK.w(it.next());
                            InterfaceC2727s70 interfaceC2727s71 = this.c;
                            if (interfaceC2727s71 == null) {
                                throw null;
                            }
                            interfaceC2727s71.b().a();
                            throw null;
                        }
                    }
                    InterfaceC2727s70 interfaceC2727s72 = this.c;
                    if (interfaceC2727s72 == null || interfaceC2727s72.l(this)) {
                        if (this.f == null) {
                            if (this.u == null) {
                                AbstractC2050l8 abstractC2050l8 = this.h;
                                Drawable drawable = abstractC2050l8.z;
                                this.u = drawable;
                                if (drawable == null && (i3 = abstractC2050l8.A) > 0) {
                                    Resources.Theme theme = abstractC2050l8.F;
                                    Context context = this.d;
                                    if (theme == null) {
                                        theme = context.getTheme();
                                    }
                                    this.u = AbstractC1459f50.x(context, context, i3, theme);
                                }
                            }
                            drawableC = this.u;
                        }
                        if (drawableC == null) {
                            if (this.s == null) {
                                AbstractC2050l8 abstractC2050l9 = this.h;
                                Drawable drawable2 = abstractC2050l9.p;
                                this.s = drawable2;
                                if (drawable2 == null && (i2 = abstractC2050l9.q) > 0) {
                                    Resources.Theme theme2 = abstractC2050l9.F;
                                    Context context2 = this.d;
                                    if (theme2 == null) {
                                        theme2 = context2.getTheme();
                                    }
                                    this.s = AbstractC1459f50.x(context2, context2, i2, theme2);
                                }
                            }
                            drawableC = this.s;
                        }
                        if (drawableC == null) {
                            drawableC = c();
                        }
                        this.l.a(drawableC);
                    }
                    this.x = false;
                } catch (Throwable th) {
                    this.x = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final void f() {
        synchronized (this.b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean g(InterfaceC2049l70 interfaceC2049l70) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC2050l8 abstractC2050l8;
        EnumC1651h30 enumC1651h30;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class cls2;
        AbstractC2050l8 abstractC2050l9;
        EnumC1651h30 enumC1651h31;
        int size2;
        boolean zEquals;
        boolean zM;
        if (!(interfaceC2049l70 instanceof Wd0)) {
            return false;
        }
        synchronized (this.b) {
            try {
                i = this.i;
                i2 = this.j;
                obj = this.f;
                cls = this.g;
                abstractC2050l8 = this.h;
                enumC1651h30 = this.k;
                List list = this.m;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        Wd0 wd0 = (Wd0) interfaceC2049l70;
        synchronized (wd0.b) {
            try {
                i3 = wd0.i;
                i4 = wd0.j;
                obj2 = wd0.f;
                cls2 = wd0.g;
                abstractC2050l9 = wd0.h;
                enumC1651h31 = wd0.k;
                List list2 = wd0.m;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i == i3 && i2 == i4) {
            char[] cArr = Kr0.a;
            if (obj == null) {
                zEquals = obj2 == null;
            } else {
                zEquals = obj.equals(obj2);
            }
            if (zEquals && cls.equals(cls2)) {
                if (abstractC2050l8 == null) {
                    zM = abstractC2050l9 == null;
                } else {
                    zM = abstractC2050l8.m(abstractC2050l9);
                }
                if (zM && enumC1651h30 == enumC1651h31 && size == size2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void h(M70 m70, int i, boolean z) {
        this.a.a();
        M70 m71 = null;
        try {
            synchronized (this.b) {
                try {
                    this.q = null;
                    if (m70 == null) {
                        e(new C1762iA("Expected to receive a Resource<R> with an object of " + this.g + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = m70.get();
                    try {
                        if (obj != null && this.g.isAssignableFrom(obj.getClass())) {
                            InterfaceC2727s70 interfaceC2727s70 = this.c;
                            if (interfaceC2727s70 == null || interfaceC2727s70.e(this)) {
                                j(m70, obj, i);
                                return;
                            }
                            this.p = null;
                            this.z = 4;
                            this.r.getClass();
                            C2597qq.f(m70);
                            return;
                        }
                        this.p = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.g);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(m70);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        e(new C1762iA(sb.toString()), 5);
                        this.r.getClass();
                        C2597qq.f(m70);
                    } catch (Throwable th) {
                        m71 = m70;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (m71 != null) {
                this.r.getClass();
                C2597qq.f(m71);
            }
            throw th3;
        }
    }

    @Override // o.InterfaceC2049l70
    public final void i() {
        InterfaceC2727s70 interfaceC2727s70;
        int i;
        synchronized (this.b) {
            try {
                if (this.x) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.a.a();
                int i2 = AL.a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f == null) {
                    if (Kr0.i(this.i, this.j)) {
                        this.v = this.i;
                        this.w = this.j;
                    }
                    if (this.u == null) {
                        AbstractC2050l8 abstractC2050l8 = this.h;
                        Drawable drawable = abstractC2050l8.z;
                        this.u = drawable;
                        if (drawable == null && (i = abstractC2050l8.A) > 0) {
                            Resources.Theme theme = abstractC2050l8.F;
                            Context context = this.d;
                            if (theme == null) {
                                theme = context.getTheme();
                            }
                            this.u = AbstractC1459f50.x(context, context, i, theme);
                        }
                    }
                    e(new C1762iA("Received null model"), this.u == null ? 5 : 3);
                    return;
                }
                int i3 = this.z;
                if (i3 == 2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (i3 == 4) {
                    h(this.p, 5, false);
                    return;
                }
                List list = this.m;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        AbstractC1674hK.w(it.next());
                    }
                }
                this.z = 3;
                if (Kr0.i(this.i, this.j)) {
                    l(this.i, this.j);
                } else {
                    this.l.d(this);
                }
                int i4 = this.z;
                if ((i4 == 2 || i4 == 3) && ((interfaceC2727s70 = this.c) == null || interfaceC2727s70.l(this))) {
                    this.l.g(c());
                }
                if (A) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            int i = this.z;
            z = i == 2 || i == 3;
        }
        return z;
    }

    public final void j(M70 m70, Object obj, int i) {
        InterfaceC2727s70 interfaceC2727s70 = this.c;
        if (interfaceC2727s70 != null) {
            interfaceC2727s70.b().a();
        }
        this.z = 4;
        this.p = m70;
        if (this.e.i <= 3) {
            Objects.toString(this.f);
            int i2 = AL.a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (interfaceC2727s70 != null) {
            interfaceC2727s70.j(this);
        }
        this.x = true;
        try {
            List list = this.m;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC1674hK.w(it.next());
                    throw null;
                }
            }
            this.n.getClass();
            this.l.i(obj);
            this.x = false;
        } catch (Throwable th) {
            this.x = false;
            throw th;
        }
    }

    @Override // o.InterfaceC2049l70
    public final boolean k() {
        boolean z;
        synchronized (this.b) {
            z = this.z == 4;
        }
        return z;
    }

    public final void l(int i, int i2) {
        Object obj;
        int iRound = i;
        this.a.a();
        Object obj2 = this.b;
        synchronized (obj2) {
            try {
                try {
                    boolean z = A;
                    if (z) {
                        int i3 = AL.a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.z == 3) {
                        this.z = 2;
                        float f = this.h.m;
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * f);
                        }
                        this.v = iRound;
                        this.w = i2 == Integer.MIN_VALUE ? i2 : Math.round(f * i2);
                        if (z) {
                            int i4 = AL.a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        C2597qq c2597qq = this.r;
                        C1566gA c1566gA = this.e;
                        Object obj3 = this.f;
                        AbstractC2050l8 abstractC2050l8 = this.h;
                        try {
                            obj = obj2;
                            try {
                                this.q = c2597qq.a(c1566gA, obj3, abstractC2050l8.w, this.v, this.w, abstractC2050l8.D, this.g, this.k, abstractC2050l8.n, abstractC2050l8.C, abstractC2050l8.x, abstractC2050l8.J, abstractC2050l8.B, abstractC2050l8.t, abstractC2050l8.H, abstractC2050l8.K, abstractC2050l8.I, this, this.f598o);
                                if (this.z != 2) {
                                    this.q = null;
                                }
                                if (z) {
                                    int i5 = AL.a;
                                    SystemClock.elapsedRealtimeNanos();
                                }
                            } catch (Throwable th) {
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.b) {
            obj = this.f;
            cls = this.g;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
