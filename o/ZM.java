package o;

import com.skidush.clonex.activities.main.MainTvActivity;

/* JADX INFO: loaded from: classes.dex */
public final class ZM extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ MainTvActivity n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZM(MainTvActivity mainTvActivity, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = mainTvActivity;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((ZM) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new ZM(this.n, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0048 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0051 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x004f -> B:24:0x0052). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0051
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.R7
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            o.hi r0 = o.EnumC1706hi.l
            int r1 = r9.m
            o.uq0 r2 = o.C2985uq0.a
            com.skidush.clonex.activities.main.MainTvActivity r3 = r9.n
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L27
            if (r1 == r6) goto L23
            if (r1 == r5) goto L1f
            if (r1 != r4) goto L17
            o.Jp0.O(r10)
            goto L52
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            o.Jp0.O(r10)
            goto L49
        L23:
            o.Jp0.O(r10)
            goto L34
        L27:
            o.Jp0.O(r10)
            r9.m = r6
            r10 = 0
            java.lang.Object r10 = com.skidush.clonex.activities.main.MainTvActivity.x(r3, r10, r9)
            if (r10 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L3d
            return r2
        L3d:
            r9.m = r5
            r7 = 600000(0x927c0, double:2.964394E-318)
            java.lang.Object r10 = o.AbstractC1376eG.q(r7, r9)
            if (r10 != r0) goto L49
            return r0
        L49:
            r9.m = r4
            java.lang.Object r10 = com.skidush.clonex.activities.main.MainTvActivity.x(r3, r6, r9)
            if (r10 != r0) goto L52
            return r0
        L52:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L3d
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.ZM.r(java.lang.Object):java.lang.Object");
    }
}
