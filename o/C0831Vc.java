package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.Vc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0831Vc extends NE {
    public static final Parcelable.Creator<C0831Vc> CREATOR = new C2230n1(10);
    public final String m;
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f575o;
    public final long p;
    public final long q;
    public final NE[] r;

    public C0831Vc(String str, int i, int i2, long j, long j2, NE[] neArr) {
        super("CHAP");
        this.m = str;
        this.n = i;
        this.f575o = i2;
        this.p = j;
        this.q = j2;
        this.r = neArr;
    }

    @Override // o.NE, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0831Vc.class != obj.getClass()) {
            return false;
        }
        C0831Vc c0831Vc = (C0831Vc) obj;
        return this.n == c0831Vc.n && this.f575o == c0831Vc.f575o && this.p == c0831Vc.p && this.q == c0831Vc.q && Lr0.a(this.m, c0831Vc.m) && Arrays.equals(this.r, c0831Vc.r);
    }

    public final int hashCode() {
        int i = (((((((527 + this.n) * 31) + this.f575o) * 31) + ((int) this.p)) * 31) + ((int) this.q)) * 31;
        String str = this.m;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f575o);
        parcel.writeLong(this.p);
        parcel.writeLong(this.q);
        NE[] neArr = this.r;
        parcel.writeInt(neArr.length);
        for (NE ne : neArr) {
            parcel.writeParcelable(ne, 0);
        }
    }

    public C0831Vc(Parcel parcel) {
        super("CHAP");
        String string = parcel.readString();
        int i = Lr0.a;
        this.m = string;
        this.n = parcel.readInt();
        this.f575o = parcel.readInt();
        this.p = parcel.readLong();
        this.q = parcel.readLong();
        int i2 = parcel.readInt();
        this.r = new NE[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.r[i3] = (NE) parcel.readParcelable(NE.class.getClassLoader());
        }
    }
}
