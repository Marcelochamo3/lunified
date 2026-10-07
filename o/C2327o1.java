package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2327o1 implements Parcelable {
    public static final Parcelable.Creator<C2327o1> CREATOR = new C2230n1(0);
    public int l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
    }
}
