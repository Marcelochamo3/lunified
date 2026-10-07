package o;

import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class F80 {
    public volatile C2903ty a;
    public Executor b;
    public P3 c;
    public Mh0 d;
    public boolean f;
    public List g;
    public final Map k;
    public final LinkedHashMap l;
    public final C2351oG e = d();
    public final LinkedHashMap h = new LinkedHashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();

    public F80() {
        Map mapSynchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        AbstractC1474fG.i(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.k = mapSynchronizedMap;
        this.l = new LinkedHashMap();
    }

    public static Object n(Class cls, Mh0 mh0) {
        if (cls.isInstance(mh0)) {
            return mh0;
        }
        if (mh0 instanceof InterfaceC1811im) {
            return n(cls, ((InterfaceC1811im) mh0).a());
        }
        return null;
    }

    public final void a() {
        if (this.f) {
            return;
        }
        if (!(!(Looper.getMainLooper().getThread() == Thread.currentThread()))) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public final void b() {
        if (!g().P().q() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        C2903ty c2903tyP = g().P();
        this.e.e(c2903tyP);
        if (c2903tyP.t()) {
            c2903tyP.f();
        } else {
            c2903tyP.a();
        }
    }

    public abstract C2351oG d();

    public abstract Mh0 e(C3261xj c3261xj);

    public List f(LinkedHashMap linkedHashMap) {
        AbstractC1474fG.j(linkedHashMap, "autoMigrationSpecs");
        return C1233cq.l;
    }

    public final Mh0 g() {
        Mh0 mh0 = this.d;
        if (mh0 != null) {
            return mh0;
        }
        AbstractC1474fG.U("internalOpenHelper");
        throw null;
    }

    public Set h() {
        return C1722hq.l;
    }

    public Map i() {
        return C1330dq.l;
    }

    public final void j() {
        g().P().l();
        if (g().P().q()) {
            return;
        }
        C2351oG c2351oG = this.e;
        if (c2351oG.f.compareAndSet(false, true)) {
            Executor executor = c2351oG.a.b;
            if (executor != null) {
                executor.execute(c2351oG.m);
            } else {
                AbstractC1474fG.U("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void k(C2903ty c2903ty) {
        C2351oG c2351oG = this.e;
        c2351oG.getClass();
        synchronized (c2351oG.l) {
            if (c2351oG.g) {
                return;
            }
            c2903ty.p("PRAGMA temp_store = MEMORY;");
            c2903ty.p("PRAGMA recursive_triggers='ON';");
            c2903ty.p("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            c2351oG.e(c2903ty);
            c2351oG.h = c2903ty.i("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            c2351oG.g = true;
        }
    }

    public final Cursor l(Oh0 oh0, CancellationSignal cancellationSignal) {
        AbstractC1474fG.j(oh0, "query");
        a();
        b();
        return cancellationSignal != null ? g().P().R(oh0, cancellationSignal) : g().P().Q(oh0);
    }

    public final void m() {
        g().P().W();
    }
}
