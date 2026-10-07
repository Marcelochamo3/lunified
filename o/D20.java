package o;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class D20 {
    public static final BigInteger a;
    public static final BigInteger b;
    public static final SecureRandom c;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        a = bigInteger.shiftLeft(Yu0.b.m0).subtract(BigInteger.valueOf(5L));
        b = bigInteger.shiftLeft(128);
        c = new SecureRandom();
    }

    public static byte[] a(byte[] bArr, byte[] bArr2, int i) {
        int i2;
        int[] iArr = new int[16];
        byte[] bytes = "expand 32-byte k".getBytes(AbstractC1305dd.b);
        AbstractC1474fG.i(bytes, "getBytes(...)");
        int i3 = 0;
        while (true) {
            i2 = 4;
            if (i3 >= 4) {
                break;
            }
            iArr[i3] = e(i3 * 4, bytes);
            i3++;
        }
        for (int i4 = 0; i4 < 8; i4++) {
            iArr[i4 + 4] = e(i4 * 4, bArr);
        }
        iArr[12] = i;
        iArr[13] = e(0, bArr2);
        int i5 = 14;
        iArr[14] = e(4, bArr2);
        iArr[15] = e(8, bArr2);
        int[] iArrCopyOf = Arrays.copyOf(iArr, 16);
        AbstractC1474fG.i(iArrCopyOf, "copyOf(...)");
        int i6 = 0;
        while (i6 < 10) {
            d(0, i2, 8, 12, iArrCopyOf);
            d(1, 5, 9, 13, iArrCopyOf);
            d(2, 6, 10, i5, iArrCopyOf);
            d(3, 7, 11, 15, iArrCopyOf);
            d(0, 5, 10, 15, iArrCopyOf);
            d(1, 6, 11, 12, iArrCopyOf);
            d(2, 7, 8, 13, iArrCopyOf);
            d(3, 4, 9, 14, iArrCopyOf);
            i6++;
            i2 = 4;
            i5 = 14;
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        int length = iArrCopyOf.length;
        for (int i7 = 0; i7 < length; i7++) {
            byteBufferOrder.putInt(iArrCopyOf[i7] + iArr[i7]);
        }
        byte[] bArrArray = byteBufferOrder.array();
        AbstractC1474fG.i(bArrArray, "array(...)");
        return bArrArray;
    }

    public static String b(String str, byte[] bArr) {
        byte[] bArrM;
        int i = 1;
        if (!(!(bArr.length == 0)) || bArr.length > 16384) {
            throw new IllegalArgumentException("Respuesta PPV fuera de rango".toString());
        }
        byte[] bytes = str.getBytes(AbstractC1305dd.b);
        AbstractC1474fG.i(bytes, "getBytes(...)");
        if (bytes.length == 32) {
            for (int i2 = 0; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if ('!' <= cCharAt && cCharAt < 127) {
                }
            }
            int i3 = 0;
            while (true) {
                if (i3 >= bArr.length) {
                    bArrM = null;
                    break;
                }
                C1101bX c1101bXF = f(i3, bArr);
                int iIntValue = ((Number) c1101bXF.l).intValue();
                int iIntValue2 = ((Number) c1101bXF.m).intValue();
                if ((iIntValue & 7) != 2) {
                    throw new IllegalArgumentException("Tipo protobuf PPV no soportado".toString());
                }
                C1101bX c1101bXF2 = f(iIntValue2, bArr);
                int iIntValue3 = ((Number) c1101bXF2.l).intValue();
                int iIntValue4 = ((Number) c1101bXF2.m).intValue();
                if (iIntValue3 < 0 || iIntValue3 > bArr.length - iIntValue4) {
                    throw new IllegalArgumentException("Longitud protobuf PPV inválida".toString());
                }
                if ((iIntValue >>> 3) == 1) {
                    bArrM = X5.M(bArr, iIntValue4, iIntValue3 + iIntValue4);
                    break;
                }
                i3 = iIntValue4 + iIntValue3;
            }
            if (bArrM == null) {
                throw new IllegalArgumentException("Respuesta PPV sin stream");
            }
            int length = bArrM.length;
            byte[] bArr2 = new byte[length];
            int length2 = bArrM.length;
            for (int i4 = 0; i4 < length2; i4++) {
                byte b2 = bArrM[i4];
                int i5 = b2 & 255;
                if (33 <= i5 && i5 < 127) {
                    b2 = (byte) (((i5 + 38) % 94) + 33);
                }
                bArr2[i4] = b2;
            }
            if (length % 4 == 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    int i7 = bArr2[i6] & 255;
                    if ((65 <= i7 && i7 < 91) || ((97 <= i7 && i7 < 123) || ((48 <= i7 && i7 < 58) || i7 == 43 || i7 == 47 || i7 == 61))) {
                    }
                }
                P7 p7 = new P7();
                if (length != 0) {
                    C1562g8 c1562g8 = new C1562g8(0);
                    p7.b(bArr2, length, c1562g8);
                    p7.b(bArr2, -1, c1562g8);
                    int i8 = c1562g8.d;
                    bArr2 = new byte[i8];
                    if (((byte[]) c1562g8.g) != null) {
                        int iMin = Math.min(i8 - c1562g8.e, i8);
                        System.arraycopy((byte[]) c1562g8.g, c1562g8.e, bArr2, 0, iMin);
                        int i9 = c1562g8.e + iMin;
                        c1562g8.e = i9;
                        if (i9 >= c1562g8.d) {
                            c1562g8.g = null;
                        }
                    }
                }
                if (bArr2.length < 28) {
                    throw new IllegalArgumentException("Stream PPV cifrado incompleto".toString());
                }
                byte[] bArrM2 = X5.M(bArr2, 0, 12);
                byte[] bArrM3 = X5.M(bArr2, 12, bArr2.length);
                byte[] bArr3 = new byte[0];
                if (bytes.length != 32) {
                    throw new IllegalArgumentException("ChaCha20 requiere una clave de 32 bytes".toString());
                }
                if (bArrM2.length != 12) {
                    throw new IllegalArgumentException("ChaCha20 requiere un nonce de 12 bytes".toString());
                }
                if (bArrM3.length < 16) {
                    throw new IllegalArgumentException("Falta la etiqueta Poly1305".toString());
                }
                byte[] bArrM4 = X5.M(bArrM3, 0, bArrM3.length - 16);
                byte[] bArrM5 = X5.M(bArrM3, bArrM4.length, bArrM3.length);
                byte[] bArrM6 = X5.M(a(bytes, bArrM2, 0), 0, 32);
                byte[] bArrM7 = X5.M(bArrM6, 0, 16);
                bArrM7[3] = (byte) (bArrM7[3] & 15);
                bArrM7[7] = (byte) (bArrM7[7] & 15);
                bArrM7[11] = (byte) (bArrM7[11] & 15);
                bArrM7[15] = (byte) (bArrM7[15] & 15);
                bArrM7[4] = (byte) (bArrM7[4] & 252);
                bArrM7[8] = (byte) (bArrM7[8] & 252);
                bArrM7[12] = (byte) (bArrM7[12] & 252);
                BigInteger bigIntegerC = c(bArrM7);
                BigInteger bigIntegerC2 = c(X5.M(bArrM6, 16, 32));
                C3421zK c3421zK = new C3421zK();
                c3421zK.add(bArr3);
                c3421zK.add(new byte[0]);
                c3421zK.add(bArrM4);
                c3421zK.add(new byte[(16 - (bArrM4.length % 16)) % 16]);
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byte[] bArrArray = byteBufferAllocate.order(byteOrder).putLong(0).array();
                AbstractC1474fG.i(bArrArray, "array(...)");
                c3421zK.add(bArrArray);
                byte[] bArrArray2 = ByteBuffer.allocate(8).order(byteOrder).putLong(bArrM4.length).array();
                AbstractC1474fG.i(bArrArray2, "array(...)");
                c3421zK.add(bArrArray2);
                C3421zK c3421zKH = AbstractC2506pt.h(c3421zK);
                byte[] bArrT = new byte[0];
                ListIterator listIterator = c3421zKH.listIterator(0);
                while (true) {
                    C3324yK c3324yK = (C3324yK) listIterator;
                    if (!c3324yK.hasNext()) {
                        break;
                    }
                    bArrT = X5.T(bArrT, (byte[]) c3324yK.next());
                }
                BigInteger bigIntegerMod = BigInteger.ZERO;
                int i10 = 0;
                while (i10 < bArrT.length) {
                    int iMin2 = Math.min(16, bArrT.length - i10);
                    int i11 = i10 + iMin2;
                    bigIntegerMod = bigIntegerMod.add(c(X5.M(bArrT, i10, i11)).add(BigInteger.ONE.shiftLeft(iMin2 * 8))).multiply(bigIntegerC).mod(a);
                    i10 = i11;
                }
                BigInteger bigIntegerMod2 = bigIntegerMod.add(bigIntegerC2).mod(b);
                AbstractC1474fG.i(bigIntegerMod2, "mod(...)");
                byte[] byteArray = bigIntegerMod2.toByteArray();
                byte[] bArr4 = new byte[16];
                int iMin3 = Math.min(16, byteArray.length);
                for (int i12 = 0; i12 < iMin3; i12++) {
                    bArr4[i12] = byteArray[(byteArray.length - 1) - i12];
                }
                if (!MessageDigest.isEqual(bArrM5, bArr4)) {
                    throw new IllegalArgumentException("Firma del stream PPV inválida".toString());
                }
                byte[] bArr5 = new byte[bArrM4.length];
                int i13 = 0;
                while (i13 < bArrM4.length) {
                    int i14 = i + 1;
                    byte[] bArrA = a(bytes, bArrM2, i);
                    int iMin4 = Math.min(64, bArrM4.length - i13);
                    for (int i15 = 0; i15 < iMin4; i15++) {
                        int i16 = i13 + i15;
                        bArr5[i16] = (byte) (bArrM4[i16] ^ bArrA[i15]);
                    }
                    i13 += iMin4;
                    i = i14;
                }
                return new String(bArr5, AbstractC1305dd.a);
            }
            throw new IllegalArgumentException("Stream PPV con codificación inválida".toString());
        }
        throw new IllegalArgumentException("Clave de respuesta PPV inválida".toString());
    }

    public static BigInteger c(byte[] bArr) {
        if (bArr.length != 0) {
            byte[] bArr2 = new byte[bArr.length];
            int length = bArr.length - 1;
            YF it = new ZF(0, length, 1).iterator();
            while (it.n) {
                int iA = it.a();
                bArr2[length - iA] = bArr[iA];
            }
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }

    public static void d(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int iRotateLeft = Integer.rotateLeft(i5 ^ iArr[i4], 16);
        iArr[i4] = iRotateLeft;
        int i6 = iArr[i3] + iRotateLeft;
        iArr[i3] = i6;
        int iRotateLeft2 = Integer.rotateLeft(iArr[i2] ^ i6, 12);
        iArr[i2] = iRotateLeft2;
        int i7 = iArr[i] + iRotateLeft2;
        iArr[i] = i7;
        int iRotateLeft3 = Integer.rotateLeft(iArr[i4] ^ i7, 8);
        iArr[i4] = iRotateLeft3;
        int i8 = iArr[i3] + iRotateLeft3;
        iArr[i3] = i8;
        iArr[i2] = Integer.rotateLeft(iArr[i2] ^ i8, 7);
    }

    public static int e(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static C1101bX f(int i, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        while (i < bArr.length && i2 <= 28) {
            int i4 = i + 1;
            byte b2 = bArr[i];
            i3 |= (b2 & 127) << i2;
            if ((b2 & 128) == 0) {
                return new C1101bX(Integer.valueOf(i3), Integer.valueOf(i4));
            }
            i2 += 7;
            i = i4;
        }
        throw new IllegalArgumentException("Varint PPV inválido");
    }
}
