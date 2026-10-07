package o;

import com.skidush.clonex.fragments.player.PlayerMobileFragment;

/* JADX INFO: renamed from: o.c00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1156c00 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerMobileFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1156c00(PlayerMobileFragment playerMobileFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerMobileFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        ((C1156c00) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
        return EnumC1706hi.l;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C1156c00(this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0029  */
    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    /* JADX WARN: Code duplicated, block: B:21:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0062  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:30:0x0062
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.R7
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            o.hi r0 = o.EnumC1706hi.l
            int r1 = r11.m
            r2 = 1
            com.skidush.clonex.fragments.player.PlayerMobileFragment r3 = r11.n
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.Jp0.O(r12)
            goto L25
        Lf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L17:
            o.Jp0.O(r12)
        L1a:
            long r4 = r3.F0
            r11.m = r2
            java.lang.Object r12 = o.AbstractC1376eG.q(r4, r11)
            if (r12 != r0) goto L25
            return r0
        L25:
            o.as r12 = r3.y0
            if (r12 == 0) goto L1a
            boolean r12 = r12.f()
            if (r12 != 0) goto L30
            goto L1a
        L30:
            o.as r12 = r3.y0
            r1 = 0
            java.lang.String r4 = "player"
            if (r12 == 0) goto L62
            long r5 = r12.C()
            o.as r12 = r3.y0
            if (r12 == 0) goto L5e
            long r7 = r12.H()
            r9 = 0
            int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r12 <= 0) goto L1a
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 <= 0) goto L1a
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 == 0) goto L1a
            o.Z10 r12 = r3.k0()
            r12.k(r5, r7)
            goto L1a
        L5e:
            o.AbstractC1474fG.U(r4)
            throw r1
        L62:
            o.AbstractC1474fG.U(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1156c00.r(java.lang.Object):java.lang.Object");
    }
}
