package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H7 implements Parcelable {
    public static final Parcelable.Creator<H7> CREATOR = new C2230n1(6);
    public final List l;
    public final List m;

    public H7(ArrayList arrayList, ArrayList arrayList2) {
        this.l = arrayList;
        this.m = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.l);
        parcel.writeTypedList(this.m);
    }

    public H7(Parcel parcel) {
        this.l = parcel.createStringArrayList();
        this.m = parcel.createTypedArrayList(G7.CREATOR);
    }
}
