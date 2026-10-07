package o;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ZH extends WH {
    public static final YH E = new YH();
    public static final Object F = new Object();
    public Object[] A;
    public int B;
    public String[] C;
    public int[] D;

    @Override // o.WH
    public final String K() {
        return s0(false);
    }

    @Override // o.WH
    public final String R() {
        return s0(true);
    }

    @Override // o.WH
    public final boolean W() {
        int iJ0 = j0();
        return (iJ0 == 4 || iJ0 == 2 || iJ0 == 10) ? false : true;
    }

    @Override // o.WH
    public final boolean Z() {
        r0(8);
        boolean zA = ((VH) w0()).a();
        int i = this.B;
        if (i > 0) {
            int[] iArr = this.D;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return zA;
    }

    @Override // o.WH
    public final void a() {
        r0(1);
        x0(((OH) v0()).l.iterator());
        this.D[this.B - 1] = 0;
    }

    @Override // o.WH
    public final double a0() throws C2164mN {
        int iJ0 = j0();
        if (iJ0 != 7 && iJ0 != 6) {
            throw new IllegalStateException("Expected " + AbstractC1701hf0.E(7) + " but was " + AbstractC1701hf0.E(iJ0) + t0());
        }
        VH vh = (VH) v0();
        double dDoubleValue = vh.l instanceof Number ? vh.i().doubleValue() : Double.parseDouble(vh.h());
        if (!this.m && (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            throw new C2164mN("JSON forbids NaN and infinities: " + dDoubleValue);
        }
        w0();
        int i = this.B;
        if (i > 0) {
            int[] iArr = this.D;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return dDoubleValue;
    }

    @Override // o.WH
    public final int b0() {
        int iJ0 = j0();
        if (iJ0 != 7 && iJ0 != 6) {
            throw new IllegalStateException("Expected " + AbstractC1701hf0.E(7) + " but was " + AbstractC1701hf0.E(iJ0) + t0());
        }
        int iD = ((VH) v0()).d();
        w0();
        int i = this.B;
        if (i > 0) {
            int[] iArr = this.D;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return iD;
    }

    @Override // o.WH
    public final long c0() {
        int iJ0 = j0();
        if (iJ0 != 7 && iJ0 != 6) {
            throw new IllegalStateException("Expected " + AbstractC1701hf0.E(7) + " but was " + AbstractC1701hf0.E(iJ0) + t0());
        }
        VH vh = (VH) v0();
        long jLongValue = vh.l instanceof Number ? vh.i().longValue() : Long.parseLong(vh.h());
        w0();
        int i = this.B;
        if (i > 0) {
            int[] iArr = this.D;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return jLongValue;
    }

    @Override // o.WH, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A = new Object[]{F};
        this.B = 1;
    }

    @Override // o.WH
    public final String d0() {
        return u0(false);
    }

    @Override // o.WH
    public final void f() {
        r0(3);
        x0(((C3033vK) ((TH) v0()).l.entrySet()).iterator());
    }

    @Override // o.WH
    public final void f0() {
        r0(9);
        w0();
        int i = this.B;
        if (i > 0) {
            int[] iArr = this.D;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // o.WH
    public final String h0() {
        int iJ0 = j0();
        if (iJ0 != 6 && iJ0 != 7) {
            throw new IllegalStateException("Expected " + AbstractC1701hf0.E(6) + " but was " + AbstractC1701hf0.E(iJ0) + t0());
        }
        String strH = ((VH) w0()).h();
        int i = this.B;
        if (i > 0) {
            int[] iArr = this.D;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return strH;
    }

    @Override // o.WH
    public final int j0() {
        if (this.B == 0) {
            return 10;
        }
        Object objV0 = v0();
        if (objV0 instanceof Iterator) {
            boolean z = this.A[this.B - 2] instanceof TH;
            Iterator it = (Iterator) objV0;
            if (!it.hasNext()) {
                return z ? 4 : 2;
            }
            if (z) {
                return 5;
            }
            x0(it.next());
            return j0();
        }
        if (objV0 instanceof TH) {
            return 3;
        }
        if (objV0 instanceof OH) {
            return 1;
        }
        if (objV0 instanceof VH) {
            Serializable serializable = ((VH) objV0).l;
            if (serializable instanceof String) {
                return 6;
            }
            if (serializable instanceof Boolean) {
                return 8;
            }
            if (serializable instanceof Number) {
                return 7;
            }
            throw new AssertionError();
        }
        if (objV0 instanceof SH) {
            return 9;
        }
        if (objV0 == F) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw new C2164mN("Custom JsonElement subclass " + objV0.getClass().getName() + " is not supported");
    }

    @Override // o.WH
    public final void p() {
        r0(2);
        w0();
        w0();
        int i = this.B;
        if (i > 0) {
            int[] iArr = this.D;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // o.WH
    public final void p0() {
        int iW = AbstractC1701hf0.w(j0());
        if (iW == 1) {
            p();
            return;
        }
        if (iW != 9) {
            if (iW == 3) {
                q();
                return;
            }
            if (iW == 4) {
                u0(true);
                return;
            }
            w0();
            int i = this.B;
            if (i > 0) {
                int[] iArr = this.D;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
        }
    }

    @Override // o.WH
    public final void q() {
        r0(4);
        this.C[this.B - 1] = null;
        w0();
        w0();
        int i = this.B;
        if (i > 0) {
            int[] iArr = this.D;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void r0(int i) {
        if (j0() == i) {
            return;
        }
        throw new IllegalStateException("Expected " + AbstractC1701hf0.E(i) + " but was " + AbstractC1701hf0.E(j0()) + t0());
    }

    public final String s0(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.B;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.A;
            Object obj = objArr[i];
            if (obj instanceof OH) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.D[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof TH) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.C[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    public final String t0() {
        return " at path " + s0(false);
    }

    @Override // o.WH
    public final String toString() {
        return ZH.class.getSimpleName() + t0();
    }

    public final String u0(boolean z) {
        r0(5);
        Map.Entry entry = (Map.Entry) ((Iterator) v0()).next();
        String str = (String) entry.getKey();
        this.C[this.B - 1] = z ? "<skipped>" : str;
        x0(entry.getValue());
        return str;
    }

    public final Object v0() {
        return this.A[this.B - 1];
    }

    public final Object w0() {
        Object[] objArr = this.A;
        int i = this.B - 1;
        this.B = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void x0(Object obj) {
        int i = this.B;
        Object[] objArr = this.A;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.A = Arrays.copyOf(objArr, i2);
            this.D = Arrays.copyOf(this.D, i2);
            this.C = (String[]) Arrays.copyOf(this.C, i2);
        }
        Object[] objArr2 = this.A;
        int i3 = this.B;
        this.B = i3 + 1;
        objArr2[i3] = obj;
    }
}
