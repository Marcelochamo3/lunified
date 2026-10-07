package o;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Js0 implements Parcelable {
    public static final Parcelable.Creator<Js0> CREATOR = new Ae0(13);
    public final String l;
    public final Map m;
    public final String n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f352o;
    public final String p;
    public final byte[] q;
    public final String r;
    public final String s;
    public final String t;
    public final List u;
    public final boolean v;
    public final boolean w;

    public Js0(String str, Map map, String str2, String str3, String str4, byte[] bArr, String str5, String str6, String str7, List list, boolean z, boolean z2) {
        AbstractC1474fG.j(str, "source");
        AbstractC1474fG.j(list, "subtitles");
        this.l = str;
        this.m = map;
        this.n = str2;
        this.f352o = str3;
        this.p = str4;
        this.q = bArr;
        this.r = str5;
        this.s = str6;
        this.t = str7;
        this.u = list;
        this.v = z;
        this.w = z2;
    }

    public static Js0 a(Js0 js0, String str, String str2, byte[] bArr, String str3, String str4, ArrayList arrayList, boolean z, int i) {
        String str5 = js0.l;
        Map map = js0.m;
        String str6 = (i & 4) != 0 ? js0.n : str;
        String str7 = (i & 8) != 0 ? js0.f352o : str2;
        String str8 = js0.p;
        byte[] bArr2 = (i & 32) != 0 ? js0.q : bArr;
        String str9 = (i & 64) != 0 ? js0.r : str3;
        String str10 = js0.s;
        String str11 = (i & 256) != 0 ? js0.t : str4;
        List list = (i & 512) != 0 ? js0.u : arrayList;
        boolean z2 = js0.v;
        boolean z3 = (i & C1672hI.a.g) != 0 ? js0.w : z;
        js0.getClass();
        AbstractC1474fG.j(str5, "source");
        AbstractC1474fG.j(list, "subtitles");
        return new Js0(str5, map, str6, str7, str8, bArr2, str9, str10, str11, list, z2, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ArrayList e() {
        List<Es0> list = this.u;
        ArrayList arrayList = new ArrayList(AbstractC1016af.O(list, 10));
        for (Es0 es0 : list) {
            String strA = AbstractC3355yh0.a(es0.l);
            String str = es0.l;
            String strB = AbstractC3355yh0.b(str);
            if (strB != null) {
                str = strB;
            }
            String str2 = es0.m;
            C1777iP c1777iP = new C1777iP(Uri.parse(str2));
            String strM = es0.f248o;
            if (strM == null) {
                strM = AbstractC0397Ej.M(str2);
            }
            c1777iP.b = strM;
            c1777iP.c = strA;
            c1777iP.f = str;
            c1777iP.d = es0.n ? 1 : 0;
            arrayList.add(new C1873jP(c1777iP));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Js0)) {
            return false;
        }
        Js0 js0 = (Js0) obj;
        return AbstractC1474fG.b(this.l, js0.l) && AbstractC1474fG.b(this.m, js0.m) && AbstractC1474fG.b(this.n, js0.n) && AbstractC1474fG.b(this.f352o, js0.f352o) && AbstractC1474fG.b(this.p, js0.p) && AbstractC1474fG.b(this.q, js0.q) && AbstractC1474fG.b(this.r, js0.r) && AbstractC1474fG.b(this.s, js0.s) && AbstractC1474fG.b(this.t, js0.t) && AbstractC1474fG.b(this.u, js0.u) && this.v == js0.v && this.w == js0.w;
    }

    public final int hashCode() {
        int iHashCode = this.l.hashCode() * 31;
        Map map = this.m;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.n;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f352o;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        byte[] bArr = this.q;
        int iHashCode6 = (iHashCode5 + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        String str4 = this.r;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.s;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.t;
        return ((AbstractC1674hK.j(this.u, (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31, 31) + (this.v ? 1231 : 1237)) * 31) + (this.w ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.n;
        if (str == null) {
            str = "unknown";
        }
        return AbstractC1701hf0.u("Video(type=", str, ", transport=<redacted>)");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1474fG.j(parcel, "out");
        parcel.writeString(this.l);
        Map map = this.m;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.n);
        parcel.writeString(this.f352o);
        parcel.writeString(this.p);
        parcel.writeByteArray(this.q);
        parcel.writeString(this.r);
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        List list = this.u;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Es0) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
    }

    public /* synthetic */ Js0(String str, Map map, String str2, String str3, String str4, byte[] bArr, String str5, String str6, String str7, List list, boolean z, int i) {
        this(str, (i & 2) != 0 ? null : map, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bArr, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? C1233cq.l : list, (i & 1024) != 0 ? false : z, false);
    }
}
