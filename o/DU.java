package o;

import android.os.Bundle;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class DU {
    public FT a;
    public boolean b;

    public abstract TT a();

    public final FT b() {
        FT ft = this.a;
        if (ft != null) {
            return ft;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public void d(List list, C1098bU c1098bU) {
        C1634gv c1634gv = new C1634gv(new C1732hv(Vb0.M(AbstractC0911Ye.U(list), new io.sentry.android.replay.capture.e(this, 7, c1098bU)), false, X10.w));
        while (c1634gv.hasNext()) {
            b().g((DT) c1634gv.next());
        }
    }

    public void e(FT ft) {
        this.a = ft;
        this.b = true;
    }

    public void f(DT dt) {
        TT tt = dt.m;
        if (!(tt instanceof TT)) {
            tt = null;
        }
        if (tt == null) {
            return;
        }
        C1195cU c1195cU = new C1195cU();
        c1195cU.b = true;
        boolean z = c1195cU.b;
        C1000aU c1000aU = c1195cU.a;
        c1000aU.a = z;
        c1000aU.b = c1195cU.c;
        int i = c1195cU.d;
        boolean z2 = c1195cU.e;
        c1000aU.c = i;
        c1000aU.d = null;
        c1000aU.e = false;
        c1000aU.f = z2;
        c(tt, null, c1000aU.a());
        b().c(dt);
    }

    public Bundle h() {
        return null;
    }

    public void i(DT dt, boolean z) {
        AbstractC1474fG.j(dt, "popUpTo");
        List list = (List) b().e.l.getValue();
        if (!list.contains(dt)) {
            throw new IllegalStateException(("popBackStack was called with " + dt + " which does not exist in back stack " + list).toString());
        }
        ListIterator listIterator = list.listIterator(list.size());
        DT dt2 = null;
        while (j()) {
            dt2 = (DT) listIterator.previous();
            if (AbstractC1474fG.b(dt2, dt)) {
                break;
            }
        }
        if (dt2 != null) {
            b().d(dt2, z);
        }
    }

    public boolean j() {
        return true;
    }

    public void g(Bundle bundle) {
    }

    public TT c(TT tt, Bundle bundle, C1098bU c1098bU) {
        return tt;
    }
}
