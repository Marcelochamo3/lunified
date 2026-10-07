package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public final class KK extends K20 {
    public static final Parcelable.Creator<KK> CREATOR = new C2452pK(1);
    public String l;

    public KK(Parcel parcel) {
        super(parcel);
        this.l = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.l);
    }

    public KK(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
