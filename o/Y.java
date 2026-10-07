package o;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y extends AbstractC1058b0 implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient Map f629o;
    public transient int p;

    public final void b() {
        Iterator it = this.f629o.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f629o.clear();
        this.p = 0;
    }
}
