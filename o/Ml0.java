package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Ml0 extends AbstractC2324o {
    public static final Parcelable.Creator<Ml0> CREATOR = new C2227n(10);
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f400o;

    public Ml0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.n = parcel.readInt();
        this.f400o = parcel.readInt() != 0;
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f400o ? 1 : 0);
    }
}
