package o;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public interface X6 {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    boolean a();

    ByteBuffer b();

    void c();

    boolean d();

    V6 e(V6 v6);

    void f(ByteBuffer byteBuffer);

    void flush();

    void g();
}
