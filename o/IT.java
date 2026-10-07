package o;

import android.view.MenuItem;

/* JADX INFO: loaded from: classes.dex */
public final class IT extends AbstractC3226xJ implements InterfaceC0412Ey {
    public final /* synthetic */ int m;
    public final /* synthetic */ YT n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IT(YT yt, int i) {
        super(1);
        this.m = i;
        this.n = yt;
    }

    @Override // o.InterfaceC0412Ey
    public final Object b(Object obj) {
        switch (this.m) {
            case 0:
                TT tt = (TT) obj;
                AbstractC1474fG.j(tt, "destination");
                return Boolean.valueOf(!this.n.l.containsKey(Integer.valueOf(tt.s)));
            case 1:
                TT tt2 = (TT) obj;
                AbstractC1474fG.j(tt2, "destination");
                return Boolean.valueOf(!this.n.l.containsKey(Integer.valueOf(tt2.s)));
            case 2:
                MenuItem menuItem = (MenuItem) obj;
                AbstractC1474fG.j(menuItem, "item");
                YT yt = this.n;
                AbstractC0397Ej.C(menuItem, yt);
                yt.s(menuItem.getItemId(), false);
                return Boolean.TRUE;
            default:
                MenuItem menuItem2 = (MenuItem) obj;
                AbstractC1474fG.j(menuItem2, "item");
                int itemId = menuItem2.getItemId();
                YT yt2 = this.n;
                yt2.s(itemId, true);
                yt2.n(menuItem2.getItemId(), null, null);
                return Boolean.TRUE;
        }
    }
}
