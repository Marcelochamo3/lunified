package o;

import j$.util.Objects;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class VH extends QH {
    public final Serializable l;

    public VH(Boolean bool) {
        Objects.requireNonNull(bool);
        this.l = bool;
    }

    public static boolean j(VH vh) {
        Serializable serializable = vh.l;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // o.QH
    public final boolean a() {
        Serializable serializable = this.l;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(h());
    }

    @Override // o.QH
    public final int d() {
        return this.l instanceof Number ? i().intValue() : Integer.parseInt(h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || VH.class != obj.getClass()) {
            return false;
        }
        VH vh = (VH) obj;
        Serializable serializable = this.l;
        Serializable serializable2 = vh.l;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (j(this) && j(vh)) {
            return i().longValue() == vh.i().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = i().doubleValue();
        double dDoubleValue2 = vh.i().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // o.QH
    public final String h() {
        Serializable serializable = this.l;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return i().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.l;
        if (serializable == null) {
            return 31;
        }
        if (j(this)) {
            jDoubleToLongBits = i().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(i().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    public final Number i() {
        Serializable serializable = this.l;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new BJ((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public VH(Number number) {
        Objects.requireNonNull(number);
        this.l = number;
    }

    public VH(String str) {
        Objects.requireNonNull(str);
        this.l = str;
    }
}
