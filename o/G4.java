package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class G4 extends View.BaseSavedState {
    public static final Parcelable.Creator<G4> CREATOR = new C2230n1(3);
    public boolean l;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
    }
}
