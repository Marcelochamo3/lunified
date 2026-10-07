package o;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2227n implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC2324o.m;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C2440p9(parcel, (ClassLoader) null);
            case 2:
                return new C1598gd(parcel, null);
            case 3:
                return new C0836Vh(parcel, null);
            case 4:
                return new UN(parcel, null);
            case 5:
                return new C2946uU(parcel, null);
            case 6:
                return new C2368oX(parcel, null);
            case 7:
                return new C1559g60(parcel, null);
            case 8:
                return new Ld0(parcel, (ClassLoader) null);
            case 9:
                return new Pi0(parcel, null);
            case 10:
                return new Ml0(parcel, null);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new C2121lu0(parcel, null);
                }
                C2121lu0 c2121lu0 = new C2121lu0(parcel);
                c2121lu0.l = parcel.readInt();
                c2121lu0.m = parcel.readInt();
                c2121lu0.n = parcel.readParcelable(null);
                return c2121lu0;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new AbstractC2324o[i];
            case 1:
                return new C2440p9[i];
            case 2:
                return new C1598gd[i];
            case 3:
                return new C0836Vh[i];
            case 4:
                return new UN[i];
            case 5:
                return new C2946uU[i];
            case 6:
                return new C2368oX[i];
            case 7:
                return new C1559g60[i];
            case 8:
                return new Ld0[i];
            case 9:
                return new Pi0[i];
            case 10:
                return new Ml0[i];
            default:
                return new C2121lu0[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC2324o.m;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C2440p9(parcel, classLoader);
            case 2:
                return new C1598gd(parcel, classLoader);
            case 3:
                return new C0836Vh(parcel, classLoader);
            case 4:
                return new UN(parcel, classLoader);
            case 5:
                return new C2946uU(parcel, classLoader);
            case 6:
                return new C2368oX(parcel, classLoader);
            case 7:
                return new C1559g60(parcel, classLoader);
            case 8:
                return new Ld0(parcel, classLoader);
            case 9:
                return new Pi0(parcel, classLoader);
            case 10:
                return new Ml0(parcel, classLoader);
            default:
                if (Build.VERSION.SDK_INT >= 24) {
                    return new C2121lu0(parcel, classLoader);
                }
                C2121lu0 c2121lu0 = new C2121lu0(parcel);
                c2121lu0.l = parcel.readInt();
                c2121lu0.m = parcel.readInt();
                c2121lu0.n = parcel.readParcelable(null);
                return c2121lu0;
        }
    }
}
