package o;

import android.os.Bundle;
import java.io.Serializable;

/* JADX INFO: renamed from: o.jU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1878jU extends AbstractC1976kU {
    public final Class r;

    public C1878jU(Class cls) {
        super(true);
        if (!Serializable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
        if (true ^ cls.isEnum()) {
            this.r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // o.AbstractC1976kU
    public final Object a(String str, Bundle bundle) {
        return (Serializable) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
    }

    @Override // o.AbstractC1976kU
    public String b() {
        return this.r.getName();
    }

    @Override // o.AbstractC1976kU
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        AbstractC1474fG.j(str, "key");
        AbstractC1474fG.j(serializable, "value");
        this.r.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1878jU)) {
            return false;
        }
        return AbstractC1474fG.b(this.r, ((C1878jU) obj).r);
    }

    @Override // o.AbstractC1976kU
    public Serializable h(String str) {
        AbstractC1474fG.j(str, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public C1878jU(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
    }
}
