package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.uS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2944uS implements BQ {
    public static final Parcelable.Creator<C2944uS> CREATOR = new C2452pK(14);
    public final float l;
    public final float m;

    public C2944uS(float f, float f2) {
        AbstractC0397Ej.b("Invalid latitude or longitude", f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f);
        this.l = f;
        this.m = f2;
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
    public final /* synthetic */ void d(C2166mP c2166mP) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2944uS.class != obj.getClass()) {
            return false;
        }
        C2944uS c2944uS = (C2944uS) obj;
        return this.l == c2944uS.l && this.m == c2944uS.m;
    }

    public final int hashCode() {
        return Float.valueOf(this.m).hashCode() + ((Float.valueOf(this.l).hashCode() + 527) * 31);
    }

    public final String toString() {
        return "xyz: latitude=" + this.l + ", longitude=" + this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.l);
        parcel.writeFloat(this.m);
    }

    public C2944uS(Parcel parcel) {
        this.l = parcel.readFloat();
        this.m = parcel.readFloat();
    }
}
