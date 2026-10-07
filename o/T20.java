package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: loaded from: classes.dex */
public final class T20 extends K20 {
    public static final Parcelable.Creator<T20> CREATOR = new C2452pK(24);
    public final int l;

    public T20(Parcel parcel) {
        super(parcel);
        this.l = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.l);
    }

    public T20(AbsSavedState absSavedState, int i) {
        super(absSavedState);
        this.l = i;
    }
}
