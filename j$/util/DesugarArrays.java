package j$.util;

import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static <T> Stream<T> stream(T[] tArr) {
        return StreamSupport.stream(Spliterators.m(tArr, 0, tArr.length), false);
    }
}
