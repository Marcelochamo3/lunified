package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.x10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3200x10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ PlayerTvFragment n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3200x10(PlayerTvFragment playerTvFragment, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = playerTvFragment;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        ((C3200x10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
        return EnumC1706hi.l;
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3200x10(this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:19:0x003e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:12:0x0025). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.R7
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            o.hi r0 = o.EnumC1706hi.l
            int r1 = r10.m
            r2 = 1
            com.skidush.clonex.fragments.player.PlayerTvFragment r3 = r10.n
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.Jp0.O(r11)
            goto L25
        Lf:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L17:
            o.Jp0.O(r11)
        L1a:
            long r4 = r3.K0
            r10.m = r2
            java.lang.Object r11 = o.AbstractC1376eG.q(r4, r10)
            if (r11 != r0) goto L25
            return r0
        L25:
            o.as r11 = r3.D0
            if (r11 != 0) goto L2a
            goto L1a
        L2a:
            boolean r1 = r11.f()
            if (r1 == 0) goto L1a
            long r4 = r11.C()
            long r6 = r11.H()
            r8 = 0
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 <= 0) goto L1a
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 <= 0) goto L1a
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 == 0) goto L1a
            o.Z10 r11 = r3.n0()
            r11.k(r4, r6)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3200x10.r(java.lang.Object):java.lang.Object");
    }
}
