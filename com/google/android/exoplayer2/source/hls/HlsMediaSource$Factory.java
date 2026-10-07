package com.google.android.exoplayer2.source.hls;

import java.util.List;
import o.AbstractC0397Ej;
import o.BP;
import o.C0519Jb;
import o.C0622Nb;
import o.C0633Nm;
import o.C0683Pk;
import o.C1275dC;
import o.C1971kP;
import o.C2681rk;
import o.C2720s4;
import o.InterfaceC0428Fo;
import o.InterfaceC0454Go;
import o.InterfaceC1958kC;
import o.InterfaceC2486pj;
import o.Na0;
import o.O9;
import o.UB;

/* JADX INFO: loaded from: classes.dex */
public final class HlsMediaSource$Factory implements BP {
    public final C2681rk a;
    public InterfaceC0454Go f = new Na0(15);
    public final C0519Jb c = new C0519Jb(10);
    public final C0633Nm d = C0683Pk.z;
    public final O9 b = UB.h;
    public C0622Nb g = new C0622Nb(false);
    public final C0622Nb e = new C0622Nb(8);
    public final int i = 1;
    public final long j = -9223372036854775807L;
    public final boolean h = true;

    public HlsMediaSource$Factory(InterfaceC2486pj interfaceC2486pj) {
        this.a = new C2681rk(interfaceC2486pj);
    }

    @Override // o.BP
    public final BP a(InterfaceC0454Go interfaceC0454Go) {
        AbstractC0397Ej.e(interfaceC0454Go, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f = interfaceC0454Go;
        return this;
    }

    @Override // o.BP
    public final BP b(C0622Nb c0622Nb) {
        AbstractC0397Ej.e(c0622Nb, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.g = c0622Nb;
        return this;
    }

    @Override // o.BP
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final C1275dC c(C1971kP c1971kP) {
        c1971kP.m.getClass();
        InterfaceC1958kC c2720s4 = this.c;
        List list = c1971kP.m.p;
        if (!list.isEmpty()) {
            c2720s4 = new C2720s4(c2720s4, 28, list);
        }
        O9 o9 = this.b;
        InterfaceC0428Fo interfaceC0428FoD = this.f.d(c1971kP);
        C0622Nb c0622Nb = this.g;
        this.d.getClass();
        C0683Pk c0683Pk = new C0683Pk(this.a, c0622Nb, c2720s4);
        return new C1275dC(c1971kP, this.a, o9, this.e, interfaceC0428FoD, c0622Nb, c0683Pk, this.j, this.h, this.i);
    }
}
