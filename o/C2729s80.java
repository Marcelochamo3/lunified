package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.s80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2729s80 implements Parcelable {
    public static final Parcelable.Creator<C2729s80> CREATOR = new C2452pK(28);
    public DE l;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.l == null) {
                    this.l = new BinderC2632r80(this);
                }
                parcel.writeStrongBinder(this.l.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(int i, Bundle bundle) {
    }
}
