package o;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: o.Wk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0865Wk implements PE {
    public static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static int e(InterfaceC0839Vk interfaceC0839Vk, C1813in c1813in) {
        int iS;
        try {
            int iS2 = interfaceC0839Vk.s();
            if ((iS2 & 65496) != 65496 && iS2 != 19789 && iS2 != 18761) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (true) {
                if (interfaceC0839Vk.l() != 255) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    short sL = interfaceC0839Vk.l();
                    if (sL != 218) {
                        if (sL != 217) {
                            iS = interfaceC0839Vk.s() - 2;
                            if (sL == 225) {
                                break;
                            }
                            long j = iS;
                            if (interfaceC0839Vk.skip(j) != j) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        } else {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        }
                    }
                }
                iS = -1;
                break;
            }
            if (iS == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) c1813in.g(iS, byte[].class);
            try {
                return g(interfaceC0839Vk, bArr, iS);
            } finally {
                c1813in.l(bArr);
            }
        } catch (C0813Uk unused) {
            return -1;
        }
    }

    public static ImageHeaderParser$ImageType f(InterfaceC0839Vk interfaceC0839Vk) {
        try {
            int iS = interfaceC0839Vk.s();
            if (iS == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int iL = (iS << 8) | interfaceC0839Vk.l();
            if (iL == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int iL2 = (iL << 8) | interfaceC0839Vk.l();
            if (iL2 == -1991225785) {
                interfaceC0839Vk.skip(21L);
                try {
                    return interfaceC0839Vk.l() >= 3 ? ImageHeaderParser$ImageType.PNG_A : ImageHeaderParser$ImageType.PNG;
                } catch (C0813Uk unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            }
            if (iL2 == 1380533830) {
                interfaceC0839Vk.skip(4L);
                if (((interfaceC0839Vk.s() << 16) | interfaceC0839Vk.s()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int iS2 = (interfaceC0839Vk.s() << 16) | interfaceC0839Vk.s();
                if ((iS2 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = iS2 & 255;
                if (i != 88) {
                    if (i != 76) {
                        return ImageHeaderParser$ImageType.WEBP;
                    }
                    interfaceC0839Vk.skip(4L);
                    return (interfaceC0839Vk.l() & 8) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
                }
                interfaceC0839Vk.skip(4L);
                short sL = interfaceC0839Vk.l();
                if ((sL & 2) != 0) {
                    return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                }
                return (sL & 16) != 0 ? ImageHeaderParser$ImageType.WEBP_A : ImageHeaderParser$ImageType.WEBP;
            }
            if (((interfaceC0839Vk.s() << 16) | interfaceC0839Vk.s()) != 1718909296) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            }
            int iS3 = (interfaceC0839Vk.s() << 16) | interfaceC0839Vk.s();
            if (iS3 == 1635150195) {
                return ImageHeaderParser$ImageType.ANIMATED_AVIF;
            }
            int i2 = 0;
            boolean z = iS3 == 1635150182;
            interfaceC0839Vk.skip(4L);
            int i3 = iL2 - 16;
            if (i3 % 4 == 0) {
                while (i2 < 5 && i3 > 0) {
                    int iS4 = (interfaceC0839Vk.s() << 16) | interfaceC0839Vk.s();
                    if (iS4 == 1635150195) {
                        return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                    }
                    if (iS4 == 1635150182) {
                        z = true;
                    }
                    i2++;
                    i3 -= 4;
                }
            }
            return z ? ImageHeaderParser$ImageType.AVIF : ImageHeaderParser$ImageType.UNKNOWN;
        } catch (C0813Uk unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int g(InterfaceC0839Vk interfaceC0839Vk, byte[] bArr, int i) {
        ByteOrder byteOrder;
        if (interfaceC0839Vk.x(i, bArr) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = a;
        boolean z = bArr != null && i > bArr2.length;
        if (z) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                if (bArr[i2] != bArr2[i2]) {
                    z = false;
                    break;
                }
            }
        }
        if (!z) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        C2080la c2080la = new C2080la(i, bArr);
        short sB = c2080la.b(6);
        if (sB == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sB != 19789) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        ByteBuffer byteBuffer = c2080la.m;
        byteBuffer.order(byteOrder);
        int i3 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sB2 = c2080la.b(i3 + 6);
        for (int i4 = 0; i4 < sB2; i4++) {
            int i5 = (i4 * 12) + i3 + 8;
            if (c2080la.b(i5) == 274) {
                short sB3 = c2080la.b(i5 + 2);
                if (sB3 < 1 || sB3 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int i6 = i5 + 4;
                    int i7 = byteBuffer.remaining() - i6 >= 4 ? byteBuffer.getInt(i6) : -1;
                    if (i7 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                        int i8 = i7 + b[sB3];
                        if (i8 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i9 = i5 + 8;
                            if (i9 < 0 || i9 > byteBuffer.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                if (i8 >= 0 && i8 + i9 <= byteBuffer.remaining()) {
                                    return c2080la.b(i9);
                                }
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    @Override // o.PE
    public final ImageHeaderParser$ImageType a(ByteBuffer byteBuffer) {
        AbstractC3045vW.k(byteBuffer, "Argument must not be null");
        return f(new C2080la(byteBuffer, 1));
    }

    @Override // o.PE
    public final int b(ByteBuffer byteBuffer, C1813in c1813in) {
        AbstractC3045vW.k(byteBuffer, "Argument must not be null");
        C2080la c2080la = new C2080la(byteBuffer, 1);
        AbstractC3045vW.k(c1813in, "Argument must not be null");
        return e(c2080la, c1813in);
    }

    @Override // o.PE
    public final int c(InputStream inputStream, C1813in c1813in) {
        AbstractC3045vW.k(inputStream, "Argument must not be null");
        C2133m1 c2133m1 = new C2133m1(18, inputStream);
        AbstractC3045vW.k(c1813in, "Argument must not be null");
        return e(c2133m1, c1813in);
    }

    @Override // o.PE
    public final ImageHeaderParser$ImageType d(InputStream inputStream) {
        AbstractC3045vW.k(inputStream, "Argument must not be null");
        return f(new C2133m1(18, inputStream));
    }
}
