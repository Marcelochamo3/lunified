package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class JQ extends NE {
    public static final Parcelable.Creator<JQ> CREATOR = new C2452pK(11);
    public final int m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f341o;
    public final int[] p;
    public final int[] q;

    public JQ(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.m = i;
        this.n = i2;
        this.f341o = i3;
        this.p = iArr;
        this.q = iArr2;
    }

    @Override // o.NE, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JQ.class != obj.getClass()) {
            return false;
        }
        JQ jq = (JQ) obj;
        return this.m == jq.m && this.n == jq.n && this.f341o == jq.f341o && Arrays.equals(this.p, jq.p) && Arrays.equals(this.q, jq.q);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.q) + ((Arrays.hashCode(this.p) + ((((((527 + this.m) * 31) + this.n) * 31) + this.f341o) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f341o);
        parcel.writeIntArray(this.p);
        parcel.writeIntArray(this.q);
    }

    public JQ(Parcel parcel) {
        super("MLLT");
        this.m = parcel.readInt();
        this.n = parcel.readInt();
        this.f341o = parcel.readInt();
        int[] iArrCreateIntArray = parcel.createIntArray();
        int i = Lr0.a;
        this.p = iArrCreateIntArray;
        this.q = parcel.createIntArray();
    }
}
