package j$.util.stream;

import j$.util.Objects;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public final class Collectors {
    static final Set a;
    static final Set b;

    static {
        EnumC0188h enumC0188h = EnumC0188h.CONCURRENT;
        EnumC0188h enumC0188h2 = EnumC0188h.UNORDERED;
        EnumC0188h enumC0188h3 = EnumC0188h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC0188h, enumC0188h2, enumC0188h3));
        Collections.unmodifiableSet(EnumSet.of(enumC0188h, enumC0188h2));
        a = Collections.unmodifiableSet(EnumSet.of(enumC0188h3));
        Collections.unmodifiableSet(EnumSet.of(enumC0188h2, enumC0188h3));
        b = Collections.emptySet();
        Collections.unmodifiableSet(EnumSet.of(enumC0188h2));
    }

    static void a(Function function, Function function2, Map map, Object obj) {
        Object objApply = function.apply(obj);
        Object objRequireNonNull = Objects.requireNonNull(function2.apply(obj));
        Object objPutIfAbsent = j$.util.Map.EL.putIfAbsent(map, objApply, objRequireNonNull);
        if (objPutIfAbsent != null) {
            throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", objApply, objPutIfAbsent, objRequireNonNull));
        }
    }

    static void b(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            Object objRequireNonNull = Objects.requireNonNull(entry.getValue());
            Object objPutIfAbsent = j$.util.Map.EL.putIfAbsent(map, key, objRequireNonNull);
            if (objPutIfAbsent != null) {
                throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, objPutIfAbsent, objRequireNonNull));
            }
        }
    }

    static void c(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }

    public static <T, A, R, RR> Collector<T, A, RR> collectingAndThen(Collector<T, A, R> collector, Function<R, RR> function) {
        Set setCharacteristics = collector.characteristics();
        EnumC0188h enumC0188h = EnumC0188h.IDENTITY_FINISH;
        if (setCharacteristics.contains(enumC0188h)) {
            if (setCharacteristics.size() == 1) {
                setCharacteristics = b;
            } else {
                EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setCharacteristics);
                enumSetCopyOf.remove(enumC0188h);
                setCharacteristics = Collections.unmodifiableSet(enumSetCopyOf);
            }
        }
        return new C0218n(collector.supplier(), collector.accumulator(), collector.combiner(), collector.finisher().mo4andThen(function), setCharacteristics);
    }

    public static Collector<CharSequence, ?, String> joining(final CharSequence charSequence) {
        return new C0218n(new Supplier() { // from class: j$.util.stream.m
            public final /* synthetic */ CharSequence b = "";
            public final /* synthetic */ CharSequence c = "";

            @Override // java.util.function.Supplier
            public final Object get() {
                Set set = Collectors.a;
                return new j$.util.d0(charSequence, this.b, this.c);
            }
        }, new C0203k(26), new C0203k(27), new C0203k(28), b);
    }

    public static <T, C extends Collection<T>> Collector<T, ?, C> toCollection(Supplier<C> supplier) {
        return new C0218n(supplier, new C0203k(21), new C0203k(1), a);
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C0218n(new C0203k(22), new C0203k(23), new C0203k(2), a);
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return new C0218n(new C0203k(29), new C0208l(0, function, function2), new C0203k(0), a);
    }
}
