package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: o.yx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3386yx implements Parcelable {
    public static final Parcelable.Creator<C3386yx> CREATOR = new C2230n1(20);
    public ArrayList l;
    public ArrayList m;
    public G7[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1141o;
    public String p;
    public ArrayList q;
    public ArrayList r;
    public ArrayList s;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeTypedArray(this.n, i);
        parcel.writeInt(this.f1141o);
        parcel.writeString(this.p);
        parcel.writeStringList(this.q);
        parcel.writeTypedList(this.r);
        parcel.writeTypedList(this.s);
    }
}
