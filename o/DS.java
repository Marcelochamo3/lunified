package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;

/* JADX INFO: loaded from: classes.dex */
public final class DS extends Binder implements InterfaceC3415zE {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public DS(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, InterfaceC3415zE.b);
    }

    public final void b(int i, String[] strArr) {
        AbstractC1474fG.j(strArr, "tables");
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.n) {
            try {
                String str = (String) multiInstanceInvalidationService.m.get(Integer.valueOf(i));
                if (str == null) {
                    return;
                }
                int iBeginBroadcast = multiInstanceInvalidationService.n.beginBroadcast();
                for (int i2 = 0; i2 < iBeginBroadcast; i2++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.n.getBroadcastCookie(i2);
                        AbstractC1474fG.h(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int iIntValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.m.get(num);
                        if (i != iIntValue && AbstractC1474fG.b(str, str2)) {
                            try {
                                ((InterfaceC3318yE) multiInstanceInvalidationService.n.getBroadcastItem(i2)).a(strArr);
                            } catch (RemoteException unused) {
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.n.finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.n.finishBroadcast();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int c(InterfaceC3318yE interfaceC3318yE, String str) {
        AbstractC1474fG.j(interfaceC3318yE, "callback");
        int i = 0;
        if (str == null) {
            return 0;
        }
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.n) {
            try {
                int i2 = multiInstanceInvalidationService.l + 1;
                multiInstanceInvalidationService.l = i2;
                if (multiInstanceInvalidationService.n.register(interfaceC3318yE, Integer.valueOf(i2))) {
                    multiInstanceInvalidationService.m.put(Integer.valueOf(i2), str);
                    i = i2;
                } else {
                    multiInstanceInvalidationService.l--;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = InterfaceC3415zE.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        InterfaceC3318yE interfaceC3318yE = null;
        InterfaceC3318yE interfaceC3318yE2 = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(InterfaceC3318yE.a);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC3318yE)) {
                    C3221xE c3221xE = new C3221xE();
                    c3221xE.d = strongBinder;
                    interfaceC3318yE = c3221xE;
                } else {
                    interfaceC3318yE = (InterfaceC3318yE) iInterfaceQueryLocalInterface;
                }
            }
            int iC = c(interfaceC3318yE, parcel.readString());
            parcel2.writeNoException();
            parcel2.writeInt(iC);
        } else if (i == 2) {
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(InterfaceC3318yE.a);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof InterfaceC3318yE)) {
                    C3221xE c3221xE2 = new C3221xE();
                    c3221xE2.d = strongBinder2;
                    interfaceC3318yE2 = c3221xE2;
                } else {
                    interfaceC3318yE2 = (InterfaceC3318yE) iInterfaceQueryLocalInterface2;
                }
            }
            int i3 = parcel.readInt();
            AbstractC1474fG.j(interfaceC3318yE2, "callback");
            MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
            synchronized (multiInstanceInvalidationService.n) {
                multiInstanceInvalidationService.n.unregister(interfaceC3318yE2);
            }
            parcel2.writeNoException();
        } else {
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            b(parcel.readInt(), parcel.createStringArray());
        }
        return true;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
