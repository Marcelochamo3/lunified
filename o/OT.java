package o;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class OT extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ Bundle n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OT(int i, Bundle bundle) {
        super(1);
        this.m = i;
        this.n = bundle;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                String str = (String) obj;
                AbstractC1474fG.j(str, "argName");
                return Boolean.valueOf(!this.n.containsKey(str));
            default:
                String str2 = (String) obj;
                AbstractC1474fG.j(str2, "key");
                return Boolean.valueOf(!this.n.containsKey(str2));
        }
    }
}
