package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.Mz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0620Mz extends NE {
    public static final Parcelable.Creator<C0620Mz> CREATOR = new C2230n1(22);
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f406o;
    public final byte[] p;

    public C0620Mz(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.m = str;
        this.n = str2;
        this.f406o = str3;
        this.p = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0620Mz.class != obj.getClass()) {
            return false;
        }
        C0620Mz c0620Mz = (C0620Mz) obj;
        return Lr0.a(this.m, c0620Mz.m) && Lr0.a(this.n, c0620Mz.n) && Lr0.a(this.f406o, c0620Mz.f406o) && Arrays.equals(this.p, c0620Mz.p);
    }

    public final int hashCode() {
        String str = this.m;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f406o;
        return Arrays.hashCode(this.p) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // o.NE
    public final String toString() {
        return this.l + ": mimeType=" + this.m + ", filename=" + this.n + ", description=" + this.f406o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.f406o);
        parcel.writeByteArray(this.p);
    }

    public C0620Mz(Parcel parcel) {
        super("GEOB");
        String string = parcel.readString();
        int i = Lr0.a;
        this.m = string;
        this.n = parcel.readString();
        this.f406o = parcel.readString();
        this.p = parcel.createByteArray();
    }
}
