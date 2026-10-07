package o;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: o.Tx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0800Tx {
    public static final C0904Xx a = new C0904Xx();
    public static final AbstractC0956Zx b;

    static {
        AbstractC0956Zx abstractC0956Zx = null;
        try {
            abstractC0956Zx = (AbstractC0956Zx) C1542fy.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = abstractC0956Zx;
    }

    public static final void a(int i, List list) {
        AbstractC1474fG.j(list, "views");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setVisibility(i);
        }
    }
}
