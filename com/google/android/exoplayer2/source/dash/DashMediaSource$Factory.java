package com.google.android.exoplayer2.source.dash;

import java.util.List;
import o.AbstractC0397Ej;
import o.BP;
import o.C0622Nb;
import o.C0785Ti;
import o.C1122bj;
import o.C1971kP;
import o.C2681rk;
import o.C2720s4;
import o.InterfaceC0454Go;
import o.InterfaceC2486pj;
import o.Na0;

/* JADX INFO: loaded from: classes.dex */
public final class DashMediaSource$Factory implements BP {
    public final C2681rk a;
    public final InterfaceC2486pj b;
    public InterfaceC0454Go c = new Na0(15);
    public C0622Nb e = new C0622Nb(10);
    public final long f = 30000;
    public final long g = 5000000;
    public final C0622Nb d = new C0622Nb(8);

    public DashMediaSource$Factory(InterfaceC2486pj interfaceC2486pj) {
        this.a = new C2681rk(interfaceC2486pj);
        this.b = interfaceC2486pj;
    }

    @Override // o.BP
    public final /* bridge */ /* synthetic */ BP a(InterfaceC0454Go interfaceC0454Go) {
        e(interfaceC0454Go);
        return this;
    }

    @Override // o.BP
    public final BP b(C0622Nb c0622Nb) {
        AbstractC0397Ej.e(c0622Nb, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.e = c0622Nb;
        return this;
    }

    @Override // o.BP
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1122bj c(C1971kP c1971kP) {
        c1971kP.m.getClass();
        C0785Ti c0785Ti = new C0785Ti();
        List list = c1971kP.m.p;
        return new C1122bj(c1971kP, this.b, !list.isEmpty() ? new C2720s4(c0785Ti, 29, list) : c0785Ti, this.a, this.d, this.c.d(c1971kP), this.e, this.f, this.g);
    }

    public final void e(InterfaceC0454Go interfaceC0454Go) {
        AbstractC0397Ej.e(interfaceC0454Go, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = interfaceC0454Go;
    }
}
