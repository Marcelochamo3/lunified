package o;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.ur, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2986ur implements InterfaceC3274xp0, Cloneable {
    public static final C2986ur q = new C2986ur();
    public final double l = -1.0d;
    public final int m = Yu0.b.s0;
    public final boolean n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f1063o = Collections.emptyList();
    public final List p = Collections.emptyList();

    public static boolean e(Class cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.getModifiers() & 8) == 0 && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    @Override // o.InterfaceC3274xp0
    public final AbstractC3177wp0 b(BA ba, Kp0 kp0) {
        boolean z;
        boolean z2;
        boolean zC = c(kp0.a);
        if (zC) {
            z = true;
        } else {
            d(true);
            z = false;
        }
        if (zC) {
            z2 = true;
        } else {
            d(false);
            z2 = false;
        }
        if (z || z2) {
            return new C2889tr(this, z2, z, ba, kp0);
        }
        return null;
    }

    public final boolean c(Class cls) {
        if (this.l != -1.0d) {
            Sd0 sd0 = (Sd0) cls.getAnnotation(Sd0.class);
            Mq0 mq0 = (Mq0) cls.getAnnotation(Mq0.class);
            double d = this.l;
            if ((sd0 != null && d < sd0.value()) || (mq0 != null && d >= mq0.value())) {
                return true;
            }
        }
        if (!this.n && cls.isMemberClass() && (cls.getModifiers() & 8) == 0) {
            return true;
        }
        return e(cls);
    }

    public final Object clone() {
        try {
            return (C2986ur) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final void d(boolean z) {
        Iterator it = (z ? this.f1063o : this.p).iterator();
        if (it.hasNext()) {
            AbstractC1674hK.w(it.next());
            throw null;
        }
    }
}
