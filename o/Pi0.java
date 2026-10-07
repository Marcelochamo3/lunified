package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class Pi0 extends AbstractC2324o {
    public static final Parcelable.Creator<Pi0> CREATOR = new C2227n(9);
    public CharSequence n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f460o;

    public Pi0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f460o = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.n) + "}";
    }

    @Override // o.AbstractC2324o, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.n, parcel, i);
        parcel.writeInt(this.f460o ? 1 : 0);
    }
}
