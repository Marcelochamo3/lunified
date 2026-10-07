package o;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public interface N9 extends InterfaceC2091lf0, ReadableByteChannel {
    String A();

    byte[] C();

    boolean D();

    String I(long j);

    void M(long j);

    long S();

    int T(DW dw);

    String U(Charset charset);

    InputStream V();

    E9 b();

    C2468pa m();

    C2468pa n(long j);

    C3111w50 peek();

    byte readByte();

    int readInt();

    short readShort();

    boolean s(long j);

    void skip(long j);

    long u(E9 e9);
}
