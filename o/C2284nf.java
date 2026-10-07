package o;

/* JADX INFO: renamed from: o.nf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2284nf extends Ph0 implements InterfaceC0775Sy {
    public InterfaceC0416Fc m;
    public byte[] n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f939o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ InterfaceC1538fw[] s;
    public final /* synthetic */ InterfaceC0360Cy t;
    public final /* synthetic */ InterfaceC0827Uy u;
    public final /* synthetic */ InterfaceC1734hw v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2284nf(InterfaceC0473Hh interfaceC0473Hh, InterfaceC1734hw interfaceC1734hw, InterfaceC0360Cy interfaceC0360Cy, InterfaceC0827Uy interfaceC0827Uy, InterfaceC1538fw[] interfaceC1538fwArr) {
        super(2, interfaceC0473Hh);
        this.s = interfaceC1538fwArr;
        this.t = interfaceC0360Cy;
        this.u = interfaceC0827Uy;
        this.v = interfaceC1734hw;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C2284nf) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        InterfaceC0827Uy interfaceC0827Uy = this.u;
        C2284nf c2284nf = new C2284nf(interfaceC0473Hh, this.v, this.t, interfaceC0827Uy, this.s);
        c2284nf.r = obj;
        return c2284nf;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e3 A[DONT_INVERT, EDGE_INSN: B:40:0x00e3->B:19:0x00a1 BREAK  A[LOOP:0: B:29:0x00c1->B:52:?]] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:45:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x0107  */
    /* JADX WARN: Code duplicated, block: B:48:0x0120 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:? A[LOOP:0: B:29:0x00c1->B:52:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0104 -> B:19:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x011e -> B:49:0x0121). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:48:0x0120
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.R7
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C2284nf.r(java.lang.Object):java.lang.Object");
    }
}
