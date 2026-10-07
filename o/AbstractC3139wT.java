package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.wT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3139wT implements CL, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;

    public Object readResolve() {
        return DL.e("NOP");
    }
}
