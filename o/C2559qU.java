package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.qU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2559qU implements Parcelable {
    public static final Parcelable.Creator<C2559qU> CREATOR = new C2452pK(17);
    public int l;
    public C2368oX m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeParcelable(this.m, 0);
    }
}
