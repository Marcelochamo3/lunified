package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: o.fg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1507fg0 implements Parcelable {
    public static final Parcelable.Creator<C1507fg0> CREATOR = new Ae0(7);
    public int l;
    public int m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int[] f778o;
    public int p;
    public int[] q;
    public List r;
    public boolean s;
    public boolean t;
    public boolean u;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
        if (this.n > 0) {
            parcel.writeIntArray(this.f778o);
        }
        parcel.writeInt(this.p);
        if (this.p > 0) {
            parcel.writeIntArray(this.q);
        }
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeList(this.r);
    }
}
