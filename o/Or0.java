package o;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class Or0 implements GenericArrayType {
    public final Type l;

    public Or0(Type type) {
        this.l = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && UK.l(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.l;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return UK.W(this.l) + "[]";
    }
}
