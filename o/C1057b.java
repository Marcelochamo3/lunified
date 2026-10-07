package o;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: renamed from: o.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1057b implements ParameterizedType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type l;
    public final Type m;
    public final Type[] n;

    public C1057b(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            U9.c(z);
        }
        this.l = type == null ? null : UK.c(type);
        this.m = UK.c(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.n = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.n[i]);
            UK.d(this.n[i]);
            Type[] typeArr3 = this.n;
            typeArr3[i] = UK.c(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && UK.k(this, (ParameterizedType) obj);
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
            return UK.V(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(UK.V(type));
        sb.append("<");
        sb.append(UK.V(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(UK.V(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}
