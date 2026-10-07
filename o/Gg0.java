package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Gg0 extends IOException {
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Gg0(int i) {
        super("stream was reset: ".concat(AbstractC1701hf0.D(i)));
        AbstractC1701hf0.q(i, "errorCode");
        this.l = i;
    }
}
