package o;

import android.os.Parcel;
import android.os.Parcelable;
import com.skidush.clonex.models.Video$Type;

/* JADX INFO: loaded from: classes.dex */
public final class Is0 extends Video$Type {
    public static final Parcelable.Creator<Is0> CREATOR = new Ae0(19);
    public final String l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f332o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Is0(String str, String str2, String str3, String str4) {
        super(0);
        AbstractC1474fG.j(str, "id");
        AbstractC1474fG.j(str2, "title");
        AbstractC1474fG.j(str3, "releaseDate");
        AbstractC1474fG.j(str4, "poster");
        this.l = str;
        this.m = str2;
        this.n = str3;
        this.f332o = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Is0)) {
            return false;
        }
        Is0 is0 = (Is0) obj;
        return AbstractC1474fG.b(this.l, is0.l) && AbstractC1474fG.b(this.m, is0.m) && AbstractC1474fG.b(this.n, is0.n) && AbstractC1474fG.b(this.f332o, is0.f332o);
    }

    public final int hashCode() {
        return this.f332o.hashCode() + AbstractC1674hK.i(AbstractC1674hK.i(this.l.hashCode() * 31, this.m, 31), this.n, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Movie(id=");
        sb.append(this.l);
        sb.append(", title=");
        sb.append(this.m);
        sb.append(", releaseDate=");
        sb.append(this.n);
        sb.append(", poster=");
        return AbstractC1701hf0.h(sb, this.f332o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "out");
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.f332o);
    }
}
