package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class Vg0 implements Closeable {
    public final InputStream l;
    public final Charset m;
    public byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f579o;
    public int p;

    public Vg0(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(Jr0.a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.l = fileInputStream;
        this.m = charset;
        this.n = new byte[C1672hI.a.e];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String a() {
        int i;
        synchronized (this.l) {
            try {
                byte[] bArr = this.n;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f579o >= this.p) {
                    int i2 = this.l.read(bArr, 0, bArr.length);
                    if (i2 == -1) {
                        throw new EOFException();
                    }
                    this.f579o = 0;
                    this.p = i2;
                }
                for (int i3 = this.f579o; i3 != this.p; i3++) {
                    byte[] bArr2 = this.n;
                    if (bArr2[i3] == 10) {
                        int i4 = this.f579o;
                        if (i3 != i4) {
                            i = i3 - 1;
                            if (bArr2[i] != 13) {
                                i = i3;
                            }
                        } else {
                            i = i3;
                        }
                        String str = new String(bArr2, i4, i - i4, this.m.name());
                        this.f579o = i3 + 1;
                        return str;
                    }
                }
                Ug0 ug0 = new Ug0(this, (this.p - this.f579o) + 80);
                while (true) {
                    byte[] bArr3 = this.n;
                    int i5 = this.f579o;
                    ug0.write(bArr3, i5, this.p - i5);
                    this.p = -1;
                    byte[] bArr4 = this.n;
                    int i6 = this.l.read(bArr4, 0, bArr4.length);
                    if (i6 == -1) {
                        throw new EOFException();
                    }
                    this.f579o = 0;
                    this.p = i6;
                    for (int i7 = 0; i7 != this.p; i7++) {
                        byte[] bArr5 = this.n;
                        if (bArr5[i7] == 10) {
                            int i8 = this.f579o;
                            if (i7 != i8) {
                                ug0.write(bArr5, i8, i7 - i8);
                            }
                            this.f579o = i7 + 1;
                            return ug0.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.l) {
            try {
                if (this.n != null) {
                    this.n = null;
                    this.l.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
