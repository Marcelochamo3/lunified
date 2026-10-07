package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* JADX INFO: renamed from: o.xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3271xo implements Comparator, Parcelable {
    public static final Parcelable.Creator<C3271xo> CREATOR = new C2230n1(15);
    public final C3174wo[] l;
    public int m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f1124o;

    public C3271xo(String str, ArrayList arrayList) {
        this(str, false, (C3174wo[]) arrayList.toArray(new C3174wo[0]));
    }

    public final C3271xo a(String str) {
        return Lr0.a(this.n, str) ? this : new C3271xo(str, false, this.l);
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C3174wo c3174wo = (C3174wo) obj;
        C3174wo c3174wo2 = (C3174wo) obj2;
        UUID uuid = AbstractC2661ra.a;
        if (uuid.equals(c3174wo.m)) {
            return uuid.equals(c3174wo2.m) ? 0 : 1;
        }
        return c3174wo.m.compareTo(c3174wo2.m);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3271xo.class != obj.getClass()) {
            return false;
        }
        C3271xo c3271xo = (C3271xo) obj;
        return Lr0.a(this.n, c3271xo.n) && Arrays.equals(this.l, c3271xo.l);
    }

    public final int hashCode() {
        if (this.m == 0) {
            String str = this.n;
            this.m = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.l);
        }
        return this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.n);
        parcel.writeTypedArray(this.l, 0);
    }

    public C3271xo(String str, boolean z, C3174wo... c3174woArr) {
        this.n = str;
        c3174woArr = z ? (C3174wo[]) c3174woArr.clone() : c3174woArr;
        this.l = c3174woArr;
        this.f1124o = c3174woArr.length;
        Arrays.sort(c3174woArr, this);
    }

    public C3271xo(Parcel parcel) {
        this.n = parcel.readString();
        C3174wo[] c3174woArr = (C3174wo[]) parcel.createTypedArray(C3174wo.CREATOR);
        int i = Lr0.a;
        this.l = c3174woArr;
        this.f1124o = c3174woArr.length;
    }
}
