package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: o.bR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1095bR implements BQ {
    public static final Parcelable.Creator<C1095bR> CREATOR = new C2452pK(13);
    public final long l;
    public final long m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f694o;
    public final long p;

    public C1095bR(long j, long j2, long j3, long j4, long j5) {
        this.l = j;
        this.m = j2;
        this.n = j3;
        this.f694o = j4;
        this.p = j5;
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
        if (obj == null || C1095bR.class != obj.getClass()) {
            return false;
        }
        C1095bR c1095bR = (C1095bR) obj;
        return this.l == c1095bR.l && this.m == c1095bR.m && this.n == c1095bR.n && this.f694o == c1095bR.f694o && this.p == c1095bR.p;
    }

    public final int hashCode() {
        return Sr0.o(this.p) + ((Sr0.o(this.f694o) + ((Sr0.o(this.n) + ((Sr0.o(this.m) + ((Sr0.o(this.l) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.l + ", photoSize=" + this.m + ", photoPresentationTimestampUs=" + this.n + ", videoStartPosition=" + this.f694o + ", videoSize=" + this.p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.l);
        parcel.writeLong(this.m);
        parcel.writeLong(this.n);
        parcel.writeLong(this.f694o);
        parcel.writeLong(this.p);
    }

    public C1095bR(Parcel parcel) {
        this.l = parcel.readLong();
        this.m = parcel.readLong();
        this.n = parcel.readLong();
        this.f694o = parcel.readLong();
        this.p = parcel.readLong();
    }
}
