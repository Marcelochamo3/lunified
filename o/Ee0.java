package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Ee0 implements BQ {
    public static final Parcelable.Creator<Ee0> CREATOR = new Ae0(2);
    public final float l;
    public final int m;

    public Ee0(int i, float f) {
        this.l = f;
        this.m = i;
    }

    @Override // o.BQ
    public final /* synthetic */ C0643Nw b() {
        return null;
    }

    @Override // o.BQ
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // o.BQ
    public final /* synthetic */ void d(C2166mP c2166mP) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Ee0.class != obj.getClass()) {
            return false;
        }
        Ee0 ee0 = (Ee0) obj;
        return this.l == ee0.l && this.m == ee0.m;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.l).hashCode() + 527) * 31) + this.m;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.l + ", svcTemporalLayerCount=" + this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.l);
        parcel.writeInt(this.m);
    }

    public Ee0(Parcel parcel) {
        this.l = parcel.readFloat();
        this.m = parcel.readInt();
    }
}
