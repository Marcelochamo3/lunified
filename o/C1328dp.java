package o;

import java.util.List;

/* JADX INFO: renamed from: o.dp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1328dp extends Rd0 {
    public final /* synthetic */ int m;
    public final Object n;

    public C1328dp(List list) {
        this.m = 0;
        C2562qX c2562qX = new C2562qX((byte[]) list.get(0));
        this.n = new Tl0(c2562qX.z(), c2562qX.z());
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // o.Rd0
    public final o.InterfaceC2967uh0 f(byte[] r48, int r49, boolean r50) {
        /*
            Method dump skipped, instruction units count: 1240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C1328dp.f(byte[], int, boolean):o.uh0");
    }

    public C1328dp() {
        this.m = 1;
        this.n = new C2562qX();
    }
}
