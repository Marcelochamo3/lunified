package o;

import android.os.Bundle;

/* JADX INFO: renamed from: o.yo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3369yo0 implements AT {
    public final String a;

    public C3369yo0(String str) {
        this.a = str;
    }

    public static final C3369yo0 fromBundle(Bundle bundle) {
        AbstractC1474fG.j(bundle, "bundle");
        bundle.setClassLoader(C3369yo0.class.getClassLoader());
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (string != null) {
            return new C3369yo0(string);
        }
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3369yo0) && AbstractC1474fG.b(this.a, ((C3369yo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("TvShowTvFragmentArgs(id="), this.a, ")");
    }
}
