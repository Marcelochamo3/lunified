package io.sentry.android.replay.capture;

import io.sentry.EnumC0094u1;
import io.sentry.I1;
import io.sentry.K1;
import java.io.File;
import o.AbstractC1474fG;
import o.AbstractC3226xJ;
import o.C2532q60;
import o.InterfaceC0412Ey;

/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ long m;
    public final /* synthetic */ m n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2532q60 f96o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j, m mVar, C2532q60 c2532q60) {
        super(1);
        this.m = j;
        this.n = mVar;
        this.f96o = c2532q60;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        b bVar = (b) obj;
        AbstractC1474fG.j(bVar, "it");
        K1 k1 = bVar.b;
        if (k1.F.getTime() >= this.m) {
            return Boolean.FALSE;
        }
        m mVar = this.n;
        mVar.k.decrementAndGet();
        File file = k1.A;
        I1 i1 = mVar.r;
        if (file != null) {
            try {
                if (!file.delete()) {
                    i1.getLogger().h(EnumC0094u1.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                }
            } catch (Throwable th) {
                i1.getLogger().s(EnumC0094u1.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
            }
        }
        this.f96o.l = true;
        return Boolean.TRUE;
    }
}
