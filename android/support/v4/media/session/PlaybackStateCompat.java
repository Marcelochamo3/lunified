package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import o.AP;
import o.AbstractC1674hK;
import o.C2452pK;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new C2452pK(22);
    public final int l;
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final float f2o;
    public final long p;
    public final int q;
    public final CharSequence r;
    public final long s;
    public final ArrayList t;
    public final long u;
    public final Bundle v;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new b();
        public final String l;
        public final CharSequence m;
        public final int n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Bundle f3o;

        public CustomAction(Parcel parcel) {
            this.l = parcel.readString();
            this.m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.n = parcel.readInt();
            this.f3o = parcel.readBundle(AP.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.m) + ", mIcon=" + this.n + ", mExtras=" + this.f3o;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.l);
            TextUtils.writeToParcel(this.m, parcel, i);
            parcel.writeInt(this.n);
            parcel.writeBundle(this.f3o);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.l = parcel.readInt();
        this.m = parcel.readLong();
        this.f2o = parcel.readFloat();
        this.s = parcel.readLong();
        this.n = parcel.readLong();
        this.p = parcel.readLong();
        this.r = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.t = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.u = parcel.readLong();
        this.v = parcel.readBundle(AP.class.getClassLoader());
        this.q = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.l);
        sb.append(", position=");
        sb.append(this.m);
        sb.append(", buffered position=");
        sb.append(this.n);
        sb.append(", speed=");
        sb.append(this.f2o);
        sb.append(", updated=");
        sb.append(this.s);
        sb.append(", actions=");
        sb.append(this.p);
        sb.append(", error code=");
        sb.append(this.q);
        sb.append(", error message=");
        sb.append(this.r);
        sb.append(", custom actions=");
        sb.append(this.t);
        sb.append(", active item id=");
        return AbstractC1674hK.q(sb, this.u, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeLong(this.m);
        parcel.writeFloat(this.f2o);
        parcel.writeLong(this.s);
        parcel.writeLong(this.n);
        parcel.writeLong(this.p);
        TextUtils.writeToParcel(this.r, parcel, i);
        parcel.writeTypedList(this.t);
        parcel.writeLong(this.u);
        parcel.writeBundle(this.v);
        parcel.writeInt(this.q);
    }
}
