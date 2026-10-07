package o;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: renamed from: o.hU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1684hU extends AbstractC1976kU {
    public final Class r;

    public C1684hU(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.r = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // o.AbstractC1976kU
    public final Object a(String str, Bundle bundle) {
        return AbstractC1674hK.l(bundle, "bundle", str, "key", str);
    }

    @Override // o.AbstractC1976kU
    public final String b() {
        return this.r.getName();
    }

    @Override // o.AbstractC1976kU
    /* JADX INFO: renamed from: d */
    public final Object h(String str) {
        AbstractC1474fG.j(str, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // o.AbstractC1976kU
    public final void e(Bundle bundle, String str, Object obj) {
        AbstractC1474fG.j(str, "key");
        this.r.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1474fG.b(C1684hU.class, obj.getClass())) {
            return false;
        }
        return AbstractC1474fG.b(this.r, ((C1684hU) obj).r);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
