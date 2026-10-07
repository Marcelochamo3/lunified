package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.dG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1279dG extends NE {
    public static final Parcelable.Creator<C1279dG> CREATOR = new C2230n1(29);
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f735o;

    public C1279dG(String str, String str2, String str3) {
        super("----");
        this.m = str;
        this.n = str2;
        this.f735o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1279dG.class != obj.getClass()) {
            return false;
        }
        C1279dG c1279dG = (C1279dG) obj;
        return Lr0.a(this.n, c1279dG.n) && Lr0.a(this.m, c1279dG.m) && Lr0.a(this.f735o, c1279dG.f735o);
    }

    public final int hashCode() {
        String str = this.m;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f735o;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // o.NE
    public final String toString() {
        return this.l + ": domain=" + this.m + ", description=" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.f735o);
    }

    public C1279dG(Parcel parcel) {
        super("----");
        String string = parcel.readString();
        int i = Lr0.a;
        this.m = string;
        this.n = parcel.readString();
        this.f735o = parcel.readString();
    }
}
