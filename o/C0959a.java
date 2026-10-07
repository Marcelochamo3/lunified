package o;

import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: o.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0959a implements GenericArrayType, Serializable {
    private static final long serialVersionUID = 0;
    public final Type l;

    public C0959a(Type type) {
        Objects.requireNonNull(type);
        this.l = UK.c(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && UK.k(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.l;
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return UK.V(this.l) + "[]";
    }
}
