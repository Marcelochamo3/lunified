package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.wA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3120wA implements Parcelable {
    public static final Parcelable.Creator<C3120wA> CREATOR = new C2230n1(23);
    public int l;
    public Bundle m;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeBundle(this.m);
    }
}
