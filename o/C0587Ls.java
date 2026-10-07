package o;

import java.util.Random;

/* JADX INFO: renamed from: o.Ls, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0587Ls extends AbstractC1350e0 {
    public final C0293Aj n = new C0293Aj(1);

    @Override // o.AbstractC1350e0
    public final Random d() {
        Object obj = this.n.get();
        AbstractC1474fG.i(obj, "get(...)");
        return (Random) obj;
    }
}
