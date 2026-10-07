package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: renamed from: o.kr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2016kr implements BQ {
    public static final Parcelable.Creator<C2016kr> CREATOR;
    public static final C0643Nw r;
    public static final C0643Nw s;
    public final String l;
    public final String m;
    public final long n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f878o;
    public final byte[] p;
    public int q;

    static {
        C0617Mw c0617Mw = new C0617Mw();
        c0617Mw.k = "application/id3";
        r = c0617Mw.a();
        C0617Mw c0617Mw2 = new C0617Mw();
        c0617Mw2.k = "application/x-scte35";
        s = c0617Mw2.a();
        CREATOR = new C2230n1(18);
    }

    public C2016kr(long j, String str, String str2, byte[] bArr, long j2) {
        this.l = str;
        this.m = str2;
        this.n = j;
        this.f878o = j2;
        this.p = bArr;
    }

    @Override // o.BQ
    public final C0643Nw b() {
        String str = this.l;
        str.getClass();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return s;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return r;
            default:
                return null;
        }
    }

    @Override // o.BQ
    public final byte[] c() {
        if (b() != null) {
            return this.p;
        }
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
        if (obj == null || C2016kr.class != obj.getClass()) {
            return false;
        }
        C2016kr c2016kr = (C2016kr) obj;
        return this.n == c2016kr.n && this.f878o == c2016kr.f878o && Lr0.a(this.l, c2016kr.l) && Lr0.a(this.m, c2016kr.m) && Arrays.equals(this.p, c2016kr.p);
    }

    public final int hashCode() {
        if (this.q == 0) {
            String str = this.l;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.m;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.n;
            int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f878o;
            this.q = Arrays.hashCode(this.p) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.q;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.l + ", id=" + this.f878o + ", durationMs=" + this.n + ", value=" + this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeLong(this.n);
        parcel.writeLong(this.f878o);
        parcel.writeByteArray(this.p);
    }

    public C2016kr(Parcel parcel) {
        String string = parcel.readString();
        int i = Lr0.a;
        this.l = string;
        this.m = parcel.readString();
        this.n = parcel.readLong();
        this.f878o = parcel.readLong();
        this.p = parcel.createByteArray();
    }
}
