package j$.time.chrono;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface n extends Comparable {
    InterfaceC0114b A(int i, int i2);

    InterfaceC0117e D(TemporalAccessor temporalAccessor);

    InterfaceC0114b I(int i, int i2, int i3);

    j$.time.temporal.r K(j$.time.temporal.a aVar);

    InterfaceC0123k L(Instant instant, ZoneId zoneId);

    List O();

    boolean R(long j);

    o S(int i);

    InterfaceC0114b h(HashMap map, j$.time.format.E e);

    int i(o oVar, int i);

    InterfaceC0114b n(long j);

    String o();

    InterfaceC0114b s(TemporalAccessor temporalAccessor);

    String w();

    InterfaceC0123k z(TemporalAccessor temporalAccessor);
}
