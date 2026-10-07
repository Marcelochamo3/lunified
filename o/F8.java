package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class F8 extends NE {
    public static final Parcelable.Creator<F8> CREATOR = new C2230n1(8);
    public final byte[] m;

    public F8(String str, byte[] bArr) {
        super(str);
        this.m = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || F8.class != obj.getClass()) {
            return false;
        }
        F8 f8 = (F8) obj;
        return this.l.equals(f8.l) && Arrays.equals(this.m, f8.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.m) + AbstractC1674hK.i(527, this.l, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeByteArray(this.m);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public F8(Parcel parcel) {
        String string = parcel.readString();
        int i = Lr0.a;
        super(string);
        this.m = parcel.createByteArray();
    }
}
