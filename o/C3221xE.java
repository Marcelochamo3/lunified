package o;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: o.xE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3221xE implements InterfaceC3318yE {
    public IBinder d;

    @Override // o.InterfaceC3318yE
    public final void a(String[] strArr) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken(InterfaceC3318yE.a);
            parcelObtain.writeStringArray(strArr);
            this.d.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }
}
