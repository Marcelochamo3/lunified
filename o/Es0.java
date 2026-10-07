package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Es0 implements Parcelable {
    public static final Parcelable.Creator<Es0> CREATOR = new Ae0(15);
    public final String l;
    public final String m;
    public boolean n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f248o;

    public Es0(String str, String str2, String str3, boolean z) {
        AbstractC1474fG.j(str, "label");
        AbstractC1474fG.j(str2, "file");
        this.l = str;
        this.m = str2;
        this.n = z;
        this.f248o = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Es0)) {
            return false;
        }
        Es0 es0 = (Es0) obj;
        return AbstractC1474fG.b(this.l, es0.l) && AbstractC1474fG.b(this.m, es0.m) && this.n == es0.n && AbstractC1474fG.b(this.f248o, es0.f248o);
    }

    public final int hashCode() {
        int i = (AbstractC1674hK.i(this.l.hashCode() * 31, this.m, 31) + (this.n ? 1231 : 1237)) * 31;
        String str = this.f248o;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        boolean z = this.n;
        StringBuilder sb = new StringBuilder("Subtitle(label=");
        sb.append(this.l);
        sb.append(", file=");
        sb.append(this.m);
        sb.append(", default=");
        sb.append(z);
        sb.append(", mimeType=");
        return AbstractC1701hf0.h(sb, this.f248o, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "out");
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeInt(this.n ? 1 : 0);
        parcel.writeString(this.f248o);
    }

    public /* synthetic */ Es0(String str, String str2, boolean z, String str3, int i) {
        this(str, str2, (i & 8) != 0 ? null : str3, (i & 4) != 0 ? false : z);
    }
}
