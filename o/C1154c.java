package o;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: renamed from: o.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1154c implements WildcardType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type l;
    public final Type m;

    public C1154c(Type[] typeArr, Type[] typeArr2) {
        U9.c(typeArr2.length <= 1);
        U9.c(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            UK.d(typeArr[0]);
            this.m = null;
            this.l = UK.c(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        UK.d(typeArr2[0]);
        U9.c(typeArr[0] == Object.class);
        this.m = UK.c(typeArr2[0]);
        this.l = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && UK.k(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.m;
        return type != null ? new Type[]{type} : UK.b;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.l};
    }

    public final int hashCode() {
        Type type = this.m;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.l.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.m;
        if (type != null) {
            return "? super " + UK.V(type);
        }
        Type type2 = this.l;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + UK.V(type2);
    }
}
