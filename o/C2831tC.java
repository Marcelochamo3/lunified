package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: o.tC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2831tC implements BQ {
    public static final Parcelable.Creator<C2831tC> CREATOR = new C2230n1(24);
    public final String l;
    public final String m;
    public final List n;

    public C2831tC(String str, String str2, List list) {
        this.l = str;
        this.m = str2;
        this.n = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // o.BQ
    public final /* synthetic */ C0643Nw b() {
        return null;
    }

    @Override // o.BQ
    public final /* synthetic */ byte[] c() {
        return null;
    }

    @Override // o.BQ
    public final /* synthetic */ void d(C2166mP c2166mP) {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2831tC.class != obj.getClass()) {
            return false;
        }
        C2831tC c2831tC = (C2831tC) obj;
        return TextUtils.equals(this.l, c2831tC.l) && TextUtils.equals(this.m, c2831tC.m) && this.n.equals(c2831tC.n);
    }

    public final int hashCode() {
        String str = this.l;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.m;
        return this.n.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.l;
        sb.append(str != null ? AbstractC1701hf0.h(AbstractC1701hf0.l(" [", str, ", "), this.m, "]") : "");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        List list = this.n;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
    }

    public C2831tC(Parcel parcel) {
        this.l = parcel.readString();
        this.m = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((C2734sC) parcel.readParcelable(C2734sC.class.getClassLoader()));
        }
        this.n = Collections.unmodifiableList(arrayList);
    }
}
