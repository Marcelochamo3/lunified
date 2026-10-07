package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.l30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2041l30 extends Bf0 {
    public static final Parcelable.Creator<C2041l30> CREATOR = new C2452pK(26);
    public final long l;
    public final long m;
    public final byte[] n;

    public C2041l30(long j, byte[] bArr, long j2) {
        this.l = j2;
        this.m = j;
        this.n = bArr;
    }

    @Override // o.Bf0
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.l);
        sb.append(", identifier= ");
        return AbstractC1674hK.q(sb, this.m, " }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.l);
        parcel.writeLong(this.m);
        parcel.writeByteArray(this.n);
    }

    public C2041l30(Parcel parcel) {
        this.l = parcel.readLong();
        this.m = parcel.readLong();
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i = Lr0.a;
        this.n = bArrCreateByteArray;
    }
}
