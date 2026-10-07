package o;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

/* JADX INFO: loaded from: classes.dex */
public final class Qr0 implements WildcardType {
    public final Type l;
    public final Type m;

    public Qr0(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length > 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr.length != 1) {
            throw new IllegalArgumentException();
        }
        if (typeArr2.length != 1) {
            typeArr[0].getClass();
            UK.e(typeArr[0]);
            this.m = null;
            this.l = typeArr[0];
            return;
        }
        typeArr2[0].getClass();
        UK.e(typeArr2[0]);
        if (typeArr[0] != Object.class) {
            throw new IllegalArgumentException();
        }
        this.m = typeArr2[0];
        this.l = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && UK.l(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.m;
        return type != null ? new Type[]{type} : UK.g;
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
            return "? super " + UK.W(type);
        }
        Type type2 = this.l;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + UK.W(type2);
    }
}
