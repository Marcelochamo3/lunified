package o;

import java.io.File;

/* JADX INFO: renamed from: o.Vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0849Vu extends AbstractC0771Su {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ C0875Wu e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0849Vu(C0875Wu c0875Wu, File file) {
        super(file);
        AbstractC1474fG.j(file, "rootDir");
        this.e = c0875Wu;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        if (r0.length == 0) goto L22;
     */
    @Override // o.AbstractC0901Xu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.File a() {
        /*
            r5 = this;
            boolean r0 = r5.b
            java.io.File r1 = r5.a
            o.Wu r2 = r5.e
            if (r0 != 0) goto L11
            o.Yu r0 = r2.f608o
            r0.getClass()
            r0 = 1
            r5.b = r0
            return r1
        L11:
            java.io.File[] r0 = r5.c
            r3 = 0
            if (r0 == 0) goto L25
            int r4 = r5.d
            o.AbstractC1474fG.g(r0)
            int r0 = r0.length
            if (r4 >= r0) goto L1f
            goto L25
        L1f:
            o.Yu r0 = r2.f608o
            r0.getClass()
            return r3
        L25:
            java.io.File[] r0 = r5.c
            if (r0 != 0) goto L46
            java.io.File[] r0 = r1.listFiles()
            r5.c = r0
            if (r0 != 0) goto L36
            o.Yu r0 = r2.f608o
            r0.getClass()
        L36:
            java.io.File[] r0 = r5.c
            if (r0 == 0) goto L40
            o.AbstractC1474fG.g(r0)
            int r0 = r0.length
            if (r0 != 0) goto L46
        L40:
            o.Yu r0 = r2.f608o
            r0.getClass()
            return r3
        L46:
            java.io.File[] r0 = r5.c
            o.AbstractC1474fG.g(r0)
            int r1 = r5.d
            int r2 = r1 + 1
            r5.d = r2
            r0 = r0[r1]
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0849Vu.a():java.io.File");
    }
}
