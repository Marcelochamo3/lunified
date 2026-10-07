package o;

import com.skidush.clonex.fragments.player.PlayerTvFragment;

/* JADX INFO: renamed from: o.w10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3103w10 extends Ph0 implements InterfaceC0775Sy {
    public int m;
    public final /* synthetic */ C2628r60 n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ PlayerTvFragment f1086o;
    public final /* synthetic */ C0456Gq p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3103w10(C2628r60 c2628r60, PlayerTvFragment playerTvFragment, C0456Gq c0456Gq, InterfaceC0473Hh interfaceC0473Hh) {
        super(2, interfaceC0473Hh);
        this.n = c2628r60;
        this.f1086o = playerTvFragment;
        this.p = c0456Gq;
    }

    @Override // o.InterfaceC0775Sy
    public final Object i(Object obj, Object obj2) {
        return ((C3103w10) o((InterfaceC1608gi) obj, (InterfaceC0473Hh) obj2)).r(C2985uq0.a);
    }

    @Override // o.R7
    public final InterfaceC0473Hh o(Object obj, InterfaceC0473Hh interfaceC0473Hh) {
        return new C3103w10(this.n, this.f1086o, this.p, interfaceC0473Hh);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022  */
    /* JADX WARN: Code duplicated, block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0027  */
    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x005d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0053 -> B:17:0x0056). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // o.R7
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            o.hi r0 = o.EnumC1706hi.l
            int r1 = r6.m
            r2 = 1
            o.r60 r3 = r6.n
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            o.Jp0.O(r7)
            goto L56
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            o.Jp0.O(r7)
        L1a:
            int r7 = r3.l
            o.uq0 r1 = o.C2985uq0.a
            com.skidush.clonex.fragments.player.PlayerTvFragment r4 = r6.f1086o
            if (r7 <= 0) goto L5d
            o.Kq r7 = r4.z0
            if (r7 != 0) goto L27
            return r1
        L27:
            o.AbstractC1474fG.g(r7)
            java.lang.Object r7 = r7.f370o
            o.LW r7 = (o.LW) r7
            android.widget.TextView r7 = r7.r
            int r1 = r3.l
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r7.setText(r1)
            o.Kq r7 = r4.z0
            o.AbstractC1474fG.g(r7)
            java.lang.Object r7 = r7.f370o
            o.LW r7 = (o.LW) r7
            android.widget.ProgressBar r7 = r7.p
            int r1 = r3.l
            int r1 = r1 * 10
            r7.setProgress(r1)
            r6.m = r2
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r7 = o.AbstractC1376eG.q(r4, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            int r7 = r3.l
            int r7 = r7 + (-1)
            r3.l = r7
            goto L1a
        L5d:
            o.Gq r7 = r6.p
            com.skidush.clonex.fragments.player.PlayerTvFragment.X(r4, r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C3103w10.r(java.lang.Object):java.lang.Object");
    }
}
