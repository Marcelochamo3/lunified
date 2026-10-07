package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2581qi implements BQ {
    public static final Parcelable.Creator<C2581qi> CREATOR = new C2230n1(13);
    public final long l;

    public C2581qi(long j) {
        this.l = j;
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
        if (obj instanceof C2581qi) {
            return this.l == ((C2581qi) obj).l;
        }
        return false;
    }

    public final int hashCode() {
        return Sr0.o(this.l);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Creation time: ");
        long j = this.l;
        sb.append(j == -2082844800000L ? "unset" : Long.valueOf(j));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.l);
    }

    public C2581qi(Parcel parcel) {
        this.l = parcel.readLong();
    }
}
