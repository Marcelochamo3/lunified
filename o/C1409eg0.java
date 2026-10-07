package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.eg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1409eg0 implements Parcelable {
    public static final Parcelable.Creator<C1409eg0> CREATOR = new Ae0(6);
    public int l;
    public int m;
    public int[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f759o;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.l + ", mGapDir=" + this.m + ", mHasUnwantedGapAfter=" + this.f759o + ", mGapPerSpan=" + Arrays.toString(this.n) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.f759o ? 1 : 0);
        int[] iArr = this.n;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.n);
        }
    }
}
