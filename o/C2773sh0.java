package o;

import j$.time.Instant;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: o.sh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2773sh0 implements CL {
    public final String l;
    public volatile CL m;
    public Boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Method f1030o;
    public C2720s4 p;
    public final Queue q;
    public final boolean r;

    public C2773sh0(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.l = str;
        this.q = linkedBlockingQueue;
        this.r = z;
    }

    @Override // o.CL
    public final void A(String str, Object... objArr) {
        a().A(str, objArr);
    }

    @Override // o.CL
    public final void C(Object obj, String str) {
        a().C(obj, str);
    }

    @Override // o.CL
    public final void F(String str, Exception exc) {
        a().F(str, exc);
    }

    @Override // o.CL
    public final void I(String str, Exception exc) {
        a().I(str, exc);
    }

    @Override // o.CL
    public final void M(String str) {
        a().M(str);
    }

    @Override // o.CL
    public final boolean O() {
        return a().O();
    }

    @Override // o.CL
    public final void Q(IOException iOException) {
        a().Q(iOException);
    }

    @Override // o.CL
    public final void R(Object obj, Object obj2, String str) {
        a().R(obj, obj2, str);
    }

    public final CL a() {
        if (this.m != null) {
            return this.m;
        }
        if (this.r) {
            return C1487fT.l;
        }
        if (this.p == null) {
            C2720s4 c2720s4 = new C2720s4((char) 0, 27);
            c2720s4.m = this;
            c2720s4.n = this.q;
            this.p = c2720s4;
        }
        return this.p;
    }

    public final boolean b() {
        Boolean bool = this.n;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f1030o = this.m.getClass().getMethod("log", C2870th0.class);
            this.n = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.n = Boolean.FALSE;
        }
        return this.n.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C2773sh0.class == obj.getClass() && this.l.equals(((C2773sh0) obj).l);
    }

    @Override // o.CL
    public final void f(String str, Object... objArr) {
        a().f(str, objArr);
    }

    @Override // o.CL
    public final void g(String str, Object obj, Exception exc) {
        a().g(str, obj, exc);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    @Override // o.CL
    public final void i(Instant instant) {
        a().i(instant);
    }

    @Override // o.CL
    public final boolean j() {
        return a().j();
    }

    @Override // o.CL
    public final void m(Object... objArr) {
        a().m(objArr);
    }

    @Override // o.CL
    public final void n(String str) {
        a().n(str);
    }

    @Override // o.CL
    public final void q(String str) {
        a().q(str);
    }

    @Override // o.CL
    public final void s(Object obj, String str) {
        a().s(obj, str);
    }

    @Override // o.CL
    public final void t(String str) {
        a().t(str);
    }

    @Override // o.CL
    public final void u(String str, Object... objArr) {
        a().u(str, objArr);
    }

    @Override // o.CL
    public final void v(String str) {
        a().v(str);
    }

    @Override // o.CL
    public final void y(Object obj, String str) {
        a().y(obj, str);
    }

    @Override // o.CL
    public final void z(Object obj, Object obj2, String str) {
        a().z(obj, obj2, str);
    }
}
