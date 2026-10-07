package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class OY implements BQ {
    public static final Parcelable.Creator<OY> CREATOR = new C2452pK(21);
    public final int l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f435o;
    public final int p;
    public final int q;
    public final int r;
    public final byte[] s;

    public OY(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.l = i;
        this.m = str;
        this.n = str2;
        this.f435o = i2;
        this.p = i3;
        this.q = i4;
        this.r = i5;
        this.s = bArr;
    }

    public static OY a(C2562qX c2562qX) {
        int iG = c2562qX.g();
        String strS = c2562qX.s(c2562qX.g(), AbstractC1402ed.a);
        String strS2 = c2562qX.s(c2562qX.g(), AbstractC1402ed.c);
        int iG2 = c2562qX.g();
        int iG3 = c2562qX.g();
        int iG4 = c2562qX.g();
        int iG5 = c2562qX.g();
        int iG6 = c2562qX.g();
        byte[] bArr = new byte[iG6];
        c2562qX.e(bArr, 0, iG6);
        return new OY(iG, strS, strS2, iG2, iG3, iG4, iG5, bArr);
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
        c2166mP.b(this.l, this.s);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || OY.class != obj.getClass()) {
            return false;
        }
        OY oy = (OY) obj;
        return this.l == oy.l && this.m.equals(oy.m) && this.n.equals(oy.n) && this.f435o == oy.f435o && this.p == oy.p && this.q == oy.q && this.r == oy.r && Arrays.equals(this.s, oy.s);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.s) + ((((((((AbstractC1674hK.i(AbstractC1674hK.i((527 + this.l) * 31, this.m, 31), this.n, 31) + this.f435o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.m + ", description=" + this.n;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeInt(this.f435o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeByteArray(this.s);
    }

    public OY(Parcel parcel) {
        this.l = parcel.readInt();
        String string = parcel.readString();
        int i = Lr0.a;
        this.m = string;
        this.n = parcel.readString();
        this.f435o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.createByteArray();
    }
}
