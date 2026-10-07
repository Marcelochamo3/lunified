package o;

/* JADX INFO: renamed from: o.df0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1310df0 extends Ph0 implements InterfaceC0775Sy {
    public VS m;
    public Le0 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f740o;
    public C2532q60 p;
    public int q;
    public int r;
    public int s;
    public int t;
    public final /* synthetic */ Le0 u;
    public final /* synthetic */ String v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1310df0(Le0 le0, String str, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.u = le0;
        this.v = str;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1310df0) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1310df0(this.u, this.v, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0074 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001b, B:31:0x0098, B:35:0x00a1, B:37:0x00aa, B:26:0x0074, B:27:0x0080, B:40:0x00b7, B:41:0x00be, B:38:0x00af, B:39:0x00b6, B:24:0x0067), top: B:45:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x0097  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:7:0x001b, B:31:0x0098, B:35:0x00a1, B:37:0x00aa, B:26:0x0074, B:27:0x0080, B:40:0x00b7, B:41:0x00be, B:38:0x00af, B:39:0x00b6, B:24:0x0067), top: B:45:0x0007 }] */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00bf: CHECK_CAST (r10 I:o.YS) = (o.YS) (r10 I:??[OBJECT, ARRAY]), block:B:42:0x00bf */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0097 -> B:31:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x00a0
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // o.R7
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            o.hi r0 = o.EnumC1706hi.l
            int r1 = r13.t
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L36
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L23
            int r1 = r13.s
            int r5 = r13.r
            int r6 = r13.q
            o.q60 r7 = r13.p
            java.lang.String r8 = r13.f740o
            o.Le0 r9 = r13.n
            o.VS r10 = r13.m
            o.Jp0.O(r14)     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La1
            goto L98
        L20:
            r14 = move-exception
            goto Lbf
        L23:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L2b:
            java.lang.String r1 = r13.f740o
            o.Le0 r5 = r13.n
            o.VS r6 = r13.m
            o.Jp0.O(r14)
        L34:
            r10 = r6
            goto L67
        L36:
            o.Jp0.O(r14)
            j$.util.concurrent.ConcurrentHashMap r14 = o.C1603gf0.f
            o.Le0 r5 = r13.u
            java.lang.String r1 = r5.a
            java.lang.Object r6 = r14.get(r1)
            if (r6 != 0) goto L51
            o.YS r6 = o.AbstractC1923jt0.a()
            java.lang.Object r14 = r14.putIfAbsent(r1, r6)
            if (r14 != 0) goto L50
            goto L51
        L50:
            r6 = r14
        L51:
            o.VS r6 = (o.VS) r6
            r13.m = r6
            r13.n = r5
            java.lang.String r1 = r13.v
            r13.f740o = r1
            r13.t = r3
            r14 = r6
            o.YS r14 = (o.YS) r14
            java.lang.Object r14 = r14.d(r4, r13)
            if (r14 != r0) goto L34
            return r0
        L67:
            o.q60 r14 = new o.q60     // Catch: java.lang.Throwable -> L20
            r14.<init>()     // Catch: java.lang.Throwable -> L20
            r6 = 0
            r7 = r14
            r8 = r1
            r9 = r5
            r1 = 0
            r6 = 2
        L72:
            if (r1 >= r6) goto Lb7
            o.gf0 r14 = o.C1603gf0.b     // Catch: java.lang.Throwable -> L20
            java.lang.String r5 = r9.a     // Catch: java.lang.Throwable -> L20
            java.lang.String r11 = r9.b     // Catch: java.lang.Throwable -> L20
            boolean r12 = r7.l     // Catch: java.lang.Throwable -> L20
            o.Me0 r5 = o.C1603gf0.p(r5, r11, r12)     // Catch: java.lang.Throwable -> L20
            r13.m = r10     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            r13.n = r9     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            r13.f740o = r8     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            r13.p = r7     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            r13.q = r6     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            r13.r = r1     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            r13.s = r1     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            r13.t = r2     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            java.lang.Object r14 = o.C1603gf0.r(r14, r5, r9, r8, r13)     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La0
            if (r14 != r0) goto L97
            return r0
        L97:
            r5 = r1
        L98:
            o.Js0 r14 = (o.Js0) r14     // Catch: java.lang.Throwable -> L20 o.Ne0 -> La1
            o.YS r10 = (o.YS) r10
            r10.e(r4)
            return r14
        La0:
            r5 = r1
        La1:
            j$.util.concurrent.ConcurrentHashMap r14 = o.C1603gf0.e     // Catch: java.lang.Throwable -> L20
            java.lang.String r11 = r9.a     // Catch: java.lang.Throwable -> L20
            r14.remove(r11)     // Catch: java.lang.Throwable -> L20
            if (r1 == r3) goto Laf
            r7.l = r3     // Catch: java.lang.Throwable -> L20
            int r1 = r5 + 1
            goto L72
        Laf:
            java.lang.Exception r14 = new java.lang.Exception     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "La sesión Premium caducó; vuelve a intentarlo"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L20
            throw r14     // Catch: java.lang.Throwable -> L20
        Lb7:
            java.lang.Exception r14 = new java.lang.Exception     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = "No se pudo renovar la sesión Premium"
            r14.<init>(r0)     // Catch: java.lang.Throwable -> L20
            throw r14     // Catch: java.lang.Throwable -> L20
        Lbf:
            o.YS r10 = (o.YS) r10
            r10.e(r4)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1310df0.r(java.lang.Object):java.lang.Object");
    }
}
