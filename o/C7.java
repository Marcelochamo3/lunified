package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class C7 {
    public static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(C7.class, "notCompletedCount");
    public final InterfaceC1323dm[] a;
    private volatile int notCompletedCount;

    public C7(InterfaceC1323dm[] interfaceC1323dmArr) {
        this.a = interfaceC1323dmArr;
        this.notCompletedCount = interfaceC1323dmArr.length;
    }
}
