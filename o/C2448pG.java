package o;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.pG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2448pG {
    public final Class a;
    public final Object b;
    public final Method c;
    public final List d;

    public C2448pG(Class cls, Object obj, Method method, ArrayList arrayList) {
        this.a = cls;
        this.b = obj;
        this.c = method;
        this.d = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.a.getName(), this.c.getName(), this.d);
    }
}
