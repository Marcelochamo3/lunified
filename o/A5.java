package o;

/* JADX INFO: loaded from: classes.dex */
final class A5 {

    @InterfaceC1695hc0("group_id")
    private final C3304y5 a;

    @InterfaceC1695hc0("name")
    private final String b;

    @InterfaceC1695hc0("logo")
    private final String c;

    @InterfaceC1695hc0("key_pair")
    private final C3304y5 d;

    public final C3304y5 a() {
        return this.a;
    }

    public final C3304y5 b() {
        return this.d;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A5)) {
            return false;
        }
        A5 a5 = (A5) obj;
        return AbstractC1474fG.b(this.a, a5.a) && AbstractC1474fG.b(this.b, a5.b) && AbstractC1474fG.b(this.c, a5.c) && AbstractC1474fG.b(this.d, a5.d);
    }

    public final int hashCode() {
        C3304y5 c3304y5 = this.a;
        int iHashCode = (c3304y5 == null ? 0 : c3304y5.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C3304y5 c3304y6 = this.d;
        return iHashCode3 + (c3304y6 != null ? c3304y6.hashCode() : 0);
    }

    public final String toString() {
        return "RemoteChannel(groupId=" + this.a + ", name=" + this.b + ", logo=" + this.c + ", keyPair=" + this.d + ")";
    }
}
