package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.k30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1943k30 extends NE {
    public static final Parcelable.Creator<C1943k30> CREATOR = new C2452pK(25);
    public final String m;
    public final byte[] n;

    public C1943k30(String str, byte[] bArr) {
        super("PRIV");
        this.m = str;
        this.n = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1943k30.class != obj.getClass()) {
            return false;
        }
        C1943k30 c1943k30 = (C1943k30) obj;
        return Lr0.a(this.m, c1943k30.m) && Arrays.equals(this.n, c1943k30.n);
    }

    public final int hashCode() {
        String str = this.m;
        return Arrays.hashCode(this.n) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // o.NE
    public final String toString() {
        return this.l + ": owner=" + this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeByteArray(this.n);
    }

    public C1943k30(Parcel parcel) {
        super("PRIV");
        String string = parcel.readString();
        int i = Lr0.a;
        this.m = string;
        this.n = parcel.createByteArray();
    }
}
