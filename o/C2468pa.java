package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: o.pa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2468pa implements Serializable, Comparable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C2468pa f972o = new C2468pa(new byte[0]);
    private static final long serialVersionUID = 1;
    public final byte[] l;
    public transient int m;
    public transient String n;

    public C2468pa(byte[] bArr) {
        AbstractC1474fG.j(bArr, "data");
        this.l = bArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws IllegalAccessException, NoSuchFieldException, IOException {
        int i = objectInputStream.readInt();
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC1674hK.n(i, "byteCount < 0: ").toString());
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = objectInputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        C2468pa c2468pa = new C2468pa(bArr);
        Field declaredField = C2468pa.class.getDeclaredField("l");
        declaredField.setAccessible(true);
        declaredField.set(this, c2468pa.l);
    }

    private final void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.l.length);
        objectOutputStream.write(this.l);
    }

    public String a() {
        return AbstractC1252d.a(this.l, AbstractC1252d.a);
    }

    public String b() {
        return AbstractC1252d.a(this.l, AbstractC1252d.b);
    }

    public C2468pa c(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.l, 0, d());
        byte[] bArrDigest = messageDigest.digest();
        AbstractC1474fG.g(bArrDigest);
        return new C2468pa(bArrDigest);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x002c A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2468pa c2468pa = (C2468pa) obj;
        AbstractC1474fG.j(c2468pa, "other");
        int iD = d();
        int iD2 = c2468pa.d();
        int iMin = Math.min(iD, iD2);
        for (int i = 0; i < iMin; i++) {
            int iG = g(i) & 255;
            int iG2 = c2468pa.g(i) & 255;
            if (iG != iG2) {
                if (iG < iG2) {
                    return -1;
                }
                return 1;
            }
        }
        if (iD == iD2) {
            return 0;
        }
        if (iD < iD2) {
            return -1;
        }
        return 1;
    }

    public int d() {
        return this.l.length;
    }

    public String e() {
        byte[] bArr = this.l;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = AbstractC3021v9.a;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2468pa) {
            C2468pa c2468pa = (C2468pa) obj;
            int iD = c2468pa.d();
            byte[] bArr = this.l;
            if (iD == bArr.length && c2468pa.h(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public byte[] f() {
        return this.l;
    }

    public byte g(int i) {
        return this.l[i];
    }

    public boolean h(int i, int i2, int i3, byte[] bArr) {
        AbstractC1474fG.j(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.l;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && AbstractC2506pt.e(i, i2, i3, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.m;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.l);
        this.m = iHashCode;
        return iHashCode;
    }

    public boolean i(C2468pa c2468pa, int i) {
        AbstractC1474fG.j(c2468pa, "other");
        return c2468pa.h(0, 0, i, this.l);
    }

    public C2468pa j() {
        int i = 0;
        while (true) {
            byte[] bArr = this.l;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC1474fG.i(bArrCopyOf, "copyOf(this, size)");
                bArrCopyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArrCopyOf.length; i2++) {
                    byte b2 = bArrCopyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArrCopyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new C2468pa(bArrCopyOf);
            }
            i++;
        }
    }

    public final String k() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        byte[] bArrF = f();
        AbstractC1474fG.j(bArrF, "<this>");
        String str2 = new String(bArrF, AbstractC1305dd.a);
        this.n = str2;
        return str2;
    }

    public void l(E9 e9, int i) {
        AbstractC1474fG.j(e9, "buffer");
        e9.d0(this.l, 0, i);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003c A[EDGE_INSN: B:22:0x003c->B:180:0x01a6 BREAK  A[LOOP:0: B:6:0x000f->B:238:0x000f]] */
    public String toString() {
        byte b;
        int i;
        byte[] bArr = this.l;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if ((b2 >> 5) != -2) {
                    if ((b2 >> 4) != -2) {
                        if ((b2 >> 3) != -2) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i5 = i2 + 3;
                        if (length > i5) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i5];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i6 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i6 <= 1114111) {
                                if (55296 <= i6 && i6 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i6 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i6 != 10 && i6 != 13 && ((i6 >= 0 && i6 < 32) || (127 <= i6 && i6 < 160))) || i6 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i6 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i7 = i2 + 2;
                        if (length > i7) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i7];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i8 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i8 >= 2048) {
                                if (55296 <= i8 && i8 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i8 != 10 && i8 != 13 && ((i8 >= 0 && i8 < 32) || (127 <= i8 && i8 < 160))) || i8 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i8 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i9 = i2 + 1;
                    if (length > i9) {
                        byte b8 = bArr[i9];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i10 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i10 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i10 != 10 && i10 != 13 && ((i10 >= 0 && i10 < 32) || (127 <= i10 && i10 < 160))) || i10 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i10 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i11 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i11;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i11 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strK = k();
            String strSubstring = strK.substring(0, i3);
            AbstractC1474fG.i(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strR = AbstractC1899jh0.R(AbstractC1899jh0.R(AbstractC1899jh0.R(strSubstring, "\\", "\\\\", false), "\n", "\\n", false), "\r", "\\r", false);
            if (i3 >= strK.length()) {
                return "[text=" + strR + ']';
            }
            return "[size=" + this.l.length + " text=" + strR + "…]";
        }
        if (this.l.length <= 64) {
            return "[hex=" + e() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(this.l.length);
        sb.append(" hex=");
        byte[] bArr2 = this.l;
        if (64 <= bArr2.length) {
            sb.append((64 == bArr2.length ? this : new C2468pa(X5.M(bArr2, 0, 64))).e());
            sb.append("…]");
            return sb.toString();
        }
        throw new IllegalArgumentException(("endIndex > length(" + this.l.length + ')').toString());
    }
}
