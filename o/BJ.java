package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes.dex */
public final class BJ extends Number {
    public final String l;

    public BJ(String str) {
        this.l = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new BigDecimal(this.l);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BJ)) {
            return false;
        }
        Object obj2 = ((BJ) obj).l;
        String str = this.l;
        return str == obj2 || str.equals(obj2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.l;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return new BigDecimal(str).intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(str);
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.l;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return new BigDecimal(str).longValue();
        }
    }

    public final String toString() {
        return this.l;
    }
}
