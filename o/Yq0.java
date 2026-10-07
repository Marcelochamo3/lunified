package o;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class Yq0 extends IOException {
    public final int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yq0(int i, String str) {
        super(str);
        AbstractC1474fG.j(str, "message");
        this.l = i;
    }
}
