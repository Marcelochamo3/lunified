package o;

import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes.dex */
public interface M9 extends InterfaceC1991ke0, WritableByteChannel {
    M9 E(C2468pa c2468pa);

    M9 F(int i);

    M9 G(byte[] bArr);

    M9 H();

    M9 N(String str);

    M9 O(long j);

    E9 b();

    @Override // o.InterfaceC1991ke0, java.io.Flushable
    void flush();

    M9 h(byte[] bArr, int i, int i2);

    M9 k(long j);

    M9 r(int i);

    M9 v(int i);
}
