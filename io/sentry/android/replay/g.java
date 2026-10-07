package io.sentry.android.replay;

import o.AbstractC1474fG;
import o.AbstractC3226xJ;
import o.InterfaceC0412Ey;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ long m;
    public final /* synthetic */ h n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j, h hVar) {
        super(1);
        this.m = j;
        this.n = hVar;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        i iVar = (i) obj;
        AbstractC1474fG.j(iVar, "it");
        if (iVar.b >= this.m) {
            return Boolean.FALSE;
        }
        this.n.a(iVar.a);
        return Boolean.TRUE;
    }
}
