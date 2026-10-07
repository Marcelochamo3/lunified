package o;

/* JADX INFO: loaded from: classes.dex */
public final class R30 implements InterfaceC3106w3 {
    public final String a;
    public final String b;
    public final Q30 c;
    public EnumC3203x3 d;

    public R30(String str, String str2, String str3, Q30 q30) {
        AbstractC1474fG.j(str, "name");
        AbstractC1474fG.j(str2, "logo");
        AbstractC1474fG.j(str3, "language");
        this.a = str;
        this.b = str2;
        this.c = q30;
    }

    @Override // o.InterfaceC3106w3
    public final EnumC3203x3 c() {
        EnumC3203x3 enumC3203x3 = this.d;
        if (enumC3203x3 != null) {
            return enumC3203x3;
        }
        AbstractC1474fG.U("itemType");
        throw null;
    }
}
