package o;

import android.os.Bundle;

/* JADX INFO: renamed from: o.jR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1875jR implements AT {
    public final String a;

    public C1875jR(String str) {
        this.a = str;
    }

    public static final C1875jR fromBundle(Bundle bundle) {
        AbstractC1474fG.j(bundle, "bundle");
        bundle.setClassLoader(C1875jR.class.getClassLoader());
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (string != null) {
            return new C1875jR(string);
        }
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1875jR) && AbstractC1474fG.b(this.a, ((C1875jR) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("MovieMobileFragmentArgs(id="), this.a, ")");
    }
}
