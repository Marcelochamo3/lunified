package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class KE implements BQ {
    public static final Parcelable.Creator<KE> CREATOR = new C2230n1(27);
    public final byte[] l;
    public final String m;
    public final String n;

    public KE(byte[] bArr, String str, String str2) {
        this.l = bArr;
        this.m = str;
        this.n = str2;
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
    public final void d(C2166mP c2166mP) {
        String str = this.m;
        if (str != null) {
            c2166mP.a = str;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || KE.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.l, ((KE) obj).l);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.l);
    }

    public final String toString() {
        return "ICY: title=\"" + this.m + "\", url=\"" + this.n + "\", rawMetadata.length=\"" + this.l.length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
    }

    public KE(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        bArrCreateByteArray.getClass();
        this.l = bArrCreateByteArray;
        this.m = parcel.readString();
        this.n = parcel.readString();
    }
}
