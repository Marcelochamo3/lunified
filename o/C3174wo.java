package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: renamed from: o.wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3174wo implements Parcelable {
    public static final Parcelable.Creator<C3174wo> CREATOR = new C2230n1(16);
    public int l;
    public final UUID m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f1102o;
    public final byte[] p;

    public C3174wo(UUID uuid, String str, String str2, byte[] bArr) {
        uuid.getClass();
        this.m = uuid;
        this.n = str;
        str2.getClass();
        this.f1102o = str2;
        this.p = bArr;
    }

    public final boolean a(UUID uuid) {
        UUID uuid2 = AbstractC2661ra.a;
        UUID uuid3 = this.m;
        return uuid2.equals(uuid3) || uuid.equals(uuid3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3174wo)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C3174wo c3174wo = (C3174wo) obj;
        return Lr0.a(this.n, c3174wo.n) && Lr0.a(this.f1102o, c3174wo.f1102o) && Lr0.a(this.m, c3174wo.m) && Arrays.equals(this.p, c3174wo.p);
    }

    public final int hashCode() {
        if (this.l == 0) {
            int iHashCode = this.m.hashCode() * 31;
            String str = this.n;
            this.l = Arrays.hashCode(this.p) + AbstractC1674hK.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, this.f1102o, 31);
        }
        return this.l;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        UUID uuid = this.m;
        parcel.writeLong(uuid.getMostSignificantBits());
        parcel.writeLong(uuid.getLeastSignificantBits());
        parcel.writeString(this.n);
        parcel.writeString(this.f1102o);
        parcel.writeByteArray(this.p);
    }

    public C3174wo(Parcel parcel) {
        this.m = new UUID(parcel.readLong(), parcel.readLong());
        this.n = parcel.readString();
        String string = parcel.readString();
        int i = Lr0.a;
        this.f1102o = string;
        this.p = parcel.createByteArray();
    }
}
