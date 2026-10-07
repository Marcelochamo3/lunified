package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class VE extends Z implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object l;
    public final Object m;

    public VE(Object obj, Object obj2) {
        this.l = obj;
        this.m = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.l;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.m;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
