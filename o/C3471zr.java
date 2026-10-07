package o;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: o.zr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3471zr {
    public final int a;
    public final int b;
    public final long c;
    public final byte[] d;

    public C3471zr(byte[] bArr, int i, int i2) {
        this(-1L, bArr, i, i2);
    }

    public static C3471zr a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0379Dr.C[4]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putInt((int) jArr[0]);
        return new C3471zr(byteBufferWrap.array(), 4, 1);
    }

    public static C3471zr b(C0327Br c0327Br, ByteOrder byteOrder) {
        C0327Br[] c0327BrArr = {c0327Br};
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0379Dr.C[5]]);
        byteBufferWrap.order(byteOrder);
        C0327Br c0327Br2 = c0327BrArr[0];
        byteBufferWrap.putInt((int) c0327Br2.a);
        byteBufferWrap.putInt((int) c0327Br2.b);
        return new C3471zr(byteBufferWrap.array(), 5, 1);
    }

    public static C3471zr c(int i, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[C0379Dr.C[3]]);
        byteBufferWrap.order(byteOrder);
        byteBufferWrap.putShort((short) new int[]{i}[0]);
        return new C3471zr(byteBufferWrap.array(), 3, 1);
    }

    public final double d(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (objG instanceof String) {
            return Double.parseDouble((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof C0327Br[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        C0327Br[] c0327BrArr = (C0327Br[]) objG;
        if (c0327BrArr.length != 1) {
            throw new NumberFormatException("There are more than one component");
        }
        C0327Br c0327Br = c0327BrArr[0];
        return c0327Br.a / c0327Br.b;
    }

    public final int e(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (objG instanceof String) {
            return Integer.parseInt((String) objG);
        }
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(objG instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) objG;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public final String f(ByteOrder byteOrder) throws Throwable {
        Object objG = g(byteOrder);
        if (objG == null) {
            return null;
        }
        if (objG instanceof String) {
            return (String) objG;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (objG instanceof long[]) {
            long[] jArr = (long[]) objG;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof int[]) {
            int[] iArr = (int[]) objG;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (objG instanceof double[]) {
            double[] dArr = (double[]) objG;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(objG instanceof C0327Br[])) {
            return null;
        }
        C0327Br[] c0327BrArr = (C0327Br[]) objG;
        while (i < c0327BrArr.length) {
            sb.append(c0327BrArr[i].a);
            sb.append('/');
            sb.append(c0327BrArr[i].b);
            i++;
            if (i != c0327BrArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r13v17, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r13v19, types: [java.io.Serializable, o.Br[]] */
    /* JADX WARN: Type inference failed for: r13v20, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v21, types: [int[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [java.io.Serializable, o.Br[]] */
    /* JADX WARN: Type inference failed for: r13v23, types: [double[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r13v24, types: [double[], java.io.Serializable] */
    public final Serializable g(ByteOrder byteOrder) throws Throwable {
        C3374yr c3374yr;
        byte b;
        int length = 0;
        byte[] bArr = this.d;
        C3374yr c3374yr2 = null;
        try {
            c3374yr = new C3374yr(bArr);
            try {
                c3374yr.m = byteOrder;
                int i = this.a;
                int i2 = this.b;
                switch (i) {
                    case 1:
                    case 6:
                        if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                            String str = new String(bArr, C0379Dr.L);
                            try {
                                c3374yr.close();
                                break;
                            } catch (IOException unused) {
                            }
                            return str;
                        }
                        String str2 = new String(new char[]{(char) (b + 48)});
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused2) {
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (i2 >= C0379Dr.D.length) {
                            int i3 = 0;
                            while (true) {
                                byte[] bArr2 = C0379Dr.D;
                                if (i3 >= bArr2.length) {
                                    length = bArr2.length;
                                } else if (bArr[i3] == bArr2[i3]) {
                                    i3++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        try {
                            while (length < i2) {
                                byte b2 = bArr[length];
                                if (b2 == 0) {
                                    String string = sb.toString();
                                    c3374yr.close();
                                    return string;
                                }
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            c3374yr.close();
                            break;
                        } catch (IOException unused3) {
                        }
                        String string2 = sb.toString();
                        return string2;
                    case 3:
                        ?? r13 = new int[i2];
                        while (length < i2) {
                            r13[length] = c3374yr.readUnsignedShort();
                            length++;
                        }
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused4) {
                        }
                        return r13;
                    case 4:
                        ?? r14 = new long[i2];
                        while (length < i2) {
                            r14[length] = ((long) c3374yr.readInt()) & 4294967295L;
                            length++;
                        }
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused5) {
                        }
                        return r14;
                    case 5:
                        ?? r15 = new C0327Br[i2];
                        while (length < i2) {
                            r15[length] = new C0327Br(((long) c3374yr.readInt()) & 4294967295L, ((long) c3374yr.readInt()) & 4294967295L);
                            length++;
                        }
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused6) {
                        }
                        return r15;
                    case 8:
                        ?? r16 = new int[i2];
                        while (length < i2) {
                            r16[length] = c3374yr.readShort();
                            length++;
                        }
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused7) {
                        }
                        return r16;
                    case 9:
                        ?? r17 = new int[i2];
                        while (length < i2) {
                            r17[length] = c3374yr.readInt();
                            length++;
                        }
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused8) {
                        }
                        return r17;
                    case 10:
                        ?? r18 = new C0327Br[i2];
                        while (length < i2) {
                            r18[length] = new C0327Br(c3374yr.readInt(), c3374yr.readInt());
                            length++;
                        }
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused9) {
                        }
                        return r18;
                    case 11:
                        ?? r19 = new double[i2];
                        while (length < i2) {
                            r19[length] = c3374yr.readFloat();
                            length++;
                        }
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused10) {
                        }
                        return r19;
                    case 12:
                        ?? r110 = new double[i2];
                        while (length < i2) {
                            r110[length] = c3374yr.readDouble();
                            length++;
                        }
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused11) {
                        }
                        return r110;
                    default:
                        try {
                            c3374yr.close();
                            break;
                        } catch (IOException unused12) {
                        }
                        return null;
                }
            } catch (IOException unused13) {
                if (c3374yr != null) {
                    try {
                        c3374yr.close();
                    } catch (IOException unused14) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                c3374yr2 = c3374yr;
                if (c3374yr2 != null) {
                    try {
                        c3374yr2.close();
                    } catch (IOException unused15) {
                    }
                }
                throw th;
            }
        } catch (IOException unused16) {
            c3374yr = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(C0379Dr.B[this.a]);
        sb.append(", data length:");
        return AbstractC1701hf0.g(sb, this.d.length, ")");
    }

    public C3471zr(long j, byte[] bArr, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = bArr;
    }
}
