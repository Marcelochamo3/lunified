package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class CQ implements Parcelable {
    public static final Parcelable.Creator<CQ> CREATOR = new C2452pK(10);
    public final BQ[] l;
    public final long m;

    public CQ(BQ... bqArr) {
        this(-9223372036854775807L, bqArr);
    }

    public final CQ a(BQ... bqArr) {
        if (bqArr.length == 0) {
            return this;
        }
        int i = Lr0.a;
        BQ[] bqArr2 = this.l;
        Object[] objArrCopyOf = Arrays.copyOf(bqArr2, bqArr2.length + bqArr.length);
        System.arraycopy(bqArr, 0, objArrCopyOf, bqArr2.length, bqArr.length);
        return new CQ(this.m, (BQ[]) objArrCopyOf);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BQ e(int i) {
        return this.l[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || CQ.class != obj.getClass()) {
            return false;
        }
        CQ cq = (CQ) obj;
        return Arrays.equals(this.l, cq.l) && this.m == cq.m;
    }

    public final int f() {
        return this.l.length;
    }

    public final int hashCode() {
        return Sr0.o(this.m) + (Arrays.hashCode(this.l) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.l));
        long j = this.m;
        if (j == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BQ[] bqArr = this.l;
        parcel.writeInt(bqArr.length);
        for (BQ bq : bqArr) {
            parcel.writeParcelable(bq, 0);
        }
        parcel.writeLong(this.m);
    }

    public CQ(long j, BQ... bqArr) {
        this.m = j;
        this.l = bqArr;
    }

    public CQ(List list) {
        this((BQ[]) list.toArray(new BQ[0]));
    }

    public CQ(Parcel parcel) {
        this.l = new BQ[parcel.readInt()];
        int i = 0;
        while (true) {
            BQ[] bqArr = this.l;
            if (i < bqArr.length) {
                bqArr[i] = (BQ) parcel.readParcelable(BQ.class.getClassLoader());
                i++;
            } else {
                this.m = parcel.readLong();
                return;
            }
        }
    }
}
