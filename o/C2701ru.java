package o;

import java.util.List;

/* JADX INFO: renamed from: o.ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2701ru {
    public final String a;
    public final List b;
    public final Integer c;
    public final Long d;
    public final String e;
    public final String f;
    public final String g;

    public C2701ru(String str, List list, Integer num, Long l, String str2, String str3, String str4) {
        this.a = str;
        this.b = list;
        this.c = num;
        this.d = l;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2701ru)) {
            return false;
        }
        C2701ru c2701ru = (C2701ru) obj;
        return AbstractC1474fG.b(this.a, c2701ru.a) && AbstractC1474fG.b(this.b, c2701ru.b) && AbstractC1474fG.b(this.c, c2701ru.c) && AbstractC1474fG.b(this.d, c2701ru.d) && AbstractC1474fG.b(this.e, c2701ru.e) && AbstractC1474fG.b(this.f, c2701ru.f) && AbstractC1474fG.b(this.g, c2701ru.g);
    }

    public final int hashCode() {
        String str = this.a;
        int iJ = AbstractC1674hK.j(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        Integer num = this.c;
        int iHashCode = (iJ + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoteConfig(page=");
        sb.append(this.a);
        sb.append(", apiBases=");
        sb.append(this.b);
        sb.append(", statusField=");
        sb.append(this.c);
        sb.append(", finishThreshold=");
        sb.append(this.d);
        sb.append(", playerReferer=");
        sb.append(this.e);
        sb.append(", hlsKey=");
        sb.append(this.f);
        sb.append(", hlsIv=");
        return AbstractC1701hf0.h(sb, this.g, ")");
    }
}
