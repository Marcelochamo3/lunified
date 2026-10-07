package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class If0 extends Bf0 {
    public static final Parcelable.Creator<If0> CREATOR = new Ae0(5);
    public final List l;

    public If0(Parcel parcel) {
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new Hf0(parcel));
        }
        this.l = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.l;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            Hf0 hf0 = (Hf0) list.get(i2);
            parcel.writeLong(hf0.a);
            parcel.writeByte(hf0.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(hf0.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(hf0.d ? (byte) 1 : (byte) 0);
            List list2 = hf0.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                Gf0 gf0 = (Gf0) list2.get(i3);
                parcel.writeInt(gf0.a);
                parcel.writeLong(gf0.b);
            }
            parcel.writeLong(hf0.e);
            parcel.writeByte(hf0.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(hf0.h);
            parcel.writeInt(hf0.i);
            parcel.writeInt(hf0.j);
            parcel.writeInt(hf0.k);
        }
    }

    public If0(ArrayList arrayList) {
        this.l = Collections.unmodifiableList(arrayList);
    }
}
