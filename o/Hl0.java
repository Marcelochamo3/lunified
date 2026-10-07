package o;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class Hl0 implements InterfaceC2714s1, XP {
    public final /* synthetic */ Toolbar l;

    public /* synthetic */ Hl0(Toolbar toolbar) {
        this.l = toolbar;
    }

    @Override // o.XP
    public void N(ZP zp) {
        Toolbar toolbar = this.l;
        C2424p1 c2424p1 = toolbar.l.E;
        if (c2424p1 == null || !c2424p1.h()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.R.n).iterator();
            while (it.hasNext()) {
                ((C2514px) it.next()).a.t();
            }
        }
    }

    @Override // o.XP
    public boolean w(ZP zp, MenuItem menuItem) {
        this.l.getClass();
        return false;
    }
}
