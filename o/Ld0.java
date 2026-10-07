package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: loaded from: classes.dex */
public final class Ld0 extends AbstractC2324o {
    public static final Parcelable.Creator<Ld0> CREATOR = new C2227n(8);
    public final int n;

    public Ld0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.n = parcel.readInt();
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n);
    }

    public Ld0(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.n = sideSheetBehavior.h;
    }
}
