package o;

import java.io.Serializable;

/* JADX INFO: renamed from: o.xJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3226xJ implements InterfaceC1056az, Serializable {
    public final int l;

    public AbstractC3226xJ(int i) {
        this.l = i;
    }

    @Override // o.InterfaceC1056az
    public final int e() {
        return this.l;
    }

    public final String toString() {
        AbstractC2822t60.a.getClass();
        String strA = C3210x60.a(this);
        AbstractC1474fG.i(strA, "renderLambdaToString(...)");
        return strA;
    }
}
