package o;

import java.lang.reflect.AccessibleObject;

/* JADX INFO: renamed from: o.w60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3113w60 {
    public static final AbstractC3113w60 a;

    static {
        AbstractC3113w60 c2919u60;
        if (AbstractC3030vH.a >= 9) {
            try {
                c2919u60 = new C2919u60(AccessibleObject.class.getDeclaredMethod("canAccess", Object.class));
            } catch (NoSuchMethodException unused) {
                c2919u60 = null;
            }
        } else {
            c2919u60 = null;
        }
        if (c2919u60 == null) {
            c2919u60 = new C3016v60();
        }
        a = c2919u60;
    }

    public abstract boolean a(Object obj, AccessibleObject accessibleObject);
}
