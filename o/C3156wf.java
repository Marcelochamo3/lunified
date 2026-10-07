package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3156wf extends NE {
    public static final Parcelable.Creator<C3156wf> CREATOR = new C2230n1(12);
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1096o;

    public C3156wf(String str, String str2, String str3) {
        super("COMM");
        this.m = str;
        this.n = str2;
        this.f1096o = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3156wf.class != obj.getClass()) {
            return false;
        }
        C3156wf c3156wf = (C3156wf) obj;
        return Lr0.a(this.n, c3156wf.n) && Lr0.a(this.m, c3156wf.m) && Lr0.a(this.f1096o, c3156wf.f1096o);
    }

    public final int hashCode() {
        String str = this.m;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1096o;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // o.NE
    public final String toString() {
        return this.l + ": language=" + this.m + ", description=" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.f1096o);
    }

    public C3156wf(Parcel parcel) {
        super("COMM");
        String string = parcel.readString();
        int i = Lr0.a;
        this.m = string;
        this.n = parcel.readString();
        this.f1096o = parcel.readString();
    }
}
