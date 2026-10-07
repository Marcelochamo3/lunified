package io.sentry.android.core;

import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import o.C1591gZ;
import o.InterfaceC3037vO;
import o.Lr0;
import o.Sh0;

/* JADX INFO: renamed from: io.sentry.android.core.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0019p implements InterfaceC3037vO {
    public boolean l;
    public long m;
    public long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f81o;
    public Object p;

    public C0019p(Sh0 sh0) {
        this.f81o = sh0;
        this.p = C1591gZ.f794o;
    }

    @Override // o.InterfaceC3037vO
    public void a(C1591gZ c1591gZ) {
        if (this.l) {
            c(d());
        }
        this.p = c1591gZ;
    }

    @Override // o.InterfaceC3037vO
    public C1591gZ b() {
        return (C1591gZ) this.p;
    }

    public void c(long j) {
        this.m = j;
        if (this.l) {
            ((Sh0) this.f81o).getClass();
            this.n = SystemClock.elapsedRealtime();
        }
    }

    @Override // o.InterfaceC3037vO
    public long d() {
        long j = this.m;
        if (!this.l) {
            return j;
        }
        ((Sh0) this.f81o).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.n;
        C1591gZ c1591gZ = (C1591gZ) this.p;
        return j + (c1591gZ.l == 1.0f ? Lr0.K(jElapsedRealtime) : jElapsedRealtime * ((long) c1591gZ.n));
    }

    public void e() {
        if (this.l) {
            return;
        }
        ((Sh0) this.f81o).getClass();
        this.n = SystemClock.elapsedRealtime();
        this.l = true;
    }

    public C0019p(long j, long j2, boolean z, File file, HashMap map) {
        this.m = j;
        this.f81o = file;
        this.n = j2;
        this.p = map;
        this.l = z;
    }
}
