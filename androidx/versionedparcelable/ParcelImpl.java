package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.C2452pK;
import o.C3377ys0;
import o.InterfaceC3474zs0;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C2452pK(19);
    public final InterfaceC3474zs0 l;

    public ParcelImpl(Parcel parcel) {
        this.l = new C3377ys0(parcel).h();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C3377ys0(parcel).l(this.l);
    }
}
