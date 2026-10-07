package o;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: renamed from: o.ar0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1041ar0 {
    public final EnumC1139br0 a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final long f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final Boolean m;
    public final String n;

    public C1041ar0(EnumC1139br0 enumC1139br0, String str, int i, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10) {
        AbstractC1474fG.j(str, "host");
        AbstractC1474fG.j(str2, "username");
        AbstractC1474fG.j(str3, "password");
        AbstractC1474fG.j(str4, "country");
        AbstractC1474fG.j(str5, "selectionCode");
        AbstractC1474fG.j(str6, "exitIp");
        AbstractC1474fG.j(str7, "exitCountryCode");
        AbstractC1474fG.j(str8, "isp");
        AbstractC1474fG.j(str9, "organization");
        AbstractC1474fG.j(str10, "vendor");
        this.a = enumC1139br0;
        this.b = str;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = bool;
        this.n = str10;
    }

    public final Proxy a() {
        return new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(this.b, this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1041ar0)) {
            return false;
        }
        C1041ar0 c1041ar0 = (C1041ar0) obj;
        return this.a == c1041ar0.a && AbstractC1474fG.b(this.b, c1041ar0.b) && this.c == c1041ar0.c && AbstractC1474fG.b(this.d, c1041ar0.d) && AbstractC1474fG.b(this.e, c1041ar0.e) && this.f == c1041ar0.f && AbstractC1474fG.b(this.g, c1041ar0.g) && AbstractC1474fG.b(this.h, c1041ar0.h) && AbstractC1474fG.b(this.i, c1041ar0.i) && AbstractC1474fG.b(this.j, c1041ar0.j) && AbstractC1474fG.b(this.k, c1041ar0.k) && AbstractC1474fG.b(this.l, c1041ar0.l) && AbstractC1474fG.b(this.m, c1041ar0.m) && AbstractC1474fG.b(this.n, c1041ar0.n);
    }

    public final int hashCode() {
        int i = AbstractC1674hK.i(AbstractC1674hK.i((AbstractC1674hK.i(this.a.hashCode() * 31, this.b, 31) + this.c) * 31, this.d, 31), this.e, 31);
        long j = this.f;
        int i2 = AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i(AbstractC1674hK.i((i + ((int) (j ^ (j >>> 32)))) * 31, this.g, 31), this.h, 31), this.i, 31), this.j, 31), this.k, 31), this.l, 31);
        Boolean bool = this.m;
        return this.n.hashCode() + ((i2 + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProxyCredentials(provider=");
        sb.append(this.a);
        sb.append(", host=");
        sb.append(this.b);
        sb.append(", port=");
        sb.append(this.c);
        sb.append(", username=");
        sb.append(this.d);
        sb.append(", password=");
        sb.append(this.e);
        sb.append(", expiresAt=");
        sb.append(this.f);
        sb.append(", country=");
        sb.append(this.g);
        sb.append(", selectionCode=");
        sb.append(this.h);
        sb.append(", exitIp=");
        sb.append(this.i);
        sb.append(", exitCountryCode=");
        sb.append(this.j);
        sb.append(", isp=");
        sb.append(this.k);
        sb.append(", organization=");
        sb.append(this.l);
        sb.append(", hosting=");
        sb.append(this.m);
        sb.append(", vendor=");
        return AbstractC1701hf0.h(sb, this.n, ")");
    }

    public /* synthetic */ C1041ar0(EnumC1139br0 enumC1139br0, String str, int i, String str2, String str3, long j, String str4, String str5, String str6, String str7, String str8, String str9, Boolean bool, String str10, int i2) {
        this(enumC1139br0, str, i, str2, str3, j, str4, str5, (i2 & 256) != 0 ? "" : str6, (i2 & 512) != 0 ? "" : str7, (i2 & 1024) != 0 ? "" : str8, (i2 & C1672hI.a.g) != 0 ? "" : str9, (i2 & C1672hI.a.f) != 0 ? null : bool, (i2 & C1672hI.a.e) != 0 ? "" : str10);
    }
}
