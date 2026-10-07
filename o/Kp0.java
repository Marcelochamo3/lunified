package o;

import j$.util.Objects;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final class Kp0 {
    public final Class a;
    public final Type b;
    public final int c;

    public Kp0(Type type) {
        Objects.requireNonNull(type);
        Type typeC = UK.c(type);
        this.b = typeC;
        this.a = UK.v(typeC);
        this.c = typeC.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Kp0) {
            if (UK.k(this.b, ((Kp0) obj).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return UK.V(this.b);
    }
}
