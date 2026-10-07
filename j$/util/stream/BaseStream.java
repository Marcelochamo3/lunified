package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.BaseStream;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public interface BaseStream<T, S extends BaseStream<T, S>> extends AutoCloseable {
    boolean isParallel();

    Iterator<T> iterator();

    BaseStream onClose(Runnable runnable);

    BaseStream parallel();

    BaseStream sequential();

    Spliterator spliterator();

    BaseStream unordered();
}
