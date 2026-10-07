package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1752i5 implements BQ {
    public static final Parcelable.Creator<C1752i5> CREATOR = new C2230n1(4);
    public final int l;
    public final String m;

    public C1752i5(int i, String str) {
        this.l = i;
        this.m = str;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.l);
        sb.append(",url=");
        return AbstractC1701hf0.h(sb, this.m, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.m);
        parcel.writeInt(this.l);
    }
}
