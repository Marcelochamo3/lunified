package o;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: o.iU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1782iU extends AbstractC1976kU {
    public final Class r;

    public C1782iU(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.AbstractC1976kU
    public final Object a(String str, Bundle bundle) {
        return (Serializable[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
    }

    @Override // o.AbstractC1976kU
    public final String b() {
        return this.r.getName();
    }

    @Override // o.AbstractC1976kU
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        AbstractC1474fG.j(str, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // o.AbstractC1976kU
    public final void e(Bundle bundle, String str, Object obj) {
        ?? r4 = (Serializable[]) obj;
        AbstractC1474fG.j(str, "key");
        this.r.cast(r4);
        bundle.putSerializable(str, r4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1474fG.b(C1782iU.class, obj.getClass())) {
            return false;
        }
        return AbstractC1474fG.b(this.r, ((C1782iU) obj).r);
    }

    @Override // o.AbstractC1976kU
    public final boolean g(Object obj, Object obj2) {
        return X5.H((Serializable[]) obj, (Serializable[]) obj2);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
