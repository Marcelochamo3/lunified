package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;

/* JADX INFO: renamed from: o.pb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2471pb0 extends K20 {
    public static final Parcelable.Creator<C2471pb0> CREATOR = new C2452pK(29);
    public int l;
    public int m;
    public int n;

    public C2471pb0(Parcel parcel) {
        super(parcel);
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }

    public C2471pb0(AbsSavedState absSavedState) {
        super(absSavedState);
    }
}
