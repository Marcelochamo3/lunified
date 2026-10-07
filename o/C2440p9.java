package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* JADX INFO: renamed from: o.p9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2440p9 extends AbstractC2324o {
    public static final Parcelable.Creator<C2440p9> CREATOR = new C2227n(1);
    public final int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f966o;
    public final boolean p;
    public final boolean q;
    public final boolean r;

    public C2440p9(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.n = parcel.readInt();
        this.f966o = parcel.readInt();
        this.p = parcel.readInt() == 1;
        this.q = parcel.readInt() == 1;
        this.r = parcel.readInt() == 1;
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.n);
        parcel.writeInt(this.f966o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q ? 1 : 0);
        parcel.writeInt(this.r ? 1 : 0);
    }

    public C2440p9(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.n = bottomSheetBehavior.L;
        this.f966o = bottomSheetBehavior.e;
        this.p = bottomSheetBehavior.b;
        this.q = bottomSheetBehavior.I;
        this.r = bottomSheetBehavior.J;
    }
}
