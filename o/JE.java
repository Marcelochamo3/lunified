package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class JE implements BQ {
    public static final Parcelable.Creator<JE> CREATOR = new C2230n1(26);
    public final int l;
    public final String m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f338o;
    public final boolean p;
    public final int q;

    public JE(int i, int i2, String str, String str2, String str3, boolean z) {
        AbstractC0397Ej.c(i2 == -1 || i2 > 0);
        this.l = i;
        this.m = str;
        this.n = str2;
        this.f338o = str3;
        this.p = z;
        this.q = i2;
    }

    public static JE a(Map map) {
        boolean z;
        int i;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List list = (List) map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            try {
                i2 = Integer.parseInt((String) list.get(0)) * 1000;
                if (i2 > 0) {
                    z = true;
                } else {
                    try {
                        AP.z();
                        i2 = -1;
                        z = false;
                    } catch (NumberFormatException unused) {
                        AP.z();
                        i = i2;
                        z = false;
                    }
                }
                i = i2;
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
        } else {
            z = false;
            i = -1;
        }
        List list2 = (List) map.get("icy-genre");
        if (list2 != null) {
            str = (String) list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List list3 = (List) map.get("icy-name");
        if (list3 != null) {
            str2 = (String) list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List list4 = (List) map.get("icy-url");
        if (list4 != null) {
            str3 = (String) list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List list5 = (List) map.get("icy-pub");
        if (list5 != null) {
            zEquals = ((String) list5.get(0)).equals("1");
            z = true;
        } else {
            zEquals = false;
        }
        List list6 = (List) map.get("icy-metaint");
        if (list6 != null) {
            try {
                int i4 = Integer.parseInt((String) list6.get(0));
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        AP.z();
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        AP.z();
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new JE(i, i3, str, str2, str3, zEquals);
        }
        return null;
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
    public final void d(C2166mP c2166mP) {
        String str = this.n;
        if (str != null) {
            c2166mP.E = str;
        }
        String str2 = this.m;
        if (str2 != null) {
            c2166mP.C = str2;
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
        if (obj == null || JE.class != obj.getClass()) {
            return false;
        }
        JE je = (JE) obj;
        return this.l == je.l && Lr0.a(this.m, je.m) && Lr0.a(this.n, je.n) && Lr0.a(this.f338o, je.f338o) && this.p == je.p && this.q == je.q;
    }

    public final int hashCode() {
        int i = (527 + this.l) * 31;
        String str = this.m;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.n;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f338o;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.p ? 1 : 0)) * 31) + this.q;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.n + "\", genre=\"" + this.m + "\", bitrate=" + this.l + ", metadataInterval=" + this.q;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.f338o);
        int i2 = Lr0.a;
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q);
    }

    public JE(Parcel parcel) {
        this.l = parcel.readInt();
        this.m = parcel.readString();
        this.n = parcel.readString();
        this.f338o = parcel.readString();
        int i = Lr0.a;
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt();
    }
}
