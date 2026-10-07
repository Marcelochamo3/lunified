package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.gd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1598gd extends AbstractC2324o {
    public static final Parcelable.Creator<C1598gd> CREATOR = new C2227n(2);
    public boolean n;

    public C1598gd(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.n = parcel.readInt() == 1;
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n ? 1 : 0);
    }
}
