package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.uU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2946uU extends AbstractC2324o {
    public static final Parcelable.Creator<C2946uU> CREATOR = new C2227n(5);
    public Bundle n;

    public C2946uU(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.n = parcel.readBundle(classLoader == null ? C2946uU.class.getClassLoader() : classLoader);
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.n);
    }
}
