package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Aj0 extends Bf0 {
    public static final Parcelable.Creator<Aj0> CREATOR = new Ae0(10);
    public final long l;
    public final long m;

    public Aj0(long j, long j2) {
        this.l = j;
        this.m = j2;
    }

    public static long a(long j, C2562qX c2562qX) {
        long jU = c2562qX.u();
        if ((128 & jU) != 0) {
            return 8589934591L & ((((jU & 1) << 32) | c2562qX.v()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // o.Bf0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.l);
        sb.append(", playbackPositionUs= ");
        return AbstractC1674hK.q(sb, this.m, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.l);
        parcel.writeLong(this.m);
    }
}
