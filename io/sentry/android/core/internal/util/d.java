package io.sentry.android.core.internal.util;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import o.A50;
import o.AbstractC1474fG;
import o.AbstractC1701hf0;
import o.C1130bn;
import o.C1159c2;
import o.C3305y50;
import o.C3454zi0;
import o.C50;
import o.Mr0;
import o.VY;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Serializable e;

    public d(int i, long j) {
        b bVar = b.l;
        this.d = new AtomicInteger(0);
        this.e = new AtomicLong(0L);
        this.c = bVar;
        this.b = j;
        this.a = i <= 0 ? 1 : i;
    }

    public boolean a(C1159c2 c1159c2, A50 a50, List list, boolean z) {
        AbstractC1474fG.j(c1159c2, "address");
        AbstractC1474fG.j(a50, "call");
        for (C50 c50 : (ConcurrentLinkedQueue) this.e) {
            AbstractC1474fG.i(c50, "connection");
            synchronized (c50) {
                if (z) {
                    if (c50.g == null) {
                        continue;
                    }
                }
                if (c50.i(c1159c2, list)) {
                    a50.c(c50);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b() {
        long jB = ((io.sentry.transport.f) this.c).b();
        AtomicLong atomicLong = (AtomicLong) this.e;
        long j = atomicLong.get();
        AtomicInteger atomicInteger = (AtomicInteger) this.d;
        if (j == 0 || atomicLong.get() + this.b <= jB) {
            atomicInteger.set(0);
            atomicLong.set(jB);
            return false;
        }
        if (atomicInteger.incrementAndGet() < this.a) {
            return false;
        }
        atomicInteger.set(0);
        return true;
    }

    public int c(C50 c50, long j) {
        byte[] bArr = Mr0.a;
        ArrayList arrayList = c50.p;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + c50.b.a.i + " was leaked. Did you forget to close a response body?";
                VY vy = VY.a;
                VY.a.k(((C3305y50) reference).a, str);
                arrayList.remove(i);
                c50.j = true;
                if (arrayList.isEmpty()) {
                    c50.q = j - this.b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public d(C3454zi0 c3454zi0, TimeUnit timeUnit) {
        AbstractC1474fG.j(c3454zi0, "taskRunner");
        this.a = 5;
        this.b = timeUnit.toNanos(5L);
        this.c = c3454zi0.f();
        this.d = new C1130bn(this, AbstractC1701hf0.h(new StringBuilder(), Mr0.g, " ConnectionPool"), 2);
        this.e = new ConcurrentLinkedQueue();
    }
}
