package o;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class YE implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object[] l;

    public YE(Object[] objArr) {
        this.l = objArr;
    }

    public Object readResolve() {
        return AbstractC0985aF.m(this.l);
    }
}
