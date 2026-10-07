package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: o.sp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2788sp extends K20 {
    public static final Parcelable.Creator<C2788sp> CREATOR = new C2230n1(17);
    public String l;

    public C2788sp(Parcel parcel) {
        super(parcel);
        this.l = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.l);
    }

    public C2788sp(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
