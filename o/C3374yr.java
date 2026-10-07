package o;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: o.yr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3374yr extends InputStream implements DataInput {
    public static final ByteOrder p = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder q = ByteOrder.BIG_ENDIAN;
    public final DataInputStream l;
    public ByteOrder m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f1138o;

    public C3374yr(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }

    public final void a(int i) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.l;
            int i3 = i - i2;
            int iSkip = (int) dataInputStream.skip(i3);
            if (iSkip <= 0) {
                if (this.f1138o == null) {
                    this.f1138o = new byte[C1672hI.a.e];
                }
                iSkip = dataInputStream.read(this.f1138o, 0, Math.min(C1672hI.a.e, i3));
                if (iSkip == -1) {
                    throw new EOFException(AbstractC1674hK.p("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i2 += iSkip;
        }
        this.n += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.l.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.n++;
        return this.l.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.n++;
        return this.l.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.n++;
        int i = this.l.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.n += 2;
        return this.l.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.n += i2;
        this.l.readFully(bArr, i, i2);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.n += 4;
        DataInputStream dataInputStream = this.l;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        if ((i | i2 | i3 | i4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.m;
        if (byteOrder == p) {
            return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
        }
        if (byteOrder == q) {
            return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
        }
        throw new IOException("Invalid byte order: " + this.m);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        this.n += 8;
        DataInputStream dataInputStream = this.l;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        int i3 = dataInputStream.read();
        int i4 = dataInputStream.read();
        int i5 = dataInputStream.read();
        int i6 = dataInputStream.read();
        int i7 = dataInputStream.read();
        int i8 = dataInputStream.read();
        if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.m;
        if (byteOrder == p) {
            return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
        }
        if (byteOrder == q) {
            return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
        }
        throw new IOException("Invalid byte order: " + this.m);
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.n += 2;
        DataInputStream dataInputStream = this.l;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.m;
        if (byteOrder == p) {
            return (short) ((i2 << 8) + i);
        }
        if (byteOrder == q) {
            return (short) ((i << 8) + i2);
        }
        throw new IOException("Invalid byte order: " + this.m);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.n += 2;
        return this.l.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.n++;
        return this.l.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.n += 2;
        DataInputStream dataInputStream = this.l;
        int i = dataInputStream.read();
        int i2 = dataInputStream.read();
        if ((i | i2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.m;
        if (byteOrder == p) {
            return (i2 << 8) + i;
        }
        if (byteOrder == q) {
            return (i << 8) + i2;
        }
        throw new IOException("Invalid byte order: " + this.m);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C3374yr(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public C3374yr(InputStream inputStream, ByteOrder byteOrder) {
        this.m = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.l = dataInputStream;
        dataInputStream.mark(0);
        this.n = 0;
        this.m = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.l.read(bArr, i, i2);
        this.n += i3;
        return i3;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.n += bArr.length;
        this.l.readFully(bArr);
    }
}
