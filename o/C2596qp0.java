package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: o.qp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2596qp0 extends K20 {
    public static final Parcelable.Creator<C2596qp0> CREATOR = new Ae0(11);
    public boolean l;

    public C2596qp0(Parcel parcel) {
        super(parcel);
        this.l = parcel.readInt() == 1;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.l ? 1 : 0);
    }

    public C2596qp0(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
