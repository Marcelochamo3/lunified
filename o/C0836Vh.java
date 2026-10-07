package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* JADX INFO: renamed from: o.Vh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0836Vh extends AbstractC2324o {
    public static final Parcelable.Creator<C0836Vh> CREATOR = new C2227n(3);
    public SparseArray n;

    public C0836Vh(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.n = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.n.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.n;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.n.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.n.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
