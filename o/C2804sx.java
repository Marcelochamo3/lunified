package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.sx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2804sx implements Parcelable {
    public static final Parcelable.Creator<C2804sx> CREATOR = new C2230n1(19);
    public String l;
    public int m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeInt(this.m);
    }
}
