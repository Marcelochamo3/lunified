package j$.util;

import j$.util.stream.Stream;
import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC0135b extends j$.lang.a {
    boolean removeIf(Predicate predicate);

    Spliterator spliterator();

    Stream stream();
}
