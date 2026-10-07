package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class UN extends AbstractC2324o {
    public static final Parcelable.Creator<UN> CREATOR = new C2227n(4);
    public boolean n;

    public UN(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            UN.class.getClassLoader();
        }
        this.n = parcel.readInt() == 1;
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n ? 1 : 0);
    }
}
