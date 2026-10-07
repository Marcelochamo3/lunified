package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class HS extends K20 {
    public static final Parcelable.Creator<HS> CREATOR = new C2452pK(15);
    public HashSet l;

    public HS(Parcel parcel) {
        super(parcel);
        int i = parcel.readInt();
        this.l = new HashSet();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Collections.addAll(this.l, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.l.size());
        HashSet hashSet = this.l;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public HS(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
