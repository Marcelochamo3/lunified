package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Cg0 implements Comparable, Parcelable, T9 {
    public static final Parcelable.Creator<Cg0> CREATOR = new Ae0(8);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f201o;
    public static final String p;
    public static final String q;
    public final int l;
    public final int m;
    public final int n;

    static {
        int i = Lr0.a;
        f201o = Integer.toString(0, 36);
        p = Integer.toString(1, 36);
        q = Integer.toString(2, 36);
    }

    public Cg0(int i, int i2, int i3) {
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Cg0 cg0 = (Cg0) obj;
        int i = this.l - cg0.l;
        if (i != 0) {
            return i;
        }
        int i2 = this.m - cg0.m;
        return i2 == 0 ? this.n - cg0.n : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Cg0.class != obj.getClass()) {
            return false;
        }
        Cg0 cg0 = (Cg0) obj;
        return this.l == cg0.l && this.m == cg0.m && this.n == cg0.n;
    }

    public final int hashCode() {
        return (((this.l * 31) + this.m) * 31) + this.n;
    }

    public final String toString() {
        return this.l + "." + this.m + "." + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }

    public Cg0(Parcel parcel) {
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }
}
