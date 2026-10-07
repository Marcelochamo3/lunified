package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.zr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3472zr0 extends NE {
    public static final Parcelable.Creator<C3472zr0> CREATOR = new Ae0(12);
    public final String m;
    public final String n;

    public C3472zr0(String str, String str2, String str3) {
        super(str);
        this.m = str2;
        this.n = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3472zr0.class != obj.getClass()) {
            return false;
        }
        C3472zr0 c3472zr0 = (C3472zr0) obj;
        return this.l.equals(c3472zr0.l) && Lr0.a(this.m, c3472zr0.m) && Lr0.a(this.n, c3472zr0.n);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(527, this.l, 31);
        String str = this.m;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // o.NE
    public final String toString() {
        return this.l + ": url=" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C3472zr0(Parcel parcel) {
        String string = parcel.readString();
        int i = Lr0.a;
        super(string);
        this.m = parcel.readString();
        this.n = parcel.readString();
    }
}
