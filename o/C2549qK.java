package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.qK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2549qK implements Parcelable {
    public static final Parcelable.Creator<C2549qK> CREATOR = new C2452pK(0);
    public int l;
    public int m;
    public boolean n;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }
}
