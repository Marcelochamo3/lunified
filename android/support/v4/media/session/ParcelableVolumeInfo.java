package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.C2452pK;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C2452pK(20);
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1o;
    public int p;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f1o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.m);
    }
}
