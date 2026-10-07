package j$.util;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class B {
    public static void a(E e, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (f0.a) {
                f0.a(e.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            e.forEachRemaining((DoubleConsumer) new C0148n(consumer));
        }
    }

    public static void b(H h, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            h.forEachRemaining((IntConsumer) consumer);
        } else {
            if (f0.a) {
                f0.a(h.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            h.forEachRemaining((IntConsumer) new r(consumer));
        }
    }

    public static void c(K k, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            k.forEachRemaining((LongConsumer) consumer);
        } else {
            if (f0.a) {
                f0.a(k.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            k.forEachRemaining((LongConsumer) new C0279v(consumer));
        }
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static boolean f(E e, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return e.tryAdvance((DoubleConsumer) consumer);
        }
        if (f0.a) {
            f0.a(e.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return e.tryAdvance((DoubleConsumer) new C0148n(consumer));
    }

    public static boolean g(H h, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return h.tryAdvance((IntConsumer) consumer);
        }
        if (f0.a) {
            f0.a(h.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return h.tryAdvance((IntConsumer) new r(consumer));
    }

    public static boolean h(K k, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return k.tryAdvance((LongConsumer) consumer);
        }
        if (f0.a) {
            f0.a(k.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return k.tryAdvance((LongConsumer) new C0279v(consumer));
    }

    public static Optional i(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.of(optional.get()) : Optional.empty();
    }

    public static C0146l j(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C0146l.d(optionalDouble.getAsDouble()) : C0146l.a();
    }

    public static OptionalInt k(java.util.OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? OptionalInt.of(optionalInt.getAsInt()) : OptionalInt.empty();
    }

    public static C0147m l(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C0147m.d(optionalLong.getAsLong()) : C0147m.a();
    }

    public static java.util.Optional m(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? java.util.Optional.of(optional.get()) : java.util.Optional.empty();
    }

    public static OptionalDouble n(C0146l c0146l) {
        if (c0146l == null) {
            return null;
        }
        return c0146l.c() ? OptionalDouble.of(c0146l.b()) : OptionalDouble.empty();
    }

    public static java.util.OptionalInt o(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.b() ? java.util.OptionalInt.of(optionalInt.a()) : java.util.OptionalInt.empty();
    }

    public static OptionalLong p(C0147m c0147m) {
        if (c0147m == null) {
            return null;
        }
        return c0147m.c() ? OptionalLong.of(c0147m.b()) : OptionalLong.empty();
    }

    public static /* synthetic */ java.util.Comparator q(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
