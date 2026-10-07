package o;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class NS implements Gh0, Serializable {
    public final int l;

    public NS(int i) {
        U9.d(i, "expectedValuesPerKey");
        this.l = i;
    }

    @Override // o.Gh0
    public final Object get() {
        return new ArrayList(this.l);
    }
}
