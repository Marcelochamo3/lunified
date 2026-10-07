package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.zP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3426zP implements Parcelable {
    public static final Parcelable.Creator<C3426zP> CREATOR = new C2452pK(7);
    public final String l;
    public final String m;

    public C3426zP(String str, String str2) {
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "name");
        this.l = str;
        this.m = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3426zP)) {
            return false;
        }
        C3426zP c3426zP = (C3426zP) obj;
        return AbstractC1474fG.b(this.l, c3426zP.l) && AbstractC1474fG.b(this.m, c3426zP.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + (this.l.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaServer(id=");
        sb.append(this.l);
        sb.append(", name=");
        return AbstractC1701hf0.h(sb, this.m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "out");
        parcel.writeString(this.l);
        parcel.writeString(this.m);
    }
}
