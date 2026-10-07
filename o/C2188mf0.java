package o;

import android.os.SystemClock;
import android.util.Log;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: o.mf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2188mf0 implements InterfaceC1805ij, InterfaceC1708hj {
    public final C0449Gj l;
    public final InterfaceC1708hj m;
    public volatile int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile C1317dj f915o;
    public volatile Object p;
    public volatile PQ q;
    public volatile C1414ej r;

    public C2188mf0(C0449Gj c0449Gj, InterfaceC1708hj interfaceC1708hj) {
        this.l = c0449Gj;
        this.m = interfaceC1708hj;
    }

    @Override // o.InterfaceC1708hj
    public final void a() {
        throw new UnsupportedOperationException();
    }

    @Override // o.InterfaceC1708hj
    public final void b(InterfaceC2450pI interfaceC2450pI, Exception exc, InterfaceC1610gj interfaceC1610gj, int i) {
        this.m.b(interfaceC2450pI, exc, interfaceC1610gj, this.q.c.c());
    }

    @Override // o.InterfaceC1805ij
    public final boolean c() {
        if (this.p != null) {
            Object obj = this.p;
            this.p = null;
            try {
                if (!e(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f915o != null && this.f915o.c()) {
            return true;
        }
        this.f915o = null;
        this.q = null;
        boolean z = false;
        while (!z && this.n < this.l.b().size()) {
            ArrayList arrayListB = this.l.b();
            int i = this.n;
            this.n = i + 1;
            this.q = (PQ) arrayListB.get(i);
            if (this.q != null && (this.l.p.c(this.q.c.c()) || this.l.c(this.q.c.b()) != null)) {
                this.q.c.e(this.l.f285o, new C2994uv(this, this.q, 25, false));
                z = true;
            }
        }
        return z;
    }

    @Override // o.InterfaceC1805ij
    public final void cancel() {
        PQ pq = this.q;
        if (pq != null) {
            pq.c.cancel();
        }
    }

    @Override // o.InterfaceC1708hj
    public final void d(InterfaceC2450pI interfaceC2450pI, Object obj, InterfaceC1610gj interfaceC1610gj, int i, InterfaceC2450pI interfaceC2450pI2) {
        this.m.d(interfaceC2450pI, obj, interfaceC1610gj, this.q.c.c(), interfaceC2450pI);
    }

    public final boolean e(Object obj) throws Throwable {
        int i = AL.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            InterfaceC2195mj interfaceC2195mjH = this.l.c.b().h(obj);
            Object objF = interfaceC2195mjH.f();
            InterfaceC1916jq interfaceC1916jqE = this.l.e(objF);
            Na0 na0 = new Na0(interfaceC1916jqE, objF, this.l.i, 11);
            InterfaceC2450pI interfaceC2450pI = this.q.a;
            C0449Gj c0449Gj = this.l;
            C1414ej c1414ej = new C1414ej(interfaceC2450pI, c0449Gj.n);
            InterfaceC0763Sm interfaceC0763SmA = c0449Gj.h.a();
            interfaceC0763SmA.c(c1414ej, na0);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c1414ej.toString();
                obj.toString();
                interfaceC1916jqE.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (interfaceC0763SmA.m(c1414ej) != null) {
                this.r = c1414ej;
                this.f915o = new C1317dj(Collections.singletonList(this.q.a), this.l, this);
                this.q.c.a();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.r);
                obj.toString();
            }
            try {
                this.m.d(this.q.a, interfaceC2195mjH.f(), this.q.c, this.q.c.c(), this.q.a);
                return false;
            } catch (Throwable th) {
                th = th;
                z = true;
                if (!z) {
                    this.q.c.a();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
