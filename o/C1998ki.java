package o;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: o.ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1998ki extends Ph0 implements InterfaceC0775Sy {
    public F9 m;
    public int n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ F80 f872o;
    public final /* synthetic */ C2720s4 p;
    public final /* synthetic */ InterfaceC0416Fc q;
    public final /* synthetic */ Callable r;
    public final /* synthetic */ InterfaceC0416Fc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1998ki(F80 f80, C2720s4 c2720s4, InterfaceC0416Fc interfaceC0416Fc, Callable callable, InterfaceC0416Fc interfaceC0416Fc2, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.f872o = f80;
        this.p = c2720s4;
        this.q = interfaceC0416Fc;
        this.r = callable;
        this.s = interfaceC0416Fc2;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C1998ki) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1998ki(this.f872o, this.p, this.q, this.r, this.s, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x004b A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x0035, B:22:0x0043, B:24:0x004b, B:14:0x0023, B:17:0x002f), top: B:31:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005e -> B:8:0x0015). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.R7
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            o.hi r0 = o.EnumC1706hi.l
            int r1 = r8.n
            r2 = 2
            r3 = 1
            o.s4 r4 = r8.p
            o.F80 r5 = r8.f872o
            if (r1 == 0) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            o.F9 r1 = r8.m
            o.Jp0.O(r9)     // Catch: java.lang.Throwable -> L17
        L15:
            r9 = r1
            goto L35
        L17:
            r9 = move-exception
            goto L69
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            o.F9 r1 = r8.m
            o.Jp0.O(r9)     // Catch: java.lang.Throwable -> L17
            goto L43
        L27:
            o.Jp0.O(r9)
            o.oG r9 = r5.e
            r9.a(r4)
            o.Fc r9 = r8.q     // Catch: java.lang.Throwable -> L17
            o.F9 r9 = r9.iterator()     // Catch: java.lang.Throwable -> L17
        L35:
            r8.m = r9     // Catch: java.lang.Throwable -> L17
            r8.n = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r9.a(r8)     // Catch: java.lang.Throwable -> L17
            if (r1 != r0) goto L40
            return r0
        L40:
            r7 = r1
            r1 = r9
            r9 = r7
        L43:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L17
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r9 == 0) goto L61
            r1.c()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.Callable r9 = r8.r     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L17
            o.Fc r6 = r8.s     // Catch: java.lang.Throwable -> L17
            r8.m = r1     // Catch: java.lang.Throwable -> L17
            r8.n = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r6.e(r9, r8)     // Catch: java.lang.Throwable -> L17
            if (r9 != r0) goto L15
            return r0
        L61:
            o.oG r9 = r5.e
            r9.c(r4)
            o.uq0 r9 = o.C2985uq0.a
            return r9
        L69:
            o.oG r0 = r5.e
            r0.c(r4)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1998ki.r(java.lang.Object):java.lang.Object");
    }
}
