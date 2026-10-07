package o;

import j$.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class Pr0 implements ParameterizedType {
    public final Type l;
    public final Type m;
    public final Type[] n;

    public Pr0(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                throw new IllegalArgumentException();
            }
        }
        for (Type type3 : typeArr) {
            Objects.requireNonNull(type3, "typeArgument == null");
            UK.e(type3);
        }
        this.l = type;
        this.m = type2;
        this.n = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && UK.l(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.n.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.l;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.m;
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.n) ^ this.m.hashCode();
        Type type = this.l;
        return iHashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.n;
        int length = typeArr.length;
        Type type = this.m;
        if (length == 0) {
            return UK.W(type);
        }
        StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
        sb.append(UK.W(type));
        sb.append("<");
        sb.append(UK.W(typeArr[0]));
        for (int i = 1; i < typeArr.length; i++) {
            sb.append(", ");
            sb.append(UK.W(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
