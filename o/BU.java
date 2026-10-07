package o;

import android.view.Menu;
import android.view.MenuItem;
import com.skidush.navigation.widget.NavigationSlideView;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class BU implements GT {
    public final /* synthetic */ int a;
    public final /* synthetic */ WeakReference b;
    public final /* synthetic */ YT c;

    public /* synthetic */ BU(WeakReference weakReference, YT yt, int i) {
        this.a = i;
        this.b = weakReference;
        this.c = yt;
    }

    @Override // o.GT
    public final void a(YT yt, TT tt) {
        int i = 0;
        YT yt2 = this.c;
        WeakReference weakReference = this.b;
        int i2 = this.a;
        AbstractC1474fG.j(yt, "controller");
        AbstractC1474fG.j(tt, "destination");
        switch (i2) {
            case 0:
                AbstractC3043vU abstractC3043vU = (AbstractC3043vU) weakReference.get();
                if (abstractC3043vU == null) {
                    yt2.getClass();
                    yt2.p.remove(this);
                    break;
                } else if (!(tt instanceof InterfaceC1342dw)) {
                    Menu menu = abstractC3043vU.getMenu();
                    AbstractC1474fG.i(menu, "view.menu");
                    int size = menu.size();
                    while (i < size) {
                        MenuItem item = menu.getItem(i);
                        AbstractC1474fG.f(item, "getItem(index)");
                        if (AbstractC0397Ej.x(tt, item.getItemId())) {
                            item.setChecked(true);
                        }
                        i++;
                    }
                    break;
                }
                break;
            default:
                NavigationSlideView navigationSlideView = (NavigationSlideView) weakReference.get();
                if (navigationSlideView != null) {
                    C3237xU menu2 = navigationSlideView.getMenu();
                    int size2 = menu2.f.size();
                    while (i < size2) {
                        MenuItem item2 = menu2.getItem(i);
                        int itemId = item2.getItemId();
                        int i3 = TT.v;
                        Iterator it = Vb0.K(tt, C1182cH.z).iterator();
                        while (it.hasNext()) {
                            if (((TT) it.next()).s == itemId) {
                                item2.setChecked(true);
                            }
                            break;
                        }
                        i++;
                    }
                } else {
                    yt2.getClass();
                    yt2.p.remove(this);
                }
                break;
        }
    }
}
