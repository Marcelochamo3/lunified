package o;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: o.r80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2632r80 extends Binder implements DE {
    public static final /* synthetic */ int e = 0;
    public final /* synthetic */ C2729s80 d;

    public BinderC2632r80(C2729s80 c2729s80) {
        this.d = c2729s80;
        attachInterface(this, DE.c);
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = DE.c;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        int i3 = parcel.readInt();
        Object objCreateFromParcel = parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null;
        C2729s80 c2729s80 = this.d;
        c2729s80.getClass();
        c2729s80.a(i3, (Bundle) objCreateFromParcel);
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
