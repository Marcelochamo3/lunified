package o;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class MS extends AbstractC1459f50 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Comparator f394o;

    public MS(C3333yT c3333yT) {
        this.f394o = c3333yT;
    }

    @Override // o.AbstractC1459f50
    public final Map m() {
        return new TreeMap(this.f394o);
    }
}
