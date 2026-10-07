package o;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3057ve {
    public final int a;
    public final Method b;

    public C3057ve(Method method, int i) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3057ve)) {
            return false;
        }
        C3057ve c3057ve = (C3057ve) obj;
        return this.a == c3057ve.a && this.b.getName().equals(c3057ve.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
