package o;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class U7 extends AbstractC1880jW {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rt0 b;
    public final /* synthetic */ AbstractC0976a8 c;

    public U7(AbstractC0976a8 abstractC0976a8, int i, Rt0 rt0) {
        this.c = abstractC0976a8;
        this.a = i;
        this.b = rt0;
    }

    @Override // o.AbstractC1880jW
    public final void b(AbstractC2144m60 abstractC2144m60, int i) {
        if (i == this.a) {
            ArrayList arrayList = this.c.U0.C;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            this.b.d(abstractC2144m60);
        }
    }
}
