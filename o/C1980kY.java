package o;

import android.os.Bundle;

/* JADX INFO: renamed from: o.kY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1980kY implements AT {
    public final String a;

    public C1980kY(String str) {
        this.a = str;
    }

    public static final C1980kY fromBundle(Bundle bundle) {
        AbstractC1474fG.j(bundle, "bundle");
        bundle.setClassLoader(C1980kY.class.getClassLoader());
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (string != null) {
            return new C1980kY(string);
        }
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1980kY) && AbstractC1474fG.b(this.a, ((C1980kY) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("PeopleMobileFragmentArgs(id="), this.a, ")");
    }
}
