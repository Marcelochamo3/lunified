package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.g60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1559g60 extends AbstractC2324o {
    public static final Parcelable.Creator<C1559g60> CREATOR = new C2227n(7);
    public Parcelable n;

    public C1559g60(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.n = parcel.readParcelable(classLoader == null ? X50.class.getClassLoader() : classLoader);
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.n, 0);
    }
}
