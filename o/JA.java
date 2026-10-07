package o;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class JA implements InterfaceC2091lf0 {
    public byte l;
    public final C3111w50 m;
    public final Inflater n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final EF f337o;
    public final CRC32 p;

    public JA(InterfaceC2091lf0 interfaceC2091lf0) {
        AbstractC1474fG.j(interfaceC2091lf0, "source");
        C3111w50 c3111w50 = new C3111w50(interfaceC2091lf0);
        this.m = c3111w50;
        Inflater inflater = new Inflater(true);
        this.n = inflater;
        this.f337o = new EF(c3111w50, inflater);
        this.p = new CRC32();
    }

    public static void a(int i, String str, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // o.InterfaceC2091lf0
    public final Hj0 c() {
        return this.m.l.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f337o.close();
    }

    public final void f(E9 e9, long j, long j2) {
        C3343yb0 c3343yb0 = e9.l;
        AbstractC1474fG.g(c3343yb0);
        while (true) {
            int i = c3343yb0.c;
            int i2 = c3343yb0.b;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c3343yb0 = c3343yb0.f;
            AbstractC1474fG.g(c3343yb0);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c3343yb0.b) + j);
            int iMin = (int) Math.min(c3343yb0.c - i3, j2);
            this.p.update(c3343yb0.a, i3, iMin);
            j2 -= (long) iMin;
            c3343yb0 = c3343yb0.f;
            AbstractC1474fG.g(c3343yb0);
            j = 0;
        }
    }

    @Override // o.InterfaceC2091lf0
    public final long y(E9 e9, long j) throws IOException {
        C3111w50 c3111w50;
        long j2;
        AbstractC1474fG.j(e9, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.o(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b = this.l;
        CRC32 crc32 = this.p;
        C3111w50 c3111w51 = this.m;
        if (b == 0) {
            c3111w51.M(10L);
            E9 e10 = c3111w51.m;
            byte bK = e10.K(3L);
            boolean z = ((bK >> 1) & 1) == 1;
            if (z) {
                f(c3111w51.m, 0L, 10L);
            }
            a(8075, "ID1ID2", c3111w51.readShort());
            c3111w51.skip(8L);
            if (((bK >> 2) & 1) == 1) {
                c3111w51.M(2L);
                if (z) {
                    f(c3111w51.m, 0L, 2L);
                }
                short s = e10.readShort();
                long j3 = ((short) (((s & 255) << 8) | ((s & 65280) >>> 8))) & 65535;
                c3111w51.M(j3);
                if (z) {
                    f(c3111w51.m, 0L, j3);
                    j2 = j3;
                } else {
                    j2 = j3;
                }
                c3111w51.skip(j2);
            }
            if (((bK >> 3) & 1) == 1) {
                c3111w50 = c3111w51;
                long jA = c3111w51.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA == -1) {
                    throw new EOFException();
                }
                if (z) {
                    f(c3111w50.m, 0L, jA + 1);
                }
                c3111w50.skip(jA + 1);
            } else {
                c3111w50 = c3111w51;
            }
            if (((bK >> 4) & 1) == 1) {
                long jA2 = c3111w50.a((byte) 0, 0L, Long.MAX_VALUE);
                if (jA2 == -1) {
                    throw new EOFException();
                }
                if (z) {
                    f(c3111w50.m, 0L, jA2 + 1);
                }
                c3111w50.skip(jA2 + 1);
            }
            if (z) {
                c3111w50.M(2L);
                short s2 = e10.readShort();
                a((short) (((s2 & 255) << 8) | ((s2 & 65280) >>> 8)), "FHCRC", (short) crc32.getValue());
                crc32.reset();
            }
            this.l = (byte) 1;
        } else {
            c3111w50 = c3111w51;
        }
        if (this.l == 1) {
            long j4 = e9.m;
            long jY = this.f337o.y(e9, j);
            if (jY != -1) {
                f(e9, j4, jY);
                return jY;
            }
            this.l = (byte) 2;
        }
        if (this.l != 2) {
            return -1L;
        }
        a(c3111w50.i(), "CRC", (int) crc32.getValue());
        a(c3111w50.i(), "ISIZE", (int) this.n.getBytesWritten());
        this.l = (byte) 3;
        if (c3111w50.D()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }
}
