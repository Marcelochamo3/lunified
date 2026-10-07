package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: renamed from: o.sC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2734sC implements Parcelable {
    public static final Parcelable.Creator<C2734sC> CREATOR = new C2230n1(25);
    public final int l;
    public final int m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1021o;
    public final String p;
    public final String q;

    public C2734sC(int i, int i2, String str, String str2, String str3, String str4) {
        this.l = i;
        this.m = i2;
        this.n = str;
        this.f1021o = str2;
        this.p = str3;
        this.q = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2734sC.class != obj.getClass()) {
            return false;
        }
        C2734sC c2734sC = (C2734sC) obj;
        return this.l == c2734sC.l && this.m == c2734sC.m && TextUtils.equals(this.n, c2734sC.n) && TextUtils.equals(this.f1021o, c2734sC.f1021o) && TextUtils.equals(this.p, c2734sC.p) && TextUtils.equals(this.q, c2734sC.q);
    }

    public final int hashCode() {
        int i = ((this.l * 31) + this.m) * 31;
        String str = this.n;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1021o;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.p;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.q;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.f1021o);
        parcel.writeString(this.p);
        parcel.writeString(this.q);
    }

    public C2734sC(Parcel parcel) {
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readString();
        this.f1021o = parcel.readString();
        this.p = parcel.readString();
        this.q = parcel.readString();
    }
}
