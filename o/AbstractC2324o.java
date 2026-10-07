package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2324o implements Parcelable {
    public final Parcelable l;
    public static final C2130m m = new C2130m();
    public static final Parcelable.Creator<AbstractC2324o> CREATOR = new C2227n(0);

    public AbstractC2324o() {
        this.l = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.l, i);
    }

    public AbstractC2324o(Parcelable parcelable) {
        if (parcelable != null) {
            this.l = parcelable == m ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC2324o(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.l = parcelable == null ? m : parcelable;
    }
}
