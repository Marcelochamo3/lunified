package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.Wc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0857Wc extends NE {
    public static final Parcelable.Creator<C0857Wc> CREATOR = new C2230n1(11);
    public final String m;
    public final boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f597o;
    public final String[] p;
    public final NE[] q;

    public C0857Wc(String str, boolean z, boolean z2, String[] strArr, NE[] neArr) {
        super("CTOC");
        this.m = str;
        this.n = z;
        this.f597o = z2;
        this.p = strArr;
        this.q = neArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0857Wc.class != obj.getClass()) {
            return false;
        }
        C0857Wc c0857Wc = (C0857Wc) obj;
        return this.n == c0857Wc.n && this.f597o == c0857Wc.f597o && Lr0.a(this.m, c0857Wc.m) && Arrays.equals(this.p, c0857Wc.p) && Arrays.equals(this.q, c0857Wc.q);
    }

    public final int hashCode() {
        int i = (((527 + (this.n ? 1 : 0)) * 31) + (this.f597o ? 1 : 0)) * 31;
        String str = this.m;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f597o ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.p);
        NE[] neArr = this.q;
        parcel.writeInt(neArr.length);
        for (NE ne : neArr) {
            parcel.writeParcelable(ne, 0);
        }
    }

    public C0857Wc(Parcel parcel) {
        super("CTOC");
        String string = parcel.readString();
        int i = Lr0.a;
        this.m = string;
        this.n = parcel.readByte() != 0;
        this.f597o = parcel.readByte() != 0;
        this.p = parcel.createStringArray();
        int i2 = parcel.readInt();
        this.q = new NE[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            this.q[i3] = (NE) parcel.readParcelable(NE.class.getClassLoader());
        }
    }
}
