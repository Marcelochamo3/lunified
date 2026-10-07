package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public interface Temporal extends TemporalAccessor {
    Temporal d(long j, p pVar);

    Temporal e(long j, TemporalUnit temporalUnit);

    long f(Temporal temporal, TemporalUnit temporalUnit);

    Temporal p(long j, ChronoUnit chronoUnit);

    Temporal t(j$.time.i iVar);
}
