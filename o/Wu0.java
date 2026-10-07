package o;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class Wu0 implements BQ {
    public static final Parcelable.Creator<Wu0> CREATOR = new Ae0(21);
    public final String l;
    public final String m;

    public Wu0(String str, String str2) {
        this.l = str;
        this.m = str2;
    }

    @Override // o.BQ
    public final /* synthetic */ C0643Nw b() {
        return null;
    }

    @Override // o.BQ
    public final /* synthetic */ byte[] c() {
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // o.BQ
    public final void d(C2166mP c2166mP) {
        String str = this.l;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    b = 0;
                }
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    b = 1;
                }
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    b = 2;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    b = 3;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    b = 4;
                }
                break;
        }
        String str2 = this.m;
        if (b == 0) {
            c2166mP.c = str2;
            return;
        }
        if (b == 1) {
            c2166mP.a = str2;
            return;
        }
        if (b == 2) {
            c2166mP.g = str2;
        } else if (b == 3) {
            c2166mP.d = str2;
        } else {
            if (b != 4) {
                return;
            }
            c2166mP.b = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Wu0 wu0 = (Wu0) obj;
        return this.l.equals(wu0.l) && this.m.equals(wu0.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + AbstractC1674hK.i(527, this.l, 31);
    }

    public final String toString() {
        return "VC: " + this.l + "=" + this.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.l);
        parcel.writeString(this.m);
    }

    public Wu0(Parcel parcel) {
        String string = parcel.readString();
        int i = Lr0.a;
        this.l = string;
        this.m = parcel.readString();
    }
}
