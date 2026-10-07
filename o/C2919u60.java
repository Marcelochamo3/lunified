package o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: o.u60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2919u60 extends AbstractC3113w60 {
    public final /* synthetic */ Method b;

    public C2919u60(Method method) {
        this.b = method;
    }

    @Override // o.AbstractC3113w60
    public final boolean a(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.b.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}
