package o;

/* JADX INFO: renamed from: o.qf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2575qf extends AbstractC3226xJ implements InterfaceC0775Sy {
    public final /* synthetic */ InterfaceC1022ai[] m;
    public final /* synthetic */ C2628r60 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2575qf(InterfaceC1022ai[] interfaceC1022aiArr, C2628r60 c2628r60) {
        super(2);
        this.m = interfaceC1022aiArr;
        this.n = c2628r60;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        InterfaceC0914Yh interfaceC0914Yh = (InterfaceC0914Yh) obj2;
        AbstractC1474fG.j((C2985uq0) obj, "<anonymous parameter 0>");
        AbstractC1474fG.j(interfaceC0914Yh, "element");
        C2628r60 c2628r60 = this.n;
        int i = c2628r60.l;
        c2628r60.l = i + 1;
        this.m[i] = interfaceC0914Yh;
        return C2985uq0.a;
    }
}
