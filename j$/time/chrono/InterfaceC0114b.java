package j$.time.chrono;

import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalUnit;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0114b extends Temporal, j$.time.temporal.m, Comparable {
    InterfaceC0117e B(j$.time.m mVar);

    o F();

    boolean J();

    /* JADX INFO: renamed from: N */
    InterfaceC0114b p(long j, TemporalUnit temporalUnit);

    int P();

    /* JADX INFO: renamed from: Q */
    int compareTo(InterfaceC0114b interfaceC0114b);

    n a();

    @Override // j$.time.temporal.Temporal
    InterfaceC0114b d(long j, j$.time.temporal.p pVar);

    @Override // j$.time.temporal.Temporal
    InterfaceC0114b e(long j, TemporalUnit temporalUnit);

    boolean equals(Object obj);

    @Override // j$.time.temporal.Temporal
    long f(Temporal temporal, TemporalUnit temporalUnit);

    @Override // j$.time.temporal.TemporalAccessor
    boolean g(j$.time.temporal.p pVar);

    int hashCode();

    InterfaceC0114b j(j$.time.v vVar);

    /* JADX INFO: renamed from: m */
    InterfaceC0114b t(j$.time.temporal.m mVar);

    String toString();

    long y();
}
