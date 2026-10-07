package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3009v3 extends NE {
    public static final Parcelable.Creator<C3009v3> CREATOR = new C2230n1(2);
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1068o;
    public final byte[] p;

    public C3009v3(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.m = str;
        this.n = str2;
        this.f1068o = i;
        this.p = bArr;
    }

    @Override // o.NE, o.BQ
    public final void d(C2166mP c2166mP) {
        c2166mP.b(this.f1068o, this.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3009v3.class != obj.getClass()) {
            return false;
        }
        C3009v3 c3009v3 = (C3009v3) obj;
        return this.f1068o == c3009v3.f1068o && Lr0.a(this.m, c3009v3.m) && Lr0.a(this.n, c3009v3.n) && Arrays.equals(this.p, c3009v3.p);
    }

    public final int hashCode() {
        int i = (527 + this.f1068o) * 31;
        String str = this.m;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n;
        return Arrays.hashCode(this.p) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // o.NE
    public final String toString() {
        return this.l + ": mimeType=" + this.m + ", description=" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.f1068o);
        parcel.writeByteArray(this.p);
    }

    public C3009v3(Parcel parcel) {
        super("APIC");
        String string = parcel.readString();
        int i = Lr0.a;
        this.m = string;
        this.n = parcel.readString();
        this.f1068o = parcel.readInt();
        this.p = parcel.createByteArray();
    }
}
