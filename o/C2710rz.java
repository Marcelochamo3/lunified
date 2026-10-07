package o;

import android.os.Bundle;

/* JADX INFO: renamed from: o.rz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2710rz implements AT {
    public final String a;
    public final String b;

    public C2710rz(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static final C2710rz fromBundle(Bundle bundle) {
        AbstractC1474fG.j(bundle, "bundle");
        bundle.setClassLoader(C2710rz.class.getClassLoader());
        if (!bundle.containsKey("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("id");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("name")) {
            throw new IllegalArgumentException("Required argument \"name\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("name");
        if (string2 != null) {
            return new C2710rz(string, string2);
        }
        throw new IllegalArgumentException("Argument \"name\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2710rz)) {
            return false;
        }
        C2710rz c2710rz = (C2710rz) obj;
        return AbstractC1474fG.b(this.a, c2710rz.a) && AbstractC1474fG.b(this.b, c2710rz.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GenreMobileFragmentArgs(id=");
        sb.append(this.a);
        sb.append(", name=");
        return AbstractC1701hf0.h(sb, this.b, ")");
    }
}
