package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: renamed from: o.lu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2121lu0 extends View.BaseSavedState {
    public static final Parcelable.Creator<C2121lu0> CREATOR = new C2227n(11);
    public int l;
    public int m;
    public Parcelable n;

    public C2121lu0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readParcelable(classLoader);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeParcelable(this.n, i);
    }
}
