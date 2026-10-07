package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.sO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2746sO implements BQ {
    public static final Parcelable.Creator<C2746sO> CREATOR = new C2452pK(3);
    public final String l;
    public final byte[] m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1024o;

    public C2746sO(String str, byte[] bArr, int i, int i2) {
        this.l = str;
        this.m = bArr;
        this.n = i;
        this.f1024o = i2;
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
        if (obj == null || C2746sO.class != obj.getClass()) {
            return false;
        }
        C2746sO c2746sO = (C2746sO) obj;
        return this.l.equals(c2746sO.l) && Arrays.equals(this.m, c2746sO.m) && this.n == c2746sO.n && this.f1024o == c2746sO.f1024o;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.m) + AbstractC1674hK.i(527, this.l, 31)) * 31) + this.n) * 31) + this.f1024o;
    }

    public final String toString() {
        String strO;
        byte[] bArr = this.m;
        int i = this.f1024o;
        if (i != 1) {
            if (i == 23) {
                int i2 = Lr0.a;
                AbstractC0397Ej.c(bArr.length == 4);
                strO = String.valueOf(Float.intBitsToFloat(((bArr[1] & 255) << 16) | (bArr[0] << 24) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)));
            } else if (i != 67) {
                int i3 = Lr0.a;
                StringBuilder sb = new StringBuilder(bArr.length * 2);
                for (int i4 = 0; i4 < bArr.length; i4++) {
                    sb.append(Character.forDigit((bArr[i4] >> 4) & 15, 16));
                    sb.append(Character.forDigit(bArr[i4] & 15, 16));
                }
                strO = sb.toString();
            } else {
                int i5 = Lr0.a;
                AbstractC0397Ej.c(bArr.length == 4);
                strO = String.valueOf((bArr[1] << 16) | (bArr[0] << 24) | (bArr[2] << 8) | bArr[3]);
            }
        } else {
            strO = Lr0.o(bArr);
        }
        return "mdta: key=" + this.l + ", value=" + strO;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeByteArray(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f1024o);
    }

    public C2746sO(Parcel parcel) {
        String string = parcel.readString();
        int i = Lr0.a;
        this.l = string;
        this.m = parcel.createByteArray();
        this.n = parcel.readInt();
        this.f1024o = parcel.readInt();
    }
}
