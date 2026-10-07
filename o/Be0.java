package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class Be0 implements Parcelable {
    public static final Parcelable.Creator<Be0> CREATOR = new Ae0(1);
    public final long l;
    public final long m;
    public final int n;

    public Be0(int i, long j, long j2) {
        AbstractC0397Ej.c(j < j2);
        this.l = j;
        this.m = j2;
        this.n = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Be0.class != obj.getClass()) {
            return false;
        }
        Be0 be0 = (Be0) obj;
        return this.l == be0.l && this.m == be0.m && this.n == be0.n;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.l), Long.valueOf(this.m), Integer.valueOf(this.n)});
    }

    public final String toString() {
        int i = Lr0.a;
        Locale locale = Locale.US;
        return "Segment: startTimeMs=" + this.l + ", endTimeMs=" + this.m + ", speedDivisor=" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.l);
        parcel.writeLong(this.m);
        parcel.writeInt(this.n);
    }
}
