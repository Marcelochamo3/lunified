package o;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: renamed from: o.ke0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1991ke0 extends Closeable, Flushable {
    Hj0 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    void w(E9 e9, long j);
}
