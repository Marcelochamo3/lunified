package o;

import android.os.Bundle;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.gU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1586gU extends AbstractC1976kU {
    public final Class r;

    public C1586gU(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
        }
        try {
            this.r = Class.forName("[L" + cls.getName() + ';');
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.AbstractC1976kU
    public final Object a(String str, Bundle bundle) {
        return (Parcelable[]) AbstractC1674hK.l(bundle, "bundle", str, "key", str);
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

    @Override // o.AbstractC1976kU
    public final void e(Bundle bundle, String str, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        AbstractC1474fG.j(str, "key");
        this.r.cast(parcelableArr);
        bundle.putParcelableArray(str, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC1474fG.b(C1586gU.class, obj.getClass())) {
            return false;
        }
        return AbstractC1474fG.b(this.r, ((C1586gU) obj).r);
    }

    @Override // o.AbstractC1976kU
    public final boolean g(Object obj, Object obj2) {
        return X5.H((Parcelable[]) obj, (Parcelable[]) obj2);
    }

    public final int hashCode() {
        return this.r.hashCode();
    }
}
