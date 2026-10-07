package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.zj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3455zj implements Parcelable {
    public static final Parcelable.Creator<C3455zj> CREATOR = new C2230n1(14);
    public final long l;

    public C3455zj(long j) {
        this.l = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3455zj) && this.l == ((C3455zj) obj).l;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.l)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.l);
    }
}
