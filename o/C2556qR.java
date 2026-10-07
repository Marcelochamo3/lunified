package o;

import android.os.Bundle;

/* JADX INFO: renamed from: o.qR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2556qR implements AT {
    public final String a;

    public C2556qR(String str) {
        this.a = str;
    }

    public static final C2556qR fromBundle(Bundle bundle) {
        AbstractC1474fG.j(bundle, "bundle");
        bundle.setClassLoader(C2556qR.class.getClassLoader());
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (string != null) {
            return new C2556qR(string);
        }
        throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2556qR) && AbstractC1474fG.b(this.a, ((C2556qR) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return AbstractC1701hf0.h(new StringBuilder("MovieTvFragmentArgs(id="), this.a, ")");
    }
}
