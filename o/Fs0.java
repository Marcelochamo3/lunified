package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Fs0 implements Parcelable {
    public static final Parcelable.Creator<Fs0> CREATOR = new Ae0(17);
    public final int l;
    public final String m;

    public Fs0(int i, String str) {
        this.l = i;
        this.m = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Fs0)) {
            return false;
        }
        Fs0 fs0 = (Fs0) obj;
        return this.l == fs0.l && AbstractC1474fG.b(this.m, fs0.m);
    }

    public final int hashCode() {
        int i = this.l * 31;
        String str = this.m;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Season(number=" + this.l + ", title=" + this.m + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "out");
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
    }
}
