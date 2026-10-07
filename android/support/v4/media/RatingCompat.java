package android.support.v4.media;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import o.C2452pK;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new C2452pK(27);
    public final int l;
    public final float m;

    public RatingCompat(int i, float f) {
        this.l = i;
        this.m = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.l);
        sb.append(" rating=");
        float f = this.m;
        sb.append(f < 0.0f ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeFloat(this.m);
    }
}
