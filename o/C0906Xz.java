package o;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: o.Xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0906Xz {
    public ByteBuffer b;
    public C0880Wz c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final boolean a() {
        return this.c.b != 0;
    }

    public final C0880Wz b() {
        byte[] bArr;
        if (this.b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (a()) {
            return this.c;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) c());
        }
        if (sb.toString().startsWith("GIF")) {
            this.c.f = this.b.getShort();
            this.c.g = this.b.getShort();
            int iC = c();
            C0880Wz c0880Wz = this.c;
            c0880Wz.h = (iC & 128) != 0;
            c0880Wz.i = (int) Math.pow(2.0d, (iC & 7) + 1);
            this.c.j = c();
            C0880Wz c0880Wz2 = this.c;
            c();
            c0880Wz2.getClass();
            if (this.c.h && !a()) {
                C0880Wz c0880Wz3 = this.c;
                c0880Wz3.a = e(c0880Wz3.i);
                C0880Wz c0880Wz4 = this.c;
                c0880Wz4.k = c0880Wz4.a[c0880Wz4.j];
            }
        } else {
            this.c.b = 1;
        }
        if (!a()) {
            boolean z = false;
            while (!z && !a() && this.c.c <= Integer.MAX_VALUE) {
                int iC2 = c();
                if (iC2 == 33) {
                    int iC3 = c();
                    if (iC3 == 1) {
                        f();
                    } else if (iC3 == 249) {
                        this.c.d = new C0750Rz();
                        c();
                        int iC4 = c();
                        C0750Rz c0750Rz = this.c.d;
                        int i2 = (iC4 & 28) >> 2;
                        c0750Rz.g = i2;
                        if (i2 == 0) {
                            c0750Rz.g = 1;
                        }
                        c0750Rz.f = (iC4 & 1) != 0;
                        short s = this.b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        C0750Rz c0750Rz2 = this.c.d;
                        c0750Rz2.i = s * 10;
                        c0750Rz2.h = c();
                        c();
                    } else if (iC3 == 254) {
                        f();
                    } else if (iC3 != 255) {
                        f();
                    } else {
                        d();
                        StringBuilder sb2 = new StringBuilder();
                        int i3 = 0;
                        while (true) {
                            bArr = this.a;
                            if (i3 >= 11) {
                                break;
                            }
                            sb2.append((char) bArr[i3]);
                            i3++;
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            do {
                                d();
                                if (bArr[0] == 1) {
                                    byte b = bArr[1];
                                    byte b2 = bArr[2];
                                    this.c.getClass();
                                }
                                if (this.d <= 0) {
                                    break;
                                }
                            } while (!a());
                        } else {
                            f();
                        }
                    }
                } else if (iC2 == 44) {
                    C0880Wz c0880Wz5 = this.c;
                    if (c0880Wz5.d == null) {
                        c0880Wz5.d = new C0750Rz();
                    }
                    c0880Wz5.d.a = this.b.getShort();
                    this.c.d.b = this.b.getShort();
                    this.c.d.c = this.b.getShort();
                    this.c.d.d = this.b.getShort();
                    int iC5 = c();
                    boolean z2 = (iC5 & 128) != 0;
                    int iPow = (int) Math.pow(2.0d, (iC5 & 7) + 1);
                    C0750Rz c0750Rz3 = this.c.d;
                    c0750Rz3.e = (iC5 & 64) != 0;
                    if (z2) {
                        c0750Rz3.k = e(iPow);
                    } else {
                        c0750Rz3.k = null;
                    }
                    this.c.d.j = this.b.position();
                    c();
                    f();
                    if (!a()) {
                        C0880Wz c0880Wz6 = this.c;
                        c0880Wz6.c++;
                        c0880Wz6.e.add(c0880Wz6.d);
                    }
                } else if (iC2 != 59) {
                    this.c.b = 1;
                } else {
                    z = true;
                }
            }
            C0880Wz c0880Wz7 = this.c;
            if (c0880Wz7.c < 0) {
                c0880Wz7.b = 1;
            }
        }
        return this.c;
    }

    public final int c() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final void d() {
        int iC = c();
        this.d = iC;
        if (iC <= 0) {
            return;
        }
        int i = 0;
        while (true) {
            try {
                int i2 = this.d;
                if (i >= i2) {
                    return;
                }
                int i3 = i2 - i;
                this.b.get(this.a, i, i3);
                i += i3;
            } catch (Exception unused) {
                Log.isLoggable("GifHeaderParser", 3);
                this.c.b = 1;
                return;
            }
        }
    }

    public final int[] e(int i) {
        byte[] bArr = new byte[i * 3];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = bArr[i3] & 255;
                int i5 = i3 + 2;
                int i6 = bArr[i3 + 1] & 255;
                i3 += 3;
                int i7 = i2 + 1;
                iArr[i2] = (i6 << 8) | (i4 << 16) | (-16777216) | (bArr[i5] & 255);
                i2 = i7;
            }
        } catch (BufferUnderflowException unused) {
            Log.isLoggable("GifHeaderParser", 3);
            this.c.b = 1;
        }
        return iArr;
    }

    public final void f() {
        int iC;
        do {
            iC = c();
            this.b.position(Math.min(this.b.position() + iC, this.b.limit()));
        } while (iC > 0);
    }
}
