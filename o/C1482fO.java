package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: o.fO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1482fO extends View.BaseSavedState {
    public static final Parcelable.Creator<C1482fO> CREATOR = new C2452pK(2);
    public int l;

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.l;
        if (i != 1) {
            str = i != 2 ? "unchecked" : "indeterminate";
        } else {
            str = "checked";
        }
        return AbstractC1701hf0.h(sb, str, "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.l));
    }
}
